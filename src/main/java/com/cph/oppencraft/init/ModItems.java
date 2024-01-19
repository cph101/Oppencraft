package com.cph.oppencraft.init;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.block.ModBlocks;
import com.cph.oppencraft.entity.NukeEntity;
import com.cph.oppencraft.item.oppenhat.DebugItem;
import com.cph.oppencraft.item.oppenhat.OppenhatRegistrar;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.entity.api.QuiltEntityTypeBuilder;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public interface ModItems {

	Item OPPENHAT = Registry.register(Registry.ITEM, new Identifier(Oppencraft.MOD_ID, "oppenhat"), OppenhatRegistrar.initItem(1.05F, -0.125D));
	Item DEBUG_ITEM = Registry.register(Registry.ITEM, new Identifier(Oppencraft.MOD_ID, "debug_item"), new DebugItem(new QuiltItemSettings()));


	@SuppressWarnings({"unused"}) ItemGroup OPPENGROUP = QuiltItemGroup.builder(
			new Identifier(Oppencraft.MOD_ID, "oppengroup"))
		.icon(() -> new ItemStack(OPPENHAT))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(OPPENHAT));
			ModBlocks.NUKE_STANDS.values().forEach(item -> stacks.add(new ItemStack(item)));
		})
		.build();

	static void init() {
	}
}
