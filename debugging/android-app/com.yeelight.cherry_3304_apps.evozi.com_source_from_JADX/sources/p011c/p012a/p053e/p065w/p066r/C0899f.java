package p011c.p012a.p053e.p065w.p066r;

/* renamed from: c.a.e.w.r.f */
public final class C0899f {
    /* renamed from: a */
    private static int m1465a(int i, int i2) {
        int i3 = i - i2;
        if (i3 > i2) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i > i2) {
            i5 *= i;
            if (i6 <= i3) {
                i5 /= i6;
                i6++;
            }
            i--;
        }
        while (i6 <= i3) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    /* renamed from: b */
    public static int m1466b(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i2 = i;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i10 = 1;
            while (i10 < iArr2[i5]) {
                int i11 = i3 - i10;
                int i12 = length - i5;
                int i13 = i12 - 2;
                int a = m1465a(i11 - 1, i13);
                if (z && i7 == 0) {
                    int i14 = i12 - 1;
                    if (i11 - i14 >= i14) {
                        a -= m1465a(i11 - i12, i13);
                    }
                }
                if (i12 - 1 > 1) {
                    int i15 = i11 - i13;
                    int i16 = 0;
                    while (i15 > i2) {
                        i16 += m1465a((i11 - i15) - 1, i12 - 3);
                        i15--;
                        int[] iArr3 = iArr;
                    }
                    a -= i16 * (i8 - i5);
                } else if (i11 > i2) {
                    a--;
                }
                i6 += a;
                i10++;
                i7 &= i9 ^ -1;
                iArr2 = iArr;
            }
            i3 -= i10;
            i5++;
            iArr2 = iArr;
        }
    }
}
