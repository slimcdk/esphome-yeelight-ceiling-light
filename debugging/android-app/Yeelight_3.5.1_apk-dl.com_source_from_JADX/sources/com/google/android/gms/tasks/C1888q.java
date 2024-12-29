package com.google.android.gms.tasks;

import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.q */
final class C1888q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2941a;

    /* renamed from: b */
    final /* synthetic */ C1889r f2942b;

    C1888q(C1889r rVar, C3339g gVar) {
        this.f2942b = rVar;
        this.f2941a = gVar;
    }

    public final void run() {
        synchronized (this.f2942b.f2944b) {
            C1889r rVar = this.f2942b;
            if (rVar.f2945c != null) {
                rVar.f2945c.mo14741a(this.f2941a.mo14768k());
            }
        }
    }
}
