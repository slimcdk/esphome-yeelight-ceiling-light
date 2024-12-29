package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ic */
public final class C1146ic implements C1130hc {

    /* renamed from: a */
    public static final C1252p6 f1377a;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        a.mo12982f("measurement.client.consent.suppress_1p_in_ga4f_install", true);
        f1377a = a.mo12982f("measurement.client.consent.gmpappid_worker_thread_fix", true);
    }

    /* renamed from: D */
    public final boolean mo12865D() {
        return ((Boolean) f1377a.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
