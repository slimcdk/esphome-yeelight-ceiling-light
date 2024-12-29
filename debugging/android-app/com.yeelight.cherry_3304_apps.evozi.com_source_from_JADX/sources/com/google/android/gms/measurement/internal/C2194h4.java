package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
class C2194h4 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2245l9 f4150a;

    /* renamed from: b */
    private boolean f4151b;

    /* renamed from: c */
    private boolean f4152c;

    static {
        Class<C2194h4> cls = C2194h4.class;
    }

    C2194h4(C2245l9 l9Var) {
        C1609u.m4475k(l9Var);
        this.f4150a = l9Var;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo12693b() {
        this.f4150a.mo12825b0();
        this.f4150a.mo12426a().mo12567h();
        if (!this.f4151b) {
            this.f4150a.mo12428c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f4152c = this.f4150a.mo12817S().mo12652x();
            this.f4150a.mo12427b().mo13104O().mo13131b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f4152c));
            this.f4151b = true;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo12694c() {
        this.f4150a.mo12825b0();
        this.f4150a.mo12426a().mo12567h();
        this.f4150a.mo12426a().mo12567h();
        if (this.f4151b) {
            this.f4150a.mo12427b().mo13104O().mo13130a("Unregistering connectivity change receiver");
            this.f4151b = false;
            this.f4152c = false;
            try {
                this.f4150a.mo12428c().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f4150a.mo12427b().mo13096F().mo13131b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.f4150a.mo12825b0();
        String action = intent.getAction();
        this.f4150a.mo12427b().mo13104O().mo13131b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean x = this.f4150a.mo12817S().mo12652x();
            if (this.f4152c != x) {
                this.f4152c = x;
                this.f4150a.mo12426a().mo13122y(new C2229k4(this, x));
                return;
            }
            return;
        }
        this.f4150a.mo12427b().mo13099J().mo13131b("NetworkBroadcastReceiver received unknown action", action);
    }
}
