package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l9 */
public final class C1879l9 implements C1831i9 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3553a;

    /* renamed from: b */
    private static final C2026v1<Boolean> f3554b;

    /* renamed from: c */
    private static final C2026v1<Boolean> f3555c;

    /* renamed from: d */
    private static final C2026v1<Boolean> f3556d;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3553a = b2Var.mo11455d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f3554b = b2Var.mo11455d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f3555c = b2Var.mo11455d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f3556d = b2Var.mo11455d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: C */
    public final boolean mo11745C() {
        return true;
    }

    /* renamed from: D */
    public final boolean mo11746D() {
        return f3553a.mo12125n().booleanValue();
    }

    /* renamed from: E */
    public final boolean mo11747E() {
        return f3554b.mo12125n().booleanValue();
    }

    /* renamed from: F */
    public final boolean mo11748F() {
        return f3555c.mo12125n().booleanValue();
    }

    /* renamed from: G */
    public final boolean mo11749G() {
        return f3556d.mo12125n().booleanValue();
    }
}
