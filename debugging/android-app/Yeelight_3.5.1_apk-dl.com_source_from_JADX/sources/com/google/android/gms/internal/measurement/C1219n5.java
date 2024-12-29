package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n5 */
public final class C1219n5 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1219n5 zza;
    private int zze;
    private int zzf;
    private C1254p8 zzg = C1174k8.m2150r();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C1219n5 n5Var = new C1219n5();
        zza = n5Var;
        C1174k8.m2154v(C1219n5.class, n5Var);
    }

    private C1219n5() {
    }

    /* renamed from: A */
    public final String mo13008A() {
        return this.zzi;
    }

    /* renamed from: C */
    public final List mo13009C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo13010D() {
        return this.zzj;
    }

    /* renamed from: E */
    public final boolean mo13011E() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: F */
    public final boolean mo13012F() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: G */
    public final boolean mo13013G() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: H */
    public final int mo13014H() {
        int a = C1203m5.m2267a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C1187l5.f1405a, "zzg", C1219n5.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C1219n5();
        } else {
            if (i2 == 4) {
                return new C1155j5((C1043c5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo13015x() {
        return this.zzk;
    }

    /* renamed from: z */
    public final String mo13016z() {
        return this.zzh;
    }
}
