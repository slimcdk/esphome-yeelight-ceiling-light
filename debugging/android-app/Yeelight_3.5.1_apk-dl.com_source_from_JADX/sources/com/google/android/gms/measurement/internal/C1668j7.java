package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
final class C1668j7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2190a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2191b;

    C1668j7(C1791t7 t7Var, AtomicReference atomicReference) {
        this.f2191b = t7Var;
        this.f2190a = atomicReference;
    }

    public final void run() {
        synchronized (this.f2190a) {
            try {
                this.f2190a.set(Long.valueOf(this.f2191b.f2143a.mo14402z().mo14177r(this.f2191b.f2143a.mo14371B().mo14508s(), C1727o3.f2414M)));
                this.f2190a.notify();
            } catch (Throwable th) {
                this.f2190a.notify();
                throw th;
            }
        }
    }
}
