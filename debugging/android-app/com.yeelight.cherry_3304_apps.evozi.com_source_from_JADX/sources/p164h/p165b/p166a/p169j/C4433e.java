package p164h.p165b.p166a.p169j;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.C4424c;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p240h.C11213c;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11397x;

@ApplicationScoped
/* renamed from: h.b.a.j.e */
public class C4433e implements C4432d {

    /* renamed from: i */
    private static Logger f7981i = Logger.getLogger(C4432d.class.getName());

    /* renamed from: a */
    protected C4423b f7982a;

    /* renamed from: b */
    protected C11445i f7983b;

    /* renamed from: c */
    protected final Set<C11239d> f7984c = new HashSet();

    /* renamed from: d */
    protected final Set<C11444h> f7985d = new HashSet();

    /* renamed from: e */
    protected final Set<C11442f<URI, C11346c>> f7986e = new HashSet();

    /* renamed from: f */
    protected final List<Runnable> f7987f = new ArrayList();

    /* renamed from: g */
    protected final C11446j f7988g = new C11446j(this);

    /* renamed from: h */
    protected final C11436b f7989h = new C11436b(this);

    /* renamed from: h.b.a.j.e$a */
    class C4434a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f7990a;

        /* renamed from: b */
        final /* synthetic */ C11332l f7991b;

        C4434a(C11444h hVar, C11332l lVar) {
            this.f7990a = hVar;
            this.f7991b = lVar;
        }

