package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v0 */
public final class C2024v0 extends C1889m4<C2024v0, C2025a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C2024v0 zzj;
    private static volatile C1813h6<C2024v0> zzk;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private float zzg;
    private double zzh;
    private C1999t4<C2024v0> zzi = C1889m4.m5471x();

    /* renamed from: com.google.android.gms.internal.measurement.v0$a */
    public static final class C2025a extends C1889m4.C1891b<C2024v0, C2025a> implements C2094z5 {
        private C2025a() {
            super(C2024v0.zzj);
        }

        /* synthetic */ C2025a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: A */
        public final C2025a mo12113A() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6075g0();
            return this;
        }

        /* renamed from: B */
        public final C2025a mo12114B(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6068P(str);
            return this;
        }

        /* renamed from: D */
        public final C2025a mo12115D() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6076h0();
            return this;
        }

        /* renamed from: E */
        public final int mo12116E() {
            return ((C2024v0) this.f3567b).mo12112c0();
        }

        /* renamed from: F */
        public final C2025a mo12117F() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6078j0();
            return this;
        }

        /* renamed from: u */
        public final C2025a mo12118u() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6074f0();
            return this;
        }

        /* renamed from: v */
        public final C2025a mo12119v(double d) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6079y(d);
            return this;
        }

        /* renamed from: w */
        public final C2025a mo12120w(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6080z(j);
            return this;
        }

        /* renamed from: x */
        public final C2025a mo12121x(C2025a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6071V((C2024v0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: y */
        public final C2025a mo12122y(Iterable<? extends C2024v0> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6064H(iterable);
            return this;
        }

        /* renamed from: z */
        public final C2025a mo12123z(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C2024v0) this.f3567b).m6065J(str);
            return this;
        }
    }

    static {
        C2024v0 v0Var = new C2024v0();
        zzj = v0Var;
        C1889m4.m5467r(C2024v0.class, v0Var);
    }

    private C2024v0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m6064H(Iterable<? extends C2024v0> iterable) {
        m6077i0();
        C2044w2.m6256g(iterable, this.zzi);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m6065J(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public final void m6068P(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public final void m6071V(C2024v0 v0Var) {
        v0Var.getClass();
        m6077i0();
        this.zzi.add(v0Var);
    }

    /* renamed from: d0 */
    public static C2025a m6072d0() {
        return (C2025a) zzj.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m6074f0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m6075g0() {
        this.zzc &= -5;
        this.zzf = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m6076h0() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    /* renamed from: i0 */
    private final void m6077i0() {
        C1999t4<C2024v0> t4Var = this.zzi;
        if (!t4Var.mo12091C()) {
            this.zzi = C1889m4.m5463m(t4Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m6078j0() {
        this.zzi = C1889m4.m5471x();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m6079y(double d) {
        this.zzc |= 16;
        this.zzh = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m6080z(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* renamed from: K */
    public final boolean mo12103K() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: L */
    public final String mo12104L() {
        return this.zzd;
    }

    /* renamed from: R */
    public final boolean mo12105R() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: T */
    public final String mo12106T() {
        return this.zze;
    }

    /* renamed from: W */
    public final boolean mo12107W() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: X */
    public final long mo12108X() {
        return this.zzf;
    }

    /* renamed from: Y */
    public final boolean mo12109Y() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: Z */
    public final double mo12110Z() {
        return this.zzh;
    }

    /* renamed from: b0 */
    public final List<C2024v0> mo12111b0() {
        return this.zzi;
    }

    /* renamed from: c0 */
    public final int mo12112c0() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        Class<C2024v0> cls = C2024v0.class;
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C2024v0();
            case 2:
                return new C2025a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                C1813h6<C2024v0> h6Var = zzk;
                if (h6Var == null) {
                    synchronized (cls) {
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
