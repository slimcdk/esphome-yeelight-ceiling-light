package p164h.p165b.p166a.p240h.p248s;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.C11220j;
import p164h.p165b.p166a.p240h.p241p.C11231e;
import p164h.p165b.p166a.p240h.p251v.C11353c;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.s.h */
public class C11328h<T> extends C11335o<C11327g, C11328h> {

    /* renamed from: g */
    protected final Map<C11320a, C11231e> f22485g;

    /* renamed from: h */
    protected final Map<C11336p, C11353c> f22486h;

    /* renamed from: i */
    protected final Set<Class> f22487i;

    /* renamed from: j */
    protected final boolean f22488j;

    /* renamed from: k */
    protected C11220j f22489k;

    public C11328h(C11397x xVar, C11396w wVar, Map<C11320a, C11231e> map, Map<C11336p, C11353c> map2, Set<Class> set, boolean z) {
        super(xVar, wVar, (C11320a[]) map.keySet().toArray(new C11320a[map.size()]), (C11336p[]) map2.keySet().toArray(new C11336p[map2.size()]));
        this.f22488j = z;
        this.f22487i = set;
        this.f22486h = map2;
        this.f22485g = map;
    }

    public C11328h(C11397x xVar, C11396w wVar, C11320a[] aVarArr, C11336p[] pVarArr) {
        super(xVar, wVar, aVarArr, pVarArr);
        this.f22489k = null;
        this.f22485g = new HashMap();
        this.f22486h = new HashMap();
        this.f22487i = new HashSet();
        this.f22488j = true;
    }

    /* renamed from: n */
    public C11353c mo35947n(String str) {
        C11336p h = mo35987h(str);
        if (h != null) {
            return mo35948o(h);
        }
        return null;
    }

    /* renamed from: o */
    public C11353c mo35948o(C11336p pVar) {
        return this.f22486h.get(pVar);
    }

    /* renamed from: p */
    public C11231e mo35949p(C11320a aVar) {
        return this.f22485g.get(aVar);
    }

    /* renamed from: q */
    public synchronized C11220j<T> mo35950q() {
        if (this.f22489k != null) {
        } else {
            throw new IllegalStateException("Unmanaged service, no implementation instance available");
        }
        return this.f22489k;
    }

    /* renamed from: r */
    public Set<Class> mo35951r() {
        return this.f22487i;
    }

    /* renamed from: s */
    public boolean mo35952s(Class cls) {
        return C11216f.m29267d(mo35951r(), cls);
    }

    /* renamed from: t */
    public boolean mo35953t(Object obj) {
        return obj != null && mo35952s(obj.getClass());
    }

    public String toString() {
        return super.toString() + ", Manager: " + this.f22489k;
    }

    /* renamed from: u */
    public boolean mo35955u() {
        return this.f22488j;
    }

    /* renamed from: v */
    public synchronized void mo35956v(C11220j<T> jVar) {
        if (this.f22489k == null) {
            this.f22489k = jVar;
        } else {
            throw new IllegalStateException("Manager is final");
        }
    }
}
