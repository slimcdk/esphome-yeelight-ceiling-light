package p164h.p165b.p166a.p240h.p241p;

import java.util.LinkedHashMap;
import java.util.Map;
import p164h.p165b.p166a.p240h.p248s.C11320a;
import p164h.p165b.p166a.p240h.p248s.C11321b;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p249t.C11341a;

/* renamed from: h.b.a.h.p.f */
public class C11232f<S extends C11335o> {

    /* renamed from: a */
    protected final C11320a<S> f22322a;

    /* renamed from: b */
    protected final C11341a f22323b;

    /* renamed from: c */
    protected Map<String, C11228b<S>> f22324c;

    /* renamed from: d */
    protected Map<String, C11228b<S>> f22325d;

    /* renamed from: e */
    protected C11230d f22326e;

    public C11232f(C11230d dVar) {
        this.f22324c = new LinkedHashMap();
        this.f22325d = new LinkedHashMap();
        this.f22326e = null;
        this.f22322a = null;
        this.f22324c = null;
        this.f22325d = null;
        this.f22326e = dVar;
        this.f22323b = null;
    }

    public C11232f(C11320a<S> aVar) {
        this(aVar, (C11228b<S>[]) null, (C11228b<S>[]) null, (C11341a) null);
    }

    public C11232f(C11320a<S> aVar, C11228b<S>[] bVarArr, C11228b<S>[] bVarArr2, C11341a aVar2) {
        this.f22324c = new LinkedHashMap();
        this.f22325d = new LinkedHashMap();
        this.f22326e = null;
        if (aVar != null) {
            this.f22322a = aVar;
            mo35712m(bVarArr);
            mo35714o(bVarArr2);
            this.f22323b = aVar2;
            return;
        }
        throw new IllegalArgumentException("Action can not be null");
    }

    /* renamed from: a */
    public C11320a<S> mo35700a() {
        return this.f22322a;
    }

    /* renamed from: b */
    public C11341a mo35701b() {
        return this.f22323b;
    }

    /* renamed from: c */
    public C11230d mo35702c() {
        return this.f22326e;
    }

    /* renamed from: d */
    public C11228b<S> mo35703d(String str) {
        return mo35704e(mo35705f(str));
    }

    /* renamed from: e */
    public C11228b<S> mo35704e(C11321b<S> bVar) {
        return this.f22324c.get(bVar.mo35869e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11321b<S> mo35705f(String str) {
        C11321b<S> b = mo35700a().mo35854b(str);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    /* renamed from: g */
    public C11228b<S> mo35706g(String str) {
        return mo35707h(mo35708i(str));
    }

    /* renamed from: h */
    public C11228b<S> mo35707h(C11321b<S> bVar) {
        return this.f22325d.get(bVar.mo35869e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11321b<S> mo35708i(String str) {
        C11321b<S> e = mo35700a().mo35857e(str);
        if (e != null) {
            return e;
        }
        throw new IllegalArgumentException("Argument not found: " + str);
    }

    /* renamed from: j */
    public void mo35709j(C11230d dVar) {
        this.f22326e = dVar;
    }

    /* renamed from: k */
    public void mo35710k(String str, Object obj) {
        mo35711l(new C11228b(mo35705f(str), obj));
    }

    /* renamed from: l */
    public void mo35711l(C11228b<S> bVar) {
        this.f22324c.put(bVar.mo35698d().mo35869e(), bVar);
    }

    /* renamed from: m */
    public void mo35712m(C11228b<S>[] bVarArr) {
        if (bVarArr != null) {
            for (C11228b<S> bVar : bVarArr) {
                this.f22324c.put(bVar.mo35698d().mo35869e(), bVar);
            }
        }
    }

    /* renamed from: n */
    public void mo35713n(C11228b<S> bVar) {
        this.f22325d.put(bVar.mo35698d().mo35869e(), bVar);
    }

    /* renamed from: o */
    public void mo35714o(C11228b<S>[] bVarArr) {
        if (bVarArr != null) {
            for (C11228b<S> bVar : bVarArr) {
                this.f22325d.put(bVar.mo35698d().mo35869e(), bVar);
            }
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + mo35700a();
    }
}
