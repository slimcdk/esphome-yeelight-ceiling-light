package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
final class C1088f2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ C1136i2 f1320e;

    /* renamed from: f */
    final /* synthetic */ C1296s2 f1321f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1088f2(C1296s2 s2Var, C1136i2 i2Var) {
        super(s2Var, true);
        this.f1321f = s2Var;
        this.f1320e = i2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1321f.f1594h)).registerOnMeasurementEventListener(this.f1320e);
    }
}
