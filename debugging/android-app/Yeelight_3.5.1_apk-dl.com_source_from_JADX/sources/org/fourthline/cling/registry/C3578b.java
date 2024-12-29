package org.fourthline.cling.registry;

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
import org.fourthline.cling.C10010b;
import org.fourthline.cling.C10011c;
import org.fourthline.cling.model.C10015c;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import p127a7.C3983b;
import p127a7.C3984c;
import p200p6.C10276b;
import p200p6.C10277c;
import p214t6.C10403c;
import p214t6.C10407g;
import p214t6.C10408h;
import p222v6.C10549c;
import p230x6.C12004a;

@ApplicationScoped
/* renamed from: org.fourthline.cling.registry.b */
public class C3578b implements C3983b {

    /* renamed from: i */
    private static Logger f5952i = Logger.getLogger(C3983b.class.getName());

    /* renamed from: a */
    protected C10010b f5953a;

    /* renamed from: b */
    protected C10113e f5954b;

    /* renamed from: c */
    protected final Set<C10277c> f5955c = new HashSet();

    /* renamed from: d */
    protected final Set<C3984c> f5956d = new HashSet();

    /* renamed from: e */
    protected final Set<C10111c<URI, C10549c>> f5957e = new HashSet();

    /* renamed from: f */
    protected final List<Runnable> f5958f = new ArrayList();

    /* renamed from: g */
    protected final C10114f f5959g = new C10114f(this);

    /* renamed from: h */
    protected final C10106a f5960h = new C10106a(this);

    /* renamed from: org.fourthline.cling.registry.b$a */
    class C3579a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f5961a;

        /* renamed from: b */
        final /* synthetic */ C10407g f5962b;

        C3579a(C3984c cVar, C10407g gVar) {
            this.f5961a = cVar;
            this.f5962b = gVar;
        }

