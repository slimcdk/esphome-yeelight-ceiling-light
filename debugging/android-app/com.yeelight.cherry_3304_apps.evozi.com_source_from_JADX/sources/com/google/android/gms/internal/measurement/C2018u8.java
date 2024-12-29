package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u8 */
public final class C2018u8 implements C2035v8 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3740a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3741b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3740a = b2Var.mo11455d("measurement.sdk.dynamite.allow_remote_dynamite", false);
        b2Var.mo11455d("measurement.collection.init_params_control_enabled", true);
        f3741b = b2Var.mo11455d("measurement.sdk.dynamite.use_dynamite3", true);
        b2Var.mo11453b("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    /* renamed from: C */
    public final boolean mo12099C() {
        return f3740a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final boolean mo12100D() {
        return f3741b.mo12125n().booleanValue();
    }
}
