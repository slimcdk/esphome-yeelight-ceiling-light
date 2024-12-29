package p164h.p165b.p166a.p240h.p243r.p246m;

import java.net.URL;
import java.util.Collection;
import p164h.p165b.p166a.p240h.p242q.C11237b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11301h;
import p164h.p165b.p166a.p240h.p243r.p247n.C11309p;
import p164h.p165b.p166a.p240h.p243r.p247n.C11310q;
import p164h.p165b.p166a.p240h.p243r.p247n.C11319z;
import p164h.p165b.p166a.p240h.p251v.C11355d;
import p164h.p165b.p166a.p240h.p252w.C11369g0;
import p164h.p165b.p166a.p240h.p252w.C11394u;

/* renamed from: h.b.a.h.r.m.e */
public class C11279e extends C11243d {

    /* renamed from: h */
    private final Collection<C11355d> f22396h;

    public C11279e(C11237b bVar, URL url) {
        this(bVar, url, bVar.mo35720C(), bVar.mo35721J().values());
    }

    public C11279e(C11237b bVar, URL url, C11369g0 g0Var, Collection<C11355d> collection) {
        super(new C11249i(C11249i.C11250a.NOTIFY, url));
        mo35747j().mo35758l(C11296f0.C11297a.CONTENT_TYPE, new C11291d());
        mo35747j().mo35758l(C11296f0.C11297a.NT, new C11309p());
        mo35747j().mo35758l(C11296f0.C11297a.NTS, new C11310q(C11394u.PROPCHANGE));
        mo35747j().mo35758l(C11296f0.C11297a.SID, new C11319z(bVar.mo35724O()));
        mo35747j().mo35758l(C11296f0.C11297a.SEQ, new C11301h(g0Var.mo36099c().longValue()));
        this.f22396h = collection;
    }

    /* renamed from: y */
    public Collection<C11355d> mo35839y() {
        return this.f22396h;
    }
}
