package p164h.p165b.p166a.p167g;

import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import p164h.p165b.p166a.C4424c;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p169j.C4432d;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p243r.p247n.C11307n;

@ApplicationScoped
/* renamed from: h.b.a.g.c */
public class C4428c implements C4427b {

    /* renamed from: d */
    private static Logger f7974d = Logger.getLogger(C4428c.class.getName());

    /* renamed from: a */
    protected C4424c f7975a;

    /* renamed from: b */
    protected C4429b f7976b;

    /* renamed from: c */
    protected C4432d f7977c;

    protected C4428c() {
    }

    @Inject
    public C4428c(C4424c cVar, C4429b bVar, C4432d dVar) {
        Logger logger = f7974d;
        logger.fine("Creating ControlPoint: " + C4428c.class.getName());
        this.f7975a = cVar;
        this.f7976b = bVar;
        this.f7977c = dVar;
    }

    /* renamed from: a */
    public Future mo24372a(C11206a aVar) {
        Logger logger = f7974d;
        logger.fine("Invoking action in background: " + aVar);
        aVar.mo35597f(this);
        return mo24377d().getSyncProtocolExecutorService().submit(aVar);
    }

    /* renamed from: b */
    public void mo24373b(C11207d dVar) {
        Logger logger = f7974d;
        logger.fine("Invoking subscription in background: " + dVar);
        dVar.mo35603n(this);
        mo24377d().getSyncProtocolExecutorService().execute(dVar);
    }

    /* renamed from: c */
    public void mo24374c(C11296f0 f0Var) {
        mo24378e(f0Var, C11307n.f22436c.intValue());
    }

    /* renamed from: d */
    public C4424c mo24377d() {
        return this.f7975a;
    }

    /* renamed from: e */
    public void mo24378e(C11296f0 f0Var, int i) {
        Logger logger = f7974d;
        logger.fine("Sending asynchronous search for: " + f0Var.mo35841a());
        mo24377d().getAsyncProtocolExecutor().execute(getProtocolFactory().mo24382d(f0Var, i));
    }

    public C4429b getProtocolFactory() {
        return this.f7976b;
    }

    public C4432d getRegistry() {
        return this.f7977c;
    }
}
