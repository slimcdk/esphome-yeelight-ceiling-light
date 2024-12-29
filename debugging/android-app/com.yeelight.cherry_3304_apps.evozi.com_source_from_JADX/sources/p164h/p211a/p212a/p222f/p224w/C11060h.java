package p164h.p211a.p212a.p222f.p224w;

import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11037n;

/* renamed from: h.a.a.f.w.h */
public abstract class C11060h extends C11059g {

    /* renamed from: m */
    private static final ThreadLocal<C11060h> f21754m = new ThreadLocal<>();

    /* renamed from: k */
    protected C11060h f21755k;

    /* renamed from: l */
    protected C11060h f21756l;

    /* renamed from: L */
    public final void mo34757L(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        if (this.f21755k == null) {
            mo35054P0(str, nVar, cVar, eVar);
        } else {
            mo35053O0(str, nVar, cVar, eVar);
        }
    }

    /* renamed from: O0 */
    public abstract void mo35053O0(String str, C11037n nVar, C10709c cVar, C10711e eVar);

    /* renamed from: P0 */
    public abstract void mo35054P0(String str, C11037n nVar, C10709c cVar, C10711e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public boolean mo35099Q0() {
        return false;
    }

    /* renamed from: R0 */
    public final void mo35100R0(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        C11060h hVar = this.f21756l;
        if (hVar == null || hVar != this.f21753j) {
            C11032i iVar = this.f21753j;
            if (iVar != null) {
                iVar.mo34757L(str, nVar, cVar, eVar);
                return;
            }
            return;
        }
        hVar.mo35053O0(str, nVar, cVar, eVar);
    }

    /* renamed from: S0 */
    public final void mo35101S0(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        C11060h hVar = this.f21756l;
        if (hVar != null) {
            hVar.mo35054P0(str, nVar, cVar, eVar);
            return;
        }
        C11060h hVar2 = this.f21755k;
        if (hVar2 != null) {
            hVar2.mo35053O0(str, nVar, cVar, eVar);
        } else {
            mo35053O0(str, nVar, cVar, eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        try {
            C11060h hVar = f21754m.get();
            this.f21755k = hVar;
            if (hVar == null) {
                f21754m.set(this);
            }
            super.mo34262p0();
            this.f21756l = (C11060h) mo35051L0(C11060h.class);
        } finally {
            if (this.f21755k == null) {
                f21754m.set((Object) null);
            }
        }
    }
}
