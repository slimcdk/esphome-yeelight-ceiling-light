package p240z6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import p200p6.C10276b;
import p210s6.C10376d;
import p214t6.C10404d;
import p222v6.C10553g;
import p230x6.C12006c;

/* renamed from: z6.e */
public class C12202e extends C12006c<C10030d, C10031e> {

    /* renamed from: g */
    private static final Logger f22535g = Logger.getLogger(C12202e.class.getName());

    public C12202e(C10010b bVar, C10030d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10031e mo42604f() {
        C10553g gVar = (C10553g) mo42600d().getRegistry().mo24917B(C10553g.class, ((C10030d) mo42599c()).mo40435v());
        if (gVar == null) {
            Logger logger = f22535g;
            logger.fine("No local resource found: " + mo42599c());
            return null;
        }
        Logger logger2 = f22535g;
        logger2.fine("Found local event subscription matching relative request URI: " + ((C10030d) mo42599c()).mo40435v());
        C10376d dVar = new C10376d((C10030d) mo42599c(), (C10404d) gVar.mo42211a());
        if (dVar.mo41976y() == null || (!dVar.mo41975A() && !dVar.mo41977z())) {
            C10276b f = mo42600d().getRegistry().mo24941f(dVar.mo41976y());
            if (f == null) {
                logger2.fine("Invalid subscription ID for unsubscribe request: " + mo42599c());
                return new C10031e(UpnpResponse.Status.PRECONDITION_FAILED);
            }
            logger2.fine("Unregistering subscription: " + f);
            if (mo42600d().getRegistry().mo24948m(f)) {
                f.mo41773N((CancelReason) null);
            } else {
                logger2.fine("Subscription was already removed from registry");
            }
            return new C10031e(UpnpResponse.Status.OK);
        }
        logger2.fine("Subscription ID and NT or Callback in unsubcribe request: " + mo42599c());
        return new C10031e(UpnpResponse.Status.BAD_REQUEST);
    }
}
