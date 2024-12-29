package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
final class C1579c9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1763r3 f1989a;

    /* renamed from: b */
    final /* synthetic */ C1657i9 f1990b;

    C1579c9(C1657i9 i9Var, C1763r3 r3Var) {
        this.f1990b = i9Var;
        this.f1989a = r3Var;
    }

    public final void run() {
        synchronized (this.f1990b) {
            this.f1990b.f2166a = false;
            if (!this.f1990b.f2168c.mo14291z()) {
                this.f1990b.f2168c.f2143a.mo14228b().mo14039v().mo14693a("Connected to service");
                this.f1990b.f2168c.mo14289x(this.f1989a);
            }
        }
    }
}
