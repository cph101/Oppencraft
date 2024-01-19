package com.cph.oppencraft.init;

import com.cph.oppencraft.client.particle.NukeExplosionEmitterParticle;
import com.cph.oppencraft.client.particle.PowerExplosionEmitterParticleType;
import com.cph.oppencraft.client.particle.PowerExplosionParticleType;
import com.sammy.lodestone.systems.rendering.particle.type.LodestoneParticleType;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.particle.ParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

import java.util.function.BiConsumer;

public interface ModParticles {
    PowerExplosionParticleType NUKE_EXPLOSION = new PowerExplosionParticleType();
    PowerExplosionParticleType NUKE_EXPLOSION_SMOKE = new PowerExplosionParticleType();
    PowerExplosionParticleType NUKE_EXPLOSION_FLARE = new PowerExplosionParticleType();
    PowerExplosionEmitterParticleType NUKE_EXPLOSION_EMITTER = new PowerExplosionEmitterParticleType(true);

    static void init() {
        initParticles(bind(Registry.PARTICLE_TYPE));
    }

    static void registerFactories() {
        ParticleFactoryRegistry.getInstance().register(NUKE_EXPLOSION_EMITTER, NukeExplosionEmitterParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(NUKE_EXPLOSION_FLARE, PowerExplosionParticleType.Factory::new);
        ParticleFactoryRegistry.getInstance().register(NUKE_EXPLOSION_SMOKE, PowerExplosionParticleType.Factory::new);
        ParticleFactoryRegistry.getInstance().register(NUKE_EXPLOSION, PowerExplosionParticleType.Factory::new);
    }

    private static void initParticles(BiConsumer<ParticleType<?>, Identifier> registry) {
        registry.accept(NUKE_EXPLOSION, new Identifier("oppencraft", "nuke_explosion"));
        registry.accept(NUKE_EXPLOSION_EMITTER, new Identifier("oppencraft", "nuke_explosion_emitter"));
        registry.accept(NUKE_EXPLOSION_SMOKE, new Identifier("oppencraft", "nuke_explosion_smoke"));
        registry.accept(NUKE_EXPLOSION_FLARE, new Identifier("oppencraft", "nuke_explosion_flare"));
    }

    private static <T> BiConsumer<T, Identifier> bind(Registry<? super T> registry) {
        return (t, id) -> Registry.register(registry, id, t);
    }
}

