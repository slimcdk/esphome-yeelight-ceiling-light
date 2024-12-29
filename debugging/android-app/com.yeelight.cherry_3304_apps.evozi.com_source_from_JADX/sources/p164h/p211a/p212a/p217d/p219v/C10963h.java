package p164h.p211a.p212a.p217d.p219v;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10940l;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.v.h */
public abstract class C10963h extends C11145a implements C11152d {

    /* renamed from: m */
    public static final C11158c f21387m = C11156b.m29016b("org.eclipse.jetty.io.nio");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final int f21388n = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final int f21389o = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", 100000).intValue();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final int f21390p = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f21391q = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", 400).intValue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f21392e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f21393f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f21394g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10967d[] f21395h;

    /* renamed from: i */
    private int f21396i = 1;

    /* renamed from: j */
    private volatile int f21397j = 0;

    /* renamed from: k */
    private boolean f21398k = true;

    /* renamed from: l */
    private int f21399l = 0;

    /* renamed from: h.a.a.d.v.h$a */
    class C10964a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f21400a;

        C10964a(int i) {
            this.f21400a = i;
        }

        public void run() {
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            try {
                C10967d[] y0 = C10963h.this.f21395h;
                if (y0 == null) {
                    C10963h.f21387m.mo35489e("Stopped {} on {}", Thread.currentThread(), this);
                    Thread.currentThread().setName(name);
                    if (C10963h.this.mo34688L0() != 0) {
                        Thread.currentThread().setPriority(priority);
                        return;
                    }
                    return;
                }
                C10967d dVar = y0[this.f21400a];
                Thread currentThread = Thread.currentThread();
                currentThread.setName(name + " Selector" + this.f21400a);
                if (C10963h.this.mo34688L0() != 0) {
                    Thread.currentThread().setPriority(Thread.currentThread().getPriority() + C10963h.this.mo34688L0());
                }
                C10963h.f21387m.mo35489e("Starting {} on {}", Thread.currentThread(), this);
                while (C10963h.this.isRunning()) {
                    dVar.mo34696h();
                }
                C10963h.f21387m.mo35489e("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (C10963h.this.mo34688L0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
            } catch (IOException e) {
                C10963h.f21387m.mo35488d(e);
            } catch (Exception e2) {
                C10963h.f21387m.mo35495k(e2);
            } catch (Throwable th) {
                C10963h.f21387m.mo35489e("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (C10963h.this.mo34688L0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
                throw th;
            }
        }
    }

    /* renamed from: h.a.a.d.v.h$b */
    private interface C10965b extends Runnable {
    }

    /* renamed from: h.a.a.d.v.h$c */
    private static class C10966c {

        /* renamed from: a */
        final SelectableChannel f21402a;

        /* renamed from: b */
        final Object f21403b;

        public C10966c(SelectableChannel selectableChannel, Object obj) {
            this.f21402a = selectableChannel;
            this.f21403b = obj;
        }
    }

    /* renamed from: h.a.a.d.v.h$d */
    public class C10967d implements C11152d {

        /* renamed from: a */
        private final int f21404a;

        /* renamed from: b */
        private final C11115e f21405b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<Object> f21406c = new ConcurrentLinkedQueue<>();

        /* renamed from: d */
        private volatile Selector f21407d;

        /* renamed from: e */
        private volatile Thread f21408e;

        /* renamed from: f */
        private int f21409f;

        /* renamed from: g */
        private long f21410g;

        /* renamed from: h */
        private boolean f21411h;

        /* renamed from: i */
        private boolean f21412i;

        /* renamed from: j */
        private volatile long f21413j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ConcurrentMap<C10960g, Object> f21414k = new ConcurrentHashMap();

        /* renamed from: h.a.a.d.v.h$d$a */
        class C10968a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f21416a;

            C10968a(long j) {
                this.f21416a = j;
            }

            public void run() {
                for (C10960g C : C10967d.this.f21414k.keySet()) {
                    C.mo34674C(this.f21416a);
                }
            }

            public String toString() {
                return "Idle-" + super.toString();
            }
        }

        /* renamed from: h.a.a.d.v.h$d$b */
        class C10969b implements C10965b {
            C10969b() {
            }

            public void run() {
                C10967d.this.m27858m();
            }
        }

        /* renamed from: h.a.a.d.v.h$d$c */
        class C10970c implements C10965b {

            /* renamed from: a */
            final /* synthetic */ ArrayList f21419a;

            /* renamed from: b */
            final /* synthetic */ CountDownLatch f21420b;

            C10970c(ArrayList arrayList, CountDownLatch countDownLatch) {
                this.f21419a = arrayList;
                this.f21420b = countDownLatch;
            }

            public void run() {
                C10967d.this.mo34697i(this.f21419a);
                this.f21420b.countDown();
            }
        }

        C10967d(int i) {
            this.f21404a = i;
            this.f21413j = System.currentTimeMillis();
            C11115e eVar = new C11115e(this);
            this.f21405b = eVar;
            eVar.mo35314i(0);
            this.f21407d = Selector.open();
            this.f21410g = System.currentTimeMillis() + ((long) C10963h.f21388n);
        }

        /* renamed from: f */
        private C10960g m27857f(SocketChannel socketChannel, SelectionKey selectionKey) {
            C10960g O0 = C10963h.this.mo34346O0(socketChannel, this, selectionKey);
            C10963h.f21387m.mo35489e("created {}", O0);
            C10963h.this.mo34343I0(O0);
            this.f21414k.put(O0, this);
            return O0;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m27858m() {
            try {
                synchronized (this) {
                    Selector selector = this.f21407d;
                    if (selector != null) {
                        Selector open = Selector.open();
                        for (SelectionKey next : selector.keys()) {
                            if (next.isValid()) {
                                if (next.interestOps() != 0) {
                                    SelectableChannel channel = next.channel();
                                    Object attachment = next.attachment();
                                    if (attachment == null) {
                                        mo34692c(channel);
                                    } else {
                                        mo34693d(channel, attachment);
                                    }
                                }
                            }
                        }
                        this.f21407d.close();
                        this.f21407d = open;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("recreating selector", e);
            }
        }

        /* renamed from: c */
        public void mo34692c(Object obj) {
            this.f21406c.add(obj);
        }

        /* renamed from: d */
        public void mo34693d(SelectableChannel selectableChannel, Object obj) {
            if (obj == null) {
                mo34692c(selectableChannel);
            } else if (obj instanceof C10942n) {
                mo34692c(obj);
            } else {
                mo34692c(new C10966c(selectableChannel, obj));
            }
        }

        /* renamed from: e */
        public void mo34694e(C11115e.C11116a aVar) {
            aVar.mo35320d();
        }

        /* renamed from: g */
        public void mo34695g(C10960g gVar) {
            C10963h.f21387m.mo35489e("destroyEndPoint {}", gVar);
            this.f21414k.remove(gVar);
            C10963h.this.mo34342H0(gVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.nio.channels.ByteChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.nio.channels.ByteChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.nio.channels.ByteChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.nio.channels.SelectableChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.nio.channels.ByteChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: java.nio.channels.SocketChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.nio.channels.SocketChannel} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.nio.channels.ByteChannel} */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d6, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
            r5.cancel();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x01e2, code lost:
            throw r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x01f8, code lost:
            r6 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0204, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35495k(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x020a, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35488d(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0215, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35487c(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0230, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0231, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35488d(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b1, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35495k(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35487c(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35487c(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c9, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
            p164h.p211a.p212a.p217d.p219v.C10963h.f21387m.mo35488d(r2);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0204 A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x020a A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0211 A[SYNTHETIC, Splitter:B:155:0x0211] */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x0230 A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }, ExcHandler: CancelledKeyException (r5v4 'e' java.nio.channels.CancelledKeyException A[CUSTOM_DECLARE, Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }]), Splitter:B:111:0x0183] */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x00cf A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1 A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7 A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00be A[SYNTHETIC, Splitter:B:59:0x00be] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00c9 A[Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }, ExcHandler: CancelledKeyException (r2v49 'e' java.nio.channels.CancelledKeyException A[CUSTOM_DECLARE, Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4, all -> 0x02c2 }]), Splitter:B:12:0x0021] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34696h() {
            /*
                r14 = this;
                r0 = 0
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r14.f21408e = r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.nio.channels.Selector r1 = r14.f21407d     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r1 != 0) goto L_0x000e
                r14.f21408e = r0
                return
            L_0x000e:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21406c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0014:
                int r3 = r2 + -1
                r4 = 1
                if (r2 <= 0) goto L_0x00d2
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21406c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.Object r2 = r2.poll()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x00d2
                boolean r5 = r2 instanceof p164h.p211a.p212a.p217d.C10942n     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r5 == 0) goto L_0x0033
                h.a.a.d.v.g r2 = (p164h.p211a.p212a.p217d.p219v.C10960g) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.nio.channels.ByteChannel r4 = r2.mo34671z()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r2.mo34675D()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0030 }
                goto L_0x00cf
            L_0x0030:
                r2 = move-exception
                goto L_0x00a9
            L_0x0033:
                boolean r5 = r2 instanceof p164h.p211a.p212a.p217d.p219v.C10963h.C10966c     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r5 == 0) goto L_0x006d
                h.a.a.d.v.h$c r2 = (p164h.p211a.p212a.p217d.p219v.C10963h.C10966c) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.nio.channels.SelectableChannel r5 = r2.f21402a     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.lang.Object r2 = r2.f21403b     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                boolean r6 = r5 instanceof java.nio.channels.SocketChannel     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                if (r6 == 0) goto L_0x005d
                r6 = r5
                java.nio.channels.SocketChannel r6 = (java.nio.channels.SocketChannel) r6     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                boolean r6 = r6.isConnected()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                if (r6 == 0) goto L_0x005d
                java.nio.channels.SelectionKey r2 = r5.register(r1, r4, r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r4 = r5
                java.nio.channels.SocketChannel r4 = (java.nio.channels.SocketChannel) r4     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                h.a.a.d.v.g r4 = r14.m27857f(r4, r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r2.attach(r4)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r4.mo34681J()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                goto L_0x00cf
            L_0x005d:
                boolean r4 = r5.isOpen()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                if (r4 == 0) goto L_0x00cf
                r4 = 8
                r5.register(r1, r4, r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                goto L_0x00cf
            L_0x006a:
                r2 = move-exception
                r4 = r5
                goto L_0x00a9
            L_0x006d:
                boolean r5 = r2 instanceof java.nio.channels.SocketChannel     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r5 == 0) goto L_0x0087
                java.nio.channels.SocketChannel r2 = (java.nio.channels.SocketChannel) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.nio.channels.SelectionKey r4 = r2.register(r1, r4, r0)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                h.a.a.d.v.g r5 = r14.m27857f(r2, r4)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                r4.attach(r5)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                r5.mo34681J()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                goto L_0x00cf
            L_0x0082:
                r4 = move-exception
                r13 = r4
                r4 = r2
                r2 = r13
                goto L_0x00a9
            L_0x0087:
                boolean r4 = r2 instanceof p164h.p211a.p212a.p217d.p219v.C10963h.C10965b     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r4 == 0) goto L_0x0091
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r2.run()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                goto L_0x00cf
            L_0x0091:
                boolean r4 = r2 instanceof java.lang.Runnable     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r4 == 0) goto L_0x009d
                h.a.a.d.v.h r4 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r4.mo34347e0(r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                goto L_0x00cf
            L_0x009d:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.lang.String r2 = r2.toString()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r4.<init>(r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                throw r4     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
            L_0x00a7:
                r2 = move-exception
                r4 = r0
            L_0x00a9:
                h.a.a.d.v.h r5 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r5 = r5.isRunning()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r5 == 0) goto L_0x00b7
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo35495k(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x00bc
            L_0x00b7:
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo35487c(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x00bc:
                if (r4 == 0) goto L_0x00cf
                r4.close()     // Catch:{ IOException -> 0x00c2 }
                goto L_0x00cf
            L_0x00c2:
                r2 = move-exception
                h.a.a.h.y.c r4 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r4.mo35487c(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x00cf
            L_0x00c9:
                r2 = move-exception
                h.a.a.h.y.c r4 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r4.mo35488d(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x00cf:
                r2 = r3
                goto L_0x0014
            L_0x00d2:
                int r2 = r1.selectNow()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r3 = 0
                r7 = 0
                if (r2 != 0) goto L_0x0163
                java.util.Set r2 = r1.selectedKeys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r2 = r2.isEmpty()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x0163
                boolean r2 = r14.f21411h     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x0100
                int r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21390p     // Catch:{ InterruptedException -> 0x00f6 }
                long r5 = (long) r2     // Catch:{ InterruptedException -> 0x00f6 }
                java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x00f6 }
                goto L_0x00fc
            L_0x00f6:
                r2 = move-exception
                h.a.a.h.y.c r5 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo35488d(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x00fc:
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0100:
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo35316k(r5)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r2.mo35311f()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21406c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 != 0) goto L_0x0119
                int r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21391q     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r11 = (long) r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x011a
            L_0x0119:
                r11 = r7
            L_0x011a:
                int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r2 <= 0) goto L_0x0127
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 < 0) goto L_0x0127
                int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r2 <= 0) goto L_0x0127
                goto L_0x0128
            L_0x0127:
                r9 = r11
            L_0x0128:
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 <= 0) goto L_0x0163
                r1.select(r9)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo35316k(r9)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21388n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 <= 0) goto L_0x0163
                long r9 = r9 - r5
                r5 = 1
                int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r2 > 0) goto L_0x0163
                int r2 = r14.f21409f     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2 + r4
                r14.f21409f = r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r5 = p164h.p211a.p212a.p217d.p219v.C10963h.f21389o     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 <= r5) goto L_0x0163
                r14.f21411h = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r2 = r14.f21412i     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 != 0) goto L_0x0163
                r14.f21412i = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.h.y.c r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.String r5 = "Selector {} is too busy, pausing!"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6[r3] = r14     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo35486b(r5, r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0163:
                java.nio.channels.Selector r2 = r14.f21407d     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x02bf
                boolean r2 = r1.isOpen()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 != 0) goto L_0x016f
                goto L_0x02bf
            L_0x016f:
                java.util.Set r2 = r1.selectedKeys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0177:
                boolean r5 = r2.hasNext()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r5 == 0) goto L_0x0238
                java.lang.Object r5 = r2.next()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.nio.channels.SelectionKey r5 = (java.nio.channels.SelectionKey) r5     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r6 = r5.isValid()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r6 != 0) goto L_0x0198
                r5.cancel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                java.lang.Object r6 = r5.attachment()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                h.a.a.d.v.g r6 = (p164h.p211a.p212a.p217d.p219v.C10960g) r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r6 == 0) goto L_0x0177
                r6.mo34675D()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                goto L_0x0177
            L_0x0198:
                java.lang.Object r6 = r5.attachment()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                boolean r9 = r6 instanceof p164h.p211a.p212a.p217d.p219v.C10960g     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x01b2
                boolean r9 = r5.isReadable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 != 0) goto L_0x01ac
                boolean r9 = r5.isWritable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x0177
            L_0x01ac:
                h.a.a.d.v.g r6 = (p164h.p211a.p212a.p217d.p219v.C10960g) r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                r6.mo34681J()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                goto L_0x0177
            L_0x01b2:
                boolean r9 = r5.isConnectable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x01e3
                java.nio.channels.SelectableChannel r9 = r5.channel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                java.nio.channels.SocketChannel r9 = (java.nio.channels.SocketChannel) r9     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                boolean r6 = r9.finishConnect()     // Catch:{ Exception -> 0x01d8 }
                if (r6 == 0) goto L_0x01d2
                r5.interestOps(r4)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                h.a.a.d.v.g r6 = r14.m27857f(r9, r5)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                r5.attach(r6)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
            L_0x01ce:
                r6.mo34681J()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                goto L_0x0177
            L_0x01d2:
                r5.cancel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                goto L_0x0177
            L_0x01d6:
                r6 = move-exception
                goto L_0x01df
            L_0x01d8:
                r10 = move-exception
                h.a.a.d.v.h r11 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ all -> 0x01d6 }
                r11.mo34341G0(r9, r10, r6)     // Catch:{ all -> 0x01d6 }
                goto L_0x01d2
            L_0x01df:
                r5.cancel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                throw r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
            L_0x01e3:
                java.nio.channels.SelectableChannel r6 = r5.channel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                r9 = r6
                java.nio.channels.SocketChannel r9 = (java.nio.channels.SocketChannel) r9     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                h.a.a.d.v.g r6 = r14.m27857f(r9, r5)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                r5.attach(r6)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                boolean r10 = r5.isReadable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                if (r10 == 0) goto L_0x0177
                goto L_0x01ce
            L_0x01f8:
                r6 = move-exception
                goto L_0x01fc
            L_0x01fa:
                r6 = move-exception
                r9 = r0
            L_0x01fc:
                h.a.a.d.v.h r10 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r10 = r10.isRunning()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r10 == 0) goto L_0x020a
                h.a.a.h.y.c r10 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r10.mo35495k(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x020f
            L_0x020a:
                h.a.a.h.y.c r10 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r10.mo35488d(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x020f:
                if (r9 == 0) goto L_0x021b
                r9.close()     // Catch:{ IOException -> 0x0215 }
                goto L_0x021b
            L_0x0215:
                r6 = move-exception
                h.a.a.h.y.c r9 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r9.mo35487c(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x021b:
                if (r5 == 0) goto L_0x0177
                java.nio.channels.SelectableChannel r6 = r5.channel()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r6 = r6 instanceof java.nio.channels.ServerSocketChannel     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r6 != 0) goto L_0x0177
                boolean r6 = r5.isValid()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r6 == 0) goto L_0x0177
                r5.cancel()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x0177
            L_0x0230:
                r5 = move-exception
                h.a.a.h.y.c r6 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo35488d(r5)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x0177
            L_0x0238:
                java.util.Set r2 = r1.selectedKeys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.clear()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo35316k(r4)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x024a:
                h.a.a.h.d0.e$a r2 = r2.mo35308c()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x025e
                boolean r6 = r2 instanceof java.lang.Runnable     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r6 == 0) goto L_0x025b
                h.a.a.d.v.h r6 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo34347e0(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x025b:
                h.a.a.h.d0.e r2 = r14.f21405b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x024a
            L_0x025e:
                long r9 = r14.f21413j     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r4 - r9
                int r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21391q     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r11 = (long) r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x02a6
                r14.f21413j = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.d.v.h r2 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r2.f21394g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 <= 0) goto L_0x029b
                java.util.Set r1 = r1.keys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = r1.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.d.v.h r6 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r6 = r6.f21394g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x029b
                h.a.a.d.v.h r1 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = r1.f21392e     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = r1 + r4
                h.a.a.d.v.h r6 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r6 = r6.f21393f     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r6 = (long) r6     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = r1 - r6
                goto L_0x029c
            L_0x029b:
                r1 = r4
            L_0x029c:
                h.a.a.d.v.h r6 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                h.a.a.d.v.h$d$a r7 = new h.a.a.d.v.h$d$a     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r7.<init>(r1)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo34347e0(r7)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x02a6:
                int r1 = p164h.p211a.p212a.p217d.p219v.C10963h.f21388n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r1 <= 0) goto L_0x02ca
                long r1 = r14.f21410g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 <= 0) goto L_0x02ca
                r14.f21409f = r3     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r14.f21411h = r3     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = p164h.p211a.p212a.p217d.p219v.C10963h.f21388n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r4 = r4 + r1
                r14.f21410g = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x02ca
            L_0x02bf:
                r14.f21408e = r0
                return
            L_0x02c2:
                r1 = move-exception
                goto L_0x02e0
            L_0x02c4:
                r1 = move-exception
                h.a.a.h.y.c r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ all -> 0x02c2 }
            L_0x02c7:
                r2.mo35488d(r1)     // Catch:{ all -> 0x02c2 }
            L_0x02ca:
                r14.f21408e = r0
                goto L_0x02df
            L_0x02cd:
                r1 = move-exception
                h.a.a.d.v.h r2 = p164h.p211a.p212a.p217d.p219v.C10963h.this     // Catch:{ all -> 0x02c2 }
                boolean r2 = r2.isRunning()     // Catch:{ all -> 0x02c2 }
                if (r2 == 0) goto L_0x02dc
                h.a.a.h.y.c r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ all -> 0x02c2 }
                r2.mo35495k(r1)     // Catch:{ all -> 0x02c2 }
                goto L_0x02ca
            L_0x02dc:
                h.a.a.h.y.c r2 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m     // Catch:{ all -> 0x02c2 }
                goto L_0x02c7
            L_0x02df:
                return
            L_0x02e0:
                r14.f21408e = r0
                goto L_0x02e4
            L_0x02e3:
                throw r1
            L_0x02e4:
                goto L_0x02e3
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10963h.C10967d.mo34696h():void");
        }

        /* renamed from: i */
        public void mo34697i(List<Object> list) {
            StringBuilder sb;
            Selector selector = this.f21407d;
            Set<SelectionKey> keys = selector.keys();
            list.add(selector + " keys=" + keys.size());
            for (SelectionKey next : keys) {
                if (next.isValid()) {
                    sb = new StringBuilder();
                    sb.append(next.attachment());
                    sb.append(" iOps=");
                    sb.append(next.interestOps());
                    sb.append(" rOps=");
                    sb.append(next.readyOps());
                } else {
                    sb = new StringBuilder();
                    sb.append(next.attachment());
                    sb.append(" iOps=-1 rOps=-1");
                }
                list.add(sb.toString());
            }
        }

        /* renamed from: j */
        public C10963h mo34698j() {
            return C10963h.this;
        }

        /* renamed from: k */
        public long mo34699k() {
            return this.f21405b.mo35310e();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.StackTraceElement} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: k0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34187k0(java.lang.Appendable r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = java.lang.String.valueOf(r7)
                java.lang.Appendable r0 = r8.append(r0)
                java.lang.String r1 = " id="
                java.lang.Appendable r0 = r0.append(r1)
                int r1 = r7.f21404a
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.Appendable r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.Thread r0 = r7.f21408e
                if (r0 != 0) goto L_0x0023
                r0 = 0
                goto L_0x0027
            L_0x0023:
                java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            L_0x0027:
                r1 = 0
                if (r0 == 0) goto L_0x0040
                int r2 = r0.length
                r3 = 0
            L_0x002c:
                if (r3 >= r2) goto L_0x0040
                r4 = r0[r3]
                java.lang.String r5 = r4.getClassName()
                java.lang.String r6 = "org.eclipse.jetty."
                boolean r5 = r5.startsWith(r6)
                if (r5 == 0) goto L_0x003d
                goto L_0x0042
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002c
            L_0x0040:
                java.lang.String r4 = "not selecting"
            L_0x0042:
                java.nio.channels.Selector r0 = r7.f21407d
                if (r0 == 0) goto L_0x007b
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.Set r0 = r0.keys()
                int r0 = r0.size()
                int r0 = r0 * 2
                r2.<init>(r0)
                r2.add(r4)
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r3 = 1
                r0.<init>(r3)
                h.a.a.d.v.h$d$c r4 = new h.a.a.d.v.h$d$c
                r4.<init>(r2, r0)
                r7.mo34692c(r4)
                r4 = 5
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x006e }
                r0.await(r4, r6)     // Catch:{ InterruptedException -> 0x006e }
                goto L_0x0074
            L_0x006e:
                r0 = move-exception
                h.a.a.h.y.c r4 = p164h.p211a.p212a.p217d.p219v.C10963h.f21387m
                r4.mo35488d(r0)
            L_0x0074:
                java.util.Collection[] r0 = new java.util.Collection[r3]
                r0[r1] = r2
                p164h.p211a.p212a.p228h.p233x.C11146b.m28976B0(r8, r9, r0)
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10963h.C10967d.mo34187k0(java.lang.Appendable, java.lang.String):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Selector mo34700l() {
            return this.f21407d;
        }

        /* renamed from: n */
        public void mo34701n(C11115e.C11116a aVar, long j) {
            if (aVar instanceof Runnable) {
                this.f21405b.mo35313h(aVar, j);
                return;
            }
            throw new IllegalArgumentException("!Runnable");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo34702o() {
            int i = 0;
            while (i < 100) {
                try {
                    if (this.f21408e == null) {
                        break;
                    }
                    mo34703p();
                    Thread.sleep(10);
                    i++;
                } catch (Exception e) {
                    C10963h.f21387m.mo35488d(e);
                }
            }
            synchronized (this) {
                for (SelectionKey next : this.f21407d.keys()) {
                    if (next != null) {
                        Object attachment = next.attachment();
                        if (attachment instanceof C10942n) {
                            try {
                                ((C10942n) attachment).close();
                            } catch (IOException e2) {
                                C10963h.f21387m.mo35488d(e2);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.f21405b.mo35307b();
                try {
                    Selector selector = this.f21407d;
                    if (selector != null) {
                        selector.close();
                    }
                } catch (IOException e3) {
                    C10963h.f21387m.mo35488d(e3);
                }
                this.f21407d = null;
            }
        }

        /* renamed from: p */
        public void mo34703p() {
            try {
                Selector selector = this.f21407d;
                if (selector != null) {
                    selector.wakeup();
                }
            } catch (Exception unused) {
                mo34692c(new C10969b());
                m27858m();
            }
        }

        public String toString() {
            Selector selector = this.f21407d;
            Object[] objArr = new Object[3];
            objArr[0] = super.toString();
            int i = -1;
            objArr[1] = Integer.valueOf((selector == null || !selector.isOpen()) ? -1 : selector.keys().size());
            if (selector != null && selector.isOpen()) {
                i = selector.selectedKeys().size();
            }
            objArr[2] = Integer.valueOf(i);
            return String.format("%s keys=%d selected=%d", objArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo34341G0(SocketChannel socketChannel, Throwable th, Object obj) {
        C11158c cVar = f21387m;
        cVar.mo35486b(th + Constants.ACCEPT_TIME_SEPARATOR_SP + socketChannel + Constants.ACCEPT_TIME_SEPARATOR_SP + obj, new Object[0]);
        f21387m.mo35487c(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public abstract void mo34342H0(C10960g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public abstract void mo34343I0(C10960g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public abstract void mo34344J0(C10940l lVar, C10941m mVar);

    /* renamed from: K0 */
    public int mo34687K0() {
        return this.f21396i;
    }

    /* renamed from: L0 */
    public int mo34688L0() {
        return this.f21399l;
    }

    /* renamed from: M0 */
    public boolean mo34689M0() {
        return this.f21398k;
    }

    /* renamed from: N0 */
    public abstract C10954a mo34345N0(SocketChannel socketChannel, C10928d dVar, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public abstract C10960g mo34346O0(SocketChannel socketChannel, C10967d dVar, SelectionKey selectionKey);

    /* renamed from: P0 */
    public void mo34690P0(SocketChannel socketChannel, Object obj) {
        int i = this.f21397j;
        this.f21397j = i + 1;
        if (i < 0) {
            i = -i;
        }
        int i2 = i % this.f21396i;
        C10967d[] dVarArr = this.f21395h;
        if (dVarArr != null) {
            C10967d dVar = dVarArr[i2];
            dVar.mo34693d(socketChannel, obj);
            dVar.mo34703p();
        }
    }

    /* renamed from: e0 */
    public abstract boolean mo34347e0(Runnable runnable);

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        C11146b.m28977C0(appendable, this);
        C11146b.m28976B0(appendable, str, C11138r.m28927a(this.f21395h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        this.f21395h = new C10967d[this.f21396i];
        int i = 0;
        int i2 = 0;
        while (true) {
            C10967d[] dVarArr = this.f21395h;
            if (i2 >= dVarArr.length) {
                break;
            }
            dVarArr[i2] = new C10967d(i2);
            i2++;
        }
        super.mo34262p0();
        while (i < mo34687K0()) {
            if (mo34347e0(new C10964a(i))) {
                i++;
            } else {
                throw new IllegalStateException("!Selecting");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        C10967d[] dVarArr = this.f21395h;
        this.f21395h = null;
        if (dVarArr != null) {
            for (C10967d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.mo34702o();
                }
            }
        }
        super.mo34263q0();
    }
}
