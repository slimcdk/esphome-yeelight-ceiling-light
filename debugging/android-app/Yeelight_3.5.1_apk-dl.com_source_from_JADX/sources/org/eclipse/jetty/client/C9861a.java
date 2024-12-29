package org.eclipse.jetty.client;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9904i;
import org.eclipse.jetty.http.C9907j;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9910m;
import org.eclipse.jetty.http.C9915q;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.EofException;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p217u5.C10534a;
import p225w5.C11938b;
import p225w5.C11940d;
import p225w5.C11950k;
import p225w5.C11952m;

/* renamed from: org.eclipse.jetty.client.a */
public abstract class C9861a extends C11938b implements C8948d {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C9003c f17883o = C9001b.m21450a(C9861a.class);

    /* renamed from: d */
    protected HttpDestination f17884d;

    /* renamed from: e */
    protected C9904i f17885e;

    /* renamed from: f */
    protected C9910m f17886f;

    /* renamed from: g */
    protected boolean f17887g;

    /* renamed from: h */
    protected int f17888h;

    /* renamed from: i */
    protected C11940d f17889i;

    /* renamed from: j */
    protected boolean f17890j;

    /* renamed from: k */
    protected volatile C9877j f17891k;

    /* renamed from: l */
    protected C9877j f17892l;

    /* renamed from: m */
    private final C9128e.C9129a f17893m = new C9863b();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AtomicBoolean f17894n = new AtomicBoolean(false);

    /* renamed from: org.eclipse.jetty.client.a$b */
    private class C9863b extends C9128e.C9129a {
        private C9863b() {
        }

        /* renamed from: f */
        public void mo37217f() {
            if (C9861a.this.f17894n.compareAndSet(true, false)) {
                C9861a aVar = C9861a.this;
                aVar.f17884d.mo39509s(aVar);
            }
        }
    }

    /* renamed from: org.eclipse.jetty.client.a$c */
    private class C9864c extends C9910m.C9911a {
        private C9864c() {
        }

        /* renamed from: a */
        public void mo39532a(C11940d dVar) {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar != null) {
                jVar.mo39628k().mo39543e(dVar);
            }
        }

