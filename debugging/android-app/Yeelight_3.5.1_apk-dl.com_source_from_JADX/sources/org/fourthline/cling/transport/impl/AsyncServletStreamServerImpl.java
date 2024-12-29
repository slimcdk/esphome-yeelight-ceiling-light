package org.fourthline.cling.transport.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.HttpServlet;
import org.fourthline.cling.model.message.C10027a;
import org.fourthline.cling.transport.spi.InitializationException;
import p132b7.C4003a;
import p148d7.C8962l;
import p208s4.C10349a;
import p208s4.C10350b;
import p208s4.C10351c;
import p208s4.C10357i;
import p230x6.C12004a;

public class AsyncServletStreamServerImpl implements C8962l<C10123a> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f18683e = Logger.getLogger(C8962l.class.getName());

    /* renamed from: a */
    protected final C10123a f18684a;

    /* renamed from: b */
    protected int f18685b;

    /* renamed from: c */
    protected String f18686c;

    /* renamed from: d */
    private int f18687d = 0;

    /* renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$a */
    protected class C10122a implements C10027a {

        /* renamed from: a */
        protected C9277a f18691a;

        public C10122a(AsyncServletStreamServerImpl asyncServletStreamServerImpl, C9277a aVar) {
            this.f18691a = aVar;
        }

        /* renamed from: a */
        public InetAddress mo40428a() {
            try {
                return InetAddress.getByName(mo40725b().mo41948h());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public C9277a mo40725b() {
            return this.f18691a;
        }
    }

    public AsyncServletStreamServerImpl(C10123a aVar) {
        this.f18684a = aVar;
    }

    /* renamed from: b */
    static /* synthetic */ int m25227b(AsyncServletStreamServerImpl asyncServletStreamServerImpl) {
        int i = asyncServletStreamServerImpl.f18687d;
        asyncServletStreamServerImpl.f18687d = i + 1;
        return i;
    }

    /* renamed from: C */
    public synchronized void mo36805C(InetAddress inetAddress, C4003a aVar) {
        try {
            Logger logger = f18683e;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                logger.fine("Setting executor service on servlet container adapter");
            }
            mo40718e().mo40728c().mo26717a(aVar.getConfiguration().getStreamServerExecutorService());
            if (logger.isLoggable(level)) {
                logger.fine("Adding connector: " + inetAddress + Constants.COLON_SEPARATOR + mo40718e().mo40727b());
            }
            this.f18686c = inetAddress.getHostAddress();
            this.f18685b = mo40718e().mo40728c().mo26720d(this.f18686c, mo40718e().mo40727b());
            mo40718e().mo40728c().mo26719c(aVar.getConfiguration().getNamespace().mo40352b().getPath(), mo40717d(aVar));
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + AsyncServletStreamServerImpl.class.getSimpleName() + ": " + e.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10357i mo40717d(final C4003a aVar) {
        return new HttpServlet() {

            /* renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$a */
            class C10120a implements C10351c {

                /* renamed from: a */
                final /* synthetic */ long f18688a;

                /* renamed from: b */
                final /* synthetic */ int f18689b;

                C10120a(C101191 r1, long j, int i) {
                    this.f18688a = j;
                    this.f18689b = i;
                }

                /* renamed from: E */
                public void mo40720E(C10350b bVar) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18688a;
                    if (AsyncServletStreamServerImpl.f18683e.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f18683e.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", new Object[]{Integer.valueOf(this.f18689b), Long.valueOf(currentTimeMillis), bVar.mo41935b()}));
                    }
                }

                /* renamed from: F */
                public void mo40721F(C10350b bVar) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18688a;
                    if (AsyncServletStreamServerImpl.f18683e.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f18683e.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", new Object[]{Integer.valueOf(this.f18689b), Long.valueOf(currentTimeMillis), bVar.mo41934a()}));
                    }
                }

                /* renamed from: H */
                public void mo40722H(C10350b bVar) {
                    if (AsyncServletStreamServerImpl.f18683e.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f18683e.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", new Object[]{Integer.valueOf(this.f18689b), bVar.mo41934a()}));
                    }
                }

                /* renamed from: x */
                public void mo40723x(C10350b bVar) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f18688a;
                    if (AsyncServletStreamServerImpl.f18683e.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f18683e.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", new Object[]{Integer.valueOf(this.f18689b), Long.valueOf(currentTimeMillis), bVar.mo41935b()}));
                    }
                }
            }

            /* renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$b */
            class C10121b extends C10124b {
                C10121b(C12004a aVar, C10349a aVar2, C9277a aVar3) {
                    super(aVar, aVar2, aVar3);
                }

                /* access modifiers changed from: protected */
                /* renamed from: M */
                public C10027a mo40724M() {
                    return new C10122a(AsyncServletStreamServerImpl.this, mo40730N());
                }
            }

            /* access modifiers changed from: protected */
            public void service(C9277a aVar, C9279c cVar) {
                long currentTimeMillis = System.currentTimeMillis();
                int b = AsyncServletStreamServerImpl.m25227b(AsyncServletStreamServerImpl.this);
                if (AsyncServletStreamServerImpl.f18683e.isLoggable(Level.FINE)) {
                    AsyncServletStreamServerImpl.f18683e.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", new Object[]{Integer.valueOf(b), aVar.mo37774w()}));
                }
                C10349a v = aVar.mo41953v();
                v.mo41931b((long) (AsyncServletStreamServerImpl.this.mo40718e().mo40726a() * 1000));
                v.mo41930a(new C10120a(this, currentTimeMillis, b));
                aVar.mo24971f(new C10121b(aVar.getProtocolFactory(), v, aVar));
            }
        };
    }

    /* renamed from: e */
    public C10123a mo40718e() {
        return this.f18684a;
    }

    public synchronized int getPort() {
        return this.f18685b;
    }

    public void run() {
        mo40718e().mo40728c().mo26718b();
    }

    public synchronized void stop() {
        mo40718e().mo40728c().mo26721e(this.f18686c, this.f18685b);
    }
}
