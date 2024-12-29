package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.internal.C0838s;
import com.google.android.gms.tasks.C1872a;

/* renamed from: com.google.android.gms.common.api.internal.j2 */
final class C0798j2 extends C0838s {

    /* renamed from: d */
    final /* synthetic */ C0838s.C0839a f676d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0798j2(C0838s.C0839a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f676d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12017b(C0722a.C0724b bVar, C1872a aVar) {
        this.f676d.f770a.accept(bVar, aVar);
    }
}
