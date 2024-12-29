package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.C1611v;

/* renamed from: com.google.android.gms.common.api.internal.u */
public final class C1489u implements C1472o0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1475p0 f2817a;

    /* renamed from: b */
    private boolean f2818b = false;

    public C1489u(C1475p0 p0Var) {
        this.f2817a = p0Var;
    }

    /* renamed from: a */
    public final void mo10957a(int i) {
        this.f2817a.mo11006n((ConnectionResult) null);
        this.f2817a.f2798o.mo10943c(i, this.f2818b);
    }

    /* renamed from: c */
    public final void mo10958c(Bundle bundle) {
    }

    public final void connect() {
        if (this.f2818b) {
            this.f2818b = false;
            this.f2817a.mo11002i(new C1495w(this, this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11016d() {
        if (this.f2818b) {
            this.f2818b = false;
            this.f2817a.f2797n.f2730y.mo11008a();
            disconnect();
        }
    }

    public final boolean disconnect() {
        if (this.f2818b) {
            return false;
        }
        if (this.f2817a.f2797n.mo10970t()) {
            this.f2818b = true;
            for (C1470n1 d : this.f2817a.f2797n.f2729x) {
                d.mo10995d();
            }
            return false;
        }
        this.f2817a.mo11006n((ConnectionResult) null);
        return true;
    }

    /* renamed from: e */
    public final void mo10961e(ConnectionResult connectionResult, C1382a<?> aVar, boolean z) {
    }

    /* renamed from: f */
    public final <A extends C1382a.C1384b, T extends C1418c<? extends C1507j, A>> T mo10962f(T t) {
        try {
            this.f2817a.f2797n.f2730y.mo11009b(t);
            C1453j0 j0Var = this.f2817a.f2797n;
            C1382a.C1390f fVar = j0Var.f2721p.get(t.mo10891u());
            C1609u.m4476l(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f2817a.f2790g.containsKey(t.mo10891u())) {
                boolean z = fVar instanceof C1611v;
                C1382a.C1384b bVar = fVar;
                if (z) {
                    bVar = ((C1611v) fVar).mo11289n0();
                }
                t.mo10893w(bVar);
                return t;
            }
            t.mo10894y(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f2817a.mo11002i(new C1492v(this, this));
        }
    }

    /* renamed from: g */
    public final <A extends C1382a.C1384b, R extends C1507j, T extends C1418c<R, A>> T mo10963g(T t) {
        mo10962f(t);
        return t;
    }

    /* renamed from: h */
    public final void mo10964h() {
    }
}
