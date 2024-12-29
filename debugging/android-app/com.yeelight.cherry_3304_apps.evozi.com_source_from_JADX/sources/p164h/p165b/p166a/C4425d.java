package p164h.p165b.p166a;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import p164h.p165b.p166a.p167g.C4427b;
import p164h.p165b.p166a.p167g.C4428c;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p168i.C4430c;
import p164h.p165b.p166a.p169j.C11444h;
import p164h.p165b.p166a.p169j.C4432d;
import p164h.p165b.p166a.p169j.C4433e;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.C4437c;
import p164h.p257c.p259b.C11495a;

@Alternative
/* renamed from: h.b.a.d */
public class C4425d implements C4423b {
    /* access modifiers changed from: private */
    public static Logger log = Logger.getLogger(C4425d.class.getName());
    protected final C4424c configuration;
    protected final C4427b controlPoint;
    protected final C4429b protocolFactory;
    protected final C4432d registry;
    protected final C4436a router;

    /* renamed from: h.b.a.d$a */
    class C4426a implements Runnable {
        C4426a() {
        }

        public void run() {
            C4425d.log.info(">>> Shutting down UPnP service...");
            C4425d.this.shutdownRegistry();
            C4425d.this.shutdownRouter();
            C4425d.this.shutdownConfiguration();
            C4425d.log.info("<<< UPnP service shutdown completed");
        }
    }

    public C4425d() {
        this(new C4419a(), new C11444h[0]);
    }

    public C4425d(C4424c cVar, C11444h... hVarArr) {
        this.configuration = cVar;
        log.info(">>> Starting UPnP service...");
        log.info("Using configuration: " + getConfiguration().getClass().getName());
        C4429b createProtocolFactory = createProtocolFactory();
        this.protocolFactory = createProtocolFactory;
        this.registry = createRegistry(createProtocolFactory);
        for (C11444h t : hVarArr) {
            this.registry.mo24429t(t);
        }
        C4436a createRouter = createRouter(this.protocolFactory, this.registry);
        this.router = createRouter;
        try {
            createRouter.mo24454e();
            this.controlPoint = createControlPoint(this.protocolFactory, this.registry);
            log.info("<<< UPnP service started successfully");
        } catch (C11451b e) {
            throw new RuntimeException("Enabling network router failed: " + e, e);
        }
    }

    public C4425d(C11444h... hVarArr) {
        this(new C4419a(), hVarArr);
    }

    /* access modifiers changed from: protected */
    public C4427b createControlPoint(C4429b bVar, C4432d dVar) {
        return new C4428c(getConfiguration(), bVar, dVar);
    }

    /* access modifiers changed from: protected */
    public C4429b createProtocolFactory() {
        return new C4430c(this);
    }

    /* access modifiers changed from: protected */
    public C4432d createRegistry(C4429b bVar) {
        return new C4433e(this);
    }

    /* access modifiers changed from: protected */
    public C4436a createRouter(C4429b bVar, C4432d dVar) {
        return new C4437c(getConfiguration(), bVar);
    }

    public C4424c getConfiguration() {
        return this.configuration;
    }

    public C4427b getControlPoint() {
        return this.controlPoint;
    }

    public C4429b getProtocolFactory() {
        return this.protocolFactory;
    }

    public C4432d getRegistry() {
        return this.registry;
    }

    public C4436a getRouter() {
        return this.router;
    }

    public synchronized void shutdown() {
        shutdown(false);
    }

    /* access modifiers changed from: protected */
    public void shutdown(boolean z) {
        C4426a aVar = new C4426a();
        if (z) {
            new Thread(aVar).start();
        } else {
            aVar.run();
        }
    }

    /* access modifiers changed from: protected */
    public void shutdownConfiguration() {
        getConfiguration().shutdown();
    }

    /* access modifiers changed from: protected */
    public void shutdownRegistry() {
        getRegistry().shutdown();
    }

    /* access modifiers changed from: protected */
    public void shutdownRouter() {
        String str;
        StringBuilder sb;
        Level level;
        Logger logger;
        try {
            getRouter().shutdown();
        } catch (C11451b e) {
            Throwable a = C11495a.m30173a(e);
            if (a instanceof InterruptedException) {
                logger = log;
                level = Level.INFO;
                sb = new StringBuilder();
                str = "Router shutdown was interrupted: ";
            } else {
                logger = log;
                level = Level.SEVERE;
                sb = new StringBuilder();
                str = "Router error on shutdown: ";
            }
            sb.append(str);
            sb.append(e);
            logger.log(level, sb.toString(), a);
        }
    }
}
