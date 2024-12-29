package p164h.p165b.p166a.p168i.p254i;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11401d;
import p164h.p165b.p166a.p240h.C11213c;
import p164h.p165b.p166a.p240h.C11215e;
import p164h.p165b.p166a.p240h.C11218h;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.p245l.C11262b;
import p164h.p165b.p166a.p240h.p243r.p245l.C11270j;
import p164h.p165b.p166a.p240h.p243r.p245l.C11271k;
import p164h.p165b.p166a.p240h.p243r.p245l.C11272l;
import p164h.p165b.p166a.p240h.p243r.p245l.C11273m;
import p164h.p165b.p166a.p240h.p243r.p245l.C11274n;
import p164h.p165b.p166a.p240h.p243r.p247n.C11292d0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11293e;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11307n;
import p164h.p165b.p166a.p240h.p243r.p247n.C11313t;
import p164h.p165b.p166a.p240h.p243r.p247n.C11314u;
import p164h.p165b.p166a.p240h.p243r.p247n.C11316w;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.i.i.b */
public class C11407b extends C11401d<C11262b> {

    /* renamed from: e */
    private static final Logger f22693e;

    /* renamed from: f */
    private static final boolean f22694f;

    /* renamed from: d */
    protected final Random f22695d = new Random();

    static {
        Logger logger = Logger.getLogger(C11407b.class.getName());
        f22693e = logger;
        f22694f = logger.isLoggable(Level.FINE);
    }

