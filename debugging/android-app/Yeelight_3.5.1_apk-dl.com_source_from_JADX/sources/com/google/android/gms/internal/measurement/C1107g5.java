package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g5 */
public final class C1107g5 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1107g5 zza;
    private int zze;
    private String zzf = "";
    private C1254p8 zzg = C1174k8.m2150r();

    static {
        C1107g5 g5Var = new C1107g5();
        zza = g5Var;
        C1174k8.m2154v(C1107g5.class, g5Var);
    }

    private C1107g5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C1219n5.class});
        } else if (i2 == 3) {
            return new C1107g5();
        } else {
            if (i2 == 4) {
                return new C1091f5((C1043c5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo12826y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final List mo12827z() {
        return this.zzg;
    }
}
