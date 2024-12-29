package org.fourthline.cling.transport.impl;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;
import org.fourthline.cling.transport.spi.InitializationException;
import p132b7.C4003a;
import p148d7.C8962l;

/* renamed from: org.fourthline.cling.transport.impl.s */
public class C10140s implements C8962l<C10139r> {

    /* renamed from: c */
    private static Logger f18735c = Logger.getLogger(C8962l.class.getName());

    /* renamed from: a */
    protected final C10139r f18736a;

    /* renamed from: b */
    protected HttpServer f18737b;

    /* renamed from: org.fourthline.cling.transport.impl.s$a */
    protected class C10141a implements HttpHandler {

        /* renamed from: a */
        private final C4003a f18738a;

        public C10141a(C10140s sVar, C4003a aVar) {
            this.f18738a = aVar;
        }
    }

    public C10140s(C10139r rVar) {
        this.f18736a = rVar;
    }

    /* renamed from: C */
    public synchronized void mo36805C(InetAddress inetAddress, C4003a aVar) {
        try {
            HttpServer create = HttpServer.create(new InetSocketAddress(inetAddress, this.f18736a.mo40801a()), this.f18736a.mo40802b());
            this.f18737b = create;
            create.createContext(MiotCloudImpl.COOKIE_PATH, new C10141a(this, aVar));
            Logger logger = f18735c;
            logger.info("Created server (for receiving TCP streams) on: " + this.f18737b.getAddress());
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + C10140s.class.getSimpleName() + ": " + e.toString(), e);
        }
    }

    public synchronized int getPort() {
        return this.f18737b.getAddress().getPort();
    }

    public synchronized void run() {
        f18735c.fine("Starting StreamServer...");
        this.f18737b.start();
    }

    public synchronized void stop() {
        f18735c.fine("Stopping StreamServer...");
        HttpServer httpServer = this.f18737b;
        if (httpServer != null) {
            httpServer.stop(1);
        }
    }
}
