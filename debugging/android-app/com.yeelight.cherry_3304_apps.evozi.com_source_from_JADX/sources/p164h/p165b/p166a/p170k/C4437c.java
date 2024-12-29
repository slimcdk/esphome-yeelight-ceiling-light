package p164h.p165b.p166a.p170k;

import java.net.BindException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import p164h.p165b.p166a.C4424c;
import p164h.p165b.p166a.p168i.C11400a;
import p164h.p165b.p166a.p168i.C11401d;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p170k.p172e.C11483c;
import p164h.p165b.p166a.p170k.p172e.C11485f;
import p164h.p165b.p166a.p170k.p172e.C11486g;
import p164h.p165b.p166a.p170k.p172e.C11487h;
import p164h.p165b.p166a.p170k.p172e.C11488i;
import p164h.p165b.p166a.p170k.p172e.C11490l;
import p164h.p165b.p166a.p170k.p172e.C11492n;
import p164h.p165b.p166a.p170k.p172e.C11493o;
import p164h.p165b.p166a.p240h.C11218h;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11242c;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p257c.p259b.C11495a;

@ApplicationScoped
/* renamed from: h.b.a.k.c */
public class C4437c implements C4436a {

    /* renamed from: l */
    private static Logger f7997l = Logger.getLogger(C4436a.class.getName());

    /* renamed from: a */
    protected C4424c f7998a;

    /* renamed from: b */
    protected C4429b f7999b;

    /* renamed from: c */
    protected volatile boolean f8000c;

    /* renamed from: d */
    protected ReentrantReadWriteLock f8001d;

    /* renamed from: e */
    protected Lock f8002e;

    /* renamed from: f */
    protected Lock f8003f = this.f8001d.writeLock();

    /* renamed from: g */
    protected C11487h f8004g;

    /* renamed from: h */
    protected C11490l f8005h;

    /* renamed from: i */
    protected final Map<NetworkInterface, C11486g> f8006i = new HashMap();

    /* renamed from: j */
    protected final Map<InetAddress, C11483c> f8007j = new HashMap();

    /* renamed from: k */
    protected final Map<InetAddress, C11492n> f8008k = new HashMap();

    @Inject
    public C4437c(C4424c cVar, C4429b bVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.f8001d = reentrantReadWriteLock;
        this.f8002e = reentrantReadWriteLock.readLock();
        Logger logger = f7997l;
        logger.info("Creating Router: " + getClass().getName());
        this.f7998a = cVar;
        this.f7999b = bVar;
    }

    /* renamed from: a */
    public void mo24450a(C11242c cVar) {
        mo24462j(this.f8002e);
        try {
            if (this.f8000c) {
                for (C11483c a : this.f8007j.values()) {
                    a.mo36302a(cVar);
                }
            } else {
                Logger logger = f7997l;
                logger.fine("Router disabled, not sending datagram: " + cVar);
            }
        } finally {
            mo24466n(this.f8002e);
        }
    }

    /* renamed from: b */
    public void mo24451b(C11241b bVar) {
        if (!this.f8000c) {
            Logger logger = f7997l;
            logger.fine("Router disabled, ignoring incoming message: " + bVar);
            return;
        }
        try {
            C11401d c = getProtocolFactory().mo24381c(bVar);
            if (c != null) {
                if (f7997l.isLoggable(Level.FINE)) {
                    Logger logger2 = f7997l;
                    logger2.fine("Received asynchronous message: " + bVar);
                }
                getConfiguration().getAsyncProtocolExecutor().execute(c);
            } else if (f7997l.isLoggable(Level.FINEST)) {
                Logger logger3 = f7997l;
                logger3.finest("No protocol, ignoring received message: " + bVar);
            }
        } catch (C11400a e) {
            Logger logger4 = f7997l;
            logger4.warning("Handling received datagram failed - " + C11495a.m30173a(e).toString());
        }
    }

    /* renamed from: c */
    public List<C11218h> mo24452c(InetAddress inetAddress) {
        C11492n nVar;
        mo24462j(this.f8002e);
        try {
            if (!this.f8000c || this.f8008k.size() <= 0) {
                List<C11218h> list = Collections.EMPTY_LIST;
                mo24466n(this.f8002e);
                return list;
            }
            ArrayList arrayList = new ArrayList();
            if (inetAddress == null || (nVar = this.f8008k.get(inetAddress)) == null) {
                for (Map.Entry next : this.f8008k.entrySet()) {
                    arrayList.add(new C11218h((InetAddress) next.getKey(), ((C11492n) next.getValue()).getPort(), this.f8004g.mo36324f((InetAddress) next.getKey())));
                }
            } else {
                arrayList.add(new C11218h(inetAddress, nVar.getPort(), this.f8004g.mo36324f(inetAddress)));
            }
            return arrayList;
        } finally {
            mo24466n(this.f8002e);
        }
    }

