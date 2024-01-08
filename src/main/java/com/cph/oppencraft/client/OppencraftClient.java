package com.cph.oppencraft.client;

import com.cph.oppencraft.client.render.OppenhatRenderer;
import com.cph.oppencraft.compat.TrinketsCompat;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
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
    }
}
