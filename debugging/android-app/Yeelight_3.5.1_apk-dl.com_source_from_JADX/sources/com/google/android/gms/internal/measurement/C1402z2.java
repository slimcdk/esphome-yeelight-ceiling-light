package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
public final class C1402z2 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1402z2 zza;
    private int zze;
    private C1185l3 zzf;
    private C1073e3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C1402z2 z2Var = new C1402z2();
        zza = z2Var;
        C1174k8.m2154v(C1402z2.class, z2Var);
    }

    private C1402z2() {
    }

    /* renamed from: D */
    static /* synthetic */ void m3377D(C1402z2 z2Var, String str) {
        z2Var.zze |= 8;
        z2Var.zzi = str;
    }

    /* renamed from: y */
    public static C1402z2 m3379y() {
        return zza;
    }

    /* renamed from: A */
    public final C1185l3 mo13513A() {
        C1185l3 l3Var = this.zzf;
        return l3Var == null ? C1185l3.m2192z() : l3Var;
    }

    /* renamed from: C */
    public final String mo13514C() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean mo13515E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean mo13516F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo13517G() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo13518H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final boolean mo13519I() {
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
            return C1174k8.m2153u(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1402z2();
        } else {
            if (i2 == 4) {
                return new C1387y2((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final C1073e3 mo13520z() {
        C1073e3 e3Var = this.zzg;
        return e3Var == null ? C1073e3.m1874y() : e3Var;
    }
}
