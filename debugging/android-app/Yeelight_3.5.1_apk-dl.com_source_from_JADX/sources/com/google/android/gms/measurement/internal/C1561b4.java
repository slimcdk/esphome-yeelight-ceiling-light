package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
abstract class C1561b4 extends C1547a3 {

    /* renamed from: b */
    private boolean f1947b;

    C1561b4(C1717n5 n5Var) {
        super(n5Var);
        this.f2143a.mo14389i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14020i() {
        if (!mo14024m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo14021j() {
        if (this.f1947b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14025n()) {
            this.f2143a.mo14387g();
            this.f1947b = true;
        }
    }

    /* renamed from: k */
    public final void mo14022k() {
        if (!this.f1947b) {
            mo14023l();
            this.f2143a.mo14387g();
            this.f1947b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: l */
    public void mo14023l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo14024m() {
        return this.f1947b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo14025n();
}
