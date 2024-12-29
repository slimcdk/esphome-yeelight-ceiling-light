package org.eclipse.jetty.server.handler;

import p147d6.C8942b;
import p152e6.C9001b;
import p152e6.C9003c;
import p239z5.C12175i;
import p239z5.C12187r;

/* renamed from: org.eclipse.jetty.server.handler.a */
public abstract class C9940a extends C8942b implements C12175i {

    /* renamed from: i */
    private static final C9003c f18219i = C9001b.m21450a(C9940a.class);

    /* renamed from: h */
    private C12187r f18220h;

    /* renamed from: J0 */
    public void mo36757J0(Appendable appendable) {
        appendable.append(toString()).append(" - ").append(mo36752w0()).append(10);
    }

    /* renamed from: c */
    public C12187r mo39919c() {
        return this.f18220h;
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        C12187r rVar2 = this.f18220h;
        if (!(rVar2 == null || rVar2 == rVar)) {
            rVar2.mo43169V0().mo36764d(this);
        }
        this.f18220h = rVar;
        if (rVar != null && rVar != rVar2) {
            rVar.mo43169V0().mo36763b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        f18219i.mo36850e("starting {}", this);
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        f18219i.mo36850e("stopping {}", this);
        super.mo26548v0();
    }
}
