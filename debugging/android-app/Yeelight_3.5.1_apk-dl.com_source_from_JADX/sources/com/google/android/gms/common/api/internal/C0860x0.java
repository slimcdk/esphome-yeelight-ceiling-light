package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
abstract class C0860x0 {

    /* renamed from: a */
    private final C0856w0 f845a;

    protected C0860x0(C0856w0 w0Var) {
        this.f845a = w0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11906a();

    /* renamed from: b */
    public final void mo12093b(C0868z0 z0Var) {
        z0Var.f863a.lock();
        try {
            if (z0Var.f873k == this.f845a) {
                mo11906a();
            }
        } finally {
            z0Var.f863a.unlock();
        }
    }
}
