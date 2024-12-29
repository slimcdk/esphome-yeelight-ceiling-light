package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917i;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
public final class C0764d0 implements C0856w0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0868z0 f600a;

    /* renamed from: b */
    private boolean f601b = false;

    public C0764d0(C0868z0 z0Var) {
        this.f600a = z0Var;
    }

    /* renamed from: a */
    public final void mo11935a(@Nullable Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo11936b() {
        if (this.f601b) {
            this.f601b = false;
            this.f600a.mo12105o(new C0759c0(this, this));
        }
    }

    /* renamed from: c */
    public final void mo11937c(ConnectionResult connectionResult, C0722a aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo11938d(int i) {
        this.f600a.mo12104n((ConnectionResult) null);
        this.f600a.f876n.mo12019b(i, this.f601b);
    }

    /* renamed from: e */
    public final void mo11939e() {
    }

    /* renamed from: f */
    public final C0763d mo11940f(C0763d dVar) {
        mo11942h(dVar);
        return dVar;
    }

    /* renamed from: g */
    public final boolean mo11941g() {
        if (this.f601b) {
            return false;
        }
        Set<C0824o2> set = this.f600a.f875m.f830w;
        if (set == null || set.isEmpty()) {
            this.f600a.mo12104n((ConnectionResult) null);
            return true;
        }
        this.f601b = true;
        for (C0824o2 f : set) {
            f.mo12055f();
        }
        return false;
    }

    /* renamed from: h */
    public final C0763d mo11942h(C0763d dVar) {
        try {
            this.f600a.f875m.f831x.mo12062a(dVar);
            C0852v0 v0Var = this.f600a.f875m;
            C0722a.C0730f fVar = (C0722a.C0730f) v0Var.f822o.get(dVar.mo11931s());
            C0917i.m1420k(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f600a.f869g.containsKey(dVar.mo11931s())) {
                dVar.mo11933u(fVar);
            } else {
                dVar.mo11934w(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f600a.mo12105o(new C0753b0(this, this));
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo11943j() {
        if (this.f601b) {
            this.f601b = false;
            this.f600a.f875m.f831x.mo12063b();
            mo11941g();
        }
    }
}
