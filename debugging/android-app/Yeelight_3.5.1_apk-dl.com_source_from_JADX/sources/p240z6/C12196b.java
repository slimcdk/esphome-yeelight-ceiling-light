package p240z6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.UpnpResponse;
import p200p6.C10277c;
import p210s6.C10373a;
import p210s6.C10378f;
import p214t6.C10409i;
import p222v6.C10552f;
import p230x6.C12006c;

/* renamed from: z6.b */
public class C12196b extends C12006c<C10030d, C10378f> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f22526g = Logger.getLogger(C12196b.class.getName());

    /* renamed from: z6.b$a */
    class C12197a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10277c f22527a;

        /* renamed from: b */
        final /* synthetic */ UnsupportedDataException f22528b;

        C12197a(C12196b bVar, C10277c cVar, UnsupportedDataException unsupportedDataException) {
            this.f22527a = cVar;
            this.f22528b = unsupportedDataException;
        }

        public void run() {
            this.f22527a.mo38941V(this.f22528b);
        }
    }

    /* renamed from: z6.b$b */
    class C12198b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10277c f22529a;

        /* renamed from: b */
        final /* synthetic */ C10373a f22530b;

        C12198b(C12196b bVar, C10277c cVar, C10373a aVar) {
            this.f22529a = cVar;
            this.f22530b = aVar;
        }

        public void run() {
            C12196b.f22526g.fine("Calling active subscription with event state variable values");
            this.f22529a.mo41786W(this.f22530b.mo41966y(), this.f22530b.mo41963A());
        }
    }

    public C12196b(C10010b bVar, C10030d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C10378f mo42604f() {
        if (!((C10030d) mo42599c()).mo40410q()) {
            Logger logger = f22526g;
            logger.warning("Received without or with invalid Content-Type: " + mo42599c());
        }
        C10552f fVar = (C10552f) mo42600d().getRegistry().mo24917B(C10552f.class, ((C10030d) mo42599c()).mo40435v());
        if (fVar == null) {
            Logger logger2 = f22526g;
            logger2.fine("No local resource found: " + mo42599c());
            return new C10378f(new UpnpResponse(UpnpResponse.Status.NOT_FOUND));
        }
        C10373a aVar = new C10373a((C10030d) mo42599c(), (C10409i) fVar.mo42211a());
        if (aVar.mo41964B() == null) {
            Logger logger3 = f22526g;
            logger3.fine("Subscription ID missing in event request: " + mo42599c());
            return new C10378f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        } else if (!aVar.mo41965C()) {
            Logger logger4 = f22526g;
            logger4.fine("Missing NT and/or NTS headers in event request: " + mo42599c());
            return new C10378f(new UpnpResponse(UpnpResponse.Status.BAD_REQUEST));
        } else if (!aVar.mo41965C()) {
            Logger logger5 = f22526g;
            logger5.fine("Invalid NT and/or NTS headers in event request: " + mo42599c());
            return new C10378f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        } else if (aVar.mo41966y() == null) {
            Logger logger6 = f22526g;
            logger6.fine("Sequence missing in event request: " + mo42599c());
            return new C10378f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        } else {
            try {
                mo42600d().getConfiguration().getGenaEventProcessor().mo24983b(aVar);
                C10277c h = mo42600d().getRegistry().mo24943h(aVar.mo41964B());
                if (h == null) {
                    Logger logger7 = f22526g;
                    logger7.severe("Invalid subscription ID, no active subscription: " + aVar);
                    return new C10378f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
                }
                mo42600d().getConfiguration().getRegistryListenerExecutor().execute(new C12198b(this, h, aVar));
                return new C10378f();
            } catch (UnsupportedDataException e) {
                Logger logger8 = f22526g;
                logger8.fine("Can't read event message request body, " + e);
                C10277c b = mo42600d().getRegistry().mo24937b(aVar.mo41964B());
                if (b != null) {
                    mo42600d().getConfiguration().getRegistryListenerExecutor().execute(new C12197a(this, b, e));
                }
                return new C10378f(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR));
            }
        }
    }
}
