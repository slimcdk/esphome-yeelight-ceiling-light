package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
public final class C1122h4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1122h4 zza;
    private int zze;
    /* access modifiers changed from: private */
    public C1254p8 zzf = C1174k8.m2150r();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C1122h4 h4Var = new C1122h4();
        zza = h4Var;
        C1174k8.m2154v(C1122h4.class, h4Var);
    }

    private C1122h4() {
    }

    /* renamed from: C */
    public static C1106g4 m2041C() {
        return (C1106g4) zza.mo12915k();
    }

    /* renamed from: H */
    static /* synthetic */ void m2043H(C1122h4 h4Var, int i, C1186l4 l4Var) {
        l4Var.getClass();
        h4Var.m2051S();
        h4Var.zzf.set(i, l4Var);
    }

    /* renamed from: I */
    static /* synthetic */ void m2044I(C1122h4 h4Var, C1186l4 l4Var) {
        l4Var.getClass();
        h4Var.m2051S();
        h4Var.zzf.add(l4Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m2045J(C1122h4 h4Var, Iterable iterable) {
        h4Var.m2051S();
        C1391y6.m3298h(iterable, h4Var.zzf);
    }

    /* renamed from: L */
    static /* synthetic */ void m2047L(C1122h4 h4Var, int i) {
        h4Var.m2051S();
        h4Var.zzf.remove(i);
    }

    /* renamed from: M */
    static /* synthetic */ void m2048M(C1122h4 h4Var, String str) {
        str.getClass();
        h4Var.zze |= 1;
        h4Var.zzg = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m2049N(C1122h4 h4Var, long j) {
        h4Var.zze |= 2;
        h4Var.zzh = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m2050O(C1122h4 h4Var, long j) {
        h4Var.zze |= 4;
        h4Var.zzi = j;
    }

    /* renamed from: S */
    private final void m2051S() {
        C1254p8 p8Var = this.zzf;
        if (!p8Var.mo13072E()) {
            this.zzf = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: A */
    public final long mo12852A() {
        return this.zzh;
    }

    /* renamed from: E */
    public final C1186l4 mo12853E(int i) {
        return (C1186l4) this.zzf.get(i);
    }

    /* renamed from: F */
    public final String mo12854F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final List mo12855G() {
        return this.zzf;
    }

    /* renamed from: P */
    public final boolean mo12856P() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: Q */
    public final boolean mo12857Q() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: R */
    public final boolean mo12858R() {
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
            return C1174k8.m2153u(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1186l4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C1122h4();
        } else {
            if (i2 == 4) {
                return new C1106g4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12859x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final int mo12860y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final long mo12861z() {
        return this.zzi;
    }
}
