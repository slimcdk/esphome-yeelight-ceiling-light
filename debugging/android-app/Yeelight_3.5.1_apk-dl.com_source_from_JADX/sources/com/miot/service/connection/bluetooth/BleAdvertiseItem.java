package com.miot.service.connection.bluetooth;

public class BleAdvertiseItem {
    public byte[] bytes;
    public int len;
    public int type;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Type: 0x%02x, ", new Object[]{Integer.valueOf(this.type)}));
        sb.append(String.format("Len: %d, ", new Object[]{Integer.valueOf(this.len)}));
        int i = this.type;
        String str = (i == 8 || i == 9) ? "%c" : "%02x ";
        byte[] bArr = this.bytes;
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(String.format(str, new Object[]{Byte.valueOf(bArr[i2])}));
        }
        return sb.toString();
    }
}
