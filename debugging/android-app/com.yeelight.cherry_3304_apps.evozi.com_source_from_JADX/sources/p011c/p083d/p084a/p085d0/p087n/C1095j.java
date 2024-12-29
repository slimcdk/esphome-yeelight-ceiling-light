package p011c.p083d.p084a.p085d0.p087n;

import p011c.p083d.p084a.C0988a0;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;
import p163g.C10843m;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: c.d.a.d0.n.j */
public final class C1095j implements C1105s {

    /* renamed from: a */
    private final C1090h f1606a;

    /* renamed from: b */
    private final C1080f f1607b;

    public C1095j(C1090h hVar, C1080f fVar) {
        this.f1606a = hVar;
        this.f1607b = fVar;
    }

    /* renamed from: j */
    private C4416t m2511j(C1150z zVar) {
        if (!C1090h.m2478r(zVar)) {
            return this.f1607b.mo9616t(0);
        }
        if ("chunked".equalsIgnoreCase(zVar.mo9863q("Transfer-Encoding"))) {
            return this.f1607b.mo9614r(this.f1606a);
        }
        long e = C1096k.m2525e(zVar);
        return e != -1 ? this.f1607b.mo9616t(e) : this.f1607b.mo9617u();
    }

    /* renamed from: a */
    public void mo9597a() {
        this.f1607b.mo9610n();
    }

    /* renamed from: b */
    public C4415s mo9598b(C1144x xVar, long j) {
        if ("chunked".equalsIgnoreCase(xVar.mo9835h("Transfer-Encoding"))) {
            return this.f1607b.mo9613q();
        }
        if (j != -1) {
            return this.f1607b.mo9615s(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: c */
    public void mo9599c() {
        if (mo9604h()) {
            this.f1607b.mo9618v();
        } else {
            this.f1607b.mo9609l();
        }
    }

    /* renamed from: d */
    public void mo9600d(C1144x xVar) {
        this.f1606a.mo9632I();
        this.f1607b.mo9622z(xVar.mo9836i(), C1100n.m2543a(xVar, this.f1606a.mo9636n().mo9696l().mo9395b().type(), this.f1606a.mo9636n().mo9695k()));
    }

    /* renamed from: e */
    public void mo9601e(C1090h hVar) {
        this.f1607b.mo9608k(hVar);
    }

    /* renamed from: f */
    public void mo9602f(C1101o oVar) {
        this.f1607b.mo9606A(oVar);
    }

    /* renamed from: g */
    public C1150z.C1152b mo9603g() {
        return this.f1607b.mo9620x();
    }

    /* renamed from: h */
    public boolean mo9604h() {
        return !"close".equalsIgnoreCase(this.f1606a.mo9637o().mo9835h("Connection")) && !"close".equalsIgnoreCase(this.f1606a.mo9638p().mo9863q("Connection")) && !this.f1607b.mo9611o();
    }

    /* renamed from: i */
    public C0988a0 mo9605i(C1150z zVar) {
        return new C1098l(zVar.mo9865s(), C10843m.m27009d(m2511j(zVar)));
    }
}
