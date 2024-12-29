package p164h.p165b.p166a.p240h.p248s;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p249t.C11342b;
import p164h.p165b.p166a.p240h.p249t.C11343c;
import p164h.p165b.p166a.p240h.p250u.C11344a;
import p164h.p165b.p166a.p240h.p250u.C11345b;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p250u.C11347d;
import p164h.p165b.p166a.p240h.p250u.C11348e;
import p164h.p165b.p166a.p240h.p250u.C11350g;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.s.g */
public class C11327g extends C11323c<C11325e, C11327g, C11328h> {

    /* renamed from: j */
    private final C11342b f22484j = null;

    public C11327g(C11325e eVar, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, C11328h[] hVarArr, C11327g[] gVarArr) {
        super(eVar, tVar, lVar, dVar, fVarArr, hVarArr, gVarArr);
    }

    public C11327g(C11325e eVar, C11381l lVar, C11324d dVar, C11328h[] hVarArr) {
        super(eVar, lVar, dVar, (C11326f[]) null, hVarArr);
    }

    /* renamed from: F */
    public List<C11222l> mo35881F() {
        Class<C11327g> cls = C11327g.class;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo35881F());
        if (mo35907w()) {
            for (C11326f fVar : mo35898o()) {
                if (fVar.mo35933g().isAbsolute()) {
                    arrayList.add(new C11222l(cls, "icons", "Local icon URI can not be absolute: " + fVar.mo35933g()));
                }
                if (fVar.mo35933g().toString().contains("../")) {
                    arrayList.add(new C11222l(cls, "icons", "Local icon URI must not contain '../': " + fVar.mo35933g()));
                }
                if (fVar.mo35933g().toString().startsWith(MiotCloudImpl.COOKIE_PATH)) {
                    arrayList.add(new C11222l(cls, "icons", "Local icon URI must not start with '/': " + fVar.mo35933g()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public C11327g mo35886e(C11365e0 e0Var) {
        return (C11327g) mo35885d(e0Var, this);
    }

    /* renamed from: H */
    public C11342b mo35939H() {
        return this.f22484j;
    }

    /* renamed from: I */
    public C11327g[] mo35897n() {
        D[] dArr = this.f22461g;
        return dArr != null ? (C11327g[]) dArr : new C11327g[0];
    }

    /* renamed from: J */
    public C11327g mo35901r() {
        if (mo35909z()) {
            return this;
        }
        C11327g gVar = this;
        while (gVar.mo35900q() != null) {
            gVar = (C11327g) gVar.mo35900q();
        }
        return gVar;
    }

    /* renamed from: K */
    public C11328h[] mo35902s() {
        S[] sArr = this.f22460f;
        return sArr != null ? (C11328h[]) sArr : new C11328h[0];
    }

    /* renamed from: L */
    public C11327g mo35876A(C11365e0 e0Var, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, C11328h[] hVarArr, List<C11327g> list) {
        C11327g[] gVarArr;
        C11365e0 e0Var2 = e0Var;
        C11325e eVar = new C11325e(e0Var, mo35899p().mo35921a());
        if (list.size() > 0) {
            gVarArr = (C11327g[]) list.toArray(new C11327g[list.size()]);
        } else {
            gVarArr = null;
        }
        return new C11327g(eVar, tVar, lVar, dVar, fVarArr, hVarArr, gVarArr);
    }

    /* renamed from: M */
    public C11328h mo35877B(C11397x xVar, C11396w wVar, URI uri, URI uri2, URI uri3, C11320a<C11328h>[] aVarArr, C11336p<C11328h>[] pVarArr) {
        return new C11328h(xVar, wVar, aVarArr, pVarArr);
    }

    /* renamed from: N */
    public C11328h[] mo35878C(int i) {
        return new C11328h[i];
    }

    /* renamed from: O */
    public C11327g[] mo35880E(Collection<C11327g> collection) {
        return (C11327g[]) collection.toArray(new C11327g[collection.size()]);
    }

    /* renamed from: a */
    public C11346c[] mo35882a(C11217g gVar) {
        ArrayList arrayList = new ArrayList();
        if (mo35909z()) {
            arrayList.add(new C11344a(gVar.mo35649d(this), this));
        }
        for (C11328h hVar : mo35902s()) {
            arrayList.add(new C11348e(gVar.mo35650e(hVar), hVar));
            arrayList.add(new C11347d(gVar.mo35648c(hVar), hVar));
            arrayList.add(new C11350g(gVar.mo35655j(hVar), hVar));
        }
        for (C11326f fVar : mo35898o()) {
            arrayList.add(new C11345b(gVar.mo35662q(this, fVar.mo35933g()), fVar));
        }
        if (mo35906v()) {
            for (C11327g a : mo35897n()) {
                arrayList.addAll(Arrays.asList(a.mo35882a(gVar)));
            }
        }
        return (C11346c[]) arrayList.toArray(new C11346c[arrayList.size()]);
    }

    /* renamed from: m */
    public C11324d mo35896m(C11343c cVar) {
        return mo35939H() != null ? mo35939H().mo36021a(cVar) : mo35895l();
    }
}