    public C11407b(C4423b bVar, C11241b<C11249i> bVar2) {
        super(bVar, new C11262b(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36154b() {
        Logger logger;
        String str;
        StringBuilder sb;
        String str2;
        if (mo36156d().getRouter() == null) {
            logger = f22693e;
            str = "Router hasn't completed initialization, ignoring received search message";
        } else {
            if (!((C11262b) mo36155c()).mo35818z()) {
                logger = f22693e;
                sb = new StringBuilder();
                str2 = "Invalid search request, no or invalid MAN ssdp:discover header: ";
            } else {
                C11296f0 y = ((C11262b) mo36155c()).mo35817y();
                if (y == null) {
                    logger = f22693e;
                    sb = new StringBuilder();
                    str2 = "Invalid search request, did not contain ST header: ";
                } else {
                    List<C11218h> c = mo36156d().getRouter().mo24452c(((C11262b) mo36155c()).mo35744u());
                    if (c.size() == 0) {
                        logger = f22693e;
                        str = "Aborting search response, no active stream servers found (network disabled?)";
                    } else {
                        for (C11218h k : c) {
                            mo36184k(y, k);
                        }
                        return;
                    }
                }
            }
            sb.append(str2);
            sb.append(mo36155c());
            str = sb.toString();
        }
        logger.fine(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo36157e() {
        Integer x = ((C11262b) mo36155c()).mo35816x();
        if (x == null) {
            Logger logger = f22693e;
            logger.fine("Invalid search request, did not contain MX header: " + mo36155c());
            return false;
        }
        if (x.intValue() > 120 || x.intValue() <= 0) {
            x = C11307n.f22436c;
        }
        if (mo36156d().getRegistry().mo24405F().size() <= 0) {
            return true;
        }
        int nextInt = this.f22695d.nextInt(x.intValue() * 1000);
        Logger logger2 = f22693e;
        logger2.fine("Sleeping " + nextInt + " milliseconds to avoid flooding with search responses");
        Thread.sleep((long) nextInt);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<C11270j> mo36179f(C11327g gVar, C11218h hVar) {
        ArrayList<C11270j> arrayList = new ArrayList<>();
        if (gVar.mo35909z()) {
            arrayList.add(new C11272l((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar));
        }
        arrayList.add(new C11274n((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar));
        arrayList.add(new C11271k((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar));
        for (C11270j j : arrayList) {
            mo36183j(j);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public List<C11270j> mo36180g(C11327g gVar, C11218h hVar) {
        ArrayList arrayList = new ArrayList();
        for (C11397x mVar : gVar.mo35893j()) {
            C11273m mVar2 = new C11273m((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar, mVar);
            mo36183j(mVar2);
            arrayList.add(mVar2);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C11215e mo36181h(C11218h hVar, C11327g gVar) {
        return new C11215e(hVar, mo36156d().getConfiguration().getNamespace().mo35651f(gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo36182i(C11327g gVar) {
        C11213c p = mo36156d().getRegistry().mo24423p(gVar.mo35899p().mo35922b());
        return p != null && !p.mo35631a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo36183j(C11270j jVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo36184k(C11296f0 f0Var, C11218h hVar) {
        if (f0Var instanceof C11314u) {
            mo36185l(hVar);
        } else if (f0Var instanceof C11313t) {
            mo36187n(hVar);
        } else if (f0Var instanceof C11292d0) {
            mo36189p((C11365e0) f0Var.mo35845b(), hVar);
        } else if (f0Var instanceof C11293e) {
            mo36186m((C11381l) f0Var.mo35845b(), hVar);
        } else if (f0Var instanceof C11316w) {
            mo36188o((C11397x) f0Var.mo35845b(), hVar);
        } else {
            Logger logger = f22693e;
            logger.warning("Non-implemented search request target: " + f0Var.getClass());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo36185l(C11218h hVar) {
        if (f22694f) {
            f22693e.fine("Responding to 'all' search with advertisement messages for all local devices");
        }
        for (C11327g next : mo36156d().getRegistry().mo24405F()) {
            if (!mo36182i(next)) {
                if (f22694f) {
                    f22693e.finer("Sending root device messages: " + next);
                }
                for (C11270j a : mo36179f(next, hVar)) {
                    mo36156d().getRouter().mo24450a(a);
                }
                if (next.mo35906v()) {
                    for (C11327g gVar : (C11327g[]) next.mo35892i()) {
                        if (f22694f) {
                            f22693e.finer("Sending embedded device messages: " + gVar);
                        }
                        for (C11270j a2 : mo36179f(gVar, hVar)) {
                            mo36156d().getRouter().mo24450a(a2);
                        }
                    }
                }
                List<C11270j> g = mo36180g(next, hVar);
                if (g.size() > 0) {
                    if (f22694f) {
                        f22693e.finer("Sending service type messages");
                    }
                    for (C11270j a3 : g) {
                        mo36156d().getRouter().mo24450a(a3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo36186m(C11381l lVar, C11218h hVar) {
        Logger logger = f22693e;
        logger.fine("Responding to device type search: " + lVar);
        for (C11323c next : mo36156d().getRegistry().mo24425q(lVar)) {
            if (next instanceof C11327g) {
                C11327g gVar = (C11327g) next;
                if (!mo36182i(gVar)) {
                    Logger logger2 = f22693e;
                    logger2.finer("Sending matching device type search result for: " + next);
                    C11271k kVar = new C11271k((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar);
                    mo36183j(kVar);
                    mo36156d().getRouter().mo24450a(kVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo36187n(C11218h hVar) {
        f22693e.fine("Responding to root device search with advertisement messages for all local root devices");
        for (C11327g next : mo36156d().getRegistry().mo24405F()) {
            if (!mo36182i(next)) {
                C11272l lVar = new C11272l((C11241b) mo36155c(), mo36181h(hVar, next), next);
                mo36183j(lVar);
                mo36156d().getRouter().mo24450a(lVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo36188o(C11397x xVar, C11218h hVar) {
        Logger logger = f22693e;
        logger.fine("Responding to service type search: " + xVar);
        for (C11323c next : mo36156d().getRegistry().mo24417j(xVar)) {
            if (next instanceof C11327g) {
                C11327g gVar = (C11327g) next;
                if (!mo36182i(gVar)) {
                    Logger logger2 = f22693e;
                    logger2.finer("Sending matching service type search result: " + next);
                    C11273m mVar = new C11273m((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar, xVar);
                    mo36183j(mVar);
                    mo36156d().getRouter().mo24450a(mVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo36189p(C11365e0 e0Var, C11218h hVar) {
        C11323c s = mo36156d().getRegistry().mo24427s(e0Var, false);
        if (s != null && (s instanceof C11327g)) {
            C11327g gVar = (C11327g) s;
            if (!mo36182i(gVar)) {
                Logger logger = f22693e;
                logger.fine("Responding to UDN device search: " + e0Var);
                C11274n nVar = new C11274n((C11241b) mo36155c(), mo36181h(hVar, gVar), gVar);
                mo36183j(nVar);
                mo36156d().getRouter().mo24450a(nVar);
            }
        }
    }
}
