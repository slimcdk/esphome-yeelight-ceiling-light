package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
abstract class C2352v5 extends C2363w5 {

    /* renamed from: b */
    private boolean f4665b;

    C2352v5(C2111a5 a5Var) {
        super(a5Var);
        this.f4689a.mo12432j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo12763n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo13079o() {
        if (!mo13082s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: p */
    public final void mo13080p() {
        if (this.f4665b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo12683r()) {
            this.f4689a.mo12440t();
            this.f4665b = true;
        }
    }

    /* renamed from: q */
    public final void mo13081q() {
        if (!this.f4665b) {
            mo12763n();
            this.f4689a.mo12440t();
            this.f4665b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo12683r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo13082s() {
        return this.f4665b;
    }
}
