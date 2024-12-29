package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l3 */
public final class C1185l3 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1185l3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private C1254p8 zzi = C1174k8.m2150r();

    static {
        C1185l3 l3Var = new C1185l3();
        zza = l3Var;
        C1174k8.m2154v(C1185l3.class, l3Var);
    }

    private C1185l3() {
    }

    /* renamed from: z */
    public static C1185l3 m2192z() {
        return zza;
    }

    /* renamed from: A */
    public final String mo12944A() {
        return this.zzg;
    }

    /* renamed from: C */
    public final List mo12945C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean mo12946D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final boolean mo12947E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean mo12948F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean mo12949G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final int mo12950H() {
        int a = C1169k3.m2132a(this.zzf);
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
            return C1174k8.m2153u(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C1153j3.f1385a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C1185l3();
        } else {
            if (i2 == 4) {
                return new C1121h3((C1312t2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12951x() {
        return this.zzi.size();
    }
}
