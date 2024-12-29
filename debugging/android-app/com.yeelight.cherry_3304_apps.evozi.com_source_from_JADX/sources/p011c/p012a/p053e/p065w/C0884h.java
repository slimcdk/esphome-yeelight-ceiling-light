package p011c.p012a.p053e.p065w;

import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0820g;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p057t.C0839a;

/* renamed from: c.a.e.w.h */
public final class C0884h extends C0887k {

    /* renamed from: b */
    private static final int[] f933b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f934c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[] f935d = {1, 1, 3};

    /* renamed from: e */
    static final int[][] f936e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f937a = -1;

    /* renamed from: g */
    private static int m1389g(int[] iArr) {
        int length = f936e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float d = C0887k.m1400d(iArr, f936e[i2], 0.78f);
            if (d < f) {
                i = i2;
                f = d;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: h */
    private int[] m1390h(C0839a aVar) {
        aVar.mo9050r();
        try {
            int[] k = m1393k(aVar, m1394l(aVar), f935d);
            m1395m(aVar, k[0]);
            int i = k[0];
            k[0] = aVar.mo9047m() - k[1];
            k[1] = aVar.mo9047m() - i;
            return k;
        } finally {
            aVar.mo9050r();
        }
    }

    /* renamed from: i */
    private static void m1391i(C0839a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C0887k.m1401e(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m1389g(iArr2) + 48));
            sb.append((char) (m1389g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: j */
    private int[] m1392j(C0839a aVar) {
        int[] k = m1393k(aVar, m1394l(aVar), f934c);
        this.f937a = (k[1] - k[0]) / 4;
        m1395m(aVar, k[0]);
        return k;
    }

    /* renamed from: k */
    private static int[] m1393k(C0839a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m = aVar.mo9047m();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < m) {
            if (aVar.mo9042f(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C0887k.m1400d(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: l */
    private static int m1394l(C0839a aVar) {
        int m = aVar.mo9047m();
        int k = aVar.mo9045k(0);
        if (k != m) {
            return k;
        }
        throw C0823j.m1126a();
    }

    /* renamed from: m */
    private void m1395m(C0839a aVar, int i) {
        int i2 = this.f937a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo9042f(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C0823j.m1126a();
        }
    }

    /* renamed from: b */
    public C0827n mo9149b(int i, C0839a aVar, Map<C0818e, ?> map) {
        boolean z;
        int[] j = m1392j(aVar);
        int[] h = m1390h(aVar);
        StringBuilder sb = new StringBuilder(20);
        m1391i(aVar, j[1], h[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C0818e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f933b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C0827n(sb2, (byte[]) null, new C0829p[]{new C0829p((float) j[1], f), new C0829p((float) h[0], f)}, C0814a.ITF);
        }
        throw C0820g.m1114a();
    }
}
