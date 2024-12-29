package p164h.p165b.p166a.p168i.p255j;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.C11402e;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p246m.C11276b;
import p164h.p165b.p166a.p240h.p243r.p246m.C11283i;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p250u.C11350g;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.i.j.d */
public class C11418d extends C11402e<C11243d, C11283i> {

    /* renamed from: h */
    private static final Logger f22711h = Logger.getLogger(C11418d.class.getName());

    /* renamed from: g */
    protected C11238c f22712g;

    /* renamed from: h.b.a.i.j.d$a */
    class C11419a extends C11238c {
        C11419a(C11328h hVar, Integer num, List list) {
            super(hVar, num, list);
        }

        /* renamed from: S */
        public void mo35607S(C11236a aVar) {
        }

        /* renamed from: a */
        public void mo35608a() {
        }

        /* renamed from: c */
        public void mo35609c() {
            C11418d.this.mo36156d().getConfiguration().getSyncProtocolExecutorService().execute(C11418d.this.mo36156d().getProtocolFactory().mo24386h(this));
        }
    }

    public C11418d(C4423b bVar, C11243d dVar) {
        super(bVar, dVar);
    }

    /* renamed from: i */
    public void mo36163i(Throwable th) {
        if (this.f22712g != null) {
            Logger logger = f22711h;
            logger.fine("Response could not be send to subscriber, removing local GENA subscription: " + this.f22712g);
            mo36156d().getRegistry().mo24433x(this.f22712g);
        }
    }

    /* renamed from: j */
    public void mo36164j(C11244e eVar) {
        if (this.f22712g != null) {
            if (eVar != null && !((C11252j) eVar.mo35776k()).mo35798f() && this.f22712g.mo35720C().mo36099c().longValue() == 0) {
                f22711h.fine("Establishing subscription");
                this.f22712g.mo35734X();
                this.f22712g.mo35730T();
                f22711h.fine("Response to subscription sent successfully, now sending initial event asynchronously");
                mo36156d().getConfiguration().getAsyncProtocolExecutor().execute(mo36156d().getProtocolFactory().mo24386h(this.f22712g));
            } else if (this.f22712g.mo35720C().mo36099c().longValue() == 0) {
                f22711h.fine("Subscription request's response aborted, not sending initial event");
                if (eVar == null) {
                    f22711h.fine("Reason: No response at all from subscriber");
                } else {
                    Logger logger = f22711h;
                    logger.fine("Reason: " + eVar.mo35776k());
                }
                Logger logger2 = f22711h;
                logger2.fine("Removing subscription from registry: " + this.f22712g);
                mo36156d().getRegistry().mo24433x(this.f22712g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11283i mo36160f() {
        C11350g gVar = (C11350g) mo36156d().getRegistry().mo24401B(C11350g.class, ((C11243d) mo36155c()).mo35751v());
        if (gVar == null) {
            Logger logger = f22711h;
            logger.fine("No local resource found: " + mo36155c());
            return null;
        }
        Logger logger2 = f22711h;
        logger2.fine("Found local event subscription matching relative request URI: " + ((C11243d) mo36155c()).mo35751v());
        C11276b bVar = new C11276b((C11243d) mo36155c(), (C11328h) gVar.mo36026a());
        if (bVar.mo35829A() != null && (bVar.mo35830B() || bVar.mo35831y() != null)) {
            Logger logger3 = f22711h;
            logger3.fine("Subscription ID and NT or Callback in subscribe request: " + mo36155c());
            return new C11283i(C11252j.C11253a.BAD_REQUEST);
        } else if (bVar.mo35829A() != null) {
            return mo36208m((C11328h) gVar.mo36026a(), bVar);
        } else {
            if (bVar.mo35830B() && bVar.mo35831y() != null) {
                return mo36207l((C11328h) gVar.mo36026a(), bVar);
            }
            Logger logger4 = f22711h;
            logger4.fine("No subscription ID, no NT or Callback, neither subscription or renewal: " + mo36155c());
            return new C11283i(C11252j.C11253a.PRECONDITION_FAILED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11283i mo36207l(C11328h hVar, C11276b bVar) {
        List<URL> y = bVar.mo35831y();
        if (y == null || y.size() == 0) {
            Logger logger = f22711h;
            logger.fine("Missing or invalid Callback URLs in subscribe request: " + mo36155c());
            return new C11283i(C11252j.C11253a.PRECONDITION_FAILED);
        } else if (!bVar.mo35830B()) {
            Logger logger2 = f22711h;
            logger2.fine("Missing or invalid NT header in subscribe request: " + mo36155c());
            return new C11283i(C11252j.C11253a.PRECONDITION_FAILED);
        } else {
            try {
                this.f22712g = new C11419a(hVar, mo36156d().getConfiguration().isReceivedSubscriptionTimeoutIgnored() ? null : bVar.mo35832z(), y);
                Logger logger3 = f22711h;
                logger3.fine("Adding subscription to registry: " + this.f22712g);
                mo36156d().getRegistry().mo24410c(this.f22712g);
                f22711h.fine("Returning subscription response, waiting to send initial event");
                return new C11283i(this.f22712g);
            } catch (Exception e) {
                Logger logger4 = f22711h;
                logger4.warning("Couldn't create local subscription to service: " + C11495a.m30173a(e));
                return new C11283i(C11252j.C11253a.INTERNAL_SERVER_ERROR);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C11283i mo36208m(C11328h hVar, C11276b bVar) {
        C11238c f = mo36156d().getRegistry().mo24413f(bVar.mo35829A());
        this.f22712g = f;
        if (f == null) {
            Logger logger = f22711h;
            logger.fine("Invalid subscription ID for renewal request: " + mo36155c());
            return new C11283i(C11252j.C11253a.PRECONDITION_FAILED);
        }
        Logger logger2 = f22711h;
        logger2.fine("Renewing subscription: " + this.f22712g);
        this.f22712g.mo35735Y(bVar.mo35832z());
        if (mo36156d().getRegistry().mo24422o(this.f22712g)) {
            return new C11283i(this.f22712g);
        }
        Logger logger3 = f22711h;
        logger3.fine("Subscription went away before it could be renewed: " + mo36155c());
        return new C11283i(C11252j.C11253a.PRECONDITION_FAILED);
    }
}
