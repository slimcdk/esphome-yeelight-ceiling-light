package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
final class C0779g0 extends C0860x0 {

    /* renamed from: b */
    final /* synthetic */ ConnectionResult f634b;

    /* renamed from: c */
    final /* synthetic */ C0789i0 f635c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0779g0(C0789i0 i0Var, C0856w0 w0Var, ConnectionResult connectionResult) {
        super(w0Var);
        this.f635c = i0Var;
        this.f634b = connectionResult;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo11906a() {
        this.f635c.f658c.m1012l(this.f634b);
    }
}
