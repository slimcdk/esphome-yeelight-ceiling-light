package com.google.zxing.oned;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;

/* renamed from: com.google.zxing.oned.a */
public final class C2568a extends C2578k {

    /* renamed from: d */
    static final char[] f4354d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f4355e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f4356f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f4357a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f4358b = new int[80];

    /* renamed from: c */
    private int f4359c = 0;

    /* renamed from: g */
    static boolean m7007g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m7008h(int i) {
        int[] iArr = this.f4358b;
        int i2 = this.f4359c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f4359c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f4358b = iArr2;
        }
    }

    /* renamed from: i */
    private int m7009i() {
        for (int i = 1; i < this.f4359c; i += 2) {
            int k = m7011k(i);
            if (k != -1 && m7007g(f4356f, f4354d[k])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f4358b[i3];
                }
                if (i == 1 || this.f4358b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: j */
    private void m7010j(C2548a aVar) {
        int i = 0;
        this.f4359c = 0;
        int i2 = aVar.mo19480i(0);
        int j = aVar.mo19481j();
        if (i2 < j) {
            boolean z = true;
            while (i2 < j) {
                if (aVar.mo19476f(i2) ^ z) {
                    i++;
                } else {
                    m7008h(i);
                    z = !z;
                    i = 1;
                }
                i2++;
            }
            m7008h(i);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: k */
    private int m7011k(int i) {
        int i2 = i + 7;
        if (i2 >= this.f4359c) {
            return -1;
        }
        int[] iArr = this.f4358b;
        int i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i4 = 0;
        int i5 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7 += 2) {
            int i8 = iArr[i7];
            if (i8 < i5) {
                i5 = i8;
            }
            if (i8 > i6) {
                i6 = i8;
            }
        }
        int i9 = (i5 + i6) / 2;
        int i10 = 0;
        for (int i11 = i + 1; i11 < i2; i11 += 2) {
            int i12 = iArr[i11];
            if (i12 < i3) {
                i3 = i12;
            }
            if (i12 > i10) {
                i10 = i12;
            }
        }
        int i13 = (i3 + i10) / 2;
        int i14 = 128;
        int i15 = 0;
        for (int i16 = 0; i16 < 7; i16++) {
            i14 >>= 1;
            if (iArr[i + i16] > ((i16 & 1) == 0 ? i9 : i13)) {
                i15 |= i14;
            }
        }
        while (true) {
            int[] iArr2 = f4355e;
            if (i4 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i4] == i15) {
                return i4;
            }
            i4++;
        }
    }

    /* renamed from: l */
    private void m7012l(int i) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f4357a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f4355e[this.f4357a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f4358b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            fArr2[i9] = ((((float) iArr[i8]) / ((float) iArr2[i8])) + (((float) iArr[i9]) / ((float) iArr2[i9]))) / 2.0f;
            fArr[i8] = fArr2[i9];
            fArr[i9] = ((((float) iArr[i9]) * 2.0f) + 1.5f) / ((float) iArr2[i9]);
        }
        loop3:
        while (true) {
            int i10 = f4355e[this.f4357a.charAt(i2)];
            int i11 = 6;
            while (i11 >= 0) {
                int i12 = (i11 & 1) + ((i10 & 1) << 1);
                float f = (float) this.f4358b[i + i11];
                if (f >= fArr2[i12] && f <= fArr[i12]) {
                    i10 >>= 1;
                    i11--;
                }
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C2563g mo19556b(int r11, com.google.zxing.common.C2548a r12, java.util.Map<com.google.zxing.DecodeHintType, ?> r13) {
        /*
            r10 = this;
            int[] r0 = r10.f4358b
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r10.m7010j(r12)
            int r12 = r10.m7009i()
            java.lang.StringBuilder r0 = r10.f4357a
            r0.setLength(r1)
            r0 = r12
        L_0x0013:
            int r2 = r10.m7011k(r0)
            r3 = -1
            if (r2 == r3) goto L_0x0101
            java.lang.StringBuilder r4 = r10.f4357a
            char r5 = (char) r2
            r4.append(r5)
            int r0 = r0 + 8
            java.lang.StringBuilder r4 = r10.f4357a
            int r4 = r4.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0037
            char[] r4 = f4356f
            char[] r6 = f4354d
            char r2 = r6[r2]
            boolean r2 = m7007g(r4, r2)
            if (r2 != 0) goto L_0x003b
        L_0x0037:
            int r2 = r10.f4359c
            if (r0 < r2) goto L_0x0013
        L_0x003b:
            int[] r2 = r10.f4358b
            int r4 = r0 + -1
            r2 = r2[r4]
            r6 = -8
            r7 = 0
        L_0x0043:
            if (r6 >= r3) goto L_0x004f
            int[] r8 = r10.f4358b
            int r9 = r0 + r6
            r8 = r8[r9]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004f:
            int r3 = r10.f4359c
            r6 = 2
            if (r0 >= r3) goto L_0x005d
            int r7 = r7 / r6
            if (r2 < r7) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x005d:
            r10.m7012l(r12)
            r0 = 0
        L_0x0061:
            java.lang.StringBuilder r2 = r10.f4357a
            int r2 = r2.length()
            if (r0 >= r2) goto L_0x0079
            java.lang.StringBuilder r2 = r10.f4357a
            char[] r3 = f4354d
            char r7 = r2.charAt(r0)
            char r3 = r3[r7]
            r2.setCharAt(r0, r3)
            int r0 = r0 + 1
            goto L_0x0061
        L_0x0079:
            java.lang.StringBuilder r0 = r10.f4357a
            char r0 = r0.charAt(r1)
            char[] r2 = f4356f
            boolean r0 = m7007g(r2, r0)
            if (r0 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = r10.f4357a
            int r3 = r0.length()
            int r3 = r3 - r5
            char r0 = r0.charAt(r3)
            boolean r0 = m7007g(r2, r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.StringBuilder r0 = r10.f4357a
            int r0 = r0.length()
            r2 = 3
            if (r0 <= r2) goto L_0x00f2
            if (r13 == 0) goto L_0x00ab
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.RETURN_CODABAR_START_END
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x00ba
        L_0x00ab:
            java.lang.StringBuilder r13 = r10.f4357a
            int r0 = r13.length()
            int r0 = r0 - r5
            r13.deleteCharAt(r0)
            java.lang.StringBuilder r13 = r10.f4357a
            r13.deleteCharAt(r1)
        L_0x00ba:
            r13 = 0
            r0 = 0
        L_0x00bc:
            if (r13 >= r12) goto L_0x00c6
            int[] r2 = r10.f4358b
            r2 = r2[r13]
            int r0 = r0 + r2
            int r13 = r13 + 1
            goto L_0x00bc
        L_0x00c6:
            float r13 = (float) r0
        L_0x00c7:
            if (r12 >= r4) goto L_0x00d1
            int[] r2 = r10.f4358b
            r2 = r2[r12]
            int r0 = r0 + r2
            int r12 = r12 + 1
            goto L_0x00c7
        L_0x00d1:
            float r12 = (float) r0
            com.google.zxing.g r0 = new com.google.zxing.g
            java.lang.StringBuilder r2 = r10.f4357a
            java.lang.String r2 = r2.toString()
            r3 = 0
            com.google.zxing.h[] r4 = new com.google.zxing.C2564h[r6]
            com.google.zxing.h r6 = new com.google.zxing.h
            float r11 = (float) r11
            r6.<init>(r13, r11)
            r4[r1] = r6
            com.google.zxing.h r13 = new com.google.zxing.h
            r13.<init>(r12, r11)
            r4[r5] = r13
            com.google.zxing.BarcodeFormat r11 = com.google.zxing.BarcodeFormat.CODABAR
            r0.<init>(r2, r3, r4, r11)
            return r0
        L_0x00f2:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00f7:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x00fc:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r11
        L_0x0101:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.getNotFoundInstance()
            goto L_0x0107
        L_0x0106:
            throw r11
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C2568a.mo19556b(int, com.google.zxing.common.a, java.util.Map):com.google.zxing.g");
    }
}
