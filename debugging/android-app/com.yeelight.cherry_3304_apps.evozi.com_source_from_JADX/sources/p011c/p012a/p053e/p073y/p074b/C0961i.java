package p011c.p012a.p053e.p073y.p074b;

import p011c.p012a.p053e.C0829p;

/* renamed from: c.a.e.y.b.i */
public final class C0961i {

    /* renamed from: a */
    private final boolean f1125a;

    C0961i(boolean z) {
        this.f1125a = z;
    }

    /* renamed from: a */
    public void mo9318a(C0829p[] pVarArr) {
        if (this.f1125a && pVarArr != null && pVarArr.length >= 3) {
            C0829p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
