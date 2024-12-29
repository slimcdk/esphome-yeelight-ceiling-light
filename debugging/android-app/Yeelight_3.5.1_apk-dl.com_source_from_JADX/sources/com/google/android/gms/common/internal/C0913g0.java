package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.stats.C0956a;
import com.google.android.gms.internal.common.C0999l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p109w.C3839f0;
import p109w.C3841g0;

/* renamed from: com.google.android.gms.common.internal.g0 */
final class C0913g0 extends C0909f {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")

    /* renamed from: f */
    public final HashMap f1031f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f1032g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f1033h;

    /* renamed from: i */
    private final C0910f0 f1034i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0956a f1035j;

    /* renamed from: k */
    private final long f1036k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f1037l;

    C0913g0(Context context, Looper looper) {
        C0910f0 f0Var = new C0910f0(this, (C3841g0) null);
        this.f1034i = f0Var;
        this.f1032g = context.getApplicationContext();
        this.f1033h = new C0999l(looper, f0Var);
        this.f1035j = C0956a.m1580b();
        this.f1036k = 5000;
        this.f1037l = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo12274d(C3839f0 f0Var, ServiceConnection serviceConnection, String str) {
        C0917i.m1420k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1031f) {
            C0908e0 e0Var = (C0908e0) this.f1031f.get(f0Var);
            if (e0Var == null) {
                String obj = f0Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (e0Var.mo12269h(serviceConnection)) {
                e0Var.mo12267f(serviceConnection, str);
                if (e0Var.mo12270i()) {
                    this.f1033h.sendMessageDelayed(this.f1033h.obtainMessage(0, f0Var), this.f1036k);
                }
            } else {
                String obj2 = f0Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12276f(C3839f0 f0Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        boolean j;
        C0917i.m1420k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1031f) {
            C0908e0 e0Var = (C0908e0) this.f1031f.get(f0Var);
            if (e0Var == null) {
                e0Var = new C0908e0(this, f0Var);
                e0Var.mo12265d(serviceConnection, serviceConnection, str);
                e0Var.mo12266e(str, executor);
                this.f1031f.put(f0Var, e0Var);
            } else {
                this.f1033h.removeMessages(0, f0Var);
                if (!e0Var.mo12269h(serviceConnection)) {
                    e0Var.mo12265d(serviceConnection, serviceConnection, str);
                    int a = e0Var.mo12262a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(e0Var.mo12263b(), e0Var.mo12264c());
                    } else if (a == 2) {
                        e0Var.mo12266e(str, executor);
                    }
                } else {
                    String obj = f0Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = e0Var.mo12271j();
        }
        return j;
    }
}
