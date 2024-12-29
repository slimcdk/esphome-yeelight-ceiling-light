package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C2088z0;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
public final class C1963r0 extends C1889m4<C1963r0, C1964a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1963r0 zzh;
    private static volatile C1813h6<C1963r0> zzi;
    private int zzc;
    private int zzd;
    private C2088z0 zze;
    private C2088z0 zzf;
    private boolean zzg;

    /* renamed from: com.google.android.gms.internal.measurement.r0$a */
    public static final class C1964a extends C1889m4.C1891b<C1963r0, C1964a> implements C2094z5 {
        private C1964a() {
            super(C1963r0.zzh);
        }

        /* synthetic */ C1964a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: u */
        public final C1964a mo11973u(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1963r0) this.f3567b).m5865y(i);
            return this;
        }

        /* renamed from: v */
        public final C1964a mo11974v(C2088z0.C2089a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1963r0) this.f3567b).m5859D((C2088z0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: w */
        public final C1964a mo11975w(C2088z0 z0Var) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1963r0) this.f3567b).m5862J(z0Var);
            return this;
        }

        /* renamed from: x */
        public final C1964a mo11976x(boolean z) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1963r0) this.f3567b).m5860E(z);
            return this;
        }
    }

    static {
        C1963r0 r0Var = new C1963r0();
        zzh = r0Var;
        C1889m4.m5467r(C1963r0.class, r0Var);
    }

    private C1963r0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m5859D(C2088z0 z0Var) {
        z0Var.getClass();
        this.zze = z0Var;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m5860E(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m5862J(C2088z0 z0Var) {
        z0Var.getClass();
        this.zzf = z0Var;
        this.zzc |= 4;
    }

    /* renamed from: Q */
    public static C1964a m5863Q() {
        return (C1964a) zzh.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m5865y(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: F */
    public final boolean mo11966F() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: G */
    public final int mo11967G() {
        return this.zzd;
    }

    /* renamed from: K */
    public final C2088z0 mo11968K() {
        C2088z0 z0Var = this.zze;
        return z0Var == null ? C2088z0.m6634c0() : z0Var;
    }

    /* renamed from: L */
    public final boolean mo11969L() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: N */
    public final C2088z0 mo11970N() {
        C2088z0 z0Var = this.zzf;
        return z0Var == null ? C2088z0.m6634c0() : z0Var;
    }

    /* renamed from: O */
    public final boolean mo11971O() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: P */
    public final boolean mo11972P() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C1963r0();
            case 2:
                return new C1964a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C1813h6<C1963r0> h6Var = zzi;
                if (h6Var == null) {
                    synchronized (C1963r0.class) {
                        h6Var = zzi;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzh);
                            zzi = h6Var;
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
}
