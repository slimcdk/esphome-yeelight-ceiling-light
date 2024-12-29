package p164h.p211a.p212a.p228h.p232d0;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p164h.p211a.p212a.p228h.C11117e;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.d0.b */
public class C11109b extends C11145a implements C11114d, Executor, C11152d {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C11158c f21962u = C11156b.m29015a(C11109b.class);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicInteger f21963e = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicInteger f21964f = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicLong f21965g = new AtomicLong();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConcurrentLinkedQueue<Thread> f21966h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    private final Object f21967i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public BlockingQueue<Runnable> f21968j;

    /* renamed from: k */
    private String f21969k = ("qtp" + super.hashCode());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f21970l = 60000;

    /* renamed from: m */
    private int f21971m = 254;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f21972n = 8;

    /* renamed from: o */
    private int f21973o = -1;

    /* renamed from: p */
    private int f21974p = 5;

    /* renamed from: q */
    private boolean f21975q = false;

    /* renamed from: r */
    private int f21976r = 100;

    /* renamed from: s */
    private boolean f21977s = false;

    /* renamed from: t */
    private Runnable f21978t = new C11112c();

    /* renamed from: h.a.a.h.d0.b$a */
    class C11110a implements Runnable {
        C11110a(C11109b bVar) {
        }

        public void run() {
        }
    }

    /* renamed from: h.a.a.h.d0.b$b */
    class C11111b implements C11152d {

        /* renamed from: a */
        final /* synthetic */ Thread f21979a;

        /* renamed from: b */
        final /* synthetic */ boolean f21980b;

        /* renamed from: c */
        final /* synthetic */ StackTraceElement[] f21981c;

        C11111b(C11109b bVar, Thread thread, boolean z, StackTraceElement[] stackTraceElementArr) {
            this.f21979a = thread;
            this.f21980b = z;
            this.f21981c = stackTraceElementArr;
        }

        /* renamed from: k0 */
        public void mo34187k0(Appendable appendable, String str) {
            appendable.append(String.valueOf(this.f21979a.getId())).append(' ').append(this.f21979a.getName()).append(' ').append(this.f21979a.getState().toString()).append(this.f21980b ? " IDLE" : "").append(10);
            if (!this.f21980b) {
                C11146b.m28976B0(appendable, str, Arrays.asList(this.f21981c));
            }
        }
    }

