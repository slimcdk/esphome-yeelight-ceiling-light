package p123a3;

import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;

/* renamed from: a3.j */
public final class C3954j implements C3962q {

    /* renamed from: a */
    private final C3949h f6663a;

    /* renamed from: b */
    private final C3939f f6664b;

    public C3954j(C3949h hVar, C3939f fVar) {
        this.f6663a = hVar;
        this.f6664b = fVar;
    }

    /* renamed from: j */
    private C9853r m11369j(C4318x xVar) {
        if (!C3949h.m11336r(xVar)) {
            return this.f6664b.mo26452t(0);
        }
        if ("chunked".equalsIgnoreCase(xVar.mo28062q("Transfer-Encoding"))) {
            return this.f6664b.mo26450r(this.f6663a);
        }
        long e = C3955k.m11383e(xVar);
        return e != -1 ? this.f6664b.mo26452t(e) : this.f6664b.mo26453u();
    }

    /* renamed from: a */
    public void mo26433a() {
        this.f6664b.mo26446n();
    }

    /* renamed from: b */
    public C9852q mo26434b(C4312v vVar, long j) {
        if ("chunked".equalsIgnoreCase(vVar.mo28034h("Transfer-Encoding"))) {
            return this.f6664b.mo26449q();
        }
        if (j != -1) {
            return this.f6664b.mo26451s(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: c */
    public void mo26435c() {
        if (mo26440h()) {
            this.f6664b.mo26454v();
        } else {
            this.f6664b.mo26445l();
        }
    }

    /* renamed from: d */
    public void mo26436d(C4312v vVar) {
        this.f6663a.mo26468I();
        this.f6664b.mo26458z(vVar.mo28035i(), C3958m.m11400a(vVar, this.f6663a.mo26472n().mo27876l().mo28091b().type(), this.f6663a.mo26472n().mo27875k()));
    }

    /* renamed from: e */
    public void mo26437e(C3959n nVar) {
        this.f6664b.mo26442A(nVar);
    }

    /* renamed from: f */
    public void mo26438f(C3949h hVar) {
        this.f6664b.mo26444k(hVar);
    }

    /* renamed from: g */
    public C4318x.C4320b mo26439g() {
        return this.f6664b.mo26456x();
    }

    /* renamed from: h */
    public boolean mo26440h() {
        return !"close".equalsIgnoreCase(this.f6663a.mo26473o().mo28034h("Connection")) && !"close".equalsIgnoreCase(this.f6663a.mo26474p().mo28062q("Connection")) && !this.f6664b.mo26447o();
    }

    /* renamed from: i */
    public C4321y mo26441i(C4318x xVar) {
        return new C3957l(xVar.mo28064s(), C9845l.m23738d(m11369j(xVar)));
    }
}
