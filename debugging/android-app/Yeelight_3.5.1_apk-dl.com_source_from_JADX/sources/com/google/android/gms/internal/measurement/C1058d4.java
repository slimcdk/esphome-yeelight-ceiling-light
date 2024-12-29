package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
public final class C1058d4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1058d4 zza;
    private int zze;
    private int zzf;
    private C1374x4 zzg;
    private C1374x4 zzh;
    private boolean zzi;

    static {
        C1058d4 d4Var = new C1058d4();
        zza = d4Var;
        C1174k8.m2154v(C1058d4.class, d4Var);
    }

    private C1058d4() {
    }

    /* renamed from: D */
    static /* synthetic */ void m1796D(C1058d4 d4Var, int i) {
        d4Var.zze |= 1;
        d4Var.zzf = i;
    }

    /* renamed from: E */
    static /* synthetic */ void m1797E(C1058d4 d4Var, C1374x4 x4Var) {
        x4Var.getClass();
        d4Var.zzg = x4Var;
        d4Var.zze |= 2;
    }

    /* renamed from: F */
    static /* synthetic */ void m1798F(C1058d4 d4Var, C1374x4 x4Var) {
        d4Var.zzh = x4Var;
        d4Var.zze |= 4;
    }

    /* renamed from: G */
    static /* synthetic */ void m1799G(C1058d4 d4Var, boolean z) {
        d4Var.zze |= 8;
        d4Var.zzi = z;
    }

    /* renamed from: y */
    public static C1042c4 m1800y() {
        return (C1042c4) zza.mo12915k();
    }

    /* renamed from: A */
    public final C1374x4 mo12642A() {
        C1374x4 x4Var = this.zzg;
        return x4Var == null ? C1374x4.m3215F() : x4Var;
    }

    /* renamed from: C */
    public final C1374x4 mo12643C() {
        C1374x4 x4Var = this.zzh;
        return x4Var == null ? C1374x4.m3215F() : x4Var;
    }

    /* renamed from: H */
    public final boolean mo12644H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo12645I() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: J */
    public final boolean mo12646J() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: K */
    public final boolean mo12647K() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1058d4();
        } else {
            if (i2 == 4) {
                return new C1042c4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12648x() {
        return this.zzf;
    }
}