    /* renamed from: h.a.a.h.d0.b$c */
    class C11112c implements Runnable {
        C11112c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
            if (r2 == false) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0119, code lost:
            if (r2 != false) goto L_0x0124;
         */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x010e A[Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe, all -> 0x0132 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0135  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                r0 = 0
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.util.concurrent.BlockingQueue r1 = r1.f21968j     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.lang.Object r1 = r1.poll()     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                r2 = 0
            L_0x000e:
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                boolean r3 = r3.isRunning()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                if (r3 == 0) goto L_0x00f7
            L_0x0016:
                if (r1 == 0) goto L_0x0032
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                boolean r3 = r3.isRunning()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                if (r3 == 0) goto L_0x0032
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                r3.mo35298N0(r1)     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.BlockingQueue r1 = r1.f21968j     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.lang.Object r1 = r1.poll()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                goto L_0x0016
            L_0x0032:
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f21964f     // Catch:{ all -> 0x00ec }
                r3.incrementAndGet()     // Catch:{ all -> 0x00ec }
            L_0x003b:
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                boolean r3 = r3.isRunning()     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x00e1
                if (r1 != 0) goto L_0x00e1
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                int r1 = r1.f21970l     // Catch:{ all -> 0x00ec }
                if (r1 > 0) goto L_0x005a
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.BlockingQueue r1 = r1.f21968j     // Catch:{ all -> 0x00ec }
                java.lang.Object r1 = r1.take()     // Catch:{ all -> 0x00ec }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x00ec }
                goto L_0x003b
            L_0x005a:
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f21963e     // Catch:{ all -> 0x00ec }
                int r1 = r1.get()     // Catch:{ all -> 0x00ec }
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                int r3 = r3.f21972n     // Catch:{ all -> 0x00ec }
                if (r1 <= r3) goto L_0x00d9
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicLong r3 = r3.f21965g     // Catch:{ all -> 0x00ec }
                long r3 = r3.get()     // Catch:{ all -> 0x00ec }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ec }
                r7 = 0
                int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x008d
                long r7 = r5 - r3
                h.a.a.h.d0.b r9 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                int r9 = r9.f21970l     // Catch:{ all -> 0x00ec }
                long r9 = (long) r9     // Catch:{ all -> 0x00ec }
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x00d9
            L_0x008d:
                h.a.a.h.d0.b r7 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicLong r7 = r7.f21965g     // Catch:{ all -> 0x00ec }
                boolean r3 = r7.compareAndSet(r3, r5)     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x00a9
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f21963e     // Catch:{ all -> 0x00ec }
                int r4 = r1 + -1
                boolean r1 = r3.compareAndSet(r1, r4)     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x00a9
                r1 = 1
                goto L_0x00aa
            L_0x00a9:
                r1 = 0
            L_0x00aa:
                if (r1 == 0) goto L_0x00d8
                h.a.a.h.d0.b r0 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f21964f     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                r0.decrementAndGet()     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                if (r1 != 0) goto L_0x00c0
                h.a.a.h.d0.b r0 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f21963e
                r0.decrementAndGet()
            L_0x00c0:
                h.a.a.h.d0.b r0 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f21966h
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.remove(r1)
                return
            L_0x00ce:
                r0 = move-exception
                r2 = r1
                goto L_0x0133
            L_0x00d2:
                r0 = move-exception
                r2 = r1
                goto L_0x0105
            L_0x00d5:
                r0 = move-exception
                r2 = r1
                goto L_0x0112
            L_0x00d8:
                r2 = r1
            L_0x00d9:
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ all -> 0x00ec }
                java.lang.Runnable r1 = r1.m28810L0()     // Catch:{ all -> 0x00ec }
                goto L_0x003b
            L_0x00e1:
                h.a.a.h.d0.b r3 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f21964f     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                r3.decrementAndGet()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                goto L_0x000e
            L_0x00ec:
                r0 = move-exception
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f21964f     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                r1.decrementAndGet()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                throw r0     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
            L_0x00f7:
                if (r2 != 0) goto L_0x0124
                goto L_0x011b
            L_0x00fa:
                r0 = move-exception
                goto L_0x0105
            L_0x00fc:
                r0 = move-exception
                goto L_0x0112
            L_0x00fe:
                r1 = move-exception
                r0 = r1
                r2 = 0
                goto L_0x0133
            L_0x0102:
                r1 = move-exception
                r0 = r1
                r2 = 0
            L_0x0105:
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.f21962u     // Catch:{ all -> 0x0132 }
                r1.mo35495k(r0)     // Catch:{ all -> 0x0132 }
                if (r2 != 0) goto L_0x0124
                goto L_0x011b
            L_0x010f:
                r1 = move-exception
                r0 = r1
                r2 = 0
            L_0x0112:
                h.a.a.h.y.c r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.f21962u     // Catch:{ all -> 0x0132 }
                r1.mo35488d(r0)     // Catch:{ all -> 0x0132 }
                if (r2 != 0) goto L_0x0124
            L_0x011b:
                h.a.a.h.d0.b r0 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f21963e
                r0.decrementAndGet()
            L_0x0124:
                h.a.a.h.d0.b r0 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f21966h
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.remove(r1)
                return
            L_0x0132:
                r0 = move-exception
            L_0x0133:
                if (r2 != 0) goto L_0x013e
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f21963e
                r1.decrementAndGet()
            L_0x013e:
                h.a.a.h.d0.b r1 = p164h.p211a.p212a.p228h.p232d0.C11109b.this
                java.util.concurrent.ConcurrentLinkedQueue r1 = r1.f21966h
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r1.remove(r2)
                goto L_0x014d
            L_0x014c:
                throw r0
            L_0x014d:
                goto L_0x014c
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p232d0.C11109b.C11112c.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L0 */
    public Runnable m28810L0() {
        return this.f21968j.poll((long) this.f21970l, TimeUnit.MILLISECONDS);
    }

    /* renamed from: R0 */
    private boolean m28811R0(int i) {
        if (!this.f21963e.compareAndSet(i, i + 1)) {
            return false;
        }
        try {
            Thread M0 = mo35297M0(this.f21978t);
            M0.setDaemon(this.f21975q);
            M0.setPriority(this.f21974p);
            M0.setName(this.f21969k + Constants.ACCEPT_TIME_SEPARATOR_SERVER + M0.getId());
            this.f21966h.add(M0);
            M0.start();
            return true;
        } catch (Throwable th) {
            this.f21963e.decrementAndGet();
            throw th;
        }
    }

    /* renamed from: H0 */
    public int mo35293H0() {
        return this.f21964f.get();
    }

    /* renamed from: I0 */
    public int mo35294I0() {
        return this.f21971m;
    }

    /* renamed from: J0 */
    public int mo35295J0() {
        return this.f21972n;
    }

