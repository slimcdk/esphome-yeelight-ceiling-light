package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
final class C1923o2<T> implements C1854k2<T>, Serializable {
    @NullableDecl

    /* renamed from: a */
    private final T f3607a;

    C1923o2(@NullableDecl T t) {
        this.f3607a = t;
    }

    /* renamed from: C */
    public final T mo11429C() {
        return this.f3607a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C1923o2)) {
            return false;
        }
        T t = this.f3607a;
        T t2 = ((C1923o2) obj).f3607a;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3607a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3607a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
