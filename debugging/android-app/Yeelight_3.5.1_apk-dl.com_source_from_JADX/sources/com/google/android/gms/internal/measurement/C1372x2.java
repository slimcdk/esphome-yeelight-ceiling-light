package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
public final class C1372x2 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1372x2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1254p8 zzh = C1174k8.m2150r();
    private boolean zzi;
    private C1073e3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C1372x2 x2Var = new C1372x2();
        zza = x2Var;
        C1174k8.m2154v(C1372x2.class, x2Var);
    }

    private C1372x2() {
    }

    /* renamed from: G */
    static /* synthetic */ void m3193G(C1372x2 x2Var, String str) {
        x2Var.zze |= 2;
        x2Var.zzg = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m3194H(C1372x2 x2Var, int i, C1402z2 z2Var) {
        z2Var.getClass();
        C1254p8 p8Var = x2Var.zzh;
        if (!p8Var.mo13072E()) {
            x2Var.zzh = C1174k8.m2151s(p8Var);
        }
        x2Var.zzh.set(i, z2Var);
    }

    /* renamed from: z */
    public static C1357w2 m3195z() {
        return (C1357w2) zza.mo12915k();
    }

    /* renamed from: C */
    public final C1402z2 mo13470C(int i) {
        return (C1402z2) this.zzh.get(i);
    }

    /* renamed from: D */
    public final C1073e3 mo13471D() {
        C1073e3 e3Var = this.zzj;
        return e3Var == null ? C1073e3.m1874y() : e3Var;
    }

    /* renamed from: E */
    public final String mo13472E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List mo13473F() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo13474I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final boolean mo13475J() {
        return this.zzl;
    }

    /* renamed from: K */
    public final boolean mo13476K() {
        return this.zzm;
    }

    /* renamed from: L */
    public final boolean mo13477L() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo13478M() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: N */
    public final boolean mo13479N() {
        return (this.zze & 64) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1402z2.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C1372x2();
        } else {
            if (i2 == 4) {
                return new C1357w2((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13480x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int mo13481y() {
        return this.zzf;
    }
}
