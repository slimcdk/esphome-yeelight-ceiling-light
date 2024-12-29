package p164h.p165b.p166a.p170k.p172e;

import java.util.logging.Logger;
import p164h.p165b.p166a.p168i.C11400a;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.k.e.o */
public abstract class C11493o implements Runnable {

    /* renamed from: c */
    private static Logger f22845c = Logger.getLogger(C11493o.class.getName());

    /* renamed from: a */
    protected final C4429b f22846a;

    /* renamed from: b */
    protected C11402e f22847b;

    protected C11493o(C4429b bVar) {
        this.f22846a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo36373C(Throwable th) {
        C11402e eVar = this.f22847b;
        if (eVar != null) {
            eVar.mo36163i(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo36374J(C11244e eVar) {
        C11402e eVar2 = this.f22847b;
        if (eVar2 != null) {
            eVar2.mo36164j(eVar);
        }
    }

    /* renamed from: c */
    public C4429b mo36375c() {
        return this.f22846a;
    }

    /* renamed from: g */
    public C11244e mo36376g(C11243d dVar) {
        Logger logger = f22845c;
        logger.fine("Processing stream request message: " + dVar);
        try {
            this.f22847b = mo36375c().mo24385g(dVar);
            Logger logger2 = f22845c;
            logger2.fine("Running protocol for synchronous message processing: " + this.f22847b);
            this.f22847b.run();
            C11244e g = this.f22847b.mo36161g();
            if (g == null) {
                f22845c.finer("Protocol did not return any response message");
                return null;
            }
            Logger logger3 = f22845c;
            logger3.finer("Protocol returned response: " + g);
            return g;
        } catch (C11400a e) {
            Logger logger4 = f22845c;
            logger4.warning("Processing stream request failed - " + C11495a.m30173a(e).toString());
            return new C11244e(C11252j.C11253a.NOT_IMPLEMENTED);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
