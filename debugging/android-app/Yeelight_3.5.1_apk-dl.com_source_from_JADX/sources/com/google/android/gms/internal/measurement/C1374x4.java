package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
public final class C1374x4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1374x4 zza;
    /* access modifiers changed from: private */
    public C1238o8 zze = C1174k8.m2148p();
    /* access modifiers changed from: private */
    public C1238o8 zzf = C1174k8.m2148p();
    /* access modifiers changed from: private */
    public C1254p8 zzg = C1174k8.m2150r();
    /* access modifiers changed from: private */
    public C1254p8 zzh = C1174k8.m2150r();

    static {
        C1374x4 x4Var = new C1374x4();
        zza = x4Var;
        C1174k8.m2154v(C1374x4.class, x4Var);
    }

    private C1374x4() {
    }

    /* renamed from: D */
    public static C1359w4 m3213D() {
        return (C1359w4) zza.mo12915k();
    }

    /* renamed from: F */
    public static C1374x4 m3215F() {
        return zza;
    }

    /* renamed from: L */
    static /* synthetic */ void m3216L(C1374x4 x4Var, Iterable iterable) {
        C1238o8 o8Var = x4Var.zze;
        if (!o8Var.mo13072E()) {
            x4Var.zze = C1174k8.m2149q(o8Var);
        }
        C1391y6.m3298h(iterable, x4Var.zze);
    }

    /* renamed from: N */
    static /* synthetic */ void m3218N(C1374x4 x4Var, Iterable iterable) {
        C1238o8 o8Var = x4Var.zzf;
        if (!o8Var.mo13072E()) {
            x4Var.zzf = C1174k8.m2149q(o8Var);
        }
        C1391y6.m3298h(iterable, x4Var.zzf);
    }

    /* renamed from: P */
    static /* synthetic */ void m3220P(C1374x4 x4Var, Iterable iterable) {
        x4Var.m3226V();
        C1391y6.m3298h(iterable, x4Var.zzg);
    }

    /* renamed from: R */
    static /* synthetic */ void m3222R(C1374x4 x4Var, int i) {
        x4Var.m3226V();
        x4Var.zzg.remove(i);
    }

    /* renamed from: S */
    static /* synthetic */ void m3223S(C1374x4 x4Var, Iterable iterable) {
        x4Var.m3227W();
        C1391y6.m3298h(iterable, x4Var.zzh);
    }

    /* renamed from: U */
    static /* synthetic */ void m3225U(C1374x4 x4Var, int i) {
        x4Var.m3227W();
        x4Var.zzh.remove(i);
    }

    /* renamed from: V */
    private final void m3226V() {
        C1254p8 p8Var = this.zzg;
        if (!p8Var.mo13072E()) {
            this.zzg = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: W */
    private final void m3227W() {
        C1254p8 p8Var = this.zzh;
        if (!p8Var.mo13072E()) {
            this.zzh = C1174k8.m2151s(p8Var);
        }
    }

    /* renamed from: A */
    public final int mo13484A() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final C1090f4 mo13485C(int i) {
        return (C1090f4) this.zzg.get(i);
    }

    /* renamed from: G */
    public final C1404z4 mo13486G(int i) {
        return (C1404z4) this.zzh.get(i);
    }

    /* renamed from: H */
    public final List mo13487H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo13488I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo13489J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final List mo13490K() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C1090f4.class, "zzh", C1404z4.class});
        } else if (i2 == 3) {
            return new C1374x4();
        } else {
            if (i2 == 4) {
                return new C1359w4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13491x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int mo13492y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final int mo13493z() {
        return this.zzh.size();
    }
}
