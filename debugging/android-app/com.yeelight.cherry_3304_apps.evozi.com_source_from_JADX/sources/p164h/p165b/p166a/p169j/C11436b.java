package p164h.p165b.p166a.p169j;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import p164h.p165b.p166a.p168i.p254i.C11411f;
import p164h.p165b.p166a.p240h.C11213c;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11237b;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11328h;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;

/* renamed from: h.b.a.j.b */
class C11436b extends C11443g<C11327g, C11238c> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static Logger f22741g = Logger.getLogger(C4432d.class.getName());

    /* renamed from: d */
    protected Map<C11365e0, C11213c> f22742d = new HashMap();

    /* renamed from: e */
    protected long f22743e = 0;

    /* renamed from: f */
    protected Random f22744f = new Random();

    /* renamed from: h.b.a.j.b$a */
    class C11437a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f22745a;

        /* renamed from: b */
        final /* synthetic */ C11327g f22746b;

        C11437a(C11444h hVar, C11327g gVar) {
            this.f22745a = hVar;
            this.f22746b = gVar;
        }

        public void run() {
            this.f22745a.mo31714d(C11436b.this.f22757a, this.f22746b);
        }
    }

    /* renamed from: h.b.a.j.b$b */
    class C11438b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11442f f22748a;

        C11438b(C11436b bVar, C11442f fVar) {
            this.f22748a = fVar;
        }

        public void run() {
            ((C11238c) this.f22748a.mo36251b()).mo35729R(C11236a.DEVICE_WAS_REMOVED);
        }
    }

    /* renamed from: h.b.a.j.b$c */
    class C11439c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f22749a;

        /* renamed from: b */
        final /* synthetic */ C11327g f22750b;

        C11439c(C11444h hVar, C11327g gVar) {
            this.f22749a = hVar;
            this.f22750b = gVar;
        }

        public void run() {
            this.f22749a.mo31713c(C11436b.this.f22757a, this.f22750b);
        }
    }

    /* renamed from: h.b.a.j.b$d */
    class C11440d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11327g f22752a;

        C11440d(C11327g gVar) {
            this.f22752a = gVar;
        }

        public void run() {
            try {
                C11436b.f22741g.finer("Sleeping some milliseconds to avoid flooding the network with ALIVE msgs");
                Thread.sleep((long) C11436b.this.f22744f.nextInt(100));
            } catch (InterruptedException e) {
                Logger l = C11436b.f22741g;
                l.severe("Background execution interrupted: " + e.getMessage());
            }
            C11436b.this.f22757a.mo24442O().mo24383e(this.f22752a).run();
        }
    }

    C11436b(C4433e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<C11327g> mo36231b() {
        HashSet hashSet = new HashSet();
        for (C11442f b : mo36260f()) {
            hashSet.add(b.mo36251b());
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo36232m(C11327g gVar) {
        mo36233n(gVar, (C11213c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo36233n(C11327g gVar, C11213c cVar) {
        mo36244y(gVar.mo35899p().mo35922b(), cVar);
        int i = 0;
        if (this.f22757a.mo24427s(gVar.mo35899p().mo35922b(), false) != null) {
            Logger logger = f22741g;
            logger.fine("Ignoring addition, device already registered: " + gVar);
            return;
        }
        Logger logger2 = f22741g;
        logger2.fine("Adding local device to registry: " + gVar);
        C11346c[] g = mo36261g(gVar);
        int length = g.length;
        while (i < length) {
            C11346c cVar2 = g[i];
            if (this.f22757a.mo24418k(cVar2.mo36027b()) == null) {
                this.f22757a.mo24436I(cVar2);
                Logger logger3 = f22741g;
                logger3.fine("Registered resource: " + cVar2);
                i++;
            } else {
                throw new C11441c("URI namespace conflict with already registered resource: " + cVar2);
            }
        }
        Logger logger4 = f22741g;
        logger4.fine("Adding item to registry with expiration in seconds: " + gVar.mo35899p().mo35921a());
        C11442f fVar = new C11442f(gVar.mo35899p().mo35922b(), gVar, gVar.mo35899p().mo35921a().intValue());
        mo36260f().add(fVar);
        Logger logger5 = f22741g;
        logger5.fine("Registered local device: " + fVar);
        if (mo36238s((C11365e0) fVar.mo36252c())) {
            mo36235p(gVar, true);
        }
        if (mo36237r((C11365e0) fVar.mo36252c())) {
            mo36234o(gVar);
        }
        for (C11444h aVar : this.f22757a.mo24441N()) {
            this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11437a(aVar, gVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo36234o(C11327g gVar) {
        this.f22757a.mo24439L(new C11440d(gVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo36235p(C11327g gVar, boolean z) {
        C11411f j = this.f22757a.mo24442O().mo24388j(gVar);
        if (z) {
            this.f22757a.mo24439L(j);
        } else {
            j.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C11213c mo36236q(C11365e0 e0Var) {
        return this.f22742d.get(e0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo36237r(C11365e0 e0Var) {
        return mo36236q(e0Var) == null || mo36236q(e0Var).mo35631a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo36238s(C11365e0 e0Var) {
        return mo36236q(e0Var) != null && mo36236q(e0Var).mo35632b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo36239t() {
        if (!mo36260f().isEmpty()) {
            HashSet<C11442f> hashSet = new HashSet<>();
            int aliveIntervalMillis = this.f22757a.mo24440M().getAliveIntervalMillis();
            if (aliveIntervalMillis > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f22743e > ((long) aliveIntervalMillis)) {
                    this.f22743e = currentTimeMillis;
                    for (C11442f fVar : mo36260f()) {
                        if (mo36237r((C11365e0) fVar.mo36252c())) {
                            Logger logger = f22741g;
                            logger.finer("Flooding advertisement of local item: " + fVar);
                            hashSet.add(fVar);
                        }
                    }
                }
            } else {
                this.f22743e = 0;
                for (C11442f fVar2 : mo36260f()) {
                    if (mo36237r((C11365e0) fVar2.mo36252c()) && fVar2.mo36250a().mo35638e(true)) {
                        Logger logger2 = f22741g;
                        logger2.finer("Local item has expired: " + fVar2);
                        hashSet.add(fVar2);
                    }
                }
            }
            for (C11442f fVar3 : hashSet) {
                Logger logger3 = f22741g;
                logger3.fine("Refreshing local device advertisement: " + fVar3.mo36251b());
                mo36234o((C11327g) fVar3.mo36251b());
                fVar3.mo36250a().mo35640g();
            }
            HashSet<C11442f> hashSet2 = new HashSet<>();
            for (C11442f fVar4 : mo36263i()) {
                if (fVar4.mo36250a().mo35638e(false)) {
                    hashSet2.add(fVar4);
                }
            }
            for (C11442f fVar5 : hashSet2) {
                Logger logger4 = f22741g;
                logger4.fine("Removing expired: " + fVar5);
                mo36264j((C11237b) fVar5.mo36251b());
                ((C11238c) fVar5.mo36251b()).mo35729R(C11236a.EXPIRED);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo36240u(C11327g gVar) {
        return mo36241v(gVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo36241v(C11327g gVar, boolean z) {
        C11327g gVar2 = (C11327g) mo36259e(gVar.mo35899p().mo35922b(), true);
        if (gVar2 == null) {
            return false;
        }
        f22741g.fine("Removing local device from registry: " + gVar);
        mo36244y(gVar.mo35899p().mo35922b(), (C11213c) null);
        mo36260f().remove(new C11442f(gVar.mo35899p().mo35922b()));
        for (C11346c cVar : mo36261g(gVar)) {
            if (this.f22757a.mo24446S(cVar)) {
                f22741g.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator it = mo36263i().iterator();
        while (it.hasNext()) {
            C11442f fVar = (C11442f) it.next();
            if (((C11328h) ((C11238c) fVar.mo36251b()).mo35723N()).mo35983d().mo35899p().mo35922b().equals(gVar2.mo35899p().mo35922b())) {
                f22741g.fine("Removing incoming subscription: " + ((String) fVar.mo36252c()));
                it.remove();
                if (!z) {
                    this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11438b(this, fVar));
                }
            }
        }
        if (mo36237r(gVar.mo35899p().mo35922b())) {
            mo36235p(gVar, !z);
        }
        if (!z) {
            for (C11444h cVar2 : this.f22757a.mo24441N()) {
                this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11439c(cVar2, gVar));
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo36242w() {
        mo36243x(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo36243x(boolean z) {
        for (C11327g v : (C11327g[]) mo36231b().toArray(new C11327g[mo36231b().size()])) {
            mo36241v(v, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo36244y(C11365e0 e0Var, C11213c cVar) {
        if (cVar != null) {
            this.f22742d.put(e0Var, cVar);
        } else {
            this.f22742d.remove(e0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo36245z() {
        f22741g.fine("Clearing all registered subscriptions to local devices during shutdown");
        mo36263i().clear();
        f22741g.fine("Removing all local devices from registry during shutdown");
        mo36243x(true);
    }
}
