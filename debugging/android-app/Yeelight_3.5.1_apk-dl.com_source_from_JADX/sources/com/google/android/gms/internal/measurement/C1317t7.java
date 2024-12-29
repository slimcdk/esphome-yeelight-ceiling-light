package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
final class C1317t7 implements C1065db {

    /* renamed from: a */
    private final C1301s7 f1649a;

    private C1317t7(C1301s7 s7Var) {
        C1270q8.m2547f(s7Var, "output");
        this.f1649a = s7Var;
        s7Var.f1599a = this;
    }

    /* renamed from: K */
    public static C1317t7 m3004K(C1301s7 s7Var) {
        C1317t7 t7Var = s7Var.f1599a;
        return t7Var != null ? t7Var : new C1317t7(s7Var);
    }

    /* renamed from: A */
    public final void mo12667A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13093l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13092k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo12668B(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13095n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13094m(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo12669C(int i, long j) {
        this.f1649a.mo13103v(i, j);
    }

    @Deprecated
    /* renamed from: D */
    public final void mo12670D(int i) {
        this.f1649a.mo13100s(i, 3);
    }

    /* renamed from: E */
    public final void mo12671E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13093l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13092k(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo12672F(int i, long j) {
        this.f1649a.mo13094m(i, j);
    }

    /* renamed from: G */
    public final void mo12673G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C1301s7.m2905b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                C1301s7 s7Var = this.f1649a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                s7Var.mo13104w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C1301s7 s7Var2 = this.f1649a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            s7Var2.mo13103v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo12674H(int i, Object obj, C1364w9 w9Var) {
        C1301s7 s7Var = this.f1649a;
        s7Var.mo13100s(i, 3);
        w9Var.mo13048h((C1191l9) obj, s7Var.f1599a);
        s7Var.mo13100s(i, 4);
    }

    /* renamed from: I */
    public final void mo12675I(int i, long j) {
        this.f1649a.mo13103v(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    /* renamed from: J */
    public final void mo12676J(int i) {
        this.f1649a.mo13100s(i, 4);
    }

    /* renamed from: a */
    public final void mo12677a(int i, int i2) {
        this.f1649a.mo13101t(i, i2);
    }

    /* renamed from: b */
    public final void mo12678b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13095n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13094m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo12679c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1649a.mo13091j(i, (zzjb) list.get(i2));
        }
    }

    /* renamed from: d */
    public final void mo12680d(int i, Object obj, C1364w9 w9Var) {
        C1191l9 l9Var = (C1191l9) obj;
        C1269q7 q7Var = (C1269q7) this.f1649a;
        q7Var.mo13102u((i << 3) | 2);
        C1391y6 y6Var = (C1391y6) l9Var;
        int g = y6Var.mo12912g();
        if (g == -1) {
            g = w9Var.mo13046f(y6Var);
            y6Var.mo12914i(g);
        }
        q7Var.mo13102u(g);
        w9Var.mo13048h(l9Var, q7Var.f1599a);
    }

    /* renamed from: e */
    public final void mo12681e(int i, int i2) {
        this.f1649a.mo13092k(i, i2);
    }

    /* renamed from: f */
    public final void mo12682f(int i, boolean z) {
        this.f1649a.mo13090i(i, z);
    }

    /* renamed from: g */
    public final void mo12683g(int i, zzjb zzjb) {
        this.f1649a.mo13091j(i, zzjb);
    }

    /* renamed from: h */
    public final void mo12684h(int i, int i2) {
        this.f1649a.mo13101t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: i */
    public final void mo12685i(int i, String str) {
        this.f1649a.mo13099r(i, str);
    }

    /* renamed from: j */
    public final void mo12686j(int i, long j) {
        this.f1649a.mo13103v(i, j);
    }

    /* renamed from: k */
    public final void mo12687k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13089h(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13090i(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo12688l(int i, long j) {
        this.f1649a.mo13094m(i, j);
    }

    /* renamed from: m */
    public final void mo12689m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1301s7.m2904a(((Integer) list.get(i4)).intValue());
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13102u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13101t(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo12690n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13093l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13092k(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo12691o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1301s7.m2910z(((Integer) list.get(i4)).intValue());
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13097p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13096o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void mo12692p(int i, int i2) {
        this.f1649a.mo13096o(i, i2);
    }

    /* renamed from: q */
    public final void mo12693q(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1301s7.m2910z(((Integer) list.get(i4)).intValue());
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13097p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13096o(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo12694r(int i, int i2) {
        this.f1649a.mo13096o(i, i2);
    }

    /* renamed from: s */
    public final void mo12695s(int i, List list) {
        int i2 = 0;
        if (list instanceof C1318t8) {
            C1318t8 t8Var = (C1318t8) list;
            while (i2 < list.size()) {
                Object i3 = t8Var.mo13354i(i2);
                if (i3 instanceof String) {
                    this.f1649a.mo13099r(i, (String) i3);
                } else {
                    this.f1649a.mo13091j(i, (zzjb) i3);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13099r(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo12696t(int i, double d) {
        this.f1649a.mo13094m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: u */
    public final void mo12697u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13095n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13094m(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo12698v(int i, int i2) {
        this.f1649a.mo13092k(i, i2);
    }

    /* renamed from: w */
    public final void mo12699w(int i, float f) {
        this.f1649a.mo13092k(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: x */
    public final void mo12700x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C1301s7.m2904a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                C1301s7 s7Var = this.f1649a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                s7Var.mo13102u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C1301s7 s7Var2 = this.f1649a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            s7Var2.mo13101t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo12701y(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1301s7.m2905b(((Long) list.get(i4)).longValue());
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13104w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13103v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo12702z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1649a.mo13100s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C1301s7.m2905b(((Long) list.get(i4)).longValue());
            }
            this.f1649a.mo13102u(i3);
            while (i2 < list.size()) {
                this.f1649a.mo13104w(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1649a.mo13103v(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