        public void run() {
            this.f5961a.mo26557b(C3578b.this, this.f5962b);
        }
    }

    /* renamed from: org.fourthline.cling.registry.b$b */
    class C3580b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f5964a;

        /* renamed from: b */
        final /* synthetic */ C10407g f5965b;

        /* renamed from: c */
        final /* synthetic */ Exception f5966c;

        C3580b(C3984c cVar, C10407g gVar, Exception exc) {
            this.f5964a = cVar;
            this.f5965b = gVar;
            this.f5966c = exc;
        }

        public void run() {
            this.f5964a.mo26560g(C3578b.this, this.f5965b, this.f5966c);
        }
    }

    @Inject
    public C3578b(C10010b bVar) {
        Logger logger = f5952i;
        logger.fine("Creating Registry: " + C3578b.class.getName());
        this.f5953a = bVar;
        f5952i.fine("Starting registry background maintenance...");
        C10113e K = mo24926K();
        this.f5954b = K;
        if (K != null) {
            mo24928M().getRegistryMaintainerExecutor().execute(this.f5954b);
        }
    }

    /* renamed from: A */
    public synchronized void mo24916A(C10277c cVar) {
        this.f5959g.mo40700k(cVar);
    }

    /* renamed from: B */
    public synchronized <T extends C10549c> T mo24917B(Class<T> cls, URI uri) {
        T l = mo24947l(uri);
        if (l == null || !cls.isAssignableFrom(l.getClass())) {
            return null;
        }
        return l;
    }

    /* renamed from: C */
    public synchronized void mo24918C() {
        this.f5960h.mo40677w();
    }

    /* renamed from: D */
    public void mo24919D(C10277c cVar) {
        synchronized (this.f5955c) {
            this.f5955c.add(cVar);
        }
    }

    /* renamed from: E */
    public synchronized Collection<C10403c> mo24920E() {
        return Collections.unmodifiableCollection(this.f5960h.mo40666b());
    }

    /* renamed from: F */
    public void mo24921F(C10277c cVar) {
        synchronized (this.f5955c) {
            if (this.f5955c.remove(cVar)) {
                this.f5955c.notifyAll();
            }
        }
    }

    /* renamed from: G */
    public synchronized void mo24922G(C10403c cVar) {
        this.f5960h.mo40667m(cVar);
    }

    /* renamed from: H */
    public synchronized void mo24923H() {
        this.f5959g.mo40707p();
    }

    /* renamed from: I */
    public synchronized void mo24924I(C10549c cVar) {
        mo24925J(cVar, 0);
    }

    /* renamed from: J */
    public synchronized void mo24925J(C10549c cVar, int i) {
        C10111c cVar2 = new C10111c(cVar.mo42212b(), cVar, i);
        this.f5957e.remove(cVar2);
        this.f5957e.add(cVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C10113e mo24926K() {
        return new C10113e(this, mo24928M().getRegistryMaintenanceIntervalMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public synchronized void mo24927L(Runnable runnable) {
        this.f5958f.add(runnable);
    }

    /* renamed from: M */
    public C10011c mo24928M() {
        return mo24932Q().getConfiguration();
    }

    /* renamed from: N */
    public synchronized Collection<C3984c> mo24929N() {
        return Collections.unmodifiableCollection(this.f5956d);
    }

    /* renamed from: O */
    public C12004a mo24930O() {
        return mo24932Q().getProtocolFactory();
    }

    /* renamed from: P */
    public synchronized Collection<C10549c> mo24931P() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (C10111c<URI, C10549c> b : this.f5957e) {
            hashSet.add(b.mo40686b());
        }
        return hashSet;
    }

    /* renamed from: Q */
    public C10010b mo24932Q() {
        return this.f5953a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public synchronized void mo24933R() {
        if (f5952i.isLoggable(Level.FINEST)) {
            f5952i.finest("Maintaining registry...");
        }
        Iterator<C10111c<URI, C10549c>> it = this.f5957e.iterator();
        while (it.hasNext()) {
            C10111c next = it.next();
            if (next.mo40685a().mo40342d()) {
                if (f5952i.isLoggable(Level.FINER)) {
                    Logger logger = f5952i;
                    logger.finer("Removing expired resource: " + next);
                }
                it.remove();
            }
        }
        for (C10111c next2 : this.f5957e) {
            ((C10549c) next2.mo40686b()).mo42213c(this.f5958f, next2.mo40685a());
        }
        this.f5959g.mo40704m();
        this.f5960h.mo40674t();
        mo24935T(true);
    }

    /* renamed from: S */
    public synchronized boolean mo24934S(C10549c cVar) {
        return this.f5957e.remove(new C10111c(cVar.mo42212b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public synchronized void mo24935T(boolean z) {
        if (f5952i.isLoggable(Level.FINEST)) {
            Logger logger = f5952i;
            logger.finest("Executing pending operations: " + this.f5958f.size());
        }
        for (Runnable next : this.f5958f) {
            if (z) {
                mo24928M().getAsyncProtocolExecutor().execute(next);
            } else {
                next.run();
            }
        }
        if (this.f5958f.size() > 0) {
            this.f5958f.clear();
        }
    }

    /* renamed from: a */
    public synchronized C10403c mo24936a(C10105z zVar, boolean z) {
        return (C10403c) this.f5960h.mo40694e(zVar, z);
    }

    /* renamed from: b */
    public synchronized C10277c mo24937b(String str) {
        return (C10277c) this.f5959g.mo40697h(str);
    }

    /* renamed from: c */
    public synchronized void mo24938c(C10407g gVar, Exception exc) {
        for (C3984c bVar : mo24929N()) {
            mo24928M().getRegistryListenerExecutor().execute(new C3580b(bVar, gVar, exc));
        }
    }

    /* renamed from: d */
    public synchronized boolean mo24939d(C10276b bVar) {
        return this.f5960h.mo40700k(bVar);
    }

    /* renamed from: e */
    public synchronized boolean mo24940e(C10403c cVar) {
        return this.f5960h.mo40675u(cVar);
    }

    /* renamed from: f */
    public synchronized C10276b mo24941f(String str) {
        return (C10276b) this.f5960h.mo40697h(str);
    }

    /* renamed from: g */
    public synchronized void mo24942g() {
        if (this.f5954b == null) {
            f5952i.fine("Resuming registry maintenance");
            this.f5959g.mo40710s();
            C10113e K = mo24926K();
            this.f5954b = K;
            if (K != null) {
                mo24928M().getRegistryMaintainerExecutor().execute(this.f5954b);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:15:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p200p6.C10277c mo24943h(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Set<p6.c> r0 = r3.f5955c
            monitor-enter(r0)
        L_0x0003:
            p6.c r1 = r3.mo24937b(r4)     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x001e
            java.util.Set<p6.c> r2 = r3.f5955c     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            java.util.logging.Logger r1 = f5952i     // Catch:{ InterruptedException -> 0x0003 }
            java.lang.String r2 = "Subscription not found, waiting for pending subscription procedure to terminate."
            r1.finest(r2)     // Catch:{ InterruptedException -> 0x0003 }
            java.util.Set<p6.c> r1 = r3.f5955c     // Catch:{ InterruptedException -> 0x0003 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.registry.C3578b.mo24943h(java.lang.String):p6.c");
    }

    /* renamed from: i */
    public synchronized Collection<C10407g> mo24944i() {
        return Collections.unmodifiableCollection(this.f5959g.mo40666b());
    }

    /* renamed from: j */
    public synchronized boolean mo24945j(C10407g gVar) {
        return this.f5959g.mo40705n(gVar);
    }

    /* renamed from: k */
    public synchronized Collection<C10067b> mo24946k(C10098s sVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f5960h.mo40693d(sVar));
        hashSet.addAll(this.f5959g.mo40693d(sVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    /* renamed from: l */
    public synchronized C10549c mo24947l(URI uri) {
        if (!uri.isAbsolute()) {
            for (C10111c<URI, C10549c> b : this.f5957e) {
                C10549c cVar = (C10549c) b.mo40686b();
                if (cVar.mo42214d(uri)) {
                    return cVar;
                }
            }
            if (uri.getPath().endsWith(MiotCloudImpl.COOKIE_PATH)) {
                URI create = URI.create(uri.toString().substring(0, uri.toString().length() - 1));
                for (C10111c<URI, C10549c> b2 : this.f5957e) {
                    C10549c cVar2 = (C10549c) b2.mo40686b();
                    if (cVar2.mo42214d(create)) {
                        return cVar2;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Resource URI can not be absolute, only path and query:" + uri);
    }

    /* renamed from: m */
    public synchronized boolean mo24948m(C10276b bVar) {
        return this.f5960h.mo40699j(bVar);
    }

    /* renamed from: n */
    public synchronized void mo24949n(C10277c cVar) {
        this.f5959g.mo40699j(cVar);
    }

    /* renamed from: o */
    public synchronized void mo24950o(C10277c cVar) {
        this.f5959g.mo40691a(cVar);
    }

    /* renamed from: p */
    public synchronized C10015c mo24951p(C10105z zVar) {
        return this.f5960h.mo40671q(zVar);
    }

    public synchronized void pause() {
        if (this.f5954b != null) {
            f5952i.fine("Pausing registry maintenance");
            mo24935T(true);
            this.f5954b.stop();
            this.f5954b = null;
        }
    }

    /* renamed from: q */
    public synchronized Collection<C10067b> mo24953q(C10089j jVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f5960h.mo40692c(jVar));
        hashSet.addAll(this.f5959g.mo40692c(jVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    /* renamed from: r */
    public synchronized C10407g mo24954r(C10105z zVar, boolean z) {
        return (C10407g) this.f5959g.mo40694e(zVar, z);
    }

    /* renamed from: s */
    public synchronized C10067b mo24955s(C10105z zVar, boolean z) {
        C10067b e = this.f5960h.mo40694e(zVar, z);
        if (e != null) {
            return e;
        }
        C10067b e2 = this.f5959g.mo40694e(zVar, z);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    public synchronized void shutdown() {
        f5952i.fine("Shutting down registry...");
        C10113e eVar = this.f5954b;
        if (eVar != null) {
            eVar.stop();
        }
        f5952i.finest("Executing final pending operations on shutdown: " + this.f5958f.size());
        mo24935T(false);
        for (C3984c e : this.f5956d) {
            e.mo26553e(this);
        }
        Set<C10111c<URI, C10549c>> set = this.f5957e;
        for (C10111c b : (C10111c[]) set.toArray(new C10111c[set.size()])) {
            ((C10549c) b.mo40686b()).mo42215e();
        }
        this.f5959g.mo40711t();
        this.f5960h.mo40680z();
        for (C3984c h : this.f5956d) {
            h.mo26555h();
        }
    }

    /* renamed from: t */
    public synchronized void mo24957t(C10276b bVar) {
        this.f5960h.mo40691a(bVar);
    }

    /* renamed from: u */
    public synchronized void mo24958u(C3984c cVar) {
        this.f5956d.add(cVar);
    }

    /* renamed from: v */
    public synchronized boolean mo24959v(C10407g gVar) {
        if (mo24932Q().getRegistry().mo24954r(((C10408h) gVar.mo40506p()).mo42058b(), true) != null) {
            Logger logger = f5952i;
            logger.finer("Not notifying listeners, already registered: " + gVar);
            return false;
        }
        for (C3984c aVar : mo24929N()) {
            mo24928M().getRegistryListenerExecutor().execute(new C3579a(aVar, gVar));
        }
        return true;
    }

    /* renamed from: w */
    public synchronized boolean mo24960w() {
        return this.f5954b == null;
    }

    /* renamed from: x */
    public synchronized void mo24961x(C10407g gVar) {
        this.f5959g.mo40703l(gVar);
    }

    /* renamed from: y */
    public synchronized boolean mo24962y(C10408h hVar) {
        return this.f5959g.mo40712u(hVar);
    }

    /* renamed from: z */
    public synchronized void mo24963z(C3984c cVar) {
        this.f5956d.remove(cVar);
    }
}
