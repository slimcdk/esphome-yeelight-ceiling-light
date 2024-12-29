package org.fourthline.cling.transport;

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
import org.fourthline.cling.C10011c;
import org.fourthline.cling.model.C10020h;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10029c;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;
import org.seamless.util.C10243a;
import p132b7.C4003a;
import p148d7.C8953c;
import p148d7.C8956f;
import p148d7.C8957g;
import p148d7.C8960j;
import p148d7.C8962l;
import p148d7.C8963m;
import p230x6.C12004a;
import p230x6.C12005b;

@ApplicationScoped
/* renamed from: org.fourthline.cling.transport.a */
public class C3581a implements C4003a {

    /* renamed from: l */
    private static Logger f5968l = Logger.getLogger(C4003a.class.getName());

    /* renamed from: a */
    protected C10011c f5969a;

    /* renamed from: b */
    protected C12004a f5970b;

    /* renamed from: c */
    protected volatile boolean f5971c;

    /* renamed from: d */
    protected ReentrantReadWriteLock f5972d;

    /* renamed from: e */
    protected Lock f5973e;

    /* renamed from: f */
    protected Lock f5974f = this.f5972d.writeLock();

    /* renamed from: g */
    protected C8957g f5975g;

    /* renamed from: h */
    protected C8960j f5976h;

    /* renamed from: i */
    protected final Map<NetworkInterface, C8956f> f5977i = new HashMap();

    /* renamed from: j */
    protected final Map<InetAddress, C8953c> f5978j = new HashMap();

    /* renamed from: k */
    protected final Map<InetAddress, C8962l> f5979k = new HashMap();

    @Inject
    public C3581a(C10011c cVar, C12004a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.f5972d = reentrantReadWriteLock;
        this.f5973e = reentrantReadWriteLock.readLock();
        Logger logger = f5968l;
        logger.info("Creating Router: " + getClass().getName());
        this.f5969a = cVar;
        this.f5970b = aVar;
    }

    /* renamed from: a */
    public void mo24966a(C10029c cVar) {
        mo24977j(this.f5973e);
        try {
            if (this.f5971c) {
                for (C8953c a : this.f5978j.values()) {
                    a.mo36787a(cVar);
                }
            } else {
                Logger logger = f5968l;
                logger.fine("Router disabled, not sending datagram: " + cVar);
            }
        } finally {
            mo24981n(this.f5973e);
        }
    }

    /* renamed from: b */
    public void mo24967b(C10028b bVar) {
        if (!this.f5971c) {
            Logger logger = f5968l;
            logger.fine("Router disabled, ignoring incoming message: " + bVar);
            return;
        }
        try {
            C12005b e = getProtocolFactory().mo24899e(bVar);
            if (e != null) {
                if (f5968l.isLoggable(Level.FINE)) {
                    Logger logger2 = f5968l;
                    logger2.fine("Received asynchronous message: " + bVar);
                }
                getConfiguration().getAsyncProtocolExecutor().execute(e);
            } else if (f5968l.isLoggable(Level.FINEST)) {
                Logger logger3 = f5968l;
                logger3.finest("No protocol, ignoring received message: " + bVar);
            }
        } catch (ProtocolCreationException e2) {
            Logger logger4 = f5968l;
            logger4.warning("Handling received datagram failed - " + C10243a.m25753a(e2).toString());
        }
    }

    /* renamed from: c */
    public List<C10020h> mo24968c(InetAddress inetAddress) {
        C8962l lVar;
        mo24977j(this.f5973e);
        try {
            if (!this.f5971c || this.f5979k.size() <= 0) {
                List<C10020h> list = Collections.EMPTY_LIST;
                mo24981n(this.f5973e);
                return list;
            }
            ArrayList arrayList = new ArrayList();
            if (inetAddress == null || (lVar = this.f5979k.get(inetAddress)) == null) {
                for (Map.Entry next : this.f5979k.entrySet()) {
                    arrayList.add(new C10020h((InetAddress) next.getKey(), ((C8962l) next.getValue()).getPort(), this.f5975g.mo36800f((InetAddress) next.getKey())));
                }
            } else {
                arrayList.add(new C10020h(inetAddress, lVar.getPort(), this.f5975g.mo36800f(inetAddress)));
            }
            return arrayList;
        } finally {
            mo24981n(this.f5973e);
        }
    }

