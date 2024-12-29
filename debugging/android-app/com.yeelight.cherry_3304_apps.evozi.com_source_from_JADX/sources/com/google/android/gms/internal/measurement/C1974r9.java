package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r9 */
public final class C1974r9 implements C1930o9 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3706a;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3706a = b2Var.mo11455d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        b2Var.mo11453b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }

    /* renamed from: C */
    public final boolean mo11933C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo11934D() {
        return f3706a.mo12125n().booleanValue();
    }
}
