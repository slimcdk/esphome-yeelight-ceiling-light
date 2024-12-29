package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
public final class C1715b1 extends C1889m4<C1715b1, C1716a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1715b1 zzj;
    private static volatile C1813h6<C1715b1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    /* renamed from: com.google.android.gms.internal.measurement.b1$a */
    public static final class C1716a extends C1889m4.C1891b<C1715b1, C1716a> implements C2094z5 {
        private C1716a() {
            super(C1715b1.zzj);
        }

        /* synthetic */ C1716a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: A */
        public final C1716a mo11444A(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4737O(str);
            return this;
        }

        /* renamed from: B */
        public final C1716a mo11445B() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4743d0();
            return this;
        }

        /* renamed from: u */
        public final C1716a mo11446u() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4741b0();
            return this;
        }

        /* renamed from: v */
        public final C1716a mo11447v(double d) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4744y(d);
            return this;
        }

        /* renamed from: w */
        public final C1716a mo11448w(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4745z(j);
            return this;
        }

        /* renamed from: x */
        public final C1716a mo11449x(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4732F(str);
            return this;
        }

        /* renamed from: y */
        public final C1716a mo11450y() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4742c0();
            return this;
        }

        /* renamed from: z */
        public final C1716a mo11451z(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1715b1) this.f3567b).m4733J(j);
            return this;
        }
    }

    static {
        C1715b1 b1Var = new C1715b1();
        zzj = b1Var;
        C1889m4.m5467r(C1715b1.class, b1Var);
    }

    private C1715b1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m4732F(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m4733J(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m4737O(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    /* renamed from: Y */
    public static C1716a m4739Y() {
        return (C1716a) zzj.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m4741b0() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m4742c0() {
        this.zzc &= -9;
        this.zzg = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m4743d0() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m4744y(double d) {
        this.zzc |= 32;
        this.zzi = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m4745z(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* renamed from: G */
    public final boolean mo11435G() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: H */
    public final long mo11436H() {
        return this.zzd;
    }

    /* renamed from: P */
    public final String mo11437P() {
        return this.zze;
    }

    /* renamed from: R */
    public final boolean mo11438R() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: T */
    public final String mo11439T() {
        return this.zzf;
    }

    /* renamed from: U */
    public final boolean mo11440U() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: V */
    public final long mo11441V() {
        return this.zzg;
    }

    /* renamed from: W */
    public final boolean mo11442W() {
        return (this.zzc & 32) != 0;
    }

    /* renamed from: X */
    public final double mo11443X() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C1715b1();
            case 2:
                return new C1716a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                C1813h6<C1715b1> h6Var = zzk;
                if (h6Var == null) {
                    synchronized (C1715b1.class) {
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