    /* renamed from: d */
    public C11244e mo24453d(C11243d dVar) {
        Logger logger;
        String str;
        mo24462j(this.f8002e);
        try {
            if (!this.f8000c) {
                logger = f7997l;
                str = "Router disabled, not sending stream request: " + dVar;
            } else if (this.f8005h == null) {
                logger = f7997l;
                str = "No StreamClient available, not sending: " + dVar;
            } else {
                f7997l.fine("Sending via TCP unicast stream: " + dVar);
                C11244e a = this.f8005h.mo36334a(dVar);
                mo24466n(this.f8002e);
                return a;
            }
            logger.fine(str);
            mo24466n(this.f8002e);
            return null;
        } catch (InterruptedException e) {
            throw new C11451b("Sending stream request was interrupted", e);
        } catch (Throwable th) {
            mo24466n(this.f8002e);
            throw th;
        }
    }

    /* renamed from: e */
    public boolean mo24454e() {
        boolean z;
        mo24462j(this.f8003f);
        try {
            if (!this.f8000c) {
                f7997l.fine("Starting networking services...");
                C11487h createNetworkAddressFactory = getConfiguration().createNetworkAddressFactory();
                this.f8004g = createNetworkAddressFactory;
                mo24465m(createNetworkAddressFactory.mo36319a());
                mo24464l(this.f8004g.mo36321c());
                if (this.f8004g.mo36320b()) {
                    this.f8005h = getConfiguration().createStreamClient();
                    z = true;
                    this.f8000c = true;
                    mo24466n(this.f8003f);
                    return z;
                }
                throw new C11488i("No usable network interface and/or addresses available, check the log for errors.");
            }
        } catch (C11485f e) {
            mo24461i(e);
        } catch (Throwable th) {
            mo24466n(this.f8003f);
            throw th;
        }
        z = false;
        mo24466n(this.f8003f);
        return z;
    }

    /* renamed from: f */
    public void mo24455f(C11493o oVar) {
        if (!this.f8000c) {
            Logger logger = f7997l;
            logger.fine("Router disabled, ignoring incoming: " + oVar);
            return;
        }
        Logger logger2 = f7997l;
        logger2.fine("Received synchronous stream: " + oVar);
        getConfiguration().getSyncProtocolExecutorService().execute(oVar);
    }

    /* renamed from: g */
    public boolean mo24459g() {
        mo24462j(this.f8003f);
        try {
            if (this.f8000c) {
                f7997l.fine("Disabling network services...");
                if (this.f8005h != null) {
                    f7997l.fine("Stopping stream client connection management/pool");
                    this.f8005h.stop();
                    this.f8005h = null;
                }
                for (Map.Entry next : this.f8008k.entrySet()) {
                    Logger logger = f7997l;
                    logger.fine("Stopping stream server on address: " + next.getKey());
                    ((C11492n) next.getValue()).stop();
                }
                this.f8008k.clear();
                for (Map.Entry next2 : this.f8006i.entrySet()) {
                    Logger logger2 = f7997l;
                    logger2.fine("Stopping multicast receiver on interface: " + ((NetworkInterface) next2.getKey()).getDisplayName());
                    ((C11486g) next2.getValue()).stop();
                }
                this.f8006i.clear();
                for (Map.Entry next3 : this.f8007j.entrySet()) {
                    Logger logger3 = f7997l;
                    logger3.fine("Stopping datagram I/O on address: " + next3.getKey());
                    ((C11483c) next3.getValue()).stop();
                }
                this.f8007j.clear();
                this.f8004g = null;
                this.f8000c = false;
                return true;
            }
            mo24466n(this.f8003f);
            return false;
        } finally {
            mo24466n(this.f8003f);
        }
    }

    public C4424c getConfiguration() {
        return this.f7998a;
    }

