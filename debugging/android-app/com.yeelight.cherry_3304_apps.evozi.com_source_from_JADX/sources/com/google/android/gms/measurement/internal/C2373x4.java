package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1609u;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final class C2373x4 extends C2352v5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f4705l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2123b5 f4706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2123b5 f4707d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C2384y4<?>> f4708e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C2384y4<?>> f4709f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f4710g = new C2395z4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f4711h = new C2395z4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f4712i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f4713j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f4714k;

    C2373x4(C2111a5 a5Var) {
        super(a5Var);
    }

    /* renamed from: x */
    private final void m7751x(C2384y4<?> y4Var) {
        synchronized (this.f4712i) {
            this.f4708e.add(y4Var);
            if (this.f4706c == null) {
                C2123b5 b5Var = new C2123b5(this, "Measurement Worker", this.f4708e);
                this.f4706c = b5Var;
                b5Var.setUncaughtExceptionHandler(this.f4710g);
                this.f4706c.start();
            } else {
                this.f4706c.mo12483b();
            }
        }
    }

    /* renamed from: A */
    public final <V> Future<V> mo13117A(Callable<V> callable) {
        mo13079o();
        C1609u.m4475k(callable);
        C2384y4 y4Var = new C2384y4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4706c) {
            y4Var.run();
        } else {
            m7751x(y4Var);
        }
        return y4Var;
    }

    /* renamed from: B */
    public final void mo13118B(Runnable runnable) {
        mo13079o();
        C1609u.m4475k(runnable);
        C2384y4 y4Var = new C2384y4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f4712i) {
            this.f4709f.add(y4Var);
            if (this.f4707d == null) {
                C2123b5 b5Var = new C2123b5(this, "Measurement Network", this.f4709f);
                this.f4707d = b5Var;
                b5Var.setUncaughtExceptionHandler(this.f4711h);
                this.f4707d.start();
            } else {
                this.f4707d.mo12483b();
            }
        }
    }

    /* renamed from: G */
    public final boolean mo13119G() {
        return Thread.currentThread() == this.f4706c;
    }

    /* renamed from: g */
    public final void mo13107g() {
        if (Thread.currentThread() != this.f4707d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo12567h() {
        if (Thread.currentThread() != this.f4706c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo13130a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = mo12427b().mo13099J();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.mo13130a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = mo12427b().mo13099J();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo13120u(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.x4 r0 = r1.mo12426a()     // Catch:{ all -> 0x005a }
            r0.mo13122y(r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.w3 r3 = r1.mo12427b()
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13099J()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo13130a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.w3 r3 = r1.mo12427b()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13099J()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.mo13130a(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2373x4.mo13120u(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: v */
    public final <V> Future<V> mo13121v(Callable<V> callable) {
        mo13079o();
        C1609u.m4475k(callable);
        C2384y4 y4Var = new C2384y4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f4706c) {
            if (!this.f4708e.isEmpty()) {
                mo12427b().mo13099J().mo13130a("Callable skipped the worker queue.");
            }
            y4Var.run();
        } else {
            m7751x(y4Var);
        }
        return y4Var;
    }

    /* renamed from: y */
    public final void mo13122y(Runnable runnable) {
        mo13079o();
        C1609u.m4475k(runnable);
        m7751x(new C2384y4(this, runnable, false, "Task exception on worker thread"));
    }
}
