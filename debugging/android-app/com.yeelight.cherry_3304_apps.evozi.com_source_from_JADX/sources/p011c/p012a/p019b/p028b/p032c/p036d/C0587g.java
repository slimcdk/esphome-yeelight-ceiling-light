package p011c.p012a.p019b.p028b.p032c.p036d;

/* renamed from: c.a.b.b.c.d.g */
public final class C0587g extends C0593m<C0587g> {

    /* renamed from: e */
    private static volatile C0587g[] f238e;

    /* renamed from: c */
    public String f239c = "";

    /* renamed from: d */
    public C0588h f240d = null;

    public C0587g() {
        this.f268b = null;
        this.f279a = -1;
    }

    /* renamed from: i */
    public static C0587g[] m369i() {
        if (f238e == null) {
            synchronized (C0597q.f278b) {
                if (f238e == null) {
                    f238e = new C0587g[0];
                }
            }
        }
        return f238e;
    }

    /* renamed from: a */
    public final /* synthetic */ C0599s mo8561a(C0590j jVar) {
        while (true) {
            int n = jVar.mo8583n();
            if (n == 0) {
                return this;
            }
            if (n == 10) {
                this.f239c = jVar.mo8574c();
            } else if (n == 18) {
                if (this.f240d == null) {
                    this.f240d = new C0588h();
                }
                jVar.mo8575e(this.f240d);
            } else if (!super.mo8602h(jVar, n)) {
                return this;
            }
        }
    }

    /* renamed from: c */
    public final void mo8562c(C0591k kVar) {
        kVar.mo8593f(1, this.f239c);
        C0588h hVar = this.f240d;
        if (hVar != null) {
            kVar.mo8592e(2, hVar);
        }
        super.mo8562c(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo8563e() {
        int e = super.mo8563e() + C0591k.m407k(1, this.f239c);
        C0588h hVar = this.f240d;
        return hVar != null ? e + C0591k.m406j(2, hVar) : e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0587g)) {
            return false;
        }
        C0587g gVar = (C0587g) obj;
        String str = this.f239c;
        if (str == null) {
            if (gVar.f239c != null) {
                return false;
            }
        } else if (!str.equals(gVar.f239c)) {
            return false;
        }
        C0588h hVar = this.f240d;
        if (hVar == null) {
            if (gVar.f240d != null) {
                return false;
            }
        } else if (!hVar.equals(gVar.f240d)) {
            return false;
        }
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            return this.f268b.equals(gVar.f268b);
        }
        C0595o oVar2 = gVar.f268b;
        return oVar2 == null || oVar2.mo8603b();
    }

    public final int hashCode() {
        int hashCode = (C0587g.class.getName().hashCode() + 527) * 31;
        String str = this.f239c;
        int i = 0;
        int hashCode2 = hashCode + (str == null ? 0 : str.hashCode());
        C0588h hVar = this.f240d;
        int hashCode3 = ((hashCode2 * 31) + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            i = this.f268b.hashCode();
        }
        return hashCode3 + i;
    }
}
