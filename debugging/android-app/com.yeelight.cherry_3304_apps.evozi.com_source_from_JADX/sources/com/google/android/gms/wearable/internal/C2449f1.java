package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.internal.C1445i;
import com.google.android.gms.common.api.internal.C1456k;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.android.gms.wearable.internal.f1 */
final class C2449f1 extends C1456k<C2450f2, MessageClient.C2417a> {

    /* renamed from: d */
    private final MessageClient.C2417a f4873d;

    /* renamed from: e */
    private final IntentFilter[] f4874e;

    /* renamed from: f */
    private final C1445i<MessageApi.C2415a> f4875f;

    private C2449f1(MessageClient.C2417a aVar, IntentFilter[] intentFilterArr, C1445i<MessageClient.C2417a> iVar) {
        super(iVar);
        this.f4873d = aVar;
        this.f4874e = intentFilterArr;
        this.f4875f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ void mo10979d(C1382a.C1384b bVar, C0620i iVar) {
        ((C2450f2) bVar).mo13304s0(new C2517y1(iVar), this.f4873d, this.f4875f, this.f4874e);
    }
}
