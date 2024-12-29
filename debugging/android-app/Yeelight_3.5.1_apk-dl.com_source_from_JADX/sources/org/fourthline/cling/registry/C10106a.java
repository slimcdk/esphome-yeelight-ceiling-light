package org.fourthline.cling.registry;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10015c;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.types.C10105z;
import p127a7.C3983b;
import p127a7.C3984c;
import p200p6.C10275a;
import p200p6.C10276b;
import p214t6.C10403c;
import p214t6.C10404d;
import p222v6.C10549c;
import p235y6.C12095f;

/* renamed from: org.fourthline.cling.registry.a */
class C10106a extends C10112d<C10403c, C10276b> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static Logger f18649g = Logger.getLogger(C3983b.class.getName());

    /* renamed from: d */
    protected Map<C10105z, C10015c> f18650d = new HashMap();

    /* renamed from: e */
    protected long f18651e = 0;

    /* renamed from: f */
    protected Random f18652f = new Random();

    /* renamed from: org.fourthline.cling.registry.a$a */
    class C10107a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f18653a;

        /* renamed from: b */
        final /* synthetic */ C10403c f18654b;

        C10107a(C3984c cVar, C10403c cVar2) {
            this.f18653a = cVar;
            this.f18654b = cVar2;
        }

        public void run() {
            this.f18653a.mo26558c(C10106a.this.f18665a, this.f18654b);
        }
    }

    /* renamed from: org.fourthline.cling.registry.a$b */
    class C10108b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10111c f18656a;

        C10108b(C10106a aVar, C10111c cVar) {
            this.f18656a = cVar;
        }

        public void run() {
            ((C10276b) this.f18656a.mo40686b()).mo41773N(CancelReason.DEVICE_WAS_REMOVED);
        }
    }

    /* renamed from: org.fourthline.cling.registry.a$c */
    class C10109c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f18657a;

        /* renamed from: b */
        final /* synthetic */ C10403c f18658b;

        C10109c(C3984c cVar, C10403c cVar2) {
            this.f18657a = cVar;
            this.f18658b = cVar2;
        }

        public void run() {
            this.f18657a.mo26556a(C10106a.this.f18665a, this.f18658b);
        }
    }

    /* renamed from: org.fourthline.cling.registry.a$d */
    class C10110d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10403c f18660a;

        C10110d(C10403c cVar) {
            this.f18660a = cVar;
        }

        public void run() {
            try {
                C10106a.f18649g.finer("Sleeping some milliseconds to avoid flooding the network with ALIVE msgs");
                Thread.sleep((long) C10106a.this.f18652f.nextInt(100));
            } catch (InterruptedException e) {
                Logger l = C10106a.f18649g;
                l.severe("Background execution interrupted: " + e.getMessage());
            }
            C10106a.this.f18665a.mo24930O().mo24898d(this.f18660a).run();
        }
    }

    C10106a(C3578b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<C10403c> mo40666b() {
        HashSet hashSet = new HashSet();
        for (C10111c b : mo40695f()) {
            hashSet.add(b.mo40686b());
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo40667m(C10403c cVar) {
        mo40668n(cVar, (C10015c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo40668n(C10403c cVar, C10015c cVar2) {
        mo40679y(cVar.mo40506p().mo42058b(), cVar2);
        int i = 0;
        if (this.f18665a.mo24955s(cVar.mo40506p().mo42058b(), false) != null) {
            Logger logger = f18649g;
            logger.fine("Ignoring addition, device already registered: " + cVar);
            return;
        }
        Logger logger2 = f18649g;
        logger2.fine("Adding local device to registry: " + cVar);
        C10549c[] g = mo40696g(cVar);
        int length = g.length;
        while (i < length) {
            C10549c cVar3 = g[i];
            if (this.f18665a.mo24947l(cVar3.mo42212b()) == null) {
                this.f18665a.mo24924I(cVar3);
                Logger logger3 = f18649g;
                logger3.fine("Registered resource: " + cVar3);
                i++;
            } else {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + cVar3);
            }
        }
        Logger logger4 = f18649g;
        logger4.fine("Adding item to registry with expiration in seconds: " + cVar.mo40506p().mo42057a());
        C10111c cVar4 = new C10111c(cVar.mo40506p().mo42058b(), cVar, cVar.mo40506p().mo42057a().intValue());
        mo40695f().add(cVar4);
        Logger logger5 = f18649g;
        logger5.fine("Registered local device: " + cVar4);
        if (mo40673s((C10105z) cVar4.mo40687c())) {
            mo40670p(cVar, true);
        }
        if (mo40672r((C10105z) cVar4.mo40687c())) {
            mo40669o(cVar);
        }
        for (C3984c aVar : this.f18665a.mo24929N()) {
            this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10107a(aVar, cVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo40669o(C10403c cVar) {
        this.f18665a.mo24927L(new C10110d(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo40670p(C10403c cVar, boolean z) {
        C12095f b = this.f18665a.mo24930O().mo24896b(cVar);
        if (z) {
            this.f18665a.mo24927L(b);
        } else {
            b.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C10015c mo40671q(C10105z zVar) {
        return this.f18650d.get(zVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo40672r(C10105z zVar) {
        return mo40671q(zVar) == null || mo40671q(zVar).mo40336a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo40673s(C10105z zVar) {
        return mo40671q(zVar) != null && mo40671q(zVar).mo40337b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo40674t() {
        if (!mo40695f().isEmpty()) {
            HashSet<C10111c> hashSet = new HashSet<>();
            int aliveIntervalMillis = this.f18665a.mo24928M().getAliveIntervalMillis();
            if (aliveIntervalMillis > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f18651e > ((long) aliveIntervalMillis)) {
                    this.f18651e = currentTimeMillis;
                    for (C10111c cVar : mo40695f()) {
                        if (mo40672r((C10105z) cVar.mo40687c())) {
                            Logger logger = f18649g;
                            logger.finer("Flooding advertisement of local item: " + cVar);
                            hashSet.add(cVar);
                        }
                    }
                }
            } else {
                this.f18651e = 0;
                for (C10111c cVar2 : mo40695f()) {
                    if (mo40672r((C10105z) cVar2.mo40687c()) && cVar2.mo40685a().mo40343e(true)) {
                        Logger logger2 = f18649g;
                        logger2.finer("Local item has expired: " + cVar2);
                        hashSet.add(cVar2);
                    }
                }
            }
            for (C10111c cVar3 : hashSet) {
                Logger logger3 = f18649g;
                logger3.fine("Refreshing local device advertisement: " + cVar3.mo40686b());
                mo40669o((C10403c) cVar3.mo40686b());
                cVar3.mo40685a().mo40345g();
            }
            HashSet<C10111c> hashSet2 = new HashSet<>();
            for (C10111c cVar4 : mo40698i()) {
                if (cVar4.mo40685a().mo40343e(false)) {
                    hashSet2.add(cVar4);
                }
            }
            for (C10111c cVar5 : hashSet2) {
                Logger logger4 = f18649g;
                logger4.fine("Removing expired: " + cVar5);
                mo40699j((C10275a) cVar5.mo40686b());
                ((C10276b) cVar5.mo40686b()).mo41773N(CancelReason.EXPIRED);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo40675u(C10403c cVar) {
        return mo40676v(cVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo40676v(C10403c cVar, boolean z) {
        C10403c cVar2 = (C10403c) mo40694e(cVar.mo40506p().mo42058b(), true);
        if (cVar2 == null) {
            return false;
        }
        f18649g.fine("Removing local device from registry: " + cVar);
        mo40679y(cVar.mo40506p().mo42058b(), (C10015c) null);
        mo40695f().remove(new C10111c(cVar.mo40506p().mo42058b()));
        for (C10549c cVar3 : mo40696g(cVar)) {
            if (this.f18665a.mo24934S(cVar3)) {
                f18649g.fine("Unregistered resource: " + cVar3);
            }
        }
        Iterator it = mo40698i().iterator();
        while (it.hasNext()) {
            C10111c cVar4 = (C10111c) it.next();
            if (((C10404d) ((C10276b) cVar4.mo40686b()).mo41766J()).mo40531d().mo40506p().mo42058b().equals(cVar2.mo40506p().mo42058b())) {
                f18649g.fine("Removing incoming subscription: " + ((String) cVar4.mo40687c()));
                it.remove();
                if (!z) {
                    this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10108b(this, cVar4));
                }
            }
        }
        if (mo40672r(cVar.mo40506p().mo42058b())) {
            mo40670p(cVar, !z);
        }
        if (!z) {
            for (C3984c cVar5 : this.f18665a.mo24929N()) {
                this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10109c(cVar5, cVar));
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo40677w() {
        mo40678x(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo40678x(boolean z) {
        for (C10403c v : (C10403c[]) mo40666b().toArray(new C10403c[mo40666b().size()])) {
            mo40676v(v, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo40679y(C10105z zVar, C10015c cVar) {
        if (cVar != null) {
            this.f18650d.put(zVar, cVar);
        } else {
            this.f18650d.remove(zVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo40680z() {
        f18649g.fine("Clearing all registered subscriptions to local devices during shutdown");
        mo40698i().clear();
        f18649g.fine("Removing all local devices from registry during shutdown");
        mo40678x(true);
    }
}
