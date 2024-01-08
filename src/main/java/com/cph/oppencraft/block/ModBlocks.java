package com.cph.oppencraft.block;

import com.cph.oppencraft.Oppencraft;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	public static final Block NUKE_STAND = new NukeStandBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));
	public static void init() {
		Registry.register(Registry.BLOCK, new Identifier(Oppencraft.MOD_ID, "nuke_stand"), NUKE_STAND);
	}
}
