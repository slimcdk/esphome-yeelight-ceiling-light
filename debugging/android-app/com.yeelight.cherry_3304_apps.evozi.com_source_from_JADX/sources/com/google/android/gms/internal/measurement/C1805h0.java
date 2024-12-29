package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.h0 */
public final class C1805h0 extends C1889m4<C1805h0, C1807b> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1805h0 zzi;
    private static volatile C1813h6<C1805h0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    /* renamed from: com.google.android.gms.internal.measurement.h0$a */
    public enum C1806a implements C1953q4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: a */
        private final int f3442a;

        private C1806a(int i) {
            this.f3442a = i;
        }

        /* renamed from: a */
        public static C1806a m5180a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        /* renamed from: b */
        public static C1984s4 m5181b() {
            return C1870l0.f3536a;
        }

        /* renamed from: C */
        public final int mo11694C() {
            return this.f3442a;
        }

        public final String toString() {
            return "<" + C1806a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3442a + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.h0$b */
    public static final class C1807b extends C1889m4.C1891b<C1805h0, C1807b> implements C2094z5 {
        private C1807b() {
            super(C1805h0.zzi);
        }

        /* synthetic */ C1807b(C1852k0 k0Var) {
            this();
        }
    }

    static {
        C1805h0 h0Var = new C1805h0();
        zzi = h0Var;
        C1889m4.m5467r(C1805h0.class, h0Var);
    }

    private C1805h0() {
    }

    /* renamed from: K */
    public static C1805h0 m5167K() {
        return zzi;
    }

    /* renamed from: A */
    public final boolean mo11684A() {
        return (this.zzc & 2) != 0;
    }

    /* renamed from: B */
    public final boolean mo11685B() {
        return this.zze;
    }

    /* renamed from: D */
    public final boolean mo11686D() {
        return (this.zzc & 4) != 0;
    }

    /* renamed from: E */
    public final String mo11687E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean mo11688F() {
        return (this.zzc & 8) != 0;
    }

    /* renamed from: G */
    public final String mo11689G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo11690H() {
        return (this.zzc & 16) != 0;
    }

    /* renamed from: J */
    public final String mo11691J() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1852k0.f3512a[i - 1]) {
            case 1:
                return new C1805h0();
            case 2:
                return new C1807b((C1852k0) null);
            case 3:
                return C1889m4.m5465p(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", C1806a.m5181b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                C1813h6<C1805h0> h6Var = zzj;
                if (h6Var == null) {
                    synchronized (C1805h0.class) {
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
    public final boolean mo11692y() {
        return (this.zzc & 1) != 0;
    }

    /* renamed from: z */
    public final C1806a mo11693z() {
        C1806a a = C1806a.m5180a(this.zzd);
        return a == null ? C1806a.UNKNOWN_COMPARISON_TYPE : a;
    }
}
