package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
public final class C1090f4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1090f4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C1090f4 f4Var = new C1090f4();
        zza = f4Var;
        C1174k8.m2154v(C1090f4.class, f4Var);
    }

    private C1090f4() {
    }

    /* renamed from: C */
    static /* synthetic */ void m1940C(C1090f4 f4Var, int i) {
        f4Var.zze |= 1;
        f4Var.zzf = i;
    }

    /* renamed from: D */
    static /* synthetic */ void m1941D(C1090f4 f4Var, long j) {
        f4Var.zze |= 2;
        f4Var.zzg = j;
    }

    /* renamed from: z */
    public static C1074e4 m1942z() {
        return (C1074e4) zza.mo12915k();
    }

    /* renamed from: E */
    public final boolean mo12783E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean mo12784F() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C1090f4();
        } else {
            if (i2 == 4) {
                return new C1074e4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12785x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long mo12786y() {
        return this.zzg;
    }
}
