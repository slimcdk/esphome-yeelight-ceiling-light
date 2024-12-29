package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0917i;
import p053k0.C3291f;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
final class C0816n0 implements C0736d.C0738b, C0736d.C0739c {

    /* renamed from: a */
    final /* synthetic */ C0831q0 f711a;

    /* synthetic */ C0816n0(C0831q0 q0Var, C0811m0 m0Var) {
        this.f711a = q0Var;
    }

    /* renamed from: c */
    public final void mo11948c(int i) {
    }

    /* renamed from: e */
    public final void mo11972e(@NonNull ConnectionResult connectionResult) {
        this.f711a.f742b.lock();
        try {
            if (this.f711a.m1017q(connectionResult)) {
                this.f711a.m1009i();
                this.f711a.m1014n();
            } else {
                this.f711a.m1012l(connectionResult);
            }
        } finally {
            this.f711a.f742b.unlock();
        }
    }

    /* renamed from: f */
    public final void mo11949f(@Nullable Bundle bundle) {
        C0904d dVar = (C0904d) C0917i.m1419j(this.f711a.f758r);
        ((C3291f) C0917i.m1419j(this.f711a.f751k)).mo14717j(new C0806l0(this.f711a));
    }
}
