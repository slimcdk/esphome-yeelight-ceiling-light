package p156f.p157g0.p159f;

import androidx.appcompat.widget.ActivityChooserView;
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
import p156f.C10833u;
import p156f.C10835y;
import p156f.C4317a;
import p156f.C4318a0;
import p156f.C4322b0;
import p156f.C4332c0;
import p156f.C4338e;
import p156f.C4340e0;
import p156f.C4374i;
import p156f.C4375j;
import p156f.C4381p;
import p156f.C4387r;
import p156f.C4390t;
import p156f.C4396x;
import p156f.p157g0.C10751d;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p160g.C10768c;
import p156f.p157g0.p160g.C10771e;
import p156f.p157g0.p161i.C10786b;
import p156f.p157g0.p161i.C10793f;
import p156f.p157g0.p161i.C10795g;
import p156f.p157g0.p161i.C4361i;
import p156f.p157g0.p162k.C4373f;
import p156f.p157g0.p207h.C10777a;
import p156f.p157g0.p210m.C10825d;
import p163g.C10843m;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4416t;

/* renamed from: f.g0.f.c */
public final class C4357c extends C10795g.C4359h implements C4374i {

    /* renamed from: b */
    private final C4375j f7713b;

    /* renamed from: c */
    private final C4340e0 f7714c;

    /* renamed from: d */
    private Socket f7715d;

    /* renamed from: e */
    private Socket f7716e;

    /* renamed from: f */
    private C4387r f7717f;

    /* renamed from: g */
    private C10835y f7718g;

    /* renamed from: h */
    private C10795g f7719h;

    /* renamed from: i */
    private C4410e f7720i;

    /* renamed from: j */
    private C4409d f7721j;

    /* renamed from: k */
    public boolean f7722k;

    /* renamed from: l */
    public int f7723l;

    /* renamed from: m */
    public int f7724m = 1;

    /* renamed from: n */
    public final List<Reference<C10763g>> f7725n = new ArrayList();

    /* renamed from: o */
    public long f7726o = Long.MAX_VALUE;

    public C4357c(C4375j jVar, C4340e0 e0Var) {
        this.f7713b = jVar;
        this.f7714c = e0Var;
    }

