package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cb */
public final class C1743cb implements C1757db {

    /* renamed from: a */
    private static final C2026v1<Long> f3295a;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        b2Var.mo11453b("measurement.id.max_bundles_per_iteration", 0);
        f3295a = b2Var.mo11453b("measurement.max_bundles_per_iteration", 2);
    }

    /* renamed from: C */
    public final long mo11557C() {
        return f3295a.mo12125n().longValue();
    }
}
