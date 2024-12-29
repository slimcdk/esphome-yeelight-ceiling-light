package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z4 */
public final class C1404z4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1404z4 zza;
    private int zze;
    private int zzf;
    private C1238o8 zzg = C1174k8.m2148p();

    static {
        C1404z4 z4Var = new C1404z4();
        zza = z4Var;
        C1174k8.m2154v(C1404z4.class, z4Var);
    }

    private C1404z4() {
    }

    /* renamed from: A */
    public static C1389y4 m3390A() {
        return (C1389y4) zza.mo12915k();
    }

    /* renamed from: E */
    static /* synthetic */ void m3392E(C1404z4 z4Var, int i) {
        z4Var.zze |= 1;
        z4Var.zzf = i;
    }

    /* renamed from: F */
    static /* synthetic */ void m3393F(C1404z4 z4Var, Iterable iterable) {
        C1238o8 o8Var = z4Var.zzg;
        if (!o8Var.mo13072E()) {
            z4Var.zzg = C1174k8.m2149q(o8Var);
        }
        C1391y6.m3298h(iterable, z4Var.zzg);
    }

    /* renamed from: D */
    public final List mo13521D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo13522G() {
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
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C1404z4();
        } else {
            if (i2 == 4) {
                return new C1389y4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo13523x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int mo13524y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final long mo13525z(int i) {
        return this.zzg.mo12531f(i);
    }
}
