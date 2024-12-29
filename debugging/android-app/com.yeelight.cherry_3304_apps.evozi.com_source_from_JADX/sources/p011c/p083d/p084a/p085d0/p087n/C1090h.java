package p011c.p083d.p084a.p085d0.p087n;

import com.miot.service.manager.timer.TimerCodec;
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
import p011c.p083d.p084a.C0987a;
import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C0991b0;
import p011c.p083d.p084a.C1115g;
import p011c.p083d.p084a.C1120j;
import p011c.p083d.p084a.C1121k;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1136s;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1141v;
import p011c.p083d.p084a.C1143w;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1147y;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1013d;
import p011c.p083d.p084a.p085d0.C1014e;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.C1026l;
import p011c.p083d.p084a.p085d0.p087n.C1075c;
import p163g.C10841k;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.n.h */
public final class C1090h {

    /* renamed from: u */
    private static final C0988a0 f1577u = new C1091a();

    /* renamed from: a */
    final C1141v f1578a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1120j f1579b;

    /* renamed from: c */
    private C0987a f1580c;

    /* renamed from: d */
    private C1103q f1581d;

    /* renamed from: e */
    private C0991b0 f1582e;

    /* renamed from: f */
    private final C1150z f1583f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1105s f1584g;

    /* renamed from: h */
    long f1585h = -1;

    /* renamed from: i */
    private boolean f1586i;

    /* renamed from: j */
    public final boolean f1587j;

    /* renamed from: k */
    private final C1144x f1588k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1144x f1589l;

    /* renamed from: m */
    private C1150z f1590m;

    /* renamed from: n */
    private C1150z f1591n;

    /* renamed from: o */
    private C4415s f1592o;

    /* renamed from: p */
    private C4409d f1593p;

    /* renamed from: q */
    private final boolean f1594q;

    /* renamed from: r */
    private final boolean f1595r;

    /* renamed from: s */
    private C1074b f1596s;

    /* renamed from: t */
    private C1075c f1597t;

    /* renamed from: c.d.a.d0.n.h$a */
    static class C1091a extends C0988a0 {
        C1091a() {
        }

        /* renamed from: i */
        public long mo9388i() {
            return 0;
        }

        /* renamed from: j */
        public C1138t mo9389j() {
            return null;
        }

        /* renamed from: s */
        public C4410e mo9390s() {
            return new C4406c();
        }
    }

    /* renamed from: c.d.a.d0.n.h$b */
    class C1092b implements C4416t {

        /* renamed from: a */
        boolean f1598a;

        /* renamed from: b */
        final /* synthetic */ C4410e f1599b;

        /* renamed from: c */
        final /* synthetic */ C1074b f1600c;

        /* renamed from: d */
        final /* synthetic */ C4409d f1601d;

        C1092b(C1090h hVar, C4410e eVar, C1074b bVar, C4409d dVar) {
            this.f1599b = eVar;
            this.f1600c = bVar;
            this.f1601d = dVar;
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            try {
                long P0 = this.f1599b.mo9541P0(cVar, j);
                if (P0 == -1) {
                    if (!this.f1598a) {
                        this.f1598a = true;
                        this.f1601d.close();
                    }
                    return -1;
                }
                cVar.mo24240j(this.f1601d.mo24208H(), cVar.mo24233g1() - P0, P0);
                this.f1601d.mo24219Y();
                return P0;
            } catch (IOException e) {
                if (!this.f1598a) {
                    this.f1598a = true;
                    this.f1600c.mo9407a();
                }
                throw e;
            }
        }

        public void close() {
            if (!this.f1598a && !C1024k.m2094e(this, 100, TimeUnit.MILLISECONDS)) {
                this.f1598a = true;
                this.f1600c.mo9407a();
            }
            this.f1599b.close();
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f1599b.mo9542f();
        }
    }

    /* renamed from: c.d.a.d0.n.h$c */
    class C1093c implements C1136s.C1137a {

        /* renamed from: a */
        private final int f1602a;

        /* renamed from: b */
        private final C1144x f1603b;

        /* renamed from: c */
        private int f1604c;

        C1093c(int i, C1144x xVar) {
            this.f1602a = i;
            this.f1603b = xVar;
        }

        /* renamed from: a */
        public C1144x mo9643a() {
            return this.f1603b;
        }

