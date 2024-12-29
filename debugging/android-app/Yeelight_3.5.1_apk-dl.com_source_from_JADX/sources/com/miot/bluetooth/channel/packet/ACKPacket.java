package com.miot.bluetooth.channel.packet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ACKPacket extends Packet {
    private static final int BUFFER_SIZE = 6;
    public static final int BUSY = 2;
    public static final int CANCEL = 4;
    public static final int READY = 1;
    public static final int SUCCESS = 0;
    public static final int SYNC = 5;
    public static final int TIMEOUT = 3;
    private final byte[] BUFFER;
    private int seq;
    private int status;

    public ACKPacket(int i) {
        this(i, 0);
    }

    public ACKPacket(int i, int i2) {
        this.BUFFER = new byte[6];
        this.status = i;
        this.seq = i2;
    }

    public String getName() {
        return Packet.ACK;
    }

    public int getSeq() {
        return this.seq;
    }

    public int getStatus() {
        return this.status;
    }

    public byte[] toBytes() {
        ByteBuffer order = ByteBuffer.wrap(this.BUFFER).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort(0);
        order.put((byte) 1);
        order.put((byte) this.status);
        order.putShort((short) this.seq);
        return order.array();
    }

    public String toString() {
        return "ACKPacket{status=" + this.status + ", seq=" + this.seq + '}';
    }
}
