package com.cph.oppencraft.networking;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public record NukeExplosionPacket(Vec3d position, float power) implements Packet<ClientPlayPacketListener> {
    public static final Identifier ID = new Identifier("oppencraft", "nuke_explosion");

    public void write(PacketByteBuf buf) {
        buf.writeDouble(this.position.x);
        buf.writeDouble(this.position.y);
        buf.writeDouble(this.position.z);
        buf.writeFloat(this.power);
    }

    public void apply(ClientPlayPacketListener listener) {
    }
}
