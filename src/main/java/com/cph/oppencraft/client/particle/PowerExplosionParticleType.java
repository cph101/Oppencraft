package com.cph.oppencraft.client.particle;

import com.mojang.serialization.Codec;
import com.sammy.lodestone.systems.rendering.particle.world.WorldParticleEffect;
import net.fabricmc.fabric.impl.client.particle.FabricSpriteProviderImpl;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;

public class PowerExplosionParticleType extends ParticleType<WorldParticleEffect> {
    public PowerExplosionParticleType() {
        super(false, WorldParticleEffect.DESERIALIZER);
    }

    public boolean shouldAlwaysSpawn() {
        return true;
    }

    public Codec<WorldParticleEffect> getCodec() {
        return WorldParticleEffect.codecFor(this);
    }

    public static class Factory implements ParticleFactory<WorldParticleEffect> {
        private final SpriteProvider sprite;

        public Factory(SpriteProvider sprite) {
            this.sprite = sprite;
        }

        public Particle createParticle(WorldParticleEffect data, ClientWorld world, double x, double y, double z, double mx, double my, double mz) {
            return new PowerExplosionParticle(world, data, (FabricSpriteProviderImpl)this.sprite, x, y, z, mx, my, mz);
        }
    }
}

