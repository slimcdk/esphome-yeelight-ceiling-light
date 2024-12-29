package p172i6;

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
import org.eclipse.jetty.util.C9981e;
import p147d6.C8941a;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: i6.b */
public class C9122b extends C8941a implements C9127d, Executor, C8948d {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C9003c f16867u = C9001b.m21450a(C9122b.class);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicInteger f16868e = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicInteger f16869f = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicLong f16870g = new AtomicLong();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConcurrentLinkedQueue<Thread> f16871h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    private final Object f16872i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public BlockingQueue<Runnable> f16873j;

    /* renamed from: k */
    private String f16874k = ("qtp" + super.hashCode());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f16875l = 60000;

    /* renamed from: m */
    private int f16876m = 254;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f16877n = 8;

    /* renamed from: o */
    private int f16878o = -1;

    /* renamed from: p */
    private int f16879p = 5;

    /* renamed from: q */
    private boolean f16880q = false;

    /* renamed from: r */
    private int f16881r = 100;

    /* renamed from: s */
    private boolean f16882s = false;

    /* renamed from: t */
    private Runnable f16883t = new C9125c();

    /* renamed from: i6.b$a */
    class C9123a implements Runnable {
        C9123a(C9122b bVar) {
        }

        public void run() {
        }
    }

    /* renamed from: i6.b$b */
    class C9124b implements C8948d {

        /* renamed from: a */
        final /* synthetic */ Thread f16884a;

        /* renamed from: b */
        final /* synthetic */ boolean f16885b;

        /* renamed from: c */
        final /* synthetic */ StackTraceElement[] f16886c;

        C9124b(C9122b bVar, Thread thread, boolean z, StackTraceElement[] stackTraceElementArr) {
            this.f16884a = thread;
            this.f16885b = z;
            this.f16886c = stackTraceElementArr;
        }

        /* renamed from: p0 */
        public void mo26544p0(Appendable appendable, String str) {
            appendable.append(String.valueOf(this.f16884a.getId())).append(' ').append(this.f16884a.getName()).append(' ').append(this.f16884a.getState().toString()).append(this.f16885b ? " IDLE" : "").append(10);
            if (!this.f16885b) {
                C8942b.m21357G0(appendable, str, Arrays.asList(this.f16886c));
            }
        }
    }

