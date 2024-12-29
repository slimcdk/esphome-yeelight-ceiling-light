package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bb */
public final class C1726bb implements C2084ya {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3262a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3263b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3262a = b2Var.mo11455d("measurement.sdk.screen.manual_screen_view_logging", true);
        f3263b = b2Var.mo11455d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    /* renamed from: C */
    public final boolean mo11515C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo11516D() {
        return f3262a.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo11517E() {
        return f3263b.mo12125n().booleanValue();
    }
}
