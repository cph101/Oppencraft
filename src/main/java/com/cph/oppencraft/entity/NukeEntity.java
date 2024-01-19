package com.cph.oppencraft.entity;

import com.cph.oppencraft.networking.NukeExplosionPacket;
import io.netty.buffer.Unpooled;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.quiltmc.qsl.networking.api.ServerPlayNetworking;

import java.util.Iterator;


public class NukeEntity extends PathAwareEntity {

    public NukeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState landedState, BlockPos landedPosition) {
        if (onGround) {
            this.remove(RemovalReason.DISCARDED);
            if (this.getWorld() instanceof ServerWorld) {
                ServerWorld serverWorld = (ServerWorld) world;
                ServerPlayerEntity player;
                PacketByteBuf buf;
                Iterator playerIterator;
                playerIterator = serverWorld.getPlayers().iterator();

                while (playerIterator.hasNext()) {
                    player = (ServerPlayerEntity) playerIterator.next();
                    buf = new PacketByteBuf(Unpooled.buffer());
                    (new NukeExplosionPacket(this.getPos(), 10.0F)).write(buf);
                    ServerPlayNetworking.send(player, NukeExplosionPacket.ID, buf);
                }
            }
        }
        super.fall(heightDifference, onGround, landedState, landedPosition);
    }
}
