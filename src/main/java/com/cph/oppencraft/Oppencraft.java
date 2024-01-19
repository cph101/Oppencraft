package com.cph.oppencraft;

import com.cph.oppencraft.block.ModBlocks;
import com.cph.oppencraft.init.ModEntities;
import com.cph.oppencraft.init.ModParticles;
import com.cph.oppencraft.init.ModSoundEvents;
import com.cph.oppencraft.init.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oppencraft implements ModInitializer {
	public static Logger LOGGER;
	public static String MOD_NAME;

	public static String MOD_ID;

	@Override
	public void onInitialize(ModContainer mod) {
		MOD_NAME = mod.metadata().name();
		MOD_ID = mod.metadata().id();
		LOGGER = LoggerFactory.getLogger(MOD_ID);
		LOGGER.info("Hello world from {}!", MOD_NAME);
		ModItems.init();
		ModBlocks.init();
		ModEntities.init();
		ModSoundEvents.initialize();
		ModParticles.registerFactories();
		ModParticles.init();
	}
}
