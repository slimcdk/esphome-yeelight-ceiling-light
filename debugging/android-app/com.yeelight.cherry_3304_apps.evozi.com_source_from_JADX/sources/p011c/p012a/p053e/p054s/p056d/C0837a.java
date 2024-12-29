package p011c.p012a.p053e.p054s.p056d;

import com.miot.service.connection.wifi.step.SmartConfigStep;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.p054s.C0832a;
import p011c.p012a.p053e.p057t.C0840b;
import p011c.p012a.p053e.p057t.C0847i;
import p011c.p012a.p053e.p057t.p058m.C0851a;
import p011c.p012a.p053e.p057t.p058m.C0852b;
import p011c.p012a.p053e.p057t.p059n.C0853a;
import p011c.p012a.p053e.p057t.p059n.C0855c;
import p011c.p012a.p053e.p057t.p059n.C0857e;

/* renamed from: c.a.e.s.d.a */
public final class C0837a {

    /* renamed from: g */
    private static final int[] f762g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C0840b f763a;

    /* renamed from: b */
    private boolean f764b;

    /* renamed from: c */
    private int f765c;

    /* renamed from: d */
    private int f766d;

    /* renamed from: e */
    private int f767e;

    /* renamed from: f */
    private int f768f;

    /* renamed from: c.a.e.s.d.a$a */
    static final class C0838a {

        /* renamed from: a */
        private final int f769a;

        /* renamed from: b */
        private final int f770b;

