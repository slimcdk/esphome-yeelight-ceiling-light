package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ea */
abstract class C1606ea extends C1593da {

    /* renamed from: c */
    private boolean f2068c;

    C1606ea(C1770ra raVar) {
        super(raVar);
        this.f2045b.mo14490q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14128i() {
        if (!mo14130k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo14129j() {
        if (!this.f2068c) {
            mo14018l();
            this.f2045b.mo14485l();
            this.f2068c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo14130k() {
        return this.f2068c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo14018l();
}
