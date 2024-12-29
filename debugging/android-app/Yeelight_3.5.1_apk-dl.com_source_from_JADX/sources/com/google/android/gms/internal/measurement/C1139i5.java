package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i5 */
public final class C1139i5 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1139i5 zza;
    private int zze;
    private C1254p8 zzf = C1174k8.m2150r();
    private C1075e5 zzg;

    static {
        C1139i5 i5Var = new C1139i5();
        zza = i5Var;
        C1174k8.m2154v(C1139i5.class, i5Var);
    }

    private C1139i5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C1219n5.class, "zzg"});
        } else if (i2 == 3) {
            return new C1139i5();
        } else {
            if (i2 == 4) {
                return new C1123h5((C1043c5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final C1075e5 mo12875x() {
        C1075e5 e5Var = this.zzg;
        return e5Var == null ? C1075e5.m1889z() : e5Var;
    }

    /* renamed from: z */
    public final List mo12876z() {
        return this.zzf;
    }
}
