package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
public final class C1979s0 extends C1889m4<C1979s0, C1980a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1979s0 zzf;
    private static volatile C1813h6<C1979s0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    /* renamed from: com.google.android.gms.internal.measurement.s0$a */
    public static final class C1980a extends C1889m4.C1891b<C1979s0, C1980a> implements C2094z5 {
        private C1980a() {
            super(C1979s0.zzf);
        }

        /* synthetic */ C1980a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: u */
        public final C1980a mo12050u(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1979s0) this.f3567b).m5930y(i);
            return this;
        }

        /* renamed from: v */
        public final C1980a mo12051v(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1979s0) this.f3567b).m5931z(j);
            return this;
        }
    }

    static {
        C1979s0 s0Var = new C1979s0();
        zzf = s0Var;
        C1889m4.m5467r(C1979s0.class, s0Var);
    }

    private C1979s0() {
    }

    /* renamed from: H */
    public static C1980a m5928H() {
        return (C1980a) zzf.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m5930y(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m5931z(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* renamed from: D */
    public final boolean mo12046D() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: E */
    public final int mo12047E() {
        return this.zzd;
    }

    /* renamed from: F */
    public final boolean mo12048F() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: G */
    public final long mo12049G() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C1979s0();
            case 2:
                return new C1980a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C1813h6<C1979s0> h6Var = zzg;
                if (h6Var == null) {
                    synchronized (C1979s0.class) {
                        h6Var = zzg;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzf);
                            zzg = h6Var;
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
