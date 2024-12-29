package com.google.android.gms.internal.wearable;

import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.y */
final class C1531y {

    /* renamed from: a */
    private final C1527x f1878a;

    private C1531y(C1527x xVar) {
        C1524w0.m3858b(xVar, "output");
        this.f1878a = xVar;
        xVar.f1871a = this;
    }

    /* renamed from: l */
    public static C1531y m3924l(C1527x xVar) {
        C1531y yVar = xVar.f1871a;
        return yVar != null ? yVar : new C1531y(xVar);
    }

    /* renamed from: A */
    public final void mo13853A(int i, int i2) {
        this.f1878a.mo13811i(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: B */
    public final void mo13854B(int i, long j) {
        this.f1878a.mo13813k(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: C */
    public final void mo13855C(int i, Object obj, C1417a2 a2Var) {
        C1486o1 o1Var = (C1486o1) obj;
        C1519v vVar = (C1519v) this.f1878a;
        vVar.mo13820r((i << 3) | 2);
        C1439f fVar = (C1439f) o1Var;
        int g = fVar.mo13623g();
        if (g == -1) {
            g = a2Var.mo13579a(fVar);
            fVar.mo13624h(g);
        }
        vVar.mo13820r(g);
        a2Var.mo13585g(o1Var, vVar.f1871a);
    }

    /* renamed from: D */
    public final void mo13856D(int i, Object obj, C1417a2 a2Var) {
        C1527x xVar = this.f1878a;
        xVar.mo13809g(i, 3);
        a2Var.mo13585g((C1486o1) obj, xVar.f1871a);
        xVar.mo13809g(i, 4);
    }

    /* renamed from: E */
    public final void mo13857E(int i) {
        this.f1878a.mo13809g(i, 3);
    }

    /* renamed from: F */
    public final void mo13858F(int i) {
        this.f1878a.mo13809g(i, 4);
    }

    /* renamed from: G */
    public final void mo13859G(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1527x.m3883z(list.get(i4).intValue());
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13819q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13810h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo13860H(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13821s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13812j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo13861I(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1527x.m3874B(list.get(i4).longValue());
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13822t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13813k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo13862J(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1527x.m3874B(list.get(i4).longValue());
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13822t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13813k(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: K */
    public final void mo13863K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13823u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13814l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo13864a(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13821s(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13812j(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo13865b(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13823u(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13814l(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo13866c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1527x.m3883z(list.get(i4).intValue());
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13819q(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13810h(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo13867d(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13818p(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13815m(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo13868e(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C1536z0) {
            C1536z0 z0Var = (C1536z0) list;
            while (i2 < list.size()) {
                Object p = z0Var.mo13803p(i2);
                if (p instanceof String) {
                    this.f1878a.mo13816n(i, (String) p);
                } else {
                    this.f1878a.mo13817o(i, (zzau) p);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13816n(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo13869f(int i, List<zzau> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1878a.mo13817o(i, list.get(i2));
        }
    }

    /* renamed from: g */
    public final void mo13870g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1527x.m3873A(list.get(i4).intValue());
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13820r(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13811i(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo13871h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13821s(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13812j(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo13872i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                this.f1878a.mo13823u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1878a.mo13814l(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo13873j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += C1527x.m3873A((intValue >> 31) ^ (intValue + intValue));
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                C1527x xVar = this.f1878a;
                int intValue2 = list.get(i2).intValue();
                xVar.mo13820r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C1527x xVar2 = this.f1878a;
            int intValue3 = list.get(i2).intValue();
            xVar2.mo13811i(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo13874k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1878a.mo13809g(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += C1527x.m3874B((longValue >> 63) ^ (longValue + longValue));
            }
            this.f1878a.mo13820r(i3);
            while (i2 < list.size()) {
                C1527x xVar = this.f1878a;
                long longValue2 = list.get(i2).longValue();
                xVar.mo13822t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C1527x xVar2 = this.f1878a;
            long longValue3 = list.get(i2).longValue();
            xVar2.mo13813k(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo13875m(int i, int i2) {
        this.f1878a.mo13812j(i, i2);
    }

    /* renamed from: n */
    public final void mo13876n(int i, long j) {
        this.f1878a.mo13813k(i, j);
    }

    /* renamed from: o */
    public final void mo13877o(int i, long j) {
        this.f1878a.mo13814l(i, j);
    }

    /* renamed from: p */
    public final void mo13878p(int i, float f) {
        this.f1878a.mo13812j(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: q */
    public final void mo13879q(int i, double d) {
        this.f1878a.mo13814l(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo13880r(int i, int i2) {
        this.f1878a.mo13810h(i, i2);
    }

    /* renamed from: s */
    public final void mo13881s(int i, long j) {
        this.f1878a.mo13813k(i, j);
    }

    /* renamed from: t */
    public final void mo13882t(int i, int i2) {
        this.f1878a.mo13810h(i, i2);
    }

    /* renamed from: u */
    public final void mo13883u(int i, long j) {
        this.f1878a.mo13814l(i, j);
    }

    /* renamed from: v */
    public final void mo13884v(int i, int i2) {
        this.f1878a.mo13812j(i, i2);
    }

    /* renamed from: w */
    public final void mo13885w(int i, boolean z) {
        this.f1878a.mo13815m(i, z);
    }

    /* renamed from: x */
    public final void mo13886x(int i, String str) {
        this.f1878a.mo13816n(i, str);
    }

    /* renamed from: y */
    public final void mo13887y(int i, zzau zzau) {
        this.f1878a.mo13817o(i, zzau);
    }

    /* renamed from: z */
    public final void mo13888z(int i, int i2) {
        this.f1878a.mo13811i(i, i2);
    }
}
