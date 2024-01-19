package com.cph.oppencraft;

import com.cph.oppencraft.client.dynares.ClientResourceProvider;
import com.cph.oppencraft.client.entity.ClientEntityModels;
import com.cph.oppencraft.client.entity.NukeEntityRenderer;
import com.cph.oppencraft.client.particle.NukeExplosion;
import com.cph.oppencraft.client.render.OppenhatRenderer;
import com.cph.oppencraft.compat.TrinketsCompat;
import com.cph.oppencraft.init.ModEntities;
import com.cph.oppencraft.networking.NukeExplosionPacket;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.mehvahdjukaar.moonlight.api.set.BlockSetAPI;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.util.math.Vec3d;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.networking.api.client.ClientPlayNetworking;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Environment(EnvType.CLIENT)
@SuppressWarnings({"deprecation"}) public class OppencraftClient implements ClientModInitializer {

    public static Logger LOGGER;

    public static List<WoodType> NUKE_STAND_LIST = new ArrayList<>();

    @Override
    public void onInitializeClient(ModContainer clientmod) {
        LOGGER = LoggerFactory.getLogger(clientmod.metadata().id());

        // Custom renderers
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

        // Entities
        EntityRendererRegistry.register(ModEntities.NUKE_ENTITY, NukeEntityRenderer::new);
        ClientEntityModels.init(); // Should be called after linking models and renderers

        // Networking
        ClientPlayNetworking.registerGlobalReceiver(NukeExplosionPacket.ID, (client, handler, buf, responseSender) -> {
            Vec3d position = new Vec3d(buf.readDouble(), buf.readDouble(), buf.readDouble());
            float power = buf.readFloat();
            client.execute(() -> {
                ClientPlayerEntity player = client.player;
                if (player != null) {
                    NukeExplosion explosion = new NukeExplosion(player.getWorld(), position.getX(), position.getY(), position.getZ(), power);
                    explosion.spawnExplosionEffect();
                }
            });
        });

        // Dynamic resources
        NUKE_STAND_LIST.addAll(BlockSetAPI.getBlockSet(WoodType.class).getValues());
        ClientResourceProvider generator = new ClientResourceProvider();
        generator.register();
    }
}
