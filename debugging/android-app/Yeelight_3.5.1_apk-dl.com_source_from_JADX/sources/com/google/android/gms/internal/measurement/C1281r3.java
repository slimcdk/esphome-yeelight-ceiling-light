package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
public final class C1281r3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1281r3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C1281r3 r3Var = new C1281r3();
        zza = r3Var;
        C1174k8.m2154v(C1281r3.class, r3Var);
    }

    private C1281r3() {
    }

    /* renamed from: A */
    static /* synthetic */ void m2600A(C1281r3 r3Var, String str) {
        str.getClass();
        r3Var.zze |= 1;
        r3Var.zzf = str;
    }

    /* renamed from: C */
    public final boolean mo13128C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo13129D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final boolean mo13130E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean mo13131F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final boolean mo13132G() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1281r3();
        } else {
            if (i2 == 4) {
                return new C1265q3((C1201m3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13133x() {
        return this.zzi;
    }

    /* renamed from: z */
    public final String mo13134z() {
        return this.zzf;
    }
}
