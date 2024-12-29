package p164h.p165b.p166a.p240h;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p248s.C11326f;
import p164h.p165b.p166a.p240h.p248s.C11335o;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p257c.p259b.C11500e;

/* renamed from: h.b.a.h.g */
public class C11217g {

    /* renamed from: c */
    private static final Logger f22296c = Logger.getLogger(C11217g.class.getName());

    /* renamed from: a */
    protected final URI f22297a;

    /* renamed from: b */
    protected final String f22298b;

    public C11217g() {
        this("");
    }

    public C11217g(String str) {
        this(URI.create(str));
    }

    public C11217g(URI uri) {
        this.f22297a = uri;
        this.f22298b = uri.getPath();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public URI mo35646a(String str) {
        try {
            String scheme = this.f22297a.getScheme();
            String host = this.f22297a.getHost();
            int port = this.f22297a.getPort();
            return new URI(scheme, (String) null, host, port, this.f22298b + str, (String) null, (String) null);
        } catch (URISyntaxException unused) {
            return URI.create(this.f22297a + str);
        }
    }

    /* renamed from: b */
    public URI mo35647b() {
        return this.f22297a;
    }

    /* renamed from: c */
    public URI mo35648c(C11335o oVar) {
        return mo35646a(mo35658m(oVar) + "/action");
    }

    /* renamed from: d */
    public URI mo35649d(C11323c cVar) {
        return mo35646a(mo35652g(cVar.mo35901r()) + "/desc");
    }

    /* renamed from: e */
    public URI mo35650e(C11335o oVar) {
        return mo35646a(mo35658m(oVar) + "/desc");
    }

    /* renamed from: f */
    public String mo35651f(C11323c cVar) {
        return this.f22298b + mo35652g(cVar.mo35901r()) + "/desc";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo35652g(C11323c cVar) {
        if (cVar.mo35899p().mo35922b() != null) {
            return "/dev" + MiotCloudImpl.COOKIE_PATH + C11500e.m30201d(cVar.mo35899p().mo35922b().mo36059a());
        }
        throw new IllegalStateException("Can't generate local URI prefix without UDN");
    }

    /* renamed from: h */
    public URI mo35653h(C11335o oVar) {
        return mo35646a(mo35658m(oVar) + "/event" + "/cb");
    }

    /* renamed from: i */
    public String mo35654i(C11335o oVar) {
        return this.f22298b + mo35658m(oVar) + "/event" + "/cb";
    }

    /* renamed from: j */
    public URI mo35655j(C11335o oVar) {
        return mo35646a(mo35658m(oVar) + "/event");
    }

    /* renamed from: k */
    public URI mo35656k(C11326f fVar) {
        return mo35646a(mo35652g(fVar.mo35930d()) + MiotCloudImpl.COOKIE_PATH + fVar.mo35933g().toString());
    }

    /* renamed from: l */
    public C11346c[] mo35657l(C11323c cVar) {
        if (!cVar.mo35909z()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        f22296c.fine("Discovering local resources of device graph");
        for (C11346c cVar2 : cVar.mo35882a(this)) {
            f22296c.finer("Discovered: " + cVar2);
            if (!hashSet.add(cVar2)) {
                f22296c.finer("Local resource already exists, queueing validation error");
                arrayList.add(new C11222l(C11217g.class, "resources", "Local URI namespace conflict between resources of device: " + cVar2));
            }
        }
        if (arrayList.size() <= 0) {
            return (C11346c[]) hashSet.toArray(new C11346c[hashSet.size()]);
        }
        throw new C11223m("Validation of device graph failed, call getErrors() on exception", arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo35658m(C11335o oVar) {
        if (oVar.mo35985f() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo35652g(oVar.mo35983d()));
            sb.append("/svc" + MiotCloudImpl.COOKIE_PATH + oVar.mo35985f().mo36133b() + MiotCloudImpl.COOKIE_PATH + oVar.mo35985f().mo36132a());
            return sb.toString();
        }
        throw new IllegalStateException("Can't generate local URI prefix without service ID");
    }

    /* renamed from: n */
    public boolean mo35659n(URI uri) {
        return uri.toString().endsWith("/action");
    }

    /* renamed from: o */
    public boolean mo35660o(URI uri) {
        return uri.toString().endsWith("/cb");
    }

    /* renamed from: p */
    public boolean mo35661p(URI uri) {
        return uri.toString().endsWith("/event");
    }

    /* renamed from: q */
    public URI mo35662q(C11323c cVar, URI uri) {
        if (uri.isAbsolute() || uri.getPath().startsWith(MiotCloudImpl.COOKIE_PATH)) {
            return uri;
        }
        return mo35646a(mo35652g(cVar) + MiotCloudImpl.COOKIE_PATH + uri);
    }
}
