package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c3 */
final class C1735c3 {

    /* renamed from: a */
    private static final Class<?> f3289a = m4942a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f3290b = (m4942a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m4942a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m4943b() {
        return f3289a != null && !f3290b;
    }

    /* renamed from: c */
    static Class<?> m4944c() {
        return f3289a;
    }
}
