package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C0894a0 extends C0927r {

    /* renamed from: g */
    final /* synthetic */ C0897c f972g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C0894a0(C0897c cVar, @Nullable int i, Bundle bundle) {
        super(cVar, i, (Bundle) null);
        this.f972g = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo12188f(ConnectionResult connectionResult) {
        if (!this.f972g.mo12234v() || !C0897c.m1303j0(this.f972g)) {
            this.f972g.f990o.mo11950a(connectionResult);
            this.f972g.mo12205N(connectionResult);
            return;
        }
        C0897c.m1300f0(this.f972g, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo12189g() {
        this.f972g.f990o.mo11950a(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
