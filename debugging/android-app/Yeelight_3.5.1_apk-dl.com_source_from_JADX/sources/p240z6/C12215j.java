package p240z6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import p200p6.C10277c;
import p210s6.C10382j;
import p214t6.C10409i;
import p230x6.C12009f;

/* renamed from: z6.j */
public class C12215j extends C12009f<C10382j, C10031e> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f22558f = Logger.getLogger(C12215j.class.getName());

    /* renamed from: e */
    protected final C10277c f22559e;

    /* renamed from: z6.j$a */
    class C12216a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10031e f22560a;

        C12216a(C10031e eVar) {
            this.f22560a = eVar;
        }

        public void run() {
            C10277c cVar;
            C10031e eVar = this.f22560a;
            CancelReason cancelReason = null;
            if (eVar == null) {
                C12215j.f22558f.fine("Unsubscribe failed, no response received");
                C12215j.this.f22559e.mo41781N(CancelReason.UNSUBSCRIBE_FAILED, (UpnpResponse) null);
                return;
            }
            if (((UpnpResponse) eVar.mo40404k()).mo40424f()) {
                Logger g = C12215j.f22558f;
                g.fine("Unsubscribe failed, response was: " + this.f22560a);
                cVar = C12215j.this.f22559e;
                cancelReason = CancelReason.UNSUBSCRIBE_FAILED;
            } else {
                Logger g2 = C12215j.f22558f;
                g2.fine("Unsubscribe successful, response was: " + this.f22560a);
                cVar = C12215j.this.f22559e;
            }
            cVar.mo41781N(cancelReason, (UpnpResponse) this.f22560a.mo40404k());
        }
    }

    public C12215j(C10010b bVar, C10277c cVar) {
        super(bVar, new C10382j(cVar, bVar.getConfiguration().getEventSubscriptionHeaders((C10409i) cVar.mo41766J())));
        this.f22559e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10031e mo42620d() {
        Logger logger = f22558f;
        logger.fine("Sending unsubscribe request: " + mo42621e());
        try {
            C10031e d = mo42617c().getRouter().mo24969d(mo42621e());
            mo43214h(d);
            return d;
        } catch (Throwable th) {
            mo43214h((C10031e) null);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43214h(C10031e eVar) {
        mo42617c().getRegistry().mo24949n(this.f22559e);
        mo42617c().getConfiguration().getRegistryListenerExecutor().execute(new C12216a(eVar));
    }
}
