package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
abstract class C1442h0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1498x f2695a;

    private C1442h0(C1498x xVar) {
        this.f2695a = xVar;
    }

    /* synthetic */ C1442h0(C1498x xVar, C1501y yVar) {
        this(xVar);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: b */
    public abstract void mo10865b();

    @WorkerThread
    public void run() {
        this.f2695a.f2830b.lock();
        try {
            if (!Thread.interrupted()) {
                mo10865b();
            }
        } catch (RuntimeException e) {
            this.f2695a.f2829a.mo11004l(e);
        } catch (Throwable th) {
            this.f2695a.f2830b.unlock();
            throw th;
        }
        this.f2695a.f2830b.unlock();
    }
}
