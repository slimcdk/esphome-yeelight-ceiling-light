package org.eclipse.jetty.server.handler;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import p167h6.C9095a;
import p167h6.C9096b;
import p221v5.C10545a;
import p221v5.C10546b;
import p239z5.C12156c;
import p239z5.C12181o;
import p239z5.C12186q;

/* renamed from: org.eclipse.jetty.server.handler.j */
public class C9952j extends C9950h {

    /* renamed from: k */
    private final AtomicLong f18271k = new AtomicLong();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C9095a f18272l = new C9095a();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C9096b f18273m = new C9096b();

    /* renamed from: n */
    private final C9095a f18274n = new C9095a();

    /* renamed from: o */
    private final C9096b f18275o = new C9096b();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C9095a f18276p = new C9095a();

    /* renamed from: q */
    private final AtomicInteger f18277q = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final AtomicInteger f18278r = new AtomicInteger();

    /* renamed from: s */
    private final AtomicInteger f18279s = new AtomicInteger();

    /* renamed from: t */
    private final AtomicInteger f18280t = new AtomicInteger();

    /* renamed from: u */
    private final AtomicInteger f18281u = new AtomicInteger();

    /* renamed from: v */
    private final AtomicInteger f18282v = new AtomicInteger();

    /* renamed from: w */
    private final AtomicInteger f18283w = new AtomicInteger();

    /* renamed from: x */
    private final AtomicLong f18284x = new AtomicLong();

    /* renamed from: y */
    private final C10546b f18285y = new C9953a();

    /* renamed from: org.eclipse.jetty.server.handler.j$a */
    class C9953a implements C10546b {
        C9953a() {
        }

        /* renamed from: B */
        public void mo40014B(C10545a aVar) {
            C9952j.this.f18278r.incrementAndGet();
        }

