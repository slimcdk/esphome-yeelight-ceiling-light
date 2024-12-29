package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
final /* synthetic */ class C1349o implements Runnable {

    /* renamed from: a */
    private final C1351q f2479a;

    private C1349o(C1351q qVar) {
        this.f2479a = qVar;
    }

    /* renamed from: b */
    public static Runnable m3548b(C1351q qVar) {
        return new C1349o(qVar);
    }

    public void run() {
        this.f2479a.f2484d.mo8509a(C1350p.m3549a(this.f2479a));
    }
}
