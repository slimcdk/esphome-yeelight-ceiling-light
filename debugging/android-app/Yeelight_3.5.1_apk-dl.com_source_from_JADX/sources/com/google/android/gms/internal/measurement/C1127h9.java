package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h9 */
final class C1127h9 {

    /* renamed from: a */
    private static final C1111g9 f1364a;

    /* renamed from: b */
    private static final C1111g9 f1365b = new C1111g9();

    static {
        C1111g9 g9Var;
        try {
            g9Var = (C1111g9) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            g9Var = null;
        }
        f1364a = g9Var;
    }

    /* renamed from: a */
    static C1111g9 m2063a() {
        return f1364a;
    }

    /* renamed from: b */
    static C1111g9 m2064b() {
        return f1365b;
    }
}
