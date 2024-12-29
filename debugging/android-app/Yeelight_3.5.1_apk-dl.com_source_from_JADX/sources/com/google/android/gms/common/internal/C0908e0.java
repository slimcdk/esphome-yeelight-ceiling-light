package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p014c0.C0624m;
import p109w.C3839f0;
import p109w.C3843h0;

/* renamed from: com.google.android.gms.common.internal.e0 */
final class C0908e0 implements ServiceConnection, C3843h0 {

    /* renamed from: a */
    private final Map f1018a = new HashMap();

    /* renamed from: b */
    private int f1019b = 2;

    /* renamed from: c */
    private boolean f1020c;
    @Nullable

    /* renamed from: d */
    private IBinder f1021d;

    /* renamed from: e */
    private final C3839f0 f1022e;

    /* renamed from: f */
    private ComponentName f1023f;

    /* renamed from: g */
    final /* synthetic */ C0913g0 f1024g;

    public C0908e0(C0913g0 g0Var, C3839f0 f0Var) {
        this.f1024g = g0Var;
        this.f1022e = f0Var;
    }

    /* renamed from: a */
    public final int mo12262a() {
        return this.f1019b;
    }

    /* renamed from: b */
    public final ComponentName mo12263b() {
        return this.f1023f;
    }

    @Nullable
    /* renamed from: c */
    public final IBinder mo12264c() {
        return this.f1021d;
    }

    /* renamed from: d */
    public final void mo12265d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f1018a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo12266e(String str, @Nullable Executor executor) {
        this.f1019b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C0624m.m232k()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C0913g0 g0Var = this.f1024g;
            boolean d = g0Var.f1035j.mo12425d(g0Var.f1032g, str, this.f1022e.mo26312c(g0Var.f1032g), this, this.f1022e.mo26310a(), executor);
            this.f1020c = d;
            if (d) {
                this.f1024g.f1033h.sendMessageDelayed(this.f1024g.f1033h.obtainMessage(1, this.f1022e), this.f1024g.f1037l);
            } else {
                this.f1019b = 2;
                try {
                    C0913g0 g0Var2 = this.f1024g;
                    g0Var2.f1035j.mo12424c(g0Var2.f1032g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo12267f(ServiceConnection serviceConnection, String str) {
        this.f1018a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo12268g(String str) {
        this.f1024g.f1033h.removeMessages(1, this.f1022e);
        C0913g0 g0Var = this.f1024g;
        g0Var.f1035j.mo12424c(g0Var.f1032g, this);
        this.f1020c = false;
        this.f1019b = 2;
    }

    /* renamed from: h */
    public final boolean mo12269h(ServiceConnection serviceConnection) {
        return this.f1018a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo12270i() {
        return this.f1018a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo12271j() {
        return this.f1020c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1024g.f1031f) {
            this.f1024g.f1033h.removeMessages(1, this.f1022e);
            this.f1021d = iBinder;
            this.f1023f = componentName;
            for (ServiceConnection onServiceConnected : this.f1018a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f1019b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1024g.f1031f) {
            this.f1024g.f1033h.removeMessages(1, this.f1022e);
            this.f1021d = null;
            this.f1023f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f1018a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f1019b = 2;
        }
    }
}
