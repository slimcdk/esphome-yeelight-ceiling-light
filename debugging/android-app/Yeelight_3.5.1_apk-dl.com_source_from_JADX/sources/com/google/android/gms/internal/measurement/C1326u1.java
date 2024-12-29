package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
final class C1326u1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1659e;

    /* renamed from: f */
    final /* synthetic */ C1296s2 f1660f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1326u1(C1296s2 s2Var, String str) {
        super(s2Var, true);
        this.f1660f = s2Var;
        this.f1659e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1660f.f1594h)).endAdUnitExposure(this.f1659e, this.f1360b);
    }
}
