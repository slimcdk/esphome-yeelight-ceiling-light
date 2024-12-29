package p154d.p198a.p199g.p201s.p203e;

import java.util.Timer;
import java.util.logging.Logger;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10628g;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.C10673p;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;
import p154d.p198a.p199g.p200r.C10683g;

/* renamed from: d.a.g.s.e.d */
public class C10695d extends C10694c {
    static {
        Logger.getLogger(C10695d.class.getName());
    }

    public C10695d(C10656l lVar) {
        super(lVar, C10694c.m26433o());
        mo33875u(C10683g.PROBING_1);
        mo33870j(C10683g.PROBING_1);
    }

    public boolean cancel() {
        mo33874t();
        return super.cancel();
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo33859i() {
        mo33875u(mo33872r().mo33831a());
        if (!mo33872r().mo33838h()) {
            cancel();
            mo33845f().mo33662t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10626f mo33860k(C10626f fVar) {
        fVar.mo33583w(C10628g.m26033A(mo33845f().mo33729m0().mo33690q(), C10681e.TYPE_ANY, C10680d.CLASS_IN, false));
        for (C10637h d : mo33845f().mo33729m0().mo33679a(false, mo33871p())) {
            fVar = mo33843d(fVar, d);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C10626f mo33861l(C10673p pVar, C10626f fVar) {
        return mo33843d(mo33844e(fVar, C10628g.m26033A(pVar.mo33479t(), C10681e.TYPE_ANY, C10680d.CLASS_IN, false)), new C10637h.C10643f(pVar.mo33479t(), C10680d.CLASS_IN, false, mo33871p(), pVar.mo33475p(), pVar.mo33484y(), pVar.mo33474o(), mo33845f().mo33729m0().mo33690q()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo33862m() {
        return !mo33845f().mo33713Y0() && !mo33845f().mo33709S0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C10626f mo33863n() {
        return new C10626f(0);
    }

    /* renamed from: q */
    public String mo33864q() {
        return "probing";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo33865s(Throwable th) {
        mo33845f().mo33722i1();
    }

    public String toString() {
        return super.toString() + " state: " + mo33872r();
    }

    /* renamed from: v */
    public void mo33877v(Timer timer) {
        long j;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        int i = ((currentTimeMillis - mo33845f().mo33726k0()) > 5000 ? 1 : ((currentTimeMillis - mo33845f().mo33726k0()) == 5000 ? 0 : -1));
        C10656l f = mo33845f();
        if (i < 0) {
            f.mo33742u1(mo33845f().mo33745x0() + 1);
        } else {
            f.mo33742u1(1);
        }
        mo33845f().mo33739t1(currentTimeMillis);
        if (mo33845f().mo33705J0() && mo33845f().mo33745x0() < 10) {
            j = (long) C10656l.m26220o0().nextInt(251);
            j2 = 250;
        } else if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            j = 1000;
            j2 = 1000;
        } else {
            return;
        }
        timer.schedule(this, j, j2);
    }
}
