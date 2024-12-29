package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
final class C2060x3 implements C1723b8 {

    /* renamed from: a */
    private final C2028v3 f3813a;

    private C2060x3(C2028v3 v3Var) {
        C1925o4.m5644f(v3Var, "output");
        C2028v3 v3Var2 = v3Var;
        this.f3813a = v3Var2;
        v3Var2.f3763a = this;
    }

    /* renamed from: P */
    public static C2060x3 m6522P(C2028v3 v3Var) {
        C2060x3 x3Var = v3Var.f3763a;
        return x3Var != null ? x3Var : new C2060x3(v3Var);
    }

    /* renamed from: A */
    public final void mo11474A(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6155o0(list.get(i4).longValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12131S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12129Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo11475B(int i, C1779f3 f3Var) {
        this.f3813a.mo12149o(i, f3Var);
    }

    /* renamed from: C */
    public final int mo11476C() {
        return C1889m4.C1894e.f3579k;
    }

    /* renamed from: D */
    public final void mo11477D(int i, Object obj, C1912n6 n6Var) {
        this.f3813a.mo12151q(i, (C2062x5) obj, n6Var);
    }

    /* renamed from: E */
    public final void mo11478E(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6151j0(list.get(i4).longValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12154t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12148n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo11479F(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6160t0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12133X(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12140g0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final <K, V> void mo11480G(int i, C1926o5<K, V> o5Var, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f3813a.mo12147m(i, 2);
            this.f3813a.mo12127O(C1940p5.m5764a(o5Var, next.getKey(), next.getValue()));
            C1940p5.m5765b(this.f3813a, o5Var, next.getKey(), next.getValue());
        }
    }

    /* renamed from: H */
    public final void mo11481H(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6166z(list.get(i4).doubleValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12141h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12144k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: I */
    public final void mo11482I(int i, List<C1779f3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f3813a.mo12149o(i, list.get(i2));
        }
    }

    /* renamed from: J */
    public final void mo11483J(int i, int i2) {
        this.f3813a.mo12145k0(i, i2);
    }

    /* renamed from: K */
    public final void mo11484K(int i, long j) {
        this.f3813a.mo12135Z(i, j);
    }

    /* renamed from: L */
    public final void mo11485L(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6119A(list.get(i4).floatValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12142i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12146l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: M */
    public final void mo11486M(int i, int i2) {
        this.f3813a.mo12134Y(i, i2);
    }

    /* renamed from: N */
    public final void mo11487N(int i, long j) {
        this.f3813a.mo12129Q(i, j);
    }

    /* renamed from: O */
    public final void mo11488O(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C1766e5) {
            C1766e5 e5Var = (C1766e5) list;
            while (i2 < list.size()) {
                Object b = e5Var.mo11600b(i2);
                if (b instanceof String) {
                    this.f3813a.mo12152r(i, (String) b);
                } else {
                    this.f3813a.mo12149o(i, (C1779f3) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12152r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo11489a(int i) {
        this.f3813a.mo12147m(i, 3);
    }

    /* renamed from: b */
    public final void mo11490b(int i) {
        this.f3813a.mo12147m(i, 4);
    }

    /* renamed from: c */
    public final void mo11491c(int i, List<?> list, C1912n6 n6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo11477D(i, list.get(i2), n6Var);
        }
    }

    /* renamed from: d */
    public final void mo11492d(int i, boolean z) {
        this.f3813a.mo12153s(i, z);
    }

    /* renamed from: e */
    public final void mo11493e(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6136L(list.get(i4).booleanValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12159y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12153s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo11494f(int i, long j) {
        this.f3813a.mo12135Z(i, j);
    }

    /* renamed from: g */
    public final void mo11495g(int i, List<?> list, C1912n6 n6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo11503o(i, list.get(i2), n6Var);
        }
    }

    /* renamed from: h */
    public final void mo11496h(int i, int i2) {
        this.f3813a.mo12128P(i, i2);
    }

    /* renamed from: i */
    public final void mo11497i(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6152l0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12143j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12128P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo11498j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6124C0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12143j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12128P(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo11499k(int i, int i2) {
        this.f3813a.mo12128P(i, i2);
    }

    /* renamed from: l */
    public final void mo11500l(int i, long j) {
        this.f3813a.mo12148n(i, j);
    }

    /* renamed from: m */
    public final void mo11501m(int i, Object obj) {
        if (obj instanceof C1779f3) {
            this.f3813a.mo12130R(i, (C1779f3) obj);
        } else {
            this.f3813a.mo12150p(i, (C2062x5) obj);
        }
    }

    /* renamed from: n */
    public final void mo11502n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6147e0(list.get(i4).longValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12154t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12148n(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo11503o(int i, Object obj, C1912n6 n6Var) {
        C2028v3 v3Var = this.f3813a;
        v3Var.mo12147m(i, 3);
        n6Var.mo11467f((C2062x5) obj, v3Var.f3763a);
        v3Var.mo12147m(i, 4);
    }

    /* renamed from: p */
    public final void mo11504p(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6163w0(list.get(i4).longValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12136a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12135Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: q */
    public final void mo11505q(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6164x0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12138f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12145k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo11506r(int i, String str) {
        this.f3813a.mo12152r(i, str);
    }

    /* renamed from: s */
    public final void mo11507s(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6156p0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12127O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12134Y(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: t */
    public final void mo11508t(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6120A0(list.get(i4).intValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12138f0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12145k0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: u */
    public final void mo11509u(int i, int i2) {
        this.f3813a.mo12145k0(i, i2);
    }

    /* renamed from: v */
    public final void mo11510v(int i, long j) {
        this.f3813a.mo12148n(i, j);
    }

    /* renamed from: w */
    public final void mo11511w(int i, double d) {
        this.f3813a.mo12144k(i, d);
    }

    /* renamed from: x */
    public final void mo11512x(int i, float f) {
        this.f3813a.mo12146l(i, f);
    }

    /* renamed from: y */
    public final void mo11513y(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3813a.mo12147m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C2028v3.m6159s0(list.get(i4).longValue());
            }
            this.f3813a.mo12127O(i3);
            while (i2 < list.size()) {
                this.f3813a.mo12136a0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3813a.mo12135Z(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo11514z(int i, int i2) {
        this.f3813a.mo12140g0(i, i2);
    }
}
