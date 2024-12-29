package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
public final class C1908n2 {
    /* renamed from: a */
    public static <T> C1854k2<T> m5581a(C1854k2<T> k2Var) {
        return ((k2Var instanceof C1937p2) || (k2Var instanceof C1887m2)) ? k2Var : k2Var instanceof Serializable ? new C1887m2(k2Var) : new C1937p2(k2Var);
    }

    /* renamed from: b */
    public static <T> C1854k2<T> m5582b(@NullableDecl T t) {
        return new C1923o2(t);
    }
}
