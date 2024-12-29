package p074n6;

import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.fourthline.cling.C10011c;
import org.fourthline.cling.model.message.header.C10052m;
import org.fourthline.cling.model.message.header.UpnpHeader;
import p127a7.C3983b;
import p230x6.C12004a;

@ApplicationScoped
/* renamed from: n6.c */
public class C3382c implements C9739b {

    /* renamed from: d */
    private static Logger f5497d = Logger.getLogger(C3382c.class.getName());

    /* renamed from: a */
    protected C10011c f5498a;

    /* renamed from: b */
    protected C12004a f5499b;

    /* renamed from: c */
    protected C3983b f5500c;

    protected C3382c() {
    }

    @Inject
    public C3382c(C10011c cVar, C12004a aVar, C3983b bVar) {
        Logger logger = f5497d;
        logger.fine("Creating ControlPoint: " + C3382c.class.getName());
        this.f5498a = cVar;
        this.f5499b = aVar;
        this.f5500c = bVar;
    }

    /* renamed from: a */
    public void mo24151a(C9740d dVar) {
        Logger logger = f5497d;
        logger.fine("Invoking subscription in background: " + dVar);
        dVar.mo38931n(this);
        mo24154d().getSyncProtocolExecutorService().execute(dVar);
    }

    /* renamed from: b */
    public Future mo24152b(C9738a aVar) {
        Logger logger = f5497d;
        logger.fine("Invoking action in background: " + aVar);
        aVar.mo38919f(this);
        return mo24154d().getSyncProtocolExecutorService().submit(aVar);
    }

    /* renamed from: c */
    public void mo24153c(UpnpHeader upnpHeader) {
        mo24155e(upnpHeader, C10052m.f18546c.intValue());
    }

    /* renamed from: d */
    public C10011c mo24154d() {
        return this.f5498a;
    }

    /* renamed from: e */
    public void mo24155e(UpnpHeader upnpHeader, int i) {
        Logger logger = f5497d;
        logger.fine("Sending asynchronous search for: " + upnpHeader.mo40448a());
        mo24154d().getAsyncProtocolExecutor().execute(getProtocolFactory().mo24900f(upnpHeader, i));
    }

    public C12004a getProtocolFactory() {
        return this.f5499b;
    }

    public C3983b getRegistry() {
        return this.f5500c;
    }
}
