package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.lc */
public final class C1194lc implements C1178kc {

    /* renamed from: a */
    public static final C1252p6 f1409a;

    /* renamed from: b */
    public static final C1252p6 f1410b;

    /* renamed from: c */
    public static final C1252p6 f1411c;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        a.mo12982f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f1409a = a.mo12982f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f1410b = a.mo12982f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f1411c = a.mo12982f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: D */
    public final boolean mo12937D() {
        return ((Boolean) f1409a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12938E() {
        return ((Boolean) f1410b.mo13069b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12939b() {
        return ((Boolean) f1411c.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
