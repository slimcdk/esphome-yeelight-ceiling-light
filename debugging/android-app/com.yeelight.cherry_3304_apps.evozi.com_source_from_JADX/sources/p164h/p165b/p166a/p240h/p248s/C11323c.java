package p164h.p165b.p166a.p240h.p248s;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11325e;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p249t.C11343c;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.s.c */
public abstract class C11323c<DI extends C11325e, D extends C11323c, S extends C11335o> {

    /* renamed from: i */
    private static final Logger f22454i = Logger.getLogger(C11323c.class.getName());

    /* renamed from: a */
    private final DI f22455a;

    /* renamed from: b */
    private final C11340t f22456b;

    /* renamed from: c */
    private final C11381l f22457c;

    /* renamed from: d */
    private final C11324d f22458d;

    /* renamed from: e */
    private final C11326f[] f22459e;

    /* renamed from: f */
    protected final S[] f22460f;

    /* renamed from: g */
    protected final D[] f22461g;

    /* renamed from: h */
    private D f22462h;

    public C11323c(DI di) {
        this(di, (C11381l) null, (C11324d) null, (C11326f[]) null, (S[]) null, (D[]) null);
    }

    public C11323c(DI di, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, S[] sArr, D[] dArr) {
        boolean z;
        this.f22455a = di;
        this.f22456b = tVar == null ? new C11340t() : tVar;
        this.f22457c = lVar;
        this.f22458d = dVar;
        ArrayList arrayList = new ArrayList();
        if (fVarArr != null) {
            for (C11326f fVar : fVarArr) {
                if (fVar != null) {
                    fVar.mo35935i(this);
                    List<C11222l> j = fVar.mo35936j();
                    if (j.isEmpty()) {
                        arrayList.add(fVar);
                    } else {
                        f22454i.warning("Discarding invalid '" + fVar + "': " + j);
                    }
                }
            }
        }
        this.f22459e = (C11326f[]) arrayList.toArray(new C11326f[arrayList.size()]);
        boolean z2 = true;
        if (sArr != null) {
            z = true;
            for (S s : sArr) {
                if (s != null) {
                    s.mo35991l(this);
                    z = false;
                }
            }
        } else {
            z = true;
        }
        this.f22460f = (sArr == null || z) ? null : sArr;
        if (dArr != null) {
            for (D d : dArr) {
                if (d != null) {
                    d.mo35879D(this);
                    z2 = false;
                }
            }
        }
        this.f22461g = (dArr == null || z2) ? null : dArr;
        List<C11222l> F = mo35881F();
        if (F.size() > 0) {
            if (f22454i.isLoggable(Level.FINEST)) {
                for (C11222l lVar2 : F) {
                    f22454i.finest(lVar2.toString());
                }
            }
            throw new C11223m("Validation of device graph failed, call getErrors() on exception", F);
        }
    }

    public C11323c(DI di, C11381l lVar, C11324d dVar, C11326f[] fVarArr, S[] sArr) {
        this(di, (C11340t) null, lVar, dVar, fVarArr, sArr, (D[]) null);
    }

    public C11323c(DI di, C11381l lVar, C11324d dVar, C11326f[] fVarArr, S[] sArr, D[] dArr) {
        this(di, (C11340t) null, lVar, dVar, fVarArr, sArr, dArr);
    }

    /* renamed from: y */
    private boolean m29578y(C11335o oVar, C11397x xVar, C11396w wVar) {
        return (xVar == null || oVar.mo35986g().mo36140d(xVar)) && (wVar == null || oVar.mo35985f().equals(wVar));
    }

    /* renamed from: A */
    public abstract D mo35876A(C11365e0 e0Var, C11340t tVar, C11381l lVar, C11324d dVar, C11326f[] fVarArr, S[] sArr, List<D> list);

    /* renamed from: B */
    public abstract S mo35877B(C11397x xVar, C11396w wVar, URI uri, URI uri2, URI uri3, C11320a<S>[] aVarArr, C11336p<S>[] pVarArr);

