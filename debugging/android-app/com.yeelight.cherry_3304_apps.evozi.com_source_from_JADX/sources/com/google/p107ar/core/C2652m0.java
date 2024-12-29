package com.google.p107ar.core;

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
import com.google.p107ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import p011c.p012a.p013a.p015b.p016a.p017a.p018a.C0453a;
import p011c.p012a.p013a.p015b.p016a.p017a.p018a.C0454b;

/* renamed from: com.google.ar.core.m0 */
class C2652m0 {

    /* renamed from: a */
    private final Queue<Runnable> f5122a;

    /* renamed from: b */
    private Context f5123b;

    /* renamed from: c */
    private volatile int f5124c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0454b f5125d;

    /* renamed from: e */
    private BroadcastReceiver f5126e;

    /* renamed from: f */
    private Context f5127f;

    /* renamed from: g */
    private final ServiceConnection f5128g;

    /* renamed from: h */
    private final AtomicReference<C2669v0> f5129h;

    C2652m0() {
    }

    C2652m0(byte b) {
        this();
        this.f5122a = new ArrayDeque();
        this.f5124c = C2629b.f5090a;
        this.f5128g = new C2654n0(this);
        this.f5129h = new AtomicReference<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8188b(Activity activity, Bundle bundle, C2656o0 o0Var) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                o0Var.mo15208b(new FatalException("Installation Intent failed", e));
            }
        } else {
            o0Var.mo15208b(new FatalException("Installation intent failed to unparcel."));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m8189f(IBinder iBinder) {
        this.f5125d = C0453a.m29c(iBinder);
        this.f5124c = C2629b.f5092c;
        for (Runnable run : this.f5122a) {
            run.run();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m8194k(java.lang.Runnable r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f5124c     // Catch:{ all -> 0x001f }
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
            java.util.Queue<java.lang.Runnable> r0 = r2.f5122a     // Catch:{ all -> 0x001f }
            r0.offer(r3)     // Catch:{ all -> 0x001f }
            monitor-exit(r2)
            return
        L_0x0019:
            com.google.ar.core.c r3 = new com.google.ar.core.c     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.core.C2652m0.m8194k(java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static Bundle m8195l() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m8197n(Activity activity, C2656o0 o0Var) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core")));
        } catch (ActivityNotFoundException e) {
            o0Var.mo15208b(new FatalException("Failed to launch installer.", e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m8199p() {
        C2669v0 andSet = this.f5129h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo15223b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public synchronized void m8200q() {
        this.f5124c = C2629b.f5090a;
        this.f5125d = null;
        m8199p();
    }

    /* renamed from: a */
    public synchronized void mo15199a() {
        m8199p();
        int i = this.f5124c - 1;
        if (i == 1 || i == 2) {
            this.f5123b.unbindService(this.f5128g);
            this.f5123b = null;
            this.f5124c = C2629b.f5090a;
        }
        if (this.f5126e != null) {
            this.f5127f.unregisterReceiver(this.f5126e);
        }
    }

    /* renamed from: c */
    public void mo15200c(Activity activity, C2656o0 o0Var) {
        C2669v0 v0Var = new C2669v0(activity, o0Var);
        C2669v0 andSet = this.f5129h.getAndSet(v0Var);
        if (andSet != null) {
            andSet.mo15223b();
        }
        v0Var.start();
        if (this.f5126e == null) {
            C2663s0 s0Var = new C2663s0(this, o0Var);
            this.f5126e = s0Var;
            this.f5127f = activity;
            activity.registerReceiver(s0Var, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
        }
        try {
            m8194k(new C2661r0(this, activity, o0Var));
        } catch (C2631c unused) {
            m8197n(activity, o0Var);
        }
    }

    /* renamed from: d */
    public synchronized void mo15201d(Context context) {
        this.f5123b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f5128g, 1)) {
            this.f5124c = C2629b.f5091b;
            return;
        }
        this.f5124c = C2629b.f5090a;
        this.f5123b = null;
        context.unbindService(this.f5128g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.mo14945a(com.google.p107ar.core.ArCoreApk.Availability.UNKNOWN_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo15202e(android.content.Context r2, com.google.p107ar.core.ArCoreApk.C2618a r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.ar.core.q0 r0 = new com.google.ar.core.q0     // Catch:{ c -> 0x000d }
            r0.<init>(r1, r2, r3)     // Catch:{ c -> 0x000d }
            r1.m8194k(r0)     // Catch:{ c -> 0x000d }
            monitor-exit(r1)
            return
        L_0x000b:
            r2 = move-exception
            goto L_0x0014
        L_0x000d:
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.p107ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ all -> 0x000b }
            r3.mo14945a(r2)     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return
        L_0x0014:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.core.C2652m0.mo15202e(android.content.Context, com.google.ar.core.ArCoreApk$a):void");
    }
}
