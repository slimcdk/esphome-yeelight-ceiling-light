package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
public final class C1186l4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1186l4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public C1254p8 zzk = C1174k8.m2150r();

    static {
        C1186l4 l4Var = new C1186l4();
        zza = l4Var;
        C1174k8.m2154v(C1186l4.class, l4Var);
    }

    private C1186l4() {
    }

    /* renamed from: C */
    public static C1170k4 m2202C() {
        return (C1170k4) zza.mo12915k();
    }

    /* renamed from: H */
    static /* synthetic */ void m2204H(C1186l4 l4Var, String str) {
        str.getClass();
        l4Var.zze |= 1;
        l4Var.zzf = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m2205I(C1186l4 l4Var, String str) {
        str.getClass();
        l4Var.zze |= 2;
        l4Var.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m2206J(C1186l4 l4Var) {
        l4Var.zze &= -3;
        l4Var.zzg = zza.zzg;
    }

    /* renamed from: K */
    static /* synthetic */ void m2207K(C1186l4 l4Var, long j) {
        l4Var.zze |= 4;
        l4Var.zzh = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m2208L(C1186l4 l4Var) {
        l4Var.zze &= -5;
        l4Var.zzh = 0;
    }

    /* renamed from: M */
    static /* synthetic */ void m2209M(C1186l4 l4Var, double d) {
        l4Var.zze |= 16;
        l4Var.zzj = d;
    }

    /* renamed from: N */
    static /* synthetic */ void m2210N(C1186l4 l4Var) {
        l4Var.zze &= -17;
        l4Var.zzj = 0.0d;
    }

    /* renamed from: O */
    static /* synthetic */ void m2211O(C1186l4 l4Var, C1186l4 l4Var2) {
        l4Var2.getClass();
        l4Var.m2214W();
        l4Var.zzk.add(l4Var2);
    }

    /* renamed from: P */
    static /* synthetic */ void m2212P(C1186l4 l4Var, Iterable iterable) {
        l4Var.m2214W();
        C1391y6.m3298h(iterable, l4Var.zzk);
    }

    /* renamed from: W */
    private final void m2214W() {
        C1254p8 p8Var = this.zzk;
        if (!p8Var.mo13072E()) {
            this.zzk = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: A */
    public final long mo12952A() {
        return this.zzh;
    }

    /* renamed from: E */
    public final String mo12953E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final String mo12954F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final List mo12955G() {
        return this.zzk;
    }

    /* renamed from: R */
    public final boolean mo12956R() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: S */
    public final boolean mo12957S() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo12958T() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: U */
    public final boolean mo12959U() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: V */
    public final boolean mo12960V() {
        return (this.zze & 2) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1186l4.class});
        } else if (i2 == 3) {
            return new C1186l4();
        } else {
            if (i2 == 4) {
                return new C1170k4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo12961x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final float mo12962y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final int mo12963z() {
        return this.zzk.size();
    }
}
