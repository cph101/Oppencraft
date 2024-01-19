package com.cph.oppencraft.client.particle;

import com.sammy.lodestone.systems.rendering.particle.SimpleParticleEffect;
import com.sammy.lodestone.systems.rendering.particle.world.FrameSetParticle;
import com.sammy.lodestone.systems.rendering.particle.world.WorldParticleEffect;
import net.fabricmc.fabric.impl.client.particle.FabricSpriteProviderImpl;
import net.minecraft.client.world.ClientWorld;

public class PowerExplosionParticle extends FrameSetParticle {
    public PowerExplosionParticle(ClientWorld world, WorldParticleEffect data, FabricSpriteProviderImpl spriteSet, double x, double y, double z, double xd, double yd, double zd) {
        super(world, data, spriteSet, x, y, z, xd, yd, zd);
    }

    public void tick() {
        super.tick();
    }

    public SimpleParticleEffect.Animator getAnimator() {
        return SimpleParticleEffect.Animator.FIRST_INDEX;
    }
}
