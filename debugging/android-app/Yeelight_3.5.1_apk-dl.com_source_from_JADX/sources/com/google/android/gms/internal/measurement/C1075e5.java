package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e5 */
public final class C1075e5 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1075e5 zza;
    private C1254p8 zze = C1174k8.m2150r();

    static {
        C1075e5 e5Var = new C1075e5();
        zza = e5Var;
        C1174k8.m2154v(C1075e5.class, e5Var);
    }

    private C1075e5() {
    }

    /* renamed from: z */
    public static C1075e5 m1889z() {
        return zza;
    }

    /* renamed from: A */
    public final List mo12742A() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo12569w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C1174k8.m2153u(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1107g5.class});
        } else if (i2 == 3) {
            return new C1075e5();
        } else {
            if (i2 == 4) {
                return new C1059d5((C1043c5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo12743x() {
        return this.zze.size();
    }
}
