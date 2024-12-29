package p164h.p165b.p166a.p170k.p171d;

import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p155b.C10697a;
import p154d.p155b.C10699b;
import p154d.p155b.C10701c;
import p154d.p155b.C10725k;
import p154d.p155b.p204f0.C10708b;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11492n;
import p164h.p165b.p166a.p240h.p243r.C11240a;

/* renamed from: h.b.a.k.d.b */
public class C11453b implements C11492n<C11452a> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f22778e = Logger.getLogger(C11492n.class.getName());

    /* renamed from: a */
    protected final C11452a f22779a;

    /* renamed from: b */
    protected int f22780b;

    /* renamed from: c */
    protected String f22781c;

    /* renamed from: d */
    private int f22782d = 0;

    /* renamed from: h.b.a.k.d.b$a */
    class C11454a extends C10708b {

        /* renamed from: a */
        final /* synthetic */ C4436a f22783a;

        /* renamed from: h.b.a.k.d.b$a$a */
        class C11455a implements C10701c {

            /* renamed from: a */
            final /* synthetic */ long f22785a;

            /* renamed from: b */
            final /* synthetic */ int f22786b;

            C11455a(C11454a aVar, long j, int i) {
                this.f22785a = j;
                this.f22786b = i;
            }

            /* renamed from: H */
            public void mo33898H(C10699b bVar) {
                if (C11453b.f22778e.isLoggable(Level.FINE)) {
                    C11453b.f22778e.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", new Object[]{Integer.valueOf(this.f22786b), bVar.mo33891a()}));
                }
            }

            /* renamed from: I */
            public void mo33899I(C10699b bVar) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22785a;
                if (C11453b.f22778e.isLoggable(Level.FINE)) {
                    C11453b.f22778e.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", new Object[]{Integer.valueOf(this.f22786b), Long.valueOf(currentTimeMillis), bVar.mo33892b()}));
                }
            }

            /* renamed from: n */
            public void mo33900n(C10699b bVar) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22785a;
                if (C11453b.f22778e.isLoggable(Level.FINE)) {
                    C11453b.f22778e.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", new Object[]{Integer.valueOf(this.f22786b), Long.valueOf(currentTimeMillis), bVar.mo33891a()}));
                }
            }

            /* renamed from: z */
            public void mo33901z(C10699b bVar) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22785a;
                if (C11453b.f22778e.isLoggable(Level.FINE)) {
                    C11453b.f22778e.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", new Object[]{Integer.valueOf(this.f22786b), Long.valueOf(currentTimeMillis), bVar.mo33892b()}));
                }
            }
        }

        /* renamed from: h.b.a.k.d.b$a$b */
        class C11456b extends C11458c {
            C11456b(C4429b bVar, C10697a aVar, C10709c cVar) {
                super(bVar, aVar, cVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: N */
            public C11240a mo36291N() {
                return new C11457b(C11453b.this, mo36294Q());
            }
        }

        C11454a(C4436a aVar) {
            this.f22783a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo33916d(C10709c cVar, C10711e eVar) {
            long currentTimeMillis = System.currentTimeMillis();
            int b = C11453b.m30030b(C11453b.this);
            if (C11453b.f22778e.isLoggable(Level.FINE)) {
                C11453b.f22778e.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", new Object[]{Integer.valueOf(b), cVar.mo33929v()}));
            }
            C10697a u = cVar.mo33973u();
            u.mo33880a((long) (C11453b.this.mo36287e().mo36282a() * 1000));
            u.mo33882c(new C11455a(this, currentTimeMillis, b));
            this.f22783a.mo24455f(new C11456b(this.f22783a.getProtocolFactory(), u, cVar));
        }
    }

    /* renamed from: h.b.a.k.d.b$b */
    protected class C11457b implements C11240a {

        /* renamed from: a */
        protected C10709c f22788a;

        public C11457b(C11453b bVar, C10709c cVar) {
            this.f22788a = cVar;
        }

        /* renamed from: a */
        public InetAddress mo35743a() {
            try {
                return InetAddress.getByName(mo36292b().mo33969i());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public C10709c mo36292b() {
            return this.f22788a;
        }
    }

    public C11453b(C11452a aVar) {
        this.f22779a = aVar;
    }

    /* renamed from: b */
    static /* synthetic */ int m30030b(C11453b bVar) {
        int i = bVar.f22782d;
        bVar.f22782d = i + 1;
        return i;
    }

    /* renamed from: O */
    public synchronized void mo36285O(InetAddress inetAddress, C4436a aVar) {
        try {
            if (f22778e.isLoggable(Level.FINE)) {
                f22778e.fine("Setting executor service on servlet container adapter");
            }
            mo36287e().mo36284c().mo36345a(aVar.getConfiguration().getStreamServerExecutorService());
            if (f22778e.isLoggable(Level.FINE)) {
                Logger logger = f22778e;
                logger.fine("Adding connector: " + inetAddress + Constants.COLON_SEPARATOR + mo36287e().mo36283b());
            }
            this.f22781c = inetAddress.getHostAddress();
            this.f22780b = mo36287e().mo36284c().mo36348d(this.f22781c, mo36287e().mo36283b());
            mo36287e().mo36284c().mo36347c(aVar.getConfiguration().getNamespace().mo35647b().getPath(), mo36286d(aVar));
        } catch (Exception e) {
            throw new C11485f("Could not initialize " + getClass().getSimpleName() + ": " + e.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10725k mo36286d(C4436a aVar) {
        return new C11454a(aVar);
    }

    /* renamed from: e */
    public C11452a mo36287e() {
        return this.f22779a;
    }

    public synchronized int getPort() {
        return this.f22780b;
    }

    public void run() {
        mo36287e().mo36284c().mo36346b();
    }

    public synchronized void stop() {
        mo36287e().mo36284c().mo36349e(this.f22781c, this.f22780b);
    }
}
