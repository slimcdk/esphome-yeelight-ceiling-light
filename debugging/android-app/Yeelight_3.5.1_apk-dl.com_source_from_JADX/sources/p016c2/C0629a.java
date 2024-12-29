package p016c2;

import com.google.zxing.C2564h;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C2549b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import p012b2.C0599a;
import p026d2.C3133f;
import p030e2.C3148a;
import p030e2.C3149b;
import p034f2.C3161a;
import p034f2.C3163c;

/* renamed from: c2.a */
public final class C0629a {

    /* renamed from: g */
    private static final int[] f240g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C2549b f241a;

    /* renamed from: b */
    private boolean f242b;

    /* renamed from: c */
    private int f243c;

    /* renamed from: d */
    private int f244d;

    /* renamed from: e */
    private int f245e;

    /* renamed from: f */
    private int f246f;

    /* renamed from: c2.a$a */
    static final class C0630a {

        /* renamed from: a */
        private final int f247a;

        /* renamed from: b */
        private final int f248b;

        C0630a(int i, int i2) {
            this.f247a = i;
            this.f248b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo11058a() {
            return this.f247a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo11059b() {
            return this.f248b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C2564h mo11060c() {
            return new C2564h((float) mo11058a(), (float) mo11059b());
        }

        public String toString() {
            return "<" + this.f247a + ' ' + this.f248b + '>';
        }
    }

    public C0629a(C2549b bVar) {
        this.f241a = bVar;
    }

    /* renamed from: b */
    private static float m239b(C0630a aVar, C0630a aVar2) {
        return C3148a.m8414b(aVar.mo11058a(), aVar.mo11059b(), aVar2.mo11058a(), aVar2.mo11059b());
    }

    /* renamed from: c */
    private static float m240c(C2564h hVar, C2564h hVar2) {
        return C3148a.m8413a(hVar.mo19546c(), hVar.mo19547d(), hVar2.mo19546c(), hVar2.mo19547d());
    }

    /* renamed from: d */
    private static C2564h[] m241d(C2564h[] hVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float c = hVarArr[0].mo19546c() - hVarArr[2].mo19546c();
        float d = hVarArr[0].mo19547d() - hVarArr[2].mo19547d();
        float c2 = (hVarArr[0].mo19546c() + hVarArr[2].mo19546c()) / 2.0f;
        float d2 = (hVarArr[0].mo19547d() + hVarArr[2].mo19547d()) / 2.0f;
        float f4 = c * f3;
        float f5 = d * f3;
        C2564h hVar = new C2564h(c2 + f4, d2 + f5);
        C2564h hVar2 = new C2564h(c2 - f4, d2 - f5);
        float c3 = hVarArr[1].mo19546c() - hVarArr[3].mo19546c();
        float d3 = hVarArr[1].mo19547d() - hVarArr[3].mo19547d();
        float c4 = (hVarArr[1].mo19546c() + hVarArr[3].mo19546c()) / 2.0f;
        float d4 = (hVarArr[1].mo19547d() + hVarArr[3].mo19547d()) / 2.0f;
        float f6 = c3 * f3;
        float f7 = f3 * d3;
        return new C2564h[]{hVar, new C2564h(c4 + f6, d4 + f7), hVar2, new C2564h(c4 - f6, d4 - f7)};
    }

    /* renamed from: e */
    private void m242e(C2564h[] hVarArr) {
        int i;
        long j;
        long j2;
        if (!m252o(hVarArr[0]) || !m252o(hVarArr[1]) || !m252o(hVarArr[2]) || !m252o(hVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i2 = this.f245e * 2;
        int[] iArr = {m255r(hVarArr[0], hVarArr[1], i2), m255r(hVarArr[1], hVarArr[2], i2), m255r(hVarArr[2], hVarArr[3], i2), m255r(hVarArr[3], hVarArr[0], i2)};
        this.f246f = m250m(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f246f + i3) % 4];
            if (this.f242b) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m245h(j3, this.f242b);
        if (this.f242b) {
            this.f243c = (h >> 6) + 1;
            i = h & 63;
        } else {
            this.f243c = (h >> 11) + 1;
            i = h & 2047;
        }
        this.f244d = i + 1;
    }

    /* renamed from: f */
    private C2564h[] m243f(C0630a aVar) {
        this.f245e = 1;
        C0630a aVar2 = aVar;
        C0630a aVar3 = aVar2;
        C0630a aVar4 = aVar3;
        C0630a aVar5 = aVar4;
        boolean z = true;
        while (this.f245e < 9) {
            C0630a j = m247j(aVar2, z, 1, -1);
            C0630a j2 = m247j(aVar3, z, 1, 1);
            C0630a j3 = m247j(aVar4, z, -1, 1);
            C0630a j4 = m247j(aVar5, z, -1, -1);
            if (this.f245e > 2) {
                double b = (double) ((m239b(j4, j) * ((float) this.f245e)) / (m239b(aVar5, aVar2) * ((float) (this.f245e + 2))));
                if (b < 0.75d || b > 1.25d || !m253p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f245e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f245e;
        if (i == 5 || i == 7) {
            this.f242b = i == 5;
            C2564h[] hVarArr = {new C2564h(((float) aVar2.mo11058a()) + 0.5f, ((float) aVar2.mo11059b()) - 0.5f), new C2564h(((float) aVar3.mo11058a()) + 0.5f, ((float) aVar3.mo11059b()) + 0.5f), new C2564h(((float) aVar4.mo11058a()) - 0.5f, ((float) aVar4.mo11059b()) + 0.5f), new C2564h(((float) aVar5.mo11058a()) - 0.5f, ((float) aVar5.mo11059b()) - 0.5f)};
            int i2 = this.f245e;
            return m241d(hVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    private int m244g(C0630a aVar, C0630a aVar2) {
        float b = m239b(aVar, aVar2);
        float a = ((float) (aVar2.mo11058a() - aVar.mo11058a())) / b;
        float b2 = ((float) (aVar2.mo11059b() - aVar.mo11059b())) / b;
        float a2 = (float) aVar.mo11058a();
        float b3 = (float) aVar.mo11059b();
        boolean d = this.f241a.mo19493d(aVar.mo11058a(), aVar.mo11059b());
        int ceil = (int) Math.ceil((double) b);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b3 += b2;
            if (this.f241a.mo19493d(C3148a.m8415c(a2), C3148a.m8415c(b3)) != d) {
                i++;
            }
        }
        float f = ((float) i) / b;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == d ? 1 : -1;
    }

    /* renamed from: h */
    private static int m245h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C3163c(C3161a.f5072k).mo23691a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: i */
    private int m246i() {
        if (this.f242b) {
            return (this.f243c * 4) + 11;
        }
        int i = this.f243c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C0630a m247j(C0630a aVar, boolean z, int i, int i2) {
        int a = aVar.mo11058a() + i;
        int b = aVar.mo11059b();
        while (true) {
            b += i2;
            if (!m251n(a, b) || this.f241a.mo19493d(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m251n(i32, i42) && this.f241a.mo19493d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m251n(i5, i42) && this.f241a.mo19493d(i5, i42) == z) {
            i42 += i2;
        }
        return new C0630a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C0630a m248k() {
        C2564h hVar;
        C2564h hVar2;
        C2564h hVar3;
        C2564h hVar4;
        C2564h hVar5;
        C2564h hVar6;
        C2564h hVar7;
        C2564h hVar8;
        try {
            C2564h[] c = new C3149b(this.f241a).mo23638c();
            hVar3 = c[0];
            hVar2 = c[1];
            hVar = c[2];
            hVar4 = c[3];
        } catch (NotFoundException unused) {
            int j = this.f241a.mo19501j() / 2;
            int g = this.f241a.mo19497g() / 2;
            int i = j + 7;
            int i2 = g - 7;
            C2564h c2 = m247j(new C0630a(i, i2), false, 1, -1).mo11060c();
            int i3 = g + 7;
            C2564h c3 = m247j(new C0630a(i, i3), false, 1, 1).mo11060c();
            int i4 = j - 7;
            C2564h c4 = m247j(new C0630a(i4, i3), false, -1, 1).mo11060c();
            hVar4 = m247j(new C0630a(i4, i2), false, -1, -1).mo11060c();
            C2564h hVar9 = c3;
            hVar = c4;
            hVar3 = c2;
            hVar2 = hVar9;
        }
        int c5 = C3148a.m8415c((((hVar3.mo19546c() + hVar4.mo19546c()) + hVar2.mo19546c()) + hVar.mo19546c()) / 4.0f);
        int c6 = C3148a.m8415c((((hVar3.mo19547d() + hVar4.mo19547d()) + hVar2.mo19547d()) + hVar.mo19547d()) / 4.0f);
        try {
            C2564h[] c7 = new C3149b(this.f241a, 15, c5, c6).mo23638c();
            hVar6 = c7[0];
            hVar5 = c7[1];
            hVar7 = c7[2];
            hVar8 = c7[3];
        } catch (NotFoundException unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            hVar6 = m247j(new C0630a(i5, i6), false, 1, -1).mo11060c();
            int i7 = c6 + 7;
            hVar5 = m247j(new C0630a(i5, i7), false, 1, 1).mo11060c();
            int i8 = c5 - 7;
            hVar7 = m247j(new C0630a(i8, i7), false, -1, 1).mo11060c();
            hVar8 = m247j(new C0630a(i8, i6), false, -1, -1).mo11060c();
        }
        return new C0630a(C3148a.m8415c((((hVar6.mo19546c() + hVar8.mo19546c()) + hVar5.mo19546c()) + hVar7.mo19546c()) / 4.0f), C3148a.m8415c((((hVar6.mo19547d() + hVar8.mo19547d()) + hVar5.mo19547d()) + hVar7.mo19547d()) / 4.0f));
    }

    /* renamed from: l */
    private C2564h[] m249l(C2564h[] hVarArr) {
        return m241d(hVarArr, (float) (this.f245e * 2), (float) m246i());
    }

    /* renamed from: m */
    private static int m250m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f240g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: n */
    private boolean m251n(int i, int i2) {
        return i >= 0 && i < this.f241a.mo19501j() && i2 > 0 && i2 < this.f241a.mo19497g();
    }

    /* renamed from: o */
    private boolean m252o(C2564h hVar) {
        return m251n(C3148a.m8415c(hVar.mo19546c()), C3148a.m8415c(hVar.mo19547d()));
    }

    /* renamed from: p */
    private boolean m253p(C0630a aVar, C0630a aVar2, C0630a aVar3, C0630a aVar4) {
        C0630a aVar5 = new C0630a(aVar.mo11058a() - 3, aVar.mo11059b() + 3);
        C0630a aVar6 = new C0630a(aVar2.mo11058a() - 3, aVar2.mo11059b() - 3);
        C0630a aVar7 = new C0630a(aVar3.mo11058a() + 3, aVar3.mo11059b() - 3);
        C0630a aVar8 = new C0630a(aVar4.mo11058a() + 3, aVar4.mo11059b() + 3);
        int g = m244g(aVar8, aVar5);
        return g != 0 && m244g(aVar5, aVar6) == g && m244g(aVar6, aVar7) == g && m244g(aVar7, aVar8) == g;
    }

    /* renamed from: q */
    private C2549b m254q(C2549b bVar, C2564h hVar, C2564h hVar2, C2564h hVar3, C2564h hVar4) {
        C3133f b = C3133f.m8371b();
        int i = m246i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f245e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo23617c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, hVar.mo19546c(), hVar.mo19547d(), hVar2.mo19546c(), hVar2.mo19547d(), hVar3.mo19546c(), hVar3.mo19547d(), hVar4.mo19546c(), hVar4.mo19547d());
    }

    /* renamed from: r */
    private int m255r(C2564h hVar, C2564h hVar2, int i) {
        float c = m240c(hVar, hVar2);
        float f = c / ((float) i);
        float c2 = hVar.mo19546c();
        float d = hVar.mo19547d();
        float c3 = ((hVar2.mo19546c() - hVar.mo19546c()) * f) / c;
        float d2 = (f * (hVar2.mo19547d() - hVar.mo19547d())) / c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f241a.mo19493d(C3148a.m8415c((f2 * c3) + c2), C3148a.m8415c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C0599a mo11057a(boolean z) {
        C2564h[] f = m243f(m248k());
        if (z) {
            C2564h hVar = f[0];
            f[0] = f[2];
            f[2] = hVar;
        }
        m242e(f);
        C2549b bVar = this.f241a;
        int i = this.f246f;
        return new C0599a(m254q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m249l(f), this.f242b, this.f244d, this.f243c);
    }
}
