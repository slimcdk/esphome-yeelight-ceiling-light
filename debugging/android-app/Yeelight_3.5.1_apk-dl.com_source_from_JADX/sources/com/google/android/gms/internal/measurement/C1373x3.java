package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
public final class C1373x3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1373x3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C1373x3 x3Var = new C1373x3();
        zza = x3Var;
        C1174k8.m2154v(C1373x3.class, x3Var);
    }

    private C1373x3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C1373x3();
        } else {
            if (i2 == 4) {
                return new C1358w3((C1201m3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo13482y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String mo13483z() {
        return this.zzg;
    }
}
