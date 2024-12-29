package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
final class C1616f7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2090a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2091b;

    C1616f7(C1791t7 t7Var, AtomicReference atomicReference) {
        this.f2091b = t7Var;
        this.f2090a = atomicReference;
    }

    public final void run() {
        synchronized (this.f2090a) {
            try {
                this.f2090a.set(Boolean.valueOf(this.f2091b.f2143a.mo14402z().mo14163B(this.f2091b.f2143a.mo14371B().mo14508s(), C1727o3.f2410K)));
                this.f2090a.notify();
            } catch (Throwable th) {
                this.f2090a.notify();
                throw th;
            }
        }
    }
}
