package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l7 */
final class C1694l7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f2273a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f2274b;

    C1694l7(C1791t7 t7Var, AtomicReference atomicReference) {
        this.f2274b = t7Var;
        this.f2273a = atomicReference;
    }

    public final void run() {
        synchronized (this.f2273a) {
            try {
                this.f2273a.set(Double.valueOf(this.f2274b.f2143a.mo14402z().mo14170k(this.f2274b.f2143a.mo14371B().mo14508s(), C1727o3.f2417O)));
                this.f2273a.notify();
            } catch (Throwable th) {
                this.f2273a.notify();
                throw th;
            }
        }
    }
}
