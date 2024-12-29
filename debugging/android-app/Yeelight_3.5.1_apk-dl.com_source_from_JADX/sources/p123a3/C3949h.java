package p123a3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.manager.timer.TimerCodec;
import com.squareup.okhttp.C4268a;
import com.squareup.okhttp.C4285g;
import com.squareup.okhttp.C4289i;
import com.squareup.okhttp.C4290j;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4305r;
import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4310u;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4315w;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import com.squareup.okhttp.C4323z;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9843j;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import p123a3.C3934c;
import p231y2.C12022d;
import p231y2.C12023e;
import p231y2.C12033k;
import p231y2.C12035l;

/* renamed from: a3.h */
public final class C3949h {

    /* renamed from: u */
    private static final C4321y f6634u = new C3950a();

    /* renamed from: a */
    final C4310u f6635a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4289i f6636b;

    /* renamed from: c */
    private C4268a f6637c;

    /* renamed from: d */
    private C3960o f6638d;

    /* renamed from: e */
    private C4323z f6639e;

    /* renamed from: f */
    private final C4318x f6640f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3962q f6641g;

    /* renamed from: h */
    long f6642h = -1;

    /* renamed from: i */
    private boolean f6643i;

    /* renamed from: j */
    public final boolean f6644j;

    /* renamed from: k */
    private final C4312v f6645k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C4312v f6646l;

    /* renamed from: m */
    private C4318x f6647m;

    /* renamed from: n */
    private C4318x f6648n;

    /* renamed from: o */
    private C9852q f6649o;

    /* renamed from: p */
    private C9837d f6650p;

    /* renamed from: q */
    private final boolean f6651q;

    /* renamed from: r */
    private final boolean f6652r;

    /* renamed from: s */
    private C3933b f6653s;

    /* renamed from: t */
    private C3934c f6654t;

    /* renamed from: a3.h$a */
    static class C3950a extends C4321y {
        C3950a() {
        }

        /* renamed from: h */
        public long mo26479h() {
            return 0;
        }

        /* renamed from: i */
        public C4307s mo26480i() {
            return null;
        }

        /* renamed from: m */
        public C9838e mo26481m() {
            return new C3564c();
        }
    }

    /* renamed from: a3.h$b */
    class C3951b implements C9853r {

        /* renamed from: a */
        boolean f6655a;

        /* renamed from: b */
        final /* synthetic */ C9838e f6656b;

        /* renamed from: c */
        final /* synthetic */ C3933b f6657c;

        /* renamed from: d */
        final /* synthetic */ C9837d f6658d;

        C3951b(C3949h hVar, C9838e eVar, C3933b bVar, C9837d dVar) {
            this.f6656b = eVar;
            this.f6657c = bVar;
            this.f6658d = dVar;
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            try {
                long R0 = this.f6656b.mo24477R0(cVar, j);
                if (R0 == -1) {
                    if (!this.f6655a) {
                        this.f6655a = true;
                        this.f6658d.close();
                    }
                    return -1;
                }
                cVar.mo24747d(this.f6658d.mo24724F(), cVar.mo24758i1() - R0, R0);
                this.f6658d.mo24738Y();
                return R0;
            } catch (IOException e) {
                if (!this.f6655a) {
                    this.f6655a = true;
                    this.f6657c.mo26430a();
                }
                throw e;
            }
        }

        public void close() {
            if (!this.f6655a && !C12033k.m31045e(this, 100, TimeUnit.MILLISECONDS)) {
                this.f6655a = true;
                this.f6657c.mo26430a();
            }
            this.f6656b.close();
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f6656b.mo24479j();
        }
    }

    /* renamed from: a3.h$c */
    class C3952c implements C4305r.C4306a {

        /* renamed from: a */
        private final int f6659a;

        /* renamed from: b */
        private final C4312v f6660b;

        /* renamed from: c */
        private int f6661c;

        C3952c(int i, C4312v vVar) {
            this.f6659a = i;
            this.f6660b = vVar;
        }

        /* renamed from: a */
        public C4312v mo26482a() {
            return this.f6660b;
        }

