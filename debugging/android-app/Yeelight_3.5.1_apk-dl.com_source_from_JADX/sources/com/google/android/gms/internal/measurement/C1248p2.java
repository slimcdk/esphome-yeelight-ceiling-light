package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
final class C1248p2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Activity f1496e;

    /* renamed from: f */
    final /* synthetic */ C1007a1 f1497f;

    /* renamed from: g */
    final /* synthetic */ C1280r2 f1498g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1248p2(C1280r2 r2Var, Activity activity, C1007a1 a1Var) {
        super(r2Var.f1569a, true);
        this.f1498g = r2Var;
        this.f1496e = activity;
        this.f1497f = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1498g.f1569a.f1594h)).onActivitySaveInstanceState(C3157b.m8427T(this.f1496e), this.f1497f, this.f1360b);
    }
}
