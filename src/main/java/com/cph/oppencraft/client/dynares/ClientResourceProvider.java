package com.cph.oppencraft.client.dynares;

import com.cph.oppencraft.block.nuke_stand.NukeStandUtils;
import com.cph.oppencraft.client.OppencraftClient;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynClientResourcesProvider;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynamicTexturePack;
import net.mehvahdjukaar.moonlight.core.Moonlight;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.pack.ResourcePackProfile;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Logger;

public class ClientResourceProvider extends DynClientResourcesProvider {
    public ClientResourceProvider() {
        super(new DynamicTexturePack(Moonlight.res("oppencraft"), ResourcePackProfile.InsertionPosition.TOP, true, true));
    }

    @Override
    public Logger getLogger() {
        return null;
    }

    @Override
    public boolean dependsOnLoadedPacks() {
        return false;
    }

    @Override
    public void regenerateDynamicAssets(ResourceManager resourceManager) {
        JsonParser parser = new JsonParser();
        OppencraftClient.NUKE_STAND_LIST.forEach(amogus -> {
            String woodName = amogus.split(":")[1];
            String woodNamespace = amogus.split(":")[0];
            JsonObject nukeStandBlockState = parser.parse(NukeStandUtils.generateBlockstates(woodName, woodNamespace)).getAsJsonObject();
            JsonObject nukeStandItemModel = parser.parse(NukeStandUtils.generateNukeStandBlockModel(woodName, woodNamespace)).getAsJsonObject();
            this.dynamicPack.addBlockState(new Identifier(woodNamespace, woodName + "_nuke_stand"), nukeStandBlockState);
            this.dynamicPack.addItemModel(new Identifier(woodNamespace, woodName + "_nuke_stand"), nukeStandItemModel);
        });
    }
}
