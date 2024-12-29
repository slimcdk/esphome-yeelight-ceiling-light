package p164h.p165b.p166a.p240h.p243r.p244k;

import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;

/* renamed from: h.b.a.h.r.k.e */
public class C11258e extends C11244e implements C11256c {
    public C11258e(C11244e eVar) {
        super(eVar);
    }

    public C11258e(C11252j jVar) {
        super(jVar);
    }

    /* renamed from: d */
    public String mo35805d() {
        return null;
    }

    /* renamed from: u */
    public boolean mo35807u() {
        int d = ((C11252j) mo35776k()).mo35796d();
        return ((C11252j) mo35776k()).mo35798f() && d != C11252j.C11253a.METHOD_NOT_SUPPORTED.mo35800b() && (d != C11252j.C11253a.INTERNAL_SERVER_ERROR.mo35800b() || !mo35779n());
    }

    /* renamed from: v */
    public boolean mo35808v() {
        return mo35779n() && ((C11252j) mo35776k()).mo35796d() == C11252j.C11253a.INTERNAL_SERVER_ERROR.mo35800b();
    }
}
