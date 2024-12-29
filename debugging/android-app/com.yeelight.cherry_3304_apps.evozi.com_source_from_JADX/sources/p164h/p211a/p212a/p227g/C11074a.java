package p164h.p211a.p212a.p227g;

import p154d.p155b.C10704e;
import p154d.p155b.C10721g;
import p154d.p155b.C10730p;
import p164h.p211a.p212a.p227g.C11078c;
import p164h.p211a.p212a.p227g.C11082d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.g.a */
public class C11074a extends C11078c<C10704e> {

    /* renamed from: o */
    private static final C11158c f21825o = C11156b.m29015a(C11074a.class);

    /* renamed from: m */
    private transient C10704e f21826m;

    /* renamed from: n */
    private transient C11075a f21827n;

    /* renamed from: h.a.a.g.a$a */
    class C11075a extends C11078c<C10704e>.a implements C10721g {
        C11075a(C11074a aVar) {
            super(aVar);
        }
    }

    public C11074a() {
        super(C11078c.C11081c.EMBEDDED);
    }

    /* renamed from: H0 */
    public void mo35169H0(Object obj) {
        if (obj != null) {
            C10704e eVar = (C10704e) obj;
            eVar.destroy();
            mo35181A0().mo35210V0(eVar);
        }
    }

    /* renamed from: I0 */
    public C10704e mo35170I0() {
        return this.f21826m;
    }

    /* renamed from: p0 */
    public void mo34262p0() {
        super.mo34262p0();
        if (C10704e.class.isAssignableFrom(this.f21835e)) {
            if (this.f21826m == null) {
                try {
                    this.f21826m = ((C11082d.C11083a) this.f21841k.mo35215b1()).mo35201i(mo35191z0());
                } catch (C10730p e) {
                    Throwable a = e.mo33963a();
                    if (a instanceof InstantiationException) {
                        throw ((InstantiationException) a);
                    } else if (a instanceof IllegalAccessException) {
                        throw ((IllegalAccessException) a);
                    } else {
                        throw e;
                    }
                }
            }
            C11075a aVar = new C11075a(this);
            this.f21827n = aVar;
            this.f21826m.mo33902a(aVar);
            return;
        }
        String str = this.f21835e + " is not a javax.servlet.Filter";
        super.stop();
        throw new IllegalStateException(str);
    }

    /* renamed from: q0 */
    public void mo34263q0() {
        C10704e eVar = this.f21826m;
        if (eVar != null) {
            try {
                mo35169H0(eVar);
            } catch (Exception e) {
                f21825o.mo35495k(e);
            }
        }
        if (!this.f21838h) {
            this.f21826m = null;
        }
        this.f21827n = null;
        super.mo34263q0();
    }

    public String toString() {
        return getName();
    }
}
