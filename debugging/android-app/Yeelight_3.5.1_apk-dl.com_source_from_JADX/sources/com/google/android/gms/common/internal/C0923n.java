package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p040h0.C3239j;
import p109w.C3858r;

/* renamed from: com.google.android.gms.common.internal.n */
public final class C0923n implements Handler.Callback {
    @NotOnlyInitialized

    /* renamed from: a */
    private final C3858r f1048a;

    /* renamed from: b */
    private final ArrayList f1049b = new ArrayList();
    @VisibleForTesting

    /* renamed from: c */
    final ArrayList f1050c = new ArrayList();

    /* renamed from: d */
    private final ArrayList f1051d = new ArrayList();

    /* renamed from: e */
    private volatile boolean f1052e = false;

    /* renamed from: f */
    private final AtomicInteger f1053f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f1054g = false;

    /* renamed from: h */
    private final Handler f1055h;

    /* renamed from: i */
    private final Object f1056i = new Object();

    public C0923n(Looper looper, C3858r rVar) {
        this.f1048a = rVar;
        this.f1055h = new C3239j(looper, this);
    }

    /* renamed from: a */
    public final void mo12286a() {
        this.f1052e = false;
        this.f1053f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo12287b() {
        this.f1052e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12288c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f1055h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C0917i.m1413d(r0, r1)
            android.os.Handler r0 = r5.f1055h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f1056i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList r2 = r5.f1051d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f1053f     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.d$c r3 = (com.google.android.gms.common.api.C0736d.C0739c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f1052e     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f1053f     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList r4 = r5.f1051d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo11972e(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004d:
            throw r6
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0923n.mo12288c(com.google.android.gms.common.ConnectionResult):void");
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void mo12289d(@Nullable Bundle bundle) {
        C0917i.m1413d(this.f1055h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f1056i) {
            C0917i.m1423n(!this.f1054g);
            this.f1055h.removeMessages(1);
            this.f1054g = true;
            C0917i.m1423n(this.f1050c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f1049b);
            int i = this.f1053f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0736d.C0738b bVar = (C0736d.C0738b) it.next();
                if (!this.f1052e || !this.f1048a.isConnected()) {
                    break;
                } else if (this.f1053f.get() != i) {
                    break;
                } else if (!this.f1050c.contains(bVar)) {
                    bVar.mo11949f(bundle);
                }
            }
            this.f1050c.clear();
            this.f1054g = false;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final void mo12290e(int i) {
        C0917i.m1413d(this.f1055h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f1055h.removeMessages(1);
        synchronized (this.f1056i) {
            this.f1054g = true;
            ArrayList arrayList = new ArrayList(this.f1049b);
            int i2 = this.f1053f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0736d.C0738b bVar = (C0736d.C0738b) it.next();
                if (!this.f1052e) {
                    break;
                } else if (this.f1053f.get() != i2) {
                    break;
                } else if (this.f1049b.contains(bVar)) {
                    bVar.mo11948c(i);
                }
            }
            this.f1050c.clear();
            this.f1054g = false;
        }
    }

    /* renamed from: f */
    public final void mo12291f(C0736d.C0738b bVar) {
        C0917i.m1419j(bVar);
        synchronized (this.f1056i) {
            if (this.f1049b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f1049b.add(bVar);
            }
        }
        if (this.f1048a.isConnected()) {
            Handler handler = this.f1055h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo12292g(C0736d.C0739c cVar) {
        C0917i.m1419j(cVar);
        synchronized (this.f1056i) {
            if (this.f1051d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.f1051d.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo12293h(C0736d.C0739c cVar) {
        C0917i.m1419j(cVar);
        synchronized (this.f1056i) {
            if (!this.f1051d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder();
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C0736d.C0738b bVar = (C0736d.C0738b) message.obj;
            synchronized (this.f1056i) {
                if (this.f1052e && this.f1048a.isConnected() && this.f1049b.contains(bVar)) {
                    bVar.mo11949f((Bundle) null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }
}
