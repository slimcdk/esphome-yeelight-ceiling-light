package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C1550d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
final class C1419c0 extends C1478q0 {

    /* renamed from: b */
    private final /* synthetic */ C1550d.C1553c f2624b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1419c0(C1410a0 a0Var, C1472o0 o0Var, C1550d.C1553c cVar) {
        super(o0Var);
        this.f2624b = cVar;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo10883a() {
        this.f2624b.mo10937a(new ConnectionResult(16, (PendingIntent) null));
    }
}
