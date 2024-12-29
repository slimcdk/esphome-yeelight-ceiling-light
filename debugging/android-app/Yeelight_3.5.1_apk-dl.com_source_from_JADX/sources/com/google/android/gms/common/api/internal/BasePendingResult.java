package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0741f;
import com.google.android.gms.common.api.C0743g;
import com.google.android.gms.common.api.C0744h;
import com.google.android.gms.common.api.C0745i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040h0.C3239j;
import p109w.C3829b;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends C0744h> extends C0741f<R> {

    /* renamed from: p */
    static final ThreadLocal f555p = new C0767d3();

    /* renamed from: q */
    public static final /* synthetic */ int f556q = 0;

    /* renamed from: a */
    private final Object f557a;
    @NonNull

    /* renamed from: b */
    protected final C0746a f558b;
    @NonNull

    /* renamed from: c */
    protected final WeakReference f559c;

    /* renamed from: d */
    private final CountDownLatch f560d;

    /* renamed from: e */
    private final ArrayList f561e;
    @Nullable

    /* renamed from: f */
    private C0745i f562f;

    /* renamed from: g */
    private final AtomicReference f563g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public C0744h f564h;

    /* renamed from: i */
    private Status f565i;

    /* renamed from: j */
    private volatile boolean f566j;

    /* renamed from: k */
    private boolean f567k;

    /* renamed from: l */
    private boolean f568l;
    @Nullable

    /* renamed from: m */
    private C3829b f569m;
    @KeepName
    private C0777f3 mResultGuardian;

    /* renamed from: n */
    private volatile C0824o2 f570n;

    /* renamed from: o */
    private boolean f571o;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C0746a<R extends C0744h> extends C3239j {
        public C0746a(@NonNull Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo11889a(@NonNull C0745i iVar, @NonNull C0744h hVar) {
            int i = BasePendingResult.f556q;
            sendMessage(obtainMessage(1, new Pair((C0745i) C0917i.m1419j(iVar), hVar)));
        }

        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C0745i iVar = (C0745i) pair.first;
                C0744h hVar = (C0744h) pair.second;
                try {
                    iVar.mo11879a(hVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m714n(hVar);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
            } else {
                ((BasePendingResult) message.obj).mo11882f(Status.RESULT_TIMEOUT);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f557a = new Object();
        this.f560d = new CountDownLatch(1);
        this.f561e = new ArrayList();
        this.f563g = new AtomicReference();
        this.f571o = false;
        this.f558b = new C0746a(Looper.getMainLooper());
        this.f559c = new WeakReference((Object) null);
    }

    @KeepForSdk
    protected BasePendingResult(@Nullable C0736d dVar) {
        this.f557a = new Object();
        this.f560d = new CountDownLatch(1);
        this.f561e = new ArrayList();
        this.f563g = new AtomicReference();
        this.f571o = false;
        this.f558b = new C0746a(dVar != null ? dVar.mo11865i() : Looper.getMainLooper());
        this.f559c = new WeakReference(dVar);
    }

    /* renamed from: j */
    private final C0744h m711j() {
        C0744h hVar;
        synchronized (this.f557a) {
            C0917i.m1424o(!this.f566j, "Result has already been consumed.");
            C0917i.m1424o(mo11884h(), "Result is not ready.");
            hVar = this.f564h;
            this.f564h = null;
            this.f562f = null;
            this.f566j = true;
        }
        C0829p2 p2Var = (C0829p2) this.f563g.getAndSet((Object) null);
        if (p2Var != null) {
            p2Var.f740a.f763a.remove(this);
        }
        return (C0744h) C0917i.m1419j(hVar);
    }

    /* renamed from: k */
    private final void m712k(C0744h hVar) {
        this.f564h = hVar;
        this.f565i = hVar.mo11805N();
        this.f569m = null;
        this.f560d.countDown();
        if (this.f567k) {
            this.f562f = null;
        } else {
            C0745i iVar = this.f562f;
            if (iVar != null) {
                this.f558b.removeMessages(2);
                this.f558b.mo11889a(iVar, m711j());
            } else if (this.f564h instanceof C0743g) {
                this.mResultGuardian = new C0777f3(this, (C0772e3) null);
            }
        }
        ArrayList arrayList = this.f561e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0741f.C0742a) arrayList.get(i)).mo11877a(this.f565i);
        }
        this.f561e.clear();
    }

    /* renamed from: n */
    public static void m714n(@Nullable C0744h hVar) {
        if (hVar instanceof C0743g) {
            try {
                ((C0743g) hVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(hVar));
            }
        }
    }

    /* renamed from: b */
    public final void mo11875b(@NonNull C0741f.C0742a aVar) {
        C0917i.m1411b(aVar != null, "Callback cannot be null.");
        synchronized (this.f557a) {
            if (mo11884h()) {
                aVar.mo11877a(this.f565i);
            } else {
                this.f561e.add(aVar);
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public final R mo11876c(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            C0917i.m1418i("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C0917i.m1424o(!this.f566j, "Result has already been consumed.");
        if (this.f570n != null) {
            z = false;
        }
        C0917i.m1424o(z, "Cannot await if then() has been called.");
        try {
            if (!this.f560d.await(j, timeUnit)) {
                mo11882f(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            mo11882f(Status.RESULT_INTERRUPTED);
        }
        C0917i.m1424o(mo11884h(), "Result is not ready.");
        return m711j();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11880d() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f557a
            monitor-enter(r0)
            boolean r1 = r2.f567k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f566j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            w.b r1 = r2.f569m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            com.google.android.gms.common.api.h r1 = r2.f564h     // Catch:{ all -> 0x0028 }
            m714n(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f567k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.h r1 = r2.mo11881e(r1)     // Catch:{ all -> 0x0028 }
            r2.m712k(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo11880d():void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public abstract R mo11881e(@NonNull Status status);

    @KeepForSdk
    @Deprecated
    /* renamed from: f */
    public final void mo11882f(@NonNull Status status) {
        synchronized (this.f557a) {
            if (!mo11884h()) {
                mo11885i(mo11881e(status));
                this.f568l = true;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo11883g() {
        boolean z;
        synchronized (this.f557a) {
            z = this.f567k;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: h */
    public final boolean mo11884h() {
        return this.f560d.getCount() == 0;
    }

    @KeepForSdk
    /* renamed from: i */
    public final void mo11885i(@NonNull R r) {
        synchronized (this.f557a) {
            if (this.f568l || this.f567k) {
                m714n(r);
                return;
            }
            mo11884h();
            C0917i.m1424o(!mo11884h(), "Results have already been set");
            C0917i.m1424o(!this.f566j, "Result has already been consumed");
            m712k(r);
        }
    }

    /* renamed from: m */
    public final void mo11886m() {
        boolean z = true;
        if (!this.f571o && !((Boolean) f555p.get()).booleanValue()) {
            z = false;
        }
        this.f571o = z;
    }

    /* renamed from: o */
    public final boolean mo11887o() {
        boolean g;
        synchronized (this.f557a) {
            if (((C0736d) this.f559c.get()) == null || !this.f571o) {
                mo11880d();
            }
            g = mo11883g();
        }
        return g;
    }

    /* renamed from: p */
    public final void mo11888p(@Nullable C0829p2 p2Var) {
        this.f563g.set(p2Var);
    }
}
