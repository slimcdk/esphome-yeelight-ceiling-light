package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1577j;
import com.google.android.gms.common.stats.C1640a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.l0 */
final class C1583l0 implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f3063a = new HashSet();

    /* renamed from: b */
    private int f3064b = 2;

    /* renamed from: c */
    private boolean f3065c;

    /* renamed from: d */
    private IBinder f3066d;

    /* renamed from: e */
    private final C1577j.C1578a f3067e;

    /* renamed from: f */
    private ComponentName f3068f;

    /* renamed from: g */
    private final /* synthetic */ C1581k0 f3069g;

    public C1583l0(C1581k0 k0Var, C1577j.C1578a aVar) {
        this.f3069g = k0Var;
        this.f3067e = aVar;
    }

    /* renamed from: a */
    public final IBinder mo11249a() {
        return this.f3066d;
    }

    /* renamed from: b */
    public final ComponentName mo11250b() {
        return this.f3068f;
    }

    /* renamed from: c */
    public final int mo11251c() {
        return this.f3064b;
    }

    /* renamed from: d */
    public final boolean mo11252d() {
        return this.f3065c;
    }

    /* renamed from: e */
    public final void mo11253e(ServiceConnection serviceConnection, String str) {
        C1640a unused = this.f3069g.f3058f;
        Context unused2 = this.f3069g.f3056d;
        this.f3067e.mo11234c(this.f3069g.f3056d);
        this.f3063a.add(serviceConnection);
    }

    /* renamed from: f */
    public final boolean mo11254f(ServiceConnection serviceConnection) {
        return this.f3063a.contains(serviceConnection);
    }

    /* renamed from: g */
    public final void mo11255g(ServiceConnection serviceConnection, String str) {
        C1640a unused = this.f3069g.f3058f;
        Context unused2 = this.f3069g.f3056d;
        this.f3063a.remove(serviceConnection);
    }

    /* renamed from: h */
    public final void mo11256h(String str) {
        this.f3064b = 3;
        boolean d = this.f3069g.f3058f.mo11372d(this.f3069g.f3056d, str, this.f3067e.mo11234c(this.f3069g.f3056d), this, this.f3067e.mo11235d());
        this.f3065c = d;
        if (d) {
            this.f3069g.f3057e.sendMessageDelayed(this.f3069g.f3057e.obtainMessage(1, this.f3067e), this.f3069g.f3060h);
            return;
        }
        this.f3064b = 2;
        try {
            this.f3069g.f3058f.mo11371c(this.f3069g.f3056d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: i */
    public final void mo11257i(String str) {
        this.f3069g.f3057e.removeMessages(1, this.f3067e);
        this.f3069g.f3058f.mo11371c(this.f3069g.f3056d, this);
        this.f3065c = false;
        this.f3064b = 2;
    }

    /* renamed from: j */
    public final boolean mo11258j() {
        return this.f3063a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3069g.f3055c) {
            this.f3069g.f3057e.removeMessages(1, this.f3067e);
            this.f3066d = iBinder;
            this.f3068f = componentName;
            for (ServiceConnection onServiceConnected : this.f3063a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3064b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3069g.f3055c) {
            this.f3069g.f3057e.removeMessages(1, this.f3067e);
            this.f3066d = null;
            this.f3068f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f3063a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3064b = 2;
        }
    }
}
