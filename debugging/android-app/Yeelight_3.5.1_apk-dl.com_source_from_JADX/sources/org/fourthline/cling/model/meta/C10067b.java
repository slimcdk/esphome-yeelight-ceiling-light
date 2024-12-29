package org.fourthline.cling.model.meta;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10070e;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10097r;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import p214t6.C10401a;
import p214t6.C10402b;
import p214t6.C10413m;
import p218u6.C10542c;
import p222v6.C10549c;

/* renamed from: org.fourthline.cling.model.meta.b */
public abstract class C10067b<DI extends C10402b, D extends C10067b, S extends C10070e> {

    /* renamed from: i */
    private static final Logger f18564i = Logger.getLogger(C10067b.class.getName());

    /* renamed from: a */
    private final DI f18565a;

    /* renamed from: b */
    private final C10413m f18566b;

    /* renamed from: c */
    private final C10089j f18567c;

    /* renamed from: d */
    private final C10401a f18568d;

    /* renamed from: e */
    private final C10068c[] f18569e;

    /* renamed from: f */
    protected final S[] f18570f;

    /* renamed from: g */
    protected final D[] f18571g;

    /* renamed from: h */
    private D f18572h;

    public C10067b(DI di) {
        this(di, (C10089j) null, (C10401a) null, (C10068c[]) null, (S[]) null, (D[]) null);
    }

    public C10067b(DI di, C10089j jVar, C10401a aVar, C10068c[] cVarArr, S[] sArr) {
        this(di, (C10413m) null, jVar, aVar, cVarArr, sArr, (D[]) null);
    }

    public C10067b(DI di, C10089j jVar, C10401a aVar, C10068c[] cVarArr, S[] sArr, D[] dArr) {
        this(di, (C10413m) null, jVar, aVar, cVarArr, sArr, dArr);
    }

    public C10067b(DI di, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, S[] sArr, D[] dArr) {
        boolean z;
        this.f18565a = di;
        this.f18566b = mVar == null ? new C10413m() : mVar;
        this.f18567c = jVar;
        this.f18568d = aVar;
        ArrayList arrayList = new ArrayList();
        if (cVarArr != null) {
            for (C10068c cVar : cVarArr) {
                if (cVar != null) {
                    cVar.mo40525i(this);
                    List<C10023k> j = cVar.mo40526j();
                    if (j.isEmpty()) {
                        arrayList.add(cVar);
                    } else {
                        f18564i.warning("Discarding invalid '" + cVar + "': " + j);
                    }
                }
            }
        }
        this.f18569e = (C10068c[]) arrayList.toArray(new C10068c[arrayList.size()]);
        boolean z2 = true;
        if (sArr != null) {
            z = true;
            for (S s : sArr) {
                if (s != null) {
                    s.mo40539l(this);
                    z = false;
                }
            }
        } else {
            z = true;
        }
        this.f18570f = (sArr == null || z) ? null : sArr;
        if (dArr != null) {
            for (D d : dArr) {
                if (d != null) {
                    d.mo40486D(this);
                    z2 = false;
                }
            }
        }
        this.f18571g = (dArr == null || z2) ? null : dArr;
        List<C10023k> F = mo40488F();
        if (F.size() > 0) {
            if (f18564i.isLoggable(Level.FINEST)) {
                for (C10023k kVar : F) {
                    f18564i.finest(kVar.toString());
                }
            }
            throw new ValidationException("Validation of device graph failed, call getErrors() on exception", F);
        }
    }

    /* renamed from: y */
    private boolean m25004y(C10070e eVar, C10098s sVar, C10097r rVar) {
        return (sVar == null || eVar.mo40534g().mo40646d(sVar)) && (rVar == null || eVar.mo40533f().equals(rVar));
    }

    /* renamed from: A */
    public abstract D mo40483A(C10105z zVar, C10413m mVar, C10089j jVar, C10401a aVar, C10068c[] cVarArr, S[] sArr, List<D> list);

    /* renamed from: B */
    public abstract S mo40484B(C10098s sVar, C10097r rVar, URI uri, URI uri2, URI uri3, C10066a<S>[] aVarArr, C10071f<S>[] fVarArr);

