package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nd */
public final class C1227nd implements C1211md {

    /* renamed from: a */
    public static final C1252p6 f1441a;

    /* renamed from: b */
    public static final C1252p6 f1442b;

    /* renamed from: c */
    public static final C1252p6 f1443c;

    /* renamed from: d */
    public static final C1252p6 f1444d;

    /* renamed from: e */
    public static final C1252p6 f1445e;

    /* renamed from: f */
    public static final C1252p6 f1446f;

    /* renamed from: g */
    public static final C1252p6 f1447g;

    /* renamed from: h */
    public static final C1252p6 f1448h;

    /* renamed from: i */
    public static final C1252p6 f1449i;

    /* renamed from: j */
    public static final C1252p6 f1450j;

    /* renamed from: k */
    public static final C1252p6 f1451k;

    /* renamed from: l */
    public static final C1252p6 f1452l;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12978b().mo12977a();
        f1441a = a.mo12982f("measurement.redaction.app_instance_id", true);
        f1442b = a.mo12982f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f1443c = a.mo12982f("measurement.redaction.config_redacted_fields", true);
        f1444d = a.mo12982f("measurement.redaction.device_info", true);
        f1445e = a.mo12982f("measurement.redaction.e_tag", false);
        f1446f = a.mo12982f("measurement.redaction.enhanced_uid", true);
        f1447g = a.mo12982f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f1448h = a.mo12982f("measurement.redaction.google_signals", true);
        f1449i = a.mo12982f("measurement.redaction.no_aiid_in_config_request", true);
        f1450j = a.mo12982f("measurement.redaction.upload_redacted_fields", true);
        f1451k = a.mo12982f("measurement.redaction.upload_subdomain_override", true);
        f1452l = a.mo12982f("measurement.redaction.user_id", true);
        a.mo12980d("measurement.id.redaction", 0);
    }

    /* renamed from: D */
    public final boolean mo12984D() {
        return ((Boolean) f1441a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12985E() {
        return ((Boolean) f1442b.mo13069b()).booleanValue();
    }

    /* renamed from: H */
    public final boolean mo12986H() {
        return ((Boolean) f1452l.mo13069b()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo12987a() {
        return ((Boolean) f1444d.mo13069b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12988b() {
        return ((Boolean) f1443c.mo13069b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12989c() {
        return ((Boolean) f1447g.mo13069b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo12990d() {
        return ((Boolean) f1448h.mo13069b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo12991e() {
        return ((Boolean) f1446f.mo13069b()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo12992f() {
        return ((Boolean) f1445e.mo13069b()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo12993g() {
        return ((Boolean) f1451k.mo13069b()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo12994h() {
        return ((Boolean) f1449i.mo13069b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo12995i() {
        return ((Boolean) f1450j.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
