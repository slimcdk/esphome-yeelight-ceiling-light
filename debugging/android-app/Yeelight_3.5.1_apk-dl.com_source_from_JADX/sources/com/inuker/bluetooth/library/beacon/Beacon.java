package com.inuker.bluetooth.library.beacon;

import com.inuker.bluetooth.library.utils.ByteUtils;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.p194io.IOUtils;

public class Beacon {
    public byte[] mBytes;
    public List<BeaconItem> mItems = new LinkedList();

    public Beacon(byte[] bArr) {
        if (!ByteUtils.isEmpty(bArr)) {
            byte[] trimLast = ByteUtils.trimLast(bArr);
            this.mBytes = trimLast;
            this.mItems.addAll(BeaconParser.parseBeacon(trimLast));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("preParse: %s\npostParse:\n", new Object[]{ByteUtils.byteToString(this.mBytes)}));
        for (int i = 0; i < this.mItems.size(); i++) {
            sb.append(this.mItems.get(i).toString());
            if (i != this.mItems.size() - 1) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }
}