        C0838a(int i, int i2) {
            this.f769a = i;
            this.f770b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo9031a() {
            return this.f769a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo9032b() {
            return this.f770b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0829p mo9033c() {
            return new C0829p((float) mo9031a(), (float) mo9032b());
        }

        public String toString() {
            return "<" + this.f769a + ' ' + this.f770b + '>';
        }
    }

    public C0837a(C0840b bVar) {
        this.f763a = bVar;
    }

    /* renamed from: b */
    private static float m1161b(C0829p pVar, C0829p pVar2) {
        return C0851a.m1259a(pVar.mo9020c(), pVar.mo9021d(), pVar2.mo9020c(), pVar2.mo9021d());
    }

    /* renamed from: c */
    private static float m1162c(C0838a aVar, C0838a aVar2) {
        return C0851a.m1260b(aVar.mo9031a(), aVar.mo9032b(), aVar2.mo9031a(), aVar2.mo9032b());
    }

    /* renamed from: d */
    private static C0829p[] m1163d(C0829p[] pVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float c = pVarArr[0].mo9020c() - pVarArr[2].mo9020c();
        float d = pVarArr[0].mo9021d() - pVarArr[2].mo9021d();
        float c2 = (pVarArr[0].mo9020c() + pVarArr[2].mo9020c()) / 2.0f;
        float d2 = (pVarArr[0].mo9021d() + pVarArr[2].mo9021d()) / 2.0f;
        float f4 = c * f3;
        float f5 = d * f3;
        C0829p pVar = new C0829p(c2 + f4, d2 + f5);
        C0829p pVar2 = new C0829p(c2 - f4, d2 - f5);
        float c3 = pVarArr[1].mo9020c() - pVarArr[3].mo9020c();
        float d3 = pVarArr[1].mo9021d() - pVarArr[3].mo9021d();
        float c4 = (pVarArr[1].mo9020c() + pVarArr[3].mo9020c()) / 2.0f;
        float d4 = (pVarArr[1].mo9021d() + pVarArr[3].mo9021d()) / 2.0f;
        float f6 = c3 * f3;
        float f7 = f3 * d3;
        return new C0829p[]{pVar, new C0829p(c4 + f6, d4 + f7), pVar2, new C0829p(c4 - f6, d4 - f7)};
    }

    /* renamed from: e */
    private void m1164e(C0829p[] pVarArr) {
        int i;
        long j;
        long j2;
        if (!m1174o(pVarArr[0]) || !m1174o(pVarArr[1]) || !m1174o(pVarArr[2]) || !m1174o(pVarArr[3])) {
            throw C0823j.m1126a();
        }
        int i2 = this.f767e * 2;
        int[] iArr = {m1177r(pVarArr[0], pVarArr[1], i2), m1177r(pVarArr[1], pVarArr[2], i2), m1177r(pVarArr[2], pVarArr[3], i2), m1177r(pVarArr[3], pVarArr[0], i2)};
        this.f768f = m1172m(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f768f + i3) % 4];
            if (this.f764b) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m1167h(j3, this.f764b);
        if (this.f764b) {
            this.f765c = (h >> 6) + 1;
            i = h & 63;
        } else {
            this.f765c = (h >> 11) + 1;
            i = h & 2047;
        }
        this.f766d = i + 1;
    }

    /* renamed from: f */
    private C0829p[] m1165f(C0838a aVar) {
        this.f767e = 1;
        C0838a aVar2 = aVar;
        C0838a aVar3 = aVar2;
        C0838a aVar4 = aVar3;
        C0838a aVar5 = aVar4;
        boolean z = true;
        while (this.f767e < 9) {
            C0838a j = m1169j(aVar2, z, 1, -1);
            C0838a j2 = m1169j(aVar3, z, 1, 1);
            C0838a j3 = m1169j(aVar4, z, -1, 1);
            C0838a j4 = m1169j(aVar5, z, -1, -1);
            if (this.f767e > 2) {
                double c = (double) ((m1162c(j4, j) * ((float) this.f767e)) / (m1162c(aVar5, aVar2) * ((float) (this.f767e + 2))));
                if (c < 0.75d || c > 1.25d || !m1175p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f767e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f767e;
        if (i == 5 || i == 7) {
            this.f764b = this.f767e == 5;
            C0829p[] pVarArr = {new C0829p(((float) aVar2.mo9031a()) + 0.5f, ((float) aVar2.mo9032b()) - 0.5f), new C0829p(((float) aVar3.mo9031a()) + 0.5f, ((float) aVar3.mo9032b()) + 0.5f), new C0829p(((float) aVar4.mo9031a()) - 0.5f, ((float) aVar4.mo9032b()) + 0.5f), new C0829p(((float) aVar5.mo9031a()) - 0.5f, ((float) aVar5.mo9032b()) - 0.5f)};
            int i2 = this.f767e;
            return m1163d(pVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw C0823j.m1126a();
    }

    /* renamed from: g */
    private int m1166g(C0838a aVar, C0838a aVar2) {
        float c = m1162c(aVar, aVar2);
        float a = ((float) (aVar2.mo9031a() - aVar.mo9031a())) / c;
        float b = ((float) (aVar2.mo9032b() - aVar.mo9032b())) / c;
        float a2 = (float) aVar.mo9031a();
        float b2 = (float) aVar.mo9032b();
        boolean d = this.f763a.mo9059d(aVar.mo9031a(), aVar.mo9032b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f763a.mo9059d(C0851a.m1261c(a2), C0851a.m1261c(b2)) != d) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == d ? 1 : -1;
    }

    /* renamed from: h */
    private static int m1167h(long j, boolean z) {
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
            new C0855c(C0853a.f848k).mo9121a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C0857e unused) {
            throw C0823j.m1126a();
        }
    }

    /* renamed from: i */
    private int m1168i() {
        if (this.f764b) {
            return (this.f765c * 4) + 11;
        }
        int i = this.f765c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C0838a m1169j(C0838a aVar, boolean z, int i, int i2) {
        int a = aVar.mo9031a() + i;
        int b = aVar.mo9032b();
        while (true) {
            b += i2;
            if (!m1173n(a, b) || this.f763a.mo9059d(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m1173n(i32, i42) && this.f763a.mo9059d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m1173n(i5, i42) && this.f763a.mo9059d(i5, i42) == z) {
            i42 += i2;
        }
        return new C0838a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C0838a m1170k() {
        C0829p pVar;
        C0829p pVar2;
        C0829p pVar3;
        C0829p pVar4;
        C0829p pVar5;
        C0829p pVar6;
        C0829p pVar7;
        C0829p pVar8;
        try {
            C0829p[] c = new C0852b(this.f763a).mo9099c();
            pVar3 = c[0];
            pVar2 = c[1];
            pVar = c[2];
            pVar4 = c[3];
        } catch (C0823j unused) {
            int m = this.f763a.mo9067m() / 2;
            int j = this.f763a.mo9064j() / 2;
            int i = m + 7;
            int i2 = j - 7;
            C0829p c2 = m1169j(new C0838a(i, i2), false, 1, -1).mo9033c();
            int i3 = j + 7;
            C0829p c3 = m1169j(new C0838a(i, i3), false, 1, 1).mo9033c();
            int i4 = m - 7;
            C0829p c4 = m1169j(new C0838a(i4, i3), false, -1, 1).mo9033c();
            pVar4 = m1169j(new C0838a(i4, i2), false, -1, -1).mo9033c();
            C0829p pVar9 = c3;
            pVar = c4;
            pVar3 = c2;
            pVar2 = pVar9;
        }
        int c5 = C0851a.m1261c((((pVar3.mo9020c() + pVar4.mo9020c()) + pVar2.mo9020c()) + pVar.mo9020c()) / 4.0f);
        int c6 = C0851a.m1261c((((pVar3.mo9021d() + pVar4.mo9021d()) + pVar2.mo9021d()) + pVar.mo9021d()) / 4.0f);
        try {
            C0829p[] c7 = new C0852b(this.f763a, 15, c5, c6).mo9099c();
            pVar6 = c7[0];
            pVar5 = c7[1];
            pVar7 = c7[2];
            pVar8 = c7[3];
        } catch (C0823j unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            pVar6 = m1169j(new C0838a(i5, i6), false, 1, -1).mo9033c();
            int i7 = c6 + 7;
            pVar5 = m1169j(new C0838a(i5, i7), false, 1, 1).mo9033c();
            int i8 = c5 - 7;
            pVar7 = m1169j(new C0838a(i8, i7), false, -1, 1).mo9033c();
            pVar8 = m1169j(new C0838a(i8, i6), false, -1, -1).mo9033c();
        }
        return new C0838a(C0851a.m1261c((((pVar6.mo9020c() + pVar8.mo9020c()) + pVar5.mo9020c()) + pVar7.mo9020c()) / 4.0f), C0851a.m1261c((((pVar6.mo9021d() + pVar8.mo9021d()) + pVar5.mo9021d()) + pVar7.mo9021d()) / 4.0f));
    }

    /* renamed from: l */
    private C0829p[] m1171l(C0829p[] pVarArr) {
        return m1163d(pVarArr, (float) (this.f767e * 2), (float) m1168i());
    }

    /* renamed from: m */
    private static int m1172m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f762g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C0823j.m1126a();
    }

    /* renamed from: n */
    private boolean m1173n(int i, int i2) {
        return i >= 0 && i < this.f763a.mo9067m() && i2 > 0 && i2 < this.f763a.mo9064j();
    }

    /* renamed from: o */
    private boolean m1174o(C0829p pVar) {
        return m1173n(C0851a.m1261c(pVar.mo9020c()), C0851a.m1261c(pVar.mo9021d()));
    }

    /* renamed from: p */
    private boolean m1175p(C0838a aVar, C0838a aVar2, C0838a aVar3, C0838a aVar4) {
        C0838a aVar5 = new C0838a(aVar.mo9031a() - 3, aVar.mo9032b() + 3);
        C0838a aVar6 = new C0838a(aVar2.mo9031a() - 3, aVar2.mo9032b() - 3);
        C0838a aVar7 = new C0838a(aVar3.mo9031a() + 3, aVar3.mo9032b() - 3);
        C0838a aVar8 = new C0838a(aVar4.mo9031a() + 3, aVar4.mo9032b() + 3);
        int g = m1166g(aVar8, aVar5);
        return g != 0 && m1166g(aVar5, aVar6) == g && m1166g(aVar6, aVar7) == g && m1166g(aVar7, aVar8) == g;
    }

    /* renamed from: q */
    private C0840b m1176q(C0840b bVar, C0829p pVar, C0829p pVar2, C0829p pVar3, C0829p pVar4) {
        C0847i b = C0847i.m1244b();
        int i = m1168i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f767e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo9092c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, pVar.mo9020c(), pVar.mo9021d(), pVar2.mo9020c(), pVar2.mo9021d(), pVar3.mo9020c(), pVar3.mo9021d(), pVar4.mo9020c(), pVar4.mo9021d());
    }

    /* renamed from: r */
    private int m1177r(C0829p pVar, C0829p pVar2, int i) {
        float b = m1161b(pVar, pVar2);
        float f = b / ((float) i);
        float c = pVar.mo9020c();
        float d = pVar.mo9021d();
        float c2 = ((pVar2.mo9020c() - pVar.mo9020c()) * f) / b;
        float d2 = (f * (pVar2.mo9021d() - pVar.mo9021d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f763a.mo9059d(C0851a.m1261c((f2 * c2) + c), C0851a.m1261c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C0832a mo9030a(boolean z) {
        C0829p[] f = m1165f(m1170k());
        if (z) {
            C0829p pVar = f[0];
            f[0] = f[2];
            f[2] = pVar;
        }
        m1164e(f);
        C0840b bVar = this.f763a;
        int i = this.f768f;
        return new C0832a(m1176q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m1171l(f), this.f764b, this.f766d, this.f765c);
    }
}
