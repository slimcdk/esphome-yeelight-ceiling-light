package com.squareup.okhttp;

import androidx.appcompat.widget.ActivityChooserView;
import com.squareup.okhttp.C4302q;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.internal.http.RouteException;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okio.C9853r;
import p123a3.C3937d;
import p123a3.C3939f;
import p123a3.C3949h;
import p123a3.C3954j;
import p123a3.C3955k;
import p123a3.C3962q;
import p231y2.C12012a;
import p231y2.C12028i;
import p231y2.C12033k;
import p236z2.C12100c;

/* renamed from: com.squareup.okhttp.i */
public final class C4289i {

    /* renamed from: a */
    private final C4290j f6955a;

    /* renamed from: b */
    private final C4323z f6956b;

    /* renamed from: c */
    private Socket f6957c;

    /* renamed from: d */
    private boolean f6958d = false;

    /* renamed from: e */
    private C3939f f6959e;

    /* renamed from: f */
    private C12100c f6960f;

    /* renamed from: g */
    private Protocol f6961g = Protocol.HTTP_1_1;

    /* renamed from: h */
    private long f6962h;

    /* renamed from: i */
    private C4298o f6963i;

    /* renamed from: j */
    private int f6964j;

    /* renamed from: k */
    private Object f6965k;

    public C4289i(C4290j jVar, C4323z zVar) {
        this.f6955a = jVar;
        this.f6956b = zVar;
    }

