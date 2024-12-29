package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.k2 */
final class C1168k2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Activity f1390e;

    /* renamed from: f */
    final /* synthetic */ C1280r2 f1391f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1168k2(C1280r2 r2Var, Activity activity) {
        super(r2Var.f1569a, true);
        this.f1391f = r2Var;
        this.f1390e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1391f.f1569a.f1594h)).onActivityStarted(C3157b.m8427T(this.f1390e), this.f1360b);
    }
}