    /* renamed from: d */
    public C10031e mo24969d(C10030d dVar) {
        Logger logger;
        String str;
        mo24977j(this.f5973e);
        try {
            if (!this.f5971c) {
                logger = f5968l;
                str = "Router disabled, not sending stream request: " + dVar;
            } else if (this.f5976h == null) {
                logger = f5968l;
                str = "No StreamClient available, not sending: " + dVar;
            } else {
                f5968l.fine("Sending via TCP unicast stream: " + dVar);
                C10031e a = this.f5976h.mo36781a(dVar);
                mo24981n(this.f5973e);
                return a;
            }
            logger.fine(str);
            mo24981n(this.f5973e);
            return null;
        } catch (InterruptedException e) {
            throw new RouterException("Sending stream request was interrupted", e);
        } catch (Throwable th) {
            mo24981n(this.f5973e);
            throw th;
        }
    }

    /* renamed from: e */
    public boolean mo24970e() {
        boolean z;
        mo24977j(this.f5974f);
        try {
            if (!this.f5971c) {
                f5968l.fine("Starting networking services...");
                C8957g createNetworkAddressFactory = getConfiguration().createNetworkAddressFactory();
                this.f5975g = createNetworkAddressFactory;
                mo24980m(createNetworkAddressFactory.mo36795a());
                mo24979l(this.f5975g.mo36797c());
                if (this.f5975g.mo36796b()) {
                    this.f5976h = getConfiguration().createStreamClient();
                    z = true;
                    this.f5971c = true;
                    mo24981n(this.f5974f);
                    return z;
                }
                throw new NoNetworkException("No usable network interface and/or addresses available, check the log for errors.");
            }
        } catch (InitializationException e) {
            mo24976i(e);
        } catch (Throwable th) {
            mo24981n(this.f5974f);
            throw th;
        }
        z = false;
        mo24981n(this.f5974f);
        return z;
    }

    /* renamed from: f */
    public void mo24971f(C8963m mVar) {
        if (!this.f5971c) {
            Logger logger = f5968l;
            logger.fine("Router disabled, ignoring incoming: " + mVar);
            return;
        }
        Logger logger2 = f5968l;
        logger2.fine("Received synchronous stream: " + mVar);
        getConfiguration().getSyncProtocolExecutorService().execute(mVar);
    }

    /* renamed from: g */
    public boolean mo24972g() {
        mo24977j(this.f5974f);
        try {
            if (this.f5971c) {
                f5968l.fine("Disabling network services...");
                if (this.f5976h != null) {
                    f5968l.fine("Stopping stream client connection management/pool");
                    this.f5976h.stop();
                    this.f5976h = null;
                }
                for (Map.Entry next : this.f5979k.entrySet()) {
                    Logger logger = f5968l;
                    logger.fine("Stopping stream server on address: " + next.getKey());
                    ((C8962l) next.getValue()).stop();
                }
                this.f5979k.clear();
                for (Map.Entry next2 : this.f5977i.entrySet()) {
                    Logger logger2 = f5968l;
                    logger2.fine("Stopping multicast receiver on interface: " + ((NetworkInterface) next2.getKey()).getDisplayName());
                    ((C8956f) next2.getValue()).stop();
                }
                this.f5977i.clear();
                for (Map.Entry next3 : this.f5978j.entrySet()) {
                    Logger logger3 = f5968l;
                    logger3.fine("Stopping datagram I/O on address: " + next3.getKey());
                    ((C8953c) next3.getValue()).stop();
                }
                this.f5978j.clear();
                this.f5975g = null;
                this.f5971c = false;
                return true;
            }
            mo24981n(this.f5974f);
            return false;
        } finally {
            mo24981n(this.f5974f);
        }
    }

    public C10011c getConfiguration() {
        return this.f5969a;
    }

