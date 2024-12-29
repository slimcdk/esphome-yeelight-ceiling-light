package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s5 */
final class C1985s5 {

    /* renamed from: a */
    private static final C1954q5 f3714a = m5945c();

    /* renamed from: b */
    private static final C1954q5 f3715b = new C2000t5();

    /* renamed from: a */
    static C1954q5 m5943a() {
        return f3714a;
    }

    /* renamed from: b */
    static C1954q5 m5944b() {
        return f3715b;
    }

    /* renamed from: c */
    private static C1954q5 m5945c() {
        try {
            return (C1954q5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
