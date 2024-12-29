package com.miot.service.connection.bluetooth;

import com.xiaomi.mipush.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PacketReader {
    private byte[] bytes;
    private ByteBuffer mByteBuffer;

    public PacketReader(BleAdvertiseItem bleAdvertiseItem) {
        byte[] bArr = bleAdvertiseItem.bytes;
        this.bytes = bArr;
        this.mByteBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean getBit(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    public int getByte() {
        return this.mByteBuffer.get() & 255;
    }

    public int getInt(int i, int i2, int i3) {
        return (i >> i2) & ((1 << ((i3 - i2) + 1)) - 1);
    }

    public int getLastShort() {
        position(this.bytes.length - 2);
        return getShort();
    }

    public String getMac() {
        String[] strArr = new String[6];
        for (int i = 5; i >= 0; i--) {
            strArr[i] = String.format("%02x", new Object[]{Integer.valueOf(getByte())}).toUpperCase();
        }
        return XMStringUtils.join((Object[]) strArr, Constants.COLON_SEPARATOR);
    }

    public int getShort() {
        return this.mByteBuffer.getShort() & 65535;
    }

    public String getShortString() {
        String[] strArr = new String[2];
        for (int i = 1; i >= 0; i--) {
            strArr[i] = String.format("%02x", new Object[]{Integer.valueOf(getByte())}).toUpperCase();
        }
        return XMStringUtils.join((Object[]) strArr, "");
    }

    public void position(int i) {
        this.mByteBuffer.position(i);
    }
}
