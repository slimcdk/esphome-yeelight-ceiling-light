package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xc */
public final class C1382xc implements C1367wc {

    /* renamed from: a */
    public static final C1252p6 f1718a;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        a.mo12980d("measurement.id.lifecycle.app_in_background_parameter", 0);
        a.mo12982f("measurement.lifecycle.app_backgrounded_tracking", true);
        f1718a = a.mo12982f("measurement.lifecycle.app_in_background_parameter", false);
        a.mo12980d("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return ((Boolean) f1718a.mo13069b()).booleanValue();
    }
}
