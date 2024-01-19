package com.cph.oppencraft.client.dynares;

import com.cph.oppencraft.block.nuke_stand.NukeStandUtils;
import com.cph.oppencraft.OppencraftClient;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynClientResourcesProvider;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynamicTexturePack;
import net.mehvahdjukaar.moonlight.core.Moonlight;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.pack.ResourcePackProfile;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientResourceProvider extends DynClientResourcesProvider {
    public ClientResourceProvider() {
        super(new DynamicTexturePack(Moonlight.res("oppencraft"), ResourcePackProfile.InsertionPosition.TOP, true, true));
    }

    @Override
    public Logger getLogger() {
        return LogManager.getLogger();
    }

    @Override
    public boolean dependsOnLoadedPacks() {
        return false;
    }

    @Override @SuppressWarnings("deprecation")
    public void regenerateDynamicAssets(ResourceManager resourceManager) {
        JsonParser parser = new JsonParser();
        OppencraftClient.NUKE_STAND_LIST.forEach(woodType -> {
            if (woodType.planks != null) {
                Identifier nukeStandId = new Identifier("oppencraft", woodType.getVariantId("%s_nuke_stand"));
                JsonObject nukeStandBlockState = parser.parse(NukeStandUtils.generateBlockstates(nukeStandId)).getAsJsonObject();
                JsonObject nukeStandItemModel = parser.parse(NukeStandUtils.generateNukeStandItemModel(woodType)).getAsJsonObject();
                JsonObject nukeStandBlockModel = parser.parse(NukeStandUtils.generateNukeStandItemModel(woodType)).getAsJsonObject();
                this.dynamicPack.addBlockState(nukeStandId, nukeStandBlockState);
                this.dynamicPack.addItemModel(nukeStandId, nukeStandItemModel);
                this.dynamicPack.addBlockModel(nukeStandId, nukeStandBlockModel);
            }
        });
    }
}
