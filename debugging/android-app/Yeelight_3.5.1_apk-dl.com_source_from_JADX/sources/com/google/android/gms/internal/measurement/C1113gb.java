package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gb */
public final class C1113gb implements C1097fb {

    /* renamed from: a */
    public static final C1252p6 f1348a;

    /* renamed from: b */
    public static final C1252p6 f1349b;

    /* renamed from: c */
    public static final C1252p6 f1350c;

    /* renamed from: d */
    public static final C1252p6 f1351d;

    /* renamed from: e */
    public static final C1252p6 f1352e;

    /* renamed from: f */
    public static final C1252p6 f1353f;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12978b().mo12977a();
        f1348a = a.mo12982f("measurement.adid_zero.app_instance_id_fix", true);
        f1349b = a.mo12982f("measurement.adid_zero.service", true);
        f1350c = a.mo12982f("measurement.adid_zero.adid_uid", true);
        f1351d = a.mo12982f("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        f1352e = a.mo12982f("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        f1353f = a.mo12982f("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    /* renamed from: D */
    public final boolean mo12789D() {
        return ((Boolean) f1348a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo12790E() {
        return ((Boolean) f1349b.mo13069b()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo12791a() {
        return ((Boolean) f1351d.mo13069b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12792b() {
        return ((Boolean) f1350c.mo13069b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo12793e() {
        return ((Boolean) f1353f.mo13069b()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo12794f() {
        return ((Boolean) f1352e.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
