package com.google.zxing.pdf417.decoder;

import java.lang.reflect.Array;
import p030e2.C3148a;
import p062l2.C3314a;

/* renamed from: com.google.zxing.pdf417.decoder.h */
final class C2611h {

    /* renamed from: a */
    private static final float[][] f4458a;

    static {
        int i;
        int length = C3314a.f5360b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f4458a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C3314a.f5360b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f4458a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m7215a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m7216b(int[] iArr) {
        int d = C3148a.m8416d(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) d);
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f4458a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C3314a.f5360b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m7217c(int[] iArr) {
        int a = m7215a(iArr);
        if (C3314a.m9006a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m7218d(int[] iArr) {
        int c = m7217c(m7219e(iArr));
        return c != -1 ? c : m7216b(iArr);
    }

    /* renamed from: e */
    private static int[] m7219e(int[] iArr) {
        float d = (float) C3148a.m8416d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