        public void run() {
            this.f7990a.mo31717g(C4433e.this, this.f7991b);
        }
    }

    /* renamed from: h.b.a.j.e$b */
    class C4435b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f7993a;

        /* renamed from: b */
        final /* synthetic */ C11332l f7994b;

        /* renamed from: c */
        final /* synthetic */ Exception f7995c;

        C4435b(C11444h hVar, C11332l lVar, Exception exc) {
            this.f7993a = hVar;
            this.f7994b = lVar;
            this.f7995c = exc;
        }

        public void run() {
            this.f7993a.mo31716f(C4433e.this, this.f7994b, this.f7995c);
        }
    }

    @Inject
    public C4433e(C4423b bVar) {
        Logger logger = f7981i;
        logger.fine("Creating Registry: " + C4433e.class.getName());
        this.f7982a = bVar;
        f7981i.fine("Starting registry background maintenance...");
        C11445i K = mo24438K();
        this.f7983b = K;
        if (K != null) {
            mo24440M().getRegistryMaintainerExecutor().execute(this.f7983b);
        }
    }

    /* renamed from: A */
    public synchronized void mo24400A(C11239d dVar) {
        this.f7988g.mo36256a(dVar);
    }

    /* renamed from: B */
    public synchronized <T extends C11346c> T mo24401B(Class<T> cls, URI uri) {
        T k = mo24418k(uri);
        if (k == null || !cls.isAssignableFrom(k.getClass())) {
            return null;
        }
        return k;
    }

    /* renamed from: C */
    public synchronized boolean mo24402C(C11327g gVar) {
        return this.f7989h.mo36240u(gVar);
    }

    /* renamed from: D */
    public synchronized boolean mo24403D(C11332l lVar) {
        return this.f7988g.mo36270n(lVar);
    }

    /* renamed from: E */
    public synchronized void mo24404E() {
        this.f7989h.mo36242w();
    }

    /* renamed from: F */
    public synchronized Collection<C11327g> mo24405F() {
        return Collections.unmodifiableCollection(this.f7989h.mo36231b());
    }

    /* renamed from: G */
    public synchronized boolean mo24406G(C11333m mVar) {
        return this.f7988g.mo36277u(mVar);
    }

    /* renamed from: H */
    public synchronized void mo24407H() {
        this.f7988g.mo36272p();
    }

    /* renamed from: I */
    public synchronized void mo24436I(C11346c cVar) {
        mo24437J(cVar, 0);
    }

    /* renamed from: J */
    public synchronized void mo24437J(C11346c cVar, int i) {
        C11442f fVar = new C11442f(cVar.mo36027b(), cVar, i);
        this.f7986e.remove(fVar);
        this.f7986e.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C11445i mo24438K() {
        return new C11445i(this, mo24440M().getRegistryMaintenanceIntervalMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public synchronized void mo24439L(Runnable runnable) {
        this.f7987f.add(runnable);
    }

    /* renamed from: M */
    public C4424c mo24440M() {
        return mo24444Q().getConfiguration();
    }

    /* renamed from: N */
    public synchronized Collection<C11444h> mo24441N() {
        return Collections.unmodifiableCollection(this.f7985d);
    }

    /* renamed from: O */
    public C4429b mo24442O() {
        return mo24444Q().getProtocolFactory();
    }

    /* renamed from: P */
    public synchronized Collection<C11346c> mo24443P() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (C11442f<URI, C11346c> b : this.f7986e) {
            hashSet.add(b.mo36251b());
        }
        return hashSet;
    }

    /* renamed from: Q */
    public C4423b mo24444Q() {
        return this.f7982a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public synchronized void mo24445R() {
        if (f7981i.isLoggable(Level.FINEST)) {
            f7981i.finest("Maintaining registry...");
        }
        Iterator<C11442f<URI, C11346c>> it = this.f7986e.iterator();
        while (it.hasNext()) {
            C11442f next = it.next();
            if (next.mo36250a().mo35637d()) {
                if (f7981i.isLoggable(Level.FINER)) {
                    Logger logger = f7981i;
                    logger.finer("Removing expired resource: " + next);
                }
                it.remove();
            }
        }
        for (C11442f next2 : this.f7986e) {
            ((C11346c) next2.mo36251b()).mo36028c(this.f7987f, next2.mo36250a());
        }
        this.f7988g.mo36269m();
        this.f7989h.mo36239t();
        mo24447T(true);
    }

    /* renamed from: S */
    public synchronized boolean mo24446S(C11346c cVar) {
        return this.f7986e.remove(new C11442f(cVar.mo36027b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public synchronized void mo24447T(boolean z) {
        if (f7981i.isLoggable(Level.FINEST)) {
            Logger logger = f7981i;
            logger.finest("Executing pending operations: " + this.f7987f.size());
        }
        for (Runnable next : this.f7987f) {
            if (z) {
                mo24440M().getAsyncProtocolExecutor().execute(next);
            } else {
                next.run();
            }
        }
        if (this.f7987f.size() > 0) {
            this.f7987f.clear();
        }
    }

    /* renamed from: a */
    public synchronized C11327g mo24408a(C11365e0 e0Var, boolean z) {
        return (C11327g) this.f7989h.mo36259e(e0Var, z);
    }

    /* renamed from: b */
    public synchronized void mo24409b(C11327g gVar) {
        this.f7989h.mo36232m(gVar);
    }

    /* renamed from: c */
    public synchronized void mo24410c(C11238c cVar) {
        this.f7989h.mo36256a(cVar);
    }

    /* renamed from: d */
    public synchronized C11239d mo24411d(String str) {
        return (C11239d) this.f7988g.mo36262h(str);
    }

    /* renamed from: e */
    public synchronized void mo24412e(C11444h hVar) {
        this.f7985d.remove(hVar);
    }

    /* renamed from: f */
    public synchronized C11238c mo24413f(String str) {
        return (C11238c) this.f7989h.mo36262h(str);
    }

    /* renamed from: g */
    public synchronized void mo24414g() {
        if (this.f7983b == null) {
            f7981i.fine("Resuming registry maintenance");
            this.f7988g.mo36275s();
            C11445i K = mo24438K();
            this.f7983b = K;
            if (K != null) {
                mo24440M().getRegistryMaintainerExecutor().execute(this.f7983b);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:15:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p165b.p166a.p240h.p242q.C11239d mo24415h(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Set<h.b.a.h.q.d> r0 = r3.f7984c
            monitor-enter(r0)
        L_0x0003:
            h.b.a.h.q.d r1 = r3.mo24411d(r4)     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            java.util.Set<h.b.a.h.q.d> r2 = r3.f7984c     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            java.util.logging.Logger r1 = f7981i     // Catch:{ InterruptedException -> 0x0003 }
            java.lang.String r2 = "Subscription not found, waiting for pending subscription procedure to terminate."
            r1.finest(r2)     // Catch:{ InterruptedException -> 0x0003 }
            java.util.Set<h.b.a.h.q.d> r1 = r3.f7984c     // Catch:{ InterruptedException -> 0x0003 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r1
        L_0x0020:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0023:
            throw r4
        L_0x0024:
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p169j.C4433e.mo24415h(java.lang.String):h.b.a.h.q.d");
    }

    /* renamed from: i */
    public synchronized Collection<C11332l> mo24416i() {
        return Collections.unmodifiableCollection(this.f7988g.mo36231b());
    }

    /* renamed from: j */
    public synchronized Collection<C11323c> mo24417j(C11397x xVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f7989h.mo36258d(xVar));
        hashSet.addAll(this.f7988g.mo36258d(xVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    /* renamed from: k */
    public synchronized C11346c mo24418k(URI uri) {
        if (!uri.isAbsolute()) {
            for (C11442f<URI, C11346c> b : this.f7986e) {
                C11346c cVar = (C11346c) b.mo36251b();
                if (cVar.mo36029d(uri)) {
                    return cVar;
                }
            }
            if (uri.getPath().endsWith(MiotCloudImpl.COOKIE_PATH)) {
                URI create = URI.create(uri.toString().substring(0, uri.toString().length() - 1));
                for (C11442f<URI, C11346c> b2 : this.f7986e) {
                    C11346c cVar2 = (C11346c) b2.mo36251b();
                    if (cVar2.mo36029d(create)) {
                        return cVar2;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Resource URI can not be absolute, only path and query:" + uri);
    }

    /* renamed from: l */
    public synchronized void mo24419l(C11239d dVar) {
        this.f7988g.mo36265k(dVar);
    }

    /* renamed from: m */
    public void mo24420m(C11239d dVar) {
        synchronized (this.f7984c) {
            if (this.f7984c.remove(dVar)) {
                this.f7984c.notifyAll();
            }
        }
    }

    /* renamed from: n */
    public synchronized void mo24421n(C11332l lVar, Exception exc) {
        for (C11444h bVar : mo24441N()) {
            mo24440M().getRegistryListenerExecutor().execute(new C4435b(bVar, lVar, exc));
        }
    }

    /* renamed from: o */
    public synchronized boolean mo24422o(C11238c cVar) {
        return this.f7989h.mo36265k(cVar);
    }

    /* renamed from: p */
    public synchronized C11213c mo24423p(C11365e0 e0Var) {
        return this.f7989h.mo36236q(e0Var);
    }

    public synchronized void pause() {
        if (this.f7983b != null) {
            f7981i.fine("Pausing registry maintenance");
            mo24447T(true);
            this.f7983b.stop();
            this.f7983b = null;
        }
    }

    /* renamed from: q */
    public synchronized Collection<C11323c> mo24425q(C11381l lVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f7989h.mo36257c(lVar));
        hashSet.addAll(this.f7988g.mo36257c(lVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    /* renamed from: r */
    public synchronized C11332l mo24426r(C11365e0 e0Var, boolean z) {
        return (C11332l) this.f7988g.mo36259e(e0Var, z);
    }

    /* renamed from: s */
    public synchronized C11323c mo24427s(C11365e0 e0Var, boolean z) {
        C11323c e = this.f7989h.mo36259e(e0Var, z);
        if (e != null) {
            return e;
        }
        C11323c e2 = this.f7988g.mo36259e(e0Var, z);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    public synchronized void shutdown() {
        f7981i.fine("Shutting down registry...");
        if (this.f7983b != null) {
            this.f7983b.stop();
        }
        f7981i.finest("Executing final pending operations on shutdown: " + this.f7987f.size());
        mo24447T(false);
        for (C11444h b : this.f7985d) {
            b.mo36229b(this);
        }
        for (C11442f b2 : (C11442f[]) this.f7986e.toArray(new C11442f[this.f7986e.size()])) {
            ((C11346c) b2.mo36251b()).mo36030e();
        }
        this.f7988g.mo36276t();
        this.f7989h.mo36245z();
        for (C11444h h : this.f7985d) {
            h.mo36230h();
        }
    }

    /* renamed from: t */
    public synchronized void mo24429t(C11444h hVar) {
        this.f7985d.add(hVar);
    }

    /* renamed from: u */
    public synchronized void mo24430u(C11332l lVar) {
        this.f7988g.mo36268l(lVar);
    }

    /* renamed from: v */
    public void mo24431v(C11239d dVar) {
        synchronized (this.f7984c) {
            this.f7984c.add(dVar);
        }
    }

    /* renamed from: w */
    public synchronized boolean mo24432w(C11332l lVar) {
        if (mo24444Q().getRegistry().mo24426r(((C11333m) lVar.mo35899p()).mo35922b(), true) != null) {
            Logger logger = f7981i;
            logger.finer("Not notifying listeners, already registered: " + lVar);
            return false;
        }
        for (C11444h aVar : mo24441N()) {
            mo24440M().getRegistryListenerExecutor().execute(new C4434a(aVar, lVar));
        }
        return true;
    }

    /* renamed from: x */
    public synchronized boolean mo24433x(C11238c cVar) {
        return this.f7989h.mo36264j(cVar);
    }

    /* renamed from: y */
    public synchronized boolean mo24434y() {
        return this.f7983b == null;
    }

    /* renamed from: z */
    public synchronized void mo24435z(C11239d dVar) {
        this.f7988g.mo36264j(dVar);
    }
}
