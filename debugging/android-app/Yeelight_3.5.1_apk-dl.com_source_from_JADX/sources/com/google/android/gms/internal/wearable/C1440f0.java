package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.f0 */
final class C1440f0 {

    /* renamed from: a */
    private static final C1430d0<?> f1772a = new C1435e0();

    /* renamed from: b */
    private static final C1430d0<?> f1773b;

    static {
        C1430d0<?> d0Var;
        try {
            d0Var = (C1430d0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            d0Var = null;
        }
        f1773b = d0Var;
    }

    /* renamed from: a */
    static C1430d0<?> m3526a() {
        return f1772a;
    }

    /* renamed from: b */
    static C1430d0<?> m3527b() {
        C1430d0<?> d0Var = f1773b;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
