package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.util.VisibleForTesting;
import p109w.C3833d;

@VisibleForTesting
/* renamed from: com.google.android.gms.common.internal.y */
public final class C0934y implements ServiceConnection {

    /* renamed from: a */
    private final int f1070a;

    /* renamed from: b */
    final /* synthetic */ C0897c f1071b;

    public C0934y(C0897c cVar, int i) {
        this.f1071b = cVar;
        this.f1070a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0897c cVar = this.f1071b;
        if (iBinder == null) {
            C0897c.m1300f0(cVar, 16);
            return;
        }
        synchronized (cVar.f988m) {
            C0897c cVar2 = this.f1071b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f989n = (queryLocalInterface == null || !(queryLocalInterface instanceof C3833d)) ? new C0928s(iBinder) : (C3833d) queryLocalInterface;
        }
        this.f1071b.mo12222g0(0, (Bundle) null, this.f1070a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1071b.f988m) {
            this.f1071b.f989n = null;
        }
        Handler handler = this.f1071b.f986k;
        handler.sendMessage(handler.obtainMessage(6, this.f1070a, 1));
    }
}
