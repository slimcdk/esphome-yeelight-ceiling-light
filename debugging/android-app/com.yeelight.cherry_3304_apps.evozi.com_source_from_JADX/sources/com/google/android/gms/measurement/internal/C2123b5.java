package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
final class C2123b5 extends Thread {

    /* renamed from: a */
    private final Object f3966a;

    /* renamed from: b */
    private final BlockingQueue<C2384y4<?>> f3967b;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: c */
    private boolean f3968c = false;

    /* renamed from: d */
    private final /* synthetic */ C2373x4 f3969d;

    public C2123b5(C2373x4 x4Var, String str, BlockingQueue<C2384y4<?>> blockingQueue) {
        this.f3969d = x4Var;
        C1609u.m4475k(str);
        C1609u.m4475k(blockingQueue);
        this.f3966a = new Object();
        this.f3967b = blockingQueue;
        setName(str);
    }

    /* renamed from: c */
    private final void m6797c(InterruptedException interruptedException) {
        this.f3969d.mo12427b().mo13099J().mo13131b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: d */
    private final void m6798d() {
        synchronized (this.f3969d.f4712i) {
            if (!this.f3968c) {
                this.f3969d.f4713j.release();
                this.f3969d.f4712i.notifyAll();
                if (this == this.f3969d.f4706c) {
                    C2123b5 unused = this.f3969d.f4706c = null;
                } else if (this == this.f3969d.f4707d) {
                    C2123b5 unused2 = this.f3969d.f4707d = null;
                } else {
                    this.f3969d.mo12427b().mo13096F().mo13130a("Current scheduler thread is neither worker nor network");
                }
                this.f3968c = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo12483b() {
        synchronized (this.f3966a) {
            this.f3966a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        m6798d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.x4 r1 = r5.f3969d     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f4713j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.m6797c(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.y4<?>> r1 = r5.f3967b     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.y4 r1 = (com.google.android.gms.measurement.internal.C2384y4) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f4732b     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f3966a     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.y4<?>> r2 = r5.f3967b     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.x4 r2 = r5.f3969d     // Catch:{ all -> 0x007e }
            boolean r2 = r2.f4714k     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f3966a     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.m6797c(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.x4 r1 = r5.f3969d     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.f4712i     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.y4<?>> r2 = r5.f3967b     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.x4 r0 = r5.f3969d     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.b r0 = r0.mo13112m()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2302r.f4552z0     // Catch:{ all -> 0x007b }
            boolean r0 = r0.mo12474s(r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.m6798d()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.m6798d()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.m6798d()
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2123b5.run():void");
    }
}
