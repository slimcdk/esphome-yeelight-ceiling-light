package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rc */
public final class C1290rc implements C1274qc {

    /* renamed from: a */
    public static final C1252p6 f1576a;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        f1576a = a.mo12982f("measurement.client.sessions.check_on_reset_and_enable2", true);
        a.mo12982f("measurement.client.sessions.check_on_startup", true);
        a.mo12982f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    /* renamed from: D */
    public final boolean mo13115D() {
        return ((Boolean) f1576a.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
