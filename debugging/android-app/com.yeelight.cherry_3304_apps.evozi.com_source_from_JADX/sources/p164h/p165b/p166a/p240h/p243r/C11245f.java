package p164h.p165b.p166a.p240h.p243r;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p257c.p258a.C11494a;

/* renamed from: h.b.a.h.r.f */
public class C11245f extends C11494a {

    /* renamed from: d */
    private static final Logger f22352d = Logger.getLogger(C11245f.class.getName());

    /* renamed from: c */
    protected Map<C11296f0.C11297a, List<C11296f0>> f22353c;

    public C11245f() {
    }

    public C11245f(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    public C11245f(Map<String, List<String>> map) {
        super(map);
    }

    public C11245f(boolean z) {
        super(z);
    }

    /* renamed from: a */
    public void mo35754a(String str, String str2) {
        this.f22353c = null;
        super.mo35754a(str, str2);
    }

    public void clear() {
        this.f22353c = null;
        super.clear();
    }

    /* renamed from: g */
    public List<String> put(String str, List<String> list) {
        this.f22353c = null;
        return super.put(str, list);
    }

    /* renamed from: j */
    public List<String> remove(Object obj) {
        this.f22353c = null;
        return super.remove(obj);
    }

    /* renamed from: l */
    public void mo35758l(C11296f0.C11297a aVar, C11296f0 f0Var) {
        super.mo35754a(aVar.mo35849c(), f0Var.mo35841a());
        if (this.f22353c != null) {
            mo35759m(aVar, f0Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo35759m(C11296f0.C11297a aVar, C11296f0 f0Var) {
        if (f22352d.isLoggable(Level.FINE)) {
            Logger logger = f22352d;
            logger.fine("Adding parsed header: " + f0Var);
        }
        List list = this.f22353c.get(aVar);
        if (list == null) {
            list = new LinkedList();
            this.f22353c.put(aVar, list);
        }
        list.add(f0Var);
    }

    /* renamed from: n */
    public boolean mo35760n(C11296f0.C11297a aVar) {
        if (this.f22353c == null) {
            mo35767s();
        }
        return this.f22353c.containsKey(aVar);
    }

    /* renamed from: o */
    public C11296f0[] mo35761o(C11296f0.C11297a aVar) {
        if (this.f22353c == null) {
            mo35767s();
        }
        return this.f22353c.get(aVar) != null ? (C11296f0[]) this.f22353c.get(aVar).toArray(new C11296f0[this.f22353c.get(aVar).size()]) : new C11296f0[0];
    }

    /* renamed from: p */
    public C11296f0 mo35762p(C11296f0.C11297a aVar) {
        if (mo35761o(aVar).length > 0) {
            return mo35761o(aVar)[0];
        }
        return null;
    }

    /* renamed from: q */
    public <H extends C11296f0> H mo35764q(C11296f0.C11297a aVar, Class<H> cls) {
        H[] o = mo35761o(aVar);
        if (o.length == 0) {
            return null;
        }
        for (H h : o) {
            if (cls.isAssignableFrom(h.getClass())) {
                return h;
            }
        }
        return null;
    }

    /* renamed from: r */
    public String mo35765r(C11296f0.C11297a aVar) {
        C11296f0 p = mo35762p(aVar);
        if (p != null) {
            return p.mo35841a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo35767s() {
        this.f22353c = new LinkedHashMap();
        if (f22352d.isLoggable(Level.FINE)) {
            Logger logger = f22352d;
            logger.fine("Parsing all HTTP headers for known UPnP headers: " + size());
        }
        for (Map.Entry next : entrySet()) {
            if (next.getKey() != null) {
                C11296f0.C11297a a = C11296f0.C11297a.m29511a((String) next.getKey());
                if (a != null) {
                    for (String str : (List) next.getValue()) {
                        C11296f0 c = C11296f0.m29506c(a, str);
                        if (c != null && c.mo35845b() != null) {
                            mo35759m(a, c);
                        } else if (f22352d.isLoggable(Level.FINE)) {
                            Logger logger2 = f22352d;
                            logger2.fine("Ignoring known but irrelevant header (value violates the UDA specification?) '" + a.mo35849c() + "': " + str);
                        }
                    }
                } else if (f22352d.isLoggable(Level.FINE)) {
                    Logger logger3 = f22352d;
                    logger3.fine("Ignoring non-UPNP HTTP header: " + ((String) next.getKey()));
                }
            }
        }
    }
}
