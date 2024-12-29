package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.C1278r0;
import com.google.android.gms.internal.measurement.C1294s0;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C1788t4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f2671a;

    /* renamed from: b */
    final /* synthetic */ C1800u4 f2672b;

    C1788t4(C1800u4 u4Var, String str) {
        this.f2672b = u4Var;
        this.f2671a = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C1294s0 e = C1278r0.m2598e(iBinder);
                if (e == null) {
                    this.f2672b.f2703a.mo14228b().mo14040w().mo14693a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f2672b.f2703a.mo14228b().mo14039v().mo14693a("Install Referrer Service connected");
                this.f2672b.f2703a.mo14227a().mo14310z(new C1776s4(this, e, this));
            } catch (RuntimeException e2) {
                this.f2672b.f2703a.mo14228b().mo14040w().mo14694b("Exception occurred while calling Install Referrer API", e2);
            }
        } else {
            this.f2672b.f2703a.mo14228b().mo14040w().mo14693a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2672b.f2703a.mo14228b().mo14039v().mo14693a("Install Referrer Service disconnected");
    }
}
