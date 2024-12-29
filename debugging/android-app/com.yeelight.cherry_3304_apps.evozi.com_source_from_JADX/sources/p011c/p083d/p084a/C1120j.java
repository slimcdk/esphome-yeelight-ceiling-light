package p011c.p083d.p084a;

import androidx.appcompat.widget.ActivityChooserView;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C1133r;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p011c.p083d.p084a.p085d0.C1003a;
import p011c.p083d.p084a.p085d0.C1019i;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p086m.C1031d;
import p011c.p083d.p084a.p085d0.p087n.C1078d;
import p011c.p083d.p084a.p085d0.p087n.C1080f;
import p011c.p083d.p084a.p085d0.p087n.C1090h;
import p011c.p083d.p084a.p085d0.p087n.C1095j;
import p011c.p083d.p084a.p085d0.p087n.C1096k;
import p011c.p083d.p084a.p085d0.p087n.C1102p;
import p011c.p083d.p084a.p085d0.p087n.C1105s;
import p163g.C4416t;

/* renamed from: c.d.a.j */
public final class C1120j {

    /* renamed from: a */
    private final C1121k f1760a;

    /* renamed from: b */
    private final C0991b0 f1761b;

    /* renamed from: c */
    private Socket f1762c;

    /* renamed from: d */
    private boolean f1763d = false;

    /* renamed from: e */
    private C1080f f1764e;

    /* renamed from: f */
    private C1031d f1765f;

    /* renamed from: g */
    private C1143w f1766g = C1143w.HTTP_1_1;

    /* renamed from: h */
    private long f1767h;

    /* renamed from: i */
    private C1129p f1768i;

    /* renamed from: j */
    private int f1769j;

    /* renamed from: k */
    private Object f1770k;

    public C1120j(C1121k kVar, C0991b0 b0Var) {
        this.f1760a = kVar;
        this.f1761b = b0Var;
    }

