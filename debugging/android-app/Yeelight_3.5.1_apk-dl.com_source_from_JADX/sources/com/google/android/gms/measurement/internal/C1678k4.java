package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
final class C1678k4 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1770ra f2217a;

    /* renamed from: b */
    private boolean f2218b;

    /* renamed from: c */
    private boolean f2219c;

    static {
        Class<C1678k4> cls = C1678k4.class;
    }

    C1678k4(C1770ra raVar) {
        C0917i.m1419j(raVar);
        this.f2217a = raVar;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14301b() {
        this.f2217a.mo14476g();
        this.f2217a.mo14227a().mo14009h();
        if (!this.f2218b) {
            this.f2217a.mo14231f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f2219c = this.f2217a.mo14468X().mo14237m();
            this.f2217a.mo14228b().mo14039v().mo14694b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f2219c));
            this.f2218b = true;
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo14302c() {
        this.f2217a.mo14476g();
        this.f2217a.mo14227a().mo14009h();
        this.f2217a.mo14227a().mo14009h();
        if (this.f2218b) {
            this.f2217a.mo14228b().mo14039v().mo14693a("Unregistering connectivity change receiver");
            this.f2218b = false;
            this.f2219c = false;
            try {
                this.f2217a.mo14231f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f2217a.mo14228b().mo14035r().mo14694b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f2217a.mo14476g();
        String action = intent.getAction();
        this.f2217a.mo14228b().mo14039v().mo14694b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f2217a.mo14468X().mo14237m();
            if (this.f2219c != m) {
                this.f2219c = m;
                this.f2217a.mo14227a().mo14310z(new C1665j4(this, m));
                return;
            }
            return;
        }
        this.f2217a.mo14228b().mo14040w().mo14694b("NetworkBroadcastReceiver received unknown action", action);
    }
}
