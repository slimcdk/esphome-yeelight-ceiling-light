package com.google.android.gms.tasks;

import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.g */
final class C1878g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2917a;

    /* renamed from: b */
    final /* synthetic */ C1879h f2918b;

    C1878g(C1879h hVar, C3339g gVar) {
        this.f2918b = hVar;
        this.f2917a = gVar;
    }

    public final void run() {
        if (this.f2917a.mo14769l()) {
            this.f2918b.f2921c.mo14776s();
            return;
        }
        try {
            this.f2918b.f2921c.mo14775r(this.f2918b.f2920b.mo18508a(this.f2917a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f2918b.f2921c.mo14774q((Exception) e.getCause());
            } else {
                this.f2918b.f2921c.mo14774q(e);
            }
        } catch (Exception e2) {
            this.f2918b.f2921c.mo14774q(e2);
        }
    }
}
