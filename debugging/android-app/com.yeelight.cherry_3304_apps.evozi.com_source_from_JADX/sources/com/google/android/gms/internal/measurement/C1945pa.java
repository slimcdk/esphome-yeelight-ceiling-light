package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pa */
public final class C1945pa implements C1901ma {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3672a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3673b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3672a = b2Var.mo11455d("measurement.client.global_params.dev", false);
        f3673b = b2Var.mo11455d("measurement.service.global_params", false);
    }

    /* renamed from: C */
    public final boolean mo11872C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo11873D() {
        return f3672a.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo11874E() {
        return f3673b.mo12125n().booleanValue();
    }
}
