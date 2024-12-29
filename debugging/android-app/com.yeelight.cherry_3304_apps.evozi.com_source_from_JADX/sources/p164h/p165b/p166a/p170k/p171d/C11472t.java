package p164h.p165b.p166a.p170k.p171d;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11492n;

/* renamed from: h.b.a.k.d.t */
public class C11472t implements C11492n<C11471s> {

    /* renamed from: c */
    private static Logger f22827c = Logger.getLogger(C11492n.class.getName());

    /* renamed from: a */
    protected final C11471s f22828a;

    /* renamed from: b */
    protected HttpServer f22829b;

    /* renamed from: h.b.a.k.d.t$a */
    protected class C11473a implements HttpHandler {
        public C11473a(C11472t tVar, C4436a aVar) {
        }
    }

    public C11472t(C11471s sVar) {
        this.f22828a = sVar;
    }

    /* renamed from: O */
    public synchronized void mo36285O(InetAddress inetAddress, C4436a aVar) {
        try {
            HttpServer create = HttpServer.create(new InetSocketAddress(inetAddress, this.f22828a.mo36342a()), this.f22828a.mo36343b());
            this.f22829b = create;
            create.createContext(MiotCloudImpl.COOKIE_PATH, new C11473a(this, aVar));
            Logger logger = f22827c;
            logger.info("Created server (for receiving TCP streams) on: " + this.f22829b.getAddress());
        } catch (Exception e) {
            throw new C11485f("Could not initialize " + getClass().getSimpleName() + ": " + e.toString(), e);
        }
    }

    public synchronized int getPort() {
        return this.f22829b.getAddress().getPort();
    }

    public synchronized void run() {
        f22827c.fine("Starting StreamServer...");
        this.f22829b.start();
    }

    public synchronized void stop() {
        f22827c.fine("Stopping StreamServer...");
        if (this.f22829b != null) {
            this.f22829b.stop(1);
        }
    }
}
