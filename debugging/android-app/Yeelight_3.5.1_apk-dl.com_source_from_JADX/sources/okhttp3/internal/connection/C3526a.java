package okhttp3.internal.connection;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.location.LocationRequestCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.C3504a;
import okhttp3.C3505a0;
import okhttp3.C3509b0;
import okhttp3.C3522d0;
import okhttp3.C3531j;
import okhttp3.C3537p;
import okhttp3.C3543r;
import okhttp3.C3546t;
import okhttp3.C3552x;
import okhttp3.C3558z;
import okhttp3.C9796e;
import okhttp3.C9801i;
import okhttp3.C9834u;
import okhttp3.Protocol;
import okhttp3.internal.http2.C3527f;
import okhttp3.internal.http2.C9808d;
import okhttp3.internal.http2.ErrorCode;
import okio.C9837d;
import okio.C9838e;
import okio.C9845l;
import okio.C9853r;
import p056k5.C3299a;
import p056k5.C3300c;
import p056k5.C9297d;
import p073n5.C9729c;
import p073n5.C9732e;
import p092r5.C3636f;
import p186m5.C9550b;
import p186m5.C9554e;
import p192o5.C9780a;
import p199p5.C10271a;
import p213t5.C10399d;

/* renamed from: okhttp3.internal.connection.a */
public final class C3526a extends C9808d.C9816h implements C9801i {

    /* renamed from: b */
    private final C3531j f5714b;

    /* renamed from: c */
    private final C3522d0 f5715c;

    /* renamed from: d */
    private Socket f5716d;

    /* renamed from: e */
    private Socket f5717e;

    /* renamed from: f */
    private C3543r f5718f;

    /* renamed from: g */
    private Protocol f5719g;

    /* renamed from: h */
    private C9808d f5720h;

    /* renamed from: i */
    private C9838e f5721i;

    /* renamed from: j */
    private C9837d f5722j;

    /* renamed from: k */
    public boolean f5723k;

    /* renamed from: l */
    public int f5724l;

    /* renamed from: m */
    public int f5725m = 1;

    /* renamed from: n */
    public final List<Reference<C9554e>> f5726n = new ArrayList();

    /* renamed from: o */
    public long f5727o = LocationRequestCompat.PASSIVE_INTERVAL;

    public C3526a(C3531j jVar, C3522d0 d0Var) {
        this.f5714b = jVar;
        this.f5715c = d0Var;
    }

