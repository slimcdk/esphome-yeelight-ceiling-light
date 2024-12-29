package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
abstract class C1654i6 extends C1641h6 {

    /* renamed from: b */
    private boolean f2162b;

    C1654i6(C1717n5 n5Var) {
        super(n5Var);
        this.f2143a.mo14389i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo14240i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo14033j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo14241k() {
        if (!mo14244n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo14242l() {
        if (this.f2162b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14033j()) {
            this.f2143a.mo14387g();
            this.f2162b = true;
        }
    }

    /* renamed from: m */
    public final void mo14243m() {
        if (!this.f2162b) {
            mo14240i();
            this.f2143a.mo14387g();
            this.f2162b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo14244n() {
        return this.f2162b;
    }
}
