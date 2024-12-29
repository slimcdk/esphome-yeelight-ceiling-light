package p240z6;

import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.model.message.UpnpResponse;
import org.seamless.util.C10243a;
import p200p6.C10276b;
import p210s6.C10374b;
import p210s6.C10381i;
import p214t6.C10404d;
import p222v6.C10553g;
import p230x6.C12006c;

/* renamed from: z6.d */
public class C12200d extends C12006c<C10030d, C10381i> {

    /* renamed from: h */
    private static final Logger f22532h = Logger.getLogger(C12200d.class.getName());

    /* renamed from: g */
    protected C10276b f22533g;

    /* renamed from: z6.d$a */
    class C12201a extends C10276b {
        C12201a(C10404d dVar, Integer num, List list) {
            super(dVar, num, list);
        }

        /* renamed from: O */
        public void mo38935O(CancelReason cancelReason) {
        }

        /* renamed from: a */
        public void mo38936a() {
        }

        /* renamed from: e */
        public void mo38937e() {
            C12200d.this.mo42600d().getConfiguration().getSyncProtocolExecutorService().execute(C12200d.this.mo42600d().getProtocolFactory().mo24895a(this));
        }
    }

    public C12200d(C10010b bVar, C10030d dVar) {
        super(bVar, dVar);
    }

    /* renamed from: i */
    public void mo42607i(Throwable th) {
        if (this.f22533g != null) {
            Logger logger = f22532h;
            logger.fine("Response could not be send to subscriber, removing local GENA subscription: " + this.f22533g);
            mo42600d().getRegistry().mo24948m(this.f22533g);
        }
    }

    /* renamed from: j */
    public void mo42608j(C10031e eVar) {
        String str;
        if (this.f22533g != null) {
            if (eVar != null && !((UpnpResponse) eVar.mo40404k()).mo40424f() && this.f22533g.mo41772w().mo40572c().longValue() == 0) {
                Logger logger = f22532h;
                logger.fine("Establishing subscription");
                this.f22533g.mo41778T();
                this.f22533g.mo41774P();
                logger.fine("Response to subscription sent successfully, now sending initial event asynchronously");
                mo42600d().getConfiguration().getAsyncProtocolExecutor().execute(mo42600d().getProtocolFactory().mo24895a(this.f22533g));
            } else if (this.f22533g.mo41772w().mo40572c().longValue() == 0) {
                Logger logger2 = f22532h;
                logger2.fine("Subscription request's response aborted, not sending initial event");
                if (eVar == null) {
                    str = "Reason: No response at all from subscriber";
                } else {
                    str = "Reason: " + eVar.mo40404k();
                }
                logger2.fine(str);
                logger2.fine("Removing subscription from registry: " + this.f22533g);
                mo42600d().getRegistry().mo24948m(this.f22533g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10381i mo42604f() {
        C10553g gVar = (C10553g) mo42600d().getRegistry().mo24917B(C10553g.class, ((C10030d) mo42599c()).mo40435v());
        if (gVar == null) {
            Logger logger = f22532h;
            logger.fine("No local resource found: " + mo42599c());
            return null;
        }
        Logger logger2 = f22532h;
        logger2.fine("Found local event subscription matching relative request URI: " + ((C10030d) mo42599c()).mo40435v());
        C10374b bVar = new C10374b((C10030d) mo42599c(), (C10404d) gVar.mo42211a());
        if (bVar.mo41968A() != null && (bVar.mo41969B() || bVar.mo41970y() != null)) {
            logger2.fine("Subscription ID and NT or Callback in subscribe request: " + mo42599c());
            return new C10381i(UpnpResponse.Status.BAD_REQUEST);
        } else if (bVar.mo41968A() != null) {
            return mo43196m((C10404d) gVar.mo42211a(), bVar);
        } else {
            if (bVar.mo41969B() && bVar.mo41970y() != null) {
                return mo43195l((C10404d) gVar.mo42211a(), bVar);
            }
            logger2.fine("No subscription ID, no NT or Callback, neither subscription or renewal: " + mo42599c());
            return new C10381i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C10381i mo43195l(C10404d dVar, C10374b bVar) {
        List<URL> y = bVar.mo41970y();
        if (y == null || y.size() == 0) {
            Logger logger = f22532h;
            logger.fine("Missing or invalid Callback URLs in subscribe request: " + mo42599c());
            return new C10381i(UpnpResponse.Status.PRECONDITION_FAILED);
        } else if (!bVar.mo41969B()) {
            Logger logger2 = f22532h;
            logger2.fine("Missing or invalid NT header in subscribe request: " + mo42599c());
            return new C10381i(UpnpResponse.Status.PRECONDITION_FAILED);
        } else {
            try {
                this.f22533g = new C12201a(dVar, mo42600d().getConfiguration().isReceivedSubscriptionTimeoutIgnored() ? null : bVar.mo41971z(), y);
                Logger logger3 = f22532h;
                logger3.fine("Adding subscription to registry: " + this.f22533g);
                mo42600d().getRegistry().mo24957t(this.f22533g);
                logger3.fine("Returning subscription response, waiting to send initial event");
                return new C10381i(this.f22533g);
            } catch (Exception e) {
                Logger logger4 = f22532h;
                logger4.warning("Couldn't create local subscription to service: " + C10243a.m25753a(e));
                return new C10381i(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C10381i mo43196m(C10404d dVar, C10374b bVar) {
        C10276b f = mo42600d().getRegistry().mo24941f(bVar.mo41968A());
        this.f22533g = f;
        if (f == null) {
            Logger logger = f22532h;
            logger.fine("Invalid subscription ID for renewal request: " + mo42599c());
            return new C10381i(UpnpResponse.Status.PRECONDITION_FAILED);
        }
        Logger logger2 = f22532h;
        logger2.fine("Renewing subscription: " + this.f22533g);
        this.f22533g.mo41779U(bVar.mo41971z());
        if (mo42600d().getRegistry().mo24939d(this.f22533g)) {
            return new C10381i(this.f22533g);
        }
        logger2.fine("Subscription went away before it could be renewed: " + mo42599c());
        return new C10381i(UpnpResponse.Status.PRECONDITION_FAILED);
    }
}