    /* renamed from: e */
    private void m9677e(int i, int i2, C9796e eVar, C3537p pVar) {
        Proxy b = this.f5715c.mo24427b();
        this.f5716d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.f5715c.mo24426a().mo24347j().createSocket() : new Socket(b);
        pVar.mo24519f(eVar, this.f5715c.mo24429d(), b);
        this.f5716d.setSoTimeout(i2);
        try {
            C3636f.m10368j().mo25938h(this.f5716d, this.f5715c.mo24429d(), i);
            try {
                this.f5721i = C9845l.m23738d(C9845l.m23747m(this.f5716d));
                this.f5722j = C9845l.m23737c(C9845l.m23743i(this.f5716d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f5715c.mo24429d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010d A[Catch:{ all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0113 A[Catch:{ all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9678f(p186m5.C9550b r8) {
        /*
            r7 = this;
            okhttp3.d0 r0 = r7.f5715c
            okhttp3.a r0 = r0.mo24426a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo24348k()
            r2 = 0
            java.net.Socket r3 = r7.f5716d     // Catch:{ AssertionError -> 0x0106 }
            okhttp3.t r4 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0106 }
            java.lang.String r4 = r4.mo24573m()     // Catch:{ AssertionError -> 0x0106 }
            okhttp3.t r5 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0106 }
            int r5 = r5.mo24579z()     // Catch:{ AssertionError -> 0x0106 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0106 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0106 }
            okhttp3.k r8 = r8.mo38510a(r1)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            boolean r3 = r8.mo24494f()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            if (r3 == 0) goto L_0x0041
            r5.f r3 = p092r5.C3636f.m10368j()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okhttp3.t r4 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r4 = r4.mo24573m()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.util.List r5 = r0.mo24342f()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.mo25937g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okhttp3.r r4 = okhttp3.C3543r.m9794b(r3)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            javax.net.ssl.HostnameVerifier r5 = r0.mo24340e()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okhttp3.t r6 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r6 = r6.mo24573m()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            if (r3 == 0) goto L_0x00ac
            okhttp3.g r3 = r0.mo24336a()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okhttp3.t r0 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = r0.mo24573m()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.util.List r5 = r4.mo24540e()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.mo24433a(r0, r5)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            boolean r8 = r8.mo24494f()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            if (r8 == 0) goto L_0x007f
            r5.f r8 = p092r5.C3636f.m10368j()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r2 = r8.mo25940m(r1)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
        L_0x007f:
            r7.f5717e = r1     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okio.r r8 = okio.C9845l.m23747m(r1)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okio.e r8 = okio.C9845l.m23738d(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r7.f5721i = r8     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.net.Socket r8 = r7.f5717e     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okio.q r8 = okio.C9845l.m23743i(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okio.d r8 = okio.C9845l.m23737c(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r7.f5722j = r8     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r7.f5718f = r4     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            if (r2 == 0) goto L_0x00a0
            okhttp3.Protocol r8 = okhttp3.Protocol.get(r2)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            goto L_0x00a2
        L_0x00a0:
            okhttp3.Protocol r8 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
        L_0x00a2:
            r7.f5719g = r8     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r5.f r8 = p092r5.C3636f.m10368j()
            r8.mo25954a(r1)
            return
        L_0x00ac:
            java.util.List r8 = r4.mo24540e()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.<init>()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r4 = "Hostname "
            r3.append(r4)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            okhttp3.t r0 = r0.mo24349l()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = r0.mo24573m()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = okhttp3.C3523g.m9669c(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.util.List r8 = p213t5.C10399d.m26332a(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
            throw r2     // Catch:{ AssertionError -> 0x0101, all -> 0x00fe }
        L_0x00fe:
            r8 = move-exception
            r2 = r1
            goto L_0x0114
        L_0x0101:
            r8 = move-exception
            r2 = r1
            goto L_0x0107
        L_0x0104:
            r8 = move-exception
            goto L_0x0114
        L_0x0106:
            r8 = move-exception
        L_0x0107:
            boolean r0 = p056k5.C3300c.m8941z(r8)     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0113
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0104 }
            r0.<init>(r8)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0104 }
        L_0x0113:
            throw r8     // Catch:{ all -> 0x0104 }
        L_0x0114:
            if (r2 == 0) goto L_0x011d
            r5.f r0 = p092r5.C3636f.m10368j()
            r0.mo25954a(r2)
        L_0x011d:
            p056k5.C3300c.m8922g(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C3526a.m9678f(m5.b):void");
    }

    /* renamed from: g */
    private void m9679g(int i, int i2, int i3, C9796e eVar, C3537p pVar) {
        C3558z i4 = m9681i();
        C3546t i5 = i4.mo24660i();
        int i6 = 0;
        while (i6 < 21) {
            m9677e(i, i2, eVar, pVar);
            i4 = m9680h(i2, i3, i4, i5);
            if (i4 != null) {
                C3300c.m8922g(this.f5716d);
                this.f5716d = null;
                this.f5722j = null;
                this.f5721i = null;
                pVar.mo24517d(eVar, this.f5715c.mo24429d(), this.f5715c.mo24427b(), (Protocol) null);
                i6++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private C3558z m9680h(int i, int i2, C3558z zVar, C3546t tVar) {
        String str = "CONNECT " + C3300c.m8933r(tVar, true) + " HTTP/1.1";
        while (true) {
            C9780a aVar = new C9780a((C3552x) null, (C9554e) null, this.f5721i, this.f5722j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f5721i.mo24479j().mo39091g((long) i, timeUnit);
            this.f5722j.mo24475j().mo39091g((long) i2, timeUnit);
            aVar.mo38957o(zVar.mo24656e(), str);
            aVar.mo38892a();
            C3509b0 c = aVar.mo38896d(false).mo24386p(zVar).mo24375c();
            long b = C9732e.m23356b(c);
            if (b == -1) {
                b = 0;
            }
            C9853r k = aVar.mo38954k(b);
            C3300c.m8909C(k, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, timeUnit);
            k.close();
            int d = c.mo24359d();
            if (d != 200) {
                if (d == 407) {
                    C3558z a = this.f5715c.mo24426a().mo24344h().mo24354a(this.f5715c, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c.mo24361h("Connection"))) {
                        return a;
                    } else {
                        zVar = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.mo24359d());
                }
            } else if (this.f5721i.mo24724F().mo24734Q() && this.f5722j.mo24724F().mo24734Q()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: i */
    private C3558z m9681i() {
        C3558z b = new C3558z.C3559a().mo24669h(this.f5715c.mo24426a().mo24349l()).mo24666e("CONNECT", (C3505a0) null).mo24664c("Host", C3300c.m8933r(this.f5715c.mo24426a().mo24349l(), true)).mo24664c("Proxy-Connection", "Keep-Alive").mo24664c("User-Agent", C9297d.m22767a()).mo24663b();
        C3558z a = this.f5715c.mo24426a().mo24344h().mo24354a(this.f5715c, new C3509b0.C3510a().mo24386p(b).mo24384n(Protocol.HTTP_1_1).mo24377g(407).mo24381k("Preemptive Authenticate").mo24374b(C3300c.f5334c).mo24387q(-1).mo24385o(-1).mo24379i("Proxy-Authenticate", "OkHttp-Preemptive").mo24375c());
        return a != null ? a : b;
    }

    /* renamed from: j */
    private void m9682j(C9550b bVar, int i, C9796e eVar, C3537p pVar) {
        if (this.f5715c.mo24426a().mo24348k() == null) {
            List<Protocol> f = this.f5715c.mo24426a().mo24342f();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (f.contains(protocol)) {
                this.f5717e = this.f5716d;
                this.f5719g = protocol;
                m9683r(i);
                return;
            }
            this.f5717e = this.f5716d;
            this.f5719g = Protocol.HTTP_1_1;
            return;
        }
        pVar.mo24533u(eVar);
        m9678f(bVar);
        pVar.mo24532t(eVar, this.f5718f);
        if (this.f5719g == Protocol.HTTP_2) {
            m9683r(i);
        }
    }

    /* renamed from: r */
    private void m9683r(int i) {
        this.f5717e.setSoTimeout(0);
        C9808d a = new C9808d.C9815g(true).mo39033d(this.f5717e, this.f5715c.mo24426a().mo24349l().mo24573m(), this.f5721i, this.f5722j).mo39031b(this).mo39032c(i).mo39030a();
        this.f5720h = a;
        a.mo39012G();
    }

    /* renamed from: a */
    public void mo24443a(C9808d dVar) {
        synchronized (this.f5714b) {
            this.f5725m = dVar.mo39025m();
        }
    }

    /* renamed from: b */
    public void mo24444b(C3527f fVar) {
        fVar.mo24459f(ErrorCode.REFUSED_STREAM);
    }

    /* renamed from: c */
    public void mo24445c() {
        C3300c.m8922g(this.f5716d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24446d(int r17, int r18, int r19, int r20, boolean r21, okhttp3.C9796e r22, okhttp3.C3537p r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.Protocol r0 = r7.f5719g
            if (r0 != 0) goto L_0x0150
            okhttp3.d0 r0 = r7.f5715c
            okhttp3.a r0 = r0.mo24426a()
            java.util.List r0 = r0.mo24337b()
            m5.b r10 = new m5.b
            r10.<init>(r0)
            okhttp3.d0 r1 = r7.f5715c
            okhttp3.a r1 = r1.mo24426a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo24348k()
            if (r1 != 0) goto L_0x0074
            okhttp3.k r1 = okhttp3.C3533k.f5762h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            okhttp3.d0 r0 = r7.f5715c
            okhttp3.a r0 = r0.mo24426a()
            okhttp3.t r0 = r0.mo24349l()
            java.lang.String r0 = r0.mo24573m()
            r5.f r1 = p092r5.C3636f.m10368j()
            boolean r1 = r1.mo25942o(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            okhttp3.d0 r0 = r7.f5715c
            okhttp3.a r0 = r0.mo24426a()
            java.util.List r0 = r0.mo24342f()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            okhttp3.d0 r0 = r7.f5715c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo24428c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m9679g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f5716d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m9677e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m9682j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            okhttp3.d0 r0 = r7.f5715c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo24429d()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.d0 r1 = r7.f5715c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo24427b()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.Protocol r2 = r7.f5719g     // Catch:{ IOException -> 0x00f5 }
            r9.mo24517d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            okhttp3.d0 r0 = r7.f5715c
            boolean r0 = r0.mo24428c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f5716d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            okhttp3.internal.http2.d r0 = r7.f5720h
            if (r0 == 0) goto L_0x00f4
            okhttp3.j r1 = r7.f5714b
            monitor-enter(r1)
            okhttp3.internal.http2.d r0 = r7.f5720h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo39025m()     // Catch:{ all -> 0x00f1 }
            r7.f5725m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f5717e
            p056k5.C3300c.m8922g(r1)
            java.net.Socket r1 = r7.f5716d
            p056k5.C3300c.m8922g(r1)
            r7.f5717e = r11
            r7.f5716d = r11
            r7.f5721i = r11
            r7.f5722j = r11
            r7.f5718f = r11
            r7.f5719g = r11
            r7.f5720h = r11
            okhttp3.d0 r1 = r7.f5715c
            java.net.InetSocketAddress r3 = r1.mo24429d()
            okhttp3.d0 r1 = r7.f5715c
            java.net.Proxy r4 = r1.mo24427b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo24518e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.addConnectException(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.mo38511b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x0159
        L_0x0158:
            throw r0
        L_0x0159:
            goto L_0x0158
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C3526a.mo24446d(int, int, int, int, boolean, okhttp3.e, okhttp3.p):void");
    }

    /* renamed from: k */
    public C3543r mo24447k() {
        return this.f5718f;
    }

    /* renamed from: l */
    public boolean mo24448l(C3504a aVar, @Nullable C3522d0 d0Var) {
        if (this.f5726n.size() >= this.f5725m || this.f5723k || !C3299a.f5331a.mo23930g(this.f5715c.mo24426a(), aVar)) {
            return false;
        }
        if (aVar.mo24349l().mo24573m().equals(mo24452p().mo24426a().mo24349l().mo24573m())) {
            return true;
        }
        if (this.f5720h == null || d0Var == null || d0Var.mo24427b().type() != Proxy.Type.DIRECT || this.f5715c.mo24427b().type() != Proxy.Type.DIRECT || !this.f5715c.mo24429d().equals(d0Var.mo24429d()) || d0Var.mo24426a().mo24340e() != C10399d.f19463a || !mo24454s(aVar.mo24349l())) {
            return false;
        }
        try {
            aVar.mo24336a().mo24433a(aVar.mo24349l().mo24573m(), mo24447k().mo24540e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo24449m(boolean z) {
        int soTimeout;
        if (this.f5717e.isClosed() || this.f5717e.isInputShutdown() || this.f5717e.isOutputShutdown()) {
            return false;
        }
        C9808d dVar = this.f5720h;
        if (dVar != null) {
            return !dVar.mo39024l();
        }
        if (z) {
            try {
                soTimeout = this.f5717e.getSoTimeout();
                this.f5717e.setSoTimeout(1);
                if (this.f5721i.mo24734Q()) {
                    this.f5717e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f5717e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f5717e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo24450n() {
        return this.f5720h != null;
    }

    /* renamed from: o */
    public C9729c mo24451o(C3552x xVar, C9834u.C9835a aVar, C9554e eVar) {
        if (this.f5720h != null) {
            return new C10271a(xVar, aVar, eVar, this.f5720h);
        }
        this.f5717e.setSoTimeout(aVar.mo38902b());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f5721i.mo24479j().mo39091g((long) aVar.mo38902b(), timeUnit);
        this.f5722j.mo24475j().mo39091g((long) aVar.mo38903c(), timeUnit);
        return new C9780a(xVar, eVar, this.f5721i, this.f5722j);
    }

    /* renamed from: p */
    public C3522d0 mo24452p() {
        return this.f5715c;
    }

    /* renamed from: q */
    public Socket mo24453q() {
        return this.f5717e;
    }

    /* renamed from: s */
    public boolean mo24454s(C3546t tVar) {
        if (tVar.mo24579z() != this.f5715c.mo24426a().mo24349l().mo24579z()) {
            return false;
        }
        if (!tVar.mo24573m().equals(this.f5715c.mo24426a().mo24349l().mo24573m())) {
            return this.f5718f != null && C10399d.f19463a.mo42043c(tVar.mo24573m(), (X509Certificate) this.f5718f.mo24540e().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f5715c.mo24426a().mo24349l().mo24573m());
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f5715c.mo24426a().mo24349l().mo24579z());
        sb.append(", proxy=");
        sb.append(this.f5715c.mo24427b());
        sb.append(" hostAddress=");
        sb.append(this.f5715c.mo24429d());
        sb.append(" cipherSuite=");
        C3543r rVar = this.f5718f;
        sb.append(rVar != null ? rVar.mo24538a() : "none");
        sb.append(" protocol=");
        sb.append(this.f5719g);
        sb.append('}');
        return sb.toString();
    }
}
