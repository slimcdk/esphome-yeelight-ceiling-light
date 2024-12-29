package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1456k;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.wearable.internal.q */
final class C2491q extends C1456k<C2450f2, DataClient.C2414a> {

    /* renamed from: d */
    private final DataClient.C2414a f4909d;

    /* renamed from: e */
    private final IntentFilter[] f4910e;

    /* renamed from: f */
    private final C1445i<DataApi.C2413a> f4911f;

    private C2491q(DataClient.C2414a aVar, IntentFilter[] intentFilterArr, C1445i<DataClient.C2414a> iVar) {
        super(iVar);
        this.f4909d = aVar;
        this.f4910e = intentFilterArr;
        this.f4911f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo10979d(C1382a.C1384b bVar, C0620i iVar) {
        ((C2450f2) bVar).mo13302q0(new C2517y1(iVar), this.f4909d, this.f4911f, this.f4910e);
    }
}
