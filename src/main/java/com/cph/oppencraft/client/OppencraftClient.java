package com.cph.oppencraft.client;

import com.cph.oppencraft.client.dynares.ClientResourceProvider;
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
import net.mehvahdjukaar.moonlight.api.set.BlockSetAPI;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.QuiltLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
@SuppressWarnings({"deprecation"}) public class OppencraftClient implements ClientModInitializer {

    public static final EntityModelLayer MODEL_NUKE_LAYER = new EntityModelLayer(new Identifier("oppencraft", "nuke"), "main");

    public static final Logger LOGGER = LoggerFactory.getLogger("oppencraft");

    public static List<String> NUKE_STAND_LIST = new ArrayList<>();

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

        // get wood type list

        BlockSetAPI.getBlockSet(WoodType.class).getValues().forEach(woodType -> {
            NUKE_STAND_LIST.add(woodType.getNamespace() + ":" + woodType.getTypeName());
        });

        ClientResourceProvider generator = new ClientResourceProvider();
        generator.register();
    }
}
