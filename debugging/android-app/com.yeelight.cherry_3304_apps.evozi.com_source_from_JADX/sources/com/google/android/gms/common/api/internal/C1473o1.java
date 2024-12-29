package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;

/* renamed from: com.google.android.gms.common.api.internal.o1 */
final class C1473o1 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1507j f2780a;

    /* renamed from: b */
    private final /* synthetic */ C1470n1 f2781b;

    C1473o1(C1470n1 n1Var, C1507j jVar) {
        this.f2781b = n1Var;
        this.f2780a = jVar;
    }

    @WorkerThread
    public final void run() {
        try {
            BasePendingResult.f2588p.set(Boolean.TRUE);
            this.f2781b.f2779g.sendMessage(this.f2781b.f2779g.obtainMessage(0, this.f2781b.f2773a.mo11031b(this.f2780a)));
            BasePendingResult.f2588p.set(Boolean.FALSE);
            C1470n1.m3965c(this.f2780a);
            C1399f fVar = (C1399f) this.f2781b.f2778f.get();
            if (fVar != null) {
                fVar.mo10830i(this.f2781b);
            }
        } catch (RuntimeException e) {
            this.f2781b.f2779g.sendMessage(this.f2781b.f2779g.obtainMessage(1, e));
            BasePendingResult.f2588p.set(Boolean.FALSE);
            C1470n1.m3965c(this.f2780a);
            C1399f fVar2 = (C1399f) this.f2781b.f2778f.get();
            if (fVar2 != null) {
                fVar2.mo10830i(this.f2781b);
            }
        } catch (Throwable th) {
            BasePendingResult.f2588p.set(Boolean.FALSE);
            C1470n1.m3965c(this.f2780a);
            C1399f fVar3 = (C1399f) this.f2781b.f2778f.get();
            if (fVar3 != null) {
                fVar3.mo10830i(this.f2781b);
            }
            throw th;
        }
    }
}
