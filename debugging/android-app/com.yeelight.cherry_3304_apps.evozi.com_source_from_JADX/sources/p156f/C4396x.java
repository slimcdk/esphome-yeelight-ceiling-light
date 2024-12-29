package p156f;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p156f.C4332c0;
import p156f.C4338e;
import p156f.C4381p;
import p156f.C4388s;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p158e.C10756f;
import p156f.p157g0.p159f.C10759d;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p156f.p157g0.p162k.C4373f;
import p156f.p157g0.p209l.C10821a;
import p156f.p157g0.p210m.C10824c;
import p156f.p157g0.p210m.C10825d;

/* renamed from: f.x */
public class C4396x implements Cloneable, C4338e.C4339a {

    /* renamed from: G */
    static final List<C10835y> f7869G = C4345c.m12374u(C10835y.HTTP_2, C10835y.HTTP_1_1);

    /* renamed from: H */
    static final List<C4377k> f7870H = C4345c.m12374u(C4377k.f7788g, C4377k.f7789h);

    /* renamed from: A */
    final int f7871A;

    /* renamed from: B */
    final int f7872B;

    /* renamed from: a */
    final C4380n f7873a;
    @Nullable

    /* renamed from: b */
    final Proxy f7874b;

    /* renamed from: c */
    final List<C10835y> f7875c;

    /* renamed from: d */
    final List<C4377k> f7876d;

    /* renamed from: e */
    final List<C10833u> f7877e;

    /* renamed from: f */
    final List<C10833u> f7878f;

    /* renamed from: g */
    final C4381p.C4384c f7879g;

    /* renamed from: h */
    final ProxySelector f7880h;

    /* renamed from: i */
    final C10829m f7881i;
    @Nullable

    /* renamed from: j */
    final C4325c f7882j;
    @Nullable

    /* renamed from: k */
    final C10756f f7883k;

    /* renamed from: l */
    final SocketFactory f7884l;

    /* renamed from: m */
    final SSLSocketFactory f7885m;

    /* renamed from: n */
    final C10824c f7886n;

    /* renamed from: o */
    final HostnameVerifier f7887o;

    /* renamed from: p */
    final C4341g f7888p;

    /* renamed from: q */
    final C4320b f7889q;

    /* renamed from: r */
    final C4320b f7890r;

    /* renamed from: s */
    final C4375j f7891s;

    /* renamed from: t */
    final C10831o f7892t;

    /* renamed from: u */
    final boolean f7893u;

    /* renamed from: v */
    final boolean f7894v;

    /* renamed from: w */
    final boolean f7895w;

    /* renamed from: x */
    final int f7896x;

    /* renamed from: y */
    final int f7897y;

    /* renamed from: z */
    final int f7898z;

    /* renamed from: f.x$a */
    class C4397a extends C4344a {
        C4397a() {
        }

        /* renamed from: a */
        public void mo23925a(C4388s.C4389a aVar, String str) {
            aVar.mo24095b(str);
        }

        /* renamed from: b */
        public void mo23926b(C4388s.C4389a aVar, String str, String str2) {
            aVar.mo24096c(str, str2);
        }

        /* renamed from: c */
        public void mo23927c(C4377k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.mo24028a(sSLSocket, z);
        }

        /* renamed from: d */
        public int mo23928d(C4332c0.C4333a aVar) {
            return aVar.f7594c;
        }

        /* renamed from: e */
        public boolean mo23929e(C4375j jVar, C4357c cVar) {
            return jVar.mo24023b(cVar);
        }

        /* renamed from: f */
        public Socket mo23930f(C4375j jVar, C4317a aVar, C10763g gVar) {
            return jVar.mo24024c(aVar, gVar);
        }

        /* renamed from: g */
        public boolean mo23931g(C4317a aVar, C4317a aVar2) {
            return aVar.mo23795d(aVar2);
        }

        /* renamed from: h */
        public C4357c mo23932h(C4375j jVar, C4317a aVar, C10763g gVar, C4340e0 e0Var) {
            return jVar.mo24025d(aVar, gVar, e0Var);
        }

        /* renamed from: i */
        public void mo23933i(C4375j jVar, C4357c cVar) {
            jVar.mo24026f(cVar);
        }

        /* renamed from: j */
        public C10759d mo23934j(C4375j jVar) {
            return jVar.f7783e;
        }

        @Nullable
        /* renamed from: k */
        public IOException mo23935k(C4338e eVar, @Nullable IOException iOException) {
            return ((C4399z) eVar).mo24187j(iOException);
        }
    }

    /* renamed from: f.x$b */
    public static final class C4398b {

        /* renamed from: A */
        int f7899A;

        /* renamed from: B */
        int f7900B;

        /* renamed from: a */
        C4380n f7901a;
        @Nullable

        /* renamed from: b */
        Proxy f7902b;

        /* renamed from: c */
        List<C10835y> f7903c;

        /* renamed from: d */
        List<C4377k> f7904d;

        /* renamed from: e */
        final List<C10833u> f7905e;

        /* renamed from: f */
        final List<C10833u> f7906f;

