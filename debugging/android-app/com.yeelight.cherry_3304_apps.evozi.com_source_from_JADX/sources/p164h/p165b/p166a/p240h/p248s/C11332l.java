package p164h.p165b.p166a.p240h.p248s;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p250u.C11349f;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;
import p164h.p257c.p259b.C11500e;

/* renamed from: h.b.a.h.s.l */
public class C11332l extends C11323c<C11333m, C11332l, C11334n> {
    public C11332l(C11333m mVar) {
        super(mVar);
    }

    public C11332l(C11333m mVar, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, C11334n[] nVarArr, C11332l[] lVarArr) {
        super(mVar, tVar, lVar, dVar, fVarArr, nVarArr, lVarArr);
    }

    /* renamed from: G */
    public C11332l mo35886e(C11365e0 e0Var) {
        return (C11332l) mo35885d(e0Var, this);
    }

    /* renamed from: H */
    public C11332l[] mo35897n() {
        D[] dArr = this.f22461g;
        return dArr != null ? (C11332l[]) dArr : new C11332l[0];
    }

    /* renamed from: I */
    public C11332l mo35901r() {
        if (mo35909z()) {
            return this;
        }
        C11332l lVar = this;
        while (lVar.mo35900q() != null) {
            lVar = (C11332l) lVar.mo35900q();
        }
        return lVar;
    }

    /* renamed from: J */
    public C11334n[] mo35902s() {
        S[] sArr = this.f22460f;
        return sArr != null ? (C11334n[]) sArr : new C11334n[0];
    }

    /* renamed from: K */
    public C11332l mo35876A(C11365e0 e0Var, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, C11334n[] nVarArr, List<C11332l> list) {
        C11332l[] lVarArr;
        C11365e0 e0Var2 = e0Var;
        C11333m mVar = new C11333m(e0Var, (C11333m) mo35899p());
        if (list.size() > 0) {
            lVarArr = (C11332l[]) list.toArray(new C11332l[list.size()]);
        } else {
            lVarArr = null;
        }
        return new C11332l(mVar, tVar, lVar, dVar, fVarArr, nVarArr, lVarArr);
    }

    /* renamed from: L */
    public C11334n mo35877B(C11397x xVar, C11396w wVar, URI uri, URI uri2, URI uri3, C11320a<C11334n>[] aVarArr, C11336p<C11334n>[] pVarArr) {
        return new C11334n(xVar, wVar, uri, uri2, uri3, aVarArr, pVarArr);
    }

    /* renamed from: M */
    public C11334n[] mo35878C(int i) {
        return new C11334n[i];
    }

    /* renamed from: N */
    public URL mo35970N(URI uri) {
        return C11500e.m30199b((mo35895l() == null || mo35895l().mo35910a() == null) ? ((C11333m) mo35899p()).mo35973d() : mo35895l().mo35910a(), uri);
    }

    /* renamed from: O */
    public C11332l[] mo35880E(Collection<C11332l> collection) {
        return (C11332l[]) collection.toArray(new C11332l[collection.size()]);
    }

    /* renamed from: P */
    public C11334n[] mo35972P(Collection<C11334n> collection) {
        return (C11334n[]) collection.toArray(new C11334n[collection.size()]);
    }

    /* renamed from: a */
    public C11346c[] mo35882a(C11217g gVar) {
        ArrayList arrayList = new ArrayList();
        for (C11334n nVar : mo35902s()) {
            if (nVar != null) {
                arrayList.add(new C11349f(gVar.mo35653h(nVar), nVar));
            }
        }
        if (mo35906v()) {
            for (C11332l lVar : mo35897n()) {
                if (lVar != null) {
                    arrayList.addAll(Arrays.asList(lVar.mo35882a(gVar)));
                }
            }
        }
        return (C11346c[]) arrayList.toArray(new C11346c[arrayList.size()]);
    }
}
