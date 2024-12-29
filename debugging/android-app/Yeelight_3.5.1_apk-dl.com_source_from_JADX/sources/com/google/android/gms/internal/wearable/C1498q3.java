package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.q3 */
public final class C1498q3 extends C1480n0<C1498q3, C1473l3> implements C1491p1 {
    /* access modifiers changed from: private */
    public static final C1498q3 zzh;
    private int zzb;
    private int zze = 1;
    private C1493p3 zzf;
    private byte zzg = 2;

    static {
        C1498q3 q3Var = new C1498q3();
        zzh = q3Var;
        C1480n0.m3620n(C1498q3.class, q3Var);
    }

    private C1498q3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m3732C(C1498q3 q3Var, zzr zzr) {
        q3Var.zze = zzr.zza();
        q3Var.zzb |= 1;
    }

    /* renamed from: D */
    static /* synthetic */ void m3733D(C1498q3 q3Var, C1493p3 p3Var) {
        p3Var.getClass();
        q3Var.zzf = p3Var;
        q3Var.zzb |= 2;
    }

    /* renamed from: y */
    public static C1473l3 m3734y() {
        return (C1473l3) zzh.mo13718k();
    }

    /* renamed from: z */
    public static C1498q3 m3735z() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo13717j(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b = 1;
        if (i2 == 2) {
            return C1480n0.m3621o(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", zzr.zzc(), "zzf"});
        } else if (i2 == 3) {
            return new C1498q3();
        } else {
            if (i2 == 4) {
                return new C1473l3((C1458i3) null);
            }
            if (i2 == 5) {
                return zzh;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzg = b;
            return null;
        }
    }

    /* renamed from: w */
    public final zzr mo13788w() {
        zzr zzb2 = zzr.zzb(this.zze);
        return zzb2 == null ? zzr.BYTE_ARRAY : zzb2;
    }

    /* renamed from: x */
    public final C1493p3 mo13789x() {
        C1493p3 p3Var = this.zzf;
        return p3Var == null ? C1493p3.m3697V() : p3Var;
    }
}
