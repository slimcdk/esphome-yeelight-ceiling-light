package p164h.p165b.p166a.p168i;

import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p168i.p254i.C11406a;
import p164h.p165b.p166a.p168i.p254i.C11407b;
import p164h.p165b.p166a.p168i.p254i.C11408c;
import p164h.p165b.p166a.p168i.p254i.C11410e;
import p164h.p165b.p166a.p168i.p254i.C11411f;
import p164h.p165b.p166a.p168i.p254i.C11412g;
import p164h.p165b.p166a.p168i.p255j.C11413a;
import p164h.p165b.p166a.p168i.p255j.C11414b;
import p164h.p165b.p166a.p168i.p255j.C11417c;
import p164h.p165b.p166a.p168i.p255j.C11418d;
import p164h.p165b.p166a.p168i.p255j.C11420e;
import p164h.p165b.p166a.p168i.p255j.C11421f;
import p164h.p165b.p166a.p168i.p255j.C11422g;
import p164h.p165b.p166a.p168i.p255j.C11423h;
import p164h.p165b.p166a.p168i.p255j.C11427i;
import p164h.p165b.p166a.p168i.p255j.C11433j;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p242q.C11238c;
import p164h.p165b.p166a.p240h.p242q.C11239d;
import p164h.p165b.p166a.p240h.p243r.C11241b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11249i;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p243r.p247n.C11296f0;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p252w.C11391r;
import p164h.p165b.p166a.p240h.p252w.C11393t;
import p164h.p165b.p166a.p240h.p252w.C11394u;
import p164h.p165b.p166a.p240h.p252w.C11397x;

@ApplicationScoped
/* renamed from: h.b.a.i.c */
public class C4430c implements C4429b {

    /* renamed from: b */
    private static final Logger f7978b = Logger.getLogger(C4429b.class.getName());

    /* renamed from: a */
    protected final C4423b f7979a;

