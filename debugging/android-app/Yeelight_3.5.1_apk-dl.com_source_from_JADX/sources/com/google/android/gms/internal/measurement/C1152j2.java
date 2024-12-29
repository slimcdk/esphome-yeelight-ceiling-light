package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;
import p032f0.C3157b;

/* renamed from: com.google.android.gms.internal.measurement.j2 */
final class C1152j2 extends C1120h2 {

    /* renamed from: e */
    final /* synthetic */ Bundle f1382e;

    /* renamed from: f */
    final /* synthetic */ Activity f1383f;

    /* renamed from: g */
    final /* synthetic */ C1280r2 f1384g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1152j2(C1280r2 r2Var, Bundle bundle, Activity activity) {
        super(r2Var.f1569a, true);
        this.f1384g = r2Var;
        this.f1382e = bundle;
        this.f1383f = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12515b() {
        Bundle bundle;
        if (this.f1382e != null) {
            bundle = new Bundle();
            if (this.f1382e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f1382e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C1071e1) C0917i.m1419j(this.f1384g.f1569a.f1594h)).onActivityCreated(C3157b.m8427T(this.f1383f), bundle, this.f1360b);
    }
}
