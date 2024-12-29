package p164h.p165b.p166a.p168i.p254i;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11404g;
import p164h.p165b.p166a.p240h.C11215e;
import p164h.p165b.p166a.p240h.C11218h;
import p164h.p165b.p166a.p240h.p243r.p245l.C11264d;
import p164h.p165b.p166a.p240h.p243r.p245l.C11265e;
import p164h.p165b.p166a.p240h.p243r.p245l.C11266f;
import p164h.p165b.p166a.p240h.p243r.p245l.C11267g;
import p164h.p165b.p166a.p240h.p243r.p245l.C11268h;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p252w.C11394u;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.i.i.d */
public abstract class C11409d extends C11404g {

    /* renamed from: d */
    private static final Logger f22697d = Logger.getLogger(C11409d.class.getName());

    /* renamed from: c */
    private C11327g f22698c;

    public C11409d(C4423b bVar, C11327g gVar) {
        super(bVar);
        this.f22698c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36172b() {
        List<C11218h> c = mo36173c().getRouter().mo24452c((InetAddress) null);
        if (c.size() == 0) {
            f22697d.fine("Aborting notifications, no active stream servers found (network disabled?)");
            return;
        }
        ArrayList<C11215e> arrayList = new ArrayList<>();
        for (C11218h eVar : c) {
            arrayList.add(new C11215e(eVar, mo36173c().getConfiguration().getNamespace().mo35651f(mo36194h())));
        }
        for (int i = 0; i < mo36193g(); i++) {
            try {
                for (C11215e j : arrayList) {
                    mo36196j(j);
                }
                Logger logger = f22697d;
                logger.finer("Sleeping " + mo36192f() + " milliseconds");
                Thread.sleep((long) mo36192f());
            } catch (InterruptedException e) {
                Logger logger2 = f22697d;
                logger2.warning("Advertisement thread was interrupted: " + e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public List<C11264d> mo36190d(C11327g gVar, C11215e eVar) {
        ArrayList arrayList = new ArrayList();
        if (gVar.mo35909z()) {
            arrayList.add(new C11266f(eVar, gVar, mo36195i()));
        }
        arrayList.add(new C11268h(eVar, gVar, mo36195i()));
        arrayList.add(new C11265e(eVar, gVar, mo36195i()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<C11264d> mo36191e(C11327g gVar, C11215e eVar) {
        ArrayList arrayList = new ArrayList();
        for (C11397x gVar2 : gVar.mo35893j()) {
            arrayList.add(new C11267g(eVar, gVar, mo36195i(), gVar2));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo36192f() {
        return 150;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo36193g() {
        return 3;
    }

    /* renamed from: h */
    public C11327g mo36194h() {
        return this.f22698c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C11394u mo36195i();

    /* renamed from: j */
    public void mo36196j(C11215e eVar) {
        f22697d.finer("Sending root device messages: " + mo36194h());
        for (C11264d a : mo36190d(mo36194h(), eVar)) {
            mo36173c().getRouter().mo24450a(a);
        }
        if (mo36194h().mo35906v()) {
            for (C11327g gVar : (C11327g[]) mo36194h().mo35892i()) {
                f22697d.finer("Sending embedded device messages: " + gVar);
                for (C11264d a2 : mo36190d(gVar, eVar)) {
                    mo36173c().getRouter().mo24450a(a2);
                }
            }
        }
        List<C11264d> e = mo36191e(mo36194h(), eVar);
        if (e.size() > 0) {
            f22697d.finer("Sending service type messages");
            for (C11264d a3 : e) {
                mo36173c().getRouter().mo24450a(a3);
            }
        }
    }
}
