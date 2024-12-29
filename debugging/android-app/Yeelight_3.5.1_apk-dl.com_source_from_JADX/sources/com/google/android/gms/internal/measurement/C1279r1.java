package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
final class C1279r1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Activity f1565e;

    /* renamed from: f */
    final /* synthetic */ String f1566f;

    /* renamed from: g */
    final /* synthetic */ String f1567g;

    /* renamed from: h */
    final /* synthetic */ C1296s2 f1568h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1279r1(C1296s2 s2Var, Activity activity, String str, String str2) {
        super(s2Var, true);
        this.f1568h = s2Var;
        this.f1565e = activity;
        this.f1566f = str;
        this.f1567g = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1568h.f1594h)).setCurrentScreen(C3157b.m8427T(this.f1565e), this.f1566f, this.f1567g, this.f1359a);
    }
}
