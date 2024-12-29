package com.miot.service.qrcode;

import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0819f;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p073y.p074b.C0958f;
import p011c.p012a.p053e.p073y.p076d.C0975b;
import p011c.p012a.p053e.p073y.p076d.C0976c;
import p011c.p012a.p053e.p073y.p076d.C0980f;

public class QRCodeGenerator {
    private static final int QUIET_ZONE_SIZE = 0;

    private static C0840b renderResult(C0980f fVar, int i, int i2, int i3) {
        C0975b a = fVar.mo9362a();
        if (a != null) {
            int e = a.mo9358e();
            int d = a.mo9357d();
            int i4 = i3 * 2;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C0840b bVar = new C0840b(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < e) {
                    if (a.mo9355b(i11, i9) == 1) {
                        bVar.mo9070q(i10, i8, min, min);
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

    public C0840b encode(String str, C0814a aVar, int i, int i2) {
        return encode(str, aVar, i, i2, (Map<C0819f, ?>) null);
    }

    public C0840b encode(String str, C0814a aVar, int i, int i2, Map<C0819f, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C0814a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            C0958f fVar = C0958f.L;
            int i3 = 0;
            if (map != null) {
                if (map.containsKey(C0819f.ERROR_CORRECTION)) {
                    fVar = C0958f.valueOf(map.get(C0819f.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C0819f.MARGIN)) {
                    i3 = Integer.parseInt(map.get(C0819f.MARGIN).toString());
                }
            }
            return renderResult(C0976c.m1817n(str, fVar, map), i, i2, i3);
        }
    }
}
