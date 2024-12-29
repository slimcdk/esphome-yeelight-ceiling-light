package p154d.p198a.p199g.p201s.p202d;

import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10628g;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.C10673p;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.s.d.b */
public class C10690b extends C10689a {

    /* renamed from: d */
    private final C10673p f20592d;

    public C10690b(C10656l lVar, C10673p pVar) {
        super(lVar);
        this.f20592d = pVar;
        pVar.mo33798L0(mo33845f());
        mo33845f().mo33708S(pVar, C10628g.m26033A(pVar.mo33479t(), C10681e.TYPE_ANY, C10680d.CLASS_IN, false));
    }

    public boolean cancel() {
        boolean cancel = super.cancel();
        if (!this.f20592d.mo33465A()) {
            mo33845f().mo33730m1(this.f20592d);
        }
        return cancel;
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C10626f mo33852h(C10626f fVar) {
        if (this.f20592d.mo33485z()) {
            return fVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C10626f c = mo33842c(mo33842c(fVar, (C10637h) mo33845f().mo33715c0().mo33491d(this.f20592d.mo33479t(), C10681e.TYPE_SRV, C10680d.CLASS_IN), currentTimeMillis), (C10637h) mo33845f().mo33715c0().mo33491d(this.f20592d.mo33479t(), C10681e.TYPE_TXT, C10680d.CLASS_IN), currentTimeMillis);
        return this.f20592d.mo33480u().length() > 0 ? mo33842c(mo33842c(c, (C10637h) mo33845f().mo33715c0().mo33491d(this.f20592d.mo33480u(), C10681e.TYPE_A, C10680d.CLASS_IN), currentTimeMillis), (C10637h) mo33845f().mo33715c0().mo33491d(this.f20592d.mo33480u(), C10681e.TYPE_AAAA, C10680d.CLASS_IN), currentTimeMillis) : c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10626f mo33853i(C10626f fVar) {
        if (this.f20592d.mo33485z()) {
            return fVar;
        }
        C10626f e = mo33844e(mo33844e(fVar, C10628g.m26033A(this.f20592d.mo33479t(), C10681e.TYPE_SRV, C10680d.CLASS_IN, false)), C10628g.m26033A(this.f20592d.mo33479t(), C10681e.TYPE_TXT, C10680d.CLASS_IN, false));
        return this.f20592d.mo33480u().length() > 0 ? mo33844e(mo33844e(e, C10628g.m26033A(this.f20592d.mo33480u(), C10681e.TYPE_A, C10680d.CLASS_IN, false)), C10628g.m26033A(this.f20592d.mo33480u(), C10681e.TYPE_AAAA, C10680d.CLASS_IN, false)) : e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo33854j() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        C10673p pVar = this.f20592d;
        sb.append(pVar != null ? pVar.mo33479t() : "null");
        return sb.toString();
    }
}
