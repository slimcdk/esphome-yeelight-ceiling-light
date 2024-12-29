package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
final /* synthetic */ class C1346l implements C0553b.C0554a {

    /* renamed from: a */
    private final C1347m f2462a;

    /* renamed from: b */
    private final C0487l f2463b;

    /* renamed from: c */
    private final int f2464c;

    private C1346l(C1347m mVar, C0487l lVar, int i) {
        this.f2462a = mVar;
        this.f2463b = lVar;
        this.f2464c = i;
    }

    /* renamed from: a */
    public static C0553b.C0554a m3537a(C1347m mVar, C0487l lVar, int i) {
        return new C1346l(mVar, lVar, i);
    }

    /* renamed from: J */
    public Object mo8479J() {
        return this.f2462a.f2468d.mo10234a(this.f2463b, this.f2464c + 1);
    }
}
