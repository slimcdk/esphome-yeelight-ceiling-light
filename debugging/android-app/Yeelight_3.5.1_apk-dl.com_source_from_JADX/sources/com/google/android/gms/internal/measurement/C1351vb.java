package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vb */
public final class C1351vb implements C1336ub {

    /* renamed from: a */
    public static final C1252p6 f1690a;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        a.mo12982f("measurement.client.consent_state_v1", true);
        a.mo12982f("measurement.client.3p_consent_state_v1", true);
        a.mo12982f("measurement.service.consent_state_v1_W36", true);
        f1690a = a.mo12980d("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return ((Long) f1690a.mo13069b()).longValue();
    }
}
