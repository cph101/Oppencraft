package com.cph.oppencraft.block.nuke_stand;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.block.ModBlocks;
import net.mehvahdjukaar.moonlight.api.resources.ResType;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynServerResourcesProvider;
import net.mehvahdjukaar.moonlight.api.resources.pack.DynamicDataPack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.pack.ResourcePackProfile;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NukeStandDataManager extends DynServerResourcesProvider {

    public NukeStandDataManager() {
        super(new DynamicDataPack(new Identifier(Oppencraft.MOD_ID), ResourcePackProfile.InsertionPosition.TOP, true, true));
    }

    @Override
    public Logger getLogger() {
        return LogManager.getLogger();
    }

    @Override
    public boolean dependsOnLoadedPacks() {
        return false;
    }

    private static Integer nukeStandCount = 0;

    @Override
    public void regenerateDynamicAssets(ResourceManager resourceManager) {
        this.getLogger().debug("Generating nuke stand data pack");
        ModBlocks.NUKE_STAND_RECIPES.forEach((woodType, recipeJson) -> {
            Identifier recipePath = new Identifier(Oppencraft.MOD_ID, woodType.getVariantId("recipes/%s_nuke_stand"));
            this.dynamicPack.addJson(recipePath, recipeJson, ResType.RECIPES);
            this.getLogger().info("Generated recipe for {} Nuke Stand, saved at path {}", woodType.getReadableName(), recipePath);
            nukeStandCount++;
        });
        this.getLogger().debug("Generated {} nuke stand recipes", nukeStandCount);
    }
}
