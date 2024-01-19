package com.cph.oppencraft.compat;

import com.cph.oppencraft.client.render.OppenhatTrinketRenderer;
import com.cph.oppencraft.init.ModItems;
import com.cph.oppencraft.item.oppenhat.OppenhatTrinket;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketComponent;
import dev.emi.trinkets.api.TrinketsApi;
import dev.emi.trinkets.api.client.TrinketRendererRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Pair;
import org.quiltmc.loader.api.QuiltLoader;

import java.util.Optional;


public class TrinketsCompat {

    public static void onInitializeClient() {
        TrinketRendererRegistry.registerRenderer(ModItems.OPPENHAT, new OppenhatTrinketRenderer());
    }

    public static boolean hasOppenhat(PlayerEntity player) {
        if (QuiltLoader.isModLoaded("trinkets")) {
            Optional<TrinketComponent> component = TrinketsApi.getTrinketComponent(player);
            if (component.isPresent()) {
                for (Pair<SlotReference, ItemStack> pair : component.get().getAllEquipped()) {
                    if (pair.getRight().getItem() instanceof OppenhatTrinket) return true;
                }
            }
        } else {
            return player.getInventory().getArmorStack(3).getItem() == ModItems.OPPENHAT;
        }
        return false;
    }

    private static Item getArmor(PlayerInventory inv, int slot) {
        return inv.getArmorStack(slot).getItem();
    }

    public static boolean hasOnlyOppenhat(PlayerEntity player) {
        PlayerInventory inv = player.getInventory();
        if (hasOppenhat(player)) {
            if (getArmor(inv, 3) != Items.AIR && getArmor(inv, 3) != ModItems.OPPENHAT) return false;
            if (getArmor(inv, 2) != Items.AIR) return false;
            if (getArmor(inv, 1) != Items.AIR) return false;
            return getArmor(inv, 0) == Items.AIR;
        }
        return false;
    }

    public static Item createTrinket(float size, double height) {
        return new OppenhatTrinket(size, height);
    }

}