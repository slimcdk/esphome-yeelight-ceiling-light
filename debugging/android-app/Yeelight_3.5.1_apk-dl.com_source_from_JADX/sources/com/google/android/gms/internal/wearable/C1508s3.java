package com.google.android.gms.internal.wearable;

import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.s3 */
public final class C1508s3 extends C1480n0<C1508s3, C1463j3> implements C1491p1 {
    /* access modifiers changed from: private */
    public static final C1508s3 zzf;
    private C1515u0<C1503r3> zzb = C1480n0.m3625s();
    private byte zze = 2;

    static {
        C1508s3 s3Var = new C1508s3();
        zzf = s3Var;
        C1480n0.m3620n(C1508s3.class, s3Var);
    }

    private C1508s3() {
    }

    /* renamed from: B */
    static /* synthetic */ void m3795B(C1508s3 s3Var, Iterable iterable) {
        C1515u0<C1503r3> u0Var = s3Var.zzb;
        if (!u0Var.zza()) {
            s3Var.zzb = C1480n0.m3626t(u0Var);
        }
        C1439f.m3521i(iterable, s3Var.zzb);
    }

    /* renamed from: x */
    public static C1508s3 m3796x(byte[] bArr) {
        return (C1508s3) C1480n0.m3628v(zzf, bArr);
    }

    /* renamed from: y */
    public static C1463j3 m3797y() {
        return (C1463j3) zzf.mo13718k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo13717j(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        byte b = 1;
        if (i2 == 2) {
            return C1480n0.m3621o(zzf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", C1503r3.class});
        } else if (i2 == 3) {
            return new C1508s3();
        } else {
            if (i2 == 4) {
                return new C1463j3((C1458i3) null);
            }
            if (i2 == 5) {
                return zzf;
            }
            if (obj == null) {
                b = 0;
            }
            this.zze = b;
            return null;
        }
    }

    /* renamed from: w */
    public final List<C1503r3> mo13797w() {
        return this.zzb;
    }
}
