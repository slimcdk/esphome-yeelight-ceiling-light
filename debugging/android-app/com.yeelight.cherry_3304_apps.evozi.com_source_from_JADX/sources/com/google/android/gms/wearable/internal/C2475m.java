package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.C2423f;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: com.google.android.gms.wearable.internal.m */
final class C2475m extends C2490p2<Object> {

    /* renamed from: s */
    private final /* synthetic */ PutDataRequest f4902s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2475m(C2471l lVar, C1399f fVar, PutDataRequest putDataRequest) {
        super(fVar);
        this.f4902s = putDataRequest;
    }

    /* renamed from: e */
    public final /* synthetic */ C1507j mo10844e(Status status) {
        return new C2479n(status, (C2423f) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ void mo10889s(C1382a.C1384b bVar) {
        ((C2450f2) bVar).mo13305t0(this, this.f4902s);
    }
}
