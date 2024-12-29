package org.fourthline.cling.protocol;

import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.C10028b;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.C10095p;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.transport.RouterException;
import p193o6.C9792d;
import p200p6.C10276b;
import p200p6.C10277c;
import p214t6.C10403c;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;
import p230x6.C12004a;
import p230x6.C12005b;
import p230x6.C12006c;
import p235y6.C12090a;
import p235y6.C12091b;
import p235y6.C12092c;
import p235y6.C12094e;
import p235y6.C12095f;
import p235y6.C12096g;
import p240z6.C12195a;
import p240z6.C12196b;
import p240z6.C12199c;
import p240z6.C12200d;
import p240z6.C12202e;
import p240z6.C12203f;
import p240z6.C12204g;
import p240z6.C12205h;
import p240z6.C12209i;
import p240z6.C12215j;

@ApplicationScoped
/* renamed from: org.fourthline.cling.protocol.a */
public class C3576a implements C12004a {

    /* renamed from: b */
    private static final Logger f5949b = Logger.getLogger(C12004a.class.getName());

    /* renamed from: a */
    protected final C10010b f5950a;

    /* renamed from: org.fourthline.cling.protocol.a$a */
    static /* synthetic */ class C3577a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5951a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.fourthline.cling.model.message.UpnpRequest$Method[] r0 = org.fourthline.cling.model.message.UpnpRequest.Method.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5951a = r0
                org.fourthline.cling.model.message.UpnpRequest$Method r1 = org.fourthline.cling.model.message.UpnpRequest.Method.NOTIFY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5951a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.fourthline.cling.model.message.UpnpRequest$Method r1 = org.fourthline.cling.model.message.UpnpRequest.Method.MSEARCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.protocol.C3576a.C3577a.<clinit>():void");
        }
    }

    @Inject
    public C3576a(C10010b bVar) {
        Logger logger = f5949b;
        logger.fine("Creating ProtocolFactory: " + C3576a.class.getName());
        this.f5950a = bVar;
    }

    /* renamed from: a */
    public C12204g mo24895a(C10276b bVar) {
        return new C12204g(mo24913s(), bVar);
    }

    /* renamed from: b */
    public C12095f mo24896b(C10403c cVar) {
        return new C12095f(mo24913s(), cVar);
    }

    /* renamed from: c */
    public C12209i mo24897c(C10277c cVar) {
        try {
            return new C12209i(mo24913s(), cVar, mo24913s().getRouter().mo24968c(((C10408h) ((C10407g) ((C10409i) cVar.mo41766J()).mo40531d()).mo40506p()).mo42098e()));
        } catch (RouterException e) {
            throw new ProtocolCreationException("Failed to obtain local stream servers (for event callback URL creation) from router", e);
        }
    }

    /* renamed from: d */
    public C12094e mo24898d(C10403c cVar) {
        return new C12094e(mo24913s(), cVar);
    }

    /* renamed from: e */
    public C12005b mo24899e(C10028b bVar) {
        Logger logger = f5949b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Creating protocol for incoming asynchronous: " + bVar);
        }
        if (bVar.mo40404k() instanceof UpnpRequest) {
            int i = C3577a.f5951a[((UpnpRequest) bVar.mo40404k()).mo40416d().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return mo24909o(bVar);
                }
            } else if (mo24914t(bVar) || mo24915u(bVar)) {
                return mo24907m(bVar);
            } else {
                return null;
            }
        } else if (bVar.mo40404k() instanceof UpnpResponse) {
            if (mo24915u(bVar)) {
                return mo24910p(bVar);
            }
            return null;
        }
        throw new ProtocolCreationException("Protocol for incoming datagram message not found: " + bVar);
    }

    /* renamed from: f */
    public C12096g mo24900f(UpnpHeader upnpHeader, int i) {
        return new C12096g(mo24913s(), upnpHeader, i);
    }

    /* renamed from: g */
    public C12215j mo24901g(C10277c cVar) {
        return new C12215j(mo24913s(), cVar);
    }

    /* renamed from: h */
    public C12006c mo24902h(C10030d dVar) {
        Logger logger = f5949b;
        logger.fine("Creating protocol for incoming synchronous: " + dVar);
        if (((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.GET)) {
            return mo24908n(dVar);
        }
        if (mo24913s().getConfiguration().getNamespace().mo40364n(dVar.mo40435v())) {
            if (((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.POST)) {
                return mo24905k(dVar);
            }
        } else if (mo24913s().getConfiguration().getNamespace().mo40366p(dVar.mo40435v())) {
            if (((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.SUBSCRIBE)) {
                return mo24911q(dVar);
            }
            if (((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.UNSUBSCRIBE)) {
                return mo24912r(dVar);
            }
        } else if (mo24913s().getConfiguration().getNamespace().mo40365o(dVar.mo40435v())) {
            if (((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.NOTIFY)) {
                return mo24906l(dVar);
            }
        } else if (dVar.mo40435v().getPath().contains("/event/cb")) {
            logger.warning("Fixing trailing garbage in event message path: " + dVar.mo40435v().getPath());
            String uri = dVar.mo40435v().toString();
            dVar.mo40437x(URI.create(uri.substring(0, uri.indexOf("/cb") + 3)));
            if (mo24913s().getConfiguration().getNamespace().mo40365o(dVar.mo40435v()) && ((UpnpRequest) dVar.mo40404k()).mo40416d().equals(UpnpRequest.Method.NOTIFY)) {
                return mo24906l(dVar);
            }
        }
        throw new ProtocolCreationException("Protocol for message type not found: " + dVar);
    }

    /* renamed from: i */
    public C12205h mo24903i(C10277c cVar) {
        return new C12205h(mo24913s(), cVar);
    }

    /* renamed from: j */
    public C12203f mo24904j(C9792d dVar, URL url) {
        return new C12203f(mo24913s(), dVar, url);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C12195a mo24905k(C10030d dVar) {
        return new C12195a(mo24913s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C12196b mo24906l(C10030d dVar) {
        return new C12196b(mo24913s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C12005b mo24907m(C10028b<UpnpRequest> bVar) {
        return new C12090a(mo24913s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C12199c mo24908n(C10030d dVar) {
        return new C12199c(mo24913s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C12005b mo24909o(C10028b<UpnpRequest> bVar) {
        return new C12091b(mo24913s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C12005b mo24910p(C10028b<UpnpResponse> bVar) {
        return new C12092c(mo24913s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C12200d mo24911q(C10030d dVar) {
        return new C12200d(mo24913s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C12202e mo24912r(C10030d dVar) {
        return new C12202e(mo24913s(), dVar);
    }

    /* renamed from: s */
    public C10010b mo24913s() {
        return this.f5950a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo24914t(C10028b bVar) {
        String e = bVar.mo40403j().mo36970e(UpnpHeader.Type.NTS.getHttpName());
        return e != null && e.equals(NotificationSubtype.BYEBYE.getHeaderString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo24915u(C10028b bVar) {
        C10098s[] exclusiveServiceTypes = mo24913s().getConfiguration().getExclusiveServiceTypes();
        if (exclusiveServiceTypes == null) {
            return false;
        }
        if (exclusiveServiceTypes.length == 0) {
            return true;
        }
        String e = bVar.mo40403j().mo36970e(UpnpHeader.Type.USN.getHttpName());
        if (e == null) {
            return false;
        }
        try {
            C10095p c = C10095p.m25157c(e);
            for (C10098s d : exclusiveServiceTypes) {
                if (c.mo40632a().mo40646d(d)) {
                    return true;
                }
            }
        } catch (InvalidValueException unused) {
            f5949b.finest("Not a named service type header value: " + e);
        }
        f5949b.fine("Service advertisement not supported, dropping it: " + e);
        return false;
    }
}
