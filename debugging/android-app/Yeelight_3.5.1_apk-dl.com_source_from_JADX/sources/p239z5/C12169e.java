package p239z5;

import org.eclipse.jetty.http.HttpException;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11949j;
import p225w5.C11950k;

/* renamed from: z5.e */
public class C12169e extends C12151b {

    /* renamed from: Q */
    private static final C9003c f22396Q = C9001b.m21450a(C12169e.class);

    public C12169e(C12170f fVar, C11950k kVar, C12187r rVar) {
        super(fVar, kVar, rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo42967C() {
        super.mo42967C();
    }

    /* renamed from: c */
    public C11949j mo39556c() {
        C11950k kVar;
        C11949j jVar;
        C11949j jVar2;
        try {
            C12151b.m31591Q(this);
            C11949j jVar3 = this;
            while (this.f21821b.isOpen() && jVar3 == this) {
                try {
                    if (!this.f22351h.mo39839e() && !this.f21821b.mo39669s()) {
                        this.f22351h.mo39836b();
                    }
                    if (this.f22355l.mo39720g() && !this.f22355l.mo39718e() && !this.f21821b.mo39668r()) {
                        this.f22355l.mo39724k();
                    }
                    this.f21821b.flush();
                    if (this.f22351h.mo39839e() && this.f22355l.mo39718e()) {
                        mo42980P();
                        if (this.f22357n.mo43149B() == 101 && (jVar2 = (C11949j) this.f22353j.mo40040a("org.eclipse.jetty.io.Connection")) != null) {
                            jVar3 = jVar2;
                        }
                        if (!this.f22355l.mo39719f() && !this.f21821b.mo39668r()) {
                            f22396Q.mo36847b("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this.f21821b.mo39670t();
                        }
                    }
                    if (this.f21821b.mo39669s() && this.f22355l.mo39713a() && !this.f22353j.mo43129z().mo43022u()) {
                        kVar = this.f21821b;
                        kVar.close();
                    }
                } catch (HttpException e) {
                    C9003c cVar = f22396Q;
                    if (cVar.mo36846a()) {
                        cVar.mo36850e("uri=" + this.f22350g, new Object[0]);
                        cVar.mo36850e("fields=" + this.f22352i, new Object[0]);
                        cVar.mo36848c(e);
                    }
                    this.f22355l.mo39727o(e.getStatus(), e.getReason(), (String) null, true);
                    this.f22351h.reset();
                    this.f21821b.mo39670t();
                    if (this.f22351h.mo39839e() && this.f22355l.mo39718e()) {
                        mo42980P();
                        if (this.f22357n.mo43149B() == 101 && (jVar = (C11949j) this.f22353j.mo40040a("org.eclipse.jetty.io.Connection")) != null) {
                            jVar3 = jVar;
                        }
                        if (!this.f22355l.mo39719f() && !this.f21821b.mo39668r()) {
                            cVar.mo36847b("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this.f21821b.mo39670t();
                        }
                    }
                    if (this.f21821b.mo39669s() && this.f22355l.mo39713a() && !this.f22353j.mo43129z().mo43022u()) {
                        kVar = this.f21821b;
                    }
                }
            }
            C12151b.m31591Q((C12151b) null);
            this.f22351h.mo39838d();
            this.f22355l.mo39717d();
            return jVar3;
        } catch (Throwable th) {
            C12151b.m31591Q((C12151b) null);
            this.f22351h.mo39838d();
            this.f22355l.mo39717d();
            throw th;
        }
    }
}
