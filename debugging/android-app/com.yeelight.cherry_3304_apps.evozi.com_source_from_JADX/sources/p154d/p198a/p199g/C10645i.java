package p154d.p198a.p199g;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.p200r.C10683g;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.i */
public interface C10645i {

    /* renamed from: d.a.g.i$a */
    public static final class C10646a {

        /* renamed from: c */
        private static Logger f20352c = Logger.getLogger(C10646a.class.getName());

        /* renamed from: a */
        private final String f20353a;

        /* renamed from: b */
        private final ConcurrentMap<Thread, Semaphore> f20354b = new ConcurrentHashMap(50);

        public C10646a(String str) {
            this.f20353a = str;
        }

        /* renamed from: a */
        public void mo33628a() {
            Collection<Semaphore> values = this.f20354b.values();
            for (Semaphore semaphore : values) {
                semaphore.release();
                values.remove(semaphore);
            }
        }

        /* renamed from: b */
        public void mo33629b(long j) {
            Thread currentThread = Thread.currentThread();
            if (((Semaphore) this.f20354b.get(currentThread)) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f20354b.putIfAbsent(currentThread, semaphore);
            }
            try {
                ((Semaphore) this.f20354b.get(currentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                f20352c.log(Level.FINER, "Exception ", e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("Semaphore: ");
            sb.append(this.f20353a);
            if (this.f20354b.size() == 0) {
                sb.append(" no semaphores.");
            } else {
                sb.append(" semaphores:\n");
                for (Thread thread : this.f20354b.keySet()) {
                    sb.append("\tThread: ");
                    sb.append(thread.getName());
                    sb.append(' ');
                    sb.append(this.f20354b.get(thread));
                    sb.append(10);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: d.a.g.i$b */
    public static class C10647b extends ReentrantLock implements C10645i {

        /* renamed from: f */
        private static Logger f20355f = Logger.getLogger(C10647b.class.getName());

        /* renamed from: a */
        private volatile C10656l f20356a = null;

        /* renamed from: b */
        protected volatile C10686a f20357b = null;

        /* renamed from: c */
        protected volatile C10683g f20358c = C10683g.PROBING_1;

        /* renamed from: d */
        private final C10646a f20359d = new C10646a("Announce");

        /* renamed from: e */
        private final C10646a f20360e = new C10646a("Cancel");

        /* renamed from: v */
        private boolean m26130v() {
            return this.f20358c.mo33834d() || this.f20358c.mo33835e();
        }

        /* renamed from: w */
        private boolean m26131w() {
            return this.f20358c.mo33836f() || this.f20358c.mo33837g();
        }

        /* renamed from: a */
        public void mo33631a(C10686a aVar, C10683g gVar) {
            if (this.f20357b == null && this.f20358c == gVar) {
                lock();
                try {
                    if (this.f20357b == null && this.f20358c == gVar) {
                        mo33648s(aVar);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        public boolean mo33632b() {
            boolean z = false;
            if (!m26130v()) {
                lock();
                try {
                    if (!m26130v()) {
                        mo33647r(C10683g.CANCELING_1);
                        mo33648s((C10686a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        /* renamed from: c */
        public boolean mo33633c() {
            boolean z = false;
            if (!m26131w()) {
                lock();
                try {
                    if (!m26131w()) {
                        mo33647r(C10683g.CLOSING);
                        mo33648s((C10686a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        /* renamed from: d */
        public C10656l mo33634d() {
            return this.f20356a;
        }

        /* renamed from: e */
        public boolean mo33635e() {
            return this.f20358c.mo33832b();
        }

        /* renamed from: f */
        public boolean mo33636f() {
            return this.f20358c.mo33833c();
        }

        /* renamed from: g */
        public boolean mo33637g(C10686a aVar, C10683g gVar) {
            lock();
            try {
                return this.f20357b == aVar && this.f20358c == gVar;
            } finally {
                unlock();
            }
        }

        /* renamed from: h */
        public boolean mo33638h() {
            return this.f20358c.mo33834d();
        }

        /* renamed from: i */
        public boolean mo33639i() {
            return this.f20358c.mo33835e();
        }

        /* renamed from: j */
        public boolean mo33627j(C10686a aVar) {
            if (this.f20357b != aVar) {
                return true;
            }
            lock();
            try {
                if (this.f20357b == aVar) {
                    mo33647r(this.f20358c.mo33831a());
                } else {
                    Logger logger = f20355f;
                    logger.warning("Trying to advance state whhen not the owner. owner: " + this.f20357b + " perpetrator: " + aVar);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* renamed from: k */
        public boolean mo33640k() {
            return this.f20358c.mo33836f();
        }

        /* renamed from: l */
        public boolean mo33641l() {
            return this.f20358c.mo33837g();
        }

        /* renamed from: m */
        public boolean mo33642m() {
            return this.f20358c.mo33838h();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: n */
        public boolean mo33643n() {
            lock();
            try {
                mo33647r(C10683g.PROBING_1);
                mo33648s((C10686a) null);
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* renamed from: o */
        public void mo33644o(C10686a aVar) {
            if (this.f20357b == aVar) {
                lock();
                try {
                    if (this.f20357b == aVar) {
                        mo33648s((C10686a) null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: p */
        public boolean mo33645p() {
            if (m26130v()) {
                return true;
            }
            lock();
            try {
                if (!m26130v()) {
                    mo33647r(this.f20358c.mo33839i());
                    mo33648s((C10686a) null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo33646q(C10656l lVar) {
            this.f20356a = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo33647r(C10683g gVar) {
            lock();
            try {
                this.f20358c = gVar;
                if (mo33635e()) {
                    this.f20359d.mo33628a();
                }
                if (mo33638h()) {
                    this.f20360e.mo33628a();
                    this.f20359d.mo33628a();
                }
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo33648s(C10686a aVar) {
            this.f20357b = aVar;
        }

        /* renamed from: t */
        public boolean mo33649t(long j) {
            if (!mo33635e() && !m26130v()) {
                this.f20359d.mo33629b(j);
            }
            if (!mo33635e()) {
                if (m26130v() || m26131w()) {
                    Logger logger = f20355f;
                    logger.fine("Wait for announced cancelled: " + this);
                } else {
                    Logger logger2 = f20355f;
                    logger2.warning("Wait for announced timed out: " + this);
                }
            }
            return mo33635e();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            if (this.f20356a != null) {
                str = "DNS: " + this.f20356a.mo33731n0();
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.f20358c);
            sb.append(" task: ");
            sb.append(this.f20357b);
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo33651u(long j) {
            if (!mo33638h()) {
                this.f20360e.mo33629b(j);
            }
            if (!mo33638h() && !m26131w()) {
                Logger logger = f20355f;
                logger.warning("Wait for canceled timed out: " + this);
            }
            return mo33638h();
        }
    }

    /* renamed from: j */
    boolean mo33627j(C10686a aVar);
}
