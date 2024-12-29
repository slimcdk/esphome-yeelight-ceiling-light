package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.i0 */
public final class C1821i0 extends C1889m4<C1821i0, C1822a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1821i0 zzj;
    private static volatile C1813h6<C1821i0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C1790g0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.i0$a */
    public static final class C1822a extends C1889m4.C1891b<C1821i0, C1822a> implements C2094z5 {
        private C1822a() {
            super(C1821i0.zzj);
        }

        /* synthetic */ C1822a(C1852k0 k0Var) {
            this();
        }

        /* renamed from: u */
        public final C1822a mo11733u(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1821i0) this.f3567b).m5227z(str);
            return this;
        }
    }

    static {
        C1821i0 i0Var = new C1821i0();
        zzj = i0Var;
        C1889m4.m5467r(C1821i0.class, i0Var);
    }

    private C1821i0() {
    }

    /* renamed from: K */
    public static C1822a m5224K() {
        return (C1822a) zzj.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m5227z(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: A */
    public final boolean mo11725A() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: B */
    public final int mo11726B() {
        return this.zzd;
    }

    /* renamed from: D */
    public final String mo11727D() {
        return this.zze;
    }

    /* renamed from: E */
    public final C1790g0 mo11728E() {
        C1790g0 g0Var = this.zzf;
        return g0Var == null ? C1790g0.m5123K() : g0Var;
    }

    /* renamed from: F */
    public final boolean mo11729F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo11730G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo11731H() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: J */
    public final boolean mo11732J() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1821i0();
            case 2:
                return new C1822a((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C1813h6<C1821i0> h6Var = zzk;
                if (h6Var == null) {
                    synchronized (C1821i0.class) {
                        h6Var = zzk;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzj);
                            zzk = h6Var;
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
