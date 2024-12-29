package p011c.p083d.p084a;

import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.p085d0.C1013d;
import p011c.p083d.p084a.p085d0.C1014e;
import p011c.p083d.p084a.p085d0.C1016g;
import p011c.p083d.p084a.p085d0.C1023j;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p087n.C1073a;
import p011c.p083d.p084a.p085d0.p087n.C1090h;
import p011c.p083d.p084a.p085d0.p087n.C1105s;
import p011c.p083d.p084a.p085d0.p089p.C1109b;

/* renamed from: c.d.a.v */
public class C1141v implements Cloneable {

    /* renamed from: A */
    private static SSLSocketFactory f1839A;

    /* renamed from: y */
    private static final List<C1143w> f1840y = C1024k.m2098i(C1143w.HTTP_2, C1143w.SPDY_3, C1143w.HTTP_1_1);

    /* renamed from: z */
    private static final List<C1123l> f1841z = C1024k.m2098i(C1123l.f1779f, C1123l.f1780g, C1123l.f1781h);

    /* renamed from: a */
    private final C1023j f1842a;

    /* renamed from: b */
    private C1127n f1843b;

    /* renamed from: c */
    private Proxy f1844c;

    /* renamed from: d */
    private List<C1143w> f1845d;

    /* renamed from: e */
    private List<C1123l> f1846e;

    /* renamed from: f */
    private final List<C1136s> f1847f;

    /* renamed from: g */
    private final List<C1136s> f1848g;

    /* renamed from: h */
    private ProxySelector f1849h;

    /* renamed from: i */
    private CookieHandler f1850i;

    /* renamed from: j */
    private C1014e f1851j;

    /* renamed from: k */
    private C0992c f1852k;

    /* renamed from: l */
    private SocketFactory f1853l;

    /* renamed from: m */
    private SSLSocketFactory f1854m;

    /* renamed from: n */
    private HostnameVerifier f1855n;

    /* renamed from: o */
    private C1115g f1856o;

    /* renamed from: p */
    private C0990b f1857p;

    /* renamed from: q */
    private C1121k f1858q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1016g f1859r;

    /* renamed from: s */
    private boolean f1860s;

    /* renamed from: t */
    private boolean f1861t;

    /* renamed from: u */
    private boolean f1862u;

    /* renamed from: v */
    private int f1863v;

    /* renamed from: w */
    private int f1864w;

    /* renamed from: x */
    private int f1865x;

    /* renamed from: c.d.a.v$a */
    static class C1142a extends C1013d {
        C1142a() {
        }

        /* renamed from: a */
        public void mo9451a(C1130q.C1132b bVar, String str) {
            bVar.mo9753c(str);
        }

        /* renamed from: b */
        public void mo9452b(C1123l lVar, SSLSocket sSLSocket, boolean z) {
            lVar.mo9716c(sSLSocket, z);
        }

        /* renamed from: c */
        public boolean mo9453c(C1120j jVar) {
            return jVar.mo9689a();
        }

        /* renamed from: d */
        public void mo9454d(C1120j jVar, Object obj) {
            jVar.mo9690b(obj);
        }

        /* renamed from: e */
        public void mo9455e(C1141v vVar, C1120j jVar, C1090h hVar, C1144x xVar) {
            jVar.mo9692d(vVar, hVar, xVar);
        }

        /* renamed from: f */
        public C1014e mo9456f(C1141v vVar) {
            return vVar.mo9801D();
        }

        /* renamed from: g */
        public boolean mo9457g(C1120j jVar) {
            return jVar.mo9703s();
        }

        /* renamed from: h */
        public C1016g mo9458h(C1141v vVar) {
            return vVar.f1859r;
        }

        /* renamed from: i */
        public C1105s mo9459i(C1120j jVar, C1090h hVar) {
            return jVar.mo9704t(hVar);
        }

        /* renamed from: j */
        public void mo9460j(C1121k kVar, C1120j jVar) {
            kVar.mo9713f(jVar);
        }

        /* renamed from: k */
        public int mo9461k(C1120j jVar) {
            return jVar.mo9706u();
        }

        /* renamed from: l */
        public C1023j mo9462l(C1141v vVar) {
            return vVar.mo9804G();
        }

        /* renamed from: m */
        public void mo9463m(C1120j jVar, C1090h hVar) {
            jVar.mo9708w(hVar);
        }

        /* renamed from: n */
        public void mo9464n(C1120j jVar, C1143w wVar) {
            jVar.mo9709x(wVar);
        }
    }

    static {
        C1013d.f1321b = new C1142a();
    }

    public C1141v() {
        this.f1847f = new ArrayList();
        this.f1848g = new ArrayList();
        this.f1860s = true;
        this.f1861t = true;
        this.f1862u = true;
        this.f1863v = 10000;
        this.f1864w = 10000;
        this.f1865x = 10000;
        this.f1842a = new C1023j();
        this.f1843b = new C1127n();
    }

