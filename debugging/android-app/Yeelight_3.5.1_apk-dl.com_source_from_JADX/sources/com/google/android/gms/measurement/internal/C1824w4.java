package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
public final class C1824w4 {

    /* renamed from: a */
    private final C1812v4 f2743a;

    public C1824w4(C1812v4 v4Var) {
        C0917i.m1419j(v4Var);
        this.f2743a = v4Var;
    }

    @MainThread
    /* renamed from: a */
    public final void mo14620a(Context context, Intent intent) {
        C1717n5 H = C1717n5.m4485H(context, (zzcl) null, (Long) null);
        C1574c4 b = H.mo14228b();
        if (intent == null) {
            b.mo14040w().mo14693a("Receiver called with null intent");
            return;
        }
        H.mo14230d();
        String action = intent.getAction();
        b.mo14039v().mo14694b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.mo14039v().mo14693a("Starting wakeful intent.");
            this.f2743a.mo13986a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.mo14040w().mo14693a("Install Referrer Broadcasts are deprecated");
        }
    }
}
