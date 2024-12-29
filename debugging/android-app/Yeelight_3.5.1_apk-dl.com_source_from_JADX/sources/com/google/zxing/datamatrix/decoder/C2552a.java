package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.C2549b;

/* renamed from: com.google.zxing.datamatrix.decoder.a */
final class C2552a {

    /* renamed from: a */
    private final C2549b f4319a;

    /* renamed from: b */
    private final C2549b f4320b;

    /* renamed from: c */
    private final C2555d f4321c;

    C2552a(C2549b bVar) {
        int g = bVar.mo19497g();
        if (g < 8 || g > 144 || (g & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.f4321c = m6955j(bVar);
        C2549b a = m6948a(bVar);
        this.f4319a = a;
        this.f4320b = new C2549b(a.mo19501j(), a.mo19497g());
    }

    /* renamed from: a */
    private C2549b m6948a(C2549b bVar) {
        int f = this.f4321c.mo19519f();
        int e = this.f4321c.mo19518e();
        if (bVar.mo19497g() == f) {
            int c = this.f4321c.mo19516c();
            int b = this.f4321c.mo19515b();
            int i = f / c;
            int i2 = e / b;
            C2549b bVar2 = new C2549b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo19493d(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo19503o(i6 + i10, i9);
                            }
                        }
                        C2549b bVar3 = bVar;
                    }
                    C2549b bVar4 = bVar;
                }
                C2549b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* renamed from: d */
    private int m6949d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m6953h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m6953h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m6953h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m6953h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m6953h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m6953h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m6953h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m6953h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m6950e(int i, int i2) {
        int i3 = (m6953h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m6953h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m6953h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m6953h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m6953h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m6953h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m6953h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m6953h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m6951f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m6953h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m6953h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m6953h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m6953h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m6953h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m6953h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m6953h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m6953h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m6952g(int i, int i2) {
        int i3 = (m6953h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m6953h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m6953h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m6953h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m6953h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m6953h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m6953h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m6953h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m6953h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f4320b.mo19503o(i2, i);
        return this.f4319a.mo19493d(i2, i);
    }

    /* renamed from: i */
    private int m6954i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m6953h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m6953h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m6953h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m6953h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m6953h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m6953h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m6953h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m6953h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C2555d m6955j(C2549b bVar) {
        return C2555d.m6964h(bVar.mo19497g(), bVar.mo19501j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2555d mo19510b() {
        return this.f4321c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo19511c() {
        byte[] bArr = new byte[this.f4321c.mo19520g()];
        int g = this.f4319a.mo19497g();
        int j = this.f4319a.mo19501j();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == g && i == 0 && !z) {
                bArr[i2] = (byte) m6949d(g, j);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = g - 2;
                if (i3 == i4 && i == 0 && (j & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m6950e(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == g + 4 && i == 2 && (j & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m6951f(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (j & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m6952g(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < g && i >= 0 && !this.f4320b.mo19493d(i, i3)) {
                            bArr[i2] = (byte) m6954i(i3, i, g, j);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < j);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < j && !this.f4320b.mo19493d(i6, i5)) {
                            bArr[i2] = (byte) m6954i(i5, i6, g, j);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= g) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= g && i >= j) {
                break;
            }
        }
        if (i2 == this.f4321c.mo19520g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }
}