        /* renamed from: b */
        public void mo39533b() {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar != null && !jVar.mo39641w() && jVar.mo39616X(9)) {
                jVar.mo39628k().mo39547i(new EofException("early EOF"));
            }
        }

        /* renamed from: c */
        public void mo39534c() {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar != null) {
                jVar.mo39616X(6);
            }
        }

        /* renamed from: d */
        public void mo39535d(long j) {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar != null) {
                jVar.mo39616X(7);
            }
        }

        /* renamed from: e */
        public void mo39536e(C11940d dVar, C11940d dVar2) {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar != null) {
                if (C9908k.f18084d.mo42459f(dVar) == 1) {
                    C9861a.this.f17889i = C9907j.f18080d.mo42461h(dVar2);
                }
                jVar.mo39628k().mo39542d(dVar, dVar2);
            }
        }

        /* renamed from: f */
        public void mo39537f(C11940d dVar, C11940d dVar2, C11940d dVar3) {
        }

        /* renamed from: g */
        public void mo39538g(C11940d dVar, int i, C11940d dVar2) {
            C9877j jVar = C9861a.this.f17891k;
            if (jVar == null) {
                C9861a.f17883o.mo36847b("No exchange for response", new Object[0]);
                C9861a.this.f21821b.close();
                return;
            }
            if (i == 100 || i == 102) {
                jVar.mo39605M(new C9865d(jVar));
            } else if (i == 200 && "CONNECT".equalsIgnoreCase(jVar.mo39629l())) {
                C9861a.this.f17886f.mo39851q(true);
            }
            C9861a.this.f17887g = C9915q.f18142c.equals(dVar);
            C9861a.this.f17888h = i;
            jVar.mo39628k().mo39539a(dVar, i, dVar2);
            jVar.mo39616X(5);
        }
    }

    /* renamed from: org.eclipse.jetty.client.a$d */
    private class C9865d implements C9875h {

        /* renamed from: a */
        final C9877j f17897a;

        /* renamed from: b */
        final C9875h f17898b;

        public C9865d(C9877j jVar) {
            this.f17897a = jVar;
            this.f17898b = jVar.mo39628k();
        }

        /* renamed from: a */
        public void mo39539a(C11940d dVar, int i, C11940d dVar2) {
        }

        /* renamed from: b */
        public void mo39540b(Throwable th) {
            this.f17897a.mo39605M(this.f17898b);
            this.f17898b.mo39540b(th);
        }

        /* renamed from: c */
        public void mo39541c() {
            this.f17897a.mo39605M(this.f17898b);
            this.f17898b.mo39541c();
        }

        /* renamed from: d */
        public void mo39542d(C11940d dVar, C11940d dVar2) {
            this.f17898b.mo39542d(dVar, dVar2);
        }

        /* renamed from: e */
        public void mo39543e(C11940d dVar) {
        }

        /* renamed from: f */
        public void mo39544f() {
        }

        /* renamed from: g */
        public void mo39545g() {
            this.f17897a.mo39605M(this.f17898b);
            this.f17897a.mo39616X(4);
            C9861a.this.f17886f.reset();
        }

        /* renamed from: h */
        public void mo39546h() {
            this.f17897a.mo39605M(this.f17898b);
            this.f17898b.mo39546h();
        }

        /* renamed from: i */
        public void mo39547i(Throwable th) {
            this.f17897a.mo39605M(this.f17898b);
            this.f17898b.mo39547i(th);
        }

        /* renamed from: j */
        public void mo39548j() {
            this.f17898b.mo39548j();
        }

        /* renamed from: k */
        public void mo39549k() {
        }
    }

    C9861a(Buffers buffers, Buffers buffers2, C11950k kVar) {
        super(kVar);
        this.f17885e = new C9904i(buffers, kVar);
        this.f17886f = new C9910m(buffers2, kVar, new C9864c());
    }

    /* renamed from: k */
    private void m23843k() {
        long t = this.f17891k.mo39637t();
        if (t <= 0) {
            t = this.f17884d.mo39498h().mo39577a1();
        }
        long f = (long) this.f21821b.mo39655f();
        if (t > 0 && t > f) {
            this.f21821b.mo39659i(((int) t) * 2);
        }
    }

    /* renamed from: a */
    public boolean mo39518a() {
        boolean z;
        synchronized (this) {
            z = this.f17891k == null;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo39519d() {
        return false;
    }

    /* renamed from: l */
    public boolean mo39520l() {
        synchronized (this) {
            if (!this.f17894n.compareAndSet(true, false)) {
                return false;
            }
            this.f17884d.mo39498h().mo39565Q0(this.f17893m);
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r6.f17886f.mo39849o(1) != false) goto L_0x0063;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39521m() {
        /*
            r6 = this;
            org.eclipse.jetty.client.j r0 = r6.f17891k
            r1 = 1
            if (r0 == 0) goto L_0x0063
            boolean r2 = r0.mo39641w()
            if (r2 != 0) goto L_0x0063
            int r2 = r0.mo39636s()
            switch(r2) {
                case 6: goto L_0x0013;
                case 7: goto L_0x0063;
                case 8: goto L_0x0063;
                case 9: goto L_0x0063;
                case 10: goto L_0x0063;
                case 11: goto L_0x0063;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0024
        L_0x0013:
            w5.k r2 = r6.f21821b
            boolean r2 = r2.mo39669s()
            if (r2 == 0) goto L_0x0024
            org.eclipse.jetty.http.m r2 = r6.f17886f
            boolean r2 = r2.mo39849o(r1)
            if (r2 == 0) goto L_0x0024
            goto L_0x0063
        L_0x0024:
            java.lang.String r2 = r0.toString()
            w5.k r3 = r6.f21821b
            boolean r3 = r3.isOpen()
            if (r3 == 0) goto L_0x003e
            w5.k r3 = r6.f21821b
            boolean r3 = r3.mo39669s()
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = "half closed: "
            goto L_0x0040
        L_0x003b:
            java.lang.String r3 = "local close: "
            goto L_0x0040
        L_0x003e:
            java.lang.String r3 = "closed: "
        L_0x0040:
            r4 = 9
            boolean r4 = r0.mo39616X(r4)
            if (r4 == 0) goto L_0x0063
            org.eclipse.jetty.client.h r0 = r0.mo39628k()
            org.eclipse.jetty.io.EofException r4 = new org.eclipse.jetty.io.EofException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>((java.lang.String) r2)
            r0.mo39547i(r4)
        L_0x0063:
            w5.k r0 = r6.f21821b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0075
            w5.k r0 = r6.f21821b
            r0.close()
            org.eclipse.jetty.client.HttpDestination r0 = r6.f17884d
            r0.mo39508r(r6, r1)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.C9861a.mo39521m():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo39522n() {
        C9877j jVar;
        synchronized (this) {
            this.f17888h = 0;
            if (this.f17891k.mo39636s() == 2) {
                this.f17891k.mo39616X(3);
                this.f17885e.mo39722i(this.f17891k.mo39640v());
                String l = this.f17891k.mo39629l();
                String q = this.f17891k.mo39634q();
                if (this.f17884d.mo39502l()) {
                    if (!"CONNECT".equals(l) && q.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                        boolean m = this.f17884d.mo39503m();
                        String a = this.f17884d.mo39496f().mo39550a();
                        int b = this.f17884d.mo39496f().mo39551b();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m ? "https" : "http");
                        sb.append("://");
                        sb.append(a);
                        if ((!m || b != 443) && (m || b != 80)) {
                            sb.append(Constants.COLON_SEPARATOR);
                            sb.append(b);
                        }
                        sb.append(q);
                        q = sb.toString();
                    }
                    C10534a k = this.f17884d.mo39501k();
                    if (k != null) {
                        k.mo42191a(this.f17891k);
                    }
                }
                this.f17885e.mo39712F(l, q);
                this.f17886f.mo39851q("HEAD".equalsIgnoreCase(l));
                C9895h p = this.f17891k.mo39633p();
                if (this.f17891k.mo39640v() >= 11) {
                    C11940d dVar = C9908k.f18085e;
                    if (!p.mo39794j(dVar)) {
                        p.mo39789e(dVar, this.f17884d.mo39497g());
                    }
                }
                C11940d m2 = this.f17891k.mo39630m();
                if (m2 != null) {
                    p.mo39783G("Content-Length", (long) m2.length());
                    this.f17885e.mo39726n(p, false);
                    this.f17885e.mo39753l(new C11952m(m2), true);
                    jVar = this.f17891k;
                } else if (this.f17891k.mo39632o() != null) {
                    this.f17885e.mo39726n(p, false);
                } else {
                    p.mo39785I("Content-Length");
                    this.f17885e.mo39726n(p, true);
                    jVar = this.f17891k;
                }
                jVar.mo39616X(4);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo39523o(C9877j jVar) {
        synchronized (this) {
            if (this.f17891k == jVar) {
                try {
                    this.f17884d.mo39508r(this, true);
                } catch (IOException e) {
                    f17883o.mo36849d(e);
                }
            }
        }
    }

    public void onClose() {
    }

    /* renamed from: p */
    public boolean mo39525p() {
        return this.f17890j;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        synchronized (this) {
            appendable.append(String.valueOf(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
            C8942b.m21357G0(appendable, str, Collections.singletonList(this.f21821b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo39526q() {
        this.f17886f.reset();
        this.f17885e.reset();
    }

    /* renamed from: r */
    public boolean mo39527r(C9877j jVar) {
        f17883o.mo36850e("Send {} on {}", jVar, this);
        synchronized (this) {
            if (this.f17891k == null) {
                this.f17891k = jVar;
                this.f17891k.mo39621d(this);
                if (!this.f21821b.isOpen()) {
                    this.f17891k.mo39625g();
                    this.f17891k = null;
                    return false;
                }
                this.f17891k.mo39616X(2);
                m23843k();
                return true;
            } else if (this.f17892l == null) {
                this.f17892l = jVar;
                return true;
            } else {
                throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this.f17891k);
            }
        }
    }

    /* renamed from: s */
    public void mo39528s(HttpDestination httpDestination) {
        this.f17884d = httpDestination;
    }

    /* renamed from: t */
    public void mo39529t() {
        synchronized (this) {
            if (this.f17894n.compareAndSet(false, true)) {
                this.f17884d.mo39498h().mo39586g1(this.f17893m);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        HttpDestination httpDestination = this.f17884d;
        objArr[1] = httpDestination == null ? "?.?.?.?:??" : httpDestination.mo39496f();
        objArr[2] = this.f17885e;
        objArr[3] = this.f17886f;
        return String.format("%s %s g=%s p=%s", objArr);
    }

    /* renamed from: u */
    public void mo39531u(boolean z) {
        this.f17890j = z;
    }
}
