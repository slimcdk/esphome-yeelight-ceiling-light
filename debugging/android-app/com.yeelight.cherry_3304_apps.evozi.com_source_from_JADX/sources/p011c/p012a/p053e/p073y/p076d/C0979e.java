package p011c.p012a.p053e.p073y.p076d;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import org.apache.commons.p271io.IOUtils;
import p011c.p012a.p053e.C0831r;
import p011c.p012a.p053e.p057t.C0839a;
import p011c.p012a.p053e.p073y.p074b.C0958f;
import p011c.p012a.p053e.p073y.p074b.C0962j;

/* renamed from: c.a.e.y.d.e */
final class C0979e {

    /* renamed from: a */
    private static final int[][] f1167a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f1168b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f1169c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, SmartConfigStep.MSG_UPDATE_CHECKOUT, -1}, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, SmartConfigStep.MSG_RESEND_LAP_BIND_DEVICE, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f1170d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static void m1834a(C0839a aVar, C0958f fVar, C0962j jVar, int i, C0975b bVar) {
        m1836c(bVar);
        m1837d(jVar, bVar);
        m1845l(fVar, i, bVar);
        m1852s(jVar, bVar);
        m1839f(aVar, i, bVar);
    }

    /* renamed from: b */
    static int m1835b(int i, int i2) {
        if (i2 != 0) {
            int n = m1847n(i2);
            int i3 = i << (n - 1);
            while (m1847n(i3) >= n) {
                i3 ^= i2 << (m1847n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m1836c(C0975b bVar) {
        bVar.mo9354a((byte) -1);
    }

    /* renamed from: d */
    static void m1837d(C0962j jVar, C0975b bVar) {
        m1843j(bVar);
        m1838e(bVar);
        m1851r(jVar, bVar);
        m1844k(bVar);
    }

    /* renamed from: e */
    private static void m1838e(C0975b bVar) {
        if (bVar.mo9355b(8, bVar.mo9357d() - 8) != 0) {
            bVar.mo9359f(8, bVar.mo9357d() - 8, 1);
            return;
        }
        throw new C0831r();
    }

    /* renamed from: f */
    static void m1839f(C0839a aVar, int i, C0975b bVar) {
        boolean z;
        int e = bVar.mo9358e() - 1;
        int d = bVar.mo9357d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < bVar.mo9357d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m1848o(bVar.mo9355b(i5, d))) {
                        if (i2 < aVar.mo9047m()) {
                            z = aVar.mo9042f(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C0978d.m1831f(i, i5, d)) {
                            z = !z;
                        }
                        bVar.mo9360g(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != aVar.mo9047m()) {
            throw new C0831r("Not all bits consumed: " + i2 + IOUtils.DIR_SEPARATOR_UNIX + aVar.mo9047m());
        }
    }

    /* renamed from: g */
    private static void m1840g(int i, int i2, C0975b bVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m1848o(bVar.mo9355b(i4, i2))) {
                bVar.mo9359f(i4, i2, 0);
                i3++;
            } else {
                throw new C0831r();
            }
        }
    }

    /* renamed from: h */
    private static void m1841h(int i, int i2, C0975b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo9359f(i + i4, i2 + i3, f1168b[i3][i4]);
            }
        }
    }

    /* renamed from: i */
    private static void m1842i(int i, int i2, C0975b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo9359f(i + i4, i2 + i3, f1167a[i3][i4]);
            }
        }
    }

    /* renamed from: j */
    private static void m1843j(C0975b bVar) {
        int length = f1167a[0].length;
        m1842i(0, 0, bVar);
        m1842i(bVar.mo9358e() - length, 0, bVar);
        m1842i(0, bVar.mo9358e() - length, bVar);
        m1840g(0, 7, bVar);
        m1840g(bVar.mo9358e() - 8, 7, bVar);
        m1840g(0, bVar.mo9358e() - 8, bVar);
        m1846m(7, 0, bVar);
        m1846m((bVar.mo9357d() - 7) - 1, 0, bVar);
        m1846m(7, bVar.mo9357d() - 7, bVar);
    }

    /* renamed from: k */
    private static void m1844k(C0975b bVar) {
        int i = 8;
        while (i < bVar.mo9358e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m1848o(bVar.mo9355b(i, 6))) {
                bVar.mo9359f(i, 6, i3);
            }
            if (m1848o(bVar.mo9355b(6, i))) {
                bVar.mo9359f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    static void m1845l(C0958f fVar, int i, C0975b bVar) {
        C0839a aVar = new C0839a();
        m1849p(fVar, i, aVar);
        for (int i2 = 0; i2 < aVar.mo9047m(); i2++) {
            boolean f = aVar.mo9042f((aVar.mo9047m() - 1) - i2);
            int[][] iArr = f1170d;
            bVar.mo9360g(iArr[i2][0], iArr[i2][1], f);
            if (i2 < 8) {
                bVar.mo9360g((bVar.mo9358e() - i2) - 1, 8, f);
            } else {
                bVar.mo9360g(8, (bVar.mo9357d() - 7) + (i2 - 8), f);
            }
        }
    }

    /* renamed from: m */
    private static void m1846m(int i, int i2, C0975b bVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m1848o(bVar.mo9355b(i, i4))) {
                bVar.mo9359f(i, i4, 0);
                i3++;
            } else {
                throw new C0831r();
            }
        }
    }

    /* renamed from: n */
    static int m1847n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    private static boolean m1848o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    static void m1849p(C0958f fVar, int i, C0839a aVar) {
        if (C0980f.m1853b(i)) {
            int b = (fVar.mo9311b() << 3) | i;
            aVar.mo9037c(b, 5);
            aVar.mo9037c(m1835b(b, 1335), 10);
            C0839a aVar2 = new C0839a();
            aVar2.mo9037c(21522, 15);
            aVar.mo9055v(aVar2);
            if (aVar.mo9047m() != 15) {
                throw new C0831r("should not happen but we got: " + aVar.mo9047m());
            }
            return;
        }
        throw new C0831r("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m1850q(C0962j jVar, C0839a aVar) {
        aVar.mo9037c(jVar.mo9324j(), 6);
        aVar.mo9037c(m1835b(jVar.mo9324j(), 7973), 12);
        if (aVar.mo9047m() != 18) {
            throw new C0831r("should not happen but we got: " + aVar.mo9047m());
        }
    }

    /* renamed from: r */
    private static void m1851r(C0962j jVar, C0975b bVar) {
        if (jVar.mo9324j() >= 2) {
            int j = jVar.mo9324j() - 1;
            int[][] iArr = f1169c;
            int[] iArr2 = iArr[j];
            int length = iArr[j].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !m1848o(bVar.mo9355b(i4, i3)))) {
                        m1841h(i4 - 2, i3 - 2, bVar);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m1852s(C0962j jVar, C0975b bVar) {
        if (jVar.mo9324j() >= 7) {
            C0839a aVar = new C0839a();
            m1850q(jVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean f = aVar.mo9042f(i);
                    i--;
                    bVar.mo9360g(i2, (bVar.mo9357d() - 11) + i3, f);
                    bVar.mo9360g((bVar.mo9357d() - 11) + i3, i2, f);
                }
            }
        }
    }
}
