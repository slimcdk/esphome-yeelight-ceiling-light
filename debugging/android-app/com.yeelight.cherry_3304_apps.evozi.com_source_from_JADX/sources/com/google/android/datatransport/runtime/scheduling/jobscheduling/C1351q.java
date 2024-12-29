package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import javax.inject.Inject;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p026v.C0553b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
public class C1351q {

    /* renamed from: a */
    private final Executor f2481a;

    /* renamed from: b */
    private final C0519c f2482b;

    /* renamed from: c */
    private final C1353s f2483c;

    /* renamed from: d */
    private final C0553b f2484d;

    @Inject
    C1351q(Executor executor, C0519c cVar, C1353s sVar, C0553b bVar) {
        this.f2481a = executor;
        this.f2482b = cVar;
        this.f2483c = sVar;
        this.f2484d = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m3551b(C1351q qVar) {
        for (C0487l a : qVar.f2482b.mo8516z()) {
            qVar.f2483c.mo10234a(a, 1);
        }
        return null;
    }

    /* renamed from: a */
    public void mo10265a() {
        this.f2481a.execute(C1349o.m3548b(this));
    }
}
