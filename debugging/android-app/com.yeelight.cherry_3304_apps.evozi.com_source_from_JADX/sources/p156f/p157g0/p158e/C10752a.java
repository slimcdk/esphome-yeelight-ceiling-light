package p156f.p157g0.p158e;

import com.miot.service.manager.timer.TimerCodec;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p156f.C10833u;
import p156f.C10835y;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.C4388s;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p158e.C4348c;
import p156f.p157g0.p160g.C10771e;
import p156f.p157g0.p160g.C10772f;
import p156f.p157g0.p160g.C4358h;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: f.g0.e.a */
public final class C10752a implements C10833u {

    /* renamed from: a */
    final C10756f f20630a;

    /* renamed from: f.g0.e.a$a */
    class C10753a implements C4416t {

        /* renamed from: a */
        boolean f20631a;

        /* renamed from: b */
        final /* synthetic */ C4410e f20632b;

        /* renamed from: c */
        final /* synthetic */ C10754b f20633c;

        /* renamed from: d */
        final /* synthetic */ C4409d f20634d;

        C10753a(C10752a aVar, C4410e eVar, C10754b bVar, C4409d dVar) {
            this.f20632b = eVar;
            this.f20633c = bVar;
            this.f20634d = dVar;
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            try {
                long P0 = this.f20632b.mo9541P0(cVar, j);
                if (P0 == -1) {
                    if (!this.f20631a) {
                        this.f20631a = true;
                        this.f20634d.close();
                    }
                    return -1;
                }
                cVar.mo24240j(this.f20634d.mo24208H(), cVar.mo24233g1() - P0, P0);
                this.f20634d.mo24219Y();
                return P0;
            } catch (IOException e) {
                if (!this.f20631a) {
                    this.f20631a = true;
                    this.f20633c.mo23850a();
                }
                throw e;
            }
        }

        public void close() {
            if (!this.f20631a && !C4345c.m12369p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f20631a = true;
                this.f20633c.mo23850a();
            }
            this.f20632b.close();
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f20632b.mo9542f();
        }
    }

    public C10752a(C10756f fVar) {
        this.f20630a = fVar;
    }

    /* renamed from: b */
    private C4332c0 m26615b(C10754b bVar, C4332c0 c0Var) {
        C4415s b;
        if (bVar == null || (b = bVar.mo23851b()) == null) {
            return c0Var;
        }
        C10753a aVar = new C10753a(this, c0Var.mo23857a().mo23840o(), bVar, C10843m.m27008c(b));
        String i = c0Var.mo23862i("Content-Type");
        long h = c0Var.mo23857a().mo23838h();
        C4332c0.C4333a u = c0Var.mo23869u();
        u.mo23871b(new C4358h(i, h, C10843m.m27009d(aVar)));
        return u.mo23872c();
    }

    /* renamed from: c */
    private static C4388s m26616c(C4388s sVar, C4388s sVar2) {
        C4388s.C4389a aVar = new C4388s.C4389a();
        int h = sVar.mo24089h();
        for (int i = 0; i < h; i++) {
            String e = sVar.mo24086e(i);
            String i2 = sVar.mo24091i(i);
            if ((!"Warning".equalsIgnoreCase(e) || !i2.startsWith(TimerCodec.ENABLE)) && (m26617d(e) || !m26618e(e) || sVar2.mo24085c(e) == null)) {
                C4344a.f7639a.mo23926b(aVar, e, i2);
            }
        }
        int h2 = sVar2.mo24089h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e2 = sVar2.mo24086e(i3);
            if (!m26617d(e2) && m26618e(e2)) {
                C4344a.f7639a.mo23926b(aVar, e2, sVar2.mo24091i(i3));
            }
        }
        return aVar.mo24097d();
    }

    /* renamed from: d */
    static boolean m26617d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m26618e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    private static C4332c0 m26619f(C4332c0 c0Var) {
        if (c0Var == null || c0Var.mo23857a() == null) {
            return c0Var;
        }
        C4332c0.C4333a u = c0Var.mo23869u();
        u.mo23871b((C4336d0) null);
        return u.mo23872c();
    }

    /* renamed from: a */
    public C4332c0 mo31916a(C10833u.C10834a aVar) {
        C10756f fVar = this.f20630a;
        C4332c0 e = fVar != null ? fVar.mo23848e(aVar.mo34023a()) : null;
        C4348c c = new C4348c.C4349a(System.currentTimeMillis(), aVar.mo34023a(), e).mo23939c();
        C4318a0 a0Var = c.f7659a;
        C4332c0 c0Var = c.f7660b;
        C10756f fVar2 = this.f20630a;
        if (fVar2 != null) {
            fVar2.mo23845b(c);
        }
        if (e != null && c0Var == null) {
            C4345c.m12360g(e.mo23857a());
        }
        if (a0Var == null && c0Var == null) {
            C4332c0.C4333a aVar2 = new C4332c0.C4333a();
            aVar2.mo23883p(aVar.mo34023a());
            aVar2.mo23881n(C10835y.HTTP_1_1);
            aVar2.mo23874g(504);
            aVar2.mo23878k("Unsatisfiable Request (only-if-cached)");
            aVar2.mo23871b(C4345c.f7642c);
            aVar2.mo23884q(-1);
            aVar2.mo23882o(System.currentTimeMillis());
            return aVar2.mo23872c();
        } else if (a0Var == null) {
            C4332c0.C4333a u = c0Var.mo23869u();
            u.mo23873d(m26619f(c0Var));
            return u.mo23872c();
        } else {
            try {
                C4332c0 d = aVar.mo34026d(a0Var);
                if (d == null && e != null) {
                }
                if (c0Var != null) {
                    if (d.mo23860g() == 304) {
                        C4332c0.C4333a u2 = c0Var.mo23869u();
                        u2.mo23877j(m26616c(c0Var.mo23864n(), d.mo23864n()));
                        u2.mo23884q(d.mo23856J());
                        u2.mo23882o(d.mo23854F());
                        u2.mo23873d(m26619f(c0Var));
                        u2.mo23879l(m26619f(d));
                        C4332c0 c2 = u2.mo23872c();
                        d.mo23857a().close();
                        this.f20630a.mo23844a();
                        this.f20630a.mo23849f(c0Var, c2);
                        return c2;
                    }
                    C4345c.m12360g(c0Var.mo23857a());
                }
                C4332c0.C4333a u3 = d.mo23869u();
                u3.mo23873d(m26619f(c0Var));
                u3.mo23879l(m26619f(d));
                C4332c0 c3 = u3.mo23872c();
                if (this.f20630a != null) {
                    if (C10771e.m26687c(c3) && C4348c.m12381a(c3, a0Var)) {
                        return m26615b(this.f20630a.mo23847d(c3), c3);
                    }
                    if (C10772f.m26700a(a0Var.mo23813g())) {
                        try {
                            this.f20630a.mo23846c(a0Var);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c3;
            } finally {
                if (e != null) {
                    C4345c.m12360g(e.mo23857a());
                }
            }
        }
    }
}