    /* renamed from: h.b.a.i.c$a */
    static /* synthetic */ class C4431a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7980a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                h.b.a.h.r.i$a[] r0 = p164h.p165b.p166a.p240h.p243r.C11249i.C11250a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7980a = r0
                h.b.a.h.r.i$a r1 = p164h.p165b.p166a.p240h.p243r.C11249i.C11250a.NOTIFY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7980a     // Catch:{ NoSuchFieldError -> 0x001d }
                h.b.a.h.r.i$a r1 = p164h.p165b.p166a.p240h.p243r.C11249i.C11250a.MSEARCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p168i.C4430c.C4431a.<clinit>():void");
        }
    }

    @Inject
    public C4430c(C4423b bVar) {
        Logger logger = f7978b;
        logger.fine("Creating ProtocolFactory: " + C4430c.class.getName());
        this.f7979a = bVar;
    }

    /* renamed from: a */
    public C11423h mo24379a(C11239d dVar) {
        return new C11423h(mo24397s(), dVar);
    }

    /* renamed from: b */
    public C11433j mo24380b(C11239d dVar) {
        return new C11433j(mo24397s(), dVar);
    }

    /* renamed from: c */
    public C11401d mo24381c(C11241b bVar) {
        if (f7978b.isLoggable(Level.FINE)) {
            Logger logger = f7978b;
            logger.fine("Creating protocol for incoming asynchronous: " + bVar);
        }
        if (bVar.mo35776k() instanceof C11249i) {
            int i = C4431a.f7980a[((C11249i) bVar.mo35776k()).mo35790d().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return mo24393o(bVar);
                }
            } else if (mo24398t(bVar) || mo24399u(bVar)) {
                return mo24391m(bVar);
            } else {
                return null;
            }
        } else if (bVar.mo35776k() instanceof C11252j) {
            if (mo24399u(bVar)) {
                return mo24394p(bVar);
            }
            return null;
        }
        throw new C11400a("Protocol for incoming datagram message not found: " + bVar);
    }

    /* renamed from: d */
    public C11412g mo24382d(C11296f0 f0Var, int i) {
        return new C11412g(mo24397s(), f0Var, i);
    }

    /* renamed from: e */
    public C11410e mo24383e(C11327g gVar) {
        return new C11410e(mo24397s(), gVar);
    }

    /* renamed from: f */
    public C11421f mo24384f(C11232f fVar, URL url) {
        return new C11421f(mo24397s(), fVar, url);
    }

    /* renamed from: g */
    public C11402e mo24385g(C11243d dVar) {
        Logger logger = f7978b;
        logger.fine("Creating protocol for incoming synchronous: " + dVar);
        if (((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.GET)) {
            return mo24392n(dVar);
        }
        if (mo24397s().getConfiguration().getNamespace().mo35659n(dVar.mo35751v())) {
            if (((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.POST)) {
                return mo24389k(dVar);
            }
        } else if (mo24397s().getConfiguration().getNamespace().mo35661p(dVar.mo35751v())) {
            if (((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.SUBSCRIBE)) {
                return mo24395q(dVar);
            }
            if (((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.UNSUBSCRIBE)) {
                return mo24396r(dVar);
            }
        } else if (mo24397s().getConfiguration().getNamespace().mo35660o(dVar.mo35751v())) {
            if (((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.NOTIFY)) {
                return mo24390l(dVar);
            }
        } else if (dVar.mo35751v().getPath().contains("/event/cb")) {
            Logger logger2 = f7978b;
            logger2.warning("Fixing trailing garbage in event message path: " + dVar.mo35751v().getPath());
            String uri = dVar.mo35751v().toString();
            dVar.mo35753x(URI.create(uri.substring(0, uri.indexOf("/cb") + 3)));
            if (mo24397s().getConfiguration().getNamespace().mo35660o(dVar.mo35751v()) && ((C11249i) dVar.mo35776k()).mo35790d().equals(C11249i.C11250a.NOTIFY)) {
                return mo24390l(dVar);
            }
        }
        throw new C11400a("Protocol for message type not found: " + dVar);
    }

    /* renamed from: h */
    public C11422g mo24386h(C11238c cVar) {
        return new C11422g(mo24397s(), cVar);
    }

    /* renamed from: i */
    public C11427i mo24387i(C11239d dVar) {
        try {
            return new C11427i(mo24397s(), dVar, mo24397s().getRouter().mo24452c(((C11333m) ((C11332l) ((C11334n) dVar.mo35723N()).mo35983d()).mo35899p()).mo35974e()));
        } catch (C11451b e) {
            throw new C11400a("Failed to obtain local stream servers (for event callback URL creation) from router", e);
        }
    }

    /* renamed from: j */
    public C11411f mo24388j(C11327g gVar) {
        return new C11411f(mo24397s(), gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11413a mo24389k(C11243d dVar) {
        return new C11413a(mo24397s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11414b mo24390l(C11243d dVar) {
        return new C11414b(mo24397s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C11401d mo24391m(C11241b<C11249i> bVar) {
        return new C11406a(mo24397s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C11417c mo24392n(C11243d dVar) {
        return new C11417c(mo24397s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C11401d mo24393o(C11241b<C11249i> bVar) {
        return new C11407b(mo24397s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C11401d mo24394p(C11241b<C11252j> bVar) {
        return new C11408c(mo24397s(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C11418d mo24395q(C11243d dVar) {
        return new C11418d(mo24397s(), dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C11420e mo24396r(C11243d dVar) {
        return new C11420e(mo24397s(), dVar);
    }

    /* renamed from: s */
    public C4423b mo24397s() {
        return this.f7979a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo24398t(C11241b bVar) {
        String e = bVar.mo35747j().mo36383e(C11296f0.C11297a.NTS.mo35849c());
        return e != null && e.equals(C11394u.f22651d.mo36130a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo24399u(C11241b bVar) {
        C11397x[] exclusiveServiceTypes = mo24397s().getConfiguration().getExclusiveServiceTypes();
        if (exclusiveServiceTypes == null) {
            return false;
        }
        if (exclusiveServiceTypes.length == 0) {
            return true;
        }
        String e = bVar.mo35747j().mo36383e(C11296f0.C11297a.USN.mo35849c());
        if (e == null) {
            return false;
        }
        try {
            C11393t c = C11393t.m29864c(e);
            for (C11397x d : exclusiveServiceTypes) {
                if (c.mo36125a().mo36140d(d)) {
                    return true;
                }
            }
        } catch (C11391r unused) {
            f7978b.finest("Not a named service type header value: " + e);
        }
        f7978b.fine("Service advertisement not supported, dropping it: " + e);
        return false;
    }
}
