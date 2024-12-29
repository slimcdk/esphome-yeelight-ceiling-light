package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wa */
public final class C2052wa implements C2067xa {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3807a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3808b;

    /* renamed from: c */
    private static final C2026v1<Boolean> f3809c;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        b2Var.mo11453b("measurement.id.lifecycle.app_in_background_parameter", 0);
        f3807a = b2Var.mo11455d("measurement.lifecycle.app_backgrounded_engagement", false);
        f3808b = b2Var.mo11455d("measurement.lifecycle.app_backgrounded_tracking", true);
        f3809c = b2Var.mo11455d("measurement.lifecycle.app_in_background_parameter", false);
        b2Var.mo11453b("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    /* renamed from: C */
    public final boolean mo12195C() {
        return f3807a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final boolean mo12196D() {
        return f3808b.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12197E() {
        return f3809c.mo12125n().booleanValue();
    }
}
