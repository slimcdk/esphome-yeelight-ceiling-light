package org.fourthline.cling.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p194io.IOUtils;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import p127a7.C3983b;
import p127a7.C3984c;
import p200p6.C10277c;
import p214t6.C10403c;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;
import p222v6.C10549c;

/* renamed from: org.fourthline.cling.registry.f */
class C10114f extends C10112d<C10407g, C10277c> {

    /* renamed from: d */
    private static Logger f18672d = Logger.getLogger(C3983b.class.getName());

    /* renamed from: org.fourthline.cling.registry.f$a */
    class C10115a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f18673a;

        /* renamed from: b */
        final /* synthetic */ C10407g f18674b;

        C10115a(C3984c cVar, C10407g gVar) {
            this.f18673a = cVar;
            this.f18674b = gVar;
        }

        public void run() {
            this.f18673a.mo26559d(C10114f.this.f18665a, this.f18674b);
        }
    }

    /* renamed from: org.fourthline.cling.registry.f$b */
    class C10116b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f18676a;

        /* renamed from: b */
        final /* synthetic */ C10111c f18677b;

        C10116b(C3984c cVar, C10111c cVar2) {
            this.f18676a = cVar;
            this.f18677b = cVar2;
        }

        public void run() {
            this.f18676a.mo26554f(C10114f.this.f18665a, (C10407g) this.f18677b.mo40686b());
        }
    }

    /* renamed from: org.fourthline.cling.registry.f$c */
    class C10117c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10111c f18679a;

        C10117c(C10114f fVar, C10111c cVar) {
            this.f18679a = cVar;
        }

        public void run() {
            ((C10277c) this.f18679a.mo40686b()).mo41781N(CancelReason.DEVICE_WAS_REMOVED, (UpnpResponse) null);
        }
    }

    /* renamed from: org.fourthline.cling.registry.f$d */
    class C10118d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3984c f18680a;

        /* renamed from: b */
        final /* synthetic */ C10407g f18681b;

        C10118d(C3984c cVar, C10407g gVar) {
            this.f18680a = cVar;
            this.f18681b = gVar;
        }

        public void run() {
            this.f18680a.mo26561i(C10114f.this.f18665a, this.f18681b);
        }
    }

    C10114f(C3578b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo40703l(C10407g gVar) {
        if (mo40712u((C10408h) gVar.mo40506p())) {
            f18672d.fine("Ignoring addition, device already registered: " + gVar);
            return;
        }
        C10549c[] g = mo40696g(gVar);
        int length = g.length;
        int i = 0;
        while (i < length) {
            C10549c cVar = g[i];
            f18672d.fine("Validating remote device resource; " + cVar);
            if (this.f18665a.mo24947l(cVar.mo42212b()) == null) {
                i++;
            } else {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + cVar);
            }
        }
        for (C10549c cVar2 : g) {
            this.f18665a.mo24924I(cVar2);
            f18672d.fine("Added remote device resource: " + cVar2);
        }
        C10111c cVar3 = new C10111c(((C10408h) gVar.mo40506p()).mo42058b(), gVar, (this.f18665a.mo24928M().getRemoteDeviceMaxAgeSeconds() != null ? this.f18665a.mo24928M().getRemoteDeviceMaxAgeSeconds() : ((C10408h) gVar.mo40506p()).mo42057a()).intValue());
        f18672d.fine("Adding hydrated remote device to registry with " + cVar3.mo40685a().mo40340b() + " seconds expiration: " + gVar);
        mo40695f().add(cVar3);
        if (f18672d.isLoggable(Level.FINEST)) {
            StringBuilder sb = new StringBuilder();
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append("-------------------------- START Registry Namespace -----------------------------------\n");
            for (C10549c append : this.f18665a.mo24931P()) {
                sb.append(append);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb.append("-------------------------- END Registry Namespace -----------------------------------");
            f18672d.finest(sb.toString());
        }
        f18672d.fine("Completely hydrated remote device graph available, calling listeners: " + gVar);
        for (C3984c aVar : this.f18665a.mo24929N()) {
            this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10115a(aVar, gVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo40704m() {
        if (!mo40695f().isEmpty()) {
            HashMap hashMap = new HashMap();
            for (C10111c cVar : mo40695f()) {
                if (f18672d.isLoggable(Level.FINEST)) {
                    Logger logger = f18672d;
                    logger.finest("Device '" + cVar.mo40686b() + "' expires in seconds: " + cVar.mo40685a().mo40341c());
                }
                if (cVar.mo40685a().mo40343e(false)) {
                    hashMap.put(cVar.mo40687c(), cVar.mo40686b());
                }
            }
            for (C10407g gVar : hashMap.values()) {
                if (f18672d.isLoggable(Level.FINE)) {
                    Logger logger2 = f18672d;
                    logger2.fine("Removing expired: " + gVar);
                }
                mo40705n(gVar);
            }
            HashSet<C10277c> hashSet = new HashSet<>();
            for (C10111c cVar2 : mo40698i()) {
                if (cVar2.mo40685a().mo40343e(true)) {
                    hashSet.add(cVar2.mo40686b());
                }
            }
            for (C10277c cVar3 : hashSet) {
                if (f18672d.isLoggable(Level.FINEST)) {
                    Logger logger3 = f18672d;
                    logger3.fine("Renewing outgoing subscription: " + cVar3);
                }
                mo40709r(cVar3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo40705n(C10407g gVar) {
        return mo40706o(gVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo40706o(C10407g gVar, boolean z) {
        C10407g gVar2 = (C10407g) mo40694e(((C10408h) gVar.mo40506p()).mo42058b(), true);
        if (gVar2 == null) {
            return false;
        }
        f18672d.fine("Removing remote device from registry: " + gVar);
        for (C10549c cVar : mo40696g(gVar2)) {
            if (this.f18665a.mo24934S(cVar)) {
                f18672d.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator it = mo40698i().iterator();
        while (it.hasNext()) {
            C10111c cVar2 = (C10111c) it.next();
            if (((C10408h) ((C10407g) ((C10409i) ((C10277c) cVar2.mo40686b()).mo41766J()).mo40531d()).mo40506p()).mo42058b().equals(((C10408h) gVar2.mo40506p()).mo42058b())) {
                f18672d.fine("Removing outgoing subscription: " + ((String) cVar2.mo40687c()));
                it.remove();
                if (!z) {
                    this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10117c(this, cVar2));
                }
            }
        }
        if (!z) {
            for (C3984c dVar : this.f18665a.mo24929N()) {
                this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10118d(dVar, gVar2));
            }
        }
        mo40695f().remove(new C10111c(((C10408h) gVar2.mo40506p()).mo42058b()));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo40707p() {
        mo40708q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo40708q(boolean z) {
        for (C10407g o : (C10407g[]) mo40666b().toArray(new C10407g[mo40666b().size()])) {
            mo40706o(o, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo40709r(C10277c cVar) {
        C3578b bVar = this.f18665a;
        bVar.mo24927L(bVar.mo24930O().mo24903i(cVar));
    }

    /* renamed from: s */
    public void mo40710s() {
        f18672d.fine("Updating remote device expiration timestamps on resume");
        ArrayList<C10408h> arrayList = new ArrayList<>();
        for (C10111c b : mo40695f()) {
            arrayList.add(((C10407g) b.mo40686b()).mo40506p());
        }
        for (C10408h u : arrayList) {
            mo40712u(u);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo40711t() {
        f18672d.fine("Cancelling all outgoing subscriptions to remote devices during shutdown");
        ArrayList<C10277c> arrayList = new ArrayList<>();
        for (C10111c b : mo40698i()) {
            arrayList.add(b.mo40686b());
        }
        for (C10277c g : arrayList) {
            this.f18665a.mo24930O().mo24901g(g).run();
        }
        f18672d.fine("Removing all remote devices from registry during shutdown");
        mo40708q(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo40712u(C10408h hVar) {
        for (C10403c G : this.f18665a.mo24920E()) {
            if (G.mo40493e(hVar.mo42058b()) != null) {
                f18672d.fine("Ignoring update, a local device graph contains UDN");
                return true;
            }
        }
        C10407g gVar = (C10407g) mo40694e(hVar.mo42058b(), false);
        if (gVar == null) {
            return false;
        }
        if (!gVar.mo40516z()) {
            Logger logger = f18672d;
            logger.fine("Updating root device of embedded: " + gVar);
            gVar = gVar.mo40508r();
        }
        C10111c cVar = new C10111c(((C10408h) gVar.mo40506p()).mo42058b(), gVar, (this.f18665a.mo24928M().getRemoteDeviceMaxAgeSeconds() != null ? this.f18665a.mo24928M().getRemoteDeviceMaxAgeSeconds() : hVar.mo42057a()).intValue());
        Logger logger2 = f18672d;
        logger2.fine("Updating expiration of: " + gVar);
        mo40695f().remove(cVar);
        mo40695f().add(cVar);
        Logger logger3 = f18672d;
        logger3.fine("Remote device updated, calling listeners: " + gVar);
        for (C3984c bVar : this.f18665a.mo24929N()) {
            this.f18665a.mo24928M().getRegistryListenerExecutor().execute(new C10116b(bVar, cVar));
        }
        return true;
    }
}
