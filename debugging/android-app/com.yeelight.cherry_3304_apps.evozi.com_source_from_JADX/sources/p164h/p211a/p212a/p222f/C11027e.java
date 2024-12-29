package p164h.p211a.p212a.p222f;

import p164h.p211a.p212a.p216c.C10896h;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.e */
public class C11027e extends C11010b {

    /* renamed from: H */
    private static final C11158c f21603H = C11156b.m29015a(C11027e.class);

    public C11027e(C11028f fVar, C10942n nVar, C11040p pVar) {
        super(fVar, nVar, pVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo34824C() {
        super.mo34824C();
    }

    /* renamed from: c */
    public C10941m mo34225c() {
        C10942n nVar;
        C10941m mVar;
        C10941m mVar2;
        try {
            C11010b.m28111O(this);
            C10941m mVar3 = this;
            while (this.f21308b.isOpen() && mVar3 == this) {
                try {
                    if (!this.f21558h.mo34517e() && !this.f21308b.mo34369s()) {
                        this.f21558h.mo34514b();
                    }
                    if (this.f21562l.mo34399g() && !this.f21562l.mo34397e() && !this.f21308b.mo34368r()) {
                        this.f21562l.mo34402j();
                    }
                    this.f21308b.flush();
                    if (this.f21558h.mo34517e() && this.f21562l.mo34397e()) {
                        mo34835N();
                        if (this.f21564n.mo34994u() == 101 && (mVar2 = (C10941m) this.f21560j.mo33964a("org.eclipse.jetty.io.Connection")) != null) {
                            mVar3 = mVar2;
                        }
                        if (!this.f21562l.mo34398f() && !this.f21308b.mo34368r()) {
                            f21603H.mo35486b("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this.f21308b.mo34370t();
                        }
                    }
                    if (this.f21308b.mo34369s() && this.f21562l.mo34392a() && !this.f21560j.mo34982y().mo34872r()) {
                        nVar = this.f21308b;
                        nVar.close();
                    }
                } catch (C10896h e) {
                    if (f21603H.mo35485a()) {
                        C11158c cVar = f21603H;
                        cVar.mo35489e("uri=" + this.f21557g, new Object[0]);
                        C11158c cVar2 = f21603H;
                        cVar2.mo35489e("fields=" + this.f21559i, new Object[0]);
                        f21603H.mo35487c(e);
                    }
                    this.f21562l.mo34405m(e.mo34456b(), e.mo34455a(), (String) null, true);
                    this.f21558h.reset();
                    this.f21308b.mo34370t();
                    if (this.f21558h.mo34517e() && this.f21562l.mo34397e()) {
                        mo34835N();
                        if (this.f21564n.mo34994u() == 101 && (mVar = (C10941m) this.f21560j.mo33964a("org.eclipse.jetty.io.Connection")) != null) {
                            mVar3 = mVar;
                        }
                        if (!this.f21562l.mo34398f() && !this.f21308b.mo34368r()) {
                            f21603H.mo35486b("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this.f21308b.mo34370t();
                        }
                    }
                    if (this.f21308b.mo34369s() && this.f21562l.mo34392a() && !this.f21560j.mo34982y().mo34872r()) {
                        nVar = this.f21308b;
                    }
                }
            }
            C11010b.m28111O((C11010b) null);
            this.f21558h.mo34516d();
            this.f21562l.mo34396d();
            return mVar3;
        } catch (Throwable th) {
            C11010b.m28111O((C11010b) null);
            this.f21558h.mo34516d();
            this.f21562l.mo34396d();
            throw th;
        }
    }
}
