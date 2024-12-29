package p011c.p012a.p053e.p057t;

import java.lang.reflect.Array;
import p011c.p012a.p053e.C0821h;

/* renamed from: c.a.e.t.j */
public final class C0848j extends C0846h {

    /* renamed from: e */
    private C0840b f826e;

    public C0848j(C0821h hVar) {
        super(hVar);
    }

    /* renamed from: h */
    private static int[][] m1247h(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 > i12) {
                    i11 = i12;
                }
                int i13 = (i8 * i3) + i11;
                int i14 = 0;
                int i15 = 0;
                byte b = 0;
                byte b2 = 255;
                while (i14 < 8) {
                    for (int i16 = 0; i16 < 8; i16++) {
                        byte b3 = bArr[i13 + i16] & 255;
                        i15 += b3;
                        if (b3 < b2) {
                            b2 = b3;
                        }
                        if (b3 > b) {
                            b = b3;
                        }
                    }
                    if (b - b2 <= 24) {
                        i14++;
                        i13 += i3;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 >= 8) {
                            break;
                        }
                        for (int i17 = 0; i17 < 8; i17++) {
                            i15 += bArr[i13 + i17] & 255;
                        }
                    }
                    i14++;
                    i13 += i3;
                }
                int i18 = i15 >> 6;
                if (b - b2 <= 24) {
                    i18 = b2 / 2;
                    if (i7 > 0 && i10 > 0) {
                        int i19 = i7 - 1;
                        int i20 = i10 - 1;
                        int i21 = ((iArr2[i19][i10] + (iArr2[i7][i20] * 2)) + iArr2[i19][i20]) / 4;
                        if (b2 < i21) {
                            i18 = i21;
                        }
                        iArr2[i7][i10] = i18;
                    }
                }
                iArr2[i7][i10] = i18;
            }
        }
        return iArr2;
    }

    /* renamed from: i */
    private static void m1248i(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C0840b bVar) {
        int i5 = i;
        int i6 = i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 <= i12) {
                    i12 = i11;
                }
                int j = m1249j(i10, 2, i5 - 3);
                int j2 = m1249j(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[j2 + i14];
                    i13 += iArr2[j - 2] + iArr2[j - 1] + iArr2[j] + iArr2[j + 1] + iArr2[j + 2];
                }
                m1250k(bArr, i12, i8, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: j */
    private static int m1249j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: k */
    private static void m1250k(byte[] bArr, int i, int i2, int i3, int i4, C0840b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo9069p(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C0840b mo8983a() {
        C0840b bVar;
        C0840b bVar2 = this.f826e;
        if (bVar2 != null) {
            return bVar2;
        }
        C0821h d = mo8986d();
        int d2 = d.mo8999d();
        int a = d.mo8996a();
        if (d2 < 40 || a < 40) {
            bVar = super.mo8983a();
        } else {
            byte[] b = d.mo8997b();
            int i = d2 >> 3;
            if ((d2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] h = m1247h(b, i2, i4, d2, a);
            bVar = new C0840b(d2, a);
            m1248i(b, i2, i4, d2, a, h, bVar);
        }
        this.f826e = bVar;
        return this.f826e;
    }
}
