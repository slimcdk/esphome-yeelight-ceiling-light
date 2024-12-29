package org.eclipse.jetty.client;

import org.eclipse.jetty.http.C9895h;
import p225w5.C11940d;

/* renamed from: org.eclipse.jetty.client.e */
public class C9869e extends C9877j {

    /* renamed from: v */
    private final C9895h f17909v;

    /* renamed from: w */
    private volatile int f17910w;

    public C9869e(boolean z) {
        this.f17909v = z ? new C9895h() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized void mo39558E(C11940d dVar, C11940d dVar2) {
        C9895h hVar = this.f17909v;
        if (hVar != null) {
            hVar.mo39789e(dVar, dVar2.mo42421b1());
        }
        super.mo39558E(dVar, dVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public synchronized void mo39559G(C11940d dVar, int i, C11940d dVar2) {
        this.f17910w = i;
        super.mo39559G(dVar, i, dVar2);
    }

    /* renamed from: e0 */
    public synchronized C9895h mo39560e0() {
        if (mo39636s() >= 6) {
        } else {
            throw new IllegalStateException("Headers not completely received yet");
        }
        return this.f17909v;
    }

    /* renamed from: f0 */
    public synchronized int mo39561f0() {
        if (mo39636s() >= 5) {
        } else {
            throw new IllegalStateException("Response not received yet");
        }
        return this.f17910w;
    }
}