    /* renamed from: i6.b$c */
    class C9125c implements Runnable {
        C9125c() {
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
                i6.b r1 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.util.concurrent.BlockingQueue r1 = r1.f16873j     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.lang.Object r1 = r1.poll()     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x010f, Exception -> 0x0102, all -> 0x00fe }
                r2 = 0
            L_0x000e:
                i6.b r3 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                boolean r3 = r3.isRunning()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                if (r3 == 0) goto L_0x00f7
            L_0x0016:
                if (r1 == 0) goto L_0x0032
                i6.b r3 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                boolean r3 = r3.isRunning()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                if (r3 == 0) goto L_0x0032
                i6.b r3 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                r3.mo37193S0(r1)     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                i6.b r1 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.BlockingQueue r1 = r1.f16873j     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.lang.Object r1 = r1.poll()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                goto L_0x0016
            L_0x0032:
                i6.b r3 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f16869f     // Catch:{ all -> 0x00ec }
                r3.incrementAndGet()     // Catch:{ all -> 0x00ec }
            L_0x003b:
                i6.b r3 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                boolean r3 = r3.isRunning()     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x00e1
                if (r1 != 0) goto L_0x00e1
                i6.b r1 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                int r1 = r1.f16875l     // Catch:{ all -> 0x00ec }
                if (r1 > 0) goto L_0x005a
                i6.b r1 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.BlockingQueue r1 = r1.f16873j     // Catch:{ all -> 0x00ec }
                java.lang.Object r1 = r1.take()     // Catch:{ all -> 0x00ec }
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x00ec }
                goto L_0x003b
            L_0x005a:
                i6.b r1 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f16868e     // Catch:{ all -> 0x00ec }
                int r1 = r1.get()     // Catch:{ all -> 0x00ec }
                i6.b r3 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                int r3 = r3.f16877n     // Catch:{ all -> 0x00ec }
                if (r1 <= r3) goto L_0x00d9
                i6.b r3 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicLong r3 = r3.f16870g     // Catch:{ all -> 0x00ec }
                long r3 = r3.get()     // Catch:{ all -> 0x00ec }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ec }
                r7 = 0
                int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x008d
                long r7 = r5 - r3
                i6.b r9 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                int r9 = r9.f16875l     // Catch:{ all -> 0x00ec }
                long r9 = (long) r9     // Catch:{ all -> 0x00ec }
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x00d9
            L_0x008d:
                i6.b r7 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicLong r7 = r7.f16870g     // Catch:{ all -> 0x00ec }
                boolean r3 = r7.compareAndSet(r3, r5)     // Catch:{ all -> 0x00ec }
                if (r3 == 0) goto L_0x00a9
                i6.b r3 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f16868e     // Catch:{ all -> 0x00ec }
                int r4 = r1 + -1
                boolean r1 = r3.compareAndSet(r1, r4)     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x00a9
                r1 = 1
                goto L_0x00aa
            L_0x00a9:
                r1 = 0
            L_0x00aa:
                if (r1 == 0) goto L_0x00d8
                i6.b r0 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f16869f     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                r0.decrementAndGet()     // Catch:{ InterruptedException -> 0x00d5, Exception -> 0x00d2, all -> 0x00ce }
                if (r1 != 0) goto L_0x00c0
                i6.b r0 = p172i6.C9122b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f16868e
                r0.decrementAndGet()
            L_0x00c0:
                i6.b r0 = p172i6.C9122b.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f16871h
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
                i6.b r1 = p172i6.C9122b.this     // Catch:{ all -> 0x00ec }
                java.lang.Runnable r1 = r1.m21917Q0()     // Catch:{ all -> 0x00ec }
                goto L_0x003b
            L_0x00e1:
                i6.b r3 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.atomic.AtomicInteger r3 = r3.f16869f     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                r3.decrementAndGet()     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                goto L_0x000e
            L_0x00ec:
                r0 = move-exception
                i6.b r1 = p172i6.C9122b.this     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f16869f     // Catch:{ InterruptedException -> 0x00fc, Exception -> 0x00fa }
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
                e6.c r1 = p172i6.C9122b.f16867u     // Catch:{ all -> 0x0132 }
                r1.mo36856j(r0)     // Catch:{ all -> 0x0132 }
                if (r2 != 0) goto L_0x0124
                goto L_0x011b
            L_0x010f:
                r1 = move-exception
                r0 = r1
                r2 = 0
            L_0x0112:
                e6.c r1 = p172i6.C9122b.f16867u     // Catch:{ all -> 0x0132 }
                r1.mo36849d(r0)     // Catch:{ all -> 0x0132 }
                if (r2 != 0) goto L_0x0124
            L_0x011b:
                i6.b r0 = p172i6.C9122b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f16868e
                r0.decrementAndGet()
            L_0x0124:
                i6.b r0 = p172i6.C9122b.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f16871h
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r0.remove(r1)
                return
            L_0x0132:
                r0 = move-exception
            L_0x0133:
                if (r2 != 0) goto L_0x013e
                i6.b r1 = p172i6.C9122b.this
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f16868e
                r1.decrementAndGet()
            L_0x013e:
                i6.b r1 = p172i6.C9122b.this
                java.util.concurrent.ConcurrentLinkedQueue r1 = r1.f16871h
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r1.remove(r2)
                goto L_0x014d
            L_0x014c:
                throw r0
            L_0x014d:
                goto L_0x014c
            */
            throw new UnsupportedOperationException("Method not decompiled: p172i6.C9122b.C9125c.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public Runnable m21917Q0() {
        return this.f16873j.poll((long) this.f16875l, TimeUnit.MILLISECONDS);
    }

    /* renamed from: W0 */
    private boolean m21918W0(int i) {
        if (!this.f16868e.compareAndSet(i, i + 1)) {
            return false;
        }
        try {
            Thread R0 = mo37192R0(this.f16883t);
            R0.setDaemon(this.f16880q);
            R0.setPriority(this.f16879p);
            R0.setName(this.f16874k + Constants.ACCEPT_TIME_SEPARATOR_SERVER + R0.getId());
            this.f16871h.add(R0);
            R0.start();
            return true;
        } catch (Throwable th) {
            this.f16868e.decrementAndGet();
            throw th;
        }
    }

    /* renamed from: M0 */
    public int mo37188M0() {
        return this.f16869f.get();
    }

    /* renamed from: N0 */
    public int mo37189N0() {
        return this.f16876m;
    }

    /* renamed from: O0 */
    public int mo37190O0() {
        return this.f16877n;
    }

