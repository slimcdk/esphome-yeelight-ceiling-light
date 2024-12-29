package com.google.p107ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.ar.core.s0 */
final class C2663s0 extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C2656o0 f5151a;

    /* renamed from: b */
    private final /* synthetic */ C2652m0 f5152b;

    C2663s0(C2652m0 m0Var, C2656o0 o0Var) {
        this.f5152b = m0Var;
        this.f5151a = o0Var;
    }

    public final void onReceive(Context context, Intent intent) {
        C2656o0 o0Var;
        C2650l0 l0Var;
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            this.f5152b.m8199p();
            int i = extras.getInt("install.status");
            if (i == 1 || i == 2 || i == 3) {
                o0Var = this.f5151a;
                l0Var = C2650l0.ACCEPTED;
            } else if (i == 4) {
                o0Var = this.f5151a;
                l0Var = C2650l0.COMPLETED;
            } else if (i == 6) {
                this.f5151a.mo15207a(C2650l0.CANCELLED);
                return;
            } else {
                return;
            }
            o0Var.mo15207a(l0Var);
        }
    }
}
