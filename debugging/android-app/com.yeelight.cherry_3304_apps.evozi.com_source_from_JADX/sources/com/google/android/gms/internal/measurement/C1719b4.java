package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
final class C1719b4 {

    /* renamed from: a */
    private static final C1704a4<?> f3238a = new C1736c4();

    /* renamed from: b */
    private static final C1704a4<?> f3239b = m4787c();

    /* renamed from: a */
    static C1704a4<?> m4785a() {
        return f3238a;
    }

    /* renamed from: b */
    static C1704a4<?> m4786b() {
        C1704a4<?> a4Var = f3239b;
        if (a4Var != null) {
            return a4Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C1704a4<?> m4787c() {
        try {
            return (C1704a4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
