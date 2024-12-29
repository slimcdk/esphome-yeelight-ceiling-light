package com.google.p017ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.p017ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p027e.C3137a;
import p027e.C3138b;

/* renamed from: com.google.ar.core.f0 */
class C2030f0 {

    /* renamed from: a */
    private final Queue<Runnable> f3172a;

    /* renamed from: b */
    private Context f3173b;

    /* renamed from: c */
    private volatile int f3174c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3138b f3175d;

    /* renamed from: e */
    private BroadcastReceiver f3176e;

    /* renamed from: f */
    private Context f3177f;

    /* renamed from: g */
    private final ServiceConnection f3178g;

    /* renamed from: h */
    private final AtomicReference<C2048o0> f3179h;

    C2030f0() {
    }

    C2030f0(byte b) {
        this();
        this.f3172a = new ArrayDeque();
        this.f3174c = C2033h.f3181a;
        this.f3178g = new C2032g0(this);
        this.f3179h = new AtomicReference<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m5125b(Activity activity, Bundle bundle, C2034h0 h0Var) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                h0Var.mo16647b(new FatalException("Installation Intent failed", e));
            }
        } else {
            h0Var.mo16647b(new FatalException("Installation intent failed to unparcel."));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m5126f(IBinder iBinder) {
        this.f3175d = C3137a.m8387e(iBinder);
        this.f3174c = C2033h.f3183c;
        for (Runnable run : this.f3172a) {
            run.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m5131k(java.lang.Runnable r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f3174c     // Catch:{ all -> 0x001f }
            r1 = 1
            int r0 = r0 - r1
            if (r0 == 0) goto L_0x0019
            if (r0 == r1) goto L_0x0012
            r1 = 2
            if (r0 == r1) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r3.run()     // Catch:{ all -> 0x001f }
        L_0x0010:
            monitor-exit(r2)
            return
        L_0x0012:
            java.util.Queue<java.lang.Runnable> r0 = r2.f3172a     // Catch:{ all -> 0x001f }
            r0.offer(r3)     // Catch:{ all -> 0x001f }
            monitor-exit(r2)
            return
        L_0x0019:
            com.google.ar.core.ab r3 = new com.google.ar.core.ab     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.core.C2030f0.m5131k(java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static Bundle m5132l() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m5134n(Activity activity, C2034h0 h0Var) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core")));
        } catch (ActivityNotFoundException e) {
            h0Var.mo16647b(new FatalException("Failed to launch installer.", e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m5136p() {
        C2048o0 andSet = this.f3179h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo16662b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public synchronized void m5137q() {
        this.f3174c = C2033h.f3181a;
        this.f3175d = null;
        m5136p();
    }

    /* renamed from: a */
    public synchronized void mo16640a() {
        m5136p();
        int i = this.f3174c - 1;
        if (i == 1 || i == 2) {
            this.f3173b.unbindService(this.f3178g);
            this.f3173b = null;
            this.f3174c = C2033h.f3181a;
        }
        BroadcastReceiver broadcastReceiver = this.f3176e;
        if (broadcastReceiver != null) {
            this.f3177f.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: c */
    public void mo16641c(Activity activity, C2034h0 h0Var) {
        C2048o0 o0Var = new C2048o0(activity, h0Var);
        C2048o0 andSet = this.f3179h.getAndSet(o0Var);
        if (andSet != null) {
            andSet.mo16662b();
        }
        o0Var.start();
        if (this.f3176e == null) {
            C2042l0 l0Var = new C2042l0(this, h0Var);
            this.f3176e = l0Var;
            this.f3177f = activity;
            activity.registerReceiver(l0Var, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            m5131k(new C2040k0(this, activity, h0Var));
        } catch (C2014ab unused) {
            m5134n(activity, h0Var);
        }
    }

    /* renamed from: d */
    public synchronized void mo16642d(Context context) {
        this.f3173b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f3178g, 1)) {
            this.f3174c = C2033h.f3182b;
            return;
        }
        this.f3174c = C2033h.f3181a;
        this.f3173b = null;
        context.unbindService(this.f3178g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.mo16395a(com.google.p017ar.core.ArCoreApk.Availability.UNKNOWN_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo16643e(android.content.Context r2, com.google.p017ar.core.ArCoreApk.C2003a r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.ar.core.j0 r0 = new com.google.ar.core.j0     // Catch:{ ab -> 0x000d }
            r0.<init>(r1, r2, r3)     // Catch:{ ab -> 0x000d }
            r1.m5131k(r0)     // Catch:{ ab -> 0x000d }
            monitor-exit(r1)
            return
        L_0x000b:
            r2 = move-exception
            goto L_0x0014
        L_0x000d:
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.p017ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ all -> 0x000b }
            r3.mo16395a(r2)     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return
        L_0x0014:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.core.C2030f0.mo16643e(android.content.Context, com.google.ar.core.ArCoreApk$a):void");
    }
}
