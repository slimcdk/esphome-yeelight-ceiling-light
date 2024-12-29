package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
public final class C1218n4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1218n4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C1026b4 zzh;

    static {
        C1218n4 n4Var = new C1218n4();
        zza = n4Var;
        C1174k8.m2154v(C1218n4.class, n4Var);
    }

    private C1218n4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C1218n4();
        } else {
            if (i2 == 4) {
                return new C1202m4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
