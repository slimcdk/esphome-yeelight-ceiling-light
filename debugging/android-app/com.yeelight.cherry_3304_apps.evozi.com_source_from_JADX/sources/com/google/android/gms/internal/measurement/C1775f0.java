package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f0 */
public final class C1775f0 extends C1889m4<C1775f0, C1776a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1775f0 zzl;
    private static volatile C1813h6<C1775f0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private C1999t4<C1790g0> zzf = C1889m4.m5471x();
    private boolean zzg;
    private C1805h0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* renamed from: com.google.android.gms.internal.measurement.f0$a */
    public static final class C1776a extends C1889m4.C1891b<C1775f0, C1776a> implements C2094z5 {
        private C1776a() {
            super(C1775f0.zzl);
        }

        /* synthetic */ C1776a(C1852k0 k0Var) {
            this();
        }

        /* renamed from: u */
        public final C1776a mo11631u(int i, C1790g0 g0Var) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1775f0) this.f3567b).m5053z(i, g0Var);
            return this;
        }

        /* renamed from: v */
        public final C1776a mo11632v(String str) {
            if (this.f3568c) {
                mo11858r();
                this.f3568c = false;
            }
            ((C1775f0) this.f3567b).m5050D(str);
            return this;
        }

        /* renamed from: w */
        public final C1790g0 mo11633w(int i) {
            return ((C1775f0) this.f3567b).mo11630y(i);
        }

        /* renamed from: x */
        public final String mo11634x() {
            return ((C1775f0) this.f3567b).mo11621G();
        }

        /* renamed from: y */
        public final int mo11635y() {
            return ((C1775f0) this.f3567b).mo11623J();
        }
    }

    static {
        C1775f0 f0Var = new C1775f0();
        zzl = f0Var;
        C1889m4.m5467r(C1775f0.class, f0Var);
    }

    private C1775f0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m5050D(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* renamed from: R */
    public static C1776a m5051R() {
        return (C1776a) zzl.mo11848t();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m5053z(int i, C1790g0 g0Var) {
        g0Var.getClass();
        C1999t4<C1790g0> t4Var = this.zzf;
        if (!t4Var.mo12091C()) {
            this.zzf = C1889m4.m5463m(t4Var);
        }
        this.zzf.set(i, g0Var);
    }

    /* renamed from: E */
    public final boolean mo11619E() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: F */
    public final int mo11620F() {
        return this.zzd;
    }

    /* renamed from: G */
    public final String mo11621G() {
        return this.zze;
    }

    /* renamed from: H */
    public final List<C1790g0> mo11622H() {
        return this.zzf;
    }

    /* renamed from: J */
    public final int mo11623J() {
        return this.zzf.size();
    }

    /* renamed from: K */
    public final boolean mo11624K() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: L */
    public final C1805h0 mo11625L() {
        C1805h0 h0Var = this.zzh;
        return h0Var == null ? C1805h0.m5167K() : h0Var;
    }

    /* renamed from: N */
    public final boolean mo11626N() {
        return this.zzi;
    }

    /* renamed from: O */
    public final boolean mo11627O() {
        return this.zzj;
    }

    /* renamed from: P */
    public final boolean mo11628P() {
        return (this.zzc & 64) != 0;
    }

    /* renamed from: Q */
    public final boolean mo11629Q() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1775f0();
            case 2:
                return new C1776a((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C1790g0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                C1813h6<C1775f0> h6Var = zzm;
                if (h6Var == null) {
                    synchronized (C1775f0.class) {
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
    public final C1790g0 mo11630y(int i) {
        return this.zzf.get(i);
    }
}
