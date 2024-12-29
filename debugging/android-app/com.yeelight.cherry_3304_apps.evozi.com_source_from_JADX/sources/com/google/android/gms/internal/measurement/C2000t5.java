package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
final class C2000t5 implements C1954q5 {
    C2000t5() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo11953a(Object obj) {
        return (C1970r5) obj;
    }

    /* renamed from: b */
    public final Object mo11954b(Object obj) {
        ((C1970r5) obj).mo11981e();
        return obj;
    }

    /* renamed from: c */
    public final boolean mo11955c(Object obj) {
        return !((C1970r5) obj).mo11984f();
    }

    /* renamed from: d */
    public final Map<?, ?> mo11956d(Object obj) {
        return (C1970r5) obj;
    }

    /* renamed from: e */
    public final Object mo11957e(Object obj, Object obj2) {
        C1970r5 r5Var = (C1970r5) obj;
        C1970r5 r5Var2 = (C1970r5) obj2;
        if (!r5Var2.isEmpty()) {
            if (!r5Var.mo11984f()) {
                r5Var = r5Var.mo11980d();
            }
            r5Var.mo11978c(r5Var2);
        }
        return r5Var;
    }

    /* renamed from: f */
    public final C1926o5<?, ?> mo11958f(Object obj) {
        C1940p5 p5Var = (C1940p5) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: g */
    public final Object mo11959g(Object obj) {
        return C1970r5.m5886b().mo11980d();
    }

    /* renamed from: h */
    public final int mo11960h(int i, Object obj, Object obj2) {
        C1970r5 r5Var = (C1970r5) obj;
        C1940p5 p5Var = (C1940p5) obj2;
        if (r5Var.isEmpty()) {
            return 0;
        }
        Iterator it = r5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