        /* renamed from: b */
        public C1150z mo9644b(C1144x xVar) {
            this.f1604c++;
            if (this.f1602a > 0) {
                C1136s sVar = C1090h.this.f1578a.mo9802E().get(this.f1602a - 1);
                C0987a a = mo9645c().mo9696l().mo9394a();
                if (!xVar.mo9838k().mo9772q().equals(a.mo9382j()) || xVar.mo9838k().mo9758A() != a.mo9383k()) {
                    throw new IllegalStateException("network interceptor " + sVar + " must retain the same host and port");
                } else if (this.f1604c > 1) {
                    throw new IllegalStateException("network interceptor " + sVar + " must call proceed() exactly once");
                }
            }
            if (this.f1602a < C1090h.this.f1578a.mo9802E().size()) {
                C1093c cVar = new C1093c(this.f1602a + 1, xVar);
                C1136s sVar2 = C1090h.this.f1578a.mo9802E().get(this.f1602a);
                C1150z intercept = sVar2.intercept(cVar);
                if (cVar.f1604c == 1) {
                    return intercept;
                }
                throw new IllegalStateException("network interceptor " + sVar2 + " must call proceed() exactly once");
            }
            C1090h.this.f1584g.mo9600d(xVar);
            C1144x unused = C1090h.this.f1589l = xVar;
            if (C1090h.this.mo9640w() && xVar.mo9833f() != null) {
                C4409d c = C10843m.m27008c(C1090h.this.f1584g.mo9598b(xVar, xVar.mo9833f().mo9796a()));
                xVar.mo9833f().mo9798g(c);
                c.close();
            }
            C1150z d = C1090h.this.m2483x();
            int o = d.mo9861o();
            if ((o != 204 && o != 205) || d.mo9857k().mo9388i() <= 0) {
                return d;
            }
            throw new ProtocolException("HTTP " + o + " had non-zero Content-Length: " + d.mo9857k().mo9388i());
        }

        /* renamed from: c */
        public C1120j mo9645c() {
            return C1090h.this.f1579b;
        }
    }

    public C1090h(C1141v vVar, C1144x xVar, boolean z, boolean z2, boolean z3, C1120j jVar, C1103q qVar, C1101o oVar, C1150z zVar) {
        C0991b0 b0Var;
        this.f1578a = vVar;
        this.f1588k = xVar;
        this.f1587j = z;
        this.f1594q = z2;
        this.f1595r = z3;
        this.f1579b = jVar;
        this.f1581d = qVar;
        this.f1592o = oVar;
        this.f1583f = zVar;
        if (jVar != null) {
            C1013d.f1321b.mo9463m(jVar, this);
            b0Var = jVar.mo9696l();
        } else {
            b0Var = null;
        }
        this.f1582e = b0Var;
    }

    /* renamed from: F */
    private static C1150z m2465F(C1150z zVar) {
        if (zVar == null || zVar.mo9857k() == null) {
            return zVar;
        }
        C1150z.C1152b w = zVar.mo9870w();
        w.mo9874l((C0988a0) null);
        return w.mo9875m();
    }

