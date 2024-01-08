package com.cph.oppencraft.item.oppenhat;

import com.cph.oppencraft.compat.TrinketsCompat;
import com.cph.oppencraft.item.oppenhat.OppenhatItem;
import net.minecraft.item.Item;
import org.quiltmc.loader.api.QuiltLoader;

public class OppenhatRegistrar {
    public static Item initItem(float size, double height) {
        Item item;

        if(QuiltLoader.isModLoaded("trinkets")) {
            item = TrinketsCompat.createTrinket(size, height);
        }
        else item = new OppenhatItem(size, height);

        return item;
    }

    // renderer is necessary, remember to implement.
}
