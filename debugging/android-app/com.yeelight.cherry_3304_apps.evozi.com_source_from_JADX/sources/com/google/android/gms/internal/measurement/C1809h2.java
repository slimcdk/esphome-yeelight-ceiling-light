package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
final class C1809h2<T> extends C1840j2<T> {

    /* renamed from: a */
    static final C1809h2<Object> f3451a = new C1809h2<>();

    private C1809h2() {
    }

    /* renamed from: b */
    public final boolean mo11699b() {
        return false;
    }

    /* renamed from: c */
    public final T mo11700c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
