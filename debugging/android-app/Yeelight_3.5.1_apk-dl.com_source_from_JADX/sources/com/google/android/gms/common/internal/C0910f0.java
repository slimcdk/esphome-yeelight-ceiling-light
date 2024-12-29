package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import androidx.core.p007os.EnvironmentCompat;
import p109w.C3839f0;
import p109w.C3841g0;

/* renamed from: com.google.android.gms.common.internal.f0 */
final class C0910f0 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C0913g0 f1030a;

    /* synthetic */ C0910f0(C0913g0 g0Var, C3841g0 g0Var2) {
        this.f1030a = g0Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f1030a.f1031f) {
                C3839f0 f0Var = (C3839f0) message.obj;
                C0908e0 e0Var = (C0908e0) this.f1030a.f1031f.get(f0Var);
                if (e0Var != null && e0Var.mo12270i()) {
                    if (e0Var.mo12271j()) {
                        e0Var.mo12268g("GmsClientSupervisor");
                    }
                    this.f1030a.f1031f.remove(f0Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f1030a.f1031f) {
                C3839f0 f0Var2 = (C3839f0) message.obj;
                C0908e0 e0Var2 = (C0908e0) this.f1030a.f1031f.get(f0Var2);
                if (e0Var2 != null && e0Var2.mo12262a() == 3) {
                    String valueOf = String.valueOf(f0Var2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    new Exception();
                    ComponentName b = e0Var2.mo12263b();
                    if (b == null) {
                        b = f0Var2.mo26311b();
                    }
                    if (b == null) {
                        String d = f0Var2.mo26313d();
                        C0917i.m1419j(d);
                        b = new ComponentName(d, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    e0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
