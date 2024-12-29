package p164h.p211a.p212a.p213a;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p213a.p214n.C10880a;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10906j;
import p164h.p211a.p212a.p216c.C10909k;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p216c.C10912n;
import p164h.p211a.p212a.p216c.C10919s;
import p164h.p211a.p212a.p217d.C10927c;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p217d.C10950t;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.a */
public abstract class C10852a extends C10927c implements C11152d {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C11158c f20931o = C11156b.m29015a(C10852a.class);

    /* renamed from: d */
    protected C10866h f20932d;

    /* renamed from: e */
    protected C10906j f20933e;

    /* renamed from: f */
    protected C10912n f20934f;

    /* renamed from: g */
    protected boolean f20935g;

    /* renamed from: h */
    protected int f20936h;

    /* renamed from: i */
    protected C10929e f20937i;

    /* renamed from: j */
    protected boolean f20938j;

    /* renamed from: k */
    protected volatile C10871k f20939k;

    /* renamed from: l */
    protected C10871k f20940l;

    /* renamed from: m */
    private final C11115e.C11116a f20941m = new C10854b();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AtomicBoolean f20942n = new AtomicBoolean(false);

    /* renamed from: h.a.a.a.a$b */
    private class C10854b extends C11115e.C11116a {
        private C10854b() {
        }

        /* renamed from: f */
        public void mo34200f() {
            if (C10852a.this.f20942n.compareAndSet(true, false)) {
                C10852a aVar = C10852a.this;
                aVar.f20932d.mo34283s(aVar);
            }
        }
    }

    /* renamed from: h.a.a.a.a$c */
    private class C10855c extends C10912n.C10913a {
        private C10855c() {
        }

        /* renamed from: a */
        public void mo34201a(C10929e eVar) {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar != null) {
                kVar.mo34327k().mo34208a(eVar);
            }
        }