        /* renamed from: g */
        C4381p.C4384c f7907g;

        /* renamed from: h */
        ProxySelector f7908h;

        /* renamed from: i */
        C10829m f7909i;
        @Nullable

        /* renamed from: j */
        C4325c f7910j;
        @Nullable

        /* renamed from: k */
        C10756f f7911k;

        /* renamed from: l */
        SocketFactory f7912l;
        @Nullable

        /* renamed from: m */
        SSLSocketFactory f7913m;
        @Nullable

        /* renamed from: n */
        C10824c f7914n;

        /* renamed from: o */
        HostnameVerifier f7915o;

        /* renamed from: p */
        C4341g f7916p;

        /* renamed from: q */
        C4320b f7917q;

        /* renamed from: r */
        C4320b f7918r;

        /* renamed from: s */
        C4375j f7919s;

        /* renamed from: t */
        C10831o f7920t;

        /* renamed from: u */
        boolean f7921u;

        /* renamed from: v */
        boolean f7922v;

        /* renamed from: w */
        boolean f7923w;

        /* renamed from: x */
        int f7924x;

        /* renamed from: y */
        int f7925y;

        /* renamed from: z */
        int f7926z;

        public C4398b() {
            this.f7905e = new ArrayList();
            this.f7906f = new ArrayList();
            this.f7901a = new C4380n();
            this.f7903c = C4396x.f7869G;
            this.f7904d = C4396x.f7870H;
            this.f7907g = C4381p.m12563k(C4381p.f7818a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f7908h = proxySelector;
            if (proxySelector == null) {
                this.f7908h = new C10821a();
            }
            this.f7909i = C10829m.f20890a;
            this.f7912l = SocketFactory.getDefault();
            this.f7915o = C10825d.f20868a;
            this.f7916p = C4341g.f7631c;
            C4320b bVar = C4320b.f7538a;
            this.f7917q = bVar;
            this.f7918r = bVar;
            this.f7919s = new C4375j();
            this.f7920t = C10831o.f20891a;
            this.f7921u = true;
            this.f7922v = true;
            this.f7923w = true;
            this.f7924x = 0;
            this.f7925y = 10000;
            this.f7926z = 10000;
            this.f7899A = 10000;
            this.f7900B = 0;
        }

        C4398b(C4396x xVar) {
            this.f7905e = new ArrayList();
            this.f7906f = new ArrayList();
            this.f7901a = xVar.f7873a;
            this.f7902b = xVar.f7874b;
            this.f7903c = xVar.f7875c;
            this.f7904d = xVar.f7876d;
            this.f7905e.addAll(xVar.f7877e);
            this.f7906f.addAll(xVar.f7878f);
            this.f7907g = xVar.f7879g;
            this.f7908h = xVar.f7880h;
            this.f7909i = xVar.f7881i;
            this.f7911k = xVar.f7883k;
            this.f7910j = xVar.f7882j;
            this.f7912l = xVar.f7884l;
            this.f7913m = xVar.f7885m;
            this.f7914n = xVar.f7886n;
            this.f7915o = xVar.f7887o;
            this.f7916p = xVar.f7888p;
            this.f7917q = xVar.f7889q;
            this.f7918r = xVar.f7890r;
            this.f7919s = xVar.f7891s;
            this.f7920t = xVar.f7892t;
            this.f7921u = xVar.f7893u;
            this.f7922v = xVar.f7894v;
            this.f7923w = xVar.f7895w;
            this.f7924x = xVar.f7896x;
            this.f7925y = xVar.f7897y;
            this.f7926z = xVar.f7898z;
            this.f7899A = xVar.f7871A;
            this.f7900B = xVar.f7872B;
        }

        /* renamed from: a */
        public C4398b mo24173a(C10833u uVar) {
            if (uVar != null) {
                this.f7905e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: b */
        public C4396x mo24174b() {
            return new C4396x(this);
        }

        /* renamed from: c */
        public C4398b mo24175c(@Nullable C4325c cVar) {
            this.f7910j = cVar;
            this.f7911k = null;
            return this;
        }

        /* renamed from: d */
        public C4398b mo24176d(long j, TimeUnit timeUnit) {
            this.f7924x = C4345c.m12358e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public C4398b mo24177e(long j, TimeUnit timeUnit) {
            this.f7925y = C4345c.m12358e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: f */
        public C4398b mo24178f(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f7915o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        /* renamed from: g */
        public C4398b mo24179g(long j, TimeUnit timeUnit) {
            this.f7926z = C4345c.m12358e("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: h */
        public C4398b mo24180h(boolean z) {
            this.f7923w = z;
            return this;
        }

        /* renamed from: i */
        public C4398b mo24181i(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f7913m = sSLSocketFactory;
                this.f7914n = C10824c.m26946b(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        /* renamed from: j */
        public C4398b mo24182j(long j, TimeUnit timeUnit) {
            this.f7899A = C4345c.m12358e("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        C4344a.f7639a = new C4397a();
    }

    public C4396x() {
        this(new C4398b());
    }

    C4396x(C4398b bVar) {
        boolean z;
        C10824c cVar;
        this.f7873a = bVar.f7901a;
        this.f7874b = bVar.f7902b;
        this.f7875c = bVar.f7903c;
        this.f7876d = bVar.f7904d;
        this.f7877e = C4345c.m12373t(bVar.f7905e);
        this.f7878f = C4345c.m12373t(bVar.f7906f);
        this.f7879g = bVar.f7907g;
        this.f7880h = bVar.f7908h;
        this.f7881i = bVar.f7909i;
        this.f7882j = bVar.f7910j;
        this.f7883k = bVar.f7911k;
        this.f7884l = bVar.f7912l;
        Iterator<C4377k> it = this.f7876d.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C4377k next = it.next();
                if (z || next.mo24031d()) {
                    z = true;
                }
            }
        }
        if (bVar.f7913m != null || !z) {
            this.f7885m = bVar.f7913m;
            cVar = bVar.f7914n;
        } else {
            X509TrustManager C = C4345c.m12346C();
            this.f7885m = m12689w(C);
            cVar = C10824c.m26946b(C);
        }
        this.f7886n = cVar;
        if (this.f7885m != null) {
            C4373f.m12509j().mo24017f(this.f7885m);
        }
        this.f7887o = bVar.f7915o;
        this.f7888p = bVar.f7916p.mo23918f(this.f7886n);
        this.f7889q = bVar.f7917q;
        this.f7890r = bVar.f7918r;
        this.f7891s = bVar.f7919s;
        this.f7892t = bVar.f7920t;
        this.f7893u = bVar.f7921u;
        this.f7894v = bVar.f7922v;
        this.f7895w = bVar.f7923w;
        this.f7896x = bVar.f7924x;
        this.f7897y = bVar.f7925y;
        this.f7898z = bVar.f7926z;
        this.f7871A = bVar.f7899A;
        this.f7872B = bVar.f7900B;
        if (this.f7877e.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f7877e);
        } else if (this.f7878f.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f7878f);
        }
    }

    /* renamed from: w */
    private static SSLSocketFactory m12689w(X509TrustManager x509TrustManager) {
        try {
            SSLContext l = C4373f.m12509j().mo24003l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return l.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C4345c.m12355b("No System TLS", e);
        }
    }

    /* renamed from: A */
    public C4320b mo24146A() {
        return this.f7889q;
    }

    /* renamed from: B */
    public ProxySelector mo24147B() {
        return this.f7880h;
    }

    /* renamed from: D */
    public int mo24148D() {
        return this.f7898z;
    }

    /* renamed from: E */
    public boolean mo24149E() {
        return this.f7895w;
    }

    /* renamed from: F */
    public SocketFactory mo24150F() {
        return this.f7884l;
    }

    /* renamed from: G */
    public SSLSocketFactory mo24151G() {
        return this.f7885m;
    }

    /* renamed from: N */
    public int mo24152N() {
        return this.f7871A;
    }

    /* renamed from: a */
    public C4338e mo23907a(C4318a0 a0Var) {
        return C4399z.m12741e(this, a0Var, false);
    }

    /* renamed from: b */
    public C4320b mo24153b() {
        return this.f7890r;
    }

    /* renamed from: c */
    public int mo24154c() {
        return this.f7896x;
    }

    /* renamed from: d */
    public C4341g mo24155d() {
        return this.f7888p;
    }

    /* renamed from: e */
    public int mo24156e() {
        return this.f7897y;
    }

    /* renamed from: f */
    public C4375j mo24157f() {
        return this.f7891s;
    }

    /* renamed from: j */
    public List<C4377k> mo24158j() {
        return this.f7876d;
    }

    /* renamed from: k */
    public C10829m mo24159k() {
        return this.f7881i;
    }

    /* renamed from: l */
    public C4380n mo24160l() {
        return this.f7873a;
    }

    /* renamed from: m */
    public C10831o mo24161m() {
        return this.f7892t;
    }

    /* renamed from: o */
    public C4381p.C4384c mo24162o() {
        return this.f7879g;
    }

    /* renamed from: p */
    public boolean mo24163p() {
        return this.f7894v;
    }

    /* renamed from: q */
    public boolean mo24164q() {
        return this.f7893u;
    }

    /* renamed from: r */
    public HostnameVerifier mo24165r() {
        return this.f7887o;
    }

    /* renamed from: s */
    public List<C10833u> mo24166s() {
        return this.f7877e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C10756f mo24167t() {
        C4325c cVar = this.f7882j;
        return cVar != null ? cVar.f7545a : this.f7883k;
    }

    /* renamed from: u */
    public List<C10833u> mo24168u() {
        return this.f7878f;
    }

    /* renamed from: v */
    public C4398b mo24169v() {
        return new C4398b(this);
    }

    /* renamed from: x */
    public int mo24170x() {
        return this.f7872B;
    }

    /* renamed from: y */
    public List<C10835y> mo24171y() {
        return this.f7875c;
    }

    @Nullable
    /* renamed from: z */
    public Proxy mo24172z() {
        return this.f7874b;
    }
}