        /* renamed from: b */
        public C4318x mo26483b(C4312v vVar) {
            this.f6661c++;
            if (this.f6659a > 0) {
                C4305r rVar = C3949h.this.f6635a.mo27989L().get(this.f6659a - 1);
                C4268a a = mo26484c().mo27876l().mo28090a();
                if (!vVar.mo28037k().mo27959q().equals(a.mo27823j()) || vVar.mo28037k().mo27945A() != a.mo27824k()) {
                    throw new IllegalStateException("network interceptor " + rVar + " must retain the same host and port");
                } else if (this.f6661c > 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                }
            }
            if (this.f6659a < C3949h.this.f6635a.mo27989L().size()) {
                C3952c cVar = new C3952c(this.f6659a + 1, vVar);
                C4305r rVar2 = C3949h.this.f6635a.mo27989L().get(this.f6659a);
                C4318x intercept = rVar2.intercept(cVar);
                if (cVar.f6661c == 1) {
                    return intercept;
                }
                throw new IllegalStateException("network interceptor " + rVar2 + " must call proceed() exactly once");
            }
            C3949h.this.f6641g.mo26436d(vVar);
            C4312v unused = C3949h.this.f6646l = vVar;
            if (C3949h.this.mo26476w() && vVar.mo28032f() != null) {
                C9837d c = C9845l.m23737c(C3949h.this.f6641g.mo26434b(vVar, vVar.mo28032f().mo27982a()));
                vVar.mo28032f().mo27984g(c);
                c.close();
            }
            C4318x d = C3949h.this.m11341x();
            int o = d.mo28060o();
            if ((o != 204 && o != 205) || d.mo28056k().mo26479h() <= 0) {
                return d;
            }
            throw new ProtocolException("HTTP " + o + " had non-zero Content-Length: " + d.mo28056k().mo26479h());
        }

        /* renamed from: c */
        public C4289i mo26484c() {
            return C3949h.this.f6636b;
        }
    }

    public C3949h(C4310u uVar, C4312v vVar, boolean z, boolean z2, boolean z3, C4289i iVar, C3960o oVar, C3959n nVar, C4318x xVar) {
        C4323z zVar;
        this.f6635a = uVar;
        this.f6645k = vVar;
        this.f6644j = z;
        this.f6651q = z2;
        this.f6652r = z3;
        this.f6636b = iVar;
        this.f6638d = oVar;
        this.f6649o = nVar;
        this.f6640f = xVar;
        if (iVar != null) {
            C12022d.f22043b.mo28030m(iVar, this);
            zVar = iVar.mo27876l();
        } else {
            zVar = null;
        }
        this.f6639e = zVar;
    }

    /* renamed from: F */
    private static C4318x m11323F(C4318x xVar) {
        return (xVar == null || xVar.mo28056k() == null) ? xVar : xVar.mo28069w().mo28073l((C4321y) null).mo28074m();
    }

