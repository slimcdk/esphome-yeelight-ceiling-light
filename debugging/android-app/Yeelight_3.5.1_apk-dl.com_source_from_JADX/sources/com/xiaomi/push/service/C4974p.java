package com.xiaomi.push.service;

import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.XMPushService;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.xiaomi.push.service.p */
public class C4974p {

    /* renamed from: a */
    private static long f9708a;

    /* renamed from: b */
    private static long f9709b;

    /* renamed from: c */
    private static long f9710c;

    /* renamed from: a */
    private final C4975a f9711a;

    /* renamed from: a */
    private final C4977c f9712a;

    /* renamed from: com.xiaomi.push.service.p$a */
    private static final class C4975a {

        /* renamed from: a */
        private final C4977c f9713a;

        C4975a(C4977c cVar) {
            this.f9713a = cVar;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                synchronized (this.f9713a) {
                    boolean unused = this.f9713a.f9720c = true;
                    this.f9713a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.p$b */
    public static abstract class C4976b implements Runnable {

        /* renamed from: a */
        protected int f9714a;

        public C4976b(int i) {
            this.f9714a = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.p$c */
    private static final class C4977c extends Thread {

        /* renamed from: a */
        private volatile long f9715a = 0;

        /* renamed from: a */
        private C4978a f9716a = new C4978a();

        /* renamed from: a */
        private volatile boolean f9717a = false;

        /* renamed from: b */
        private long f9718b = 50;

        /* renamed from: b */
        private boolean f9719b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f9720c;

        /* renamed from: com.xiaomi.push.service.p$c$a */
        private static final class C4978a {

            /* renamed from: a */
            private int f9721a;

            /* renamed from: a */
            private C4979d[] f9722a;

            /* renamed from: b */
            private int f9723b;

            /* renamed from: c */
            private int f9724c;

            private C4978a() {
                this.f9721a = 256;
                this.f9722a = new C4979d[256];
                this.f9723b = 0;
                this.f9724c = 0;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public int mo30075a(C4979d dVar) {
                int i = 0;
                while (true) {
                    C4979d[] dVarArr = this.f9722a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            /* renamed from: b */
            private void m15645b(C4979d dVar) {
                Intent a;
                C4976b bVar = dVar.f9727a;
                int i = bVar.f9714a;
                if (i == 8) {
                    XMPushService.C4843d dVar2 = (XMPushService.C4843d) bVar;
                    if (dVar2.mo29133a().f8170a != null) {
                        dVar2.mo29133a().f8170a.f9473b = System.currentTimeMillis();
                        dVar2.mo29133a().f8170a.f9472b = mo30075a(dVar);
                    }
                } else if (i == 15 && (a = ((XMPushService.C4848i) bVar).mo29133a()) != null && "10".equals(a.getStringExtra("ext_chid"))) {
                    a.putExtra("enqueue", System.currentTimeMillis());
                    a.putExtra("num", mo30075a(dVar));
                }
            }

            /* renamed from: c */
            private void m15646c() {
                int i = this.f9723b - 1;
                int i2 = (i - 1) / 2;
                while (true) {
                    C4979d[] dVarArr = this.f9722a;
                    if (dVarArr[i].f9726a < dVarArr[i2].f9726a) {
                        C4979d dVar = dVarArr[i];
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
            private void m15647c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.f9723b;
                    if (i2 < i3 && i3 > 0) {
                        int i4 = i2 + 1;
                        if (i4 < i3) {
                            C4979d[] dVarArr = this.f9722a;
                            if (dVarArr[i4].f9726a < dVarArr[i2].f9726a) {
                                i2 = i4;
                            }
                        }
                        C4979d[] dVarArr2 = this.f9722a;
                        if (dVarArr2[i].f9726a >= dVarArr2[i2].f9726a) {
                            C4979d dVar = dVarArr2[i];
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
            public C4979d mo30072a() {
                return this.f9722a[0];
            }

            /* renamed from: a */
            public void m15649a() {
                this.f9722a = new C4979d[this.f9721a];
                this.f9723b = 0;
            }

            /* renamed from: a */
            public void mo30073a(int i) {
                for (int i2 = 0; i2 < this.f9723b; i2++) {
                    C4979d[] dVarArr = this.f9722a;
                    if (dVarArr[i2].f9725a == i) {
                        dVarArr[i2].mo30079a();
                    }
                }
                mo30076b();
            }

            /* renamed from: a */
            public void mo30074a(int i, C4976b bVar) {
                for (int i2 = 0; i2 < this.f9723b; i2++) {
                    C4979d[] dVarArr = this.f9722a;
                    if (dVarArr[i2].f9727a == bVar) {
                        dVarArr[i2].mo30079a();
                    }
                }
                mo30076b();
            }

            /* renamed from: a */
            public void m15652a(C4979d dVar) {
                C4979d[] dVarArr = this.f9722a;
                int length = dVarArr.length;
                int i = this.f9723b;
                if (length == i) {
                    C4979d[] dVarArr2 = new C4979d[(i * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f9722a = dVarArr2;
                }
                C4979d[] dVarArr3 = this.f9722a;
                int i2 = this.f9723b;
                this.f9723b = i2 + 1;
                dVarArr3[i2] = dVar;
                m15646c();
                m15645b(dVar);
            }

            /* renamed from: a */
            public boolean m15653a() {
                return this.f9723b == 0;
            }

            /* renamed from: a */
            public boolean m15654a(int i) {
                for (int i2 = 0; i2 < this.f9723b; i2++) {
                    if (this.f9722a[i2].f9725a == i) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: b */
            public void mo30076b() {
                int i = 0;
                while (i < this.f9723b) {
                    if (this.f9722a[i].f9729a) {
                        this.f9724c++;
                        mo30077b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* renamed from: b */
            public void mo30077b(int i) {
                int i2;
                if (i >= 0 && i < (i2 = this.f9723b)) {
                    C4979d[] dVarArr = this.f9722a;
                    int i3 = i2 - 1;
                    this.f9723b = i3;
                    dVarArr[i] = dVarArr[i3];
                    dVarArr[i3] = null;
                    m15647c(i);
                }
            }
        }

        C4977c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15638a(C4979d dVar) {
            this.f9716a.mo30075a(dVar);
            notify();
        }

        /* renamed from: a */
        public synchronized void mo30070a() {
            this.f9719b = true;
            this.f9716a.mo30072a();
            notify();
        }

        /* renamed from: a */
        public boolean m15642a() {
            return this.f9717a && SystemClock.uptimeMillis() - this.f9715a > 600000;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|(2:8|(3:83|10|11)(2:12|13))(2:17|26)|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r10.f9715a = android.os.SystemClock.uptimeMillis();
            r10.f9717a = true;
            r2.f9727a.run();
            r10.f9717a = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x009f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a0, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r10.f9719b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a4, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
            L_0x0000:
                monitor-enter(r10)
                boolean r0 = r10.f9719b     // Catch:{ all -> 0x00ae }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                return
            L_0x0007:
                com.xiaomi.push.service.p$c$a r0 = r10.f9716a     // Catch:{ all -> 0x00ae }
                boolean r0 = r0.mo30072a()     // Catch:{ all -> 0x00ae }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r10.f9720c     // Catch:{ all -> 0x00ae }
                if (r0 == 0) goto L_0x0015
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                return
            L_0x0015:
                r10.wait()     // Catch:{ InterruptedException -> 0x0018 }
            L_0x0018:
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                goto L_0x0000
            L_0x001a:
                long r0 = com.xiaomi.push.service.C4974p.mo30063a()     // Catch:{ all -> 0x00ae }
                com.xiaomi.push.service.p$c$a r2 = r10.f9716a     // Catch:{ all -> 0x00ae }
                com.xiaomi.push.service.p$d r2 = r2.mo30072a()     // Catch:{ all -> 0x00ae }
                java.lang.Object r3 = r2.f9728a     // Catch:{ all -> 0x00ae }
                monitor-enter(r3)     // Catch:{ all -> 0x00ae }
                boolean r4 = r2.f9729a     // Catch:{ all -> 0x00ab }
                r5 = 0
                if (r4 == 0) goto L_0x0033
                com.xiaomi.push.service.p$c$a r0 = r10.f9716a     // Catch:{ all -> 0x00ab }
                r0.mo30077b((int) r5)     // Catch:{ all -> 0x00ab }
                monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                goto L_0x0018
            L_0x0033:
                long r6 = r2.f9726a     // Catch:{ all -> 0x00ab }
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                r0 = 50
                r3 = 0
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 <= 0) goto L_0x0055
                long r2 = r10.f9718b     // Catch:{ all -> 0x00ae }
                int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0046
                r6 = r2
            L_0x0046:
                long r2 = r2 + r0
                r10.f9718b = r2     // Catch:{ all -> 0x00ae }
                r0 = 500(0x1f4, double:2.47E-321)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 <= 0) goto L_0x0051
                r10.f9718b = r0     // Catch:{ all -> 0x00ae }
            L_0x0051:
                r10.wait(r6)     // Catch:{ InterruptedException -> 0x0018 }
                goto L_0x0018
            L_0x0055:
                r10.f9718b = r0     // Catch:{ all -> 0x00ae }
                java.lang.Object r0 = r2.f9728a     // Catch:{ all -> 0x00ae }
                monitor-enter(r0)     // Catch:{ all -> 0x00ae }
                com.xiaomi.push.service.p$c$a r1 = r10.f9716a     // Catch:{ all -> 0x00a8 }
                com.xiaomi.push.service.p$d r1 = r1.mo30072a()     // Catch:{ all -> 0x00a8 }
                long r6 = r1.f9726a     // Catch:{ all -> 0x00a8 }
                long r8 = r2.f9726a     // Catch:{ all -> 0x00a8 }
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x006f
                com.xiaomi.push.service.p$c$a r1 = r10.f9716a     // Catch:{ all -> 0x00a8 }
                int r1 = r1.mo30075a((com.xiaomi.push.service.C4974p.C4979d) r2)     // Catch:{ all -> 0x00a8 }
                goto L_0x0070
            L_0x006f:
                r1 = 0
            L_0x0070:
                boolean r6 = r2.f9729a     // Catch:{ all -> 0x00a8 }
                if (r6 == 0) goto L_0x007f
                com.xiaomi.push.service.p$c$a r1 = r10.f9716a     // Catch:{ all -> 0x00a8 }
                int r2 = r1.mo30075a((com.xiaomi.push.service.C4974p.C4979d) r2)     // Catch:{ all -> 0x00a8 }
                r1.mo30077b((int) r2)     // Catch:{ all -> 0x00a8 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
                goto L_0x0018
            L_0x007f:
                long r6 = r2.f9726a     // Catch:{ all -> 0x00a8 }
                r2.mo30078a(r6)     // Catch:{ all -> 0x00a8 }
                com.xiaomi.push.service.p$c$a r6 = r10.f9716a     // Catch:{ all -> 0x00a8 }
                r6.mo30077b((int) r1)     // Catch:{ all -> 0x00a8 }
                r2.f9726a = r3     // Catch:{ all -> 0x00a8 }
                monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x009f }
                r10.f9715a = r3     // Catch:{ all -> 0x009f }
                r10.f9717a = r0     // Catch:{ all -> 0x009f }
                com.xiaomi.push.service.p$b r1 = r2.f9727a     // Catch:{ all -> 0x009f }
                r1.run()     // Catch:{ all -> 0x009f }
                r10.f9717a = r5     // Catch:{ all -> 0x009f }
                goto L_0x0000
            L_0x009f:
                r1 = move-exception
                monitor-enter(r10)
                r10.f9719b = r0     // Catch:{ all -> 0x00a5 }
                monitor-exit(r10)     // Catch:{ all -> 0x00a5 }
                throw r1
            L_0x00a5:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00a5 }
                throw r0
            L_0x00a8:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
                throw r1     // Catch:{ all -> 0x00ae }
            L_0x00ab:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00ab }
                throw r0     // Catch:{ all -> 0x00ae }
            L_0x00ae:
                r0 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00ae }
                goto L_0x00b2
            L_0x00b1:
                throw r0
            L_0x00b2:
                goto L_0x00b1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4974p.C4977c.run():void");
        }
    }

    /* renamed from: com.xiaomi.push.service.p$d */
    static class C4979d {

        /* renamed from: a */
        int f9725a;

        /* renamed from: a */
        long f9726a;

        /* renamed from: a */
        C4976b f9727a;

        /* renamed from: a */
        final Object f9728a = new Object();

        /* renamed from: a */
        boolean f9729a;

        /* renamed from: b */
        private long f9730b;

        C4979d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo30078a(long j) {
            synchronized (this.f9728a) {
                this.f9730b = j;
            }
        }

        /* renamed from: a */
        public boolean mo30079a() {
            boolean z;
            synchronized (this.f9728a) {
                z = !this.f9729a && this.f9726a > 0;
                this.f9729a = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f9708a = j;
        f9709b = j;
    }

    public C4974p() {
        this(false);
    }

    public C4974p(String str) {
        this(str, false);
    }

    public C4974p(String str, boolean z) {
        Objects.requireNonNull(str, "name == null");
        C4977c cVar = new C4977c(str, z);
        this.f9712a = cVar;
        this.f9711a = new C4975a(cVar);
    }

    public C4974p(boolean z) {
        this("Timer-" + mo30068b(), z);
    }

    /* renamed from: a */
    static synchronized long mo30063a() {
        long j;
        synchronized (C4974p.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = f9709b;
            if (elapsedRealtime > j2) {
                f9708a += elapsedRealtime - j2;
            }
            f9709b = elapsedRealtime;
            j = f9708a;
        }
        return j;
    }

    /* renamed from: b */
    private static synchronized long mo30068b() {
        long j;
        synchronized (C4974p.class) {
            j = f9710c;
            f9710c = 1 + j;
        }
        return j;
    }

    /* renamed from: b */
    private void m15627b(C4976b bVar, long j) {
        synchronized (this.f9712a) {
            if (!C4977c.m15636a(this.f9712a)) {
                long a = j + mo30063a();
                if (a >= 0) {
                    C4979d dVar = new C4979d();
                    dVar.f9725a = bVar.f9714a;
                    dVar.f9727a = bVar;
                    dVar.f9726a = a;
                    this.f9712a.m15638a(dVar);
                } else {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a);
                }
            } else {
                throw new IllegalStateException("Timer was canceled");
            }
        }
    }

    /* renamed from: a */
    public void m15628a() {
        C4408b.m12464a("quit. finalizer:" + this.f9711a);
        this.f9712a.mo30070a();
    }

    /* renamed from: a */
    public void mo30064a(int i) {
        synchronized (this.f9712a) {
            C4977c.m15636a(this.f9712a).mo30073a(i);
        }
    }

    /* renamed from: a */
    public void mo30065a(int i, C4976b bVar) {
        synchronized (this.f9712a) {
            C4977c.m15636a(this.f9712a).mo30074a(i, bVar);
        }
    }

    /* renamed from: a */
    public void mo30066a(C4976b bVar) {
        if (C4408b.m12463a() >= 1 || Thread.currentThread() == this.f9712a) {
            bVar.run();
        } else {
            C4408b.m12483d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* renamed from: a */
    public void mo30067a(C4976b bVar, long j) {
        if (j >= 0) {
            m15627b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a */
    public boolean m15633a() {
        return this.f9712a.mo30070a();
    }

    /* renamed from: a */
    public boolean m15634a(int i) {
        boolean a;
        synchronized (this.f9712a) {
            a = C4977c.m15636a(this.f9712a).mo30073a(i);
        }
        return a;
    }

    /* renamed from: b */
    public void m15635b() {
        synchronized (this.f9712a) {
            C4977c.m15636a(this.f9712a).mo30072a();
        }
    }
}
