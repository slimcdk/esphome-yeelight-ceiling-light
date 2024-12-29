package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
public final class C2083y9 implements C2098z9 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3857a;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3857a = b2Var.mo11455d("measurement.client.sessions.check_on_reset_and_enable2", true);
        b2Var.mo11455d("measurement.client.sessions.check_on_startup", true);
        b2Var.mo11455d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    /* renamed from: C */
    public final boolean mo12332C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo12333D() {
        return f3857a.mo12125n().booleanValue();
    }
}