    /* renamed from: e */
    private void m11915e(int i, int i2, int i3, C4312v vVar, C12012a aVar) {
        this.f6957c.setSoTimeout(i2);
        C12028i.m31019f().mo42651d(this.f6957c, this.f6956b.mo28092c(), i);
        if (this.f6956b.f7106a.mo27822i() != null) {
            m11916f(i2, i3, vVar, aVar);
        }
        Protocol protocol = this.f6961g;
        if (protocol == Protocol.SPDY_3 || protocol == Protocol.HTTP_2) {
            this.f6957c.setSoTimeout(0);
            C12100c g = new C12100c.C12108h(this.f6956b.f7106a.f6880b, true, this.f6957c).mo42853h(this.f6961g).mo42852g();
            this.f6960f = g;
            g.mo42848r0();
            return;
        }
        this.f6959e = new C3939f(this.f6955a, this, this.f6957c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f3 A[Catch:{ all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f9 A[Catch:{ all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11916f(int r5, int r6, com.squareup.okhttp.C4312v r7, p231y2.C12012a r8) {
        /*
            r4 = this;
            com.squareup.okhttp.z r0 = r4.f6956b
            boolean r0 = r0.mo28093d()
            if (r0 == 0) goto L_0x000b
            r4.m11917g(r5, r6, r7)
        L_0x000b:
            com.squareup.okhttp.z r5 = r4.f6956b
            com.squareup.okhttp.a r5 = r5.mo28090a()
            javax.net.ssl.SSLSocketFactory r6 = r5.mo27822i()
            r7 = 0
            java.net.Socket r0 = r4.f6957c     // Catch:{ AssertionError -> 0x00ec }
            java.lang.String r1 = r5.mo27823j()     // Catch:{ AssertionError -> 0x00ec }
            int r2 = r5.mo27824k()     // Catch:{ AssertionError -> 0x00ec }
            r3 = 1
            java.net.Socket r6 = r6.createSocket(r0, r1, r2, r3)     // Catch:{ AssertionError -> 0x00ec }
            javax.net.ssl.SSLSocket r6 = (javax.net.ssl.SSLSocket) r6     // Catch:{ AssertionError -> 0x00ec }
            com.squareup.okhttp.k r8 = r8.mo42623a(r6)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            boolean r0 = r8.mo27908i()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            if (r0 == 0) goto L_0x0040
            y2.i r0 = p231y2.C12028i.m31019f()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r1 = r5.mo27823j()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.util.List r2 = r5.mo27816e()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.mo42650c(r6, r1, r2)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
        L_0x0040:
            r6.startHandshake()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            javax.net.ssl.SSLSession r0 = r6.getSession()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            com.squareup.okhttp.o r0 = com.squareup.okhttp.C4298o.m11981c(r0)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            javax.net.ssl.HostnameVerifier r1 = r5.mo27815d()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r2 = r5.mo27823j()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            javax.net.ssl.SSLSession r3 = r6.getSession()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            boolean r1 = r1.verify(r2, r3)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            if (r1 == 0) goto L_0x0091
            com.squareup.okhttp.g r1 = r5.mo27813b()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = r5.mo27823j()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.util.List r2 = r0.mo27928e()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r1.mo27861a(r5, r2)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            boolean r5 = r8.mo27908i()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            if (r5 == 0) goto L_0x007a
            y2.i r5 = p231y2.C12028i.m31019f()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r7 = r5.mo42653h(r6)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
        L_0x007a:
            if (r7 == 0) goto L_0x0081
            com.squareup.okhttp.Protocol r5 = com.squareup.okhttp.Protocol.get(r7)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            goto L_0x0083
        L_0x0081:
            com.squareup.okhttp.Protocol r5 = com.squareup.okhttp.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
        L_0x0083:
            r4.f6961g = r5     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r4.f6963i = r0     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r4.f6957c = r6     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            y2.i r5 = p231y2.C12028i.m31019f()
            r5.mo42649a(r6)
            return
        L_0x0091:
            java.util.List r7 = r0.mo27928e()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.<init>()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r1 = "Hostname "
            r0.append(r1)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = r5.mo27823j()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = " not verified:"
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = "\n    certificate: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = com.squareup.okhttp.C4285g.m11907c(r7)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = "\n    DN: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.security.Principal r5 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = r5.getName()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = "\n    subjectAltNames: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.util.List r5 = p133c3.C4005b.m11631a(r7)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            java.lang.String r5 = r0.toString()     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            r8.<init>(r5)     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
            throw r8     // Catch:{ AssertionError -> 0x00e7, all -> 0x00e4 }
        L_0x00e4:
            r5 = move-exception
            r7 = r6
            goto L_0x00fa
        L_0x00e7:
            r5 = move-exception
            r7 = r6
            goto L_0x00ed
        L_0x00ea:
            r5 = move-exception
            goto L_0x00fa
        L_0x00ec:
            r5 = move-exception
        L_0x00ed:
            boolean r6 = p231y2.C12033k.m31053m(r5)     // Catch:{ all -> 0x00ea }
            if (r6 == 0) goto L_0x00f9
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00ea }
            r6.<init>(r5)     // Catch:{ all -> 0x00ea }
            throw r6     // Catch:{ all -> 0x00ea }
        L_0x00f9:
            throw r5     // Catch:{ all -> 0x00ea }
        L_0x00fa:
            if (r7 == 0) goto L_0x0103
            y2.i r6 = p231y2.C12028i.m31019f()
            r6.mo42649a(r7)
        L_0x0103:
            p231y2.C12033k.m31044d(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4289i.m11916f(int, int, com.squareup.okhttp.v, y2.a):void");
    }

    /* renamed from: g */
    private void m11917g(int i, int i2, C4312v vVar) {
        C4312v h = m11918h(vVar);
        C3939f fVar = new C3939f(this.f6955a, this, this.f6957c);
        fVar.mo26457y(i, i2);
        C4302q k = h.mo28037k();
        String str = "CONNECT " + k.mo27959q() + Constants.COLON_SEPARATOR + k.mo27945A() + " HTTP/1.1";
        do {
            fVar.mo26458z(h.mo28035i(), str);
            fVar.mo26446n();
            C4318x m = fVar.mo26456x().mo28084y(h).mo28074m();
            long e = C3955k.m11383e(m);
            if (e == -1) {
                e = 0;
            }
            C9853r t = fVar.mo26452t(e);
            C12033k.m31056p(t, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
            t.close();
            int o = m.mo28060o();
            if (o != 200) {
                if (o == 407) {
                    h = C3955k.m11388j(this.f6956b.mo28090a().mo27812a(), m, this.f6956b.mo28091b());
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + m.mo28060o());
                }
            } else if (fVar.mo26443j() > 0) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (h != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: h */
    private C4312v m11918h(C4312v vVar) {
        C4302q c = new C4302q.C4304b().mo27972u("https").mo27968j(vVar.mo28037k().mo27959q()).mo27970q(vVar.mo28037k().mo27945A()).mo27965c();
        C4312v.C4314b i = new C4312v.C4314b().mo28054n(c).mo28049i("Host", C12033k.m31047g(c)).mo28049i("Proxy-Connection", "Keep-Alive");
        String h = vVar.mo28034h("User-Agent");
        if (h != null) {
            i.mo28049i("User-Agent", h);
        }
        String h2 = vVar.mo28034h("Proxy-Authorization");
        if (h2 != null) {
            i.mo28049i("Proxy-Authorization", h2);
        }
        return i.mo28047g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo27869a() {
        synchronized (this.f6955a) {
            if (this.f6965k == null) {
                return false;
            }
            this.f6965k = null;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r3 = r2.f6957c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27870b(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.mo27881q()
            if (r0 != 0) goto L_0x001e
            com.squareup.okhttp.j r0 = r2.f6955a
            monitor-enter(r0)
            java.lang.Object r1 = r2.f6965k     // Catch:{ all -> 0x001b }
            if (r1 == r3) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            r3 = 0
            r2.f6965k = r3     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.net.Socket r3 = r2.f6957c
            if (r3 == 0) goto L_0x001a
            r3.close()
        L_0x001a:
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4289i.mo27870b(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27871c(int i, int i2, int i3, C4312v vVar, List<C4292k> list, boolean z) {
        Socket socket;
        List<C4292k> list2 = list;
        if (!this.f6958d) {
            C12012a aVar = new C12012a(list2);
            Proxy b = this.f6956b.mo28091b();
            C4268a a = this.f6956b.mo28090a();
            if (this.f6956b.f7106a.mo27822i() != null || list2.contains(C4292k.f6976h)) {
                RouteException routeException = null;
                while (!this.f6958d) {
                    try {
                        if (b.type() != Proxy.Type.DIRECT) {
                            if (b.type() != Proxy.Type.HTTP) {
                                socket = new Socket(b);
                                this.f6957c = socket;
                                m11915e(i, i2, i3, vVar, aVar);
                                this.f6958d = true;
                            }
                        }
                        socket = a.mo27820h().createSocket();
                        this.f6957c = socket;
                        m11915e(i, i2, i3, vVar, aVar);
                        this.f6958d = true;
                    } catch (IOException e) {
                        C12033k.m31044d(this.f6957c);
                        this.f6957c = null;
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.addConnectException(e);
                        }
                        if (!z || !aVar.mo42624b(e)) {
                            throw routeException;
                        }
                    }
                }
                return;
            }
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication not supported: " + list2));
        }
        throw new IllegalStateException("already connected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27872d(C4310u uVar, Object obj, C4312v vVar) {
        mo27888w(obj);
        if (!mo27880p()) {
            C4312v vVar2 = vVar;
            mo27871c(uVar.mo28004g(), uVar.mo28015w(), uVar.mo27986D(), vVar2, this.f6956b.f7106a.mo27814c(), uVar.mo28016x());
            if (mo27881q()) {
                uVar.mo28005h().mo27901h(this);
            }
            uVar.mo27991O().mo42658a(mo27876l());
        }
        mo27890y(uVar.mo28015w(), uVar.mo27986D());
    }

    /* renamed from: i */
    public C4298o mo27873i() {
        return this.f6963i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo27874j() {
        C12100c cVar = this.f6960f;
        return cVar == null ? this.f6962h : cVar.mo42840P();
    }

    /* renamed from: k */
    public Protocol mo27875k() {
        return this.f6961g;
    }

    /* renamed from: l */
    public C4323z mo27876l() {
        return this.f6956b;
    }

    /* renamed from: m */
    public Socket mo27877m() {
        return this.f6957c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27878n() {
        this.f6964j++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo27879o() {
        return !this.f6957c.isClosed() && !this.f6957c.isInputShutdown() && !this.f6957c.isOutputShutdown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo27880p() {
        return this.f6958d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo27881q() {
        return this.f6960f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo27882r() {
        C12100c cVar = this.f6960f;
        return cVar == null || cVar.mo42843W();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo27883s() {
        C3939f fVar = this.f6959e;
        if (fVar != null) {
            return fVar.mo26448p();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C3962q mo27884t(C3949h hVar) {
        return this.f6960f != null ? new C3937d(hVar, this.f6960f) : new C3954j(hVar, this.f6959e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f6956b.f7106a.f6880b);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f6956b.f7106a.f6881c);
        sb.append(", proxy=");
        sb.append(this.f6956b.f7107b);
        sb.append(" hostAddress=");
        sb.append(this.f6956b.f7108c.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        C4298o oVar = this.f6963i;
        sb.append(oVar != null ? oVar.mo27926a() : "none");
        sb.append(" protocol=");
        sb.append(this.f6961g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo27886u() {
        return this.f6964j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo27887v() {
        if (this.f6960f == null) {
            this.f6962h = System.nanoTime();
            return;
        }
        throw new IllegalStateException("framedConnection != null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo27888w(Object obj) {
        if (!mo27881q()) {
            synchronized (this.f6955a) {
                if (this.f6965k == null) {
                    this.f6965k = obj;
                } else {
                    throw new IllegalStateException("Connection already has an owner!");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo27889x(Protocol protocol) {
        if (protocol != null) {
            this.f6961g = protocol;
            return;
        }
        throw new IllegalArgumentException("protocol == null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo27890y(int i, int i2) {
        if (!this.f6958d) {
            throw new IllegalStateException("setTimeouts - not connected");
        } else if (this.f6959e != null) {
            try {
                this.f6957c.setSoTimeout(i);
                this.f6959e.mo26457y(i, i2);
            } catch (IOException e) {
                throw new RouteException(e);
            }
        }
    }
}
