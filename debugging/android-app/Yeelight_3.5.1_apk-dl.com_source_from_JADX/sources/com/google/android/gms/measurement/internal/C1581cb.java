package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1167k1;

/* renamed from: com.google.android.gms.measurement.internal.cb */
final class C1581cb implements C1742p6 {

    /* renamed from: a */
    public final C1167k1 f1994a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f1995b;

    C1581cb(AppMeasurementDynamiteService appMeasurementDynamiteService, C1167k1 k1Var) {
        this.f1995b = appMeasurementDynamiteService;
        this.f1994a = k1Var;
    }

    /* renamed from: a */
    public final void mo14049a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f1994a.mo12872g(str, str2, bundle, j);
        } catch (RemoteException e) {
            C1717n5 n5Var = this.f1995b.f1908a;
            if (n5Var != null) {
                n5Var.mo14228b().mo14040w().mo14694b("Event listener threw exception", e);
            }
        }
    }
}
