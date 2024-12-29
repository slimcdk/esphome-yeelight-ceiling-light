package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.j6 */
final class C1844j6 {

    /* renamed from: c */
    private static final C1844j6 f3502c = new C1844j6();

    /* renamed from: a */
    private final C1941p6 f3503a = new C1857k5();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C1912n6<?>> f3504b = new ConcurrentHashMap();

    private C1844j6() {
    }

    /* renamed from: a */
    public static C1844j6 m5284a() {
        return f3502c;
    }

    /* renamed from: b */
    public final <T> C1912n6<T> mo11762b(Class<T> cls) {
        C1925o4.m5644f(cls, "messageType");
        C1912n6<T> n6Var = (C1912n6) this.f3504b.get(cls);
        if (n6Var != null) {
            return n6Var;
        }
        C1912n6<T> a = this.f3503a.mo11772a(cls);
        C1925o4.m5644f(cls, "messageType");
        C1925o4.m5644f(a, "schema");
        C1912n6<T> putIfAbsent = this.f3504b.putIfAbsent(cls, a);
        return putIfAbsent != null ? putIfAbsent : a;
    }

    /* renamed from: c */
    public final <T> C1912n6<T> mo11763c(T t) {
        return mo11762b(t.getClass());
    }
}
