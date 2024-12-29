package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a8 */
final class C1014a8 {

    /* renamed from: a */
    private static final C1392y7 f1231a = new C1407z7();

    /* renamed from: b */
    private static final C1392y7 f1232b;

    static {
        C1392y7 y7Var;
        try {
            y7Var = (C1392y7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y7Var = null;
        }
        f1232b = y7Var;
    }

    /* renamed from: a */
    static C1392y7 m1683a() {
        C1392y7 y7Var = f1232b;
        if (y7Var != null) {
            return y7Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C1392y7 m1684b() {
        return f1231a;
    }
}
