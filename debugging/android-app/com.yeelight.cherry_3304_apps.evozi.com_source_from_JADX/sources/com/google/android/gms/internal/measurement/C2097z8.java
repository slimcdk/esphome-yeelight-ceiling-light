package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z8 */
public final class C2097z8 implements C2050w8 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3868a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3869b;

    /* renamed from: c */
    private static final C2026v1<Boolean> f3870c;

    /* renamed from: d */
    private static final C2026v1<Boolean> f3871d;

    /* renamed from: e */
    private static final C2026v1<Boolean> f3872e;

    /* renamed from: f */
    private static final C2026v1<Boolean> f3873f;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3868a = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.format_logs", false);
        b2Var.mo11453b("measurement.id.gold.enhanced_ecommerce.service", 0);
        f3869b = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f3870c = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false);
        f3871d = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f3872e = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.updated_schema.service", false);
        f3873f = b2Var.mo11455d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false);
    }

    /* renamed from: C */
    public final boolean mo12188C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo12189D() {
        return f3868a.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12190E() {
        return f3869b.mo12125n().booleanValue();
    }

    /* renamed from: F */
    public final boolean mo12191F() {
        return f3870c.mo12125n().booleanValue();
    }

    /* renamed from: G */
    public final boolean mo12192G() {
        return f3871d.mo12125n().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo12193d() {
        return f3872e.mo12125n().booleanValue();
    }

    /* renamed from: e */
    public final boolean mo12194e() {
        return f3873f.mo12125n().booleanValue();
    }
}
