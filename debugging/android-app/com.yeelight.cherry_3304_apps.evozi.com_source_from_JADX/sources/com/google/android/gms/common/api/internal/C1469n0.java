package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
final class C1469n0 extends C1420c1 {

    /* renamed from: a */
    private WeakReference<C1453j0> f2772a;

    C1469n0(C1453j0 j0Var) {
        this.f2772a = new WeakReference<>(j0Var);
    }

    /* renamed from: a */
    public final void mo10895a() {
        C1453j0 j0Var = (C1453j0) this.f2772a.get();
        if (j0Var != null) {
            j0Var.m3882n();
        }
    }
}
