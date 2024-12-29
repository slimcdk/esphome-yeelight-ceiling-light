package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t8 */
public final class C2003t8 implements C1957q8 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3731a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3732b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3731a = b2Var.mo11455d("measurement.service.configurable_service_limits", false);
        f3732b = b2Var.mo11455d("measurement.client.configurable_service_limits", false);
    }

    /* renamed from: C */
    public final boolean mo11962C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo11963D() {
        return f3731a.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo11964E() {
        return f3732b.mo12125n().booleanValue();
    }
}
