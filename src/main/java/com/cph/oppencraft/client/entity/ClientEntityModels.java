package com.cph.oppencraft.client.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public interface ClientEntityModels {
    public static final EntityModelLayer MODEL_NUKE_LAYER = new EntityModelLayer(new Identifier("oppencraft", "nuke"), "main");
    public static void init() {
        EntityModelLayerRegistry.registerModelLayer(MODEL_NUKE_LAYER, NukeEntityModel::getTexturedModelData);
    }
}
