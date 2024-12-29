package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
public final class C1027b5 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1027b5 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C1027b5 b5Var = new C1027b5();
        zza = b5Var;
        C1174k8.m2154v(C1027b5.class, b5Var);
    }

    private C1027b5() {
    }

    /* renamed from: A */
    public static C1011a5 m1714A() {
        return (C1011a5) zza.mo12915k();
    }

    /* renamed from: F */
    static /* synthetic */ void m1716F(C1027b5 b5Var, long j) {
        b5Var.zze |= 1;
        b5Var.zzf = j;
    }

    /* renamed from: G */
    static /* synthetic */ void m1717G(C1027b5 b5Var, String str) {
        str.getClass();
        b5Var.zze |= 2;
        b5Var.zzg = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m1718H(C1027b5 b5Var, String str) {
        str.getClass();
        b5Var.zze |= 4;
        b5Var.zzh = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m1719I(C1027b5 b5Var) {
        b5Var.zze &= -5;
        b5Var.zzh = zza.zzh;
    }

    /* renamed from: J */
    static /* synthetic */ void m1720J(C1027b5 b5Var, long j) {
        b5Var.zze |= 8;
        b5Var.zzi = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m1721K(C1027b5 b5Var) {
        b5Var.zze &= -9;
        b5Var.zzi = 0;
    }

    /* renamed from: L */
    static /* synthetic */ void m1722L(C1027b5 b5Var, double d) {
        b5Var.zze |= 32;
        b5Var.zzk = d;
    }

    /* renamed from: M */
    static /* synthetic */ void m1723M(C1027b5 b5Var) {
        b5Var.zze &= -33;
        b5Var.zzk = 0.0d;
    }

    /* renamed from: D */
    public final String mo12570D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo12571E() {
        return this.zzh;
    }

    /* renamed from: N */
    public final boolean mo12572N() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: O */
    public final boolean mo12573O() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: P */
    public final boolean mo12574P() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: Q */
    public final boolean mo12575Q() {
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
            return C1174k8.m2153u(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C1027b5();
        } else {
            if (i2 == 4) {
                return new C1011a5((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo12576x() {
        return this.zzk;
    }

    /* renamed from: y */
    public final long mo12577y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long mo12578z() {
        return this.zzf;
    }
}
