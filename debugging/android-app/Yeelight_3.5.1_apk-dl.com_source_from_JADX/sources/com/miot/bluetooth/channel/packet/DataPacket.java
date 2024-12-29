package com.miot.bluetooth.channel.packet;

import com.miot.bluetooth.channel.packet.Packet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class DataPacket extends Packet {
    private static final int BUFFER_SIZE = 20;
    private final byte[] BUFFER;
    private Packet.Bytes bytes;
    private int seq;

    public DataPacket(int i, Packet.Bytes bytes2) {
        this.BUFFER = new byte[20];
        this.seq = i;
        this.bytes = bytes2;
    }

    public DataPacket(int i, byte[] bArr, int i2, int i3) {
        this(i, new Packet.Bytes(bArr, i2, i3));
    }

    public void fillByteBuffer(ByteBuffer byteBuffer) {
        Packet.Bytes bytes2 = this.bytes;
        byteBuffer.put(bytes2.value, bytes2.start, getDataLength());
    }

    public int getDataLength() {
        return this.bytes.getSize();
    }

    public String getName() {
        return Packet.DATA;
    }

    public int getSeq() {
        return this.seq;
    }

    public byte[] toBytes() {
        ByteBuffer byteBuffer;
        int dataLength = getDataLength() + 2;
        if (dataLength == 20) {
            Arrays.fill(this.BUFFER, (byte) 0);
            byteBuffer = ByteBuffer.wrap(this.BUFFER);
        } else {
            byteBuffer = ByteBuffer.allocate(dataLength);
        }
        ByteBuffer order = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) this.seq);
        fillByteBuffer(order);
        return order.array();
    }

    public String toString() {
        return "DataPacket{seq=" + this.seq + ", size=" + this.bytes.getSize() + '}';
    }
}
