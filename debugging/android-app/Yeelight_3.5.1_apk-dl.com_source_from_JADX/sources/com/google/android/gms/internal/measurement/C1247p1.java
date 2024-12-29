package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.internal.measurement.p1 */
final class C1247p1 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ String f1492e;

    /* renamed from: f */
    final /* synthetic */ String f1493f;

    /* renamed from: g */
    final /* synthetic */ Bundle f1494g;

    /* renamed from: h */
    final /* synthetic */ C1296s2 f1495h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1247p1(C1296s2 s2Var, String str, String str2, Bundle bundle) {
        super(s2Var, true);
        this.f1495h = s2Var;
        this.f1492e = str;
        this.f1493f = str2;
        this.f1494g = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        ((C1071e1) C0917i.m1419j(this.f1495h.f1594h)).clearConditionalUserProperty(this.f1492e, this.f1493f, this.f1494g);
    }
}
