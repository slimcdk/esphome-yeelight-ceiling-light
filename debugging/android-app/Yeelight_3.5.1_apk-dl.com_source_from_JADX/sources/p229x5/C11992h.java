package p229x5;

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
import org.eclipse.jetty.util.C9996o;
import p147d6.C8941a;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p225w5.C11939c;
import p225w5.C11948i;
import p225w5.C11949j;
import p225w5.C11950k;

/* renamed from: x5.h */
public abstract class C11992h extends C8941a implements C8948d {

    /* renamed from: m */
    public static final C9003c f21919m = C9001b.m21451b("org.eclipse.jetty.io.nio");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final int f21920n = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final int f21921o = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", 100000).intValue();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final int f21922p = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f21923q = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", 400).intValue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f21924e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f21925f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f21926g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11996d[] f21927h;

    /* renamed from: i */
    private int f21928i = 1;

    /* renamed from: j */
    private volatile int f21929j = 0;

    /* renamed from: k */
    private boolean f21930k = true;

    /* renamed from: l */
    private int f21931l = 0;

    /* renamed from: x5.h$a */
    class C11993a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f21932a;

        C11993a(int i) {
            this.f21932a = i;
        }

        public void run() {
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            try {
                C11996d[] D0 = C11992h.this.f21927h;
                if (D0 == null) {
                    C11992h.f21919m.mo36850e("Stopped {} on {}", Thread.currentThread(), this);
                    Thread.currentThread().setName(name);
                    if (C11992h.this.mo42574Q0() != 0) {
                        Thread.currentThread().setPriority(priority);
                        return;
                    }
                    return;
                }
                C11996d dVar = D0[this.f21932a];
                Thread currentThread = Thread.currentThread();
                currentThread.setName(name + " Selector" + this.f21932a);
                if (C11992h.this.mo42574Q0() != 0) {
                    Thread.currentThread().setPriority(Thread.currentThread().getPriority() + C11992h.this.mo42574Q0());
                }
                C11992h.f21919m.mo36850e("Starting {} on {}", Thread.currentThread(), this);
                while (C11992h.this.isRunning()) {
                    dVar.mo42582h();
                }
                C11992h.f21919m.mo36850e("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (C11992h.this.mo42574Q0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
            } catch (IOException e) {
                C11992h.f21919m.mo36849d(e);
            } catch (Exception e2) {
                C11992h.f21919m.mo36856j(e2);
            } catch (Throwable th) {
                C11992h.f21919m.mo36850e("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (C11992h.this.mo42574Q0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
                throw th;
            }
        }
    }

    /* renamed from: x5.h$b */
    private interface C11994b extends Runnable {
    }

    /* renamed from: x5.h$c */
    private static class C11995c {

        /* renamed from: a */
        final SelectableChannel f21934a;

        /* renamed from: b */
        final Object f21935b;

        public C11995c(SelectableChannel selectableChannel, Object obj) {
            this.f21934a = selectableChannel;
            this.f21935b = obj;
        }
    }

    /* renamed from: x5.h$d */
    public class C11996d implements C8948d {

        /* renamed from: a */
        private final int f21936a;

        /* renamed from: b */
        private final C9128e f21937b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<Object> f21938c = new ConcurrentLinkedQueue<>();

        /* renamed from: d */
        private volatile Selector f21939d;

        /* renamed from: e */
        private volatile Thread f21940e;

        /* renamed from: f */
        private int f21941f;

        /* renamed from: g */
        private long f21942g;

        /* renamed from: h */
        private boolean f21943h;

        /* renamed from: i */
        private boolean f21944i;

        /* renamed from: j */
        private volatile long f21945j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ConcurrentMap<C11989g, Object> f21946k = new ConcurrentHashMap();

        /* renamed from: x5.h$d$a */
        class C11997a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f21948a;

            C11997a(long j) {
                this.f21948a = j;
            }

            public void run() {
                for (C11989g C : C11996d.this.f21946k.keySet()) {
                    C.mo42560C(this.f21948a);
                }
            }

            public String toString() {
                return "Idle-" + super.toString();
            }
        }

        /* renamed from: x5.h$d$b */
        class C11998b implements C11994b {
            C11998b() {
            }

            public void run() {
                C11996d.this.m30819m();
            }
        }

        /* renamed from: x5.h$d$c */
        class C11999c implements C11994b {

            /* renamed from: a */
            final /* synthetic */ ArrayList f21951a;

            /* renamed from: b */
            final /* synthetic */ CountDownLatch f21952b;

            C11999c(ArrayList arrayList, CountDownLatch countDownLatch) {
                this.f21951a = arrayList;
                this.f21952b = countDownLatch;
            }

            public void run() {
                C11996d.this.mo42583i(this.f21951a);
                this.f21952b.countDown();
            }
        }

        C11996d(int i) {
            this.f21936a = i;
            this.f21945j = System.currentTimeMillis();
            C9128e eVar = new C9128e(this);
            this.f21937b = eVar;
            eVar.mo37209i(0);
            this.f21939d = Selector.open();
            this.f21942g = System.currentTimeMillis() + ((long) C11992h.f21920n);
        }

        /* renamed from: f */
        private C11989g m30818f(SocketChannel socketChannel, SelectionKey selectionKey) {
            C11989g T0 = C11992h.this.mo39647T0(socketChannel, this, selectionKey);
            C11992h.f21919m.mo36850e("created {}", T0);
            C11992h.this.mo39644N0(T0);
            this.f21946k.put(T0, this);
            return T0;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m30819m() {
            try {
                synchronized (this) {
                    Selector selector = this.f21939d;
                    if (selector != null) {
                        Selector open = Selector.open();
                        for (SelectionKey next : selector.keys()) {
                            if (next.isValid()) {
                                if (next.interestOps() != 0) {
                                    SelectableChannel channel = next.channel();
                                    Object attachment = next.attachment();
                                    if (attachment == null) {
                                        mo42578c(channel);
                                    } else {
                                        mo42579d(channel, attachment);
                                    }
                                }
                            }
                        }
                        this.f21939d.close();
                        this.f21939d = open;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("recreating selector", e);
            }
        }

        /* renamed from: c */
        public void mo42578c(Object obj) {
            this.f21938c.add(obj);
        }

        /* renamed from: d */
        public void mo42579d(SelectableChannel selectableChannel, Object obj) {
            if (obj == null) {
                mo42578c(selectableChannel);
            } else if (obj instanceof C11950k) {
                mo42578c(obj);
            } else {
                mo42578c(new C11995c(selectableChannel, obj));
            }
        }

        /* renamed from: e */
        public void mo42580e(C9128e.C9129a aVar) {
            aVar.mo37215d();
        }

        /* renamed from: g */
        public void mo42581g(C11989g gVar) {
            C11992h.f21919m.mo36850e("destroyEndPoint {}", gVar);
            this.f21946k.remove(gVar);
            C11992h.this.mo39643M0(gVar);
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
            p229x5.C11992h.f21919m.mo36856j(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x020a, code lost:
            p229x5.C11992h.f21919m.mo36849d(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0215, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            p229x5.C11992h.f21919m.mo36848c(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0230, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0231, code lost:
            p229x5.C11992h.f21919m.mo36849d(r5);
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
            p229x5.C11992h.f21919m.mo36856j(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
            p229x5.C11992h.f21919m.mo36848c(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c2, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            p229x5.C11992h.f21919m.mo36848c(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c9, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ca, code lost:
            p229x5.C11992h.f21919m.mo36849d(r2);
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
        public void mo42582h() {
            /*
                r14 = this;
                r0 = 0
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r14.f21940e = r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.nio.channels.Selector r1 = r14.f21939d     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r1 != 0) goto L_0x000e
                r14.f21940e = r0
                return
            L_0x000e:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21938c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0014:
                int r3 = r2 + -1
                r4 = 1
                if (r2 <= 0) goto L_0x00d2
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21938c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.Object r2 = r2.poll()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x00d2
                boolean r5 = r2 instanceof p225w5.C11950k     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r5 == 0) goto L_0x0033
                x5.g r2 = (p229x5.C11989g) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.nio.channels.ByteChannel r4 = r2.mo42556p()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r2.mo42561D()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0030 }
                goto L_0x00cf
            L_0x0030:
                r2 = move-exception
                goto L_0x00a9
            L_0x0033:
                boolean r5 = r2 instanceof p229x5.C11992h.C11995c     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r5 == 0) goto L_0x006d
                x5.h$c r2 = (p229x5.C11992h.C11995c) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.nio.channels.SelectableChannel r5 = r2.f21934a     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.lang.Object r2 = r2.f21935b     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                boolean r6 = r5 instanceof java.nio.channels.SocketChannel     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                if (r6 == 0) goto L_0x005d
                r6 = r5
                java.nio.channels.SocketChannel r6 = (java.nio.channels.SocketChannel) r6     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                boolean r6 = r6.isConnected()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                if (r6 == 0) goto L_0x005d
                java.nio.channels.SelectionKey r2 = r5.register(r1, r4, r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r4 = r5
                java.nio.channels.SocketChannel r4 = (java.nio.channels.SocketChannel) r4     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                x5.g r4 = r14.m30818f(r4, r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r2.attach(r4)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
                r4.mo42567J()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x006a }
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
                x5.g r5 = r14.m30818f(r2, r4)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                r4.attach(r5)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                r5.mo42567J()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x0082 }
                goto L_0x00cf
            L_0x0082:
                r4 = move-exception
                r13 = r4
                r4 = r2
                r2 = r13
                goto L_0x00a9
            L_0x0087:
                boolean r4 = r2 instanceof p229x5.C11992h.C11994b     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r4 == 0) goto L_0x0091
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r2.run()     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                goto L_0x00cf
            L_0x0091:
                boolean r4 = r2 instanceof java.lang.Runnable     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                if (r4 == 0) goto L_0x009d
                x5.h r4 = p229x5.C11992h.this     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
                r4.mo39648h0(r2)     // Catch:{ CancelledKeyException -> 0x00c9, all -> 0x00a7 }
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
                x5.h r5 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r5 = r5.isRunning()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r5 == 0) goto L_0x00b7
                e6.c r5 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo36856j(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x00bc
            L_0x00b7:
                e6.c r5 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo36848c(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x00bc:
                if (r4 == 0) goto L_0x00cf
                r4.close()     // Catch:{ IOException -> 0x00c2 }
                goto L_0x00cf
            L_0x00c2:
                r2 = move-exception
                e6.c r4 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r4.mo36848c(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x00cf
            L_0x00c9:
                r2 = move-exception
                e6.c r4 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r4.mo36849d(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
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
                boolean r2 = r14.f21943h     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x0100
                int r2 = p229x5.C11992h.f21922p     // Catch:{ InterruptedException -> 0x00f6 }
                long r5 = (long) r2     // Catch:{ InterruptedException -> 0x00f6 }
                java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x00f6 }
                goto L_0x00fc
            L_0x00f6:
                r2 = move-exception
                e6.c r5 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r5.mo36849d(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x00fc:
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0100:
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo37211k(r5)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r2.mo37206f()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r2 = r14.f21938c     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 != 0) goto L_0x0119
                int r2 = p229x5.C11992h.f21923q     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
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
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo37211k(r9)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = p229x5.C11992h.f21920n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 <= 0) goto L_0x0163
                long r9 = r9 - r5
                r5 = 1
                int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r2 > 0) goto L_0x0163
                int r2 = r14.f21941f     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = r2 + r4
                r14.f21941f = r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r5 = p229x5.C11992h.f21921o     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 <= r5) goto L_0x0163
                r14.f21943h = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r2 = r14.f21944i     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 != 0) goto L_0x0163
                r14.f21944i = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                e6.c r2 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.String r5 = "Selector {} is too busy, pausing!"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6[r3] = r14     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo36847b(r5, r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x0163:
                java.nio.channels.Selector r2 = r14.f21939d     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
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
                x5.g r6 = (p229x5.C11989g) r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r6 == 0) goto L_0x0177
                r6.mo42561D()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                goto L_0x0177
            L_0x0198:
                java.lang.Object r6 = r5.attachment()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                boolean r9 = r6 instanceof p229x5.C11989g     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x01b2
                boolean r9 = r5.isReadable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 != 0) goto L_0x01ac
                boolean r9 = r5.isWritable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x0177
            L_0x01ac:
                x5.g r6 = (p229x5.C11989g) r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                r6.mo42567J()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                goto L_0x0177
            L_0x01b2:
                boolean r9 = r5.isConnectable()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                if (r9 == 0) goto L_0x01e3
                java.nio.channels.SelectableChannel r9 = r5.channel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                java.nio.channels.SocketChannel r9 = (java.nio.channels.SocketChannel) r9     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                boolean r6 = r9.finishConnect()     // Catch:{ Exception -> 0x01d8 }
                if (r6 == 0) goto L_0x01d2
                r5.interestOps(r4)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                x5.g r6 = r14.m30818f(r9, r5)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                r5.attach(r6)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
            L_0x01ce:
                r6.mo42567J()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                goto L_0x0177
            L_0x01d2:
                r5.cancel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                goto L_0x0177
            L_0x01d6:
                r6 = move-exception
                goto L_0x01df
            L_0x01d8:
                r10 = move-exception
                x5.h r11 = p229x5.C11992h.this     // Catch:{ all -> 0x01d6 }
                r11.mo39642L0(r9, r10, r6)     // Catch:{ all -> 0x01d6 }
                goto L_0x01d2
            L_0x01df:
                r5.cancel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
                throw r6     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
            L_0x01e3:
                java.nio.channels.SelectableChannel r6 = r5.channel()     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                r9 = r6
                java.nio.channels.SocketChannel r9 = (java.nio.channels.SocketChannel) r9     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01fa }
                x5.g r6 = r14.m30818f(r9, r5)     // Catch:{ CancelledKeyException -> 0x0230, Exception -> 0x01f8 }
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
                x5.h r10 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                boolean r10 = r10.isRunning()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r10 == 0) goto L_0x020a
                e6.c r10 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r10.mo36856j(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x020f
            L_0x020a:
                e6.c r10 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r10.mo36849d(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x020f:
                if (r9 == 0) goto L_0x021b
                r9.close()     // Catch:{ IOException -> 0x0215 }
                goto L_0x021b
            L_0x0215:
                r6 = move-exception
                e6.c r9 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r9.mo36848c(r6)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
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
                e6.c r6 = p229x5.C11992h.f21919m     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo36849d(r5)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x0177
            L_0x0238:
                java.util.Set r2 = r1.selectedKeys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.clear()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r2.mo37211k(r4)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x024a:
                i6.e$a r2 = r2.mo37203c()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r2 == 0) goto L_0x025e
                boolean r6 = r2 instanceof java.lang.Runnable     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r6 == 0) goto L_0x025b
                x5.h r6 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo39648h0(r2)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x025b:
                i6.e r2 = r14.f21937b     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x024a
            L_0x025e:
                long r9 = r14.f21945j     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r4 - r9
                int r2 = p229x5.C11992h.f21923q     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r11 = (long) r2     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x02a6
                r14.f21945j = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                x5.h r2 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r9 = r2.f21926g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 <= 0) goto L_0x029b
                java.util.Set r1 = r1.keys()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = r1.size()     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                x5.h r6 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r6 = r6.f21926g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x029b
                x5.h r1 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = r1.f21924e     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = r1 + r4
                x5.h r6 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r6 = r6.f21925f     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r6 = (long) r6     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = r1 - r6
                goto L_0x029c
            L_0x029b:
                r1 = r4
            L_0x029c:
                x5.h r6 = p229x5.C11992h.this     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                x5.h$d$a r7 = new x5.h$d$a     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r7.<init>(r1)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r6.mo39648h0(r7)     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
            L_0x02a6:
                int r1 = p229x5.C11992h.f21920n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                if (r1 <= 0) goto L_0x02ca
                long r1 = r14.f21942g     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 <= 0) goto L_0x02ca
                r14.f21941f = r3     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                r14.f21943h = r3     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                int r1 = p229x5.C11992h.f21920n     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r1 = (long) r1     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                long r4 = r4 + r1
                r14.f21942g = r4     // Catch:{ ClosedSelectorException -> 0x02cd, CancelledKeyException -> 0x02c4 }
                goto L_0x02ca
            L_0x02bf:
                r14.f21940e = r0
                return
            L_0x02c2:
                r1 = move-exception
                goto L_0x02e0
            L_0x02c4:
                r1 = move-exception
                e6.c r2 = p229x5.C11992h.f21919m     // Catch:{ all -> 0x02c2 }
            L_0x02c7:
                r2.mo36849d(r1)     // Catch:{ all -> 0x02c2 }
            L_0x02ca:
                r14.f21940e = r0
                goto L_0x02df
            L_0x02cd:
                r1 = move-exception
                x5.h r2 = p229x5.C11992h.this     // Catch:{ all -> 0x02c2 }
                boolean r2 = r2.isRunning()     // Catch:{ all -> 0x02c2 }
                if (r2 == 0) goto L_0x02dc
                e6.c r2 = p229x5.C11992h.f21919m     // Catch:{ all -> 0x02c2 }
                r2.mo36856j(r1)     // Catch:{ all -> 0x02c2 }
                goto L_0x02ca
            L_0x02dc:
                e6.c r2 = p229x5.C11992h.f21919m     // Catch:{ all -> 0x02c2 }
                goto L_0x02c7
            L_0x02df:
                return
            L_0x02e0:
                r14.f21940e = r0
                goto L_0x02e4
            L_0x02e3:
                throw r1
            L_0x02e4:
                goto L_0x02e3
            */
            throw new UnsupportedOperationException("Method not decompiled: p229x5.C11992h.C11996d.mo42582h():void");
        }

        /* renamed from: i */
        public void mo42583i(List<Object> list) {
            StringBuilder sb;
            Selector selector = this.f21939d;
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
        public C11992h mo42584j() {
            return C11992h.this;
        }

        /* renamed from: k */
        public long mo42585k() {
            return this.f21937b.mo37205e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Selector mo42586l() {
            return this.f21939d;
        }

        /* renamed from: n */
        public void mo42587n(C9128e.C9129a aVar, long j) {
            if (aVar instanceof Runnable) {
                this.f21937b.mo37208h(aVar, j);
                return;
            }
            throw new IllegalArgumentException("!Runnable");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo42588o() {
            int i = 0;
            while (i < 100) {
                try {
                    if (this.f21940e == null) {
                        break;
                    }
                    mo42589p();
                    Thread.sleep(10);
                    i++;
                } catch (Exception e) {
                    C11992h.f21919m.mo36849d(e);
                }
            }
            synchronized (this) {
                for (SelectionKey next : this.f21939d.keys()) {
                    if (next != null) {
                        Object attachment = next.attachment();
                        if (attachment instanceof C11950k) {
                            try {
                                ((C11950k) attachment).close();
                            } catch (IOException e2) {
                                C11992h.f21919m.mo36849d(e2);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.f21937b.mo37202b();
                try {
                    Selector selector = this.f21939d;
                    if (selector != null) {
                        selector.close();
                    }
                } catch (IOException e3) {
                    C11992h.f21919m.mo36849d(e3);
                }
                this.f21939d = null;
            }
        }

        /* renamed from: p */
        public void mo42589p() {
            try {
                Selector selector = this.f21939d;
                if (selector != null) {
                    selector.wakeup();
                }
            } catch (Exception unused) {
                mo42578c(new C11998b());
                m30819m();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.StackTraceElement} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: p0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26544p0(java.lang.Appendable r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = java.lang.String.valueOf(r7)
                java.lang.Appendable r0 = r8.append(r0)
                java.lang.String r1 = " id="
                java.lang.Appendable r0 = r0.append(r1)
                int r1 = r7.f21936a
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.Appendable r0 = r0.append(r1)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.Thread r0 = r7.f21940e
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
                java.nio.channels.Selector r0 = r7.f21939d
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
                x5.h$d$c r4 = new x5.h$d$c
                r4.<init>(r2, r0)
                r7.mo42578c(r4)
                r4 = 5
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x006e }
                r0.await(r4, r6)     // Catch:{ InterruptedException -> 0x006e }
                goto L_0x0074
            L_0x006e:
                r0 = move-exception
                e6.c r4 = p229x5.C11992h.f21919m
                r4.mo36849d(r0)
            L_0x0074:
                java.util.Collection[] r0 = new java.util.Collection[r3]
                r0[r1] = r2
                p147d6.C8942b.m21357G0(r8, r9, r0)
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229x5.C11992h.C11996d.mo26544p0(java.lang.Appendable, java.lang.String):void");
        }

        public String toString() {
            Selector selector = this.f21939d;
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
    /* renamed from: L0 */
    public void mo39642L0(SocketChannel socketChannel, Throwable th, Object obj) {
        C9003c cVar = f21919m;
        cVar.mo36847b(th + Constants.ACCEPT_TIME_SEPARATOR_SP + socketChannel + Constants.ACCEPT_TIME_SEPARATOR_SP + obj, new Object[0]);
        cVar.mo36848c(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public abstract void mo39643M0(C11989g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public abstract void mo39644N0(C11989g gVar);

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public abstract void mo39645O0(C11948i iVar, C11949j jVar);

    /* renamed from: P0 */
    public int mo42573P0() {
        return this.f21928i;
    }

    /* renamed from: Q0 */
    public int mo42574Q0() {
        return this.f21931l;
    }

    /* renamed from: R0 */
    public boolean mo42575R0() {
        return this.f21930k;
    }

    /* renamed from: S0 */
    public abstract C11983a mo39646S0(SocketChannel socketChannel, C11939c cVar, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public abstract C11989g mo39647T0(SocketChannel socketChannel, C11996d dVar, SelectionKey selectionKey);

    /* renamed from: U0 */
    public void mo42576U0(SocketChannel socketChannel, Object obj) {
        int i = this.f21929j;
        this.f21929j = i + 1;
        if (i < 0) {
            i = -i;
        }
        int i2 = i % this.f21928i;
        C11996d[] dVarArr = this.f21927h;
        if (dVarArr != null) {
            C11996d dVar = dVarArr[i2];
            dVar.mo42579d(socketChannel, obj);
            dVar.mo42589p();
        }
    }

    /* renamed from: h0 */
    public abstract boolean mo39648h0(Runnable runnable);

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        C8942b.m21358H0(appendable, this);
        C8942b.m21357G0(appendable, str, C9996o.m24714a(this.f21927h));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        this.f21927h = new C11996d[this.f21928i];
        int i = 0;
        int i2 = 0;
        while (true) {
            C11996d[] dVarArr = this.f21927h;
            if (i2 >= dVarArr.length) {
                break;
            }
            dVarArr[i2] = new C11996d(i2);
            i2++;
        }
        super.mo26547u0();
        while (i < mo42573P0()) {
            if (mo39648h0(new C11993a(i))) {
                i++;
            } else {
                throw new IllegalStateException("!Selecting");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        C11996d[] dVarArr = this.f21927h;
        this.f21927h = null;
        if (dVarArr != null) {
            for (C11996d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.mo42588o();
                }
            }
        }
        super.mo26548v0();
    }
}
