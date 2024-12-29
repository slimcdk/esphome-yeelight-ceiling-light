package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i6 */
final class C1828i6 {

    /* renamed from: a */
    private static final C1797g6 f3478a = m5249c();

    /* renamed from: b */
    private static final C1797g6 f3479b = new C1782f6();

    /* renamed from: a */
    static C1797g6 m5247a() {
        return f3478a;
    }

    /* renamed from: b */
    static C1797g6 m5248b() {
        return f3479b;
    }

    /* renamed from: c */
    private static C1797g6 m5249c() {
        try {
            return (C1797g6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
