package p164h.p165b.p166a.p168i.p255j;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11275a;
import p164h.p165b.p166a.p240h.p243r.p246m.C11280f;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p250u.C11349f;

/* renamed from: h.b.a.i.j.b */
public class C11414b extends C11402e<C11243d, C11280f> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f22705g = Logger.getLogger(C11414b.class.getName());

    /* renamed from: h.b.a.i.j.b$a */
    class C11415a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11239d f22706a;

        /* renamed from: b */
        final /* synthetic */ C11221k f22707b;

        C11415a(C11414b bVar, C11239d dVar, C11221k kVar) {
            this.f22706a = dVar;
            this.f22707b = kVar;
        }

        public void run() {
            this.f22706a.mo35613Z(this.f22707b);
        }
    }

    /* renamed from: h.b.a.i.j.b$b */
    class C11416b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11239d f22708a;

        /* renamed from: b */
        final /* synthetic */ C11275a f22709b;

        C11416b(C11414b bVar, C11239d dVar, C11275a aVar) {
            this.f22708a = dVar;
            this.f22709b = aVar;
        }

        public void run() {
            C11414b.f22705g.fine("Calling active subscription with event state variable values");
            this.f22708a.mo35742a0(this.f22709b.mo35827y(), this.f22709b.mo35824A());
        }
    }

    public C11414b(C4423b bVar, C11243d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11280f mo36160f() {
        if (!((C11243d) mo36155c()).mo35782q()) {
            Logger logger = f22705g;
            logger.warning("Received without or with invalid Content-Type: " + mo36155c());
        }
        C11349f fVar = (C11349f) mo36156d().getRegistry().mo24401B(C11349f.class, ((C11243d) mo36155c()).mo35751v());
        if (fVar == null) {
            Logger logger2 = f22705g;
            logger2.fine("No local resource found: " + mo36155c());
            return new C11280f(new C11252j(C11252j.C11253a.NOT_FOUND));
        }
        C11275a aVar = new C11275a((C11243d) mo36155c(), (C11334n) fVar.mo36026a());
        if (aVar.mo35825B() == null) {
            Logger logger3 = f22705g;
            logger3.fine("Subscription ID missing in event request: " + mo36155c());
            return new C11280f(new C11252j(C11252j.C11253a.PRECONDITION_FAILED));
        } else if (!aVar.mo35826C()) {
            Logger logger4 = f22705g;
            logger4.fine("Missing NT and/or NTS headers in event request: " + mo36155c());
            return new C11280f(new C11252j(C11252j.C11253a.BAD_REQUEST));
        } else if (!aVar.mo35826C()) {
            Logger logger5 = f22705g;
            logger5.fine("Invalid NT and/or NTS headers in event request: " + mo36155c());
            return new C11280f(new C11252j(C11252j.C11253a.PRECONDITION_FAILED));
        } else if (aVar.mo35827y() == null) {
            Logger logger6 = f22705g;
            logger6.fine("Sequence missing in event request: " + mo36155c());
            return new C11280f(new C11252j(C11252j.C11253a.PRECONDITION_FAILED));
        } else {
            try {
                mo36156d().getConfiguration().getGenaEventProcessor().mo24468b(aVar);
                C11239d h = mo36156d().getRegistry().mo24415h(aVar.mo35825B());
                if (h == null) {
                    Logger logger7 = f22705g;
                    logger7.severe("Invalid subscription ID, no active subscription: " + aVar);
                    return new C11280f(new C11252j(C11252j.C11253a.PRECONDITION_FAILED));
                }
                mo36156d().getConfiguration().getRegistryListenerExecutor().execute(new C11416b(this, h, aVar));
                return new C11280f();
            } catch (C11221k e) {
                Logger logger8 = f22705g;
                logger8.fine("Can't read event message request body, " + e);
                C11239d d = mo36156d().getRegistry().mo24411d(aVar.mo35825B());
                if (d != null) {
                    mo36156d().getConfiguration().getRegistryListenerExecutor().execute(new C11415a(this, d, e));
                }
                return new C11280f(new C11252j(C11252j.C11253a.INTERNAL_SERVER_ERROR));
            }
        }
    }
}
