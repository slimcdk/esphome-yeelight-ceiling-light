package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C1564b7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f1952a;

    /* renamed from: b */
    final /* synthetic */ C1791t7 f1953b;

    C1564b7(C1791t7 t7Var, Bundle bundle) {
        this.f1953b = t7Var;
        this.f1952a = bundle;
    }

    public final void run() {
        C1791t7 t7Var = this.f1953b;
        Bundle bundle = this.f1952a;
        t7Var.mo14009h();
        t7Var.mo14020i();
        C0917i.m1419j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C0917i.m1415f(string);
        C0917i.m1415f(string2);
        C0917i.m1419j(bundle.get("value"));
        if (!t7Var.f2143a.mo14395o()) {
            t7Var.f2143a.mo14228b().mo14039v().mo14693a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlo zzlo = new zzlo(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw w0 = t7Var.f2143a.mo14382N().mo14687w0(bundle.getString(Constants.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            zzaw w02 = t7Var.f2143a.mo14382N().mo14687w0(bundle.getString(Constants.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzaw w03 = t7Var.f2143a.mo14382N().mo14687w0(bundle.getString(Constants.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            t7Var.f2143a.mo14380L().mo14284s(new zzac(bundle.getString(Constants.APP_ID), string2, zzlo, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), w02, bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), w03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
