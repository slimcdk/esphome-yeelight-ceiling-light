package p011c.p012a.p053e.p065w;

import java.util.Arrays;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0817d;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.d */
public final class C0880d extends C0887k {

    /* renamed from: c */
    private static final char[] f923c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f924d;

    /* renamed from: e */
    private static final int f925e;

    /* renamed from: a */
    private final StringBuilder f926a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f927b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f924d = iArr;
        f925e = iArr[47];
    }

    /* renamed from: g */
    private static void m1374g(CharSequence charSequence) {
        int length = charSequence.length();
        m1375h(charSequence, length - 2, 20);
        m1375h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    private static void m1375h(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f923c[i3 % 47]) {
            throw C0817d.m1112a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m1376i(java.lang.CharSequence r9) {
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
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
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
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
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
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x0094
        L_0x008a:
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x008f:
            c.a.e.g r9 = p011c.p012a.p053e.C0820g.m1114a()
            throw r9
        L_0x0094:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009b:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p053e.p065w.C0880d.m1376i(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: j */
    private int[] m1377j(C0839a aVar) {
        int m = aVar.mo9047m();
        int k = aVar.mo9045k(0);
        Arrays.fill(this.f927b, 0);
        int[] iArr = this.f927b;
        int length = iArr.length;
        int i = k;
        boolean z = false;
        int i2 = 0;
        while (k < m) {
            if (aVar.mo9042f(k) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m1379l(iArr) == f925e) {
                    return new int[]{i, k};
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
            k++;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: k */
    private static char m1378k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f924d;
            if (i2 >= iArr.length) {
                throw C0823j.m1126a();
            } else if (iArr[i2] == i) {
                return f923c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: l */
    private static int m1379l(int[] iArr) {
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
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        int[] j = m1377j(aVar);
        int k = aVar.mo9045k(j[1]);
        int m = aVar.mo9047m();
        int[] iArr = this.f927b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f926a;
        sb.setLength(0);
        while (true) {
            C0887k.m1401e(aVar, k, iArr);
            int l = m1379l(iArr);
            if (l >= 0) {
                char k2 = m1378k(l);
                sb.append(k2);
                int i2 = k;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int k3 = aVar.mo9045k(i2);
                if (k2 == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (k3 == m || !aVar.mo9042f(k3)) {
                        throw C0823j.m1126a();
                    } else if (sb.length() >= 2) {
                        m1374g(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C0827n(m1376i(sb), (byte[]) null, new C0829p[]{new C0829p(((float) (j[1] + j[0])) / 2.0f, f), new C0829p(((float) k) + (((float) i4) / 2.0f), f)}, C0814a.CODE_93);
                    } else {
                        throw C0823j.m1126a();
                    }
                } else {
                    k = k3;
                }
            } else {
                throw C0823j.m1126a();
            }
        }
    }
}
