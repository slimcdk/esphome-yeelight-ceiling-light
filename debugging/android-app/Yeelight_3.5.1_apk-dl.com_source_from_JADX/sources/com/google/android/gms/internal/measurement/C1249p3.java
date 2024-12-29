package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p3 */
public final class C1249p3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1249p3 zza;
    private int zze;
    private String zzf = "";
    private C1254p8 zzg = C1174k8.m2150r();
    private boolean zzh;

    static {
        C1249p3 p3Var = new C1249p3();
        zza = p3Var;
        C1174k8.m2154v(C1249p3.class, p3Var);
    }

    private C1249p3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C1343v3.class, "zzh"});
        } else if (i2 == 3) {
            return new C1249p3();
        } else {
            if (i2 == 4) {
                return new C1217n3((C1201m3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo13060y() {
        return this.zzf;
    }
}
