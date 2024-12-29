package p164h.p165b.p166a.p168i.p255j;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11405h;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11277c;
import p164h.p165b.p166a.p240h.p243r.p246m.C11281g;
import p164h.p165b.p166a.p240h.p248s.C11334n;

/* renamed from: h.b.a.i.j.h */
public class C11423h extends C11405h<C11281g, C11277c> {

    /* renamed from: f */
    private static final Logger f22721f = Logger.getLogger(C11423h.class.getName());

    /* renamed from: e */
    protected final C11239d f22722e;

    /* renamed from: h.b.a.i.j.h$a */
    class C11424a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11277c f22723a;

        C11424a(C11277c cVar) {
            this.f22723a = cVar;
        }

        public void run() {
            C11423h.this.f22722e.mo35737R(C11236a.RENEWAL_FAILED, (C11252j) this.f22723a.mo35776k());
        }
    }

    /* renamed from: h.b.a.i.j.h$b */
    class C11425b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11277c f22725a;

        C11425b(C11277c cVar) {
            this.f22725a = cVar;
        }

        public void run() {
            C11423h.this.f22722e.mo35737R(C11236a.RENEWAL_FAILED, (C11252j) this.f22725a.mo35776k());
        }
    }

    /* renamed from: h.b.a.i.j.h$c */
    class C11426c implements Runnable {
        C11426c() {
        }

        public void run() {
            C11423h.this.f22722e.mo35737R(C11236a.RENEWAL_FAILED, (C11252j) null);
        }
    }

    public C11423h(C4423b bVar, C11239d dVar) {
        super(bVar, new C11281g(dVar, bVar.getConfiguration().getEventSubscriptionHeaders((C11334n) dVar.mo35723N())));
        this.f22722e = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C11277c mo36176d() {
        Executor registryListenerExecutor;
        Runnable bVar;
        Logger logger = f22721f;
        logger.fine("Sending subscription renewal request: " + mo36177e());
        try {
            C11244e d = mo36173c().getRouter().mo24453d(mo36177e());
            if (d == null) {
                mo36215h();
                return null;
            }
            C11277c cVar = new C11277c(d);
            if (((C11252j) d.mo35776k()).mo35798f()) {
                Logger logger2 = f22721f;
                logger2.fine("Subscription renewal failed, response was: " + d);
                mo36173c().getRegistry().mo24435z(this.f22722e);
                registryListenerExecutor = mo36173c().getConfiguration().getRegistryListenerExecutor();
                bVar = new C11424a(cVar);
            } else if (!cVar.mo35835w()) {
                f22721f.severe("Subscription renewal failed, invalid or missing (SID, Timeout) response headers");
                registryListenerExecutor = mo36173c().getConfiguration().getRegistryListenerExecutor();
                bVar = new C11425b(cVar);
            } else {
                Logger logger3 = f22721f;
                logger3.fine("Subscription renewed, updating in registry, response was: " + d);
                this.f22722e.mo35725P(cVar.mo35833u());
                mo36173c().getRegistry().mo24419l(this.f22722e);
                return cVar;
            }
            registryListenerExecutor.execute(bVar);
            return cVar;
        } catch (C11451b e) {
            mo36215h();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo36215h() {
        f22721f.fine("Subscription renewal failed, removing subscription from registry");
        mo36173c().getRegistry().mo24435z(this.f22722e);
        mo36173c().getConfiguration().getRegistryListenerExecutor().execute(new C11426c());
    }
}
