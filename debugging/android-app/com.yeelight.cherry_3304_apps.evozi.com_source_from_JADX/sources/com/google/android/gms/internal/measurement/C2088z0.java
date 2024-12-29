package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z0 */
public final class C2088z0 extends C1889m4<C2088z0, C2089a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C2088z0 zzg;
    private static volatile C1813h6<C2088z0> zzh;
    private C2014u4 zzc = C1889m4.m5470w();
    private C2014u4 zzd = C1889m4.m5470w();
    private C1999t4<C1979s0> zze = C1889m4.m5471x();
    private C1999t4<C1700a1> zzf = C1889m4.m5471x();

    /* renamed from: com.google.android.gms.internal.measurement.z0$a */
    public static final class C2089a extends C1889m4.C1891b<C2088z0, C2089a> implements C2094z5 {
        private C2089a() {
            super(C2088z0.zzg);
        }

        /* synthetic */ C2089a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: A */
        public final C2089a mo12344A(Iterable<? extends C1979s0> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6628P(iterable);
            return this;
        }

        /* renamed from: B */
        public final C2089a mo12345B(Iterable<? extends C1700a1> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6631U(iterable);
            return this;
        }

        /* renamed from: u */
        public final C2089a mo12346u() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6636e0();
            return this;
        }

        /* renamed from: v */
        public final C2089a mo12347v(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6629R(i);
            return this;
        }

        /* renamed from: w */
        public final C2089a mo12348w(Iterable<? extends Long> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6622E(iterable);
            return this;
        }

        /* renamed from: x */
        public final C2089a mo12349x() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6637f0();
            return this;
        }

        /* renamed from: y */
        public final C2089a mo12350y(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6632W(i);
            return this;
        }

        /* renamed from: z */
        public final C2089a mo12351z(Iterable<? extends Long> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2088z0) this.f3567b).m6626L(iterable);
            return this;
        }
    }

    static {
        C2088z0 z0Var = new C2088z0();
        zzg = z0Var;
        C1889m4.m5467r(C2088z0.class, z0Var);
    }

    private C2088z0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m6622E(Iterable<? extends Long> iterable) {
        C2014u4 u4Var = this.zzc;
        if (!u4Var.mo12091C()) {
            this.zzc = C1889m4.m5464n(u4Var);
        }
        C2044w2.m6256g(iterable, this.zzc);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m6626L(Iterable<? extends Long> iterable) {
        C2014u4 u4Var = this.zzd;
        if (!u4Var.mo12091C()) {
            this.zzd = C1889m4.m5464n(u4Var);
        }
        C2044w2.m6256g(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m6628P(Iterable<? extends C1979s0> iterable) {
        m6638g0();
        C2044w2.m6256g(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m6629R(int i) {
        m6638g0();
        this.zze.remove(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m6631U(Iterable<? extends C1700a1> iterable) {
        m6639h0();
        C2044w2.m6256g(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final void m6632W(int i) {
        m6639h0();
        this.zzf.remove(i);
    }

    /* renamed from: b0 */
    public static C2089a m6633b0() {
        return (C2089a) zzg.mo11848t();
    }

    /* renamed from: c0 */
    public static C2088z0 m6634c0() {
        return zzg;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final void m6636e0() {
        this.zzc = C1889m4.m5470w();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m6637f0() {
        this.zzd = C1889m4.m5470w();
    }

    /* renamed from: g0 */
    private final void m6638g0() {
        C1999t4<C1979s0> t4Var = this.zze;
        if (!t4Var.mo12091C()) {
            this.zze = C1889m4.m5463m(t4Var);
        }
    }

    /* renamed from: h0 */
    private final void m6639h0() {
        C1999t4<C1700a1> t4Var = this.zzf;
        if (!t4Var.mo12091C()) {
            this.zzf = C1889m4.m5463m(t4Var);
        }
    }

    /* renamed from: F */
    public final int mo12334F() {
        return this.zzc.size();
    }

    /* renamed from: G */
    public final C1700a1 mo12335G(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: N */
    public final List<Long> mo12336N() {
        return this.zzd;
    }

    /* renamed from: Q */
    public final int mo12337Q() {
        return this.zzd.size();
    }

    /* renamed from: V */
    public final List<C1979s0> mo12338V() {
        return this.zze;
    }

    /* renamed from: X */
    public final int mo12339X() {
        return this.zze.size();
    }

    /* renamed from: Y */
    public final List<C1700a1> mo12340Y() {
        return this.zzf;
    }

    /* renamed from: Z */
    public final int mo12341Z() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C2088z0();
            case 2:
                return new C2089a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C1979s0.class, "zzf", C1700a1.class});
            case 4:
                return zzg;
            case 5:
                C1813h6<C2088z0> h6Var = zzh;
                if (h6Var == null) {
                    synchronized (C2088z0.class) {
                        h6Var = zzh;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzg);
                            zzh = h6Var;
                        }
                    }
                }
                return h6Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: y */
    public final C1979s0 mo12342y(int i) {
        return this.zze.get(i);
    }

    /* renamed from: z */
    public final List<Long> mo12343z() {
        return this.zzc;
    }
}
