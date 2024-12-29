package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* renamed from: com.google.android.gms.wearable.internal.a1 */
final class C2429a1 extends C2490p2<MessageApi.C2416b> {

    /* renamed from: s */
    private final /* synthetic */ String f4860s;

    /* renamed from: t */
    private final /* synthetic */ String f4861t;

    /* renamed from: u */
    private final /* synthetic */ byte[] f4862u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2429a1(C2519z0 z0Var, C1399f fVar, String str, String str2, byte[] bArr) {
        super(fVar);
        this.f4860s = str;
        this.f4861t = str2;
        this.f4862u = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ C1507j mo10844e(Status status) {
        return new C2433b1(status, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ void mo10889s(C1382a.C1384b bVar) {
        ((C2504u0) ((C2450f2) bVar).mo11144E()).mo13377p(new C2446e2(this), this.f4860s, this.f4861t, this.f4862u);
    }
}
