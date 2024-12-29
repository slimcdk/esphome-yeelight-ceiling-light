package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.xiaomi.push.service.g */
public class C4910g {

    /* renamed from: a */
    private static long f10129a;

    /* renamed from: b */
    private static long f10130b;

    /* renamed from: c */
    private static long f10131c;

    /* renamed from: a */
    private final C4911a f10132a;

    /* renamed from: a */
    private final C4913c f10133a;

    /* renamed from: com.xiaomi.push.service.g$a */
    private static final class C4911a {

        /* renamed from: a */
        private final C4913c f10134a;

        C4911a(C4913c cVar) {
            this.f10134a = cVar;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                synchronized (this.f10134a) {
                    boolean unused = this.f10134a.f10141c = true;
                    this.f10134a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.g$b */
    public static abstract class C4912b implements Runnable {

        /* renamed from: a */
        protected int f10135a;

        public C4912b(int i) {
            this.f10135a = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.g$c */
    private static final class C4913c extends Thread {

        /* renamed from: a */
        private volatile long f10136a = 0;

        /* renamed from: a */
        private C4914a f10137a = new C4914a();

        /* renamed from: a */
        private volatile boolean f10138a = false;

        /* renamed from: b */
        private long f10139b = 50;

        /* renamed from: b */
        private boolean f10140b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f10141c;

        /* renamed from: com.xiaomi.push.service.g$c$a */
        private static final class C4914a {

            /* renamed from: a */
            private int f10142a;

            /* renamed from: a */
            private C4915d[] f10143a;

            /* renamed from: b */
            private int f10144b;

            /* renamed from: c */
            private int f10145c;

            private C4914a() {
                this.f10142a = 256;
                this.f10143a = new C4915d[256];
                this.f10144b = 0;
                this.f10145c = 0;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public int mo25985a(C4915d dVar) {
                int i = 0;
                while (true) {
                    C4915d[] dVarArr = this.f10143a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            /* renamed from: c */
            private void m15765c() {
                int i = this.f10144b - 1;
                int i2 = (i - 1) / 2;
                while (true) {
                    C4915d[] dVarArr = this.f10143a;
                    if (dVarArr[i].f10147a < dVarArr[i2].f10147a) {
                        C4915d dVar = dVarArr[i];
                        dVarArr[i] = dVarArr[i2];
                        dVarArr[i2] = dVar;
                        int i3 = i2;
                        i2 = (i2 - 1) / 2;
                        i = i3;
                    } else {
                        return;
                    }
                }
            }

            /* renamed from: c */
            private void m15766c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.f10144b;
                    if (i2 < i3 && i3 > 0) {
                        int i4 = i2 + 1;
                        if (i4 < i3) {
                            C4915d[] dVarArr = this.f10143a;
                            if (dVarArr[i4].f10147a < dVarArr[i2].f10147a) {
                                i2 = i4;
                            }
                        }
                        C4915d[] dVarArr2 = this.f10143a;
                        if (dVarArr2[i].f10147a >= dVarArr2[i2].f10147a) {
                            C4915d dVar = dVarArr2[i];
                            dVarArr2[i] = dVarArr2[i2];
                            dVarArr2[i2] = dVar;
                            int i5 = i2;
                            i2 = (i2 * 2) + 1;
                            i = i5;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            /* renamed from: a */
            public C4915d mo25982a() {
                return this.f10143a[0];
            }

            /* renamed from: a */
            public void m15768a() {
                this.f10143a = new C4915d[this.f10142a];
                this.f10144b = 0;
            }

            /* renamed from: a */
            public void mo25983a(int i) {
                for (int i2 = 0; i2 < this.f10144b; i2++) {
                    C4915d[] dVarArr = this.f10143a;
                    if (dVarArr[i2].f10146a == i) {
                        dVarArr[i2].mo25989a();
                    }
                }
                mo25986b();
            }

            /* renamed from: a */
            public void mo25984a(int i, C4912b bVar) {
                for (int i2 = 0; i2 < this.f10144b; i2++) {
                    C4915d[] dVarArr = this.f10143a;
                    if (dVarArr[i2].f10148a == bVar) {
                        dVarArr[i2].mo25989a();
                    }
                }
                mo25986b();
            }

            /* renamed from: a */
            public void m15771a(C4915d dVar) {
                C4915d[] dVarArr = this.f10143a;
                int length = dVarArr.length;
                int i = this.f10144b;
                if (length == i) {
                    C4915d[] dVarArr2 = new C4915d[(i * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f10143a = dVarArr2;
                }
                C4915d[] dVarArr3 = this.f10143a;
                int i2 = this.f10144b;
                this.f10144b = i2 + 1;
                dVarArr3[i2] = dVar;
                m15765c();
            }

            /* renamed from: a */
            public boolean m15772a() {
                return this.f10144b == 0;
            }

            /* renamed from: a */
            public boolean m15773a(int i) {
                for (int i2 = 0; i2 < this.f10144b; i2++) {
                    if (this.f10143a[i2].f10146a == i) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: b */
            public void mo25986b() {
                int i = 0;
                while (i < this.f10144b) {
                    if (this.f10143a[i].f10150a) {
                        this.f10145c++;
                        mo25987b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* renamed from: b */
            public void mo25987b(int i) {
                int i2;
                if (i >= 0 && i < (i2 = this.f10144b)) {
                    C4915d[] dVarArr = this.f10143a;
                    int i3 = i2 - 1;
                    this.f10144b = i3;
                    dVarArr[i] = dVarArr[i3];
                    dVarArr[i3] = null;
                    m15766c(i);
                }
            }
        }

        C4913c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15758a(C4915d dVar) {
            this.f10137a.mo25985a(dVar);
            notify();
        }

        /* renamed from: a */
        public synchronized void mo25980a() {
            this.f10140b = true;
            this.f10137a.mo25982a();
            notify();
        }

        /* renamed from: a */
        public boolean m15762a() {
            return this.f10138a && SystemClock.uptimeMillis() - this.f10136a > 600000;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|(2:8|(3:83|10|11)(2:12|13))(2:17|26)|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r10.f10136a = android.os.SystemClock.uptimeMillis();
            r10.f10138a = true;
            r2.f10148a.run();
            r10.f10138a = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a4, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a5, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r10.f10140b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a9, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
            L_0x0000:
                monitor-enter(r10)
                boolean r0 = r10.f10140b     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
                return
            L_0x0007:
                com.xiaomi.push.service.g$c$a r0 = r10.f10137a     // Catch:{ all -> 0x00b3 }
                boolean r0 = r0.mo25982a()     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r10.f10141c     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x0015
                monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
                return
            L_0x0015:
                r10.wait()     // Catch:{ InterruptedException -> 0x0018 }
            L_0x0018:
                monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
                goto L_0x0000
            L_0x001a:
                long r0 = com.xiaomi.push.service.C4910g.mo25973a()     // Catch:{ all -> 0x00b3 }
                com.xiaomi.push.service.g$c$a r2 = r10.f10137a     // Catch:{ all -> 0x00b3 }
                com.xiaomi.push.service.g$d r2 = r2.mo25982a()     // Catch:{ all -> 0x00b3 }
                java.lang.Object r3 = r2.f10149a     // Catch:{ all -> 0x00b3 }
                monitor-enter(r3)     // Catch:{ all -> 0x00b3 }
                boolean r4 = r2.f10150a     // Catch:{ all -> 0x00b0 }
                r5 = 0
                if (r4 == 0) goto L_0x0033
                com.xiaomi.push.service.g$c$a r0 = r10.f10137a     // Catch:{ all -> 0x00b0 }
                r0.mo25987b(r5)     // Catch:{ all -> 0x00b0 }
                monitor-exit(r3)     // Catch:{ all -> 0x00b0 }
                goto L_0x0018
            L_0x0033:
                long r6 = r2.f10147a     // Catch:{ all -> 0x00b0 }
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch:{ all -> 0x00b0 }
                r0 = 50
                r3 = 0
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 <= 0) goto L_0x0058
                long r2 = r10.f10139b     // Catch:{ all -> 0x00b3 }
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0047
                long r6 = r10.f10139b     // Catch:{ all -> 0x00b3 }
            L_0x0047:
                long r2 = r10.f10139b     // Catch:{ all -> 0x00b3 }
                long r2 = r2 + r0
                r10.f10139b = r2     // Catch:{ all -> 0x00b3 }
                r0 = 500(0x1f4, double:2.47E-321)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L_0x0054
                r10.f10139b = r0     // Catch:{ all -> 0x00b3 }
            L_0x0054:
                r10.wait(r6)     // Catch:{ InterruptedException -> 0x0018 }
                goto L_0x0018
            L_0x0058:
                r10.f10139b = r0     // Catch:{ all -> 0x00b3 }
                java.lang.Object r0 = r2.f10149a     // Catch:{ all -> 0x00b3 }
                monitor-enter(r0)     // Catch:{ all -> 0x00b3 }
                com.xiaomi.push.service.g$c$a r1 = r10.f10137a     // Catch:{ all -> 0x00ad }
                com.xiaomi.push.service.g$d r1 = r1.mo25982a()     // Catch:{ all -> 0x00ad }
                long r6 = r1.f10147a     // Catch:{ all -> 0x00ad }
                long r8 = r2.f10147a     // Catch:{ all -> 0x00ad }
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0072
                com.xiaomi.push.service.g$c$a r1 = r10.f10137a     // Catch:{ all -> 0x00ad }
                int r1 = r1.mo25985a((com.xiaomi.push.service.C4910g.C4915d) r2)     // Catch:{ all -> 0x00ad }
                goto L_0x0073
            L_0x0072:
                r1 = 0
            L_0x0073:
                boolean r6 = r2.f10150a     // Catch:{ all -> 0x00ad }
                if (r6 == 0) goto L_0x0084
                com.xiaomi.push.service.g$c$a r1 = r10.f10137a     // Catch:{ all -> 0x00ad }
                com.xiaomi.push.service.g$c$a r3 = r10.f10137a     // Catch:{ all -> 0x00ad }
                int r2 = r3.mo25985a((com.xiaomi.push.service.C4910g.C4915d) r2)     // Catch:{ all -> 0x00ad }
                r1.mo25987b(r2)     // Catch:{ all -> 0x00ad }
                monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                goto L_0x0018
            L_0x0084:
                long r6 = r2.f10147a     // Catch:{ all -> 0x00ad }
                r2.mo25988a(r6)     // Catch:{ all -> 0x00ad }
                com.xiaomi.push.service.g$c$a r6 = r10.f10137a     // Catch:{ all -> 0x00ad }
                r6.mo25987b(r1)     // Catch:{ all -> 0x00ad }
                r2.f10147a = r3     // Catch:{ all -> 0x00ad }
                monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00a4 }
                r10.f10136a = r3     // Catch:{ all -> 0x00a4 }
                r10.f10138a = r0     // Catch:{ all -> 0x00a4 }
                com.xiaomi.push.service.g$b r1 = r2.f10148a     // Catch:{ all -> 0x00a4 }
                r1.run()     // Catch:{ all -> 0x00a4 }
                r10.f10138a = r5     // Catch:{ all -> 0x00a4 }
                goto L_0x0000
            L_0x00a4:
                r1 = move-exception
                monitor-enter(r10)
                r10.f10140b = r0     // Catch:{ all -> 0x00aa }
                monitor-exit(r10)     // Catch:{ all -> 0x00aa }
                throw r1
            L_0x00aa:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00aa }
                throw r0
            L_0x00ad:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ad }
                throw r1     // Catch:{ all -> 0x00b3 }
            L_0x00b0:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00b0 }
                throw r0     // Catch:{ all -> 0x00b3 }
            L_0x00b3:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
                goto L_0x00b7
            L_0x00b6:
                throw r0
            L_0x00b7:
                goto L_0x00b6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4910g.C4913c.run():void");
        }
    }

    /* renamed from: com.xiaomi.push.service.g$d */
    static class C4915d {

        /* renamed from: a */
        int f10146a;

        /* renamed from: a */
        long f10147a;

        /* renamed from: a */
        C4912b f10148a;

        /* renamed from: a */
        final Object f10149a = new Object();

        /* renamed from: a */
        boolean f10150a;

        /* renamed from: b */
        private long f10151b;

        C4915d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25988a(long j) {
            synchronized (this.f10149a) {
                this.f10151b = j;
            }
        }

        /* renamed from: a */
        public boolean mo25989a() {
            boolean z;
            synchronized (this.f10149a) {
                z = !this.f10150a && this.f10147a > 0;
                this.f10150a = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f10129a = j;
        f10130b = j;
    }

    public C4910g() {
        this(false);
    }

    public C4910g(String str) {
        this(str, false);
    }

    public C4910g(String str, boolean z) {
        if (str != null) {
            C4913c cVar = new C4913c(str, z);
            this.f10133a = cVar;
            this.f10132a = new C4911a(cVar);
            return;
        }
        throw new NullPointerException("name == null");
    }

    public C4910g(boolean z) {
        this("Timer-" + mo25978b(), z);
    }

    /* renamed from: a */
    static synchronized long mo25973a() {
        long j;
        synchronized (C4910g.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > f10130b) {
                f10129a += elapsedRealtime - f10130b;
            }
            f10130b = elapsedRealtime;
            j = f10129a;
        }
        return j;
    }

    /* renamed from: b */
    private static synchronized long mo25978b() {
        long j;
        synchronized (C4910g.class) {
            j = f10131c;
            f10131c = 1 + j;
        }
        return j;
    }

    /* renamed from: b */
    private void m15747b(C4912b bVar, long j) {
        synchronized (this.f10133a) {
            if (!C4913c.m15756a(this.f10133a)) {
                long a = j + mo25973a();
                if (a >= 0) {
                    C4915d dVar = new C4915d();
                    dVar.f10146a = bVar.f10135a;
                    dVar.f10148a = bVar;
                    dVar.f10147a = a;
                    this.f10133a.m15758a(dVar);
                } else {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a);
                }
            } else {
                throw new IllegalStateException("Timer was canceled");
            }
        }
    }

    /* renamed from: a */
    public void m15748a() {
        this.f10133a.mo25980a();
    }

    /* renamed from: a */
    public void mo25974a(int i) {
        synchronized (this.f10133a) {
            C4913c.m15756a(this.f10133a).mo25983a(i);
        }
    }

    /* renamed from: a */
    public void mo25975a(int i, C4912b bVar) {
        synchronized (this.f10133a) {
            C4913c.m15756a(this.f10133a).mo25984a(i, bVar);
        }
    }

    /* renamed from: a */
    public void mo25976a(C4912b bVar) {
        if (C3989b.m10668a() >= 1 || Thread.currentThread() == this.f10133a) {
            bVar.run();
        } else {
            C3989b.m10681d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* renamed from: a */
    public void mo25977a(C4912b bVar, long j) {
        if (j >= 0) {
            m15747b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a */
    public boolean m15753a() {
        return this.f10133a.mo25980a();
    }

    /* renamed from: a */
    public boolean m15754a(int i) {
        boolean a;
        synchronized (this.f10133a) {
            a = C4913c.m15756a(this.f10133a).mo25983a(i);
        }
        return a;
    }

    /* renamed from: b */
    public void m15755b() {
        synchronized (this.f10133a) {
            C4913c.m15756a(this.f10133a).mo25982a();
        }
    }
}
