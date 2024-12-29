package p235y6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.C10023k;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.types.C10105z;
import p206r6.C10298a;
import p214t6.C10407g;
import p214t6.C10408h;
import p230x6.C12005b;
import p230x6.C12007d;

/* renamed from: y6.a */
public class C12090a extends C12005b<C10298a> {

    /* renamed from: d */
    private static final Logger f22144d = Logger.getLogger(C12090a.class.getName());

    public C12090a(C10010b bVar, C10028b<UpnpRequest> bVar2) {
        super(bVar, new C10298a(bVar2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42598b() {
        C10105z A = ((C10298a) mo42599c()).mo41838A();
        if (A == null) {
            Logger logger = f22144d;
            logger.fine("Ignoring notification message without UDN: " + mo42599c());
            return;
        }
        C10408h hVar = new C10408h((C10298a) mo42599c());
        Logger logger2 = f22144d;
        logger2.fine("Received device notification: " + hVar);
        try {
            C10407g gVar = new C10407g(hVar);
            if (((C10298a) mo42599c()).mo41839B()) {
                logger2.fine("Received device ALIVE advertisement, descriptor location is: " + hVar.mo42097d());
                if (hVar.mo42097d() == null) {
                    logger2.finer("Ignoring message without location URL header: " + mo42599c());
                } else if (hVar.mo42057a() == null) {
                    logger2.finer("Ignoring message without max-age header: " + mo42599c());
                } else if (mo42600d().getRegistry().mo24962y(hVar)) {
                    logger2.finer("Remote device was already known: " + A);
                } else {
                    mo42600d().getConfiguration().getAsyncProtocolExecutor().execute(new C12007d(mo42600d(), gVar));
                }
            } else if (((C10298a) mo42599c()).mo41840C()) {
                logger2.fine("Received device BYEBYE advertisement");
                if (mo42600d().getRegistry().mo24945j(gVar)) {
                    logger2.fine("Removed remote device from registry: " + gVar);
                }
            } else {
                logger2.finer("Ignoring unknown notification message: " + mo42599c());
            }
        } catch (ValidationException e) {
            Logger logger3 = f22144d;
            logger3.warning("Validation errors of device during discovery: " + hVar);
            for (C10023k kVar : e.getErrors()) {
                f22144d.warning(kVar.toString());
            }
        }
    }
}
