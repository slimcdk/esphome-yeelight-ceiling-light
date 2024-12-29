package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q4 */
public final class C1266q4 extends C1174k8 implements C1207m9 {
    /* access modifiers changed from: private */
    public static final C1266q4 zza;
    private C1254p8 zze = C1174k8.m2150r();

    static {
        C1266q4 q4Var = new C1266q4();
        zza = q4Var;
        C1174k8.m2154v(C1266q4.class, q4Var);
    }

    private C1266q4() {
    }

    /* renamed from: C */
    static /* synthetic */ void m2502C(C1266q4 q4Var, C1298s4 s4Var) {
        s4Var.getClass();
        C1254p8 p8Var = q4Var.zze;
        if (!p8Var.mo13072E()) {
            q4Var.zze = C1174k8.m2151s(p8Var);
        }
        q4Var.zze.add(s4Var);
    }

    /* renamed from: x */
    public static C1234o4 m2503x() {
        return (C1234o4) zza.mo12915k();
    }

    /* renamed from: A */
    public final List mo13084A() {
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
            return C1174k8.m2153u(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1298s4.class});
        } else if (i2 == 3) {
            return new C1266q4();
        } else {
            if (i2 == 4) {
                return new C1234o4((C1388y3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final C1298s4 mo13085z(int i) {
        return (C1298s4) this.zze.get(0);
    }
}
