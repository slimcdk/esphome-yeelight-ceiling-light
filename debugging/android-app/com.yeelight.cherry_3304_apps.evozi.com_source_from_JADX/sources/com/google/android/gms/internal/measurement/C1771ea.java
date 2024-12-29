package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ea */
public final class C1771ea implements C1786fa {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3332a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3333b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3332a = b2Var.mo11455d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f3333b = b2Var.mo11455d("measurement.collection.redundant_engagement_removal_enabled", false);
        b2Var.mo11453b("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    /* renamed from: C */
    public final boolean mo11616C() {
        return f3332a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final boolean mo11617D() {
        return f3333b.mo12125n().booleanValue();
    }
}