    /* renamed from: e */
    private void m2635e(int i, int i2, int i3, C1144x xVar, C1003a aVar) {
        this.f1762c.setSoTimeout(i2);
        C1019i.m2068f().mo9475d(this.f1762c, this.f1761b.mo9396c(), i);
        if (this.f1761b.f1218a.mo9381i() != null) {
            m2636f(i2, i3, xVar, aVar);
        }
        C1143w wVar = this.f1766g;
        if (wVar == C1143w.SPDY_3 || wVar == C1143w.HTTP_2) {
            this.f1762c.setSoTimeout(0);
            C1031d.C1039h hVar = new C1031d.C1039h(this.f1761b.f1218a.f1204b, true, this.f1762c);
            hVar.mo9526h(this.f1766g);
            C1031d g = hVar.mo9525g();
            this.f1765f = g;
            g.mo9520o0();
            return;
        }
        this.f1764e = new C1080f(this.f1760a, this, this.f1762c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f5 A[Catch:{ all -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fb A[Catch:{ all -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2636f(int r5, int r6, p011c.p083d.p084a.C1144x r7, p011c.p083d.p084a.p085d0.C1003a r8) {
        /*
            r4 = this;
            c.d.a.b0 r0 = r4.f1761b
            boolean r0 = r0.mo9397d()
            if (r0 == 0) goto L_0x000b
            r4.m2637g(r5, r6, r7)
        L_0x000b:
            c.d.a.b0 r5 = r4.f1761b
            c.d.a.a r5 = r5.mo9394a()
            javax.net.ssl.SSLSocketFactory r6 = r5.mo9381i()
            r7 = 0
            java.net.Socket r0 = r4.f1762c     // Catch:{ AssertionError -> 0x00ee }
            java.lang.String r1 = r5.mo9382j()     // Catch:{ AssertionError -> 0x00ee }
            int r2 = r5.mo9383k()     // Catch:{ AssertionError -> 0x00ee }
            r3 = 1
            java.net.Socket r6 = r6.createSocket(r0, r1, r2, r3)     // Catch:{ AssertionError -> 0x00ee }
            javax.net.ssl.SSLSocket r6 = (javax.net.ssl.SSLSocket) r6     // Catch:{ AssertionError -> 0x00ee }
            c.d.a.l r8 = r8.mo9429a(r6)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            boolean r0 = r8.mo9721i()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            if (r0 == 0) goto L_0x0040
            c.d.a.d0.i r0 = p011c.p083d.p084a.p085d0.C1019i.m2068f()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r1 = r5.mo9382j()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.util.List r2 = r5.mo9375e()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.mo9474c(r6, r1, r2)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
        L_0x0040:
            r6.startHandshake()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            javax.net.ssl.SSLSession r0 = r6.getSession()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            c.d.a.p r0 = p011c.p083d.p084a.C1129p.m2701c(r0)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            javax.net.ssl.HostnameVerifier r1 = r5.mo9374d()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r2 = r5.mo9382j()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            javax.net.ssl.SSLSession r3 = r6.getSession()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            boolean r1 = r1.verify(r2, r3)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            if (r1 == 0) goto L_0x0093
            c.d.a.g r1 = r5.mo9372b()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = r5.mo9382j()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.util.List r2 = r0.mo9741e()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r1.mo9681a(r5, r2)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            boolean r5 = r8.mo9721i()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            if (r5 == 0) goto L_0x007a
            c.d.a.d0.i r5 = p011c.p083d.p084a.p085d0.C1019i.m2068f()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r7 = r5.mo9477h(r6)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
        L_0x007a:
            if (r7 == 0) goto L_0x0081
            c.d.a.w r5 = p011c.p083d.p084a.C1143w.m2844a(r7)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            goto L_0x0083
        L_0x0081:
            c.d.a.w r5 = p011c.p083d.p084a.C1143w.HTTP_1_1     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
        L_0x0083:
            r4.f1766g = r5     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r4.f1768i = r0     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r4.f1762c = r6     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            if (r6 == 0) goto L_0x0092
            c.d.a.d0.i r5 = p011c.p083d.p084a.p085d0.C1019i.m2068f()
            r5.mo9473a(r6)
        L_0x0092:
            return
        L_0x0093:
            java.util.List r7 = r0.mo9741e()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.<init>()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r1 = "Hostname "
            r0.append(r1)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = r5.mo9382j()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = " not verified:"
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = "\n    certificate: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = p011c.p083d.p084a.C1115g.m2626c(r7)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = "\n    DN: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.security.Principal r5 = r7.getSubjectDN()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = r5.getName()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = "\n    subjectAltNames: "
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.util.List r5 = p011c.p083d.p084a.p085d0.p089p.C1109b.m2601a(r7)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r0.append(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = r0.toString()     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            r8.<init>(r5)     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
            throw r8     // Catch:{ AssertionError -> 0x00e9, all -> 0x00e6 }
        L_0x00e6:
            r5 = move-exception
            r7 = r6
            goto L_0x00fc
        L_0x00e9:
            r5 = move-exception
            r7 = r6
            goto L_0x00ef
        L_0x00ec:
            r5 = move-exception
            goto L_0x00fc
        L_0x00ee:
            r5 = move-exception
        L_0x00ef:
            boolean r6 = p011c.p083d.p084a.p085d0.C1024k.m2102m(r5)     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00fb
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00ec }
            r6.<init>(r5)     // Catch:{ all -> 0x00ec }
            throw r6     // Catch:{ all -> 0x00ec }
        L_0x00fb:
            throw r5     // Catch:{ all -> 0x00ec }
        L_0x00fc:
            if (r7 == 0) goto L_0x0105
            c.d.a.d0.i r6 = p011c.p083d.p084a.p085d0.C1019i.m2068f()
            r6.mo9473a(r7)
        L_0x0105:
            p011c.p083d.p084a.p085d0.C1024k.m2093d(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1120j.m2636f(int, int, c.d.a.x, c.d.a.d0.a):void");
    }

    /* renamed from: g */
    private void m2637g(int i, int i2, C1144x xVar) {
        C1144x h = m2638h(xVar);
        C1080f fVar = new C1080f(this.f1760a, this, this.f1762c);
        fVar.mo9621y(i, i2);
        C1133r k = h.mo9838k();
        String str = "CONNECT " + k.mo9772q() + Constants.COLON_SEPARATOR + k.mo9758A() + " HTTP/1.1";
        do {
            fVar.mo9622z(h.mo9836i(), str);
            fVar.mo9610n();
            C1150z.C1152b x = fVar.mo9620x();
            x.mo9885y(h);
            C1150z m = x.mo9875m();
            long e = C1096k.m2525e(m);
            if (e == -1) {
                e = 0;
            }
            C4416t t = fVar.mo9616t(e);
            C1024k.m2105p(t, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
            t.close();
            int o = m.mo9861o();
            if (o != 200) {
                if (o == 407) {
                    h = C1096k.m2530j(this.f1761b.mo9394a().mo9371a(), m, this.f1761b.mo9395b());
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + m.mo9861o());
                }
            } else if (fVar.mo9607j() > 0) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (h != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* renamed from: h */
    private C1144x m2638h(C1144x xVar) {
        C1133r.C1135b bVar = new C1133r.C1135b();
        bVar.mo9785u("https");
        bVar.mo9781j(xVar.mo9838k().mo9772q());
        bVar.mo9783q(xVar.mo9838k().mo9758A());
        C1133r c = bVar.mo9778c();
        C1144x.C1146b bVar2 = new C1144x.C1146b();
        bVar2.mo9855n(c);
        bVar2.mo9850i("Host", C1024k.m2096g(c));
        bVar2.mo9850i("Proxy-Connection", "Keep-Alive");
        String h = xVar.mo9835h("User-Agent");
        if (h != null) {
            bVar2.mo9850i("User-Agent", h);
        }
        String h2 = xVar.mo9835h("Proxy-Authorization");
        if (h2 != null) {
            bVar2.mo9850i("Proxy-Authorization", h2);
        }
        return bVar2.mo9848g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9689a() {
        synchronized (this.f1760a) {
            if (this.f1770k == null) {
                return false;
            }
            this.f1770k = null;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r3 = r2.f1762c;
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
    public void mo9690b(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.mo9701q()
            if (r0 != 0) goto L_0x001e
            c.d.a.k r0 = r2.f1760a
            monitor-enter(r0)
            java.lang.Object r1 = r2.f1770k     // Catch:{ all -> 0x001b }
            if (r1 == r3) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            r3 = 0
            r2.f1770k = r3     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.net.Socket r3 = r2.f1762c
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1120j.mo9690b(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9691c(int i, int i2, int i3, C1144x xVar, List<C1123l> list, boolean z) {
        Socket socket;
        List<C1123l> list2 = list;
        if (!this.f1763d) {
            C1003a aVar = new C1003a(list2);
            Proxy b = this.f1761b.mo9395b();
            C0987a a = this.f1761b.mo9394a();
            if (this.f1761b.f1218a.mo9381i() != null || list2.contains(C1123l.f1781h)) {
                C1102p pVar = null;
                while (!this.f1763d) {
                    try {
                        if (b.type() != Proxy.Type.DIRECT) {
                            if (b.type() != Proxy.Type.HTTP) {
                                socket = new Socket(b);
                                this.f1762c = socket;
                                m2635e(i, i2, i3, xVar, aVar);
                                this.f1763d = true;
                            }
                        }
                        socket = a.mo9379h().createSocket();
                        this.f1762c = socket;
                        m2635e(i, i2, i3, xVar, aVar);
                        this.f1763d = true;
                    } catch (IOException e) {
                        C1024k.m2093d(this.f1762c);
                        this.f1762c = null;
                        if (pVar == null) {
                            pVar = new C1102p(e);
                        } else {
                            pVar.mo9652a(e);
                        }
                        if (!z || !aVar.mo9430b(e)) {
                            throw pVar;
                        }
                    }
                }
                return;
            }
            throw new C1102p(new UnknownServiceException("CLEARTEXT communication not supported: " + list2));
        }
        throw new IllegalStateException("already connected");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9692d(C1141v vVar, Object obj, C1144x xVar) {
        mo9708w(obj);
        if (!mo9700p()) {
            C1144x xVar2 = xVar;
            mo9691c(vVar.mo9817j(), vVar.mo9828w(), vVar.mo9799A(), xVar2, this.f1761b.f1218a.mo9373c(), vVar.mo9829x());
            if (mo9701q()) {
                vVar.mo9818k().mo9714h(this);
            }
            vVar.mo9804G().mo9482a(mo9696l());
        }
        mo9710y(vVar.mo9828w(), vVar.mo9799A());
    }

    /* renamed from: i */
    public C1129p mo9693i() {
        return this.f1768i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo9694j() {
        C1031d dVar = this.f1765f;
        return dVar == null ? this.f1767h : dVar.mo9512W();
    }

    /* renamed from: k */
    public C1143w mo9695k() {
        return this.f1766g;
    }

    /* renamed from: l */
    public C0991b0 mo9696l() {
        return this.f1761b;
    }

    /* renamed from: m */
    public Socket mo9697m() {
        return this.f1762c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo9698n() {
        this.f1769j++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo9699o() {
        return !this.f1762c.isClosed() && !this.f1762c.isInputShutdown() && !this.f1762c.isOutputShutdown();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo9700p() {
        return this.f1763d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo9701q() {
        return this.f1765f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo9702r() {
        C1031d dVar = this.f1765f;
        return dVar == null || dVar.mo9515a0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo9703s() {
        C1080f fVar = this.f1764e;
        if (fVar != null) {
            return fVar.mo9612p();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1105s mo9704t(C1090h hVar) {
        return this.f1765f != null ? new C1078d(hVar, this.f1765f) : new C1095j(hVar, this.f1764e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f1761b.f1218a.f1204b);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(this.f1761b.f1218a.f1205c);
        sb.append(", proxy=");
        sb.append(this.f1761b.f1219b);
        sb.append(" hostAddress=");
        sb.append(this.f1761b.f1220c.getAddress().getHostAddress());
        sb.append(" cipherSuite=");
        C1129p pVar = this.f1768i;
        sb.append(pVar != null ? pVar.mo9739a() : "none");
        sb.append(" protocol=");
        sb.append(this.f1766g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo9706u() {
        return this.f1769j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9707v() {
        if (this.f1765f == null) {
            this.f1767h = System.nanoTime();
            return;
        }
        throw new IllegalStateException("framedConnection != null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo9708w(Object obj) {
        if (!mo9701q()) {
            synchronized (this.f1760a) {
                if (this.f1770k == null) {
                    this.f1770k = obj;
                } else {
                    throw new IllegalStateException("Connection already has an owner!");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo9709x(C1143w wVar) {
        if (wVar != null) {
            this.f1766g = wVar;
            return;
        }
        throw new IllegalArgumentException("protocol == null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9710y(int i, int i2) {
        if (!this.f1763d) {
            throw new IllegalStateException("setTimeouts - not connected");
        } else if (this.f1764e != null) {
            try {
                this.f1762c.setSoTimeout(i);
                this.f1764e.mo9621y(i, i2);
            } catch (IOException e) {
                throw new C1102p(e);
            }
        }
    }
}