    /* renamed from: e */
    private void m12418e(int i, int i2, C4338e eVar, C4381p pVar) {
        Proxy b = this.f7714c.mo23909b();
        this.f7715d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.f7714c.mo23908a().mo23803j().createSocket() : new Socket(b);
        pVar.mo24060f(eVar, this.f7714c.mo23911d(), b);
        this.f7715d.setSoTimeout(i2);
        try {
            C4373f.m12509j().mo24002h(this.f7715d, this.f7714c.mo23911d(), i);
            try {
                this.f7720i = C10843m.m27009d(C10843m.m27018m(this.f7715d));
                this.f7721j = C10843m.m27008c(C10843m.m27014i(this.f7715d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f7714c.mo23911d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010f A[Catch:{ all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115 A[Catch:{ all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12419f(p156f.p157g0.p159f.C10758b r8) {
        /*
            r7 = this;
            f.e0 r0 = r7.f7714c
            f.a r0 = r0.mo23908a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo23804k()
            r2 = 0
            java.net.Socket r3 = r7.f7715d     // Catch:{ AssertionError -> 0x0108 }
            f.t r4 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0108 }
            java.lang.String r4 = r4.mo24114m()     // Catch:{ AssertionError -> 0x0108 }
            f.t r5 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0108 }
            int r5 = r5.mo24120z()     // Catch:{ AssertionError -> 0x0108 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0108 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0108 }
            f.k r8 = r8.mo33987a(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r3 = r8.mo24033f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r3 == 0) goto L_0x0041
            f.g0.k.f r3 = p156f.p157g0.p162k.C4373f.m12509j()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            f.t r4 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r4 = r4.mo24114m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r5 = r0.mo23798f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.mo24001g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            f.r r4 = p156f.C4387r.m12593b(r3)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo23796e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            f.t r6 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r6 = r6.mo24114m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r3 == 0) goto L_0x00ae
            f.g r3 = r0.mo23792a()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            f.t r0 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.mo24114m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r5 = r4.mo24081e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.mo23915a(r0, r5)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            boolean r8 = r8.mo24033f()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r8 == 0) goto L_0x007f
            f.g0.k.f r8 = p156f.p157g0.p162k.C4373f.m12509j()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r2 = r8.mo24004m(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x007f:
            r7.f7716e = r1     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            g.t r8 = p163g.C10843m.m27018m(r1)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            g.e r8 = p163g.C10843m.m27009d(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f7720i = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.net.Socket r8 = r7.f7716e     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            g.s r8 = p163g.C10843m.m27014i(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            g.d r8 = p163g.C10843m.m27008c(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f7721j = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r7.f7717f = r4     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r2 == 0) goto L_0x00a0
            f.y r8 = p156f.C10835y.m26973a(r2)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            goto L_0x00a2
        L_0x00a0:
            f.y r8 = p156f.C10835y.HTTP_1_1     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x00a2:
            r7.f7718g = r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            if (r1 == 0) goto L_0x00ad
            f.g0.k.f r8 = p156f.p157g0.p162k.C4373f.m12509j()
            r8.mo24018a(r1)
        L_0x00ad:
            return
        L_0x00ae:
            java.util.List r8 = r4.mo24081e()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.<init>()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r4 = "Hostname "
            r3.append(r4)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            f.t r0 = r0.mo23805l()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.mo24114m()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = p156f.C4341g.m12325c(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.util.List r8 = p156f.p157g0.p210m.C10825d.m26948a(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
            throw r2     // Catch:{ AssertionError -> 0x0103, all -> 0x0100 }
        L_0x0100:
            r8 = move-exception
            r2 = r1
            goto L_0x0116
        L_0x0103:
            r8 = move-exception
            r2 = r1
            goto L_0x0109
        L_0x0106:
            r8 = move-exception
            goto L_0x0116
        L_0x0108:
            r8 = move-exception
        L_0x0109:
            boolean r0 = p156f.p157g0.C4345c.m12344A(r8)     // Catch:{ all -> 0x0106 }
            if (r0 == 0) goto L_0x0115
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0106 }
            r0.<init>(r8)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0115:
            throw r8     // Catch:{ all -> 0x0106 }
        L_0x0116:
            if (r2 == 0) goto L_0x011f
            f.g0.k.f r0 = p156f.p157g0.p162k.C4373f.m12509j()
            r0.mo24018a(r2)
        L_0x011f:
            p156f.p157g0.C4345c.m12361h(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p159f.C4357c.m12419f(f.g0.f.b):void");
    }

    /* renamed from: g */
    private void m12420g(int i, int i2, int i3, C4338e eVar, C4381p pVar) {
        C4318a0 i4 = m12422i();
        C4390t i5 = i4.mo23815i();
        int i6 = 0;
        while (i6 < 21) {
            m12418e(i, i2, eVar, pVar);
            i4 = m12421h(i2, i3, i4, i5);
            if (i4 != null) {
                C4345c.m12361h(this.f7715d);
                this.f7715d = null;
                this.f7721j = null;
                this.f7720i = null;
                pVar.mo24058d(eVar, this.f7714c.mo23911d(), this.f7714c.mo23909b(), (C10835y) null);
                i6++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private C4318a0 m12421h(int i, int i2, C4318a0 a0Var, C4390t tVar) {
        String str = "CONNECT " + C4345c.m12372s(tVar, true) + " HTTP/1.1";
        while (true) {
            C10777a aVar = new C10777a((C4396x) null, (C10763g) null, this.f7720i, this.f7721j);
            this.f7720i.mo9542f().mo24317g((long) i, TimeUnit.MILLISECONDS);
            this.f7721j.mo9440f().mo24317g((long) i2, TimeUnit.MILLISECONDS);
            aVar.mo34045o(a0Var.mo23811e(), str);
            aVar.mo34014a();
            C4332c0.C4333a d = aVar.mo34018d(false);
            d.mo23883p(a0Var);
            C4332c0 c = d.mo23872c();
            long b = C10771e.m26686b(c);
            if (b == -1) {
                b = 0;
            }
            C4416t k = aVar.mo34042k(b);
            C4345c.m12347D(k, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
            k.close();
            int g = c.mo23860g();
            if (g != 200) {
                if (g == 407) {
                    C4318a0 a = this.f7714c.mo23908a().mo23800h().mo23826a(this.f7714c, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c.mo23862i("Connection"))) {
                        return a;
                    } else {
                        a0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.mo23860g());
                }
            } else if (this.f7720i.mo24208H().mo24274x() && this.f7721j.mo24208H().mo24274x()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: i */
    private C4318a0 m12422i() {
        C4318a0.C4319a aVar = new C4318a0.C4319a();
        aVar.mo23825i(this.f7714c.mo23908a().mo23805l());
        aVar.mo23822f("CONNECT", (C4322b0) null);
        aVar.mo23820d("Host", C4345c.m12372s(this.f7714c.mo23908a().mo23805l(), true));
        aVar.mo23820d("Proxy-Connection", "Keep-Alive");
        aVar.mo23820d("User-Agent", C10751d.m26614a());
        C4318a0 b = aVar.mo23818b();
        C4332c0.C4333a aVar2 = new C4332c0.C4333a();
        aVar2.mo23883p(b);
        aVar2.mo23881n(C10835y.HTTP_1_1);
        aVar2.mo23874g(407);
        aVar2.mo23878k("Preemptive Authenticate");
        aVar2.mo23871b(C4345c.f7642c);
        aVar2.mo23884q(-1);
        aVar2.mo23882o(-1);
        aVar2.mo23876i("Proxy-Authenticate", "OkHttp-Preemptive");
        C4318a0 a = this.f7714c.mo23908a().mo23800h().mo23826a(this.f7714c, aVar2.mo23872c());
        return a != null ? a : b;
    }

    /* renamed from: j */
    private void m12423j(C10758b bVar, int i, C4338e eVar, C4381p pVar) {
        if (this.f7714c.mo23908a().mo23804k() != null) {
            pVar.mo24074u(eVar);
            m12419f(bVar);
            pVar.mo24073t(eVar, this.f7717f);
            if (this.f7718g == C10835y.HTTP_2) {
                m12424r(i);
            }
        } else if (this.f7714c.mo23908a().mo23798f().contains(C10835y.H2_PRIOR_KNOWLEDGE)) {
            this.f7716e = this.f7715d;
            this.f7718g = C10835y.H2_PRIOR_KNOWLEDGE;
            m12424r(i);
        } else {
            this.f7716e = this.f7715d;
            this.f7718g = C10835y.HTTP_1_1;
        }
    }

    /* renamed from: r */
    private void m12424r(int i) {
        this.f7716e.setSoTimeout(0);
        C10795g.C10802g gVar = new C10795g.C10802g(true);
        gVar.mo34084d(this.f7716e, this.f7714c.mo23908a().mo23805l().mo24114m(), this.f7720i, this.f7721j);
        gVar.mo34082b(this);
        gVar.mo34083c(i);
        C10795g a = gVar.mo34081a();
        this.f7719h = a;
        a.mo34066Q();
    }

    /* renamed from: a */
    public void mo23966a(C10795g gVar) {
        synchronized (this.f7713b) {
            this.f7724m = gVar.mo34079s();
        }
    }

    /* renamed from: b */
    public void mo23967b(C4361i iVar) {
        iVar.mo23982f(C10786b.REFUSED_STREAM);
    }

    /* renamed from: c */
    public void mo23968c() {
        C4345c.m12361h(this.f7715d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23969d(int r17, int r18, int r19, int r20, boolean r21, p156f.C4338e r22, p156f.C4381p r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            f.y r0 = r7.f7718g
            if (r0 != 0) goto L_0x0150
            f.e0 r0 = r7.f7714c
            f.a r0 = r0.mo23908a()
            java.util.List r0 = r0.mo23793b()
            f.g0.f.b r10 = new f.g0.f.b
            r10.<init>(r0)
            f.e0 r1 = r7.f7714c
            f.a r1 = r1.mo23908a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo23804k()
            if (r1 != 0) goto L_0x0074
            f.k r1 = p156f.C4377k.f7789h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            f.e0 r0 = r7.f7714c
            f.a r0 = r0.mo23908a()
            f.t r0 = r0.mo23805l()
            java.lang.String r0 = r0.mo24114m()
            f.g0.k.f r1 = p156f.p157g0.p162k.C4373f.m12509j()
            boolean r1 = r1.mo24006o(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            f.g0.f.e r1 = new f.g0.f.e
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
            f.g0.f.e r0 = new f.g0.f.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            f.e0 r0 = r7.f7714c
            f.a r0 = r0.mo23908a()
            java.util.List r0 = r0.mo23798f()
            f.y r1 = p156f.C10835y.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            f.e0 r0 = r7.f7714c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo23910c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m12420g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f7715d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m12418e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m12423j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            f.e0 r0 = r7.f7714c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo23911d()     // Catch:{ IOException -> 0x00f5 }
            f.e0 r1 = r7.f7714c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo23909b()     // Catch:{ IOException -> 0x00f5 }
            f.y r2 = r7.f7718g     // Catch:{ IOException -> 0x00f5 }
            r9.mo24058d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            f.e0 r0 = r7.f7714c
            boolean r0 = r0.mo23910c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f7715d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            f.g0.f.e r1 = new f.g0.f.e
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            f.g0.i.g r0 = r7.f7719h
            if (r0 == 0) goto L_0x00f4
            f.j r1 = r7.f7713b
            monitor-enter(r1)
            f.g0.i.g r0 = r7.f7719h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo34079s()     // Catch:{ all -> 0x00f1 }
            r7.f7724m = r0     // Catch:{ all -> 0x00f1 }
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
            java.net.Socket r1 = r7.f7716e
            p156f.p157g0.C4345c.m12361h(r1)
            java.net.Socket r1 = r7.f7715d
            p156f.p157g0.C4345c.m12361h(r1)
            r7.f7716e = r11
            r7.f7715d = r11
            r7.f7720i = r11
            r7.f7721j = r11
            r7.f7717f = r11
            r7.f7718g = r11
            r7.f7719h = r11
            f.e0 r1 = r7.f7714c
            java.net.InetSocketAddress r3 = r1.mo23911d()
            f.e0 r1 = r7.f7714c
            java.net.Proxy r4 = r1.mo23909b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo24059e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            f.g0.f.e r12 = new f.g0.f.e
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.mo33992a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.mo33988b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            f.g0.f.e r0 = new f.g0.f.e
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
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p159f.C4357c.mo23969d(int, int, int, int, boolean, f.e, f.p):void");
    }

    /* renamed from: k */
    public C4387r mo23970k() {
        return this.f7717f;
    }

    /* renamed from: l */
    public boolean mo23971l(C4317a aVar, @Nullable C4340e0 e0Var) {
        if (this.f7725n.size() >= this.f7724m || this.f7722k || !C4344a.f7639a.mo23931g(this.f7714c.mo23908a(), aVar)) {
            return false;
        }
        if (aVar.mo23805l().mo24114m().equals(mo23975p().mo23908a().mo23805l().mo24114m())) {
            return true;
        }
        if (this.f7719h == null || e0Var == null || e0Var.mo23909b().type() != Proxy.Type.DIRECT || this.f7714c.mo23909b().type() != Proxy.Type.DIRECT || !this.f7714c.mo23911d().equals(e0Var.mo23911d()) || e0Var.mo23908a().mo23796e() != C10825d.f20868a || !mo23977s(aVar.mo23805l())) {
            return false;
        }
        try {
            aVar.mo23792a().mo23915a(aVar.mo23805l().mo24114m(), mo23970k().mo24081e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo23972m(boolean z) {
        int soTimeout;
        if (this.f7716e.isClosed() || this.f7716e.isInputShutdown() || this.f7716e.isOutputShutdown()) {
            return false;
        }
        C10795g gVar = this.f7719h;
        if (gVar != null) {
            return !gVar.mo34078o();
        }
        if (z) {
            try {
                soTimeout = this.f7716e.getSoTimeout();
                this.f7716e.setSoTimeout(1);
                if (this.f7720i.mo24274x()) {
                    this.f7716e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f7716e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f7716e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo23973n() {
        return this.f7719h != null;
    }

    /* renamed from: o */
    public C10768c mo23974o(C4396x xVar, C10833u.C10834a aVar, C10763g gVar) {
        if (this.f7719h != null) {
            return new C10793f(xVar, aVar, gVar, this.f7719h);
        }
        this.f7716e.setSoTimeout(aVar.mo34024b());
        this.f7720i.mo9542f().mo24317g((long) aVar.mo34024b(), TimeUnit.MILLISECONDS);
        this.f7721j.mo9440f().mo24317g((long) aVar.mo34025c(), TimeUnit.MILLISECONDS);
        return new C10777a(xVar, gVar, this.f7720i, this.f7721j);
    }

    /* renamed from: p */
    public C4340e0 mo23975p() {
        return this.f7714c;
    }

    /* renamed from: q */
    public Socket mo23976q() {
        return this.f7716e;
    }

    /* renamed from: s */
    public boolean mo23977s(C4390t tVar) {
        if (tVar.mo24120z() != this.f7714c.mo23908a().mo23805l().mo24120z()) {
            return false;
        }
        if (!tVar.mo24114m().equals(this.f7714c.mo23908a().mo23805l().mo24114m())) {
            return this.f7717f != null && C10825d.f20868a.mo34150c(tVar.mo24114m(), (X509Certificate) this.f7717f.mo24081e().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f7714c.mo23908a().mo23805l().mo24114m());
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f7714c.mo23908a().mo23805l().mo24120z());
        sb.append(", proxy=");
        sb.append(this.f7714c.mo23909b());
        sb.append(" hostAddress=");
        sb.append(this.f7714c.mo23911d());
        sb.append(" cipherSuite=");
        C4387r rVar = this.f7717f;
        sb.append(rVar != null ? rVar.mo24079a() : "none");
        sb.append(" protocol=");
        sb.append(this.f7718g);
        sb.append('}');
        return sb.toString();
    }
}
