package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
final class C1666j5 extends Thread {

    /* renamed from: a */
    private final Object f2186a;

    /* renamed from: b */
    private final BlockingQueue f2187b;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: c */
    private boolean f2188c = false;

    /* renamed from: d */
    final /* synthetic */ C1679k5 f2189d;

    public C1666j5(C1679k5 k5Var, String str, BlockingQueue blockingQueue) {
        this.f2189d = k5Var;
        C0917i.m1419j(str);
        C0917i.m1419j(blockingQueue);
        this.f2186a = new Object();
        this.f2187b = blockingQueue;
        setName(str);
    }

    /* renamed from: c */
    private final void m4311c() {
        synchronized (this.f2189d.f2227i) {
            if (!this.f2188c) {
                this.f2189d.f2228j.release();
                this.f2189d.f2227i.notifyAll();
                C1679k5 k5Var = this.f2189d;
                if (this == k5Var.f2221c) {
                    k5Var.f2221c = null;
                } else if (this == k5Var.f2222d) {
                    k5Var.f2222d = null;
                } else {
                    k5Var.f2143a.mo14228b().mo14035r().mo14693a("Current scheduler thread is neither worker nor network");
                }
                this.f2188c = true;
            }
        }
    }

    /* renamed from: d */
    private final void m4312d(InterruptedException interruptedException) {
        this.f2189d.f2143a.mo14228b().mo14040w().mo14694b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: b */
    public final void mo14254b() {
        synchronized (this.f2186a) {
            this.f2186a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        m4311c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.k5 r2 = r6.f2189d     // Catch:{ InterruptedException -> 0x000f }
            java.util.concurrent.Semaphore r2 = r2.f2228j     // Catch:{ InterruptedException -> 0x000f }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000f }
            r1 = 1
            goto L_0x0002
        L_0x000f:
            r2 = move-exception
            r6.m4312d(r2)
            goto L_0x0002
        L_0x0014:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0082 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0082 }
        L_0x001c:
            java.util.concurrent.BlockingQueue r2 = r6.f2187b     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.i5 r2 = (com.google.android.gms.measurement.internal.C1653i5) r2     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f2159b     // Catch:{ all -> 0x0082 }
            if (r0 == r3) goto L_0x002d
            r3 = 10
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0082 }
            r2.run()     // Catch:{ all -> 0x0082 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f2186a     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f2187b     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0051
            com.google.android.gms.measurement.internal.k5 r3 = r6.f2189d     // Catch:{ all -> 0x007f }
            boolean unused = r3.f2229k     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.f2186a     // Catch:{ InterruptedException -> 0x004d }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6.m4312d(r3)     // Catch:{ all -> 0x007f }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.k5 r2 = r6.f2189d     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f2227i     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f2187b     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            com.google.android.gms.measurement.internal.k5 r0 = r6.f2189d     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.n3 r1 = com.google.android.gms.measurement.internal.C1727o3.f2442g0     // Catch:{ all -> 0x007c }
            r3 = 0
            boolean r0 = r0.mo14163B(r3, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            r6.m4311c()     // Catch:{ all -> 0x007c }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            r6.m4311c()
            return
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x001c
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r6.m4311c()
            goto L_0x0088
        L_0x0087:
            throw r0
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1666j5.run():void");
    }
}
