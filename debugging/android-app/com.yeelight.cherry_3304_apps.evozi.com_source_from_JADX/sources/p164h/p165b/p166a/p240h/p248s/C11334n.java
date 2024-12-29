package p164h.p165b.p166a.p240h.p248s;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.s.n */
public class C11334n extends C11335o<C11332l, C11334n> {

    /* renamed from: g */
    private final URI f22499g;

    /* renamed from: h */
    private final URI f22500h;

    /* renamed from: i */
    private final URI f22501i;

    public C11334n(C11397x xVar, C11396w wVar, URI uri, URI uri2, URI uri3, C11320a<C11334n>[] aVarArr, C11336p<C11334n>[] pVarArr) {
        super(xVar, wVar, aVarArr, pVarArr);
        this.f22499g = uri;
        this.f22500h = uri2;
        this.f22501i = uri3;
        List<C11222l> q = mo35979q();
        if (q.size() > 0) {
            throw new C11223m("Validation of device graph failed, call getErrors() on exception", q);
        }
    }

    /* renamed from: n */
    public URI mo35976n() {
        return this.f22500h;
    }

    /* renamed from: o */
    public URI mo35977o() {
        return this.f22499g;
    }

    /* renamed from: p */
    public URI mo35978p() {
        return this.f22501i;
    }

    /* renamed from: q */
    public List<C11222l> mo35979q() {
        Class<C11334n> cls = C11334n.class;
        ArrayList arrayList = new ArrayList();
        if (mo35977o() == null) {
            arrayList.add(new C11222l(cls, "descriptorURI", "Descriptor location (SCPDURL) is required"));
        }
        if (mo35976n() == null) {
            arrayList.add(new C11222l(cls, "controlURI", "Control URL is required"));
        }
        if (mo35978p() == null) {
            arrayList.add(new C11222l(cls, "eventSubscriptionURI", "Event subscription URL is required"));
        }
        return arrayList;
    }

    public String toString() {
        return "(" + C11334n.class.getSimpleName() + ") Descriptor: " + mo35977o();
    }
}
