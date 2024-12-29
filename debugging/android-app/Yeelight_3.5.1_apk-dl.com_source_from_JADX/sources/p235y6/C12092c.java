package p235y6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.types.C10105z;
import p206r6.C10300c;
import p214t6.C10407g;
import p214t6.C10408h;
import p230x6.C12005b;
import p230x6.C12007d;

/* renamed from: y6.c */
public class C12092c extends C12005b<C10300c> {

    /* renamed from: d */
    private static final Logger f22148d = Logger.getLogger(C12092c.class.getName());

    public C12092c(C10010b bVar, C10028b<UpnpResponse> bVar2) {
        super(bVar, new C10300c(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42598b() {
        if (!((C10300c) mo42599c()).mo41848B()) {
            Logger logger = f22148d;
            logger.fine("Ignoring invalid search response message: " + mo42599c());
            return;
        }
        C10105z A = ((C10300c) mo42599c()).mo41847A();
        if (A == null) {
            Logger logger2 = f22148d;
            logger2.fine("Ignoring search response message without UDN: " + mo42599c());
            return;
        }
        C10408h hVar = new C10408h((C10300c) mo42599c());
        Logger logger3 = f22148d;
        logger3.fine("Received device search response: " + hVar);
        if (mo42600d().getRegistry().mo24962y(hVar)) {
            logger3.fine("Remote device was already known: " + A);
            return;
        }
        try {
            C10407g gVar = new C10407g(hVar);
            if (hVar.mo42097d() == null) {
                logger3.finer("Ignoring message without location URL header: " + mo42599c());
            } else if (hVar.mo42057a() == null) {
                logger3.finer("Ignoring message without max-age header: " + mo42599c());
            } else {
                mo42600d().getConfiguration().getAsyncProtocolExecutor().execute(new C12007d(mo42600d(), gVar));
            }
        } catch (ValidationException e) {
            Logger logger4 = f22148d;
            logger4.warning("Validation errors of device during discovery: " + hVar);
            for (C10023k kVar : e.getErrors()) {
                f22148d.warning(kVar.toString());
            }
        }
    }
}
