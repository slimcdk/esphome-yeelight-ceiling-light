package com.google.android.gms.tasks;

import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.m */
final class C1884m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2931a;

    /* renamed from: b */
    final /* synthetic */ C1885n f2932b;

    C1884m(C1885n nVar, C3339g gVar) {
        this.f2932b = nVar;
        this.f2931a = gVar;
    }

    public final void run() {
        synchronized (this.f2932b.f2934b) {
            C1885n nVar = this.f2932b;
            if (nVar.f2935c != null) {
                nVar.f2935c.mo12083a(this.f2931a);
            }
        }
    }
}
