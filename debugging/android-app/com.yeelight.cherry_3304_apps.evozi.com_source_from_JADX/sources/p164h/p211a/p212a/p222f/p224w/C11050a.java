package p164h.p211a.p212a.p222f.p224w;

import p164h.p211a.p212a.p222f.C11032i;
import p164h.p211a.p212a.p222f.C11040p;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.w.a */
public abstract class C11050a extends C11146b implements C11032i {

    /* renamed from: i */
    private static final C11158c f21708i = C11156b.m29015a(C11050a.class);

    /* renamed from: h */
    private C11040p f21709h;

    /* renamed from: E0 */
    public void mo35048E0(Appendable appendable) {
        appendable.append(toString()).append(" - ").append(mo35453r0()).append(10);
    }

    /* renamed from: d */
    public C11040p mo34900d() {
        return this.f21709h;
    }

    /* renamed from: i */
    public void mo34901i(C11040p pVar) {
        C11040p pVar2 = this.f21709h;
        if (!(pVar2 == null || pVar2 == pVar)) {
            pVar2.mo35003Q0().mo35465d(this);
        }
        this.f21709h = pVar;
        if (pVar != null && pVar != pVar2) {
            pVar.mo35003Q0().mo35464b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        f21708i.mo35489e("starting {}", this);
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        f21708i.mo35489e("stopping {}", this);
        super.mo34263q0();
    }
}
