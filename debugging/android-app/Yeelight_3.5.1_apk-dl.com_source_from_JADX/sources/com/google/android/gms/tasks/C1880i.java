package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.i */
final class C1880i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2922a;

    /* renamed from: b */
    final /* synthetic */ C1881j f2923b;

    C1880i(C1881j jVar, C3339g gVar) {
        this.f2923b = jVar;
        this.f2922a = gVar;
    }

    public final void run() {
        try {
            C3339g gVar = (C3339g) this.f2923b.f2925b.mo18508a(this.f2922a);
            if (gVar == null) {
                this.f2923b.mo14744d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C1873b.f2907b;
            gVar.mo14762e(executor, this.f2923b);
            gVar.mo14761d(executor, this.f2923b);
            gVar.mo14758a(executor, this.f2923b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f2923b.f2926c.mo14774q((Exception) e.getCause());
            } else {
                this.f2923b.f2926c.mo14774q(e);
            }
        } catch (Exception e2) {
            this.f2923b.f2926c.mo14774q(e2);
        }
    }
}
