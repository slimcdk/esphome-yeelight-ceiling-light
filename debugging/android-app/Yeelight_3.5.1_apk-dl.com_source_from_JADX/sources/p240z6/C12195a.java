package p240z6;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionCancelledException;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.C10041d;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.ErrorCode;
import org.seamless.util.C10243a;
import p193o6.C9795g;
import p204q6.C10288d;
import p204q6.C10291g;
import p214t6.C10404d;
import p222v6.C10550d;
import p230x6.C12006c;

/* renamed from: z6.a */
public class C12195a extends C12006c<C10030d, C10031e> {

    /* renamed from: g */
    private static final Logger f22525g = Logger.getLogger(C12195a.class.getName());

    public C12195a(C10010b bVar, C10030d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C10031e mo42604f() {
        C9795g gVar;
        C10291g gVar2;
        C10041d dVar = (C10041d) ((C10030d) mo42599c()).mo40403j().mo40443q(UpnpHeader.Type.CONTENT_TYPE, C10041d.class);
        if (dVar == null || dVar.mo40457g()) {
            if (dVar == null) {
                Logger logger = f22525g;
                logger.warning("Received without Content-Type: " + mo42599c());
            }
            C10550d dVar2 = (C10550d) mo42600d().getRegistry().mo24917B(C10550d.class, ((C10030d) mo42599c()).mo40435v());
            if (dVar2 == null) {
                Logger logger2 = f22525g;
                logger2.fine("No local resource found: " + mo42599c());
                return null;
            }
            Logger logger3 = f22525g;
            logger3.fine("Found local action resource matching relative request URI: " + ((C10030d) mo42599c()).mo40435v());
            try {
                C10288d dVar3 = new C10288d((C10030d) mo42599c(), (C10404d) dVar2.mo42211a());
                logger3.finer("Created incoming action request message: " + dVar3);
                gVar = new C9795g(dVar3.mo41807y(), mo42606h());
                logger3.fine("Reading body of request message");
                mo42600d().getConfiguration().getSoapActionProcessor().mo24996d(dVar3, gVar);
                logger3.fine("Executing on local service: " + gVar);
                ((C10404d) dVar2.mo42211a()).mo42074p(gVar.mo38967a()).mo38959a(gVar);
                if (gVar.mo38969c() == null) {
                    gVar2 = new C10291g(gVar.mo38967a());
                } else if (gVar.mo38969c() instanceof ActionCancelledException) {
                    logger3.fine("Action execution was cancelled, returning 404 to client");
                    return null;
                } else {
                    gVar2 = new C10291g(UpnpResponse.Status.INTERNAL_SERVER_ERROR, gVar.mo38967a());
                }
            } catch (ActionException e) {
                Logger logger4 = f22525g;
                logger4.finer("Error executing local action: " + e);
                gVar = new C9795g(e, mo42606h());
                gVar2 = new C10291g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
            } catch (UnsupportedDataException e2) {
                Logger logger5 = f22525g;
                Level level = Level.WARNING;
                logger5.log(level, "Error reading action request XML body: " + e2.toString(), C10243a.m25753a(e2));
                gVar = new C9795g(C10243a.m25753a(e2) instanceof ActionException ? (ActionException) C10243a.m25753a(e2) : new ActionException(ErrorCode.ACTION_FAILED, e2.getMessage()), mo42606h());
                gVar2 = new C10291g(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
            }
            try {
                Logger logger6 = f22525g;
                logger6.fine("Writing body of response message");
                mo42600d().getConfiguration().getSoapActionProcessor().mo36803a(gVar2, gVar);
                logger6.fine("Returning finished response message: " + gVar2);
                return gVar2;
            } catch (UnsupportedDataException e3) {
                Logger logger7 = f22525g;
                logger7.warning("Failure writing body of response message, sending '500 Internal Server Error' without body");
                logger7.log(Level.WARNING, "Exception root cause: ", C10243a.m25753a(e3));
                return new C10031e(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
            }
        } else {
            Logger logger8 = f22525g;
            logger8.warning("Received invalid Content-Type '" + dVar + "': " + mo42599c());
            return new C10031e(new UpnpResponse(UpnpResponse.Status.UNSUPPORTED_MEDIA_TYPE));
        }
    }
}