    /* renamed from: C */
    public abstract S[] mo40485C(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo40486D(D d) {
        if (this.f18572h == null) {
            this.f18572h = d;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: E */
    public abstract D[] mo40487E(Collection<D> collection);

    /* renamed from: F */
    public List<C10023k> mo40488F() {
        ArrayList arrayList = new ArrayList();
        if (mo40510t() != null) {
            arrayList.addAll(mo40512u().mo42121c());
            if (mo40506p() != null) {
                arrayList.addAll(mo40506p().mo42059c());
            }
            if (mo40502l() != null) {
                arrayList.addAll(mo40502l().mo42056k());
            }
            if (mo40515x()) {
                for (C10070e eVar : mo40509s()) {
                    if (eVar != null) {
                        arrayList.addAll(eVar.mo40540m());
                    }
                }
            }
            if (mo40513v()) {
                for (C10067b bVar : mo40504n()) {
                    if (bVar != null) {
                        arrayList.addAll(bVar.mo40488F());
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public abstract C10549c[] mo40489a(C10019g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Collection<D> mo40490b(C10089j jVar, D d) {
        HashSet hashSet = new HashSet();
        if (d.mo40510t() != null && d.mo40510t().mo40613d(jVar)) {
            hashSet.add(d);
        }
        if (d.mo40513v()) {
            for (C10067b b : d.mo40504n()) {
                hashSet.addAll(mo40490b(jVar, b));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<D> mo40491c(C10098s sVar, D d) {
        Collection<C10070e> k = mo40501k(sVar, (C10097r) null, d);
        HashSet hashSet = new HashSet();
        for (C10070e d2 : k) {
            hashSet.add(d2.mo40531d());
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public D mo40492d(C10105z zVar, D d) {
        if (d.mo40506p() != null && d.mo40506p().mo42058b() != null && d.mo40506p().mo42058b().equals(zVar)) {
            return d;
        }
        if (!d.mo40513v()) {
            return null;
        }
        for (C10067b d2 : d.mo40504n()) {
            D d3 = mo40492d(zVar, d2);
            if (d3 != null) {
                return d3;
            }
        }
        return null;
    }

    /* renamed from: e */
    public abstract D mo40493e(C10105z zVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f18565a.equals(((C10067b) obj).f18565a);
    }

    /* renamed from: f */
    public D[] mo40495f(C10089j jVar) {
        return mo40487E(mo40490b(jVar, this));
    }

    /* renamed from: g */
    public D[] mo40496g(C10098s sVar) {
        return mo40487E(mo40491c(sVar, this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Collection<D> mo40497h(D d) {
        HashSet hashSet = new HashSet();
        if (!d.mo40516z() && d.mo40506p().mo42058b() != null) {
            hashSet.add(d);
        }
        if (d.mo40513v()) {
            for (C10067b h : d.mo40504n()) {
                hashSet.addAll(mo40497h(h));
            }
        }
        return hashSet;
    }

    public int hashCode() {
        return this.f18565a.hashCode();
    }

    /* renamed from: i */
    public D[] mo40499i() {
        return mo40487E(mo40497h(this));
    }

    /* renamed from: j */
    public C10098s[] mo40500j() {
        Collection<C10070e> k = mo40501k((C10098s) null, (C10097r) null, this);
        HashSet hashSet = new HashSet();
        for (C10070e g : k) {
            hashSet.add(g.mo40534g());
        }
        return (C10098s[]) hashSet.toArray(new C10098s[hashSet.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Collection<S> mo40501k(C10098s sVar, C10097r rVar, D d) {
        HashSet hashSet = new HashSet();
        if (d.mo40515x()) {
            for (C10070e eVar : d.mo40509s()) {
                if (m25004y(eVar, sVar, rVar)) {
                    hashSet.add(eVar);
                }
            }
        }
        Collection<C10067b> h = mo40497h(d);
        if (h != null) {
            for (C10067b bVar : h) {
                if (bVar.mo40515x()) {
                    for (C10070e eVar2 : bVar.mo40509s()) {
                        if (m25004y(eVar2, sVar, rVar)) {
                            hashSet.add(eVar2);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: l */
    public C10401a mo40502l() {
        return this.f18568d;
    }

    /* renamed from: m */
    public C10401a mo40503m(C10542c cVar) {
        return mo40502l();
    }

    /* renamed from: n */
    public abstract D[] mo40504n();

    /* renamed from: o */
    public C10068c[] mo40505o() {
        return this.f18569e;
    }

    /* renamed from: p */
    public DI mo40506p() {
        return this.f18565a;
    }

    /* renamed from: q */
    public D mo40507q() {
        return this.f18572h;
    }

    /* renamed from: r */
    public abstract D mo40508r();

    /* renamed from: s */
    public abstract S[] mo40509s();

    /* renamed from: t */
    public C10089j mo40510t() {
        return this.f18567c;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Identity: " + mo40506p().toString() + ", Root: " + mo40516z();
    }

    /* renamed from: u */
    public C10413m mo40512u() {
        return this.f18566b;
    }

    /* renamed from: v */
    public boolean mo40513v() {
        return mo40504n() != null && mo40504n().length > 0;
    }

    /* renamed from: w */
    public boolean mo40514w() {
        return mo40505o() != null && mo40505o().length > 0;
    }

    /* renamed from: x */
    public boolean mo40515x() {
        return mo40509s() != null && mo40509s().length > 0;
    }

    /* renamed from: z */
    public boolean mo40516z() {
        return mo40507q() == null;
    }
}
