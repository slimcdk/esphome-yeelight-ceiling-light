package org.eclipse.jetty.server.handler;

import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import p239z5.C12175i;
import p239z5.C12181o;

/* renamed from: org.eclipse.jetty.server.handler.i */
public abstract class C9951i extends C9950h {

    /* renamed from: m */
    private static final ThreadLocal<C9951i> f18268m = new ThreadLocal<>();

    /* renamed from: k */
    protected C9951i f18269k;

    /* renamed from: l */
    protected C9951i f18270l;

    /* renamed from: T0 */
    public abstract void mo26711T0(String str, C12181o oVar, C9277a aVar, C9279c cVar);

    /* renamed from: U0 */
    public abstract void mo26712U0(String str, C12181o oVar, C9277a aVar, C9279c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public boolean mo39985V0() {
        return false;
    }

    /* renamed from: W0 */
    public final void mo39986W0(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        C9951i iVar = this.f18270l;
        if (iVar == null || iVar != this.f18267j) {
            C12175i iVar2 = this.f18267j;
            if (iVar2 != null) {
                iVar2.mo39972q(str, oVar, aVar, cVar);
                return;
            }
            return;
        }
        iVar.mo26711T0(str, oVar, aVar, cVar);
    }

    /* renamed from: X0 */
    public final void mo39987X0(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        C9951i iVar = this.f18270l;
        if (iVar != null) {
            iVar.mo26712U0(str, oVar, aVar, cVar);
            return;
        }
        C9951i iVar2 = this.f18269k;
        if (iVar2 != null) {
            iVar2.mo26711T0(str, oVar, aVar, cVar);
        } else {
            mo26711T0(str, oVar, aVar, cVar);
        }
    }

    /* renamed from: q */
    public final void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        if (this.f18269k == null) {
            mo26712U0(str, oVar, aVar, cVar);
        } else {
            mo26711T0(str, oVar, aVar, cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        try {
            ThreadLocal<C9951i> threadLocal = f18268m;
            C9951i iVar = threadLocal.get();
            this.f18269k = iVar;
            if (iVar == null) {
                threadLocal.set(this);
            }
            super.mo26547u0();
            this.f18270l = (C9951i) mo39923Q0(C9951i.class);
            if (this.f18269k == null) {
                threadLocal.set((Object) null);
            }
        } catch (Throwable th) {
            if (this.f18269k == null) {
                f18268m.set((Object) null);
            }
            throw th;
        }
    }
}
