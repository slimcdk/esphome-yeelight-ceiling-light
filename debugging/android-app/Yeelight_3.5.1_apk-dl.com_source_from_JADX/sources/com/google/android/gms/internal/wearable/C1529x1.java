package com.google.android.gms.internal.wearable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.wearable.x1 */
final class C1529x1 {

    /* renamed from: c */
    private static final C1529x1 f1874c = new C1529x1();

    /* renamed from: a */
    private final C1422b2 f1875a = new C1451h1();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C1417a2<?>> f1876b = new ConcurrentHashMap();

    private C1529x1() {
    }

    /* renamed from: a */
    public static C1529x1 m3906a() {
        return f1874c;
    }

    /* renamed from: b */
    public final <T> C1417a2<T> mo13843b(Class<T> cls) {
        C1524w0.m3858b(cls, "messageType");
        C1417a2<T> a2Var = (C1417a2) this.f1876b.get(cls);
        if (a2Var == null) {
            a2Var = this.f1875a.mo13594a(cls);
            C1524w0.m3858b(cls, "messageType");
            C1524w0.m3858b(a2Var, "schema");
            C1417a2<T> putIfAbsent = this.f1876b.putIfAbsent(cls, a2Var);
            return putIfAbsent == null ? a2Var : putIfAbsent;
        }
    }
}
