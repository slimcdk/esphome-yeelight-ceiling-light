package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k7 */
final class C1681k7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2230a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2231b;

    C1681k7(C1791t7 t7Var, AtomicReference atomicReference) {
        this.f2231b = t7Var;
        this.f2230a = atomicReference;
    }

    public final void run() {
        synchronized (this.f2230a) {
            try {
                this.f2230a.set(Integer.valueOf(this.f2231b.f2143a.mo14402z().mo14174o(this.f2231b.f2143a.mo14371B().mo14508s(), C1727o3.f2416N)));
                this.f2230a.notify();
            } catch (Throwable th) {
                this.f2230a.notify();
                throw th;
            }
        }
    }
}
