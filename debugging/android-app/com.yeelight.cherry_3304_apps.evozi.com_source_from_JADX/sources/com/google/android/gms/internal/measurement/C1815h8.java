package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h8 */
public final class C1815h8 implements C1769e8 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3463a;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3463a = b2Var.mo11455d("measurement.androidId.delete_feature", true);
        b2Var.mo11455d("measurement.log_androidId_enabled", false);
    }

    /* renamed from: C */
    public final boolean mo11615C() {
        return f3463a.mo12125n().booleanValue();
    }
}
