package p164h.p211a.p212a.p220e.p221o;

import p154d.p155b.C10734t;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p154d.p155b.p204f0.C10713g;
import p164h.p211a.p212a.p220e.C10975a;
import p164h.p211a.p212a.p220e.C10982f;
import p164h.p211a.p212a.p220e.C10983g;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p222f.p226y.C11064c;

/* renamed from: h.a.a.e.o.f */
public abstract class C11005f implements C10975a {

    /* renamed from: a */
    protected C10983g f21508a;

    /* renamed from: b */
    protected C10982f f21509b;

    /* renamed from: c */
    private boolean f21510c;

    protected C11005f() {
    }

    /* renamed from: b */
    public void mo34713b(C10975a.C10976a aVar) {
        C10983g A = aVar.mo34716A();
        this.f21508a = A;
        if (A != null) {
            C10982f j = aVar.mo34719j();
            this.f21509b = j;
            if (j != null) {
                this.f21510c = aVar.mo34720p();
                return;
            }
            throw new IllegalStateException("No IdentityService for " + this + " in " + aVar);
        }
        throw new IllegalStateException("No LoginService for " + this + " in " + aVar);
    }

    /* renamed from: e */
    public C10983g mo34779e() {
        return this.f21508a;
    }

    /* renamed from: f */
    public C11046u mo34776f(String str, Object obj, C10734t tVar) {
        C11046u c = this.f21508a.mo34741c(str, obj);
        if (c == null) {
            return null;
        }
        mo34780g((C10709c) tVar, (C10711e) null);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C10713g mo34780g(C10709c cVar, C10711e eVar) {
        C10713g p = cVar.mo33925p(false);
        if (!(!this.f21510c || p == null || p.mo33938a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated") == Boolean.TRUE)) {
            synchronized (this) {
                p = C11064c.m28576K0(cVar, p, true);
            }
        }
        return p;
    }
}
