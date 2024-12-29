package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.g0 */
public final class C1790g0 extends C1889m4<C1790g0, C1791a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1790g0 zzh;
    private static volatile C1813h6<C1790g0> zzi;
    private int zzc;
    private C1836j0 zzd;
    private C1805h0 zze;
    private boolean zzf;
    private String zzg = "";

    /* renamed from: com.google.android.gms.internal.measurement.g0$a */
    public static final class C1791a extends C1889m4.C1891b<C1790g0, C1791a> implements C2094z5 {
        private C1791a() {
            super(C1790g0.zzh);
        }

        /* synthetic */ C1791a(C1852k0 k0Var) {
            this();
        }

        /* renamed from: u */
        public final C1791a mo11678u(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1790g0) this.f3567b).m5126z(str);
            return this;
        }
    }

    static {
        C1790g0 g0Var = new C1790g0();
        zzh = g0Var;
        C1889m4.m5467r(C1790g0.class, g0Var);
    }

    private C1790g0() {
    }

    /* renamed from: K */
    public static C1790g0 m5123K() {
        return zzh;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m5126z(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    /* renamed from: A */
    public final boolean mo11670A() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: B */
    public final C1836j0 mo11671B() {
        C1836j0 j0Var = this.zzd;
        return j0Var == null ? C1836j0.m5262H() : j0Var;
    }

    /* renamed from: D */
    public final boolean mo11672D() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: E */
    public final C1805h0 mo11673E() {
        C1805h0 h0Var = this.zze;
        return h0Var == null ? C1805h0.m5167K() : h0Var;
    }

    /* renamed from: F */
    public final boolean mo11674F() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo11675G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo11676H() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: J */
    public final String mo11677J() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1790g0();
            case 2:
                return new C1791a((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C1813h6<C1790g0> h6Var = zzi;
                if (h6Var == null) {
                    synchronized (C1790g0.class) {
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
