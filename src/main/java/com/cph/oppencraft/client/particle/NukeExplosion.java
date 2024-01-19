package com.cph.oppencraft.client.particle;

import com.cph.oppencraft.init.ModParticles;
import com.cph.oppencraft.init.ModSoundEvents;
import com.sammy.lodestone.handlers.ScreenshakeHandler;
import com.sammy.lodestone.setup.LodestoneScreenParticles;
import com.sammy.lodestone.systems.rendering.particle.Easing;
import com.sammy.lodestone.systems.rendering.particle.ParticleBuilders;
import com.sammy.lodestone.systems.rendering.particle.screen.base.ScreenParticle;
import com.sammy.lodestone.systems.screenshake.ScreenshakeInstance;
import net.minecraft.client.MinecraftClient;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.awt.*;
import java.util.Random;

public class NukeExplosion {
    private final Random random = new Random();
    private final World world;
    private final double x;
    private final double y;
    private final double z;
    private final float power;

    public NukeExplosion(World world, double x, double y, double z, float power) {
        this.world = world;
        this.power = power;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void spawnExplosionEffect() {
        this.world
                .playSound(this.x, this.y, this.z, ModSoundEvents.NUKE, SoundCategory.MASTER, 100.0F, (1.0F + (new Random().nextFloat() - new Random().nextFloat()) * 0.2F) * 0.7F, false);
        double h = MinecraftClient.getInstance().player.getPos().distanceTo(new Vec3d(this.x, this.y, this.z));
        float intensity = this.power / 5.0F;
        if (h < 300.0) {
            h /= 300.0;
            h *= (
                    MinecraftClient.getInstance()
                            .cameraEntity
                            .getRotationVecClient()
                            .dotProduct(new Vec3d(this.x, this.y, this.z).subtract(MinecraftClient.getInstance().player.getPos()).normalize())
                            + 1.0
            )
                    / 2.0;
            float gameTime = (float)this.world.getTime() + MinecraftClient.getInstance().getTickDelta();
            Color owFuckMyEyes = new Color(255, 200, 25);
            ParticleBuilders.ScreenParticleBuilder b = ParticleBuilders.create(LodestoneScreenParticles.SMOKE)
                    .setAlpha(0.0F, 0.03F * (float)h * intensity, 0.0F)
                    .setAlphaEasing(Easing.EXPO_OUT, Easing.EXPO_IN_OUT)
                    .setScale(1000.0F)
                    .setScaleEasing(Easing.SINE_IN)
                    .setColorEasing(Easing.SINE_IN)
                    .setLifetime((int)(8.0F * intensity))
                    .setColor(owFuckMyEyes, owFuckMyEyes)
                    .setColorCoefficient(1.25F)
                    .randomOffset(0.05F)
                    .overrideRenderOrder(ScreenParticle.RenderOrder.AFTER_EVERYTHING);

            for (int i = 0; i < 50; ++i) {
                b.setSpinOffset(0.025F * gameTime % 6.28F + this.random.nextFloat());
                b.repeat(
                        this.random.nextDouble() * (double)(MinecraftClient.getInstance().getWindow().getScaledWidth() + 20) - 10.0,
                        this.random.nextDouble() * (double)(MinecraftClient.getInstance().getWindow().getScaledHeight() + 20) - 10.0,
                        1
                );
            }

            ScreenshakeHandler.addScreenshake(new ScreenshakeInstance((int)(20.0F * intensity)).setIntensity(0.0F, 1.0F, 0.0F).setEasing(Easing.ELASTIC_OUT, Easing.ELASTIC_IN));
        }

        PowerExplosionEmitterParticleInitialData data = new PowerExplosionEmitterParticleInitialData(this.power);
        this.world.addParticle(ModParticles.NUKE_EXPLOSION_EMITTER.setData(data), this.x, this.y, this.z, 1.0, 0.0, 0.0);
    }
}

