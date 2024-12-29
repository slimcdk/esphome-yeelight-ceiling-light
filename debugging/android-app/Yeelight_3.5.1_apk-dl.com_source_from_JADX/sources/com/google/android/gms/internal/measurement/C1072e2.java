package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.e2 */
final class C1072e2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ boolean f1296e;

    /* renamed from: f */
    final /* synthetic */ C1296s2 f1297f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1072e2(C1296s2 s2Var, boolean z) {
        super(s2Var, true);
        this.f1297f = s2Var;
        this.f1296e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1297f.f1594h)).setDataCollectionEnabled(this.f1296e);
    }
}
