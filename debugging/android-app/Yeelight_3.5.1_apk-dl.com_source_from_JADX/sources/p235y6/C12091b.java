package p235y6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.C10015c;
import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.C10040c0;
import org.fourthline.cling.model.message.header.C10043e;
import org.fourthline.cling.model.message.header.C10052m;
import org.fourthline.cling.model.message.header.C10058s;
import org.fourthline.cling.model.message.header.C10059t;
import org.fourthline.cling.model.message.header.C10061v;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import p206r6.C10299b;
import p206r6.C10307j;
import p206r6.C10308k;
import p206r6.C10309l;
import p206r6.C10310m;
import p206r6.C10311n;
import p214t6.C10403c;
import p230x6.C12005b;

/* renamed from: y6.b */
public class C12091b extends C12005b<C10299b> {

    /* renamed from: e */
    private static final Logger f22145e;

    /* renamed from: f */
    private static final boolean f22146f;

    /* renamed from: d */
    protected final Random f22147d = new Random();

    static {
        Logger logger = Logger.getLogger(C12091b.class.getName());
        f22145e = logger;
        f22146f = logger.isLoggable(Level.FINE);
    }

    public C12091b(C10010b bVar, C10028b<UpnpRequest> bVar2) {
        super(bVar, new C10299b(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42598b() {
        Logger logger;
        String str;
        StringBuilder sb;
        String str2;
        if (mo42600d().getRouter() == null) {
            logger = f22145e;
            str = "Router hasn't completed initialization, ignoring received search message";
        } else {
            if (!((C10299b) mo42599c()).mo41846z()) {
                logger = f22145e;
                sb = new StringBuilder();
                str2 = "Invalid search request, no or invalid MAN ssdp:discover header: ";
            } else {
                UpnpHeader y = ((C10299b) mo42599c()).mo41845y();
                if (y == null) {
                    logger = f22145e;
                    sb = new StringBuilder();
                    str2 = "Invalid search request, did not contain ST header: ";
                } else {
                    List<C10020h> c = mo42600d().getRouter().mo24968c(((C10299b) mo42599c()).mo40429u());
                    if (c.size() == 0) {
                        logger = f22145e;
                        str = "Aborting search response, no active stream servers found (network disabled?)";
                    } else {
                        for (C10020h k : c) {
                            mo42796k(y, k);
                        }
                        return;
                    }
                }
            }
            sb.append(str2);
            sb.append(mo42599c());
            str = sb.toString();
        }
        logger.fine(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo42601e() {
        Integer x = ((C10299b) mo42599c()).mo41844x();
        if (x == null) {
            Logger logger = f22145e;
            logger.fine("Invalid search request, did not contain MX header: " + mo42599c());
            return false;
        }
        if (x.intValue() > 120 || x.intValue() <= 0) {
            x = C10052m.f18546c;
        }
        if (mo42600d().getRegistry().mo24920E().size() <= 0) {
            return true;
        }
        int nextInt = this.f22147d.nextInt(x.intValue() * 1000);
        Logger logger2 = f22145e;
        logger2.fine("Sleeping " + nextInt + " milliseconds to avoid flooding with search responses");
        Thread.sleep((long) nextInt);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<C10307j> mo42791f(C10403c cVar, C10020h hVar) {
        ArrayList<C10307j> arrayList = new ArrayList<>();
        if (cVar.mo40516z()) {
            arrayList.add(new C10309l((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar));
        }
        arrayList.add(new C10311n((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar));
        arrayList.add(new C10308k((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar));
        for (C10307j j : arrayList) {
            mo42795j(j);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public List<C10307j> mo42792g(C10403c cVar, C10020h hVar) {
        ArrayList arrayList = new ArrayList();
        for (C10098s mVar : cVar.mo40500j()) {
            C10310m mVar2 = new C10310m((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar, mVar);
            mo42795j(mVar2);
            arrayList.add(mVar2);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C10017e mo42793h(C10020h hVar, C10403c cVar) {
        return new C10017e(hVar, mo42600d().getConfiguration().getNamespace().mo40356f(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo42794i(C10403c cVar) {
        C10015c p = mo42600d().getRegistry().mo24951p(cVar.mo40506p().mo42058b());
        return p != null && !p.mo40336a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo42795j(C10307j jVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo42796k(UpnpHeader upnpHeader, C10020h hVar) {
        if (upnpHeader instanceof C10059t) {
            mo42797l(hVar);
        } else if (upnpHeader instanceof C10058s) {
            mo42799n(hVar);
        } else if (upnpHeader instanceof C10040c0) {
            mo42801q((C10105z) upnpHeader.mo40449b(), hVar);
        } else if (upnpHeader instanceof C10043e) {
            mo42798m((C10089j) upnpHeader.mo40449b(), hVar);
        } else if (upnpHeader instanceof C10061v) {
            mo42800o((C10098s) upnpHeader.mo40449b(), hVar);
        } else {
            Logger logger = f22145e;
            logger.warning("Non-implemented search request target: " + upnpHeader.getClass());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo42797l(C10020h hVar) {
        if (f22146f) {
            f22145e.fine("Responding to 'all' search with advertisement messages for all local devices");
        }
        for (C10403c next : mo42600d().getRegistry().mo24920E()) {
            if (!mo42794i(next)) {
                if (f22146f) {
                    f22145e.finer("Sending root device messages: " + next);
                }
                for (C10307j a : mo42791f(next, hVar)) {
                    mo42600d().getRouter().mo24966a(a);
                }
                if (next.mo40513v()) {
                    for (C10403c cVar : (C10403c[]) next.mo40499i()) {
                        if (f22146f) {
                            f22145e.finer("Sending embedded device messages: " + cVar);
                        }
                        for (C10307j a2 : mo42791f(cVar, hVar)) {
                            mo42600d().getRouter().mo24966a(a2);
                        }
                    }
                }
                List<C10307j> g = mo42792g(next, hVar);
                if (g.size() > 0) {
                    if (f22146f) {
                        f22145e.finer("Sending service type messages");
                    }
                    for (C10307j a3 : g) {
                        mo42600d().getRouter().mo24966a(a3);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo42798m(C10089j jVar, C10020h hVar) {
        Logger logger = f22145e;
        logger.fine("Responding to device type search: " + jVar);
        for (C10067b next : mo42600d().getRegistry().mo24953q(jVar)) {
            if (next instanceof C10403c) {
                C10403c cVar = (C10403c) next;
                if (!mo42794i(cVar)) {
                    Logger logger2 = f22145e;
                    logger2.finer("Sending matching device type search result for: " + next);
                    C10308k kVar = new C10308k((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar);
                    mo42795j(kVar);
                    mo42600d().getRouter().mo24966a(kVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo42799n(C10020h hVar) {
        f22145e.fine("Responding to root device search with advertisement messages for all local root devices");
        for (C10403c next : mo42600d().getRegistry().mo24920E()) {
            if (!mo42794i(next)) {
                C10309l lVar = new C10309l((C10028b) mo42599c(), mo42793h(hVar, next), next);
                mo42795j(lVar);
                mo42600d().getRouter().mo24966a(lVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo42800o(C10098s sVar, C10020h hVar) {
        Logger logger = f22145e;
        logger.fine("Responding to service type search: " + sVar);
        for (C10067b next : mo42600d().getRegistry().mo24946k(sVar)) {
            if (next instanceof C10403c) {
                C10403c cVar = (C10403c) next;
                if (!mo42794i(cVar)) {
                    Logger logger2 = f22145e;
                    logger2.finer("Sending matching service type search result: " + next);
                    C10310m mVar = new C10310m((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar, sVar);
                    mo42795j(mVar);
                    mo42600d().getRouter().mo24966a(mVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo42801q(C10105z zVar, C10020h hVar) {
        C10067b s = mo42600d().getRegistry().mo24955s(zVar, false);
        if (s != null && (s instanceof C10403c)) {
            C10403c cVar = (C10403c) s;
            if (!mo42794i(cVar)) {
                Logger logger = f22145e;
                logger.fine("Responding to UDN device search: " + zVar);
                C10311n nVar = new C10311n((C10028b) mo42599c(), mo42793h(hVar, cVar), cVar);
                mo42795j(nVar);
                mo42600d().getRouter().mo24966a(nVar);
            }
        }
    }
}
