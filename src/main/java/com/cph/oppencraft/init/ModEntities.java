package com.cph.oppencraft.init;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.entity.NukeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;

public interface ModEntities {
    public static final EntityType<NukeEntity> NUKE_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Oppencraft.MOD_ID, "nuke"),
            QuiltEntityTypeBuilder.create(SpawnGroup.MISC, NukeEntity::new).setDimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    @SuppressWarnings({"deprecation"}) public static void init() {
        FabricDefaultAttributeRegistry.register(NUKE_ENTITY, NukeEntity.createMobAttributes());
    }
}
