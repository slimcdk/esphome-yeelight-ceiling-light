package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
final class C0848u0 extends C0817n1 {

    /* renamed from: a */
    private final WeakReference f801a;

    C0848u0(C0852v0 v0Var) {
        this.f801a = new WeakReference(v0Var);
    }

    /* renamed from: a */
    public final void mo11902a() {
        C0852v0 v0Var = (C0852v0) this.f801a.get();
        if (v0Var != null) {
            C0852v0.m1117r(v0Var);
        }
    }
}
