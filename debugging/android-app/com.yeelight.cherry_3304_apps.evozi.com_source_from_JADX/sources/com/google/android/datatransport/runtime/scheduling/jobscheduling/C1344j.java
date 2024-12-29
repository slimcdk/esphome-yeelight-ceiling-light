package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.C1320h;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
final /* synthetic */ class C1344j implements C0553b.C0554a {

    /* renamed from: a */
    private final C1347m f2456a;

    /* renamed from: b */
    private final C1320h f2457b;

    /* renamed from: c */
    private final Iterable f2458c;

    /* renamed from: d */
    private final C0487l f2459d;

    /* renamed from: e */
    private final int f2460e;

    private C1344j(C1347m mVar, C1320h hVar, Iterable iterable, C0487l lVar, int i) {
        this.f2456a = mVar;
        this.f2457b = hVar;
        this.f2458c = iterable;
        this.f2459d = lVar;
        this.f2460e = i;
    }

    /* renamed from: a */
    public static C0553b.C0554a m3533a(C1347m mVar, C1320h hVar, Iterable iterable, C0487l lVar, int i) {
        return new C1344j(mVar, hVar, iterable, lVar, i);
    }

    /* renamed from: J */
    public Object mo8479J() {
        return C1347m.m3540c(this.f2456a, this.f2457b, this.f2458c, this.f2459d, this.f2460e);
    }
}
