package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.internal.C0820o;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.a2 */
final class C0750a2 extends C0815n {

    /* renamed from: e */
    final /* synthetic */ C0820o.C0821a f575e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0750a2(C0820o.C0821a aVar, C0793j jVar, Feature[] featureArr, boolean z, int i) {
        super(jVar, featureArr, z, i);
        this.f575e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo11901d(C0722a.C0724b bVar, C1872a<Void> aVar) {
        this.f575e.f720a.accept(bVar, aVar);
    }
}