    public C4429b getProtocolFactory() {
        return this.f7999b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo24460h() {
        return 6000;
    }

    /* renamed from: i */
    public void mo24461i(C11485f fVar) {
        if (fVar instanceof C11488i) {
            f7997l.info("Unable to initialize network router, no network found.");
            return;
        }
        Logger logger = f7997l;
        logger.severe("Unable to initialize network router: " + fVar);
        Logger logger2 = f7997l;
        logger2.severe("Cause: " + C11495a.m30173a(fVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo24462j(Lock lock) {
        mo24463k(lock, mo24460h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo24463k(Lock lock, int i) {
        try {
            Logger logger = f7997l;
            logger.finest("Trying to obtain lock with timeout milliseconds '" + i + "': " + lock.getClass().getSimpleName());
            if (lock.tryLock((long) i, TimeUnit.MILLISECONDS)) {
                Logger logger2 = f7997l;
                logger2.finest("Acquired router lock: " + lock.getClass().getSimpleName());
                return;
            }
            throw new C11451b("Router wasn't available exclusively after waiting " + i + "ms, lock failed: " + lock.getClass().getSimpleName());
        } catch (InterruptedException e) {
            throw new C11451b("Interruption while waiting for exclusive access: " + lock.getClass().getSimpleName(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo24464l(Iterator<InetAddress> it) {
        while (it.hasNext()) {
            InetAddress next = it.next();
            C11492n createStreamServer = getConfiguration().createStreamServer(this.f8004g);
            if (createStreamServer == null) {
                Logger logger = f7997l;
                logger.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f7997l.isLoggable(Level.FINE)) {
                        Logger logger2 = f7997l;
                        logger2.fine("Init stream server on address: " + next);
                    }
                    createStreamServer.mo36285O(next, this);
                    this.f8008k.put(next, createStreamServer);
                } catch (C11485f e) {
                    Throwable a = C11495a.m30173a(e);
                    if (a instanceof BindException) {
                        Logger logger3 = f7997l;
                        logger3.warning("Failed to init StreamServer: " + a);
                        if (f7997l.isLoggable(Level.FINE)) {
                            f7997l.log(Level.FINE, "Initialization exception root cause", a);
                        }
                        Logger logger4 = f7997l;
                        logger4.warning("Removing unusable address: " + next);
                        it.remove();
                    } else {
                        throw e;
                    }
                }
            }
            C11483c createDatagramIO = getConfiguration().createDatagramIO(this.f8004g);
            if (createDatagramIO == null) {
                Logger logger5 = f7997l;
                logger5.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f7997l.isLoggable(Level.FINE)) {
                        Logger logger6 = f7997l;
                        logger6.fine("Init datagram I/O on address: " + next);
                    }
                    createDatagramIO.mo36301U(next, this, getConfiguration().getDatagramProcessor());
                    this.f8007j.put(next, createDatagramIO);
                } catch (C11485f e2) {
                    throw e2;
                }
            }
        }
        for (Map.Entry next2 : this.f8008k.entrySet()) {
            if (f7997l.isLoggable(Level.FINE)) {
                Logger logger7 = f7997l;
                logger7.fine("Starting stream server on address: " + next2.getKey());
            }
            getConfiguration().getStreamServerExecutorService().execute((Runnable) next2.getValue());
        }
        for (Map.Entry next3 : this.f8007j.entrySet()) {
            if (f7997l.isLoggable(Level.FINE)) {
                Logger logger8 = f7997l;
                logger8.fine("Starting datagram I/O on address: " + next3.getKey());
            }
            getConfiguration().getDatagramIOExecutor().execute((Runnable) next3.getValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24465m(Iterator<NetworkInterface> it) {
        while (it.hasNext()) {
            NetworkInterface next = it.next();
            C11486g createMulticastReceiver = getConfiguration().createMulticastReceiver(this.f8004g);
            if (createMulticastReceiver == null) {
                Logger logger = f7997l;
                logger.info("Configuration did not create a MulticastReceiver for: " + next);
            } else {
                try {
                    if (f7997l.isLoggable(Level.FINE)) {
                        Logger logger2 = f7997l;
                        logger2.fine("Init multicast receiver on interface: " + next.getDisplayName());
                    }
                    createMulticastReceiver.mo36315P(next, this, this.f8004g, getConfiguration().getDatagramProcessor());
                    this.f8006i.put(next, createMulticastReceiver);
                } catch (C11485f e) {
                    throw e;
                }
            }
        }
        for (Map.Entry next2 : this.f8006i.entrySet()) {
            if (f7997l.isLoggable(Level.FINE)) {
                Logger logger3 = f7997l;
                logger3.fine("Starting multicast receiver on interface: " + ((NetworkInterface) next2.getKey()).getDisplayName());
            }
            getConfiguration().getMulticastReceiverExecutor().execute((Runnable) next2.getValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24466n(Lock lock) {
        Logger logger = f7997l;
        logger.finest("Releasing router lock: " + lock.getClass().getSimpleName());
        lock.unlock();
    }

    public void shutdown() {
        mo24459g();
    }
}
