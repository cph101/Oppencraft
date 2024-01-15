package com.cph.oppencraft.block;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.block.nuke_stand.NukeStandBlock;
import com.cph.oppencraft.block.nuke_stand.NukeStandDataManager;
import com.cph.oppencraft.block.nuke_stand.NukeStandUtils;
import com.google.gson.JsonObject;
import net.mehvahdjukaar.moonlight.api.misc.EventCalled;
import net.mehvahdjukaar.moonlight.api.misc.Registrator;
import net.mehvahdjukaar.moonlight.api.set.BlockSetAPI;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.*;

public class ModBlocks {

	public static final Map<WoodType, BlockItem> NUKE_STANDS = new HashMap<>();

	public static Map<WoodType, JsonObject> NUKE_STAND_RECIPES = new HashMap<>();;

	public static final NukeStandDataManager NSDataManager = new NukeStandDataManager();

	public static void init() {
		BlockSetAPI.addDynamicBlockRegistration(ModBlocks::registerNukeStandTypes, WoodType.class);
	}

	private static void registerNukeStandTypes(Registrator<Block> blockRegistrator, Collection<WoodType> woodTypes) {
		for (WoodType woodType : woodTypes) {
			if (woodType.planks != null) {
				Identifier nukeStandId = new Identifier(Oppencraft.MOD_ID, woodType.getVariantId("%s_nuke_stand"));
				NukeStandBlock nukeStandBlock = new NukeStandBlock(AbstractBlock.Settings.copy(woodType.planks));
				blockRegistrator.register(nukeStandId, nukeStandBlock);
				BlockItem blockItem = new BlockItem(nukeStandBlock, new QuiltItemSettings());
				NUKE_STANDS.put(woodType, blockItem);
				Registry.register(Registry.ITEM, nukeStandId, blockItem);
				NUKE_STAND_RECIPES.put(woodType, NukeStandUtils.generateNukeStandRecipe(woodType, nukeStandId));
			}
		}
		NSDataManager.register();
	}
}
