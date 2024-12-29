package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
final class C1872l2<T> extends C1840j2<T> {

    /* renamed from: a */
    private final T f3537a;

    C1872l2(T t) {
        this.f3537a = t;
    }

    /* renamed from: b */
    public final boolean mo11699b() {
        return true;
    }

    /* renamed from: c */
    public final T mo11700c() {
        return this.f3537a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C1872l2) {
            return this.f3537a.equals(((C1872l2) obj).f3537a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3537a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3537a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
