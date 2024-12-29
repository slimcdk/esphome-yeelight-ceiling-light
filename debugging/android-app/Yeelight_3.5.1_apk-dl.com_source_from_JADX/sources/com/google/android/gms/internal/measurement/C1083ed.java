package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ed */
public final class C1083ed implements C1067dd {

    /* renamed from: a */
    public static final C1252p6 f1309a;

    /* renamed from: b */
    public static final C1252p6 f1310b;

    /* renamed from: c */
    public static final C1252p6 f1311c;

    /* renamed from: d */
    public static final C1252p6 f1312d;

    /* renamed from: e */
    public static final C1252p6 f1313e;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12977a();
        f1309a = a.mo12982f("measurement.test.boolean_flag", false);
        f1310b = a.mo12979c("measurement.test.double_flag", -3.0d);
        f1311c = a.mo12980d("measurement.test.int_flag", -2);
        f1312d = a.mo12980d("measurement.test.long_flag", -1);
        f1313e = a.mo12981e("measurement.test.string_flag", "---");
    }

    /* renamed from: D */
    public final long mo12704D() {
        return ((Long) f1311c.mo13069b()).longValue();
    }

    /* renamed from: E */
    public final long mo12705E() {
        return ((Long) f1312d.mo13069b()).longValue();
    }

    /* renamed from: a */
    public final boolean mo12706a() {
        return ((Boolean) f1309a.mo13069b()).booleanValue();
    }

    /* renamed from: b */
    public final String mo12707b() {
        return (String) f1313e.mo13069b();
    }

    public final double zza() {
        return ((Double) f1310b.mo13069b()).doubleValue();
    }
}
