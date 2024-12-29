package com.miot.bluetooth.channel.packet;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class Packet {
    public static final String ACK = "ack";
    public static final String CTR = "ctr";
    public static final String DATA = "data";
    static final int SN_CTR = 0;
    public static final int TYPE_ACK = 1;
    public static final int TYPE_CMD = 0;

    static class Bytes {
        int end;
        int start;
        byte[] value;

        Bytes(byte[] bArr, int i) {
            this(bArr, i, bArr.length);
        }

        Bytes(byte[] bArr, int i, int i2) {
            this.value = bArr;
            this.start = i;
            this.end = i2;
        }

        /* access modifiers changed from: package-private */
        public int getSize() {
            return this.end - this.start;
        }
    }

    private static class Header {
        int command;
        int parameter;

        /* renamed from: sn */
        int f6688sn;
        int type;
        byte[] value;

        private Header() {
        }
    }

    private static Packet getDataPacket(Header header) {
        return new DataPacket(header.f6688sn, new Bytes(header.value, 2));
    }

    private static Packet getFlowPacket(Header header) {
        int i = header.parameter;
        int i2 = header.type;
        return i2 != 0 ? i2 != 1 ? new InvalidPacket() : new ACKPacket(header.command, i) : new CTRPacket(i, header.command);
    }

    public static Packet getPacket(byte[] bArr) {
        Header header;
        try {
            header = parse(bArr);
        } catch (BufferUnderflowException e) {
            e.printStackTrace();
            header = null;
        }
        return header != null ? header.f6688sn != 0 ? getDataPacket(header) : getFlowPacket(header) : new InvalidPacket();
    }

    private static Header parse(byte[] bArr) {
        Header header = new Header();
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        short s = order.getShort();
        header.f6688sn = s;
        header.value = bArr;
        if (s == 0) {
            header.type = order.get();
            header.command = order.get();
            try {
                header.parameter = order.getShort();
            } catch (BufferUnderflowException unused) {
            }
        }
        return header;
    }

    public abstract String getName();

    public abstract byte[] toBytes();
}
