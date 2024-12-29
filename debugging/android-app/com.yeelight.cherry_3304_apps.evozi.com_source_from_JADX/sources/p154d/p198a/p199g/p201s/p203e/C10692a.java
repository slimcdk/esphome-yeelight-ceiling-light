package p154d.p198a.p199g.p201s.p203e;

import java.util.Timer;
import java.util.logging.Logger;
import p154d.p198a.p199g.C10621c;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.C10673p;
import p154d.p198a.p199g.p200r.C10683g;

/* renamed from: d.a.g.s.e.a */
public class C10692a extends C10694c {
    static {
        Logger.getLogger(C10692a.class.getName());
    }

    public C10692a(C10656l lVar) {
        super(lVar, C10694c.m26433o());
        mo33875u(C10683g.ANNOUNCING_1);
        mo33870j(C10683g.ANNOUNCING_1);
    }

    public boolean cancel() {
        mo33874t();
        return super.cancel();
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("Announcer(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo33859i() {
        mo33875u(mo33872r().mo33831a());
        if (!mo33872r().mo33833c()) {
            cancel();
            mo33845f().mo33652C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C10626f mo33860k(C10626f fVar) {
        for (C10637h b : mo33845f().mo33729m0().mo33679a(true, mo33871p())) {
            fVar = mo33841b(fVar, (C10621c) null, b);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C10626f mo33861l(C10673p pVar, C10626f fVar) {
        for (C10637h b : pVar.mo33795F(true, mo33871p(), mo33845f().mo33729m0())) {
            fVar = mo33841b(fVar, (C10621c) null, b);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo33862m() {
        return !mo33845f().mo33713Y0() && !mo33845f().mo33709S0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C10626f mo33863n() {
        return new C10626f(33792);
    }

    /* renamed from: q */
    public String mo33864q() {
        return "announcing";
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
    public void mo33866v(Timer timer) {
        if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            timer.schedule(this, 1000, 1000);
        }
    }
}
