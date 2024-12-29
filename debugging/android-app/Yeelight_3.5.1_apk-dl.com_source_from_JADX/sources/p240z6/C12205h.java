package p240z6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;
import p200p6.C10277c;
import p210s6.C10375c;
import p210s6.C10379g;
import p214t6.C10409i;
import p230x6.C12009f;

/* renamed from: z6.h */
public class C12205h extends C12009f<C10379g, C10375c> {

    /* renamed from: f */
    private static final Logger f22542f = Logger.getLogger(C12205h.class.getName());

    /* renamed from: e */
    protected final C10277c f22543e;

    /* renamed from: z6.h$a */
    class C12206a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10375c f22544a;

        C12206a(C10375c cVar) {
            this.f22544a = cVar;
        }

        public void run() {
            C12205h.this.f22543e.mo41781N(CancelReason.RENEWAL_FAILED, (UpnpResponse) this.f22544a.mo40404k());
        }
    }

    /* renamed from: z6.h$b */
    class C12207b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10375c f22546a;

        C12207b(C10375c cVar) {
            this.f22546a = cVar;
        }

        public void run() {
            C12205h.this.f22543e.mo41781N(CancelReason.RENEWAL_FAILED, (UpnpResponse) this.f22546a.mo40404k());
        }
    }

    /* renamed from: z6.h$c */
    class C12208c implements Runnable {
        C12208c() {
        }

        public void run() {
            C12205h.this.f22543e.mo41781N(CancelReason.RENEWAL_FAILED, (UpnpResponse) null);
        }
    }

    public C12205h(C10010b bVar, C10277c cVar) {
        super(bVar, new C10379g(cVar, bVar.getConfiguration().getEventSubscriptionHeaders((C10409i) cVar.mo41766J())));
        this.f22543e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C10375c mo42620d() {
        Executor registryListenerExecutor;
        Runnable bVar;
        Logger logger = f22542f;
        logger.fine("Sending subscription renewal request: " + mo42621e());
        try {
            C10031e d = mo42617c().getRouter().mo24969d(mo42621e());
            if (d == null) {
                mo43203h();
                return null;
            }
            C10375c cVar = new C10375c(d);
            if (((UpnpResponse) d.mo40404k()).mo40424f()) {
                logger.fine("Subscription renewal failed, response was: " + d);
                mo42617c().getRegistry().mo24949n(this.f22543e);
                registryListenerExecutor = mo42617c().getConfiguration().getRegistryListenerExecutor();
                bVar = new C12206a(cVar);
            } else if (!cVar.mo41974w()) {
                logger.severe("Subscription renewal failed, invalid or missing (SID, Timeout) response headers");
                registryListenerExecutor = mo42617c().getConfiguration().getRegistryListenerExecutor();
                bVar = new C12207b(cVar);
            } else {
                logger.fine("Subscription renewed, updating in registry, response was: " + d);
                this.f22543e.mo41768L(cVar.mo41972u());
                mo42617c().getRegistry().mo24916A(this.f22543e);
                return cVar;
            }
            registryListenerExecutor.execute(bVar);
            return cVar;
        } catch (RouterException e) {
            mo43203h();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43203h() {
        f22542f.fine("Subscription renewal failed, removing subscription from registry");
        mo42617c().getRegistry().mo24949n(this.f22543e);
        mo42617c().getConfiguration().getRegistryListenerExecutor().execute(new C12208c());
    }
}
