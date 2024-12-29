package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C2024v0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t0 */
public final class C1994t0 extends C1889m4<C1994t0, C1995a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1994t0 zzi;
    private static volatile C1813h6<C1994t0> zzj;
    private int zzc;
    private C1999t4<C2024v0> zzd = C1889m4.m5471x();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* renamed from: com.google.android.gms.internal.measurement.t0$a */
    public static final class C1995a extends C1889m4.C1891b<C1994t0, C1995a> implements C2094z5 {
        private C1995a() {
            super(C1994t0.zzi);
        }

        /* synthetic */ C1995a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: A */
        public final C1995a mo12074A(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5970O(str);
            return this;
        }

        /* renamed from: B */
        public final C2024v0 mo12075B(int i) {
            return ((C1994t0) this.f3567b).mo12072y(i);
        }

        /* renamed from: D */
        public final List<C2024v0> mo12076D() {
            return Collections.unmodifiableList(((C1994t0) this.f3567b).mo12073z());
        }

        /* renamed from: E */
        public final int mo12077E() {
            return ((C1994t0) this.f3567b).mo12064P();
        }

        /* renamed from: F */
        public final C1995a mo12078F(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5971Q(i);
            return this;
        }

        /* renamed from: G */
        public final C1995a mo12079G(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5972R(j);
            return this;
        }

        /* renamed from: N */
        public final C1995a mo12080N() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5977f0();
            return this;
        }

        /* renamed from: O */
        public final String mo12081O() {
            return ((C1994t0) this.f3567b).mo12065U();
        }

        /* renamed from: P */
        public final long mo12082P() {
            return ((C1994t0) this.f3567b).mo12067W();
        }

        /* renamed from: U */
        public final long mo12083U() {
            return ((C1994t0) this.f3567b).mo12069Y();
        }

        /* renamed from: u */
        public final C1995a mo12084u(int i, C2024v0.C2025a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5959A(i, (C2024v0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: v */
        public final C1995a mo12085v(int i, C2024v0 v0Var) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5959A(i, v0Var);
            return this;
        }

        /* renamed from: w */
        public final C1995a mo12086w(long j) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5960B(j);
            return this;
        }

        /* renamed from: x */
        public final C1995a mo12087x(C2024v0.C2025a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5968L((C2024v0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: y */
        public final C1995a mo12088y(C2024v0 v0Var) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5968L(v0Var);
            return this;
        }

        /* renamed from: z */
        public final C1995a mo12089z(Iterable<? extends C2024v0> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1994t0) this.f3567b).m5969N(iterable);
            return this;
        }
    }

    static {
        C1994t0 t0Var = new C1994t0();
        zzi = t0Var;
        C1889m4.m5467r(C1994t0.class, t0Var);
    }

    private C1994t0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m5959A(int i, C2024v0 v0Var) {
        v0Var.getClass();
        m5976e0();
        this.zzd.set(i, v0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m5960B(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m5968L(C2024v0 v0Var) {
        v0Var.getClass();
        m5976e0();
        this.zzd.add(v0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m5969N(Iterable<? extends C2024v0> iterable) {
        m5976e0();
        C2044w2.m6256g(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m5970O(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m5971Q(int i) {
        m5976e0();
        this.zzd.remove(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m5972R(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* renamed from: c0 */
    public static C1995a m5974c0() {
        return (C1995a) zzi.mo11848t();
    }

    /* renamed from: e0 */
    private final void m5976e0() {
        C1999t4<C2024v0> t4Var = this.zzd;
        if (!t4Var.mo12091C()) {
            this.zzd = C1889m4.m5463m(t4Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m5977f0() {
        this.zzd = C1889m4.m5471x();
    }

    /* renamed from: P */
    public final int mo12064P() {
        return this.zzd.size();
    }

    /* renamed from: U */
    public final String mo12065U() {
        return this.zze;
    }

    /* renamed from: V */
    public final boolean mo12066V() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: W */
    public final long mo12067W() {
        return this.zzf;
    }

    /* renamed from: X */
    public final boolean mo12068X() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: Y */
    public final long mo12069Y() {
        return this.zzg;
    }

    /* renamed from: Z */
    public final boolean mo12070Z() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: b0 */
    public final int mo12071b0() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C1994t0();
            case 2:
                return new C1995a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", C2024v0.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C1813h6<C1994t0> h6Var = zzj;
                if (h6Var == null) {
                    synchronized (C1994t0.class) {
                        h6Var = zzj;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzi);
                            zzj = h6Var;
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
    public final C2024v0 mo12072y(int i) {
        return this.zzd.get(i);
    }

    /* renamed from: z */
    public final List<C2024v0> mo12073z() {
        return this.zzd;
    }
}
