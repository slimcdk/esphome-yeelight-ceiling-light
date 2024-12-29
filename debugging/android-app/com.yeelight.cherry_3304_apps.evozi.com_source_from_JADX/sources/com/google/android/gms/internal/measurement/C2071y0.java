package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.y0 */
public final class C2071y0 extends C1889m4<C2071y0, C2073b> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C2071y0 zzf;
    private static volatile C1813h6<C2071y0> zzg;
    private int zzc;
    private int zzd = 1;
    private C1999t4<C2009u0> zze = C1889m4.m5471x();

    /* renamed from: com.google.android.gms.internal.measurement.y0$a */
    public enum C2072a implements C1953q4 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: a */
        private final int f3822a;

        private C2072a(int i) {
            this.f3822a = i;
        }

        /* renamed from: a */
        public static C2072a m6590a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        /* renamed from: b */
        public static C1984s4 m6591b() {
            return C1747d1.f3299a;
        }

        /* renamed from: C */
        public final int mo11694C() {
            return this.f3822a;
        }

        public final String toString() {
            return "<" + C2072a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3822a + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.y0$b */
    public static final class C2073b extends C1889m4.C1891b<C2071y0, C2073b> implements C2094z5 {
        private C2073b() {
            super(C2071y0.zzf);
        }

        /* synthetic */ C2073b(C1733c1 c1Var) {
            this();
        }
    }

    static {
        C2071y0 y0Var = new C2071y0();
        zzf = y0Var;
        C1889m4.m5467r(C2071y0.class, y0Var);
    }

    private C2071y0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C2071y0();
            case 2:
                return new C2073b((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", C2072a.m6591b(), "zze", C2009u0.class});
            case 4:
                return zzf;
            case 5:
                C1813h6<C2071y0> h6Var = zzg;
                if (h6Var == null) {
                    synchronized (C2071y0.class) {
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
}