    /* renamed from: C */
    public abstract S[] mo35878C(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo35879D(D d) {
        if (this.f22462h == null) {
            this.f22462h = d;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: E */
    public abstract D[] mo35880E(Collection<D> collection);

    /* renamed from: F */
    public List<C11222l> mo35881F() {
        ArrayList arrayList = new ArrayList();
        if (mo35903t() != null) {
            arrayList.addAll(mo35905u().mo36018c());
            if (mo35899p() != null) {
                arrayList.addAll(mo35899p().mo35923c());
            }
            if (mo35895l() != null) {
                arrayList.addAll(mo35895l().mo35920k());
            }
            if (mo35908x()) {
                for (C11335o oVar : mo35902s()) {
                    if (oVar != null) {
                        arrayList.addAll(oVar.mo35992m());
                    }
                }
            }
            if (mo35906v()) {
                for (C11323c cVar : mo35897n()) {
                    if (cVar != null) {
                        arrayList.addAll(cVar.mo35881F());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public abstract C11346c[] mo35882a(C11217g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Collection<D> mo35883b(C11381l lVar, D d) {
        HashSet hashSet = new HashSet();
        if (d.mo35903t() != null && d.mo35903t().mo36092d(lVar)) {
            hashSet.add(d);
        }
        if (d.mo35906v()) {
            for (C11323c b : d.mo35897n()) {
                hashSet.addAll(mo35883b(lVar, b));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<D> mo35884c(C11397x xVar, D d) {
        Collection<C11335o> k = mo35894k(xVar, (C11396w) null, d);
        HashSet hashSet = new HashSet();
        for (C11335o d2 : k) {
            hashSet.add(d2.mo35983d());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public D mo35885d(C11365e0 e0Var, D d) {
        if (d.mo35899p() != null && d.mo35899p().mo35922b() != null && d.mo35899p().mo35922b().equals(e0Var)) {
            return d;
        }
        if (!d.mo35906v()) {
            return null;
        }
        for (C11323c d2 : d.mo35897n()) {
            D d3 = mo35885d(e0Var, d2);
            if (d3 != null) {
                return d3;
            }
        }
        return null;
    }

    /* renamed from: e */
    public abstract D mo35886e(C11365e0 e0Var);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f22455a.equals(((C11323c) obj).f22455a);
    }

    /* renamed from: f */
    public D[] mo35888f(C11381l lVar) {
        return mo35880E(mo35883b(lVar, this));
    }

    /* renamed from: g */
    public D[] mo35889g(C11397x xVar) {
        return mo35880E(mo35884c(xVar, this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Collection<D> mo35890h(D d) {
        HashSet hashSet = new HashSet();
        if (!d.mo35909z() && d.mo35899p().mo35922b() != null) {
            hashSet.add(d);
        }
        if (d.mo35906v()) {
            for (C11323c h : d.mo35897n()) {
                hashSet.addAll(mo35890h(h));
            }
        }
        return hashSet;
    }

    public int hashCode() {
        return this.f22455a.hashCode();
    }

    /* renamed from: i */
    public D[] mo35892i() {
        return mo35880E(mo35890h(this));
    }

    /* renamed from: j */
    public C11397x[] mo35893j() {
        Collection<C11335o> k = mo35894k((C11397x) null, (C11396w) null, this);
        HashSet hashSet = new HashSet();
        for (C11335o g : k) {
            hashSet.add(g.mo35986g());
        }
        return (C11397x[]) hashSet.toArray(new C11397x[hashSet.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Collection<S> mo35894k(C11397x xVar, C11396w wVar, D d) {
        HashSet hashSet = new HashSet();
        if (d.mo35908x()) {
            for (C11335o oVar : d.mo35902s()) {
                if (m29578y(oVar, xVar, wVar)) {
                    hashSet.add(oVar);
                }
            }
        }
        Collection<C11323c> h = mo35890h(d);
        if (h != null) {
            for (C11323c cVar : h) {
                if (cVar.mo35908x()) {
                    for (C11335o oVar2 : cVar.mo35902s()) {
                        if (m29578y(oVar2, xVar, wVar)) {
                            hashSet.add(oVar2);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: l */
    public C11324d mo35895l() {
        return this.f22458d;
    }

    /* renamed from: m */
    public C11324d mo35896m(C11343c cVar) {
        return mo35895l();
    }

    /* renamed from: n */
    public abstract D[] mo35897n();

    /* renamed from: o */
    public C11326f[] mo35898o() {
        return this.f22459e;
    }

    /* renamed from: p */
    public DI mo35899p() {
        return this.f22455a;
    }

    /* renamed from: q */
    public D mo35900q() {
        return this.f22462h;
    }

    /* renamed from: r */
    public abstract D mo35901r();

    /* renamed from: s */
    public abstract S[] mo35902s();

    /* renamed from: t */
    public C11381l mo35903t() {
        return this.f22457c;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Identity: " + mo35899p().toString() + ", Root: " + mo35909z();
    }

    /* renamed from: u */
    public C11340t mo35905u() {
        return this.f22456b;
    }

    /* renamed from: v */
    public boolean mo35906v() {
        return mo35897n() != null && mo35897n().length > 0;
    }

    /* renamed from: w */
    public boolean mo35907w() {
        return mo35898o() != null && mo35898o().length > 0;
    }

    /* renamed from: x */
    public boolean mo35908x() {
        return mo35902s() != null && mo35902s().length > 0;
    }

    /* renamed from: z */
    public boolean mo35909z() {
        return mo35900q() == null;
    }
}
