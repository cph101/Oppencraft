package com.cph.oppencraft.item.oppenhat;

import com.cph.oppencraft.item.oppenhat.Oppenhat;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.List;

public class OppenhatTrinket extends TrinketItem implements Oppenhat {

    private final float size;
    private final double height;

    public OppenhatTrinket() {
        super(new QuiltItemSettings());
        this.size = 1.15F;
        this.height = 0.2D;
    }

    public OppenhatTrinket(float size, double height) {
        super(new QuiltItemSettings().maxCount(1));
        this.size = size;
        this.height = height;
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        super.onEquip(stack, slot, entity);
        entity.playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0F, 1.0F);
    }

    @Override
    public float getSize() {
        return size;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("§7§oGrants immunity to all explosions caused by"));
        tooltip.add(Text.literal("§7§othe wearer. Radiation and fall damage still apply."));
        tooltip.add(Text.literal("")); // spacer lol
    }
}