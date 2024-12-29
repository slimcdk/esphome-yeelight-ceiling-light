package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
abstract class C2133c3 extends C2146d4 {

    /* renamed from: b */
    private boolean f3994b;

    C2133c3(C2111a5 a5Var) {
        super(a5Var);
        this.f4689a.mo12431h(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract boolean mo12534A();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo12535v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo12536w() {
        return this.f3994b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12537x() {
        if (!mo12536w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo12538y() {
        if (this.f3994b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo12534A()) {
            this.f4689a.mo12440t();
            this.f3994b = true;
        }
    }

    /* renamed from: z */
    public final void mo12539z() {
        if (!this.f3994b) {
            mo12535v();
            this.f4689a.mo12440t();
            this.f3994b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
