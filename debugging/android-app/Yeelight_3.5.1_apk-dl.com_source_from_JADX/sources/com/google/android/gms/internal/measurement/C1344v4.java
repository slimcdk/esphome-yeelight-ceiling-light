package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
public final class C1344v4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1344v4 zza;
    private int zze;
    private int zzf = 1;
    private C1254p8 zzg = C1174k8.m2150r();

    static {
        C1344v4 v4Var = new C1344v4();
        zza = v4Var;
        C1174k8.m2154v(C1344v4.class, v4Var);
    }

    private C1344v4() {
    }

    /* renamed from: x */
    public static C1314t4 m3108x() {
        return (C1314t4) zza.mo12915k();
    }

    /* renamed from: z */
    static /* synthetic */ void m3110z(C1344v4 v4Var, C1154j4 j4Var) {
        j4Var.getClass();
        C1254p8 p8Var = v4Var.zzg;
        if (!p8Var.mo13072E()) {
            v4Var.zzg = C1174k8.m2151s(p8Var);
        }
        v4Var.zzg.add(j4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C1329u4.f1661a, "zzg", C1154j4.class});
        } else if (i2 == 3) {
            return new C1344v4();
        } else {
            if (i2 == 4) {
                return new C1314t4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
