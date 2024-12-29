package p026d2;

import com.google.zxing.C2544a;
import com.google.zxing.C2547c;
import com.google.zxing.common.C2549b;
import java.lang.reflect.Array;

/* renamed from: d2.g */
public final class C3134g extends C3132e {

    /* renamed from: e */
    private C2549b f5024e;

    public C3134g(C2547c cVar) {
        super(cVar);
    }

    /* renamed from: i */
    private static int[][] m8374i(byte[] bArr, int i, int i2, int i3, int i4) {
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

    /* renamed from: j */
    private static void m8375j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C2549b bVar) {
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
                int k = m8376k(i10, 2, i5 - 3);
                int k2 = m8376k(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[k2 + i14];
                    i13 += iArr2[k - 2] + iArr2[k - 1] + iArr2[k] + iArr2[k + 1] + iArr2[k + 2];
                }
                m8377l(bArr, i12, i8, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: k */
    private static int m8376k(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: l */
    private static void m8377l(byte[] bArr, int i, int i2, int i3, int i4, C2549b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo19503o(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    public C2544a mo19447a(C2547c cVar) {
        return new C3134g(cVar);
    }

    /* renamed from: b */
    public C2549b mo19448b() {
        C2549b bVar;
        C2549b bVar2 = this.f5024e;
        if (bVar2 != null) {
            return bVar2;
        }
        C2547c e = mo19451e();
        int d = e.mo19464d();
        int a = e.mo19461a();
        if (d < 40 || a < 40) {
            bVar = super.mo19448b();
        } else {
            byte[] b = e.mo19462b();
            int i = d >> 3;
            if ((d & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] i5 = m8374i(b, i2, i4, d, a);
            bVar = new C2549b(d, a);
            m8375j(b, i2, i4, d, a, i5, bVar);
        }
        this.f5024e = bVar;
        return this.f5024e;
    }
}