    private C1141v(C1141v vVar) {
        this.f1847f = new ArrayList();
        this.f1848g = new ArrayList();
        this.f1860s = true;
        this.f1861t = true;
        this.f1862u = true;
        this.f1863v = 10000;
        this.f1864w = 10000;
        this.f1865x = 10000;
        this.f1842a = vVar.f1842a;
        this.f1843b = vVar.f1843b;
        this.f1844c = vVar.f1844c;
        this.f1845d = vVar.f1845d;
        this.f1846e = vVar.f1846e;
        this.f1847f.addAll(vVar.f1847f);
        this.f1848g.addAll(vVar.f1848g);
        this.f1849h = vVar.f1849h;
        this.f1850i = vVar.f1850i;
        C0992c cVar = vVar.f1852k;
        this.f1852k = cVar;
        this.f1851j = cVar != null ? cVar.f1221a : vVar.f1851j;
        this.f1853l = vVar.f1853l;
        this.f1854m = vVar.f1854m;
        this.f1855n = vVar.f1855n;
        this.f1856o = vVar.f1856o;
        this.f1857p = vVar.f1857p;
        this.f1858q = vVar.f1858q;
        this.f1859r = vVar.f1859r;
        this.f1860s = vVar.f1860s;
        this.f1861t = vVar.f1861t;
        this.f1862u = vVar.f1862u;
        this.f1863v = vVar.f1863v;
        this.f1864w = vVar.f1864w;
        this.f1865x = vVar.f1865x;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized javax.net.ssl.SSLSocketFactory m2797o() {
        /*
            r2 = this;
            monitor-enter(r2)
            javax.net.ssl.SSLSocketFactory r0 = f1839A     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0016 }
            r1 = 0
            r0.init(r1, r1, r1)     // Catch:{ GeneralSecurityException -> 0x0016 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0016 }
            f1839A = r0     // Catch:{ GeneralSecurityException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x001c:
            javax.net.ssl.SSLSocketFactory r0 = f1839A     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1141v.m2797o():javax.net.ssl.SSLSocketFactory");
    }

    /* renamed from: A */
    public int mo9799A() {
        return this.f1865x;
    }

    /* renamed from: B */
    public List<C1136s> mo9800B() {
        return this.f1847f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C1014e mo9801D() {
        return this.f1851j;
    }

    /* renamed from: E */
    public List<C1136s> mo9802E() {
        return this.f1848g;
    }

    /* renamed from: F */
    public C1110e mo9803F(C1144x xVar) {
        return new C1110e(this, xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C1023j mo9804G() {
        return this.f1842a;
    }

    /* renamed from: N */
    public C1141v mo9805N(C0992c cVar) {
        this.f1852k = cVar;
        this.f1851j = null;
        return this;
    }

    /* renamed from: O */
    public void mo9806O(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f1863v = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: P */
    public C1141v mo9807P(CookieHandler cookieHandler) {
        this.f1850i = cookieHandler;
        return this;
    }

    /* renamed from: U */
    public void mo9808U(boolean z) {
        this.f1861t = z;
    }

    /* renamed from: Y */
    public void mo9809Y(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f1864w = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public C1141v mo9810b(Object obj) {
        mo9821p().mo9730a(obj);
        return this;
    }

    /* renamed from: b0 */
    public void mo9811b0(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || j <= 0) {
                this.f1865x = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: c */
    public C1141v clone() {
        return new C1141v(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1141v mo9814d() {
        C1141v vVar = new C1141v(this);
        if (vVar.f1849h == null) {
            vVar.f1849h = ProxySelector.getDefault();
        }
        if (vVar.f1850i == null) {
            vVar.f1850i = CookieHandler.getDefault();
        }
        if (vVar.f1853l == null) {
            vVar.f1853l = SocketFactory.getDefault();
        }
        if (vVar.f1854m == null) {
            vVar.f1854m = m2797o();
        }
        if (vVar.f1855n == null) {
            vVar.f1855n = C1109b.f1643a;
        }
        if (vVar.f1856o == null) {
            vVar.f1856o = C1115g.f1657b;
        }
        if (vVar.f1857p == null) {
            vVar.f1857p = C1073a.f1528a;
        }
        if (vVar.f1858q == null) {
            vVar.f1858q = C1121k.m2662d();
        }
        if (vVar.f1845d == null) {
            vVar.f1845d = f1840y;
        }
        if (vVar.f1846e == null) {
            vVar.f1846e = f1841z;
        }
        if (vVar.f1859r == null) {
            vVar.f1859r = C1016g.f1323a;
        }
        return vVar;
    }

    /* renamed from: e */
    public C0990b mo9815e() {
        return this.f1857p;
    }

    /* renamed from: f */
    public C1115g mo9816f() {
        return this.f1856o;
    }

    /* renamed from: j */
    public int mo9817j() {
        return this.f1863v;
    }

    /* renamed from: k */
    public C1121k mo9818k() {
        return this.f1858q;
    }

    /* renamed from: l */
    public List<C1123l> mo9819l() {
        return this.f1846e;
    }

    /* renamed from: m */
    public CookieHandler mo9820m() {
        return this.f1850i;
    }

    /* renamed from: p */
    public C1127n mo9821p() {
        return this.f1843b;
    }

    /* renamed from: q */
    public boolean mo9822q() {
        return this.f1861t;
    }

    /* renamed from: r */
    public boolean mo9823r() {
        return this.f1860s;
    }

    /* renamed from: s */
    public HostnameVerifier mo9824s() {
        return this.f1855n;
    }

    /* renamed from: t */
    public List<C1143w> mo9825t() {
        return this.f1845d;
    }

    /* renamed from: u */
    public Proxy mo9826u() {
        return this.f1844c;
    }

    /* renamed from: v */
    public ProxySelector mo9827v() {
        return this.f1849h;
    }

    /* renamed from: w */
    public int mo9828w() {
        return this.f1864w;
    }

    /* renamed from: x */
    public boolean mo9829x() {
        return this.f1862u;
    }

    /* renamed from: y */
    public SocketFactory mo9830y() {
        return this.f1853l;
    }

    /* renamed from: z */
    public SSLSocketFactory mo9831z() {
        return this.f1854m;
    }
}
