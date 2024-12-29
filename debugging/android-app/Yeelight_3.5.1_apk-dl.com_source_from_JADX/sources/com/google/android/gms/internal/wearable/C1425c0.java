package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.c0 */
public final class C1425c0 {

    /* renamed from: b */
    private static volatile C1425c0 f1759b;

    /* renamed from: c */
    static final C1425c0 f1760c = new C1425c0(true);

    /* renamed from: a */
    private final Map<C1420b0, C1475m0<?, ?>> f1761a;

    C1425c0() {
        this.f1761a = new HashMap();
    }

    C1425c0(boolean z) {
        this.f1761a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C1425c0 m3435a() {
        C1425c0 c0Var = f1759b;
        if (c0Var == null) {
            synchronized (C1425c0.class) {
                c0Var = f1759b;
                if (c0Var == null) {
                    c0Var = f1760c;
                    f1759b = c0Var;
                }
            }
        }
        return c0Var;
    }

    /* renamed from: b */
    public final <ContainingType extends C1486o1> C1475m0<ContainingType, ?> mo13595b(ContainingType containingtype, int i) {
        return this.f1761a.get(new C1420b0(containingtype, i));
    }
}
