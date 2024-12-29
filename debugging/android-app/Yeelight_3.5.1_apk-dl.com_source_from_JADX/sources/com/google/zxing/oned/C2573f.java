package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.f */
public final class C2573f extends C2583p {

    /* renamed from: h */
    private final int[] f4374h = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo19557k(C2548a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f4374h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo19481j();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < j; i2++) {
            sb.append((char) (C2583p.m7070i(aVar, iArr2, i, C2583p.f4395f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C2583p.m7071m(aVar, i, true, C2583p.f4394e)[1];
        for (int i5 = 0; i5 < 4 && i4 < j; i5++) {
            sb.append((char) (C2583p.m7070i(aVar, iArr2, i4, C2583p.f4395f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public BarcodeFormat mo19558p() {
        return BarcodeFormat.EAN_8;
    }
}
