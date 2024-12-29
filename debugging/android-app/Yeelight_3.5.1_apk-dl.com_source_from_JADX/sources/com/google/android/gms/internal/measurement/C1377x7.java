package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x7 */
public final class C1377x7 {

    /* renamed from: b */
    private static volatile C1377x7 f1706b;

    /* renamed from: c */
    private static volatile C1377x7 f1707c;

    /* renamed from: d */
    static final C1377x7 f1708d = new C1377x7(true);

    /* renamed from: a */
    private final Map f1709a;

    C1377x7() {
        this.f1709a = new HashMap();
    }

    C1377x7(boolean z) {
        this.f1709a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C1377x7 m3246a() {
        C1377x7 x7Var = f1706b;
        if (x7Var == null) {
            synchronized (C1377x7.class) {
                x7Var = f1706b;
                if (x7Var == null) {
                    x7Var = f1708d;
                    f1706b = x7Var;
                }
            }
        }
        return x7Var;
    }

    /* renamed from: b */
    public static C1377x7 m3247b() {
        Class<C1377x7> cls = C1377x7.class;
        C1377x7 x7Var = f1707c;
        if (x7Var != null) {
            return x7Var;
        }
        synchronized (cls) {
            C1377x7 x7Var2 = f1707c;
            if (x7Var2 != null) {
                return x7Var2;
            }
            C1377x7 b = C1078e8.m1894b(cls);
            f1707c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final C1158j8 mo13495c(C1191l9 l9Var, int i) {
        return (C1158j8) this.f1709a.get(new C1362w7(l9Var, i));
    }
}
