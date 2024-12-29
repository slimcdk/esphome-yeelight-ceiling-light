package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
final class C1577c7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f1982a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f1983b;

    C1577c7(C1791t7 t7Var, Bundle bundle) {
        this.f1983b = t7Var;
        this.f1982a = bundle;
    }

    public final void run() {
        C1791t7 t7Var = this.f1983b;
        Bundle bundle = this.f1982a;
        t7Var.mo14009h();
        t7Var.mo14020i();
        C0917i.m1419j(bundle);
        String f = C0917i.m1415f(bundle.getString("name"));
        if (!t7Var.f2143a.mo14395o()) {
            t7Var.f2143a.mo14228b().mo14039v().mo14693a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzlo zzlo = new zzlo(f, 0, (Object) null, "");
        try {
            zzac zzac = r4;
            zzac zzac2 = new zzac(bundle.getString(Constants.APP_ID), "", zzlo, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (zzaw) null, bundle.getLong("trigger_timeout"), (zzaw) null, bundle.getLong("time_to_live"), t7Var.f2143a.mo14382N().mo14687w0(bundle.getString(Constants.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            t7Var.f2143a.mo14380L().mo14284s(zzac);
        } catch (IllegalArgumentException unused) {
        }
    }
}
