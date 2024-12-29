package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p011c.p012a.p019b.p020a.p021i.C0487l;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
final /* synthetic */ class C1342h implements Runnable {

    /* renamed from: a */
    private final C1347m f2450a;

    /* renamed from: b */
    private final C0487l f2451b;

    /* renamed from: c */
    private final int f2452c;

    /* renamed from: d */
    private final Runnable f2453d;

    private C1342h(C1347m mVar, C0487l lVar, int i, Runnable runnable) {
        this.f2450a = mVar;
        this.f2451b = lVar;
        this.f2452c = i;
        this.f2453d = runnable;
    }

    /* renamed from: b */
    public static Runnable m3530b(C1347m mVar, C0487l lVar, int i, Runnable runnable) {
        return new C1342h(mVar, lVar, i, runnable);
    }

    public void run() {
        C1347m.m3542e(this.f2450a, this.f2451b, this.f2452c, this.f2453d);
    }
}