    /* renamed from: K0 */
    public int mo35296K0() {
        return this.f21963e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public Thread mo35297M0(Runnable runnable) {
        return new Thread(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo35298N0(Runnable runnable) {
        runnable.run();
    }

    /* renamed from: O0 */
    public void mo35299O0(boolean z) {
        this.f21975q = z;
    }

    /* renamed from: P0 */
    public void mo35300P0(int i) {
        this.f21971m = i;
        if (this.f21972n > i) {
            this.f21972n = i;
        }
    }

    /* renamed from: Q0 */
    public void mo35301Q0(String str) {
        if (!isRunning()) {
            this.f21969k = str;
            return;
        }
        throw new IllegalStateException("started");
    }

    /* renamed from: e0 */
    public boolean mo35291e0(Runnable runnable) {
        int i;
        if (isRunning()) {
            int size = this.f21968j.size();
            int H0 = mo35293H0();
            if (this.f21968j.offer(runnable)) {
                if ((H0 == 0 || size > H0) && (i = this.f21963e.get()) < this.f21971m) {
                    m28811R0(i);
                }
                return true;
            }
        }
        f21962u.mo35489e("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    public void execute(Runnable runnable) {
        if (!mo35291e0(runnable)) {
            throw new RejectedExecutionException();
        }
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        ArrayList arrayList = new ArrayList(mo35294I0());
        Iterator<Thread> it = this.f21966h.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Thread next = it.next();
                StackTraceElement[] stackTrace = next.getStackTrace();
                if (stackTrace != null) {
                    int length = stackTrace.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if ("idleJobPoll".equals(stackTrace[i].getMethodName())) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z = false;
                if (this.f21977s) {
                    arrayList.add(new C11111b(this, next, z, stackTrace));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.getId());
                    sb.append(" ");
                    sb.append(next.getName());
                    sb.append(" ");
                    sb.append(next.getState());
                    sb.append(" @ ");
                    sb.append(stackTrace.length > 0 ? stackTrace[0] : "???");
                    sb.append(z ? " IDLE" : "");
                    arrayList.add(sb.toString());
                }
            } else {
                C11146b.m28977C0(appendable, this);
                C11146b.m28976B0(appendable, str, arrayList);
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        BlockingQueue<Runnable> blockingQueue;
        super.mo34262p0();
        this.f21963e.set(0);
        if (this.f21968j == null) {
            if (this.f21973o > 0) {
                blockingQueue = new ArrayBlockingQueue<>(this.f21973o);
            } else {
                int i = this.f21972n;
                blockingQueue = new C11117e<>(i, i);
            }
            this.f21968j = blockingQueue;
        }
        while (true) {
            int i2 = this.f21963e.get();
            if (isRunning() && i2 < this.f21972n) {
                m28811R0(i2);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        long currentTimeMillis = System.currentTimeMillis();
        while (this.f21963e.get() > 0 && System.currentTimeMillis() - currentTimeMillis < ((long) (this.f21976r / 2))) {
            Thread.sleep(1);
        }
        this.f21968j.clear();
        C11110a aVar = new C11110a(this);
        int i = this.f21964f.get();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            this.f21968j.offer(aVar);
            i = i2;
        }
        Thread.yield();
        if (this.f21963e.get() > 0) {
            Iterator<Thread> it = this.f21966h.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        while (this.f21963e.get() > 0 && System.currentTimeMillis() - currentTimeMillis < ((long) this.f21976r)) {
            Thread.sleep(1);
        }
        Thread.yield();
        int size = this.f21966h.size();
        if (size > 0) {
            f21962u.mo35486b(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || f21962u.mo35485a()) {
                Iterator<Thread> it2 = this.f21966h.iterator();
                while (it2.hasNext()) {
                    Thread next = it2.next();
                    f21962u.mo35494j("Couldn't stop " + next, new Object[0]);
                    for (StackTraceElement stackTraceElement : next.getStackTrace()) {
                        f21962u.mo35494j(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f21967i) {
            this.f21967i.notifyAll();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21969k);
        sb.append("{");
        sb.append(mo35295J0());
        sb.append("<=");
        sb.append(mo35293H0());
        sb.append("<=");
        sb.append(mo35296K0());
        sb.append(MiotCloudImpl.COOKIE_PATH);
        sb.append(mo35294I0());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        BlockingQueue<Runnable> blockingQueue = this.f21968j;
        sb.append(blockingQueue == null ? -1 : blockingQueue.size());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public boolean mo35292v() {
        return this.f21963e.get() == this.f21971m && this.f21968j.size() >= this.f21964f.get();
    }
}