    /* renamed from: P0 */
    public int mo37191P0() {
        return this.f16868e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public Thread mo37192R0(Runnable runnable) {
        return new Thread(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public void mo37193S0(Runnable runnable) {
        runnable.run();
    }

    /* renamed from: T0 */
    public void mo37194T0(boolean z) {
        this.f16880q = z;
    }

    /* renamed from: U0 */
    public void mo37195U0(int i) {
        this.f16876m = i;
        if (this.f16877n > i) {
            this.f16877n = i;
        }
    }

    /* renamed from: V0 */
    public void mo37196V0(String str) {
        if (!isRunning()) {
            this.f16874k = str;
            return;
        }
        throw new IllegalStateException("started");
    }

    public void execute(Runnable runnable) {
        if (!mo37186h0(runnable)) {
            throw new RejectedExecutionException();
        }
    }

    /* renamed from: h0 */
    public boolean mo37186h0(Runnable runnable) {
        int i;
        if (isRunning()) {
            int size = this.f16873j.size();
            int M0 = mo37188M0();
            if (this.f16873j.offer(runnable)) {
                if ((M0 == 0 || size > M0) && (i = this.f16868e.get()) < this.f16876m) {
                    m21918W0(i);
                }
                return true;
            }
        }
        f16867u.mo36850e("Dispatched {} to stopped {}", runnable, this);
        return false;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        ArrayList arrayList = new ArrayList(mo37189N0());
        Iterator<Thread> it = this.f16871h.iterator();
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
                if (this.f16882s) {
                    arrayList.add(new C9124b(this, next, z, stackTrace));
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
                C8942b.m21358H0(appendable, this);
                C8942b.m21357G0(appendable, str, arrayList);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16874k);
        sb.append("{");
        sb.append(mo37190O0());
        sb.append("<=");
        sb.append(mo37188M0());
        sb.append("<=");
        sb.append(mo37191P0());
        sb.append(MiotCloudImpl.COOKIE_PATH);
        sb.append(mo37189N0());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        BlockingQueue<Runnable> blockingQueue = this.f16873j;
        sb.append(blockingQueue == null ? -1 : blockingQueue.size());
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        BlockingQueue<Runnable> blockingQueue;
        super.mo26547u0();
        this.f16868e.set(0);
        if (this.f16873j == null) {
            if (this.f16878o > 0) {
                blockingQueue = new ArrayBlockingQueue<>(this.f16878o);
            } else {
                int i = this.f16877n;
                blockingQueue = new C9981e<>(i, i);
            }
            this.f16873j = blockingQueue;
        }
        while (true) {
            int i2 = this.f16868e.get();
            if (isRunning() && i2 < this.f16877n) {
                m21918W0(i2);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        long currentTimeMillis = System.currentTimeMillis();
        while (this.f16868e.get() > 0 && System.currentTimeMillis() - currentTimeMillis < ((long) (this.f16881r / 2))) {
            Thread.sleep(1);
        }
        this.f16873j.clear();
        C9123a aVar = new C9123a(this);
        int i = this.f16869f.get();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            this.f16873j.offer(aVar);
            i = i2;
        }
        Thread.yield();
        if (this.f16868e.get() > 0) {
            Iterator<Thread> it = this.f16871h.iterator();
            while (it.hasNext()) {
                it.next().interrupt();
            }
        }
        while (this.f16868e.get() > 0 && System.currentTimeMillis() - currentTimeMillis < ((long) this.f16881r)) {
            Thread.sleep(1);
        }
        Thread.yield();
        int size = this.f16871h.size();
        if (size > 0) {
            C9003c cVar = f16867u;
            cVar.mo36847b(size + " threads could not be stopped", new Object[0]);
            if (size == 1 || cVar.mo36846a()) {
                Iterator<Thread> it2 = this.f16871h.iterator();
                while (it2.hasNext()) {
                    Thread next = it2.next();
                    f16867u.mo36855i("Couldn't stop " + next, new Object[0]);
                    for (StackTraceElement stackTraceElement : next.getStackTrace()) {
                        f16867u.mo36855i(" at " + stackTraceElement, new Object[0]);
                    }
                }
            }
        }
        synchronized (this.f16872i) {
            this.f16872i.notifyAll();
        }
    }

    /* renamed from: x */
    public boolean mo37187x() {
        return this.f16868e.get() == this.f16876m && this.f16873j.size() >= this.f16869f.get();
    }
}
