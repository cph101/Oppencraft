package com.cph.oppencraft.client;

import com.cph.oppencraft.client.entities.NukeEntityModel;
import com.cph.oppencraft.client.render.NukeEntityRenderer;
import com.cph.oppencraft.client.render.OppenhatRenderer;
import com.cph.oppencraft.compat.TrinketsCompat;
import com.cph.oppencraft.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.QuiltLoader;

@Environment(EnvType.CLIENT)
@SuppressWarnings({"deprecation"}) public class OppencraftClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_NUKE_LAYER = new EntityModelLayer(new Identifier("oppencraft", "nuke"), "main");
    @Override
    public void onInitializeClient() {

        if(QuiltLoader.isModLoaded("trinkets")) {
            TrinketsCompat.onInitializeClient();
        }
        else {
            LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, reg, context) -> {
                if(entityRenderer instanceof PlayerEntityRenderer renderer) {
                    reg.register(new OppenhatRenderer<>(renderer));
                }
            });
        }

        EntityRendererRegistry.register(ModEntities.NUKE_ENTITY, NukeEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_NUKE_LAYER, NukeEntityModel::getTexturedModelData);
    }
}
