package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
public final class C1105g3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1105g3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1402z2 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C1105g3 g3Var = new C1105g3();
        zza = g3Var;
        C1174k8.m2154v(C1105g3.class, g3Var);
    }

    private C1105g3() {
    }

    /* renamed from: D */
    static /* synthetic */ void m1972D(C1105g3 g3Var, String str) {
        g3Var.zze |= 2;
        g3Var.zzg = str;
    }

    /* renamed from: z */
    public static C1089f3 m1973z() {
        return (C1089f3) zza.mo12915k();
    }

    /* renamed from: C */
    public final String mo12801C() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo12802E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final boolean mo12803F() {
        return this.zzj;
    }

    /* renamed from: G */
    public final boolean mo12804G() {
        return this.zzk;
    }

    /* renamed from: H */
    public final boolean mo12805H() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: I */
    public final boolean mo12806I() {
        return (this.zze & 32) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C1105g3();
        } else {
            if (i2 == 4) {
                return new C1089f3((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12807x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final C1402z2 mo12808y() {
        C1402z2 z2Var = this.zzh;
        return z2Var == null ? C1402z2.m3379y() : z2Var;
    }
}