        /* renamed from: y */
        public void mo40015y(C10545a aVar) {
            C12181o m = ((C12156c) aVar).mo43013m();
            long currentTimeMillis = System.currentTimeMillis() - m.mo43096V();
            C9952j.this.f18272l.mo37108b();
            C9952j.this.f18273m.mo37121g(currentTimeMillis);
            C9952j.this.m24508w1(m);
            if (!aVar.mo42210c()) {
                C9952j.this.f18276p.mo37108b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public void m24508w1(C12181o oVar) {
        AtomicInteger atomicInteger;
        C12186q N = oVar.mo43088N();
        int B = N.mo43149B() / 100;
        if (B == 1) {
            atomicInteger = this.f18279s;
        } else if (B == 2) {
            atomicInteger = this.f18280t;
        } else if (B == 3) {
            atomicInteger = this.f18281u;
        } else if (B != 4) {
            if (B == 5) {
                atomicInteger = this.f18283w;
            }
            this.f18284x.addAndGet(N.mo43164w());
        } else {
            atomicInteger = this.f18282v;
        }
        atomicInteger.incrementAndGet();
        this.f18284x.addAndGet(N.mo43164w());
    }

    /* renamed from: Y0 */
    public int mo39988Y0() {
        return (int) this.f18274n.mo37111e();
    }

    /* renamed from: Z0 */
    public int mo39989Z0() {
        return (int) this.f18274n.mo37109c();
    }

    /* renamed from: a1 */
    public int mo39990a1() {
        return (int) this.f18274n.mo37110d();
    }

    /* renamed from: b1 */
    public long mo39991b1() {
        return this.f18275o.mo37115a();
    }

    /* renamed from: c1 */
    public double mo39992c1() {
        return this.f18275o.mo37116b();
    }

    /* renamed from: d1 */
    public double mo39993d1() {
        return this.f18275o.mo37117c();
    }

    /* renamed from: e0 */
    public long mo39994e0() {
        return System.currentTimeMillis() - this.f18271k.get();
    }

    /* renamed from: e1 */
    public long mo39995e1() {
        return this.f18275o.mo37118d();
    }

    /* renamed from: f1 */
    public int mo39996f1() {
        return this.f18278r.get();
    }

    /* renamed from: g1 */
    public long mo39997g1() {
        return this.f18273m.mo37115a();
    }

    /* renamed from: h1 */
    public double mo39998h1() {
        return this.f18273m.mo37116b();
    }

    /* renamed from: i1 */
    public double mo39999i1() {
        return this.f18273m.mo37117c();
    }

    /* renamed from: j1 */
    public long mo40000j1() {
        return this.f18273m.mo37118d();
    }

    /* renamed from: k1 */
    public int mo40001k1() {
        return (int) this.f18272l.mo37109c();
    }

    /* renamed from: l1 */
    public int mo40002l1() {
        return (int) this.f18272l.mo37110d();
    }

    /* renamed from: m0 */
    public int mo40003m0() {
        return (int) this.f18272l.mo37111e();
    }

    /* renamed from: m1 */
    public int mo40004m1() {
        return this.f18279s.get();
    }

    /* renamed from: n1 */
    public int mo40005n1() {
        return this.f18280t.get();
    }

    /* renamed from: o1 */
    public int mo40006o1() {
        return this.f18281u.get();
    }

    /* renamed from: p1 */
    public int mo40007p1() {
        return this.f18282v.get();
    }

    /* renamed from: q */
    public void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        long j;
        long currentTimeMillis;
        boolean u;
        this.f18274n.mo37112f();
        C12156c z = oVar.mo43129z();
        if (z.mo43020t()) {
            this.f18272l.mo37112f();
            j = oVar.mo43096V();
        } else {
            j = System.currentTimeMillis();
            this.f18276p.mo37108b();
            if (z.mo42210c()) {
                this.f18277q.incrementAndGet();
            }
        }
        try {
            super.mo39972q(str, oVar, aVar, cVar);
            if (!u) {
                if (z.mo43020t()) {
                    this.f18272l.mo37108b();
                    this.f18273m.mo37121g(currentTimeMillis);
                    m24508w1(oVar);
                }
            }
        } finally {
            currentTimeMillis = System.currentTimeMillis() - j;
            this.f18274n.mo37108b();
            this.f18275o.mo37121g(currentTimeMillis);
            if (z.mo43022u()) {
                if (z.mo43020t()) {
                    z.mo43006e(this.f18285y);
                }
                this.f18276p.mo37112f();
            } else if (z.mo43020t()) {
                this.f18272l.mo37108b();
                this.f18273m.mo37121g(currentTimeMillis);
                m24508w1(oVar);
            }
        }
    }

    /* renamed from: q1 */
    public int mo40008q1() {
        return this.f18283w.get();
    }

    /* renamed from: r1 */
    public long mo40009r1() {
        return this.f18284x.get();
    }

    /* renamed from: s1 */
    public int mo40010s1() {
        return this.f18277q.get();
    }

    /* renamed from: t1 */
    public int mo40011t1() {
        return (int) this.f18276p.mo37111e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        super.mo26547u0();
        mo40012u1();
    }

    /* renamed from: u1 */
    public void mo40012u1() {
        this.f18271k.set(System.currentTimeMillis());
        this.f18272l.mo37113g();
        this.f18273m.mo37120f();
        this.f18274n.mo37113g();
        this.f18275o.mo37120f();
        this.f18276p.mo37113g();
        this.f18277q.set(0);
        this.f18278r.set(0);
        this.f18279s.set(0);
        this.f18280t.set(0);
        this.f18281u.set(0);
        this.f18282v.set(0);
        this.f18283w.set(0);
        this.f18284x.set(0);
    }

    /* renamed from: v1 */
    public String mo40013v1() {
        return "<h1>Statistics:</h1>\n" + "Statistics gathering started " + mo39994e0() + "ms ago" + "<br />\n" + "<h2>Requests:</h2>\n" + "Total requests: " + mo40003m0() + "<br />\n" + "Active requests: " + mo40001k1() + "<br />\n" + "Max active requests: " + mo40002l1() + "<br />\n" + "Total requests time: " + mo40000j1() + "<br />\n" + "Mean request time: " + mo39998h1() + "<br />\n" + "Max request time: " + mo39997g1() + "<br />\n" + "Request time standard deviation: " + mo39999i1() + "<br />\n" + "<h2>Dispatches:</h2>\n" + "Total dispatched: " + mo39988Y0() + "<br />\n" + "Active dispatched: " + mo39989Z0() + "<br />\n" + "Max active dispatched: " + mo39990a1() + "<br />\n" + "Total dispatched time: " + mo39995e1() + "<br />\n" + "Mean dispatched time: " + mo39992c1() + "<br />\n" + "Max dispatched time: " + mo39991b1() + "<br />\n" + "Dispatched time standard deviation: " + mo39993d1() + "<br />\n" + "Total requests suspended: " + mo40011t1() + "<br />\n" + "Total requests expired: " + mo39996f1() + "<br />\n" + "Total requests resumed: " + mo40010s1() + "<br />\n" + "<h2>Responses:</h2>\n" + "1xx responses: " + mo40004m1() + "<br />\n" + "2xx responses: " + mo40005n1() + "<br />\n" + "3xx responses: " + mo40006o1() + "<br />\n" + "4xx responses: " + mo40007p1() + "<br />\n" + "5xx responses: " + mo40008q1() + "<br />\n" + "Bytes sent total: " + mo40009r1() + "<br />\n";
    }
}
