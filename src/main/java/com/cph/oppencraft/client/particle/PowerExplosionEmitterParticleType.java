package com.cph.oppencraft.client.particle;

import com.cph.oppencraft.client.particle.PowerExplosionEmitterParticleInitialData;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;

public class PowerExplosionEmitterParticleType extends DefaultParticleType {
    public PowerExplosionEmitterParticleInitialData initialData;

    public PowerExplosionEmitterParticleType(boolean alwaysShow) {
        super(alwaysShow);
    }

    public ParticleEffect setData(PowerExplosionEmitterParticleInitialData target) {
        this.initialData = target;
        return this;
    }
}