    /* renamed from: G */
    private C1150z m2466G(C1150z zVar) {
        if (!this.f1586i || !"gzip".equalsIgnoreCase(this.f1591n.mo9863q("Content-Encoding")) || zVar.mo9857k() == null) {
            return zVar;
        }
        C10841k kVar = new C10841k(zVar.mo9857k().mo9390s());
        C1130q.C1132b e = zVar.mo9865s().mo9747e();
        e.mo9756g("Content-Encoding");
        e.mo9756g("Content-Length");
        C1130q e2 = e.mo9755e();
        C1150z.C1152b w = zVar.mo9870w();
        w.mo9880t(e2);
        w.mo9874l(new C1098l(e2, C10843m.m27009d(kVar)));
        return w.mo9875m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r5 = r5.mo9865s().mo9745c("Last-Modified");
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m2467H(p011c.p083d.p084a.C1150z r4, p011c.p083d.p084a.C1150z r5) {
        /*
            int r0 = r5.mo9861o()
            r1 = 1
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x000a
            return r1
        L_0x000a:
            c.d.a.q r4 = r4.mo9865s()
            java.lang.String r0 = "Last-Modified"
            java.util.Date r4 = r4.mo9745c(r0)
            if (r4 == 0) goto L_0x002d
            c.d.a.q r5 = r5.mo9865s()
            java.util.Date r5 = r5.mo9745c(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p087n.C1090h.m2467H(c.d.a.z, c.d.a.z):boolean");
    }

    /* renamed from: e */
    private C1150z m2472e(C1074b bVar, C1150z zVar) {
        C4415s b;
        if (bVar == null || (b = bVar.mo9408b()) == null) {
            return zVar;
        }
        C1092b bVar2 = new C1092b(this, zVar.mo9857k().mo9390s(), bVar, C10843m.m27008c(b));
        C1150z.C1152b w = zVar.mo9870w();
        w.mo9874l(new C1098l(zVar.mo9865s(), C10843m.m27009d(bVar2)));
        return w.mo9875m();
    }

    /* renamed from: g */
    private static C1130q m2473g(C1130q qVar, C1130q qVar2) {
        C1130q.C1132b bVar = new C1130q.C1132b();
        int g = qVar.mo9748g();
        for (int i = 0; i < g; i++) {
            String d = qVar.mo9746d(i);
            String h = qVar.mo9749h(i);
            if ((!"Warning".equalsIgnoreCase(d) || !h.startsWith(TimerCodec.ENABLE)) && (!C1096k.m2528h(d) || qVar2.mo9744a(d) == null)) {
                bVar.mo9752b(d, h);
            }
        }
        int g2 = qVar2.mo9748g();
        for (int i2 = 0; i2 < g2; i2++) {
            String d2 = qVar2.mo9746d(i2);
            if (!"Content-Length".equalsIgnoreCase(d2) && C1096k.m2528h(d2)) {
                bVar.mo9752b(d2, qVar2.mo9749h(i2));
            }
        }
        return bVar.mo9755e();
    }

    /* renamed from: h */
    private void m2474h() {
        if (this.f1579b == null) {
            if (this.f1581d == null) {
                C0987a j = m2476j(this.f1578a, this.f1589l);
                this.f1580c = j;
                try {
                    this.f1581d = C1103q.m2554b(j, this.f1589l, this.f1578a);
                } catch (IOException e) {
                    throw new C1099m(e);
                }
            }
            C1120j k = m2477k();
            this.f1579b = k;
            C1013d.f1321b.mo9455e(this.f1578a, k, this, this.f1589l);
            this.f1582e = this.f1579b.mo9696l();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    private void m2475i(C1103q qVar, IOException iOException) {
        if (C1013d.f1321b.mo9461k(this.f1579b) <= 0) {
            qVar.mo9654a(this.f1579b.mo9696l(), iOException);
        }
    }

    /* renamed from: j */
    private static C0987a m2476j(C1141v vVar, C1144x xVar) {
        C1115g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (xVar.mo9839l()) {
            SSLSocketFactory z = vVar.mo9831z();
            hostnameVerifier = vVar.mo9824s();
            sSLSocketFactory = z;
            gVar = vVar.mo9816f();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C0987a(xVar.mo9838k().mo9772q(), xVar.mo9838k().mo9758A(), vVar.mo9830y(), sSLSocketFactory, hostnameVerifier, gVar, vVar.mo9815e(), vVar.mo9826u(), vVar.mo9825t(), vVar.mo9819l(), vVar.mo9827v());
    }

    /* renamed from: k */
    private C1120j m2477k() {
        C1120j c;
        C1121k k = this.f1578a.mo9818k();
        while (true) {
            c = k.mo9711c(this.f1580c);
            if (c == null) {
                try {
                    return new C1120j(k, this.f1581d.mo9656h());
                } catch (IOException e) {
                    throw new C1102p(e);
                }
            } else if (this.f1589l.mo9840m().equals("GET") || C1013d.f1321b.mo9457g(c)) {
                return c;
            } else {
                C1024k.m2093d(c.mo9697m());
            }
        }
        return c;
    }

    /* renamed from: r */
    public static boolean m2478r(C1150z zVar) {
        if (zVar.mo9872y().mo9840m().equals("HEAD")) {
            return false;
        }
        int o = zVar.mo9861o();
        return (((o >= 100 && o < 200) || o == 204 || o == 304) && C1096k.m2525e(zVar) == -1 && !"chunked".equalsIgnoreCase(zVar.mo9863q("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: s */
    private boolean m2479s(C1102p pVar) {
        if (!this.f1578a.mo9829x()) {
            return false;
        }
        IOException c = pVar.mo9653c();
        if (!(c instanceof ProtocolException) && !(c instanceof InterruptedIOException)) {
            return (!(c instanceof SSLHandshakeException) || !(c.getCause() instanceof CertificateException)) && !(c instanceof SSLPeerUnverifiedException);
        }
        return false;
    }

    /* renamed from: t */
    private boolean m2480t(IOException iOException) {
        return this.f1578a.mo9829x() && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException);
    }

    /* renamed from: u */
    private void m2481u() {
        C1014e f = C1013d.f1321b.mo9456f(this.f1578a);
        if (f != null) {
            if (C1075c.m2401a(this.f1591n, this.f1589l)) {
                this.f1596s = f.mo9402b(m2465F(this.f1591n));
            } else if (C1094i.m2508a(this.f1589l.mo9840m())) {
                try {
                    f.mo9404d(this.f1589l);
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: v */
    private C1144x m2482v(C1144x xVar) {
        C1144x.C1146b n = xVar.mo9841n();
        if (xVar.mo9835h("Host") == null) {
            n.mo9850i("Host", C1024k.m2096g(xVar.mo9838k()));
        }
        C1120j jVar = this.f1579b;
        if ((jVar == null || jVar.mo9695k() != C1143w.HTTP_1_0) && xVar.mo9835h("Connection") == null) {
            n.mo9850i("Connection", "Keep-Alive");
        }
        if (xVar.mo9835h("Accept-Encoding") == null) {
            this.f1586i = true;
            n.mo9850i("Accept-Encoding", "gzip");
        }
        CookieHandler m = this.f1578a.mo9820m();
        if (m != null) {
            C1096k.m2521a(n, m.get(xVar.mo9843p(), C1096k.m2532l(n.mo9848g().mo9836i(), (String) null)));
        }
        if (xVar.mo9835h("User-Agent") == null) {
            n.mo9850i("User-Agent", C1026l.m2107a());
        }
        return n.mo9848g();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public C1150z m2483x() {
        this.f1584g.mo9597a();
        C1150z.C1152b g = this.f1584g.mo9603g();
        g.mo9885y(this.f1589l);
        g.mo9878r(this.f1579b.mo9693i());
        g.mo9879s(C1096k.f1610c, Long.toString(this.f1585h));
        g.mo9879s(C1096k.f1611d, Long.toString(System.currentTimeMillis()));
        C1150z m = g.mo9875m();
        if (!this.f1595r) {
            C1150z.C1152b w = m.mo9870w();
            w.mo9874l(this.f1584g.mo9605i(m));
            m = w.mo9875m();
        }
        C1013d.f1321b.mo9464n(this.f1579b, m.mo9871x());
        return m;
    }

    /* renamed from: A */
    public C1090h mo9627A(C1102p pVar) {
        C1103q qVar = this.f1581d;
        if (!(qVar == null || this.f1579b == null)) {
            m2475i(qVar, pVar.mo9653c());
        }
        if (this.f1581d == null && this.f1579b == null) {
            return null;
        }
        C1103q qVar2 = this.f1581d;
        if ((qVar2 != null && !qVar2.mo9655d()) || !m2479s(pVar)) {
            return null;
        }
        return new C1090h(this.f1578a, this.f1588k, this.f1587j, this.f1594q, this.f1595r, mo9633f(), this.f1581d, (C1101o) this.f1592o, this.f1583f);
    }

    /* renamed from: B */
    public C1090h mo9628B(IOException iOException, C4415s sVar) {
        C1103q qVar = this.f1581d;
        if (!(qVar == null || this.f1579b == null)) {
            m2475i(qVar, iOException);
        }
        boolean z = sVar == null || (sVar instanceof C1101o);
        if (this.f1581d == null && this.f1579b == null) {
            return null;
        }
        C1103q qVar2 = this.f1581d;
        if ((qVar2 != null && !qVar2.mo9655d()) || !m2480t(iOException) || !z) {
            return null;
        }
        return new C1090h(this.f1578a, this.f1588k, this.f1587j, this.f1594q, this.f1595r, mo9633f(), this.f1581d, (C1101o) sVar, this.f1583f);
    }

    /* renamed from: C */
    public void mo9629C() {
        C1105s sVar = this.f1584g;
        if (!(sVar == null || this.f1579b == null)) {
            sVar.mo9599c();
        }
        this.f1579b = null;
    }

    /* renamed from: D */
    public boolean mo9630D(C1133r rVar) {
        C1133r k = this.f1588k.mo9838k();
        return k.mo9772q().equals(rVar.mo9772q()) && k.mo9758A() == rVar.mo9758A() && k.mo9761E().equals(rVar.mo9761E());
    }

    /* renamed from: E */
    public void mo9631E() {
        C1150z.C1152b bVar;
        C4415s sVar;
        if (this.f1597t == null) {
            if (this.f1584g == null) {
                C1144x v = m2482v(this.f1588k);
                C1014e f = C1013d.f1321b.mo9456f(this.f1578a);
                C1150z c = f != null ? f.mo9403c(v) : null;
                C1075c c2 = new C1075c.C1077b(System.currentTimeMillis(), v, c).mo9596c();
                this.f1597t = c2;
                this.f1589l = c2.f1529a;
                this.f1590m = c2.f1530b;
                if (f != null) {
                    f.mo9405e(c2);
                }
                if (c != null && this.f1590m == null) {
                    C1024k.m2092c(c.mo9857k());
                }
                if (this.f1589l != null) {
                    if (this.f1579b == null) {
                        m2474h();
                    }
                    this.f1584g = C1013d.f1321b.mo9459i(this.f1579b, this);
                    if (this.f1594q && mo9640w() && this.f1592o == null) {
                        long d = C1096k.m2524d(v);
                        if (!this.f1587j) {
                            this.f1584g.mo9600d(this.f1589l);
                            sVar = this.f1584g.mo9598b(this.f1589l, d);
                        } else if (d > 2147483647L) {
                            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                        } else if (d != -1) {
                            this.f1584g.mo9600d(this.f1589l);
                            this.f1592o = new C1101o((int) d);
                            return;
                        } else {
                            sVar = new C1101o();
                        }
                        this.f1592o = sVar;
                        return;
                    }
                    return;
                }
                if (this.f1579b != null) {
                    C1013d.f1321b.mo9460j(this.f1578a.mo9818k(), this.f1579b);
                    this.f1579b = null;
                }
                C1150z zVar = this.f1590m;
                if (zVar != null) {
                    bVar = zVar.mo9870w();
                    bVar.mo9885y(this.f1588k);
                    bVar.mo9883w(m2465F(this.f1583f));
                    bVar.mo9876n(m2465F(this.f1590m));
                } else {
                    bVar = new C1150z.C1152b();
                    bVar.mo9885y(this.f1588k);
                    bVar.mo9883w(m2465F(this.f1583f));
                    bVar.mo9884x(C1143w.HTTP_1_1);
                    bVar.mo9877q(504);
                    bVar.mo9881u("Unsatisfiable Request (only-if-cached)");
                    bVar.mo9874l(f1577u);
                }
                this.f1591n = bVar.mo9875m();
                this.f1591n = m2466G(this.f1591n);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: I */
    public void mo9632I() {
        if (this.f1585h == -1) {
            this.f1585h = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public C1120j mo9633f() {
        Closeable closeable = this.f1593p;
        if (!(closeable == null && (closeable = this.f1592o) == null)) {
            C1024k.m2092c(closeable);
        }
        C1150z zVar = this.f1591n;
        if (zVar == null) {
            C1120j jVar = this.f1579b;
            if (jVar != null) {
                C1024k.m2093d(jVar.mo9697m());
            }
            this.f1579b = null;
            return null;
        }
        C1024k.m2092c(zVar.mo9857k());
        C1105s sVar = this.f1584g;
        if (sVar == null || this.f1579b == null || sVar.mo9604h()) {
            C1120j jVar2 = this.f1579b;
            if (jVar2 != null && !C1013d.f1321b.mo9453c(jVar2)) {
                this.f1579b = null;
            }
            C1120j jVar3 = this.f1579b;
            this.f1579b = null;
            return jVar3;
        }
        C1024k.m2093d(this.f1579b.mo9697m());
        this.f1579b = null;
        return null;
    }

    /* renamed from: l */
    public void mo9634l() {
        try {
            if (this.f1584g != null) {
                this.f1584g.mo9601e(this);
                return;
            }
            C1120j jVar = this.f1579b;
            if (jVar != null) {
                C1013d.f1321b.mo9454d(jVar, this);
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: m */
    public C1144x mo9635m() {
        String q;
        C1133r D;
        if (this.f1591n != null) {
            Proxy b = mo9639q() != null ? mo9639q().mo9395b() : this.f1578a.mo9826u();
            int o = this.f1591n.mo9861o();
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
                return C1096k.m2530j(this.f1578a.mo9815e(), this.f1591n, b);
            } else if (!this.f1588k.mo9840m().equals("GET") && !this.f1588k.mo9840m().equals("HEAD")) {
                return null;
            }
            if (!this.f1578a.mo9822q() || (q = this.f1591n.mo9863q("Location")) == null || (D = this.f1588k.mo9838k().mo9760D(q)) == null) {
                return null;
            }
            if (!D.mo9761E().equals(this.f1588k.mo9838k().mo9761E()) && !this.f1578a.mo9823r()) {
                return null;
            }
            C1144x.C1146b n = this.f1588k.mo9841n();
            if (C1094i.m2509b(this.f1588k.mo9840m())) {
                n.mo9852k("GET", (C1147y) null);
                n.mo9854m("Transfer-Encoding");
                n.mo9854m("Content-Length");
                n.mo9854m("Content-Type");
            }
            if (!mo9630D(D)) {
                n.mo9854m("Authorization");
            }
            n.mo9855n(D);
            return n.mo9848g();
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public C1120j mo9636n() {
        return this.f1579b;
    }

    /* renamed from: o */
    public C1144x mo9637o() {
        return this.f1588k;
    }

    /* renamed from: p */
    public C1150z mo9638p() {
        C1150z zVar = this.f1591n;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: q */
    public C0991b0 mo9639q() {
        return this.f1582e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo9640w() {
        return C1094i.m2509b(this.f1588k.mo9840m());
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9641y() {
        /*
            r5 = this;
            c.d.a.z r0 = r5.f1591n
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            c.d.a.x r0 = r5.f1589l
            if (r0 != 0) goto L_0x0016
            c.d.a.z r0 = r5.f1590m
            if (r0 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            c.d.a.x r0 = r5.f1589l
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            boolean r1 = r5.f1595r
            if (r1 == 0) goto L_0x002a
            c.d.a.d0.n.s r1 = r5.f1584g
            r1.mo9600d(r0)
        L_0x0024:
            c.d.a.z r0 = r5.m2483x()
            goto L_0x00aa
        L_0x002a:
            boolean r1 = r5.f1594q
            if (r1 != 0) goto L_0x003b
            c.d.a.d0.n.h$c r1 = new c.d.a.d0.n.h$c
            r2 = 0
            r1.<init>(r2, r0)
            c.d.a.x r0 = r5.f1589l
            c.d.a.z r0 = r1.mo9644b(r0)
            goto L_0x00aa
        L_0x003b:
            g.d r0 = r5.f1593p
            if (r0 == 0) goto L_0x0052
            g.c r0 = r0.mo24208H()
            long r0 = r0.mo24233g1()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0052
            g.d r0 = r5.f1593p
            r0.mo24212N()
        L_0x0052:
            long r0 = r5.f1585h
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x008c
            c.d.a.x r0 = r5.f1589l
            long r0 = p011c.p083d.p084a.p085d0.p087n.C1096k.m2524d(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0085
            g.s r0 = r5.f1592o
            boolean r1 = r0 instanceof p011c.p083d.p084a.p085d0.p087n.C1101o
            if (r1 == 0) goto L_0x0085
            c.d.a.d0.n.o r0 = (p011c.p083d.p084a.p085d0.p087n.C1101o) r0
            long r0 = r0.mo9650a()
            c.d.a.x r2 = r5.f1589l
            c.d.a.x$b r2 = r2.mo9841n()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = "Content-Length"
            r2.mo9850i(r1, r0)
            c.d.a.x r0 = r2.mo9848g()
            r5.f1589l = r0
        L_0x0085:
            c.d.a.d0.n.s r0 = r5.f1584g
            c.d.a.x r1 = r5.f1589l
            r0.mo9600d(r1)
        L_0x008c:
            g.s r0 = r5.f1592o
            if (r0 == 0) goto L_0x0024
            g.d r1 = r5.f1593p
            if (r1 == 0) goto L_0x0098
            r1.close()
            goto L_0x009b
        L_0x0098:
            r0.close()
        L_0x009b:
            g.s r0 = r5.f1592o
            boolean r1 = r0 instanceof p011c.p083d.p084a.p085d0.p087n.C1101o
            if (r1 == 0) goto L_0x0024
            c.d.a.d0.n.s r1 = r5.f1584g
            c.d.a.d0.n.o r0 = (p011c.p083d.p084a.p085d0.p087n.C1101o) r0
            r1.mo9602f(r0)
            goto L_0x0024
        L_0x00aa:
            c.d.a.q r1 = r0.mo9865s()
            r5.mo9642z(r1)
            c.d.a.z r1 = r5.f1590m
            if (r1 == 0) goto L_0x0128
            boolean r1 = m2467H(r1, r0)
            if (r1 == 0) goto L_0x011f
            c.d.a.z r1 = r5.f1590m
            c.d.a.z$b r1 = r1.mo9870w()
            c.d.a.x r2 = r5.f1588k
            r1.mo9885y(r2)
            c.d.a.z r2 = r5.f1583f
            c.d.a.z r2 = m2465F(r2)
            r1.mo9883w(r2)
            c.d.a.z r2 = r5.f1590m
            c.d.a.q r2 = r2.mo9865s()
            c.d.a.q r3 = r0.mo9865s()
            c.d.a.q r2 = m2473g(r2, r3)
            r1.mo9880t(r2)
            c.d.a.z r2 = r5.f1590m
            c.d.a.z r2 = m2465F(r2)
            r1.mo9876n(r2)
            c.d.a.z r2 = m2465F(r0)
            r1.mo9882v(r2)
            c.d.a.z r1 = r1.mo9875m()
            r5.f1591n = r1
            c.d.a.a0 r0 = r0.mo9857k()
            r0.close()
            r5.mo9629C()
            c.d.a.d0.d r0 = p011c.p083d.p084a.p085d0.C1013d.f1321b
            c.d.a.v r1 = r5.f1578a
            c.d.a.d0.e r0 = r0.mo9456f(r1)
            r0.mo9401a()
            c.d.a.z r1 = r5.f1590m
            c.d.a.z r2 = r5.f1591n
            c.d.a.z r2 = m2465F(r2)
            r0.mo9406f(r1, r2)
            c.d.a.z r0 = r5.f1591n
            c.d.a.z r0 = r5.m2466G(r0)
            r5.f1591n = r0
            return
        L_0x011f:
            c.d.a.z r1 = r5.f1590m
            c.d.a.a0 r1 = r1.mo9857k()
            p011c.p083d.p084a.p085d0.C1024k.m2092c(r1)
        L_0x0128:
            c.d.a.z$b r1 = r0.mo9870w()
            c.d.a.x r2 = r5.f1588k
            r1.mo9885y(r2)
            c.d.a.z r2 = r5.f1583f
            c.d.a.z r2 = m2465F(r2)
            r1.mo9883w(r2)
            c.d.a.z r2 = r5.f1590m
            c.d.a.z r2 = m2465F(r2)
            r1.mo9876n(r2)
            c.d.a.z r0 = m2465F(r0)
            r1.mo9882v(r0)
            c.d.a.z r0 = r1.mo9875m()
            r5.f1591n = r0
            boolean r0 = m2478r(r0)
            if (r0 == 0) goto L_0x0167
            r5.m2481u()
            c.d.a.d0.n.b r0 = r5.f1596s
            c.d.a.z r1 = r5.f1591n
            c.d.a.z r0 = r5.m2472e(r0, r1)
            c.d.a.z r0 = r5.m2466G(r0)
            r5.f1591n = r0
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p087n.C1090h.mo9641y():void");
    }

    /* renamed from: z */
    public void mo9642z(C1130q qVar) {
        CookieHandler m = this.f1578a.mo9820m();
        if (m != null) {
            m.put(this.f1588k.mo9843p(), C1096k.m2532l(qVar, (String) null));
        }
    }
}
