package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e3 */
public final class C1073e3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1073e3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C1073e3 e3Var = new C1073e3();
        zza = e3Var;
        C1174k8.m2154v(C1073e3.class, e3Var);
    }

    private C1073e3() {
    }

    /* renamed from: y */
    public static C1073e3 m1874y() {
        return zza;
    }

    /* renamed from: A */
    public final String mo12730A() {
        return this.zzj;
    }

    /* renamed from: C */
    public final String mo12731C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean mo12732D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final boolean mo12733E() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: F */
    public final boolean mo12734F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo12735G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo12736H() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: I */
    public final boolean mo12737I() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: J */
    public final int mo12738J() {
        int a = C1057d3.m1795a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C1041c3.f1262a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C1073e3();
        } else {
            if (i2 == 4) {
                return new C1009a3((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final String mo12739z() {
        return this.zzh;
    }
}
