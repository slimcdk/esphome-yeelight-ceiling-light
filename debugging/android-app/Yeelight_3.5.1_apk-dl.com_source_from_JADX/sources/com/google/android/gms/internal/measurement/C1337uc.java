package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.uc */
public final class C1337uc implements C1322tc {

    /* renamed from: a */
    public static final C1252p6 f1669a;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        a.mo12982f("measurement.sdk.collection.enable_extend_user_property_size", true);
        a.mo12982f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f1669a = a.mo12982f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        a.mo12980d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return ((Boolean) f1669a.mo13069b()).booleanValue();
    }
}
