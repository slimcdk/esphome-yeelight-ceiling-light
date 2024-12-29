package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
abstract class C0827p0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0831q0 f739a;

    /* synthetic */ C0827p0(C0831q0 q0Var, C0822o0 o0Var) {
        this.f739a = q0Var;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public abstract void mo12002b();

    @WorkerThread
    public final void run() {
        this.f739a.f742b.lock();
        try {
            if (!Thread.interrupted()) {
                mo12002b();
            }
        } catch (RuntimeException e) {
            this.f739a.f741a.mo12106p(e);
        } catch (Throwable th) {
            this.f739a.f742b.unlock();
            throw th;
        }
        this.f739a.f742b.unlock();
    }
}
