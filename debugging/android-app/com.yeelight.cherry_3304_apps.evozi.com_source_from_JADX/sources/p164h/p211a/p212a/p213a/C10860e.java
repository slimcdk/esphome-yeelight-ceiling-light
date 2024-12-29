package p164h.p211a.p212a.p213a;

import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p217d.C10929e;

/* renamed from: h.a.a.a.e */
public class C10860e extends C10871k {

    /* renamed from: v */
    private final C10897i f20957v;

    /* renamed from: w */
    private volatile int f20958w;

    public C10860e(boolean z) {
        this.f20957v = z ? new C10897i() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized void mo34227E(C10929e eVar, C10929e eVar2) {
        if (this.f20957v != null) {
            this.f20957v.mo34468e(eVar, eVar2.mo34566Y0());
        }
        super.mo34227E(eVar, eVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public synchronized void mo34228G(C10929e eVar, int i, C10929e eVar2) {
        this.f20958w = i;
        super.mo34228G(eVar, i, eVar2);
    }

    /* renamed from: e0 */
    public synchronized C10897i mo34229e0() {
        if (mo34335s() >= 6) {
        } else {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this.f20957v;
    }

    /* renamed from: f0 */
    public synchronized int mo34230f0() {
        if (mo34335s() >= 5) {
        } else {
            throw new IllegalStateException("Response not received yet");
        }
        return this.f20958w;
    }
}
