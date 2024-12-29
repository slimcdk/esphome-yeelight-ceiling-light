package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.google.android.gms.internal.measurement.w7 */
final class C1362w7 {

    /* renamed from: a */
    private final Object f1695a;

    /* renamed from: b */
    private final int f1696b;

    C1362w7(Object obj, int i) {
        this.f1695a = obj;
        this.f1696b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1362w7)) {
            return false;
        }
        C1362w7 w7Var = (C1362w7) obj;
        return this.f1695a == w7Var.f1695a && this.f1696b == w7Var.f1696b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1695a) * SupportMenu.USER_MASK) + this.f1696b;
    }
}
