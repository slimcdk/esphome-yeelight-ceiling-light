package org.fourthline.cling;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.protocol.C3576a;
import org.fourthline.cling.registry.C3578b;
import org.fourthline.cling.transport.C3581a;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.C10243a;
import p074n6.C3382c;
import p074n6.C9739b;
import p127a7.C3983b;
import p127a7.C3984c;
import p132b7.C4003a;
import p230x6.C12004a;

@Alternative
/* renamed from: org.fourthline.cling.d */
public class C3574d implements C10010b {
    /* access modifiers changed from: private */
    public static Logger log = Logger.getLogger(C3574d.class.getName());
    protected final C10011c configuration;
    protected final C9739b controlPoint;
    protected final C12004a protocolFactory;
    protected final C3983b registry;
    protected final C4003a router;

    /* renamed from: org.fourthline.cling.d$a */
    class C3575a implements Runnable {
        C3575a() {
        }

        public void run() {
            C3574d.log.info(">>> Shutting down UPnP service...");
            C3574d.this.shutdownRegistry();
            C3574d.this.shutdownRouter();
            C3574d.this.shutdownConfiguration();
            C3574d.log.info("<<< UPnP service shutdown completed");
        }
    }

    public C3574d() {
        this(new C3570a(), new C3984c[0]);
    }

    public C3574d(C10011c cVar, C3984c... cVarArr) {
        this.configuration = cVar;
        log.info(">>> Starting UPnP service...");
        log.info("Using configuration: " + getConfiguration().getClass().getName());
        C12004a createProtocolFactory = createProtocolFactory();
        this.protocolFactory = createProtocolFactory;
        this.registry = createRegistry(createProtocolFactory);
        for (C3984c u : cVarArr) {
            this.registry.mo24958u(u);
        }
        C4003a createRouter = createRouter(this.protocolFactory, this.registry);
        this.router = createRouter;
        try {
            createRouter.mo24970e();
            this.controlPoint = createControlPoint(this.protocolFactory, this.registry);
            log.info("<<< UPnP service started successfully");
        } catch (RouterException e) {
            throw new RuntimeException("Enabling network router failed: " + e, e);
        }
    }

    public C3574d(C3984c... cVarArr) {
        this(new C3570a(), cVarArr);
    }

    /* access modifiers changed from: protected */
    public C9739b createControlPoint(C12004a aVar, C3983b bVar) {
        return new C3382c(getConfiguration(), aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public C12004a createProtocolFactory() {
        return new C3576a(this);
    }

    /* access modifiers changed from: protected */
    public C3983b createRegistry(C12004a aVar) {
        return new C3578b(this);
    }

    /* access modifiers changed from: protected */
    public C4003a createRouter(C12004a aVar, C3983b bVar) {
        return new C3581a(getConfiguration(), aVar);
    }

    public C10011c getConfiguration() {
        return this.configuration;
    }

    public C9739b getControlPoint() {
        return this.controlPoint;
    }

    public C12004a getProtocolFactory() {
        return this.protocolFactory;
    }

    public C3983b getRegistry() {
        return this.registry;
    }

    public C4003a getRouter() {
        return this.router;
    }

    public synchronized void shutdown() {
        shutdown(false);
    }

    /* access modifiers changed from: protected */
    public void shutdown(boolean z) {
        C3575a aVar = new C3575a();
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
        } catch (RouterException e) {
            Throwable a = C10243a.m25753a(e);
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
