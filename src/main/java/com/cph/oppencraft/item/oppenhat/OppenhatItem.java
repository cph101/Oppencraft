package com.cph.oppencraft.item.oppenhat;

import com.cph.oppencraft.item.oppenhat.Oppenhat;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.List;

public class OppenhatItem extends Item implements Oppenhat, Wearable {
    private final float size;
    private final double height;


    public OppenhatItem(float size, double height) {
        super(new QuiltItemSettings().maxCount(1));
        this.size = size;
        this.height = height;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (user.getEquippedStack(EquipmentSlot.HEAD).isEmpty()) {
            if(!world.isClient) {
                user.equipStack(EquipmentSlot.HEAD, new ItemStack(stack.getItem(), 1));
                stack.decrement(1);
            }
            else {
                user.playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0F, 1.0F);
            }
            return TypedActionResult.success(stack);
        }
        return TypedActionResult.fail(stack);
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
    }
}
