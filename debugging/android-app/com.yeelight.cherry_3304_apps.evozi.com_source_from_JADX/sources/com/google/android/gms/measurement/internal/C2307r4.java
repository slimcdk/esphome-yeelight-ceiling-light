package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.C1751d5;
import com.google.android.gms.internal.measurement.C1778f2;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final class C2307r4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f4556a;

    /* renamed from: b */
    final /* synthetic */ C2318s4 f4557b;

    C2307r4(C2318s4 s4Var, String str) {
        this.f4557b = s4Var;
        this.f4556a = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f4557b.f4578a.mo12427b().mo13099J().mo13130a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C1778f2 c = C1751d5.m4969c(iBinder);
            if (c == null) {
                this.f4557b.f4578a.mo12427b().mo13099J().mo13130a("Install Referrer Service implementation was not found");
                return;
            }
            this.f4557b.f4578a.mo12427b().mo13104O().mo13130a("Install Referrer Service connected");
            this.f4557b.f4578a.mo12426a().mo13122y(new C2340u4(this, c, this));
        } catch (Exception e) {
            this.f4557b.f4578a.mo12427b().mo13099J().mo13131b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4557b.f4578a.mo12427b().mo13104O().mo13130a("Install Referrer Service disconnected");
    }
}
