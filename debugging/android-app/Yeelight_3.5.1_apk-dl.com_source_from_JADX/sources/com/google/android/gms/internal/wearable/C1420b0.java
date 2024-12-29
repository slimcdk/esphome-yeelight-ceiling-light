package com.google.android.gms.internal.wearable;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.google.android.gms.internal.wearable.b0 */
final class C1420b0 {

    /* renamed from: a */
    private final Object f1756a;

    /* renamed from: b */
    private final int f1757b;

    C1420b0(Object obj, int i) {
        this.f1756a = obj;
        this.f1757b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1420b0)) {
            return false;
        }
        C1420b0 b0Var = (C1420b0) obj;
        return this.f1756a == b0Var.f1756a && this.f1757b == b0Var.f1757b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f1756a) * SupportMenu.USER_MASK) + this.f1757b;
    }
}
