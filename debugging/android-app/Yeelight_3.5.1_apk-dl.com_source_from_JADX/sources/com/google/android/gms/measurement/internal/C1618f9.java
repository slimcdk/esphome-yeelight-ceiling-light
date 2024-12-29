package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
final class C1618f9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1763r3 f2093a;

    /* renamed from: b */
    final /* synthetic */ C1657i9 f2094b;

    C1618f9(C1657i9 i9Var, C1763r3 r3Var) {
        this.f2094b = i9Var;
        this.f2093a = r3Var;
    }

    public final void run() {
        synchronized (this.f2094b) {
            this.f2094b.f2166a = false;
            if (!this.f2094b.f2168c.mo14291z()) {
                this.f2094b.f2168c.f2143a.mo14228b().mo14034q().mo14693a("Connected to remote service");
                this.f2094b.f2168c.mo14289x(this.f2093a);
            }
        }
    }
}
