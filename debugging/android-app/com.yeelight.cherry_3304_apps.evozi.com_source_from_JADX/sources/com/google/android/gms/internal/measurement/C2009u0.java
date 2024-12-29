package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.u0 */
public final class C2009u0 extends C1889m4<C2009u0, C2010a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C2009u0 zzf;
    private static volatile C1813h6<C2009u0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    /* renamed from: com.google.android.gms.internal.measurement.u0$a */
    public static final class C2010a extends C1889m4.C1891b<C2009u0, C2010a> implements C2094z5 {
        private C2010a() {
            super(C2009u0.zzf);
        }

        /* synthetic */ C2010a(C1733c1 c1Var) {
            this();
        }
    }

    static {
        C2009u0 u0Var = new C2009u0();
        zzf = u0Var;
        C1889m4.m5467r(C2009u0.class, u0Var);
    }

    private C2009u0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1733c1.f3288a[i - 1]) {
            case 1:
                return new C2009u0();
            case 2:
                return new C2010a((C1733c1) null);
            case 3:
                return C1889m4.m5465p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C1813h6<C2009u0> h6Var = zzg;
                if (h6Var == null) {
                    synchronized (C2009u0.class) {
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
