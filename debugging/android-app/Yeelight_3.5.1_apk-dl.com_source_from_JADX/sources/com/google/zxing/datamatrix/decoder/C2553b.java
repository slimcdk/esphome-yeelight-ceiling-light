package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.C2555d;

/* renamed from: com.google.zxing.datamatrix.decoder.b */
final class C2553b {

    /* renamed from: a */
    private final int f4322a;

    /* renamed from: b */
    private final byte[] f4323b;

    private C2553b(int i, byte[] bArr) {
        this.f4322a = i;
        this.f4323b = bArr;
    }

    /* renamed from: b */
    static C2553b[] m6958b(byte[] bArr, C2555d dVar) {
        C2555d.C2558c d = dVar.mo19517d();
        C2555d.C2557b[] a = d.mo19525a();
        int i = 0;
        for (C2555d.C2557b a2 : a) {
            i += a2.mo19523a();
        }
        C2553b[] bVarArr = new C2553b[i];
        int i2 = 0;
        for (C2555d.C2557b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo19523a()) {
                int b = bVar.mo19524b();
                bVarArr[i2] = new C2553b(b, new byte[(d.mo19526b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f4323b.length - d.mo19526b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f4323b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = dVar.mo19521i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f4323b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f4323b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f4323b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo19512a() {
        return this.f4323b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19513c() {
        return this.f4322a;
    }
}
