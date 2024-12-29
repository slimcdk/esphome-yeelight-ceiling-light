package p164h.p165b.p166a.p240h.p243r.p244k;

import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11299g;
import p164h.p165b.p166a.p240h.p243r.p247n.C11315v;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11331k;

/* renamed from: h.b.a.h.r.k.g */
public class C11260g extends C11244e implements C11256c {

    /* renamed from: g */
    private String f22393g;

    public C11260g(C11252j.C11253a aVar) {
        this(aVar, (C11320a) null);
    }

    public C11260g(C11252j.C11253a aVar, C11320a aVar2) {
        super(new C11252j(aVar));
        if (aVar2 != null) {
            this.f22393g = aVar2 instanceof C11331k ? "urn:schemas-upnp-org:control-1-0" : aVar2.mo35859g().mo35986g().toString();
        }
        mo35809u();
    }

    public C11260g(C11320a aVar) {
        this(C11252j.C11253a.OK, aVar);
    }

    /* renamed from: d */
    public String mo35805d() {
        return this.f22393g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo35809u() {
        mo35747j().mo35758l(C11296f0.C11297a.CONTENT_TYPE, new C11291d(C11291d.f22401d));
        mo35747j().mo35758l(C11296f0.C11297a.SERVER, new C11315v());
        mo35747j().mo35758l(C11296f0.C11297a.EXT, new C11299g());
    }
}
