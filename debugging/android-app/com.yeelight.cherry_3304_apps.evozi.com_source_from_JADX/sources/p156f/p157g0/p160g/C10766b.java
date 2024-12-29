package p156f.p157g0.p160g;

import java.net.ProtocolException;
import p156f.C10833u;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4336d0;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p163g.C10838h;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4415s;

/* renamed from: f.g0.g.b */
public final class C10766b implements C10833u {

    /* renamed from: a */
    private final boolean f20670a;

    /* renamed from: f.g0.g.b$a */
    static final class C10767a extends C10838h {

        /* renamed from: b */
        long f20671b;

        C10767a(C4415s sVar) {
            super(sVar);
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            super.mo9442p0(cVar, j);
            this.f20671b += j;
        }
    }

    public C10766b(boolean z) {
        this.f20670a = z;
    }

    /* renamed from: a */
    public C4332c0 mo31916a(C10833u.C10834a aVar) {
        C4332c0.C4333a aVar2;
        C4336d0 d0Var;
        C10773g gVar = (C10773g) aVar;
        C10768c i = gVar.mo34031i();
        C10763g k = gVar.mo34033k();
        C4357c cVar = (C4357c) gVar.mo34029g();
        C4318a0 a = gVar.mo34023a();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.mo34030h().mo24068o(gVar.mo34028f());
        i.mo34015b(a);
        gVar.mo34030h().mo24067n(gVar.mo34028f(), a);
        C4332c0.C4333a aVar3 = null;
        if (C10772f.m26701b(a.mo23813g()) && a.mo23807a() != null) {
            if ("100-continue".equalsIgnoreCase(a.mo23809c("Expect"))) {
                i.mo34019e();
                gVar.mo34030h().mo24072s(gVar.mo34028f());
                aVar3 = i.mo34018d(true);
            }
            if (aVar3 == null) {
                gVar.mo34030h().mo24066m(gVar.mo34028f());
                C10767a aVar4 = new C10767a(i.mo34020f(a, a.mo23807a().mo23827a()));
                C4409d c = C10843m.m27008c(aVar4);
                a.mo23807a().mo23829g(c);
                c.close();
                gVar.mo34030h().mo24065l(gVar.mo34028f(), aVar4.f20671b);
            } else if (!cVar.mo23973n()) {
                k.mo34007j();
            }
        }
        i.mo34014a();
        if (aVar3 == null) {
            gVar.mo34030h().mo24072s(gVar.mo34028f());
            aVar3 = i.mo34018d(false);
        }
        aVar3.mo23883p(a);
        aVar3.mo23875h(k.mo34004d().mo23970k());
        aVar3.mo23884q(currentTimeMillis);
        aVar3.mo23882o(System.currentTimeMillis());
        C4332c0 c2 = aVar3.mo23872c();
        int g = c2.mo23860g();
        if (g == 100) {
            C4332c0.C4333a d = i.mo34018d(false);
            d.mo23883p(a);
            d.mo23875h(k.mo34004d().mo23970k());
            d.mo23884q(currentTimeMillis);
            d.mo23882o(System.currentTimeMillis());
            c2 = d.mo23872c();
            g = c2.mo23860g();
        }
        gVar.mo34030h().mo24071r(gVar.mo34028f(), c2);
        if (!this.f20670a || g != 101) {
            aVar2 = c2.mo23869u();
            d0Var = i.mo34016c(c2);
        } else {
            aVar2 = c2.mo23869u();
            d0Var = C4345c.f7642c;
        }
        aVar2.mo23871b(d0Var);
        C4332c0 c3 = aVar2.mo23872c();
        if ("close".equalsIgnoreCase(c3.mo23855I().mo23809c("Connection")) || "close".equalsIgnoreCase(c3.mo23862i("Connection"))) {
            k.mo34007j();
        }
        if ((g != 204 && g != 205) || c3.mo23857a().mo23838h() <= 0) {
            return c3;
        }
        throw new ProtocolException("HTTP " + g + " had non-zero Content-Length: " + c3.mo23857a().mo23838h());
    }
}
