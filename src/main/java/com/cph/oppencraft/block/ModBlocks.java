package com.cph.oppencraft.block;

import com.cph.oppencraft.block.nuke_stand.NukeStandBlock;
import net.mehvahdjukaar.moonlight.api.misc.Registrator;
import net.mehvahdjukaar.moonlight.api.set.BlockSetAPI;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.*;

public class ModBlocks {

	public static final Map<WoodType, BlockItem> NUKE_STANDS = new HashMap<>();

	public static List<String> NUKE_STAND_LIST = new ArrayList<>();

	public static void init() {
		BlockSetAPI.addDynamicBlockRegistration(ModBlocks::registerNukeStandTypes, WoodType.class);
	}

	private static void registerNukeStandTypes(Registrator<Block> event, Collection<WoodType> woodTypes) {
		for (WoodType woodType : woodTypes) {
			Identifier nukeStandId = new Identifier(woodType.getId() + "_nuke_stand");
			NukeStandBlock nukeStandBlock = new NukeStandBlock(AbstractBlock.Settings.copy(woodType.planks));
			event.register(nukeStandId, nukeStandBlock);

			BlockItem blockItem = new BlockItem(nukeStandBlock, new QuiltItemSettings());
			NUKE_STANDS.put(woodType, blockItem);
			NUKE_STAND_LIST.add(nukeStandId.toString());
			Registry.register(Registry.ITEM, nukeStandId, blockItem);
		}
	}
}
