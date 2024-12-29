package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
public final class C1342v2 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1342v2 zza;
    private int zze;
    private int zzf;
    private C1254p8 zzg = C1174k8.m2150r();
    private C1254p8 zzh = C1174k8.m2150r();
    private boolean zzi;
    private boolean zzj;

    static {
        C1342v2 v2Var = new C1342v2();
        zza = v2Var;
        C1174k8.m2154v(C1342v2.class, v2Var);
    }

    private C1342v2() {
    }

    /* renamed from: G */
    static /* synthetic */ void m3095G(C1342v2 v2Var, int i, C1105g3 g3Var) {
        g3Var.getClass();
        C1254p8 p8Var = v2Var.zzg;
        if (!p8Var.mo13072E()) {
            v2Var.zzg = C1174k8.m2151s(p8Var);
        }
        v2Var.zzg.set(i, g3Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m3096H(C1342v2 v2Var, int i, C1372x2 x2Var) {
        x2Var.getClass();
        C1254p8 p8Var = v2Var.zzh;
        if (!p8Var.mo13072E()) {
            v2Var.zzh = C1174k8.m2151s(p8Var);
        }
        v2Var.zzh.set(i, x2Var);
    }

    /* renamed from: C */
    public final C1372x2 mo13420C(int i) {
        return (C1372x2) this.zzh.get(i);
    }

    /* renamed from: D */
    public final C1105g3 mo13421D(int i) {
        return (C1105g3) this.zzg.get(i);
    }

    /* renamed from: E */
    public final List mo13422E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final List mo13423F() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo13424I() {
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
            return C1174k8.m2153u(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C1105g3.class, "zzh", C1372x2.class, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C1342v2();
        } else {
            if (i2 == 4) {
                return new C1327u2((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13425x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final int mo13426y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int mo13427z() {
        return this.zzg.size();
    }
}
