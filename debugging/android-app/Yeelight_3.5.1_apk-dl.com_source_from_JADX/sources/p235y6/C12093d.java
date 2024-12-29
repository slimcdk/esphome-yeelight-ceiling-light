package p235y6;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.C10017e;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.NotificationSubtype;
import p206r6.C10301d;
import p206r6.C10302e;
import p206r6.C10303f;
import p206r6.C10304g;
import p206r6.C10305h;
import p214t6.C10403c;
import p230x6.C12008e;

/* renamed from: y6.d */
public abstract class C12093d extends C12008e {

    /* renamed from: d */
    private static final Logger f22149d = Logger.getLogger(C12093d.class.getName());

    /* renamed from: c */
    private C10403c f22150c;

    public C12093d(C10010b bVar, C10403c cVar) {
        super(bVar);
        this.f22150c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42616b() {
        List<C10020h> c = mo42617c().getRouter().mo24968c((InetAddress) null);
        if (c.size() == 0) {
            f22149d.fine("Aborting notifications, no active stream servers found (network disabled?)");
            return;
        }
        ArrayList<C10017e> arrayList = new ArrayList<>();
        for (C10020h eVar : c) {
            arrayList.add(new C10017e(eVar, mo42617c().getConfiguration().getNamespace().mo40356f(mo42806h())));
        }
        for (int i = 0; i < mo42805g(); i++) {
            try {
                for (C10017e j : arrayList) {
                    mo42808j(j);
                }
                Logger logger = f22149d;
                logger.finer("Sleeping " + mo42804f() + " milliseconds");
                Thread.sleep((long) mo42804f());
            } catch (InterruptedException e) {
                Logger logger2 = f22149d;
                logger2.warning("Advertisement thread was interrupted: " + e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<C10301d> mo42802d(C10403c cVar, C10017e eVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.mo40516z()) {
            arrayList.add(new C10303f(eVar, cVar, mo42807i()));
        }
        arrayList.add(new C10305h(eVar, cVar, mo42807i()));
        arrayList.add(new C10302e(eVar, cVar, mo42807i()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<C10301d> mo42803e(C10403c cVar, C10017e eVar) {
        ArrayList arrayList = new ArrayList();
        for (C10098s gVar : cVar.mo40500j()) {
            arrayList.add(new C10304g(eVar, cVar, mo42807i(), gVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo42804f() {
        return 150;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo42805g() {
        return 3;
    }

    /* renamed from: h */
    public C10403c mo42806h() {
        return this.f22150c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract NotificationSubtype mo42807i();

    /* renamed from: j */
    public void mo42808j(C10017e eVar) {
        f22149d.finer("Sending root device messages: " + mo42806h());
        for (C10301d a : mo42802d(mo42806h(), eVar)) {
            mo42617c().getRouter().mo24966a(a);
        }
        if (mo42806h().mo40513v()) {
            for (C10403c cVar : (C10403c[]) mo42806h().mo40499i()) {
                f22149d.finer("Sending embedded device messages: " + cVar);
                for (C10301d a2 : mo42802d(cVar, eVar)) {
                    mo42617c().getRouter().mo24966a(a2);
                }
            }
        }
        List<C10301d> e = mo42803e(mo42806h(), eVar);
        if (e.size() > 0) {
            f22149d.finer("Sending service type messages");
            for (C10301d a3 : e) {
                mo42617c().getRouter().mo24966a(a3);
            }
        }
    }
}
