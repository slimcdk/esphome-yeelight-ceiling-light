package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1889m4;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
public final class C1920o0 extends C1889m4<C1920o0, C1921a> implements C2094z5 {
    /* access modifiers changed from: private */
    public static final C1920o0 zzf;
    private static volatile C1813h6<C1920o0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.measurement.o0$a */
    public static final class C1921a extends C1889m4.C1891b<C1920o0, C1921a> implements C2094z5 {
        private C1921a() {
            super(C1920o0.zzf);
        }

        /* synthetic */ C1921a(C1949q0 q0Var) {
            this();
        }
    }

    static {
        C1920o0 o0Var = new C1920o0();
        zzf = o0Var;
        C1889m4.m5467r(C1920o0.class, o0Var);
    }

    private C1920o0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final Object mo11417o(int i, Object obj, Object obj2) {
        switch (C1949q0.f3683a[i - 1]) {
            case 1:
                return new C1920o0();
            case 2:
                return new C1921a((C1949q0) null);
            case 3:
                return C1889m4.m5465p(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                C1813h6<C1920o0> h6Var = zzg;
                if (h6Var == null) {
                    synchronized (C1920o0.class) {
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
    public final String mo11890y() {
        return this.zzd;
    }

    /* renamed from: z */
    public final String mo11891z() {
        return this.zze;
    }
}
