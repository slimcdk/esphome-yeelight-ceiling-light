package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.common.internal.C1577j;
import com.google.android.gms.common.stats.C1640a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p032c.p034b.C0574d;

/* renamed from: com.google.android.gms.common.internal.k0 */
final class C1581k0 extends C1577j implements Handler.Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: c */
    public final HashMap<C1577j.C1578a, C1583l0> f3055c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f3056d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f3057e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1640a f3058f;

    /* renamed from: g */
    private final long f3059g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f3060h;

    C1581k0(Context context) {
        this.f3056d = context.getApplicationContext();
        this.f3057e = new C0574d(context.getMainLooper(), this);
        this.f3058f = C1640a.m4551b();
        this.f3059g = 5000;
        this.f3060h = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo11230c(C1577j.C1578a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C1609u.m4476l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3055c) {
            C1583l0 l0Var = this.f3055c.get(aVar);
            if (l0Var == null) {
                l0Var = new C1583l0(this, aVar);
                l0Var.mo11253e(serviceConnection, str);
                l0Var.mo11256h(str);
                this.f3055c.put(aVar, l0Var);
            } else {
                this.f3057e.removeMessages(0, aVar);
                if (!l0Var.mo11254f(serviceConnection)) {
                    l0Var.mo11253e(serviceConnection, str);
                    int c = l0Var.mo11251c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(l0Var.mo11250b(), l0Var.mo11249a());
                    } else if (c == 2) {
                        l0Var.mo11256h(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = l0Var.mo11252d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo11231d(C1577j.C1578a aVar, ServiceConnection serviceConnection, String str) {
        C1609u.m4476l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3055c) {
            C1583l0 l0Var = this.f3055c.get(aVar);
            if (l0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (l0Var.mo11254f(serviceConnection)) {
                l0Var.mo11255g(serviceConnection, str);
                if (l0Var.mo11258j()) {
                    this.f3057e.sendMessageDelayed(this.f3057e.obtainMessage(0, aVar), this.f3059g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f3055c) {
                C1577j.C1578a aVar = (C1577j.C1578a) message.obj;
                C1583l0 l0Var = this.f3055c.get(aVar);
                if (l0Var != null && l0Var.mo11258j()) {
                    if (l0Var.mo11252d()) {
                        l0Var.mo11257i("GmsClientSupervisor");
                    }
                    this.f3055c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f3055c) {
                C1577j.C1578a aVar2 = (C1577j.C1578a) message.obj;
                C1583l0 l0Var2 = this.f3055c.get(aVar2);
                if (l0Var2 != null && l0Var2.mo11251c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    ComponentName b = l0Var2.mo11250b();
                    if (b == null) {
                        b = aVar2.mo11232a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo11233b(), EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    l0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
