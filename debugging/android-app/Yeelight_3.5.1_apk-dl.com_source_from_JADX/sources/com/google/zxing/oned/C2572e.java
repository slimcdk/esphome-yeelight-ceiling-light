package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.e */
public final class C2572e extends C2583p {

    /* renamed from: i */
    static final int[] f4372i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    private final int[] f4373h = new int[4];

    /* renamed from: q */
    private static void m7029q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f4372i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo19557k(C2548a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f4373h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int j = aVar.mo19481j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < j; i3++) {
            int i4 = C2583p.m7070i(aVar, iArr2, i, C2583p.f4396g);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m7029q(sb, i2);
        int i6 = C2583p.m7071m(aVar, i, true, C2583p.f4394e)[1];
        for (int i7 = 0; i7 < 6 && i6 < j; i7++) {
            sb.append((char) (C2583p.m7070i(aVar, iArr2, i6, C2583p.f4395f) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public BarcodeFormat mo19558p() {
        return BarcodeFormat.EAN_13;
    }
}
