package com.cph.oppencraft.client.particle;

import com.cph.oppencraft.init.ModParticles;
import com.sammy.lodestone.systems.rendering.particle.Easing;
import com.sammy.lodestone.systems.rendering.particle.ParticleBuilders;
import com.sammy.lodestone.systems.rendering.particle.ParticleTextureSheets;
import net.minecraft.client.particle.NoRenderParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;

import java.util.ArrayList;

public class NukeExplosionEmitterParticle extends NoRenderParticle {
    public ArrayList<Vec3d> randomPositions = new ArrayList<>();
    public float power;
    public Vec3f ZERO = new Vec3f(0.0F, 0.0F, 0.0F);

    NukeExplosionEmitterParticle(ClientWorld clientWorld, double x, double y, double z) {
        super(clientWorld, x, y, z, 0.0, 0.0, 0.0);
        this.maxAge = 5;
    }

    public void tick() {
        int pow = (int)this.power;
        if (this.age == 0) {
            for (int i = 0; i < pow; ++i) {
                this.randomPositions
                        .add(
                                new Vec3d(
                                        this.x + this.random.nextGaussian() * (double)pow,
                                        this.y + this.random.nextGaussian() * (double)pow,
                                        this.z + this.random.nextGaussian() * (double)pow
                                )
                        );
            }
        }

        for (Vec3d randomPosition : this.randomPositions) {
            double d = randomPosition.x + this.random.nextGaussian() * 2.0;
            double e = randomPosition.y + this.random.nextGaussian() * 2.0;
            double f = randomPosition.z + this.random.nextGaussian() * 2.0;
            if (this.age == 0) {
                ParticleBuilders.create(ModParticles.NUKE_EXPLOSION_FLARE)
                        .setScale(20.0F * (float)pow)
                        .setMotion(0.0, 0.0, 0.0)
                        .setAlpha(0.0F, 0.5F, 0.0F)
                        .setAlphaEasing(Easing.CIRC_OUT)
                        .enableNoClip()
                        .setLifetime(4 * pow)
                        .spawn(this.world, d, e, f);
            }

            for (int i = 0; i < 10; ++i) {
                float size = this.random.nextFloat() * (float)(4 * pow);
                Vec3f randomMotion = new Vec3f(
                        (float)(this.random.nextGaussian() / 5.0 * (double)pow) / 20.0F,
                        pow <= 10 ? this.random.nextFloat() / 5.0F * (float)pow / 10.0F : 0.0F,
                        (float)(this.random.nextGaussian() / 5.0 * (double)pow) / 20.0F
                );
                float randomSpin = this.random.nextFloat() * Math.signum(randomMotion.getZ()) / (float)(4 * pow);
                ParticleBuilders.create(ModParticles.NUKE_EXPLOSION)
                        .setScale(0.0F, size)
                        .setScaleCoefficient(20.0F)
                        .setScaleEasing(Easing.EXPO_OUT)
                        .setForcedMotion(randomMotion, this.ZERO)
                        .setAlpha(0.1F, 0.0F)
                        .setAlphaEasing(Easing.SINE_OUT)
                        .setSpin(randomSpin, randomSpin / 100.0F)
                        .setSpinEasing(Easing.SINE_IN)
                        .enableNoClip()
                        .setLifetime(40 * pow + i * pow)
                        .spawn(this.world, d, e, f);
                ParticleBuilders.create(ModParticles.NUKE_EXPLOSION)
                        .setScale(0.0F, size * 2.0F)
                        .setScaleCoefficient(20.0F)
                        .setScaleEasing(Easing.EXPO_OUT)
                        .setForcedMotion(randomMotion, this.ZERO)
                        .setAlpha(0.005F, 0.0F)
                        .setAlphaEasing(Easing.SINE_OUT)
                        .setSpin(randomSpin, randomSpin / 100.0F)
                        .setSpinEasing(Easing.SINE_IN)
                        .enableNoClip()
                        .setLifetime(40 * pow + i * pow)
                        .spawn(this.world, d, e, f);
                ParticleBuilders.create(ModParticles.NUKE_EXPLOSION_SMOKE)
                        .setScale(0.0F, size)
                        .setScaleCoefficient(20.0F)
                        .setScaleEasing(Easing.EXPO_OUT)
                        .setForcedMotion(
                                new Vec3f(randomMotion.getX() / 5.0F, randomMotion.getY(), randomMotion.getZ() / 5.0F), new Vec3f(randomMotion.getX() / 10.0F, randomMotion.getY() + 0.1F, randomMotion.getZ() / 10.0F)
                        )
                        .setAlpha(0.1F, 0.0F)
                        .setAlphaEasing(Easing.SINE_OUT)
                        .setSpin(randomSpin, randomSpin / 100.0F)
                        .setSpinEasing(Easing.SINE_IN)
                        .enableNoClip()
                        .setLifetime(600 * pow + i * pow * 3)
                        .overrideRenderType(ParticleTextureSheets.TRANSPARENT)
                        .spawn(this.world, d, e, f);
            }
        }

        ++this.age;
        if (this.age == this.maxAge) {
            this.markDead();
        }
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            NukeExplosionEmitterParticle instance = new NukeExplosionEmitterParticle(world, x, y, z);
            if (parameters instanceof PowerExplosionEmitterParticleType params && params.initialData != null) {
                instance.power = params.initialData.power;
            }

            return instance;
        }
    }
}

