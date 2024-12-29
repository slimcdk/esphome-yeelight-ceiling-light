package com.google.p017ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.ar.core.l0 */
final class C2042l0 extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C2034h0 f3198a;

    /* renamed from: b */
    private final /* synthetic */ C2030f0 f3199b;

    C2042l0(C2030f0 f0Var, C2034h0 h0Var) {
        this.f3199b = f0Var;
        this.f3198a = h0Var;
    }

    public final void onReceive(Context context, Intent intent) {
        C2034h0 h0Var;
        C2047o oVar;
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            this.f3199b.m5136p();
            int i = extras.getInt("install.status");
            if (i == 1 || i == 2 || i == 3) {
                h0Var = this.f3198a;
                oVar = C2047o.ACCEPTED;
            } else if (i == 4) {
                h0Var = this.f3198a;
                oVar = C2047o.COMPLETED;
            } else if (i == 6) {
                this.f3198a.mo16646a(C2047o.CANCELLED);
                return;
            } else {
                return;
            }
            h0Var.mo16646a(oVar);
        }
    }
}