    /* renamed from: G */
    private C4318x m11324G(C4318x xVar) {
        if (!this.f6643i || !"gzip".equalsIgnoreCase(this.f6648n.mo28062q("Content-Encoding")) || xVar.mo28056k() == null) {
            return xVar;
        }
        C9843j jVar = new C9843j(xVar.mo28056k().mo26481m());
        C4299p e = xVar.mo28064s().mo27934e().mo27943g("Content-Encoding").mo27943g("Content-Length").mo27942e();
        return xVar.mo28069w().mo28079t(e).mo28073l(new C3957l(e, C9845l.m23738d(jVar))).mo28074m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r5 = r5.mo28064s().mo27932c("Last-Modified");
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m11325H(com.squareup.okhttp.C4318x r4, com.squareup.okhttp.C4318x r5) {
        /*
            int r0 = r5.mo28060o()
            r1 = 1
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x000a
            return r1
        L_0x000a:
            com.squareup.okhttp.p r4 = r4.mo28064s()
            java.lang.String r0 = "Last-Modified"
            java.util.Date r4 = r4.mo27932c(r0)
            if (r4 == 0) goto L_0x002d
            com.squareup.okhttp.p r5 = r5.mo28064s()
            java.util.Date r5 = r5.mo27932c(r0)
            if (r5 == 0) goto L_0x002d
            long r2 = r5.getTime()
            long r4 = r4.getTime()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            return r1
        L_0x002d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p123a3.C3949h.m11325H(com.squareup.okhttp.x, com.squareup.okhttp.x):boolean");
    }

    /* renamed from: e */
    private C4318x m11330e(C3933b bVar, C4318x xVar) {
        C9852q b;
        if (bVar == null || (b = bVar.mo26431b()) == null) {
            return xVar;
        }
        return xVar.mo28069w().mo28073l(new C3957l(xVar.mo28064s(), C9845l.m23738d(new C3951b(this, xVar.mo28056k().mo26481m(), bVar, C9845l.m23737c(b))))).mo28074m();
    }

    /* renamed from: g */
    private static C4299p m11331g(C4299p pVar, C4299p pVar2) {
        C4299p.C4301b bVar = new C4299p.C4301b();
        int g = pVar.mo27935g();
        for (int i = 0; i < g; i++) {
            String d = pVar.mo27933d(i);
            String h = pVar.mo27936h(i);
            if ((!"Warning".equalsIgnoreCase(d) || !h.startsWith(TimerCodec.ENABLE)) && (!C3955k.m11386h(d) || pVar2.mo27931a(d) == null)) {
                bVar.mo27939b(d, h);
            }
        }
        int g2 = pVar2.mo27935g();
        for (int i2 = 0; i2 < g2; i2++) {
            String d2 = pVar2.mo27933d(i2);
            if (!"Content-Length".equalsIgnoreCase(d2) && C3955k.m11386h(d2)) {
                bVar.mo27939b(d2, pVar2.mo27936h(i2));
            }
        }
        return bVar.mo27942e();
    }

    /* renamed from: h */
    private void m11332h() {
        if (this.f6636b == null) {
            if (this.f6638d == null) {
                C4268a j = m11334j(this.f6635a, this.f6646l);
                this.f6637c = j;
                try {
                    this.f6638d = C3960o.m11408b(j, this.f6646l, this.f6635a);
                } catch (IOException e) {
                    throw new RequestException(e);
                }
            }
            C4289i k = m11335k();
            this.f6636b = k;
            C12022d.f22043b.mo28022e(this.f6635a, k, this, this.f6646l);
            this.f6639e = this.f6636b.mo27876l();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    private void m11333i(C3960o oVar, IOException iOException) {
        if (C12022d.f22043b.mo28028k(this.f6636b) <= 0) {
            oVar.mo26489a(this.f6636b.mo27876l(), iOException);
        }
    }

    /* renamed from: j */
    private static C4268a m11334j(C4310u uVar, C4312v vVar) {
        C4285g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.mo28038l()) {
            SSLSocketFactory C = uVar.mo27985C();
            hostnameVerifier = uVar.mo28011r();
            sSLSocketFactory = C;
            gVar = uVar.mo28003f();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C4268a(vVar.mo28037k().mo27959q(), vVar.mo28037k().mo27945A(), uVar.mo28017y(), sSLSocketFactory, hostnameVerifier, gVar, uVar.mo28002e(), uVar.mo28013t(), uVar.mo28012s(), uVar.mo28006i(), uVar.mo28014u());
    }

    /* renamed from: k */
    private C4289i m11335k() {
        C4289i c;
        C4290j h = this.f6635a.mo28005h();
        while (true) {
            c = h.mo27898c(this.f6637c);
            if (c == null) {
                try {
                    return new C4289i(h, this.f6638d.mo26491h());
                } catch (IOException e) {
                    throw new RouteException(e);
                }
            } else if (this.f6646l.mo28039m().equals("GET") || C12022d.f22043b.mo28024g(c)) {
                return c;
            } else {
                C12033k.m31044d(c.mo27877m());
            }
        }
        return c;
    }

    /* renamed from: r */
    public static boolean m11336r(C4318x xVar) {
        if (xVar.mo28071y().mo28039m().equals("HEAD")) {
            return false;
        }
        int o = xVar.mo28060o();
        return (((o >= 100 && o < 200) || o == 204 || o == 304) && C3955k.m11383e(xVar) == -1 && !"chunked".equalsIgnoreCase(xVar.mo28062q("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: s */
    private boolean m11337s(RouteException routeException) {
        if (!this.f6635a.mo28016x()) {
            return false;
        }
        IOException lastConnectException = routeException.getLastConnectException();
        if (!(lastConnectException instanceof ProtocolException) && !(lastConnectException instanceof InterruptedIOException)) {
            return (!(lastConnectException instanceof SSLHandshakeException) || !(lastConnectException.getCause() instanceof CertificateException)) && !(lastConnectException instanceof SSLPeerUnverifiedException);
        }
        return false;
    }

    /* renamed from: t */
    private boolean m11338t(IOException iOException) {
        return this.f6635a.mo28016x() && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException);
    }

    /* renamed from: u */
    private void m11339u() {
        C12023e f = C12022d.f22043b.mo28023f(this.f6635a);
        if (f != null) {
            if (C3934c.m11259a(this.f6648n, this.f6646l)) {
                this.f6653s = f.mo27827b(m11323F(this.f6648n));
            } else if (C3953i.m11366a(this.f6646l.mo28039m())) {
                try {
                    f.mo27830e(this.f6646l);
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: v */
    private C4312v m11340v(C4312v vVar) {
        C4312v.C4314b n = vVar.mo28040n();
        if (vVar.mo28034h("Host") == null) {
            n.mo28049i("Host", C12033k.m31047g(vVar.mo28037k()));
        }
        C4289i iVar = this.f6636b;
        if ((iVar == null || iVar.mo27875k() != Protocol.HTTP_1_0) && vVar.mo28034h("Connection") == null) {
            n.mo28049i("Connection", "Keep-Alive");
        }
        if (vVar.mo28034h("Accept-Encoding") == null) {
            this.f6643i = true;
            n.mo28049i("Accept-Encoding", "gzip");
        }
        CookieHandler j = this.f6635a.mo28007j();
        if (j != null) {
            C3955k.m11379a(n, j.get(vVar.mo28042p(), C3955k.m11390l(n.mo28047g().mo28035i(), (String) null)));
        }
        if (vVar.mo28034h("User-Agent") == null) {
            n.mo28049i("User-Agent", C12035l.m31058a());
        }
        return n.mo28047g();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public C4318x m11341x() {
        this.f6641g.mo26433a();
        C4318x m = this.f6641g.mo26439g().mo28084y(this.f6646l).mo28077r(this.f6636b.mo27873i()).mo28078s(C3955k.f6667c, Long.toString(this.f6642h)).mo28078s(C3955k.f6668d, Long.toString(System.currentTimeMillis())).mo28074m();
        if (!this.f6652r) {
            m = m.mo28069w().mo28073l(this.f6641g.mo26441i(m)).mo28074m();
        }
        C12022d.f22043b.mo28031n(this.f6636b, m.mo28070x());
        return m;
    }

    /* renamed from: A */
    public C3949h mo26463A(RouteException routeException) {
        C3960o oVar = this.f6638d;
        if (!(oVar == null || this.f6636b == null)) {
            m11333i(oVar, routeException.getLastConnectException());
        }
        C3960o oVar2 = this.f6638d;
        if (oVar2 == null && this.f6636b == null) {
            return null;
        }
        if ((oVar2 != null && !oVar2.mo26490d()) || !m11337s(routeException)) {
            return null;
        }
        return new C3949h(this.f6635a, this.f6645k, this.f6644j, this.f6651q, this.f6652r, mo26469f(), this.f6638d, (C3959n) this.f6649o, this.f6640f);
    }

    /* renamed from: B */
    public C3949h mo26464B(IOException iOException, C9852q qVar) {
        C3960o oVar = this.f6638d;
        if (!(oVar == null || this.f6636b == null)) {
            m11333i(oVar, iOException);
        }
        boolean z = qVar == null || (qVar instanceof C3959n);
        C3960o oVar2 = this.f6638d;
        if (oVar2 == null && this.f6636b == null) {
            return null;
        }
        if ((oVar2 != null && !oVar2.mo26490d()) || !m11338t(iOException) || !z) {
            return null;
        }
        return new C3949h(this.f6635a, this.f6645k, this.f6644j, this.f6651q, this.f6652r, mo26469f(), this.f6638d, (C3959n) qVar, this.f6640f);
    }

    /* renamed from: C */
    public void mo26465C() {
        C3962q qVar = this.f6641g;
        if (!(qVar == null || this.f6636b == null)) {
            qVar.mo26435c();
        }
        this.f6636b = null;
    }

    /* renamed from: D */
    public boolean mo26466D(C4302q qVar) {
        C4302q k = this.f6645k.mo28037k();
        return k.mo27959q().equals(qVar.mo27959q()) && k.mo27945A() == qVar.mo27945A() && k.mo27948E().equals(qVar.mo27948E());
    }

    /* renamed from: E */
    public void mo26467E() {
        C9852q qVar;
        if (this.f6654t == null) {
            if (this.f6641g == null) {
                C4312v v = m11340v(this.f6645k);
                C12023e f = C12022d.f22043b.mo28023f(this.f6635a);
                C4318x d = f != null ? f.mo27829d(v) : null;
                C3934c c = new C3934c.C3936b(System.currentTimeMillis(), v, d).mo26432c();
                this.f6654t = c;
                this.f6646l = c.f6586a;
                this.f6647m = c.f6587b;
                if (f != null) {
                    f.mo27828c(c);
                }
                if (d != null && this.f6647m == null) {
                    C12033k.m31043c(d.mo28056k());
                }
                if (this.f6646l != null) {
                    if (this.f6636b == null) {
                        m11332h();
                    }
                    this.f6641g = C12022d.f22043b.mo28026i(this.f6636b, this);
                    if (this.f6651q && mo26476w() && this.f6649o == null) {
                        long d2 = C3955k.m11382d(v);
                        if (!this.f6644j) {
                            this.f6641g.mo26436d(this.f6646l);
                            qVar = this.f6641g.mo26434b(this.f6646l, d2);
                        } else if (d2 > 2147483647L) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        } else if (d2 != -1) {
                            this.f6641g.mo26436d(this.f6646l);
                            this.f6649o = new C3959n((int) d2);
                            return;
                        } else {
                            qVar = new C3959n();
                        }
                        this.f6649o = qVar;
                        return;
                    }
                    return;
                }
                if (this.f6636b != null) {
                    C12022d.f22043b.mo28027j(this.f6635a.mo28005h(), this.f6636b);
                    this.f6636b = null;
                }
                C4318x xVar = this.f6647m;
                this.f6648n = (xVar != null ? xVar.mo28069w().mo28084y(this.f6645k).mo28082w(m11323F(this.f6640f)).mo28075n(m11323F(this.f6647m)) : new C4318x.C4320b().mo28084y(this.f6645k).mo28082w(m11323F(this.f6640f)).mo28083x(Protocol.HTTP_1_1).mo28076q(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).mo28080u("Unsatisfiable Request (only-if-cached)").mo28073l(f6634u)).mo28074m();
                this.f6648n = m11324G(this.f6648n);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: I */
    public void mo26468I() {
        if (this.f6642h == -1) {
            this.f6642h = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public C4289i mo26469f() {
        Closeable closeable = this.f6650p;
        if (!(closeable == null && (closeable = this.f6649o) == null)) {
            C12033k.m31043c(closeable);
        }
        C4318x xVar = this.f6648n;
        if (xVar == null) {
            C4289i iVar = this.f6636b;
            if (iVar != null) {
                C12033k.m31044d(iVar.mo27877m());
            }
            this.f6636b = null;
            return null;
        }
        C12033k.m31043c(xVar.mo28056k());
        C3962q qVar = this.f6641g;
        if (qVar == null || this.f6636b == null || qVar.mo26440h()) {
            C4289i iVar2 = this.f6636b;
            if (iVar2 != null && !C12022d.f22043b.mo28020c(iVar2)) {
                this.f6636b = null;
            }
            C4289i iVar3 = this.f6636b;
            this.f6636b = null;
            return iVar3;
        }
        C12033k.m31044d(this.f6636b.mo27877m());
        this.f6636b = null;
        return null;
    }

    /* renamed from: l */
    public void mo26470l() {
        try {
            C3962q qVar = this.f6641g;
            if (qVar != null) {
                qVar.mo26438f(this);
                return;
            }
            C4289i iVar = this.f6636b;
            if (iVar != null) {
                C12022d.f22043b.mo28021d(iVar, this);
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: m */
    public C4312v mo26471m() {
        String q;
        C4302q D;
        if (this.f6648n != null) {
            Proxy b = mo26475q() != null ? mo26475q().mo28091b() : this.f6635a.mo28013t();
            int o = this.f6648n.mo28060o();
            if (o != 307 && o != 308) {
                if (o != 401) {
                    if (o != 407) {
                        switch (o) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                }
                return C3955k.m11388j(this.f6635a.mo28002e(), this.f6648n, b);
            } else if (!this.f6645k.mo28039m().equals("GET") && !this.f6645k.mo28039m().equals("HEAD")) {
                return null;
            }
            if (!this.f6635a.mo28009p() || (q = this.f6648n.mo28062q("Location")) == null || (D = this.f6645k.mo28037k().mo27947D(q)) == null) {
                return null;
            }
            if (!D.mo27948E().equals(this.f6645k.mo28037k().mo27948E()) && !this.f6635a.mo28010q()) {
                return null;
            }
            C4312v.C4314b n = this.f6645k.mo28040n();
            if (C3953i.m11367b(this.f6645k.mo28039m())) {
                n.mo28051k("GET", (C4315w) null);
                n.mo28053m("Transfer-Encoding");
                n.mo28053m("Content-Length");
                n.mo28053m("Content-Type");
            }
            if (!mo26466D(D)) {
                n.mo28053m("Authorization");
            }
            return n.mo28054n(D).mo28047g();
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public C4289i mo26472n() {
        return this.f6636b;
    }

    /* renamed from: o */
    public C4312v mo26473o() {
        return this.f6645k;
    }

    /* renamed from: p */
    public C4318x mo26474p() {
        C4318x xVar = this.f6648n;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: q */
    public C4323z mo26475q() {
        return this.f6639e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo26476w() {
        return C3953i.m11367b(this.f6645k.mo28039m());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26477y() {
        /*
            r5 = this;
            com.squareup.okhttp.x r0 = r5.f6648n
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.squareup.okhttp.v r0 = r5.f6646l
            if (r0 != 0) goto L_0x0016
            com.squareup.okhttp.x r1 = r5.f6647m
            if (r1 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            boolean r1 = r5.f6652r
            if (r1 == 0) goto L_0x0028
            a3.q r1 = r5.f6641g
            r1.mo26436d(r0)
        L_0x0022:
            com.squareup.okhttp.x r0 = r5.m11341x()
            goto L_0x00a9
        L_0x0028:
            boolean r1 = r5.f6651q
            if (r1 != 0) goto L_0x0039
            a3.h$c r1 = new a3.h$c
            r2 = 0
            r1.<init>(r2, r0)
            com.squareup.okhttp.v r0 = r5.f6646l
            com.squareup.okhttp.x r0 = r1.mo26483b(r0)
            goto L_0x00a9
        L_0x0039:
            okio.d r0 = r5.f6650p
            if (r0 == 0) goto L_0x0050
            okio.c r0 = r0.mo24724F()
            long r0 = r0.mo24758i1()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0050
            okio.d r0 = r5.f6650p
            r0.mo24727K()
        L_0x0050:
            long r0 = r5.f6642h
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x008b
            com.squareup.okhttp.v r0 = r5.f6646l
            long r0 = p123a3.C3955k.m11382d(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0084
            okio.q r0 = r5.f6649o
            boolean r1 = r0 instanceof p123a3.C3959n
            if (r1 == 0) goto L_0x0084
            a3.n r0 = (p123a3.C3959n) r0
            long r0 = r0.mo26487a()
            com.squareup.okhttp.v r2 = r5.f6646l
            com.squareup.okhttp.v$b r2 = r2.mo28040n()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = "Content-Length"
            com.squareup.okhttp.v$b r0 = r2.mo28049i(r1, r0)
            com.squareup.okhttp.v r0 = r0.mo28047g()
            r5.f6646l = r0
        L_0x0084:
            a3.q r0 = r5.f6641g
            com.squareup.okhttp.v r1 = r5.f6646l
            r0.mo26436d(r1)
        L_0x008b:
            okio.q r0 = r5.f6649o
            if (r0 == 0) goto L_0x0022
            okio.d r1 = r5.f6650p
            if (r1 == 0) goto L_0x0097
            r1.close()
            goto L_0x009a
        L_0x0097:
            r0.close()
        L_0x009a:
            okio.q r0 = r5.f6649o
            boolean r1 = r0 instanceof p123a3.C3959n
            if (r1 == 0) goto L_0x0022
            a3.q r1 = r5.f6641g
            a3.n r0 = (p123a3.C3959n) r0
            r1.mo26437e(r0)
            goto L_0x0022
        L_0x00a9:
            com.squareup.okhttp.p r1 = r0.mo28064s()
            r5.mo26478z(r1)
            com.squareup.okhttp.x r1 = r5.f6647m
            if (r1 == 0) goto L_0x012c
            boolean r1 = m11325H(r1, r0)
            if (r1 == 0) goto L_0x0123
            com.squareup.okhttp.x r1 = r5.f6647m
            com.squareup.okhttp.x$b r1 = r1.mo28069w()
            com.squareup.okhttp.v r2 = r5.f6645k
            com.squareup.okhttp.x$b r1 = r1.mo28084y(r2)
            com.squareup.okhttp.x r2 = r5.f6640f
            com.squareup.okhttp.x r2 = m11323F(r2)
            com.squareup.okhttp.x$b r1 = r1.mo28082w(r2)
            com.squareup.okhttp.x r2 = r5.f6647m
            com.squareup.okhttp.p r2 = r2.mo28064s()
            com.squareup.okhttp.p r3 = r0.mo28064s()
            com.squareup.okhttp.p r2 = m11331g(r2, r3)
            com.squareup.okhttp.x$b r1 = r1.mo28079t(r2)
            com.squareup.okhttp.x r2 = r5.f6647m
            com.squareup.okhttp.x r2 = m11323F(r2)
            com.squareup.okhttp.x$b r1 = r1.mo28075n(r2)
            com.squareup.okhttp.x r2 = m11323F(r0)
            com.squareup.okhttp.x$b r1 = r1.mo28081v(r2)
            com.squareup.okhttp.x r1 = r1.mo28074m()
            r5.f6648n = r1
            com.squareup.okhttp.y r0 = r0.mo28056k()
            r0.close()
            r5.mo26465C()
            y2.d r0 = p231y2.C12022d.f22043b
            com.squareup.okhttp.u r1 = r5.f6635a
            y2.e r0 = r0.mo28023f(r1)
            r0.mo27826a()
            com.squareup.okhttp.x r1 = r5.f6647m
            com.squareup.okhttp.x r2 = r5.f6648n
            com.squareup.okhttp.x r2 = m11323F(r2)
            r0.mo27831f(r1, r2)
            com.squareup.okhttp.x r0 = r5.f6648n
            com.squareup.okhttp.x r0 = r5.m11324G(r0)
            r5.f6648n = r0
            return
        L_0x0123:
            com.squareup.okhttp.x r1 = r5.f6647m
            com.squareup.okhttp.y r1 = r1.mo28056k()
            p231y2.C12033k.m31043c(r1)
        L_0x012c:
            com.squareup.okhttp.x$b r1 = r0.mo28069w()
            com.squareup.okhttp.v r2 = r5.f6645k
            com.squareup.okhttp.x$b r1 = r1.mo28084y(r2)
            com.squareup.okhttp.x r2 = r5.f6640f
            com.squareup.okhttp.x r2 = m11323F(r2)
            com.squareup.okhttp.x$b r1 = r1.mo28082w(r2)
            com.squareup.okhttp.x r2 = r5.f6647m
            com.squareup.okhttp.x r2 = m11323F(r2)
            com.squareup.okhttp.x$b r1 = r1.mo28075n(r2)
            com.squareup.okhttp.x r0 = m11323F(r0)
            com.squareup.okhttp.x$b r0 = r1.mo28081v(r0)
            com.squareup.okhttp.x r0 = r0.mo28074m()
            r5.f6648n = r0
            boolean r0 = m11336r(r0)
            if (r0 == 0) goto L_0x016f
            r5.m11339u()
            a3.b r0 = r5.f6653s
            com.squareup.okhttp.x r1 = r5.f6648n
            com.squareup.okhttp.x r0 = r5.m11330e(r0, r1)
            com.squareup.okhttp.x r0 = r5.m11324G(r0)
            r5.f6648n = r0
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123a3.C3949h.mo26477y():void");
    }

    /* renamed from: z */
    public void mo26478z(C4299p pVar) {
        CookieHandler j = this.f6635a.mo28007j();
        if (j != null) {
            j.put(this.f6645k.mo28042p(), C3955k.m11390l(pVar, (String) null));
        }
    }
}
