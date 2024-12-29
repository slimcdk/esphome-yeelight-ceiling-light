package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.s */
final class C1890s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2946a;

    /* renamed from: b */
    final /* synthetic */ C1891t f2947b;

    C1890s(C1891t tVar, C3339g gVar) {
        this.f2947b = tVar;
        this.f2946a = gVar;
    }

    public final void run() {
        try {
            C3339g a = this.f2947b.f2949b.mo18568a(this.f2946a.mo14768k());
            if (a == null) {
                this.f2947b.mo14744d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C1873b.f2907b;
            a.mo14762e(executor, this.f2947b);
            a.mo14761d(executor, this.f2947b);
            a.mo14758a(executor, this.f2947b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f2947b.mo14744d((Exception) e.getCause());
            } else {
                this.f2947b.mo14744d(e);
            }
        } catch (CancellationException unused) {
            this.f2947b.mo14743c();
        } catch (Exception e2) {
            this.f2947b.mo14744d(e2);
        }
    }
}
