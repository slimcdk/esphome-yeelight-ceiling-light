package p154d.p198a.p199g;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p154d.p198a.p199g.p201s.C10687b;
import p154d.p198a.p199g.p201s.C10688c;
import p154d.p198a.p199g.p201s.p202d.C10690b;
import p154d.p198a.p199g.p201s.p202d.C10691c;
import p154d.p198a.p199g.p201s.p203e.C10692a;
import p154d.p198a.p199g.p201s.p203e.C10693b;
import p154d.p198a.p199g.p201s.p203e.C10695d;
import p154d.p198a.p199g.p201s.p203e.C10696e;

/* renamed from: d.a.g.j */
public interface C10648j {

    /* renamed from: d.a.g.j$a */
    public static final class C10649a implements C10648j {

        /* renamed from: a */
        private final C10656l f20361a;

        /* renamed from: b */
        private final Timer f20362b = new C10650a("JmDNS(" + this.f20361a.mo33731n0() + ").Timer", true);

        /* renamed from: c */
        private final Timer f20363c = new C10650a("JmDNS(" + this.f20361a.mo33731n0() + ").State.Timer", false);

        /* renamed from: d.a.g.j$a$a */
        public static class C10650a extends Timer {

            /* renamed from: a */
            private volatile boolean f20364a = false;

            public C10650a(String str, boolean z) {
                super(str, z);
            }

            public synchronized void cancel() {
                if (!this.f20364a) {
                    this.f20364a = true;
                    super.cancel();
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j) {
                if (!this.f20364a) {
                    super.schedule(timerTask, j);
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j, long j2) {
                if (!this.f20364a) {
                    super.schedule(timerTask, j, j2);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (!this.f20364a) {
                    super.schedule(timerTask, date);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date, long j) {
                if (!this.f20364a) {
                    super.schedule(timerTask, date, j);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
                if (!this.f20364a) {
                    super.scheduleAtFixedRate(timerTask, j, j2);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
                if (!this.f20364a) {
                    super.scheduleAtFixedRate(timerTask, date, j);
                }
            }
        }

        public C10649a(C10656l lVar) {
            this.f20361a = lVar;
        }

        /* renamed from: C */
        public void mo33652C() {
            new C10696e(this.f20361a).mo33879v(this.f20363c);
        }

        /* renamed from: D */
        public void mo33653D(C10673p pVar) {
            new C10690b(this.f20361a, pVar).mo33855k(this.f20362b);
        }

        /* renamed from: a */
        public void mo33654a() {
            this.f20362b.purge();
        }

        /* renamed from: b */
        public void mo33655b() {
            this.f20363c.cancel();
        }

        /* renamed from: g */
        public void mo33656g(String str) {
            new C10691c(this.f20361a, str).mo33855k(this.f20362b);
        }

        /* renamed from: h */
        public void mo33657h(C10621c cVar, int i) {
            new C10688c(this.f20361a, cVar, i).mo33850h(this.f20362b);
        }

        /* renamed from: i */
        public void mo33658i() {
            this.f20362b.cancel();
        }

        /* renamed from: n */
        public void mo33659n() {
            new C10693b(this.f20361a).mo33868v(this.f20363c);
        }

        /* renamed from: o */
        public void mo33660o() {
            new C10687b(this.f20361a).mo33848h(this.f20362b);
        }

        /* renamed from: s */
        public void mo33661s() {
            new C10695d(this.f20361a).mo33877v(this.f20363c);
        }

        /* renamed from: t */
        public void mo33662t() {
            new C10692a(this.f20361a).mo33866v(this.f20363c);
        }

        /* renamed from: u */
        public void mo33663u() {
            this.f20363c.purge();
        }
    }

    /* renamed from: d.a.g.j$b */
    public static final class C10651b {

        /* renamed from: b */
        private static volatile C10651b f20365b;

        /* renamed from: c */
        private static final AtomicReference<C10652a> f20366c = new AtomicReference<>();

        /* renamed from: a */
        private final ConcurrentMap<C10656l, C10648j> f20367a = new ConcurrentHashMap(20);

        /* renamed from: d.a.g.j$b$a */
        public interface C10652a {
            /* renamed from: a */
            C10648j mo33672a(C10656l lVar);
        }

        private C10651b() {
        }

        /* renamed from: a */
        public static C10651b m26177a() {
            if (f20365b == null) {
                synchronized (C10651b.class) {
                    if (f20365b == null) {
                        f20365b = new C10651b();
                    }
                }
            }
            return f20365b;
        }

        /* renamed from: c */
        protected static C10648j m26178c(C10656l lVar) {
            C10652a aVar = f20366c.get();
            C10648j a = aVar != null ? aVar.mo33672a(lVar) : null;
            return a != null ? a : new C10649a(lVar);
        }

        /* renamed from: b */
        public C10648j mo33671b(C10656l lVar) {
            C10648j jVar = (C10648j) this.f20367a.get(lVar);
            if (jVar != null) {
                return jVar;
            }
            this.f20367a.putIfAbsent(lVar, m26178c(lVar));
            return (C10648j) this.f20367a.get(lVar);
        }
    }

    /* renamed from: C */
    void mo33652C();

    /* renamed from: D */
    void mo33653D(C10673p pVar);

    /* renamed from: a */
    void mo33654a();

    /* renamed from: b */
    void mo33655b();

    /* renamed from: g */
    void mo33656g(String str);

    /* renamed from: h */
    void mo33657h(C10621c cVar, int i);

    /* renamed from: i */
    void mo33658i();

    /* renamed from: n */
    void mo33659n();

    /* renamed from: o */
    void mo33660o();

    /* renamed from: s */
    void mo33661s();

    /* renamed from: t */
    void mo33662t();

    /* renamed from: u */
    void mo33663u();
}
