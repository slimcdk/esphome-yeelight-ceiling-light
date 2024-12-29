package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.o2 */
final class C1232o2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Activity f1456e;

    /* renamed from: f */
    final /* synthetic */ C1280r2 f1457f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1232o2(C1280r2 r2Var, Activity activity) {
        super(r2Var.f1569a, true);
        this.f1457f = r2Var;
        this.f1456e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1457f.f1569a.f1594h)).onActivityStopped(C3157b.m8427T(this.f1456e), this.f1360b);
    }
}