    public C12004a getProtocolFactory() {
        return this.f5970b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo24975h() {
        return 6000;
    }

    /* renamed from: i */
    public void mo24976i(InitializationException initializationException) {
        if (initializationException instanceof NoNetworkException) {
            f5968l.info("Unable to initialize network router, no network found.");
            return;
        }
        Logger logger = f5968l;
        logger.severe("Unable to initialize network router: " + initializationException);
        Logger logger2 = f5968l;
        logger2.severe("Cause: " + C10243a.m25753a(initializationException));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo24977j(Lock lock) {
        mo24978k(lock, mo24975h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo24978k(Lock lock, int i) {
        try {
            Logger logger = f5968l;
            logger.finest("Trying to obtain lock with timeout milliseconds '" + i + "': " + lock.getClass().getSimpleName());
            if (lock.tryLock((long) i, TimeUnit.MILLISECONDS)) {
                Logger logger2 = f5968l;
                logger2.finest("Acquired router lock: " + lock.getClass().getSimpleName());
                return;
            }
            throw new RouterException("Router wasn't available exclusively after waiting " + i + "ms, lock failed: " + lock.getClass().getSimpleName());
        } catch (InterruptedException e) {
            throw new RouterException("Interruption while waiting for exclusive access: " + lock.getClass().getSimpleName(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo24979l(Iterator<InetAddress> it) {
        while (it.hasNext()) {
            InetAddress next = it.next();
            C8962l createStreamServer = getConfiguration().createStreamServer(this.f5975g);
            if (createStreamServer == null) {
                Logger logger = f5968l;
                logger.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f5968l.isLoggable(Level.FINE)) {
                        Logger logger2 = f5968l;
                        logger2.fine("Init stream server on address: " + next);
                    }
                    createStreamServer.mo36805C(next, this);
                    this.f5979k.put(next, createStreamServer);
                } catch (InitializationException e) {
                    Throwable a = C10243a.m25753a(e);
                    if (a instanceof BindException) {
                        Logger logger3 = f5968l;
                        logger3.warning("Failed to init StreamServer: " + a);
                        Logger logger4 = f5968l;
                        Level level = Level.FINE;
                        if (logger4.isLoggable(level)) {
                            f5968l.log(level, "Initialization exception root cause", a);
                        }
                        Logger logger5 = f5968l;
                        logger5.warning("Removing unusable address: " + next);
                        it.remove();
                    } else {
                        throw e;
                    }
                }
            }
            C8953c createDatagramIO = getConfiguration().createDatagramIO(this.f5975g);
            if (createDatagramIO == null) {
                Logger logger6 = f5968l;
                logger6.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f5968l.isLoggable(Level.FINE)) {
                        Logger logger7 = f5968l;
                        logger7.fine("Init datagram I/O on address: " + next);
                    }
                    createDatagramIO.mo36789w(next, this, getConfiguration().getDatagramProcessor());
                    this.f5978j.put(next, createDatagramIO);
                } catch (InitializationException e2) {
                    throw e2;
                }
            }
        }
        for (Map.Entry next2 : this.f5979k.entrySet()) {
            if (f5968l.isLoggable(Level.FINE)) {
                Logger logger8 = f5968l;
                logger8.fine("Starting stream server on address: " + next2.getKey());
            }
            getConfiguration().getStreamServerExecutorService().execute((Runnable) next2.getValue());
        }
        for (Map.Entry next3 : this.f5978j.entrySet()) {
            if (f5968l.isLoggable(Level.FINE)) {
                Logger logger9 = f5968l;
                logger9.fine("Starting datagram I/O on address: " + next3.getKey());
            }
            getConfiguration().getDatagramIOExecutor().execute((Runnable) next3.getValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo24980m(Iterator<NetworkInterface> it) {
        while (it.hasNext()) {
            NetworkInterface next = it.next();
            C8956f createMulticastReceiver = getConfiguration().createMulticastReceiver(this.f5975g);
            if (createMulticastReceiver == null) {
                Logger logger = f5968l;
                logger.info("Configuration did not create a MulticastReceiver for: " + next);
            } else {
                try {
                    if (f5968l.isLoggable(Level.FINE)) {
                        Logger logger2 = f5968l;
                        logger2.fine("Init multicast receiver on interface: " + next.getDisplayName());
                    }
                    createMulticastReceiver.mo36793p(next, this, this.f5975g, getConfiguration().getDatagramProcessor());
                    this.f5977i.put(next, createMulticastReceiver);
                } catch (InitializationException e) {
                    throw e;
                }
            }
        }
        for (Map.Entry next2 : this.f5977i.entrySet()) {
            if (f5968l.isLoggable(Level.FINE)) {
                Logger logger3 = f5968l;
                logger3.fine("Starting multicast receiver on interface: " + ((NetworkInterface) next2.getKey()).getDisplayName());
            }
            getConfiguration().getMulticastReceiverExecutor().execute((Runnable) next2.getValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24981n(Lock lock) {
        Logger logger = f5968l;
        logger.finest("Releasing router lock: " + lock.getClass().getSimpleName());
        lock.unlock();
    }

    public void shutdown() {
        mo24972g();
    }
}
