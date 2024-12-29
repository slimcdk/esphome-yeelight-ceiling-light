package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.t9 */
final class C1319t9 {

    /* renamed from: c */
    private static final C1319t9 f1650c = new C1319t9();

    /* renamed from: a */
    private final C1379x9 f1651a = new C1079e9();

    /* renamed from: b */
    private final ConcurrentMap f1652b = new ConcurrentHashMap();

    private C1319t9() {
    }

    /* renamed from: a */
    public static C1319t9 m3045a() {
        return f1650c;
    }

    /* renamed from: b */
    public final C1364w9 mo13383b(Class cls) {
        C1270q8.m2547f(cls, "messageType");
        C1364w9 w9Var = (C1364w9) this.f1652b.get(cls);
        if (w9Var == null) {
            w9Var = this.f1651a.mo12745a(cls);
            C1270q8.m2547f(cls, "messageType");
            C1270q8.m2547f(w9Var, "schema");
            C1364w9 w9Var2 = (C1364w9) this.f1652b.putIfAbsent(cls, w9Var);
            return w9Var2 == null ? w9Var : w9Var2;
        }
    }
}
