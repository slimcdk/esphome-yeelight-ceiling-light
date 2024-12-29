package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.k */
final class C1882k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1883l f2927a;

    C1882k(C1883l lVar) {
        this.f2927a = lVar;
    }

    public final void run() {
        synchronized (this.f2927a.f2929b) {
            C1883l lVar = this.f2927a;
            if (lVar.f2930c != null) {
                lVar.f2930c.mo14743c();
            }
        }
    }
}
