package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cc */
public final class C1050cc implements C1034bc {

    /* renamed from: a */
    public static final C1252p6 f1270a;

    /* renamed from: b */
    public static final C1252p6 f1271b;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12978b().mo12977a();
        a.mo12982f("measurement.collection.event_safelist", true);
        f1270a = a.mo12982f("measurement.service.store_null_safelist", true);
        f1271b = a.mo12982f("measurement.service.store_safelist", true);
    }

    /* renamed from: D */
    public final boolean mo12587D() {
        return ((Boolean) f1270a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12588E() {
        return ((Boolean) f1271b.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
