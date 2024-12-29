package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
final class C1415b0 extends C1478q0 {

    /* renamed from: b */
    private final /* synthetic */ ConnectionResult f2618b;

    /* renamed from: c */
    private final /* synthetic */ C1410a0 f2619c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1415b0(C1410a0 a0Var, C1472o0 o0Var, ConnectionResult connectionResult) {
        super(o0Var);
        this.f2619c = a0Var;
        this.f2618b = connectionResult;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10883a() {
        this.f2619c.f2606c.m4041B(this.f2618b);
    }
}
