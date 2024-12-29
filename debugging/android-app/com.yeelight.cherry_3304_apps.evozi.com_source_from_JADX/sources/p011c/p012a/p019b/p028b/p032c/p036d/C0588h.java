package p011c.p012a.p019b.p028b.p032c.p036d;

/* renamed from: c.a.b.b.c.d.h */
public final class C0588h extends C0593m<C0588h> {

    /* renamed from: e */
    private static volatile C0588h[] f241e;

    /* renamed from: c */
    public int f242c = 1;

    /* renamed from: d */
    public C0589i f243d = null;

    public C0588h() {
        this.f268b = null;
        this.f279a = -1;
    }

    /* renamed from: i */
    private final C0588h m373i(C0590j jVar) {
        int o;
        while (true) {
            int n = jVar.mo8583n();
            if (n == 0) {
                return this;
            }
            if (n == 8) {
                try {
                    o = jVar.mo8584o();
                    if (o <= 0 || o > 15) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(o);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f242c = o;
                    }
                } catch (IllegalArgumentException unused) {
                    jVar.mo8582l(jVar.mo8572a());
                    mo8602h(jVar, n);
                }
            } else if (n == 18) {
                if (this.f243d == null) {
                    this.f243d = new C0589i();
                }
                jVar.mo8575e(this.f243d);
            } else if (!super.mo8602h(jVar, n)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(o);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: j */
    public static C0588h[] m374j() {
        if (f241e == null) {
            synchronized (C0597q.f278b) {
                if (f241e == null) {
                    f241e = new C0588h[0];
                }
            }
        }
        return f241e;
    }

    /* renamed from: a */
    public final /* synthetic */ C0599s mo8561a(C0590j jVar) {
        m373i(jVar);
        return this;
    }

    /* renamed from: c */
    public final void mo8562c(C0591k kVar) {
        kVar.mo8596p(1, this.f242c);
        C0589i iVar = this.f243d;
        if (iVar != null) {
            kVar.mo8592e(2, iVar);
        }
        super.mo8562c(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo8563e() {
        int e = super.mo8563e() + C0591k.m410q(1, this.f242c);
        C0589i iVar = this.f243d;
        return iVar != null ? e + C0591k.m406j(2, iVar) : e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0588h)) {
            return false;
        }
        C0588h hVar = (C0588h) obj;
        if (this.f242c != hVar.f242c) {
            return false;
        }
        C0589i iVar = this.f243d;
        if (iVar == null) {
            if (hVar.f243d != null) {
                return false;
            }
        } else if (!iVar.equals(hVar.f243d)) {
            return false;
        }
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            return this.f268b.equals(hVar.f268b);
        }
        C0595o oVar2 = hVar.f268b;
        return oVar2 == null || oVar2.mo8603b();
    }

    public final int hashCode() {
        int hashCode = ((C0588h.class.getName().hashCode() + 527) * 31) + this.f242c;
        C0589i iVar = this.f243d;
        int i = 0;
        int hashCode2 = ((hashCode * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C0595o oVar = this.f268b;
        if (oVar != null && !oVar.mo8603b()) {
            i = this.f268b.hashCode();
        }
        return hashCode2 + i;
    }
}
