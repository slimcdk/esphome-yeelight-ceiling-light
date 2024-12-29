package p164h.p165b.p166a.p240h.p248s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p252w.C11374j;
import p164h.p165b.p166a.p240h.p252w.C11396w;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.h.s.o */
public abstract class C11335o<D extends C11323c, S extends C11335o> {

    /* renamed from: f */
    private static final Logger f22502f = Logger.getLogger(C11335o.class.getName());

    /* renamed from: a */
    private final C11397x f22503a;

    /* renamed from: b */
    private final C11396w f22504b;

    /* renamed from: c */
    private final Map<String, C11320a> f22505c = new HashMap();

    /* renamed from: d */
    private final Map<String, C11336p> f22506d = new HashMap();

    /* renamed from: e */
    private D f22507e;

    public C11335o(C11397x xVar, C11396w wVar, C11320a<S>[] aVarArr, C11336p<S>[] pVarArr) {
        this.f22503a = xVar;
        this.f22504b = wVar;
        if (aVarArr != null) {
            for (C11320a<S> aVar : aVarArr) {
                this.f22505c.put(aVar.mo35856d(), aVar);
                aVar.mo35862j(this);
            }
        }
        if (pVarArr != null) {
            for (C11336p<S> pVar : pVarArr) {
                this.f22506d.put(pVar.mo35994b(), pVar);
                pVar.mo35998f(this);
            }
        }
    }

    /* renamed from: a */
    public C11320a<S> mo35980a(String str) {
        Map<String, C11320a> map = this.f22505c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: b */
    public C11320a<S>[] mo35981b() {
        Map<String, C11320a> map = this.f22505c;
        if (map == null) {
            return null;
        }
        return (C11320a[]) map.values().toArray(new C11320a[this.f22505c.values().size()]);
    }

    /* renamed from: c */
    public C11374j<S> mo35982c(C11321b bVar) {
        return mo35984e(bVar).mo35996d().mo36013d();
    }

    /* renamed from: d */
    public D mo35983d() {
        return this.f22507e;
    }

    /* renamed from: e */
    public C11336p<S> mo35984e(C11321b bVar) {
        return mo35987h(bVar.mo35870f());
    }

    /* renamed from: f */
    public C11396w mo35985f() {
        return this.f22504b;
    }

    /* renamed from: g */
    public C11397x mo35986g() {
        return this.f22503a;
    }

    /* renamed from: h */
    public C11336p<S> mo35987h(String str) {
        if ("VirtualQueryActionInput".equals(str)) {
            return new C11336p<>("VirtualQueryActionInput", new C11339s(C11374j.C11375a.STRING.mo36078b()));
        }
        if ("VirtualQueryActionOutput".equals(str)) {
            return new C11336p<>("VirtualQueryActionOutput", new C11339s(C11374j.C11375a.STRING.mo36078b()));
        }
        Map<String, C11336p> map = this.f22506d;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: i */
    public C11336p<S>[] mo35988i() {
        Map<String, C11336p> map = this.f22506d;
        if (map == null) {
            return null;
        }
        return (C11336p[]) map.values().toArray(new C11336p[this.f22506d.values().size()]);
    }

    /* renamed from: j */
    public boolean mo35989j() {
        return mo35981b() != null && mo35981b().length > 0;
    }

    /* renamed from: k */
    public boolean mo35990k() {
        return mo35988i() != null && mo35988i().length > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo35991l(D d) {
        if (this.f22507e == null) {
            this.f22507e = d;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: m */
    public List<C11222l> mo35992m() {
        ArrayList arrayList = new ArrayList();
        if (mo35986g() == null) {
            arrayList.add(new C11222l(getClass(), "serviceType", "Service type/info is required"));
        }
        if (mo35985f() == null) {
            arrayList.add(new C11222l(getClass(), "serviceId", "Service ID is required"));
        }
        if (mo35990k()) {
            for (C11336p g : mo35988i()) {
                arrayList.addAll(g.mo35999g());
            }
        }
        if (mo35989j()) {
            for (C11320a aVar : mo35981b()) {
                List<C11222l> k = aVar.mo35863k();
                if (k.size() > 0) {
                    this.f22505c.remove(aVar.mo35856d());
                    f22502f.warning("Discarding invalid action of service '" + mo35985f() + "': " + aVar.mo35856d());
                    for (C11222l lVar : k) {
                        f22502f.warning("Invalid action '" + aVar.mo35856d() + "': " + lVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") ServiceId: " + mo35985f();
    }
}
