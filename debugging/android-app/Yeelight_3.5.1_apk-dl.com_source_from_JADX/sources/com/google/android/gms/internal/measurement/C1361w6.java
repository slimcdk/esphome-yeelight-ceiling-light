package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.w6 */
public final class C1361w6 {
    /* renamed from: a */
    public static C1331u6 m3153a(C1331u6 u6Var) {
        return ((u6Var instanceof C1346v6) || (u6Var instanceof zzig)) ? u6Var : u6Var instanceof Serializable ? new zzig(u6Var) : new C1346v6(u6Var);
    }

    /* renamed from: b */
    public static C1331u6 m3154b(Object obj) {
        return new zzii(obj);
    }
}
