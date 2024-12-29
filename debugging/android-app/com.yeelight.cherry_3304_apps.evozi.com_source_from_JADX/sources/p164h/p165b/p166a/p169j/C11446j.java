package p164h.p165b.p166a.p169j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p271io.IOUtils;
import p164h.p165b.p166a.p240h.p242q.C11236a;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p250u.C11346c;

/* renamed from: h.b.a.j.j */
class C11446j extends C11443g<C11332l, C11239d> {

    /* renamed from: d */
    private static Logger f22764d = Logger.getLogger(C4432d.class.getName());

    /* renamed from: h.b.a.j.j$a */
    class C11447a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f22765a;

        /* renamed from: b */
        final /* synthetic */ C11332l f22766b;

        C11447a(C11444h hVar, C11332l lVar) {
            this.f22765a = hVar;
            this.f22766b = lVar;
        }

        public void run() {
            this.f22765a.mo31718i(C11446j.this.f22757a, this.f22766b);
        }
    }

    /* renamed from: h.b.a.j.j$b */
    class C11448b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f22768a;

        /* renamed from: b */
        final /* synthetic */ C11442f f22769b;

        C11448b(C11444h hVar, C11442f fVar) {
            this.f22768a = hVar;
            this.f22769b = fVar;
        }

        public void run() {
            this.f22768a.mo36228a(C11446j.this.f22757a, (C11332l) this.f22769b.mo36251b());
        }
    }

    /* renamed from: h.b.a.j.j$c */
    class C11449c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11442f f22771a;

        C11449c(C11446j jVar, C11442f fVar) {
            this.f22771a = fVar;
        }

        public void run() {
            ((C11239d) this.f22771a.mo36251b()).mo35737R(C11236a.DEVICE_WAS_REMOVED, (C11252j) null);
        }
    }

    /* renamed from: h.b.a.j.j$d */
    class C11450d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11444h f22772a;

        /* renamed from: b */
        final /* synthetic */ C11332l f22773b;

        C11450d(C11444h hVar, C11332l lVar) {
            this.f22772a = hVar;
            this.f22773b = lVar;
        }

        public void run() {
            this.f22772a.mo31715e(C11446j.this.f22757a, this.f22773b);
        }
    }

    C11446j(C4433e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo36268l(C11332l lVar) {
        if (mo36277u((C11333m) lVar.mo35899p())) {
            f22764d.fine("Ignoring addition, device already registered: " + lVar);
            return;
        }
        C11346c[] g = mo36261g(lVar);
        int length = g.length;
        int i = 0;
        while (i < length) {
            C11346c cVar = g[i];
            f22764d.fine("Validating remote device resource; " + cVar);
            if (this.f22757a.mo24418k(cVar.mo36027b()) == null) {
                i++;
            } else {
                throw new C11441c("URI namespace conflict with already registered resource: " + cVar);
            }
        }
        for (C11346c cVar2 : g) {
            this.f22757a.mo24436I(cVar2);
            f22764d.fine("Added remote device resource: " + cVar2);
        }
        C11442f fVar = new C11442f(((C11333m) lVar.mo35899p()).mo35922b(), lVar, (this.f22757a.mo24440M().getRemoteDeviceMaxAgeSeconds() != null ? this.f22757a.mo24440M().getRemoteDeviceMaxAgeSeconds() : ((C11333m) lVar.mo35899p()).mo35921a()).intValue());
        f22764d.fine("Adding hydrated remote device to registry with " + fVar.mo36250a().mo35635b() + " seconds expiration: " + lVar);
        mo36260f().add(fVar);
        if (f22764d.isLoggable(Level.FINEST)) {
            StringBuilder sb = new StringBuilder();
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("-------------------------- START Registry Namespace -----------------------------------\n");
            for (C11346c append : this.f22757a.mo24443P()) {
                sb.append(append);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb.append("-------------------------- END Registry Namespace -----------------------------------");
            f22764d.finest(sb.toString());
        }
        f22764d.fine("Completely hydrated remote device graph available, calling listeners: " + lVar);
        for (C11444h aVar : this.f22757a.mo24441N()) {
            this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11447a(aVar, lVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo36269m() {
        if (!mo36260f().isEmpty()) {
            HashMap hashMap = new HashMap();
            for (C11442f fVar : mo36260f()) {
                if (f22764d.isLoggable(Level.FINEST)) {
                    Logger logger = f22764d;
                    logger.finest("Device '" + fVar.mo36251b() + "' expires in seconds: " + fVar.mo36250a().mo35636c());
                }
                if (fVar.mo36250a().mo35638e(false)) {
                    hashMap.put(fVar.mo36252c(), fVar.mo36251b());
                }
            }
            for (C11332l lVar : hashMap.values()) {
                if (f22764d.isLoggable(Level.FINE)) {
                    Logger logger2 = f22764d;
                    logger2.fine("Removing expired: " + lVar);
                }
                mo36270n(lVar);
            }
            HashSet<C11239d> hashSet = new HashSet<>();
            for (C11442f fVar2 : mo36263i()) {
                if (fVar2.mo36250a().mo35638e(true)) {
                    hashSet.add(fVar2.mo36251b());
                }
            }
            for (C11239d dVar : hashSet) {
                if (f22764d.isLoggable(Level.FINEST)) {
                    Logger logger3 = f22764d;
                    logger3.fine("Renewing outgoing subscription: " + dVar);
                }
                mo36274r(dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo36270n(C11332l lVar) {
        return mo36271o(lVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo36271o(C11332l lVar, boolean z) {
        C11332l lVar2 = (C11332l) mo36259e(((C11333m) lVar.mo35899p()).mo35922b(), true);
        if (lVar2 == null) {
            return false;
        }
        f22764d.fine("Removing remote device from registry: " + lVar);
        for (C11346c cVar : mo36261g(lVar2)) {
            if (this.f22757a.mo24446S(cVar)) {
                f22764d.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator it = mo36263i().iterator();
        while (it.hasNext()) {
            C11442f fVar = (C11442f) it.next();
            if (((C11333m) ((C11332l) ((C11334n) ((C11239d) fVar.mo36251b()).mo35723N()).mo35983d()).mo35899p()).mo35922b().equals(((C11333m) lVar2.mo35899p()).mo35922b())) {
                f22764d.fine("Removing outgoing subscription: " + ((String) fVar.mo36252c()));
                it.remove();
                if (!z) {
                    this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11449c(this, fVar));
                }
            }
        }
        if (!z) {
            for (C11444h dVar : this.f22757a.mo24441N()) {
                this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11450d(dVar, lVar2));
            }
        }
        mo36260f().remove(new C11442f(((C11333m) lVar2.mo35899p()).mo35922b()));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo36272p() {
        mo36273q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo36273q(boolean z) {
        for (C11332l o : (C11332l[]) mo36231b().toArray(new C11332l[mo36231b().size()])) {
            mo36271o(o, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo36274r(C11239d dVar) {
        C4433e eVar = this.f22757a;
        eVar.mo24439L(eVar.mo24442O().mo24379a(dVar));
    }

    /* renamed from: s */
    public void mo36275s() {
        f22764d.fine("Updating remote device expiration timestamps on resume");
        ArrayList<C11333m> arrayList = new ArrayList<>();
        for (C11442f b : mo36260f()) {
            arrayList.add(((C11332l) b.mo36251b()).mo35899p());
        }
        for (C11333m u : arrayList) {
            mo36277u(u);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo36276t() {
        f22764d.fine("Cancelling all outgoing subscriptions to remote devices during shutdown");
        ArrayList<C11239d> arrayList = new ArrayList<>();
        for (C11442f b : mo36263i()) {
            arrayList.add(b.mo36251b());
        }
        for (C11239d b2 : arrayList) {
            this.f22757a.mo24442O().mo24380b(b2).run();
        }
        f22764d.fine("Removing all remote devices from registry during shutdown");
        mo36273q(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo36277u(C11333m mVar) {
        for (C11327g G : this.f22757a.mo24405F()) {
            if (G.mo35886e(mVar.mo35922b()) != null) {
                f22764d.fine("Ignoring update, a local device graph contains UDN");
                return true;
            }
        }
        C11332l lVar = (C11332l) mo36259e(mVar.mo35922b(), false);
        if (lVar == null) {
            return false;
        }
        if (!lVar.mo35909z()) {
            Logger logger = f22764d;
            logger.fine("Updating root device of embedded: " + lVar);
            lVar = lVar.mo35901r();
        }
        C11442f fVar = new C11442f(((C11333m) lVar.mo35899p()).mo35922b(), lVar, (this.f22757a.mo24440M().getRemoteDeviceMaxAgeSeconds() != null ? this.f22757a.mo24440M().getRemoteDeviceMaxAgeSeconds() : mVar.mo35921a()).intValue());
        Logger logger2 = f22764d;
        logger2.fine("Updating expiration of: " + lVar);
        mo36260f().remove(fVar);
        mo36260f().add(fVar);
        Logger logger3 = f22764d;
        logger3.fine("Remote device updated, calling listeners: " + lVar);
        for (C11444h bVar : this.f22757a.mo24441N()) {
            this.f22757a.mo24440M().getRegistryListenerExecutor().execute(new C11448b(bVar, fVar));
        }
        return true;
    }
}
