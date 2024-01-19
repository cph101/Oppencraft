package com.cph.oppencraft.item.oppenhat;

import com.cph.oppencraft.networking.NukeExplosionPacket;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.quiltmc.qsl.networking.api.ServerPlayNetworking;

import java.util.Iterator;

public class DebugItem extends Item {
    public DebugItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) world;
            ServerPlayerEntity player;
            PacketByteBuf buf;
            Iterator playerIterator;
            playerIterator = serverWorld.getPlayers().iterator();

            while (playerIterator.hasNext()) {
                player = (ServerPlayerEntity) playerIterator.next();
                buf = new PacketByteBuf(Unpooled.buffer());
                (new NukeExplosionPacket(user.getPos(), 50.0F)).write(buf);
                ServerPlayNetworking.send(player, NukeExplosionPacket.ID, buf);
            }
        }
        return super.use(world, user, hand);
    }
}
