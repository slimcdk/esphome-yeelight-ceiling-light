package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.C2564h;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2548a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.oned.d */
public final class C2571d extends C2578k {

    /* renamed from: c */
    private static final char[] f4367c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f4368d;

    /* renamed from: e */
    private static final int f4369e;

    /* renamed from: a */
    private final StringBuilder f4370a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f4371b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, TypedValues.CycleType.TYPE_VISIBILITY, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f4368d = iArr;
        f4369e = iArr[47];
    }

    /* renamed from: g */
    private static void m7022g(CharSequence charSequence) {
        int length = charSequence.length();
        m7023h(charSequence, length - 2, 20);
        m7023h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    private static void m7023h(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f4367c[i3 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m7024i(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009b
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0094
            r5 = 100
            if (r4 > r5) goto L_0x0094
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x008f
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x0094
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x0094
        L_0x0047:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x0094
        L_0x007d:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x0094
        L_0x008a:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x008f:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.getFormatInstance()
            throw r9
        L_0x0094:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009b:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.C2571d.m7024i(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: j */
    private int[] m7025j(C2548a aVar) {
        int j = aVar.mo19481j();
        int h = aVar.mo19478h(0);
        Arrays.fill(this.f4371b, 0);
        int[] iArr = this.f4371b;
        int length = iArr.length;
        int i = h;
        boolean z = false;
        int i2 = 0;
        while (h < j) {
            if (aVar.mo19476f(h) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m7027l(iArr) == f4369e) {
                    return new int[]{i, h};
                } else {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            h++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: k */
    private static char m7026k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f4368d;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            } else if (iArr[i2] == i) {
                return f4367c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: l */
    private static int m7027l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public C2563g mo19556b(int i, C2548a aVar, Map<DecodeHintType, ?> map) {
        int[] j = m7025j(aVar);
        int h = aVar.mo19478h(j[1]);
        int j2 = aVar.mo19481j();
        int[] iArr = this.f4371b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f4370a;
        sb.setLength(0);
        while (true) {
            C2578k.m7049e(aVar, h, iArr);
            int l = m7027l(iArr);
            if (l >= 0) {
                char k = m7026k(l);
                sb.append(k);
                int i2 = h;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int h2 = aVar.mo19478h(i2);
                if (k == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (h2 == j2 || !aVar.mo19476f(h2)) {
                        throw NotFoundException.getNotFoundInstance();
                    } else if (sb.length() >= 2) {
                        m7022g(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C2563g(m7024i(sb), (byte[]) null, new C2564h[]{new C2564h(((float) (j[1] + j[0])) / 2.0f, f), new C2564h(((float) h) + (((float) i4) / 2.0f), f)}, BarcodeFormat.CODE_93);
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    h = h2;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
