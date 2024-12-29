package com.inuker.bluetooth.library.beacon;

import com.inuker.bluetooth.library.utils.ByteUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class BeaconParser {
    private byte[] bytes;
    private ByteBuffer mByteBuffer;

    public BeaconParser(BeaconItem beaconItem) {
        this(beaconItem.bytes);
    }

    public BeaconParser(byte[] bArr) {
        this.bytes = bArr;
        this.mByteBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static BeaconItem parse(byte[] bArr, int i) {
        byte b;
        if (bArr.length - i >= 2 && (b = bArr[i]) > 0) {
            byte b2 = bArr[i + 1];
            int i2 = i + 2;
            if (i2 < bArr.length) {
                BeaconItem beaconItem = new BeaconItem();
                int i3 = (i2 + b) - 2;
                if (i3 >= bArr.length) {
                    i3 = bArr.length - 1;
                }
                beaconItem.type = b2 & 255;
                beaconItem.len = b;
                beaconItem.bytes = ByteUtils.getBytes(bArr, i2, i3);
                return beaconItem;
            }
        }
        return null;
    }

    public static List<BeaconItem> parseBeacon(byte[] bArr) {
        BeaconItem parse;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length && (parse = parse(bArr, i)) != null) {
            arrayList.add(parse);
            i += parse.len + 1;
        }
        return arrayList;
    }

    public boolean getBit(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    public int readByte() {
        return this.mByteBuffer.get() & 255;
    }

    public int readShort() {
        return this.mByteBuffer.getShort() & 65535;
    }

    public void setPosition(int i) {
        this.mByteBuffer.position(i);
    }
}
