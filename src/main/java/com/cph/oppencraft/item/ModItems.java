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

public class ModItems {

	public static final Item OPPENHAT = Registry.register(Registry.ITEM, new Identifier(Oppencraft.MOD_ID, "oppenhat"), OppenhatRegistrar.initItem(1.05F, -0.125D));
	public static  final Item NUKE_STAND = Registry.register(Registry.ITEM, new Identifier(Oppencraft.MOD_ID, "nuke_stand"), new BlockItem(ModBlocks.NUKE_STAND, new QuiltItemSettings().maxCount(1)));

	@SuppressWarnings({"unused"}) public static final ItemGroup CHEMISTRY_GROUP = QuiltItemGroup.builder(
			new Identifier(Oppencraft.MOD_ID, "oppengroup"))
		.icon(() -> new ItemStack(OPPENHAT))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(OPPENHAT));
			stacks.add(new ItemStack(NUKE_STAND));
		})
		.build();

	public static void init() {
	}
}
