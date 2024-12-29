package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
public final class C1026b4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1026b4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        C1026b4 b4Var = new C1026b4();
        zza = b4Var;
        C1174k8.m2154v(C1026b4.class, b4Var);
    }

    private C1026b4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C1026b4();
        } else {
            if (i2 == 4) {
                return new C1010a4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
