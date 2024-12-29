package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0741f;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.v */
final class C0851v implements C0741f.C0742a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f807a;

    /* renamed from: b */
    final /* synthetic */ C0859x f808b;

    C0851v(C0859x xVar, BasePendingResult basePendingResult) {
        this.f808b = xVar;
        this.f807a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo11877a(Status status) {
        this.f808b.f843a.remove(this.f807a);
    }
}
