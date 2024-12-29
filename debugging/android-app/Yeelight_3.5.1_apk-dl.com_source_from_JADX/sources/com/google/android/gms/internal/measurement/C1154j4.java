package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
public final class C1154j4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1154j4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        C1154j4 j4Var = new C1154j4();
        zza = j4Var;
        C1174k8.m2154v(C1154j4.class, j4Var);
    }

    private C1154j4() {
    }

    /* renamed from: A */
    static /* synthetic */ void m2113A(C1154j4 j4Var, long j) {
        j4Var.zze |= 2;
        j4Var.zzg = j;
    }

    /* renamed from: x */
    public static C1138i4 m2114x() {
        return (C1138i4) zza.mo12915k();
    }

    /* renamed from: z */
    static /* synthetic */ void m2116z(C1154j4 j4Var, String str) {
        str.getClass();
        j4Var.zze |= 1;
        j4Var.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C1154j4();
        } else {
            if (i2 == 4) {
                return new C1138i4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
