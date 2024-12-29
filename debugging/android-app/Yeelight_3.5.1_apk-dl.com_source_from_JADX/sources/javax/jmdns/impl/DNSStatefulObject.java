package javax.jmdns.impl;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.constants.DNSState;
import p198p4.C10268a;

public interface DNSStatefulObject {

    public static class DefaultImplementation extends ReentrantLock implements DNSStatefulObject {
        private static Logger logger = Logger.getLogger(DefaultImplementation.class.getName());
        private static final long serialVersionUID = -3264781576883412227L;
        private final C9226a _announcing = new C9226a("Announce");
        private final C9226a _canceling = new C9226a("Cancel");
        private volatile JmDNSImpl _dns = null;
        protected volatile DNSState _state = DNSState.PROBING_1;
        protected volatile C10268a _task = null;

        private boolean willCancel() {
            return this._state.isCanceled() || this._state.isCanceling();
        }

        private boolean willClose() {
            return this._state.isClosed() || this._state.isClosing();
        }

        public boolean advanceState(C10268a aVar) {
            if (this._task != aVar) {
                return true;
            }
            lock();
            try {
                if (this._task == aVar) {
                    setState(this._state.advance());
                } else {
                    Logger logger2 = logger;
                    logger2.warning("Trying to advance state whhen not the owner. owner: " + this._task + " perpetrator: " + aVar);
                }
                return true;
            } finally {
                unlock();
            }
        }

        public void associateWithTask(C10268a aVar, DNSState dNSState) {
            if (this._task == null && this._state == dNSState) {
                lock();
                try {
                    if (this._task == null && this._state == dNSState) {
                        setTask(aVar);
                    }
                } finally {
                    unlock();
                }
            }
        }

        public boolean cancelState() {
            boolean z = false;
            if (!willCancel()) {
                lock();
                try {
                    if (!willCancel()) {
                        setState(DNSState.CANCELING_1);
                        setTask((C10268a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        public boolean closeState() {
            boolean z = false;
            if (!willClose()) {
                lock();
                try {
                    if (!willClose()) {
                        setState(DNSState.CLOSING);
                        setTask((C10268a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        public JmDNSImpl getDns() {
            return this._dns;
        }

        public boolean isAnnounced() {
            return this._state.isAnnounced();
        }

        public boolean isAnnouncing() {
            return this._state.isAnnouncing();
        }

        public boolean isAssociatedWithTask(C10268a aVar, DNSState dNSState) {
            lock();
            try {
                return this._task == aVar && this._state == dNSState;
            } finally {
                unlock();
            }
        }

        public boolean isCanceled() {
            return this._state.isCanceled();
        }

        public boolean isCanceling() {
            return this._state.isCanceling();
        }

        public boolean isClosed() {
            return this._state.isClosed();
        }

        public boolean isClosing() {
            return this._state.isClosing();
        }

        public boolean isProbing() {
            return this._state.isProbing();
        }

        /* JADX INFO: finally extract failed */
        public boolean recoverState() {
            lock();
            try {
                setState(DNSState.PROBING_1);
                setTask((C10268a) null);
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        public void removeAssociationWithTask(C10268a aVar) {
            if (this._task == aVar) {
                lock();
                try {
                    if (this._task == aVar) {
                        setTask((C10268a) null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        public boolean revertState() {
            if (willCancel()) {
                return true;
            }
            lock();
            try {
                if (!willCancel()) {
                    setState(this._state.revert());
                    setTask((C10268a) null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: protected */
        public void setDns(JmDNSImpl jmDNSImpl) {
            this._dns = jmDNSImpl;
        }

        /* access modifiers changed from: protected */
        public void setState(DNSState dNSState) {
            lock();
            try {
                this._state = dNSState;
                if (isAnnounced()) {
                    this._announcing.mo37370a();
                }
                if (isCanceled()) {
                    this._canceling.mo37370a();
                    this._announcing.mo37370a();
                }
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: protected */
        public void setTask(C10268a aVar) {
            this._task = aVar;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this._dns != null) {
                str = "DNS: " + this._dns.mo37444o0();
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this._state);
            sb.append(" task: ");
            sb.append(this._task);
            return sb.toString();
        }

        public boolean waitForAnnounced(long j) {
            if (!isAnnounced() && !willCancel()) {
                this._announcing.mo37371b(j);
            }
            if (!isAnnounced()) {
                if (willCancel() || willClose()) {
                    Logger logger2 = logger;
                    logger2.fine("Wait for announced cancelled: " + this);
                } else {
                    Logger logger3 = logger;
                    logger3.warning("Wait for announced timed out: " + this);
                }
            }
            return isAnnounced();
        }

        public boolean waitForCanceled(long j) {
            if (!isCanceled()) {
                this._canceling.mo37371b(j);
            }
            if (!isCanceled() && !willClose()) {
                Logger logger2 = logger;
                logger2.warning("Wait for canceled timed out: " + this);
            }
            return isCanceled();
        }
    }

    /* renamed from: javax.jmdns.impl.DNSStatefulObject$a */
    public static final class C9226a {

        /* renamed from: c */
        private static Logger f17052c = Logger.getLogger(C9226a.class.getName());

        /* renamed from: a */
        private final String f17053a;

        /* renamed from: b */
        private final ConcurrentMap<Thread, Semaphore> f17054b = new ConcurrentHashMap(50);

        public C9226a(String str) {
            this.f17053a = str;
        }

        /* renamed from: a */
        public void mo37370a() {
            Collection<Semaphore> values = this.f17054b.values();
            for (Semaphore semaphore : values) {
                semaphore.release();
                values.remove(semaphore);
            }
        }

        /* renamed from: b */
        public void mo37371b(long j) {
            Thread currentThread = Thread.currentThread();
            if (((Semaphore) this.f17054b.get(currentThread)) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f17054b.putIfAbsent(currentThread, semaphore);
            }
            try {
                ((Semaphore) this.f17054b.get(currentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                f17052c.log(Level.FINER, "Exception ", e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("Semaphore: ");
            sb.append(this.f17053a);
            if (this.f17054b.size() == 0) {
                sb.append(" no semaphores.");
            } else {
                sb.append(" semaphores:\n");
                for (Thread thread : this.f17054b.keySet()) {
                    sb.append("\tThread: ");
                    sb.append(thread.getName());
                    sb.append(' ');
                    sb.append(this.f17054b.get(thread));
                    sb.append(10);
                }
            }
            return sb.toString();
        }
    }

    boolean advanceState(C10268a aVar);
}
