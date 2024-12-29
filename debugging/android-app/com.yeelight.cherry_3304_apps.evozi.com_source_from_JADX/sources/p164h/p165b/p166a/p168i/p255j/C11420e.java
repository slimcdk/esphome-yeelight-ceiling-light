package p164h.p165b.p166a.p168i.p255j;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11278d;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p250u.C11350g;

/* renamed from: h.b.a.i.j.e */
public class C11420e extends C11402e<C11243d, C11244e> {

    /* renamed from: g */
    private static final Logger f22714g = Logger.getLogger(C11420e.class.getName());

    public C11420e(C4423b bVar, C11243d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11244e mo36160f() {
        C11350g gVar = (C11350g) mo36156d().getRegistry().mo24401B(C11350g.class, ((C11243d) mo36155c()).mo35751v());
        if (gVar == null) {
            Logger logger = f22714g;
            logger.fine("No local resource found: " + mo36155c());
            return null;
        }
        Logger logger2 = f22714g;
        logger2.fine("Found local event subscription matching relative request URI: " + ((C11243d) mo36155c()).mo35751v());
        C11278d dVar = new C11278d((C11243d) mo36155c(), (C11328h) gVar.mo36026a());
        if (dVar.mo35837y() == null || (!dVar.mo35836A() && !dVar.mo35838z())) {
            C11238c f = mo36156d().getRegistry().mo24413f(dVar.mo35837y());
            if (f == null) {
                Logger logger3 = f22714g;
                logger3.fine("Invalid subscription ID for unsubscribe request: " + mo36155c());
                return new C11244e(C11252j.C11253a.PRECONDITION_FAILED);
            }
            Logger logger4 = f22714g;
            logger4.fine("Unregistering subscription: " + f);
            if (mo36156d().getRegistry().mo24433x(f)) {
                f.mo35729R((C11236a) null);
            } else {
                f22714g.fine("Subscription was already removed from registry");
            }
            return new C11244e(C11252j.C11253a.OK);
        }
        Logger logger5 = f22714g;
        logger5.fine("Subscription ID and NT or Callback in unsubcribe request: " + mo36155c());
        return new C11244e(C11252j.C11253a.BAD_REQUEST);
    }
}
