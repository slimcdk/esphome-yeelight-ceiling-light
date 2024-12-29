package com.google.zxing.multi.qrcode;

import com.google.zxing.C2563g;
import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

final class QRCodeMultiReader$SAComparator implements Serializable, Comparator<C2563g> {
    private QRCodeMultiReader$SAComparator() {
    }

    public int compare(C2563g gVar, C2563g gVar2) {
        Map<ResultMetadataType, Object> d = gVar.mo19540d();
        ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
        int intValue = ((Integer) d.get(resultMetadataType)).intValue();
        int intValue2 = ((Integer) gVar2.mo19540d().get(resultMetadataType)).intValue();
        if (intValue < intValue2) {
            return -1;
        }
        return intValue > intValue2 ? 1 : 0;
    }
}