        /* renamed from: b */
        public void mo34202b() {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar != null && !kVar.mo34340w() && kVar.mo34315X(9)) {
                kVar.mo34327k().mo34215h(new C10943o("early EOF"));
            }
        }

        /* renamed from: c */
        public void mo34203c() {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar != null) {
                kVar.mo34315X(6);
            }
        }

        /* renamed from: d */
        public void mo34204d(long j) {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar != null) {
                kVar.mo34315X(7);
            }
        }

        /* renamed from: e */
        public void mo34205e(C10929e eVar, C10929e eVar2) {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar != null) {
                if (C10910l.f21152d.mo34616f(eVar) == 1) {
                    C10852a.this.f20937i = C10909k.f21149d.mo34618h(eVar2);
                }
                kVar.mo34327k().mo34217j(eVar, eVar2);
            }
        }

        /* renamed from: f */
        public void mo34206f(C10929e eVar, C10929e eVar2, C10929e eVar3) {
        }

        /* renamed from: g */
        public void mo34207g(C10929e eVar, int i, C10929e eVar2) {
            C10871k kVar = C10852a.this.f20939k;
            if (kVar == null) {
                C10852a.f20931o.mo35486b("No exchange for response", new Object[0]);
                C10852a.this.f21308b.close();
                return;
            }
            if (i == 100 || i == 102) {
                kVar.mo34304M(new C10856d(kVar));
            } else if (i == 200 && "CONNECT".equalsIgnoreCase(kVar.mo34328l())) {
                C10852a.this.f20934f.mo34529q(true);
            }
            C10852a.this.f20935g = C10919s.f21259c.equals(eVar);
            C10852a.this.f20936h = i;
            kVar.mo34327k().mo34214g(eVar, i, eVar2);
            kVar.mo34315X(5);
        }
    }

    /* renamed from: h.a.a.a.a$d */
    private class C10856d implements C10869i {

        /* renamed from: a */
        final C10871k f20945a;

        /* renamed from: b */
        final C10869i f20946b;

        public C10856d(C10871k kVar) {
            this.f20945a = kVar;
            this.f20946b = kVar.mo34327k();
        }

        /* renamed from: a */
        public void mo34208a(C10929e eVar) {
        }

        /* renamed from: b */
        public void mo34209b(Throwable th) {
            this.f20945a.mo34304M(this.f20946b);
            this.f20946b.mo34209b(th);
        }

        /* renamed from: c */
        public void mo34210c() {
            this.f20945a.mo34304M(this.f20946b);
            this.f20946b.mo34210c();
        }

        /* renamed from: d */
        public void mo34211d() {
        }

        /* renamed from: e */
        public void mo34212e() {
            this.f20945a.mo34304M(this.f20946b);
            this.f20945a.mo34315X(4);
            C10852a.this.f20934f.reset();
        }

        /* renamed from: f */
        public void mo34213f() {
            this.f20945a.mo34304M(this.f20946b);
            this.f20946b.mo34213f();
        }

        /* renamed from: g */
        public void mo34214g(C10929e eVar, int i, C10929e eVar2) {
        }

        /* renamed from: h */
        public void mo34215h(Throwable th) {
            this.f20945a.mo34304M(this.f20946b);
            this.f20946b.mo34215h(th);
        }

        /* renamed from: i */
        public void mo34216i() {
            this.f20946b.mo34216i();
        }

        /* renamed from: j */
        public void mo34217j(C10929e eVar, C10929e eVar2) {
            this.f20946b.mo34217j(eVar, eVar2);
        }

        /* renamed from: k */
        public void mo34218k() {
        }
    }

    C10852a(C10935i iVar, C10935i iVar2, C10942n nVar) {
        super(nVar);
        this.f20933e = new C10906j(iVar, nVar);
        this.f20934f = new C10912n(iVar2, nVar, new C10855c());
    }

    /* renamed from: k */
    private void m27088k() {
        long t = this.f20939k.mo34336t();
        if (t <= 0) {
            t = this.f20932d.mo34272h().mo34244V0();
        }
        long g = (long) this.f21308b.mo34356g();
        if (t > 0 && t > g) {
            this.f21308b.mo34360j(((int) t) * 2);
        }
    }

    /* renamed from: a */
    public boolean mo34185a() {
        boolean z;
        synchronized (this) {
            z = this.f20939k == null;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo34186d() {
        return false;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        synchronized (this) {
            appendable.append(String.valueOf(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
            C11146b.m28976B0(appendable, str, Collections.singletonList(this.f21308b));
        }
    }

    /* renamed from: l */
    public boolean mo34188l() {
        synchronized (this) {
            if (!this.f20942n.compareAndSet(true, false)) {
                return false;
            }
            this.f20932d.mo34272h().mo34234L0(this.f20941m);
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r6.f20934f.mo34527o(1) != false) goto L_0x0063;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34189m() {
        /*
            r6 = this;
            h.a.a.a.k r0 = r6.f20939k
            r1 = 1
            if (r0 == 0) goto L_0x0063
            boolean r2 = r0.mo34340w()
            if (r2 != 0) goto L_0x0063
            int r2 = r0.mo34335s()
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
            h.a.a.d.n r2 = r6.f21308b
            boolean r2 = r2.mo34369s()
            if (r2 == 0) goto L_0x0024
            h.a.a.c.n r2 = r6.f20934f
            boolean r2 = r2.mo34527o(r1)
            if (r2 == 0) goto L_0x0024
            goto L_0x0063
        L_0x0024:
            java.lang.String r2 = r0.toString()
            h.a.a.d.n r3 = r6.f21308b
            boolean r3 = r3.isOpen()
            if (r3 == 0) goto L_0x003e
            h.a.a.d.n r3 = r6.f21308b
            boolean r3 = r3.mo34369s()
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
            boolean r4 = r0.mo34315X(r4)
            if (r4 == 0) goto L_0x0063
            h.a.a.a.i r0 = r0.mo34327k()
            h.a.a.d.o r4 = new h.a.a.d.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>((java.lang.String) r2)
            r0.mo34215h(r4)
        L_0x0063:
            h.a.a.d.n r0 = r6.f21308b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0075
            h.a.a.d.n r0 = r6.f21308b
            r0.close()
            h.a.a.a.h r0 = r6.f20932d
            r0.mo34282r(r6, r1)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p213a.C10852a.mo34189m():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo34190n() {
        C10871k kVar;
        synchronized (this) {
            this.f20936h = 0;
            if (this.f20939k.mo34335s() == 2) {
                this.f20939k.mo34315X(3);
                this.f20933e.mo34400h(this.f20939k.mo34339v());
                String l = this.f20939k.mo34328l();
                String q = this.f20939k.mo34333q();
                if (this.f20932d.mo34276l()) {
                    if (!"CONNECT".equals(l) && q.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                        boolean m = this.f20932d.mo34277m();
                        String a = this.f20932d.mo34270f().mo34219a();
                        int b = this.f20932d.mo34270f().mo34220b();
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
                    C10880a k = this.f20932d.mo34275k();
                    if (k != null) {
                        k.mo34378a(this.f20939k);
                    }
                }
                this.f20933e.mo34391D(l, q);
                this.f20934f.mo34529q("HEAD".equalsIgnoreCase(l));
                C10897i p = this.f20939k.mo34332p();
                if (this.f20939k.mo34339v() >= 11 && !p.mo34472i(C10910l.f21153e)) {
                    p.mo34468e(C10910l.f21153e, this.f20932d.mo34271g());
                }
                C10929e m2 = this.f20939k.mo34329m();
                if (m2 != null) {
                    p.mo34462E("Content-Length", (long) m2.length());
                    this.f20933e.mo34404l(p, false);
                    this.f20933e.mo34432o(new C10950t(m2), true);
                    kVar = this.f20939k;
                } else if (this.f20939k.mo34331o() != null) {
                    this.f20933e.mo34404l(p, false);
                } else {
                    p.mo34464G("Content-Length");
                    this.f20933e.mo34404l(p, true);
                    kVar = this.f20939k;
                }
                kVar.mo34315X(4);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo34191o(C10871k kVar) {
        synchronized (this) {
            if (this.f20939k == kVar) {
                try {
                    this.f20932d.mo34282r(this, true);
                } catch (IOException e) {
                    f20931o.mo35488d(e);
                }
            }
        }
    }

    public void onClose() {
    }

    /* renamed from: p */
    public boolean mo34193p() {
        return this.f20938j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo34194q() {
        this.f20934f.reset();
        this.f20933e.reset();
    }

    /* renamed from: r */
    public boolean mo34195r(C10871k kVar) {
        f20931o.mo35489e("Send {} on {}", kVar, this);
        synchronized (this) {
            if (this.f20939k == null) {
                this.f20939k = kVar;
                this.f20939k.mo34320d(this);
                if (!this.f21308b.isOpen()) {
                    this.f20939k.mo34324g();
                    this.f20939k = null;
                    return false;
                }
                this.f20939k.mo34315X(2);
                m27088k();
                return true;
            } else if (this.f20940l == null) {
                this.f20940l = kVar;
                return true;
            } else {
                throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this.f20939k);
            }
        }
    }

    /* renamed from: s */
    public void mo34196s(C10866h hVar) {
        this.f20932d = hVar;
    }

    /* renamed from: t */
    public void mo34197t() {
        synchronized (this) {
            if (this.f20942n.compareAndSet(false, true)) {
                this.f20932d.mo34272h().mo34254b1(this.f20941m);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        C10866h hVar = this.f20932d;
        objArr[1] = hVar == null ? "?.?.?.?:??" : hVar.mo34270f();
        objArr[2] = this.f20933e;
        objArr[3] = this.f20934f;
        return String.format("%s %s g=%s p=%s", objArr);
    }

    /* renamed from: u */
    public void mo34199u(boolean z) {
        this.f20938j = z;
    }
}
