package com.google.firebase.installations;

import com.google.firebase.installations.C3283m;
import com.google.firebase.installations.p135q.C3294d;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.installations.k */
class C3281k implements C3286o {

    /* renamed from: a */
    private final C3287p f6352a;

    /* renamed from: b */
    private final C0620i<C3283m> f6353b;

    public C3281k(C3287p pVar, C0620i<C3283m> iVar) {
        this.f6352a = pVar;
        this.f6353b = iVar;
    }

    /* renamed from: a */
    public boolean mo17900a(C3294d dVar, Exception exc) {
        if (!dVar.mo17928i() && !dVar.mo17929j() && !dVar.mo17931l()) {
            return false;
        }
        this.f6353b.mo8669d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo17901b(C3294d dVar) {
        if (!dVar.mo17930k() || this.f6352a.mo17904b(dVar)) {
            return false;
        }
        C0620i<C3283m> iVar = this.f6353b;
        C3283m.C3284a a = C3283m.m10175a();
        a.mo17886b(dVar.mo17905b());
        a.mo17888d(dVar.mo17906c());
        a.mo17887c(dVar.mo17912h());
        iVar.mo8668c(a.mo17885a());
        return true;
    }
}
