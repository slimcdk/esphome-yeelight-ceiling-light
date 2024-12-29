package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
abstract class C1478q0 {

    /* renamed from: a */
    private final C1472o0 f2801a;

    protected C1478q0(C1472o0 o0Var) {
        this.f2801a = o0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10883a();

    /* renamed from: b */
    public final void mo11007b(C1475p0 p0Var) {
        p0Var.f2784a.lock();
        try {
            if (p0Var.f2794k == this.f2801a) {
                mo10883a();
            }
        } finally {
            p0Var.f2784a.unlock();
        }
    }
}
