package javax.jmdns.impl;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p198p4.C10269b;
import p198p4.C10270c;
import p202q4.C10281b;
import p202q4.C10282c;
import p205r4.C10292a;
import p205r4.C10293b;
import p205r4.C10295d;
import p205r4.C10296e;

/* renamed from: javax.jmdns.impl.i */
public interface C9267i {

    /* renamed from: javax.jmdns.impl.i$a */
    public static final class C9268a implements C9267i {

        /* renamed from: a */
        private final JmDNSImpl f17179a;

        /* renamed from: b */
        private final Timer f17180b;

        /* renamed from: c */
        private final Timer f17181c;

        /* renamed from: javax.jmdns.impl.i$a$a */
        public static class C9269a extends Timer {

            /* renamed from: a */
            private volatile boolean f17182a = false;

            public C9269a(String str, boolean z) {
                super(str, z);
            }

            public synchronized void cancel() {
                if (!this.f17182a) {
                    this.f17182a = true;
                    super.cancel();
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j) {
                if (!this.f17182a) {
                    super.schedule(timerTask, j);
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j, long j2) {
                if (!this.f17182a) {
                    super.schedule(timerTask, j, j2);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (!this.f17182a) {
                    super.schedule(timerTask, date);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date, long j) {
                if (!this.f17182a) {
                    super.schedule(timerTask, date, j);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
                if (!this.f17182a) {
                    super.scheduleAtFixedRate(timerTask, j, j2);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
                if (!this.f17182a) {
                    super.scheduleAtFixedRate(timerTask, date, j);
                }
            }
        }

        public C9268a(JmDNSImpl jmDNSImpl) {
            this.f17179a = jmDNSImpl;
            this.f17180b = new C9269a("JmDNS(" + jmDNSImpl.mo37444o0() + ").Timer", true);
            this.f17181c = new C9269a("JmDNS(" + jmDNSImpl.mo37444o0() + ").State.Timer", false);
        }

        /* renamed from: a */
        public void mo37417a() {
            this.f17180b.purge();
        }

        /* renamed from: c */
        public void mo37418c() {
            this.f17181c.cancel();
        }

        /* renamed from: d */
        public void mo37421d(String str) {
            new C10282c(this.f17179a, str).mo41792k(this.f17180b);
        }

        /* renamed from: f */
        public void mo37423f(C9241c cVar, int i) {
            new C10270c(this.f17179a, cVar, i).mo41758h(this.f17180b);
        }

        /* renamed from: h */
        public void mo37427h() {
            this.f17180b.cancel();
        }

        /* renamed from: i */
        public void mo37430i() {
            new C10293b(this.f17179a).mo41821x(this.f17181c);
        }

        /* renamed from: k */
        public void mo37435k() {
            new C10269b(this.f17179a).mo41756h(this.f17180b);
        }

        /* renamed from: l */
        public void mo37438l() {
            new C10295d(this.f17179a).mo41830x(this.f17181c);
        }

        /* renamed from: m */
        public void mo37440m() {
            new C10292a(this.f17179a).mo41819x(this.f17181c);
        }

        /* renamed from: n */
        public void mo37442n() {
            this.f17181c.purge();
        }

        /* renamed from: p */
        public void mo37446p() {
            new C10296e(this.f17179a).mo41832x(this.f17181c);
        }

        /* renamed from: q */
        public void mo37448q(ServiceInfoImpl serviceInfoImpl) {
            new C10281b(this.f17179a, serviceInfoImpl).mo41792k(this.f17180b);
        }
    }

    /* renamed from: javax.jmdns.impl.i$b */
    public static final class C9270b {

        /* renamed from: b */
        private static volatile C9270b f17183b;

        /* renamed from: c */
        private static final AtomicReference<C9271a> f17184c = new AtomicReference<>();

        /* renamed from: a */
        private final ConcurrentMap<JmDNSImpl, C9267i> f17185a = new ConcurrentHashMap(20);

        /* renamed from: javax.jmdns.impl.i$b$a */
        public interface C9271a {
            /* renamed from: a */
            C9267i mo37695a(JmDNSImpl jmDNSImpl);
        }

        private C9270b() {
        }

        /* renamed from: a */
        public static C9270b m22657a() {
            if (f17183b == null) {
                synchronized (C9270b.class) {
                    if (f17183b == null) {
                        f17183b = new C9270b();
                    }
                }
            }
            return f17183b;
        }

        /* renamed from: c */
        protected static C9267i m22658c(JmDNSImpl jmDNSImpl) {
            C9271a aVar = f17184c.get();
            C9267i a = aVar != null ? aVar.mo37695a(jmDNSImpl) : null;
            return a != null ? a : new C9268a(jmDNSImpl);
        }

        /* renamed from: b */
        public C9267i mo37694b(JmDNSImpl jmDNSImpl) {
            C9267i iVar = (C9267i) this.f17185a.get(jmDNSImpl);
            if (iVar != null) {
                return iVar;
            }
            this.f17185a.putIfAbsent(jmDNSImpl, m22658c(jmDNSImpl));
            return (C9267i) this.f17185a.get(jmDNSImpl);
        }
    }

    /* renamed from: a */
    void mo37417a();

    /* renamed from: c */
    void mo37418c();

    /* renamed from: d */
    void mo37421d(String str);

    /* renamed from: f */
    void mo37423f(C9241c cVar, int i);

    /* renamed from: h */
    void mo37427h();

    /* renamed from: i */
    void mo37430i();

    /* renamed from: k */
    void mo37435k();

    /* renamed from: l */
    void mo37438l();

    /* renamed from: m */
    void mo37440m();

    /* renamed from: n */
    void mo37442n();

    /* renamed from: p */
    void mo37446p();

    /* renamed from: q */
    void mo37448q(ServiceInfoImpl serviceInfoImpl);
}
