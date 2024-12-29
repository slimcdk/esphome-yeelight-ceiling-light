package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1403g;
import com.google.android.gms.common.api.C1405h;
import com.google.android.gms.common.api.C1507j;
import com.google.android.gms.common.api.C1508k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1588n;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.C1697h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends C1507j> extends C1403g<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f2588p = new C1421c2();

    /* renamed from: a */
    private final Object f2589a;

    /* renamed from: b */
    private final C1407a<R> f2590b;

    /* renamed from: c */
    private final WeakReference<C1399f> f2591c;

    /* renamed from: d */
    private final CountDownLatch f2592d;

    /* renamed from: e */
    private final ArrayList<C1403g.C1404a> f2593e;

    /* renamed from: f */
    private C1508k<? super R> f2594f;

    /* renamed from: g */
    private final AtomicReference<C1488t1> f2595g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f2596h;

    /* renamed from: i */
    private Status f2597i;

    /* renamed from: j */
    private volatile boolean f2598j;

    /* renamed from: k */
    private boolean f2599k;

    /* renamed from: l */
    private boolean f2600l;

    /* renamed from: m */
    private C1588n f2601m;
    @KeepName
    private C1408b mResultGuardian;

    /* renamed from: n */
    private volatile C1470n1<R> f2602n;

    /* renamed from: o */
    private boolean f2603o;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C1407a<R extends C1507j> extends C1697h {
        public C1407a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo10854a(C1508k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C1508k kVar = (C1508k) pair.first;
                C1507j jVar = (C1507j) pair.second;
                try {
                    kVar.mo10994a(jVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m3681n(jVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo10850o(Status.RESULT_TIMEOUT);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C1408b {
        private C1408b() {
        }

        /* synthetic */ C1408b(BasePendingResult basePendingResult, C1421c2 c2Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m3681n(BasePendingResult.this.f2596h);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f2589a = new Object();
        this.f2592d = new CountDownLatch(1);
        this.f2593e = new ArrayList<>();
        this.f2595g = new AtomicReference<>();
        this.f2603o = false;
        this.f2590b = new C1407a<>(Looper.getMainLooper());
        this.f2591c = new WeakReference<>((Object) null);
    }

    @KeepForSdk
    protected BasePendingResult(C1399f fVar) {
        this.f2589a = new Object();
        this.f2592d = new CountDownLatch(1);
        this.f2593e = new ArrayList<>();
        this.f2595g = new AtomicReference<>();
        this.f2603o = false;
        this.f2590b = new C1407a<>(fVar != null ? fVar.mo10828g() : Looper.getMainLooper());
        this.f2591c = new WeakReference<>(fVar);
    }

    /* renamed from: f */
    private final R m3678f() {
        R r;
        synchronized (this.f2589a) {
            C1609u.m4479o(!this.f2598j, "Result has already been consumed.");
            C1609u.m4479o(mo10846h(), "Result is not ready.");
            r = this.f2596h;
            this.f2596h = null;
            this.f2594f = null;
            this.f2598j = true;
        }
        C1488t1 andSet = this.f2595g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo11012a(this);
        }
        return r;
    }

    /* renamed from: l */
    private final void m3680l(R r) {
        this.f2596h = r;
        this.f2601m = null;
        this.f2592d.countDown();
        this.f2597i = this.f2596h.mo10772K();
        if (this.f2599k) {
            this.f2594f = null;
        } else if (this.f2594f != null) {
            this.f2590b.removeMessages(2);
            this.f2590b.mo10854a(this.f2594f, m3678f());
        } else if (this.f2596h instanceof C1405h) {
            this.mResultGuardian = new C1408b(this, (C1421c2) null);
        }
        ArrayList<C1403g.C1404a> arrayList = this.f2593e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C1403g.C1404a aVar = arrayList.get(i);
            i++;
            aVar.mo10841a(this.f2597i);
        }
        this.f2593e.clear();
    }

    /* renamed from: n */
    public static void m3681n(C1507j jVar) {
        if (jVar instanceof C1405h) {
            try {
                ((C1405h) jVar).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* renamed from: b */
    public final void mo10839b(C1403g.C1404a aVar) {
        C1609u.m4466b(aVar != null, "Callback cannot be null.");
        synchronized (this.f2589a) {
            if (mo10846h()) {
                aVar.mo10841a(this.f2597i);
            } else {
                this.f2593e.add(aVar);
            }
        }
    }

    /* renamed from: c */
    public final R mo10840c(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C1609u.m4474j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C1609u.m4479o(!this.f2598j, "Result has already been consumed.");
        if (this.f2602n != null) {
            z = false;
        }
        C1609u.m4479o(z, "Cannot await if then() has been called.");
        try {
            if (!this.f2592d.await(j, timeUnit)) {
                mo10850o(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            mo10850o(Status.RESULT_INTERRUPTED);
        }
        C1609u.m4479o(mo10846h(), "Result is not ready.");
        return m3678f();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10843d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f2589a
            monitor-enter(r0)
            boolean r1 = r2.f2599k     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f2598j     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.n r1 = r2.f2601m     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.n r1 = r2.f2601m     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f2596h     // Catch:{ all -> 0x002a }
            m3681n(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f2599k = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.j r1 = r2.mo10844e(r1)     // Catch:{ all -> 0x002a }
            r2.m3680l(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo10843d():void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public abstract R mo10844e(Status status);

    /* renamed from: g */
    public boolean mo10845g() {
        boolean z;
        synchronized (this.f2589a) {
            z = this.f2599k;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: h */
    public final boolean mo10846h() {
        return this.f2592d.getCount() == 0;
    }

    @KeepForSdk
    /* renamed from: i */
    public final void mo10847i(R r) {
        synchronized (this.f2589a) {
            if (this.f2600l || this.f2599k) {
                m3681n(r);
                return;
            }
            mo10846h();
            boolean z = true;
            C1609u.m4479o(!mo10846h(), "Results have already been set");
            if (this.f2598j) {
                z = false;
            }
            C1609u.m4479o(z, "Result has already been consumed");
            m3680l(r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10848j(com.google.android.gms.common.api.C1508k<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2589a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f2594f = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.f2598j     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.C1609u.m4479o(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.n1<R> r1 = r5.f2602n     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C1609u.m4479o(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.mo10845g()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.mo10846h()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r5.f2590b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.j r2 = r5.m3678f()     // Catch:{ all -> 0x003f }
            r1.mo10854a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f2594f = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo10848j(com.google.android.gms.common.api.k):void");
    }

    /* renamed from: m */
    public final void mo10849m(C1488t1 t1Var) {
        this.f2595g.set(t1Var);
    }

    /* renamed from: o */
    public final void mo10850o(Status status) {
        synchronized (this.f2589a) {
            if (!mo10846h()) {
                mo10847i(mo10844e(status));
                this.f2600l = true;
            }
        }
    }

    /* renamed from: p */
    public final Integer mo10851p() {
        return null;
    }

    /* renamed from: q */
    public final boolean mo10852q() {
        boolean g;
        synchronized (this.f2589a) {
            if (((C1399f) this.f2591c.get()) == null || !this.f2603o) {
                mo10843d();
            }
            g = mo10845g();
        }
        return g;
    }

    /* renamed from: r */
    public final void mo10853r() {
        this.f2603o = this.f2603o || f2588p.get().booleanValue();
    }
}
