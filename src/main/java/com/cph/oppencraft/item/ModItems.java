package com.cph.oppencraft.item;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.block.ModBlocks;
import com.cph.oppencraft.item.oppenhat.OppenhatRegistrar;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.Collection;

public class ModItems {

	public static final Item OPPENHAT = Registry.register(Registry.ITEM, new Identifier(Oppencraft.MOD_ID, "oppenhat"), OppenhatRegistrar.initItem(1.05F, -0.125D));


	@SuppressWarnings({"unused"}) public static final ItemGroup OPPENGROUP = QuiltItemGroup.builder(
			new Identifier(Oppencraft.MOD_ID, "oppengroup"))
		.icon(() -> new ItemStack(OPPENHAT))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(OPPENHAT));
			ModBlocks.NUKE_STANDS.values().forEach(item -> stacks.add(new ItemStack(item)));
		})
		.build();

	public static void init() {
	}
}
