package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C0917i;
import p065m0.C3339g;

/* renamed from: com.google.android.gms.tasks.o */
final class C1886o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3339g f2936a;

    /* renamed from: b */
    final /* synthetic */ C1887p f2937b;

    C1886o(C1887p pVar, C3339g gVar) {
        this.f2937b = pVar;
        this.f2936a = gVar;
    }

    public final void run() {
        synchronized (this.f2937b.f2939b) {
            C1887p pVar = this.f2937b;
            if (pVar.f2940c != null) {
                pVar.f2940c.mo14744d((Exception) C0917i.m1419j(this.f2936a.mo14767j()));
            }
        }
    }
}
