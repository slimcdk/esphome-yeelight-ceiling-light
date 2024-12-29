package p164h.p165b.p166a.p168i.p255j;

import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p240h.C11221k;
import p164h.p165b.p166a.p240h.p241p.C11229c;
import p164h.p165b.p166a.p240h.p241p.C11230d;
import p164h.p165b.p166a.p240h.p241p.C11235i;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p244k.C11257d;
import p164h.p165b.p166a.p240h.p243r.p244k.C11260g;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p250u.C11347d;
import p164h.p165b.p166a.p240h.p252w.C11386n;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.j.a */
public class C11413a extends C11402e<C11243d, C11244e> {

    /* renamed from: g */
    private static final Logger f22704g = Logger.getLogger(C11413a.class.getName());

    public C11413a(C4423b bVar, C11243d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11244e mo36160f() {
        C11235i iVar;
        C11260g gVar;
        C11291d dVar = (C11291d) ((C11243d) mo36155c()).mo35747j().mo35764q(C11296f0.C11297a.CONTENT_TYPE, C11291d.class);
        if (dVar == null || dVar.mo35844g()) {
            if (dVar == null) {
                Logger logger = f22704g;
                logger.warning("Received without Content-Type: " + mo36155c());
            }
            C11347d dVar2 = (C11347d) mo36156d().getRegistry().mo24401B(C11347d.class, ((C11243d) mo36155c()).mo35751v());
            if (dVar2 == null) {
                Logger logger2 = f22704g;
                logger2.fine("No local resource found: " + mo36155c());
                return null;
            }
            Logger logger3 = f22704g;
            logger3.fine("Found local action resource matching relative request URI: " + ((C11243d) mo36155c()).mo35751v());
            try {
                C11257d dVar3 = new C11257d((C11243d) mo36155c(), (C11328h) dVar2.mo36026a());
                Logger logger4 = f22704g;
                logger4.finer("Created incoming action request message: " + dVar3);
                iVar = new C11235i(dVar3.mo35806y(), mo36162h());
                f22704g.fine("Reading body of request message");
                mo36156d().getConfiguration().getSoapActionProcessor().mo24492b(dVar3, iVar);
                Logger logger5 = f22704g;
                logger5.fine("Executing on local service: " + iVar);
                ((C11328h) dVar2.mo36026a()).mo35949p(iVar.mo35700a()).mo35692a(iVar);
                if (iVar.mo35702c() == null) {
                    gVar = new C11260g(iVar.mo35700a());
                } else if (iVar.mo35702c() instanceof C11229c) {
                    f22704g.fine("Action execution was cancelled, returning 404 to client");
                    return null;
                } else {
                    gVar = new C11260g(C11252j.C11253a.INTERNAL_SERVER_ERROR, iVar.mo35700a());
                }
            } catch (C11230d e) {
                Logger logger6 = f22704g;
                logger6.finer("Error executing local action: " + e);
                iVar = new C11235i(e, mo36162h());
                gVar = new C11260g(C11252j.C11253a.INTERNAL_SERVER_ERROR);
            } catch (C11221k e2) {
                Logger logger7 = f22704g;
                Level level = Level.WARNING;
                logger7.log(level, "Error reading action request XML body: " + e2.toString(), C11495a.m30173a(e2));
                iVar = new C11235i(C11495a.m30173a(e2) instanceof C11230d ? (C11230d) C11495a.m30173a(e2) : new C11230d(C11386n.ACTION_FAILED, e2.getMessage()), mo36162h());
                gVar = new C11260g(C11252j.C11253a.INTERNAL_SERVER_ERROR);
            }
            try {
                f22704g.fine("Writing body of response message");
                mo36156d().getConfiguration().getSoapActionProcessor().mo24500d(gVar, iVar);
                Logger logger8 = f22704g;
                logger8.fine("Returning finished response message: " + gVar);
                return gVar;
            } catch (C11221k e3) {
                f22704g.warning("Failure writing body of response message, sending '500 Internal Server Error' without body");
                f22704g.log(Level.WARNING, "Exception root cause: ", C11495a.m30173a(e3));
                return new C11244e(C11252j.C11253a.INTERNAL_SERVER_ERROR);
            }
        } else {
            Logger logger9 = f22704g;
            logger9.warning("Received invalid Content-Type '" + dVar + "': " + mo36155c());
            return new C11244e(new C11252j(C11252j.C11253a.UNSUPPORTED_MEDIA_TYPE));
        }
    }
}
