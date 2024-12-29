package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.common.api.internal.d2 */
public final class C1425d2 implements C1399f.C1401b, C1399f.C1402c {

    /* renamed from: a */
    public final C1382a<?> f2627a;

    /* renamed from: b */
    private final boolean f2628b;

    /* renamed from: c */
    private C1432e2 f2629c;

    public C1425d2(C1382a<?> aVar, boolean z) {
        this.f2627a = aVar;
        this.f2628b = z;
    }

    /* renamed from: d */
    private final void m3739d() {
        C1609u.m4476l(this.f2629c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void mo10836a(int i) {
        m3739d();
        this.f2629c.mo10836a(i);
    }

    /* renamed from: b */
    public final void mo10904b(C1432e2 e2Var) {
        this.f2629c = e2Var;
    }

    /* renamed from: c */
    public final void mo10837c(@Nullable Bundle bundle) {
        m3739d();
        this.f2629c.mo10837c(bundle);
    }

    /* renamed from: f */
    public final void mo10838f(@NonNull ConnectionResult connectionResult) {
        m3739d();
        this.f2629c.mo10923e(connectionResult, this.f2627a, this.f2628b);
    }
}
