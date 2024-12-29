package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1884m0;
import com.google.android.gms.internal.measurement.C1889m4;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
public final class C1905n0 extends C1889m4<C1905n0, C1906a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1905n0 zzl;
    private static volatile C1813h6<C1905n0> zzm;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private C1999t4<C1920o0> zzg = C1889m4.m5471x();
    private C1999t4<C1884m0> zzh = C1889m4.m5471x();
    private C1999t4<C1760e0> zzi = C1889m4.m5471x();
    private String zzj = "";
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.measurement.n0$a */
    public static final class C1906a extends C1889m4.C1891b<C1905n0, C1906a> implements C2094z5 {
        private C1906a() {
            super(C1905n0.zzl);
        }

        /* synthetic */ C1906a(C1949q0 q0Var) {
            this();
        }

        /* renamed from: u */
        public final int mo11884u() {
            return ((C1905n0) this.f3567b).mo11880J();
        }

        /* renamed from: v */
        public final C1884m0 mo11885v(int i) {
            return ((C1905n0) this.f3567b).mo11883y(i);
        }

        /* renamed from: w */
        public final C1906a mo11886w(int i, C1884m0.C1885a aVar) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1905n0) this.f3567b).m5564z(i, (C1884m0) ((C1889m4) aVar.mo11851I()));
            return this;
        }

        /* renamed from: x */
        public final List<C1760e0> mo11887x() {
            return Collections.unmodifiableList(((C1905n0) this.f3567b).mo11881K());
        }

        /* renamed from: y */
        public final C1906a mo11888y() {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1905n0) this.f3567b).m5563Q();
            return this;
        }
    }

    static {
        C1905n0 n0Var = new C1905n0();
        zzl = n0Var;
        C1889m4.m5467r(C1905n0.class, n0Var);
    }

    private C1905n0() {
    }

    /* renamed from: N */
    public static C1906a m5560N() {
        return (C1906a) zzl.mo11848t();
    }

    /* renamed from: O */
    public static C1905n0 m5561O() {
        return zzl;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m5563Q() {
        this.zzi = C1889m4.m5471x();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m5564z(int i, C1884m0 m0Var) {
        m0Var.getClass();
        C1999t4<C1884m0> t4Var = this.zzh;
        if (!t4Var.mo12091C()) {
            this.zzh = C1889m4.m5463m(t4Var);
        }
        this.zzh.set(i, m0Var);
    }

    /* renamed from: D */
    public final boolean mo11875D() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: E */
    public final long mo11876E() {
        return this.zzd;
    }

    /* renamed from: F */
    public final boolean mo11877F() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: G */
    public final String mo11878G() {
        return this.zze;
    }

    /* renamed from: H */
    public final List<C1920o0> mo11879H() {
        return this.zzg;
    }

    /* renamed from: J */
    public final int mo11880J() {
        return this.zzh.size();
    }

    /* renamed from: K */
    public final List<C1760e0> mo11881K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final boolean mo11882L() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1949q0.f3683a[i - 1]) {
            case 1:
                return new C1905n0();
            case 2:
                return new C1906a((C1949q0) null);
            case 3:
                return C1889m4.m5465p(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C1920o0.class, "zzh", C1884m0.class, "zzi", C1760e0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C1813h6<C1905n0> h6Var = zzm;
                if (h6Var == null) {
                    synchronized (C1905n0.class) {
                        h6Var = zzm;
                        if (h6Var == null) {
                            h6Var = new C1889m4.C1890a<>(zzl);
                            zzm = h6Var;
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
    public final C1884m0 mo11883y(int i) {
        return this.zzh.get(i);
    }
}
