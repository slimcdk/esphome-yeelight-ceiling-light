package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C1655i7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2163a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2164b;

    C1655i7(C1791t7 t7Var, AtomicReference atomicReference) {
        this.f2164b = t7Var;
        this.f2163a = atomicReference;
    }

    public final void run() {
        synchronized (this.f2163a) {
            try {
                this.f2163a.set(this.f2164b.f2143a.mo14402z().mo14183x(this.f2164b.f2143a.mo14371B().mo14508s(), C1727o3.f2412L));
                this.f2163a.notify();
            } catch (Throwable th) {
                this.f2163a.notify();
                throw th;
            }
        }
    }
}
