package p154d.p198a.p199g.p201s.p202d;

import p154d.p198a.C10613d;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.C10628g;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10656l;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.s.d.c */
public class C10691c extends C10689a {

    /* renamed from: d */
    private final String f20593d;

    public C10691c(C10656l lVar, String str) {
        super(lVar);
        this.f20593d = str;
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C10626f mo33852h(C10626f fVar) {
        long currentTimeMillis = System.currentTimeMillis();
        for (C10613d next : mo33845f().mo33743v0().values()) {
            fVar = mo33842c(fVar, new C10637h.C10642e(next.mo33483x(), C10680d.CLASS_IN, false, 3600, next.mo33479t()), currentTimeMillis);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10626f mo33853i(C10626f fVar) {
        return mo33844e(fVar, C10628g.m26033A(this.f20593d, C10681e.TYPE_PTR, C10680d.CLASS_IN, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo33854j() {
        return "querying service";
    }
}
