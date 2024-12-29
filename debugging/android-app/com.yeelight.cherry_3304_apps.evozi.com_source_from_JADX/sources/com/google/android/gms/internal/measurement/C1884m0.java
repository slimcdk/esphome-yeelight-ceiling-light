package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
public final class C1884m0 extends C1889m4<C1884m0, C1885a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1884m0 zzh;
    private static volatile C1813h6<C1884m0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.measurement.m0$a */
    public static final class C1885a extends C1889m4.C1891b<C1884m0, C1885a> implements C2094z5 {
        private C1885a() {
            super(C1884m0.zzh);
        }

        /* synthetic */ C1885a(C1949q0 q0Var) {
            this();
        }

        /* renamed from: u */
        public final C1885a mo11828u(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1884m0) this.f3567b).m5443A(str);
            return this;
        }

        /* renamed from: v */
        public final String mo11829v() {
            return ((C1884m0) this.f3567b).mo11827y();
        }

        /* renamed from: w */
        public final boolean mo11830w() {
            return ((C1884m0) this.f3567b).mo11823B();
        }

        /* renamed from: x */
        public final boolean mo11831x() {
            return ((C1884m0) this.f3567b).mo11824D();
        }

        /* renamed from: y */
        public final boolean mo11832y() {
            return ((C1884m0) this.f3567b).mo11825E();
        }

        /* renamed from: z */
        public final int mo11833z() {
            return ((C1884m0) this.f3567b).mo11826F();
        }
    }

    static {
        C1884m0 m0Var = new C1884m0();
        zzh = m0Var;
        C1889m4.m5467r(C1884m0.class, m0Var);
    }

    private C1884m0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m5443A(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* renamed from: B */
    public final boolean mo11823B() {
        return this.zze;
    }

    /* renamed from: D */
    public final boolean mo11824D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final boolean mo11825E() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: F */
    public final int mo11826F() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1949q0.f3683a[i - 1]) {
            case 1:
                return new C1884m0();
            case 2:
                return new C1885a((C1949q0) null);
            case 3:
                return C1889m4.m5465p(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                C1813h6<C1884m0> h6Var = zzi;
                if (h6Var == null) {
                    synchronized (C1884m0.class) {
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

    /* renamed from: y */
    public final String mo11827y() {
        return this.zzd;
    }
}
