package p164h.p211a.p212a.p222f.p224w;

import com.miot.service.connection.wifi.SmartConfigDataProvider;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11040p;

/* renamed from: h.a.a.f.w.g */
public class C11059g extends C11051b {

    /* renamed from: j */
    protected C11032i f21753j;

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public Object mo35049J0(Object obj, Class cls) {
        return mo35050K0(this.f21753j, obj, cls);
    }

    /* renamed from: L */
    public void mo34757L(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        if (this.f21753j != null && mo35452j0()) {
            this.f21753j.mo34757L(str, nVar, cVar, eVar);
        }
    }

    /* renamed from: M0 */
    public C11032i mo35097M0() {
        return this.f21753j;
    }

    /* renamed from: N0 */
    public void mo35098N0(C11032i iVar) {
        if (!mo35452j0()) {
            C11032i iVar2 = this.f21753j;
            this.f21753j = iVar;
            if (iVar != null) {
                iVar.mo34901i(mo34900d());
            }
            if (mo34900d() != null) {
                mo34900d().mo35003Q0().mo35466e(this, iVar2, iVar, SmartConfigDataProvider.KEY_HANDLER);
                return;
            }
            return;
        }
        throw new IllegalStateException("STARTED");
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        C11040p d = mo34900d();
        if (pVar != d) {
            if (!mo35452j0()) {
                super.mo34901i(pVar);
                C11032i M0 = mo35097M0();
                if (M0 != null) {
                    M0.mo34901i(pVar);
                }
                if (pVar != null && pVar != d) {
                    pVar.mo35003Q0().mo35466e(this, (Object) null, this.f21753j, SmartConfigDataProvider.KEY_HANDLER);
                    return;
                }
                return;
            }
            throw new IllegalStateException("STARTED");
        }
    }

    /* renamed from: n */
    public C11032i[] mo34903n() {
        C11032i iVar = this.f21753j;
        if (iVar == null) {
            return new C11032i[0];
        }
        return new C11032i[]{iVar};
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        C11032i iVar = this.f21753j;
        if (iVar != null) {
            iVar.start();
        }
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        C11032i iVar = this.f21753j;
        if (iVar != null) {
            iVar.stop();
        }
        super.mo34263q0();
    }
}
