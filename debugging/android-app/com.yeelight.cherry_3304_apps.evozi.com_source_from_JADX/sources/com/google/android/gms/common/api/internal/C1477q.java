package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1403g;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C1477q implements C1403g.C1404a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f2799a;

    /* renamed from: b */
    private final /* synthetic */ C1474p f2800b;

    C1477q(C1474p pVar, BasePendingResult basePendingResult) {
        this.f2800b = pVar;
        this.f2799a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo10841a(Status status) {
        this.f2800b.f2782a.remove(this.f2799a);
    }
}
