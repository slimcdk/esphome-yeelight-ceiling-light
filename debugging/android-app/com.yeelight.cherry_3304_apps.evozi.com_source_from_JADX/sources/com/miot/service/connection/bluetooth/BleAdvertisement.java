package com.miot.service.connection.bluetooth;

import com.inuker.bluetooth.library.utils.ByteUtils;
import com.inuker.bluetooth.library.utils.ListUtils;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p271io.IOUtils;

public class BleAdvertisement {
    private byte[] mBytes;
    private List<BleAdvertiseItem> mItems = new ArrayList();

    public BleAdvertisement(byte[] bArr) {
        if (!ByteUtils.isEmpty(bArr)) {
            this.mBytes = bArr;
            try {
                List<BleAdvertiseItem> parseAdvertisement = parseAdvertisement(bArr);
                if (!ListUtils.isEmpty(parseAdvertisement)) {
                    this.mItems.addAll(parseAdvertisement);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private BleAdvertiseItem parse(byte[] bArr, int i) {
        byte b;
        if (bArr.length - i >= 2 && (b = bArr[i]) > 0) {
            byte b2 = bArr[i + 1];
            int i2 = i + 2;
            if (i2 < bArr.length) {
                BleAdvertiseItem bleAdvertiseItem = new BleAdvertiseItem();
                int i3 = (i2 + b) - 2;
                if (i3 >= bArr.length) {
                    i3 = bArr.length - 1;
                }
                bleAdvertiseItem.type = b2 & 255;
                bleAdvertiseItem.len = b;
                bleAdvertiseItem.bytes = ByteUtils.getBytes(bArr, i2, i3);
                return bleAdvertiseItem;
            }
        }
        return null;
    }

    private List<BleAdvertiseItem> parseAdvertisement(byte[] bArr) {
        BleAdvertiseItem parse;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length && (parse = parse(bArr, i)) != null) {
            arrayList.add(parse);
            i += parse.len + 1;
        }
        return arrayList;
    }

    public List<BleAdvertiseItem> getItems() {
        return this.mItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BleAdvertiseItem bleAdvertiseItem : this.mItems) {
            sb.append(bleAdvertiseItem.toString());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
