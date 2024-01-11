package com.cph.oppencraft.client;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.client.render.NukeEntityRenderer;
import com.cph.oppencraft.client.render.OppenhatRenderer;
import com.cph.oppencraft.compat.TrinketsCompat;
import com.cph.oppencraft.entity.ModEntities;
import com.cph.oppencraft.entity.NukeEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.QuiltLoader;

@SuppressWarnings({"deprecation"}) public class OppencraftClient implements ClientModInitializer {


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

        EntityRendererRegistry.register(ModEntities.NUKE_ENTITY, new EntityRendererFactory<NukeEntity>() {
            @Override
            public EntityRenderer<NukeEntity> create(Context context) {
                return new NukeEntityRenderer(context);
            }
        });
    }
}
