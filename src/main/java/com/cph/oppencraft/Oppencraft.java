package com.cph.oppencraft;

import com.cph.oppencraft.block.ModBlocks;
import com.cph.oppencraft.entity.ModEntities;
import com.cph.oppencraft.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oppencraft implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("oppencraft");
	public static final String MOD_NAME = "Oppencraft";

	public static final String MOD_ID = MOD_NAME.toLowerCase();

	CharSequence joiner = ", ";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
		ModItems.init();
		ModBlocks.init();
		ModEntities.init();
	}
}
