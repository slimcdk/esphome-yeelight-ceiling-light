package p148d7;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.seamless.util.C10243a;
import p230x6.C12004a;
import p230x6.C12006c;

/* renamed from: d7.m */
public abstract class C8963m implements Runnable {

    /* renamed from: c */
    private static Logger f16460c = Logger.getLogger(C8963m.class.getName());

    /* renamed from: a */
    protected final C12004a f16461a;

    /* renamed from: b */
    protected C12006c f16462b;

    protected C8963m(C12004a aVar) {
        this.f16461a = aVar;
    }

    /* renamed from: I */
    public C10031e mo36808I(C10030d dVar) {
        Logger logger = f16460c;
        logger.fine("Processing stream request message: " + dVar);
        try {
            this.f16462b = mo36811e().mo24902h(dVar);
            Logger logger2 = f16460c;
            logger2.fine("Running protocol for synchronous message processing: " + this.f16462b);
            this.f16462b.run();
            C10031e g = this.f16462b.mo42605g();
            if (g == null) {
                f16460c.finer("Protocol did not return any response message");
                return null;
            }
            Logger logger3 = f16460c;
            logger3.finer("Protocol returned response: " + g);
            return g;
        } catch (ProtocolCreationException e) {
            Logger logger4 = f16460c;
            logger4.warning("Processing stream request failed - " + C10243a.m25753a(e).toString());
            return new C10031e(UpnpResponse.Status.NOT_IMPLEMENTED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo36809J(Throwable th) {
        C12006c cVar = this.f16462b;
        if (cVar != null) {
            cVar.mo42607i(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo36810K(C10031e eVar) {
        C12006c cVar = this.f16462b;
        if (cVar != null) {
            cVar.mo42608j(eVar);
        }
    }

    /* renamed from: e */
    public C12004a mo36811e() {
        return this.f16461a;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
