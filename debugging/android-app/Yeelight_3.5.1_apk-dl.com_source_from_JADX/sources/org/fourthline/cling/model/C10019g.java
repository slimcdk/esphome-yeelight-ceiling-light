package org.fourthline.cling.model;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.meta.C10068c;
import org.fourthline.cling.model.meta.C10070e;
import org.seamless.util.URIUtil;
import p222v6.C10549c;

/* renamed from: org.fourthline.cling.model.g */
public class C10019g {

    /* renamed from: c */
    private static final Logger f18494c = Logger.getLogger(C10019g.class.getName());

    /* renamed from: a */
    protected final URI f18495a;

    /* renamed from: b */
    protected final String f18496b;

    public C10019g() {
        this("");
    }

    public C10019g(String str) {
        this(URI.create(str));
    }

    public C10019g(URI uri) {
        this.f18495a = uri;
        this.f18496b = uri.getPath();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public URI mo40351a(String str) {
        try {
            String scheme = this.f18495a.getScheme();
            String host = this.f18495a.getHost();
            int port = this.f18495a.getPort();
            return new URI(scheme, (String) null, host, port, this.f18496b + str, (String) null, (String) null);
        } catch (URISyntaxException unused) {
            return URI.create(this.f18495a + str);
        }
    }

    /* renamed from: b */
    public URI mo40352b() {
        return this.f18495a;
    }

    /* renamed from: c */
    public URI mo40353c(C10070e eVar) {
        return mo40351a(mo40363m(eVar) + "/action");
    }

    /* renamed from: d */
    public URI mo40354d(C10067b bVar) {
        return mo40351a(mo40357g(bVar.mo40508r()) + "/desc");
    }

    /* renamed from: e */
    public URI mo40355e(C10070e eVar) {
        return mo40351a(mo40363m(eVar) + "/desc");
    }

    /* renamed from: f */
    public String mo40356f(C10067b bVar) {
        return this.f18496b + mo40357g(bVar.mo40508r()) + "/desc";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo40357g(C10067b bVar) {
        if (bVar.mo40506p().mo42058b() != null) {
            return "/dev" + MiotCloudImpl.COOKIE_PATH + URIUtil.m25751d(bVar.mo40506p().mo42058b().mo40661a());
        }
        throw new IllegalStateException("Can't generate local URI prefix without UDN");
    }

    /* renamed from: h */
    public URI mo40358h(C10070e eVar) {
        return mo40351a(mo40363m(eVar) + "/event" + "/cb");
    }

    /* renamed from: i */
    public String mo40359i(C10070e eVar) {
        return this.f18496b + mo40363m(eVar) + "/event" + "/cb";
    }

    /* renamed from: j */
    public URI mo40360j(C10070e eVar) {
        return mo40351a(mo40363m(eVar) + "/event");
    }

    /* renamed from: k */
    public URI mo40361k(C10068c cVar) {
        return mo40351a(mo40357g(cVar.mo40520d()) + MiotCloudImpl.COOKIE_PATH + cVar.mo40523g().toString());
    }

    /* renamed from: l */
    public C10549c[] mo40362l(C10067b bVar) {
        if (!bVar.mo40516z()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        f18494c.fine("Discovering local resources of device graph");
        for (C10549c cVar : bVar.mo40489a(this)) {
            Logger logger = f18494c;
            logger.finer("Discovered: " + cVar);
            if (!hashSet.add(cVar)) {
                logger.finer("Local resource already exists, queueing validation error");
                arrayList.add(new C10023k(C10019g.class, "resources", "Local URI namespace conflict between resources of device: " + cVar));
            }
        }
        if (arrayList.size() <= 0) {
            return (C10549c[]) hashSet.toArray(new C10549c[hashSet.size()]);
        }
        throw new ValidationException("Validation of device graph failed, call getErrors() on exception", (List<C10023k>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo40363m(C10070e eVar) {
        if (eVar.mo40533f() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo40357g(eVar.mo40531d()));
            sb.append("/svc" + MiotCloudImpl.COOKIE_PATH + eVar.mo40533f().mo40639b() + MiotCloudImpl.COOKIE_PATH + eVar.mo40533f().mo40638a());
            return sb.toString();
        }
        throw new IllegalStateException("Can't generate local URI prefix without service ID");
    }

    /* renamed from: n */
    public boolean mo40364n(URI uri) {
        return uri.toString().endsWith("/action");
    }

    /* renamed from: o */
    public boolean mo40365o(URI uri) {
        return uri.toString().endsWith("/cb");
    }

    /* renamed from: p */
    public boolean mo40366p(URI uri) {
        return uri.toString().endsWith("/event");
    }

    /* renamed from: q */
    public URI mo40367q(C10067b bVar, URI uri) {
        if (uri.isAbsolute() || uri.getPath().startsWith(MiotCloudImpl.COOKIE_PATH)) {
            return uri;
        }
        return mo40351a(mo40357g(bVar) + MiotCloudImpl.COOKIE_PATH + uri);
    }
}
