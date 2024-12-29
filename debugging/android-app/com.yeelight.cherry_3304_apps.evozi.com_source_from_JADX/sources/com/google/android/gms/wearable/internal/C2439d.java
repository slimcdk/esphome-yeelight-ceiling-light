package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1456k;
import com.google.android.gms.wearable.C2418a;
import com.google.android.gms.wearable.CapabilityClient;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.wearable.internal.d */
final class C2439d extends C1456k<C2450f2, CapabilityClient.C2412a> {

    /* renamed from: d */
    private final CapabilityClient.C2412a f4867d;

    /* renamed from: e */
    private final IntentFilter[] f4868e;

    /* renamed from: f */
    private final C1445i<C2418a> f4869f;

    private C2439d(CapabilityClient.C2412a aVar, IntentFilter[] intentFilterArr, C1445i<CapabilityClient.C2412a> iVar) {
        super(iVar);
        this.f4867d = aVar;
        this.f4868e = intentFilterArr;
        this.f4869f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo10979d(C1382a.C1384b bVar, C0620i iVar) {
        ((C2450f2) bVar).mo13300o0(new C2517y1(iVar), this.f4867d, this.f4869f, this.f4868e);
    }
}
