package com.cph.oppencraft;

import com.cph.oppencraft.block.ModBlocks;
import com.cph.oppencraft.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oppencraft implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("oppencraft");
	public static final String MOD_ID = "oppencraft";
	public static final String MOD_NAME = "Oppencraft";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
		ModItems.init();
		ModBlocks.init();
	}
}
