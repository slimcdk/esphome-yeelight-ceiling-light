package org.eclipse.jetty.security.authentication;

import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.C9281e;
import p136c6.C4015c;
import p208s4.C10364p;
import p234y5.C12072a;
import p234y5.C12079f;
import p234y5.C12080g;
import p239z5.C12193w;

/* renamed from: org.eclipse.jetty.security.authentication.e */
public abstract class C9938e implements C12072a {

    /* renamed from: a */
    protected C12080g f18214a;

    /* renamed from: b */
    protected C12079f f18215b;

    /* renamed from: c */
    private boolean f18216c;

    protected C9938e() {
    }

    /* renamed from: c */
    public void mo39891c(C12072a.C12073a aVar) {
        C12080g F = aVar.mo42738F();
        this.f18214a = F;
        if (F != null) {
            C12079f h = aVar.mo42741h();
            this.f18215b = h;
            if (h != null) {
                this.f18216c = aVar.mo42742r();
                return;
            }
            throw new IllegalStateException("No IdentityService for " + this + " in " + aVar);
        }
        throw new IllegalStateException("No LoginService for " + this + " in " + aVar);
    }

    /* renamed from: d */
    public C12080g mo39917d() {
        return this.f18214a;
    }

    /* renamed from: e */
    public C12193w mo39913e(String str, Object obj, C10364p pVar) {
        C12193w b = this.f18214a.mo42762b(str, obj);
        if (b == null) {
            return null;
        }
        mo39918f((C9277a) pVar, (C9279c) null);
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C9281e mo39918f(C9277a aVar, C9279c cVar) {
        C9281e p = aVar.mo37769p(false);
        if (!(!this.f18216c || p == null || p.mo26625a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated") == Boolean.TRUE)) {
            synchronized (this) {
                p = C4015c.m11709P0(aVar, p, true);
            }
        }
        return p;
    }
}
