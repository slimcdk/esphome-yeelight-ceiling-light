package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
abstract class C2211i9 extends C2223j9 {

    /* renamed from: c */
    private boolean f4205c;

    C2211i9(C2245l9 l9Var) {
        super(l9Var);
        this.f4252b.mo12834r(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo12748q() {
        return this.f4205c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo12749r() {
        if (!mo12748q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: s */
    public final void mo12750s() {
        if (!this.f4205c) {
            mo12453t();
            this.f4252b.mo12828e0();
            this.f4205c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo12453t();
}
