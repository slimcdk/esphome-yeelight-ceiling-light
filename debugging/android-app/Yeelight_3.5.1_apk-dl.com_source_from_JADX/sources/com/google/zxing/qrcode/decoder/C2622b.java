package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.C2627g;

/* renamed from: com.google.zxing.qrcode.decoder.b */
final class C2622b {

    /* renamed from: a */
    private final int f4468a;

    /* renamed from: b */
    private final byte[] f4469b;

    private C2622b(int i, byte[] bArr) {
        this.f4468a = i;
        this.f4469b = bArr;
    }

    /* renamed from: b */
    static C2622b[] m7250b(byte[] bArr, C2627g gVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length == gVar.mo19667h()) {
            C2627g.C2629b f = gVar.mo19666f(errorCorrectionLevel);
            C2627g.C2628a[] a = f.mo19672a();
            int i = 0;
            for (C2627g.C2628a a2 : a) {
                i += a2.mo19670a();
            }
            C2622b[] bVarArr = new C2622b[i];
            int i2 = 0;
            for (C2627g.C2628a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo19670a()) {
                    int b = aVar.mo19671b();
                    bVarArr[i2] = new C2622b(b, new byte[(f.mo19673b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f4469b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f4469b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo19673b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f4469b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f4469b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f4469b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f4469b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo19655a() {
        return this.f4469b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19656c() {
        return this.f4468a;
    }
}
