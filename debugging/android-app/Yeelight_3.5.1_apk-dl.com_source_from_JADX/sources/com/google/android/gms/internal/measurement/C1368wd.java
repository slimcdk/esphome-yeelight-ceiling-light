package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wd */
public final class C1368wd implements C1353vd {

    /* renamed from: a */
    public static final C1252p6 f1700a;

    /* renamed from: b */
    public static final C1252p6 f1701b;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12978b().mo12977a();
        f1700a = a.mo12982f("measurement.collection.enable_session_stitching_token.client.dev", false);
        f1701b = a.mo12982f("measurement.collection.enable_session_stitching_token.service", false);
    }

    /* renamed from: D */
    public final boolean mo13437D() {
        return ((Boolean) f1700a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo13438E() {
        return ((Boolean) f1701b.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
