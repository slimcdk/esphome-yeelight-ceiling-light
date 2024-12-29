package p164h.p165b.p166a.p168i.p255j;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p237f.p239e.C11188d;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11291d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11315v;
import p164h.p165b.p166a.p240h.p248s.C11326f;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p250u.C11344a;
import p164h.p165b.p166a.p240h.p250u.C11345b;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p250u.C11348e;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.j.c */
public class C11417c extends C11402e<C11243d, C11244e> {

    /* renamed from: g */
    private static final Logger f22710g = Logger.getLogger(C11417c.class.getName());

    public C11417c(C4423b bVar, C11243d dVar) {
        super(bVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11244e mo36160f() {
        if (!((C11243d) mo36155c()).mo35780o()) {
            Logger logger = f22710g;
            logger.fine("Ignoring message, missing HOST header: " + mo36155c());
            return new C11244e(new C11252j(C11252j.C11253a.PRECONDITION_FAILED));
        }
        URI e = ((C11249i) ((C11243d) mo36155c()).mo35776k()).mo35791e();
        C11346c k = mo36156d().getRegistry().mo24418k(e);
        if (k != null || (k = mo36205l(e)) != null) {
            return mo36204k(e, k);
        }
        Logger logger2 = f22710g;
        logger2.fine("No local resource found: " + mo36155c());
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11244e mo36204k(URI uri, C11346c cVar) {
        C11244e eVar;
        try {
            if (C11344a.class.isAssignableFrom(cVar.getClass())) {
                Logger logger = f22710g;
                logger.fine("Found local device matching relative request URI: " + uri);
                eVar = new C11244e(mo36156d().getConfiguration().getDeviceDescriptorBinderUDA10().mo35550b((C11327g) cVar.mo36026a(), mo36162h(), mo36156d().getConfiguration().getNamespace()), new C11291d(C11291d.f22400c));
            } else if (C11348e.class.isAssignableFrom(cVar.getClass())) {
                Logger logger2 = f22710g;
                logger2.fine("Found local service matching relative request URI: " + uri);
                eVar = new C11244e(mo36156d().getConfiguration().getServiceDescriptorBinderUDA10().mo35556b((C11328h) cVar.mo36026a()), new C11291d(C11291d.f22400c));
            } else if (C11345b.class.isAssignableFrom(cVar.getClass())) {
                Logger logger3 = f22710g;
                logger3.fine("Found local icon matching relative request URI: " + uri);
                C11326f fVar = (C11326f) cVar.mo36026a();
                eVar = new C11244e(fVar.mo35928b(), fVar.mo35932f());
            } else {
                Logger logger4 = f22710g;
                logger4.fine("Ignoring GET for found local resource: " + cVar);
                return null;
            }
        } catch (C11188d e) {
            Logger logger5 = f22710g;
            logger5.warning("Error generating requested device/service descriptor: " + e.toString());
            f22710g.log(Level.WARNING, "Exception root cause: ", C11495a.m30173a(e));
            eVar = new C11244e(C11252j.C11253a.INTERNAL_SERVER_ERROR);
        }
        eVar.mo35747j().mo35758l(C11296f0.C11297a.SERVER, new C11315v());
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11346c mo36205l(URI uri) {
        return null;
    }
}
