package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
public final class C1700a1 extends C1889m4<C1700a1, C1701a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1700a1 zzf;
    private static volatile C1813h6<C1700a1> zzg;
    private int zzc;
    private int zzd;
    private C2014u4 zze = C1889m4.m5470w();

    /* renamed from: com.google.android.gms.internal.measurement.a1$a */
    public static final class C1701a extends C1889m4.C1891b<C1700a1, C1701a> implements C2094z5 {
        private C1701a() {
            super(C1700a1.zzf);
        }

        /* synthetic */ C1701a(C1733c1 c1Var) {
            this();
        }

        /* renamed from: u */
        public final C1701a mo11419u(int i) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1700a1) this.f3567b).m4697F(i);
            return this;
        }

        /* renamed from: v */
        public final C1701a mo11420v(Iterable<? extends Long> iterable) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1700a1) this.f3567b).m4696B(iterable);
            return this;
        }
    }

    static {
        C1700a1 a1Var = new C1700a1();
        zzf = a1Var;
        C1889m4.m5467r(C1700a1.class, a1Var);
    }

    private C1700a1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m4696B(Iterable<? extends Long> iterable) {
        C2014u4 u4Var = this.zze;
        if (!u4Var.mo12091C()) {
            this.zze = C1889m4.m5464n(u4Var);
        }
        C2044w2.m6256g(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m4697F(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* renamed from: J */
    public static C1701a m4698J() {
        return (C1701a) zzf.mo11848t();
    }

    /* renamed from: D */
    public final boolean mo11413D() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: E */
    public final int mo11414E() {
        return this.zzd;
    }

    /* renamed from: G */
    public final List<Long> mo11415G() {
        return this.zze;
    }

    /* renamed from: H */
    public final int mo11416H() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C1700a1();
            case 2:
                return new C1701a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C1813h6<C1700a1> h6Var = zzg;
                if (h6Var == null) {
                    synchronized (C1700a1.class) {
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

    /* renamed from: y */
    public final long mo11418y(int i) {
        return this.zze.mo11803b(i);
    }
}
