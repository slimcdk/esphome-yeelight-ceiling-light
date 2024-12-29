package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0897c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
final class C0784h0 extends C0860x0 {

    /* renamed from: b */
    final /* synthetic */ C0897c.C0900c f643b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0784h0(C0789i0 i0Var, C0856w0 w0Var, C0897c.C0900c cVar) {
        super(w0Var);
        this.f643b = cVar;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo11906a() {
        this.f643b.mo11950a(new ConnectionResult(16, (PendingIntent) null));
    }
}
