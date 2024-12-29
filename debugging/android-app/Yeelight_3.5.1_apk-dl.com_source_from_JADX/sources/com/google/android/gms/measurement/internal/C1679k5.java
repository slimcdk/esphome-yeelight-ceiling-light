package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
public final class C1679k5 extends C1654i6 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f2220l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public C1666j5 f2221c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C1666j5 f2222d;

    /* renamed from: e */
    private final PriorityBlockingQueue f2223e = new PriorityBlockingQueue();

    /* renamed from: f */
    private final BlockingQueue f2224f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f2225g = new C1640h5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f2226h = new C1640h5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f2227i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f2228j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f2229k;

    C1679k5(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: D */
    private final void m4385D(C1653i5 i5Var) {
        synchronized (this.f2227i) {
            this.f2223e.add(i5Var);
            C1666j5 j5Var = this.f2221c;
            if (j5Var == null) {
                C1666j5 j5Var2 = new C1666j5(this, "Measurement Worker", this.f2223e);
                this.f2221c = j5Var2;
                j5Var2.setUncaughtExceptionHandler(this.f2225g);
                this.f2221c.start();
            } else {
                j5Var.mo14254b();
            }
        }
    }

    /* renamed from: A */
    public final void mo14304A(Runnable runnable) {
        mo14241k();
        C0917i.m1419j(runnable);
        m4385D(new C1653i5(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo14305C() {
        return Thread.currentThread() == this.f2221c;
    }

    /* renamed from: g */
    public final void mo14232g() {
        if (Thread.currentThread() != this.f2222d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo14009h() {
        if (Thread.currentThread() != this.f2221c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14033j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f2143a.mo14228b().mo14040w();
        r3.mo14693a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f2143a.mo14228b().mo14040w().mo14693a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    @androidx.annotation.Nullable
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14306r(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.k5 r0 = r0.mo14227a()     // Catch:{ all -> 0x0049 }
            r0.mo14310z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2143a
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo14693a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2143a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14040w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo14693a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1679k5.mo14306r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo14307s(Callable callable) {
        mo14241k();
        C0917i.m1419j(callable);
        C1653i5 i5Var = new C1653i5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f2221c) {
            if (!this.f2223e.isEmpty()) {
                this.f2143a.mo14228b().mo14040w().mo14693a("Callable skipped the worker queue.");
            }
            i5Var.run();
        } else {
            m4385D(i5Var);
        }
        return i5Var;
    }

    /* renamed from: t */
    public final Future mo14308t(Callable callable) {
        mo14241k();
        C0917i.m1419j(callable);
        C1653i5 i5Var = new C1653i5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f2221c) {
            i5Var.run();
        } else {
            m4385D(i5Var);
        }
        return i5Var;
    }

    /* renamed from: y */
    public final void mo14309y(Runnable runnable) {
        mo14241k();
        C0917i.m1419j(runnable);
        C1653i5 i5Var = new C1653i5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f2227i) {
            this.f2224f.add(i5Var);
            C1666j5 j5Var = this.f2222d;
            if (j5Var == null) {
                C1666j5 j5Var2 = new C1666j5(this, "Measurement Network", this.f2224f);
                this.f2222d = j5Var2;
                j5Var2.setUncaughtExceptionHandler(this.f2226h);
                this.f2222d.start();
            } else {
                j5Var.mo14254b();
            }
        }
    }

    /* renamed from: z */
    public final void mo14310z(Runnable runnable) {
        mo14241k();
        C0917i.m1419j(runnable);
        m4385D(new C1653i5(this, runnable, false, "Task exception on worker thread"));
    }
}
