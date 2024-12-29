package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.va */
public final class C2037va implements C1990sa {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3792a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3793b;

    /* renamed from: c */
    private static final C2026v1<Boolean> f3794c;

    /* renamed from: d */
    private static final C2026v1<Boolean> f3795d;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3792a = b2Var.mo11455d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f3793b = b2Var.mo11455d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f3794c = b2Var.mo11455d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f3795d = b2Var.mo11455d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        b2Var.mo11453b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: C */
    public final boolean mo12060C() {
        return f3792a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final boolean mo12061D() {
        return f3793b.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12062E() {
        return f3794c.mo12125n().booleanValue();
    }

    /* renamed from: F */
    public final boolean mo12063F() {
        return f3795d.mo12125n().booleanValue();
    }
}
