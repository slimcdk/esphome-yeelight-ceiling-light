package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.r3 */
public final class C1503r3 extends C1480n0<C1503r3, C1468k3> implements C1491p1 {
    /* access modifiers changed from: private */
    public static final C1503r3 zzh;
    private int zzb;
    private String zze = "";
    private C1498q3 zzf;
    private byte zzg = 2;

    static {
        C1503r3 r3Var = new C1503r3();
        zzh = r3Var;
        C1480n0.m3620n(C1503r3.class, r3Var);
    }

    private C1503r3() {
    }

    /* renamed from: B */
    static /* synthetic */ void m3741B(C1503r3 r3Var, String str) {
        str.getClass();
        r3Var.zzb |= 1;
        r3Var.zze = str;
    }

    /* renamed from: C */
    static /* synthetic */ void m3742C(C1503r3 r3Var, C1498q3 q3Var) {
        q3Var.getClass();
        r3Var.zzf = q3Var;
        r3Var.zzb |= 2;
    }

    /* renamed from: y */
    public static C1468k3 m3743y() {
        return (C1468k3) zzh.mo13718k();
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
            return C1480n0.m3621o(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C1503r3();
        } else {
            if (i2 == 4) {
                return new C1468k3((C1458i3) null);
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
    public final String mo13790w() {
        return this.zze;
    }

    /* renamed from: x */
    public final C1498q3 mo13791x() {
        C1498q3 q3Var = this.zzf;
        return q3Var == null ? C1498q3.m3735z() : q3Var;
    }
}
