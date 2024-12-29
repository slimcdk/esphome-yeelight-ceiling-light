package org.eclipse.jetty.server.handler;

import com.miot.service.connection.wifi.SmartConfigDataProvider;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import p239z5.C12175i;
import p239z5.C12181o;
import p239z5.C12187r;

/* renamed from: org.eclipse.jetty.server.handler.h */
public class C9950h extends C9941b {

    /* renamed from: j */
    protected C12175i f18267j;

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public Object mo39920O0(Object obj, Class cls) {
        return mo39922P0(this.f18267j, obj, cls);
    }

    /* renamed from: R0 */
    public C12175i mo39983R0() {
        return this.f18267j;
    }

    /* renamed from: S0 */
    public void mo39984S0(C12175i iVar) {
        if (!mo36748n0()) {
            C12175i iVar2 = this.f18267j;
            this.f18267j = iVar;
            if (iVar != null) {
                iVar.mo26716i(mo39919c());
            }
            if (mo39919c() != null) {
                mo39919c().mo43169V0().mo36765e(this, iVar2, iVar, SmartConfigDataProvider.KEY_HANDLER);
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        C12187r c = mo39919c();
        if (rVar != c) {
            if (!mo36748n0()) {
                super.mo26716i(rVar);
                C12175i R0 = mo39983R0();
                if (R0 != null) {
                    R0.mo26716i(rVar);
                }
                if (rVar != null && rVar != c) {
                    rVar.mo43169V0().mo36765e(this, (Object) null, this.f18267j, SmartConfigDataProvider.KEY_HANDLER);
                    return;
                }
                return;
            }
            throw new IllegalStateException("STARTED");
        }
    }

    /* renamed from: o */
    public C12175i[] mo39981o() {
        C12175i iVar = this.f18267j;
        if (iVar == null) {
            return new C12175i[0];
        }
        return new C12175i[]{iVar};
    }

    /* renamed from: q */
    public void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        if (this.f18267j != null && mo36748n0()) {
            this.f18267j.mo39972q(str, oVar, aVar, cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        C12175i iVar = this.f18267j;
        if (iVar != null) {
            iVar.start();
        }
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        C12175i iVar = this.f18267j;
        if (iVar != null) {
            iVar.stop();
        }
        super.mo26548v0();
    }
}
