package com.miot.bluetooth.channel.packet;

public class InvalidPacket extends Packet {
    public String getName() {
        return "invalid";
    }

    public byte[] toBytes() {
        return new byte[0];
    }

    public String toString() {
        return "InvalidPacket{}";
    }
}
