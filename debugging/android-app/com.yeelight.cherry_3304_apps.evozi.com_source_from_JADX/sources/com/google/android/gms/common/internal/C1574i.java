package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.C1697h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C1574i implements Handler.Callback {

    /* renamed from: a */
    private final C1575a f3038a;

    /* renamed from: b */
    private final ArrayList<C1399f.C1401b> f3039b = new ArrayList<>();
    @VisibleForTesting

    /* renamed from: c */
    private final ArrayList<C1399f.C1401b> f3040c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C1399f.C1402c> f3041d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f3042e = false;

    /* renamed from: f */
    private final AtomicInteger f3043f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f3044g = false;

    /* renamed from: h */
    private final Handler f3045h;

    /* renamed from: i */
    private final Object f3046i = new Object();

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.internal.i$a */
    public interface C1575a {
        boolean isConnected();

        /* renamed from: u */
        Bundle mo10982u();
    }

    public C1574i(Looper looper, C1575a aVar) {
        this.f3038a = aVar;
        this.f3045h = new C1697h(looper, this);
    }

    /* renamed from: a */
    public final void mo11219a() {
        this.f3042e = false;
        this.f3043f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo11220b() {
        this.f3042e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11221c(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Handler r0 = r7.f3045h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C1609u.m4469e(r0, r1)
            android.os.Handler r0 = r7.f3045h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.f3046i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r2 = r7.f3041d     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f3043f     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            int r3 = r1.size()     // Catch:{ all -> 0x0049 }
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0047
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 1
            com.google.android.gms.common.api.f$c r5 = (com.google.android.gms.common.api.C1399f.C1402c) r5     // Catch:{ all -> 0x0049 }
            boolean r6 = r7.f3042e     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f3043f     // Catch:{ all -> 0x0049 }
            int r6 = r6.get()     // Catch:{ all -> 0x0049 }
            if (r6 == r2) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r6 = r7.f3041d     // Catch:{ all -> 0x0049 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0022
            r5.mo10838f(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0022
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x004c:
            throw r8
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1574i.mo11221c(com.google.android.gms.common.ConnectionResult):void");
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void mo11222d(Bundle bundle) {
        C1609u.m4469e(this.f3045h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f3046i) {
            boolean z = true;
            C1609u.m4478n(!this.f3044g);
            this.f3045h.removeMessages(1);
            this.f3044g = true;
            if (this.f3040c.size() != 0) {
                z = false;
            }
            C1609u.m4478n(z);
            ArrayList arrayList = new ArrayList(this.f3039b);
            int i = this.f3043f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C1399f.C1401b bVar = (C1399f.C1401b) obj;
                if (!this.f3042e || !this.f3038a.isConnected() || this.f3043f.get() != i) {
                    break;
                } else if (!this.f3040c.contains(bVar)) {
                    bVar.mo10837c(bundle);
                }
            }
            this.f3040c.clear();
            this.f3044g = false;
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public final void mo11223e(int i) {
        C1609u.m4469e(this.f3045h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f3045h.removeMessages(1);
        synchronized (this.f3046i) {
            this.f3044g = true;
            ArrayList arrayList = new ArrayList(this.f3039b);
            int i2 = this.f3043f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C1399f.C1401b bVar = (C1399f.C1401b) obj;
                if (!this.f3042e || this.f3043f.get() != i2) {
                    break;
                } else if (this.f3039b.contains(bVar)) {
                    bVar.mo10836a(i);
                }
            }
            this.f3040c.clear();
            this.f3044g = false;
        }
    }

    /* renamed from: f */
    public final void mo11224f(C1399f.C1401b bVar) {
        C1609u.m4475k(bVar);
        synchronized (this.f3046i) {
            if (this.f3039b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f3039b.add(bVar);
            }
        }
        if (this.f3038a.isConnected()) {
            Handler handler = this.f3045h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo11225g(C1399f.C1402c cVar) {
        C1609u.m4475k(cVar);
        synchronized (this.f3046i) {
            if (this.f3041d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f3041d.add(cVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C1399f.C1401b bVar = (C1399f.C1401b) message.obj;
            synchronized (this.f3046i) {
                if (this.f3042e && this.f3038a.isConnected() && this.f3039b.contains(bVar)) {
                    bVar.mo10837c(this.f3038a.mo10982u());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
