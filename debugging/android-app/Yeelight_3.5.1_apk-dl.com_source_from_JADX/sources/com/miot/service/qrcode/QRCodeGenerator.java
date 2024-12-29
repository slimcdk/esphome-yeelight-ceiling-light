package com.miot.service.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.C2549b;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;
import p082p2.C3598b;
import p082p2.C3599c;
import p082p2.C3603f;

public class QRCodeGenerator {
    private static final int QUIET_ZONE_SIZE = 0;

    private static C2549b renderResult(C3603f fVar, int i, int i2, int i3) {
        C3598b a = fVar.mo25906a();
        if (a != null) {
            int e = a.mo25902e();
            int d = a.mo25901d();
            int i4 = i3 * 2;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C2549b bVar = new C2549b(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e) {
                    if (a.mo25899b(i11, i9) == 1) {
                        bVar.mo19504p(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public C2549b encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }

    public C2549b encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 0;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(encodeHintType)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
                }
                EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType2)) {
                    i3 = Integer.parseInt(map.get(encodeHintType2).toString());
                }
            }
            return renderResult(C3599c.m10212n(str, errorCorrectionLevel, map), i, i2, i3);
        }
    }
}
