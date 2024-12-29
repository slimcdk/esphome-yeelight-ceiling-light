package p156f.p157g0.p161i;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p156f.p157g0.C10750b;
import p156f.p157g0.C4345c;
import p156f.p157g0.p161i.C10808h;
import p156f.p157g0.p162k.C4373f;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4411f;

/* renamed from: f.g0.i.g */
public final class C10795g implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final ExecutorService f20772u = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4345c.m12350G("OkHttp Http2Connection", true));

    /* renamed from: a */
    final boolean f20773a;

    /* renamed from: b */
    final C4359h f20774b;

    /* renamed from: c */
    final Map<Integer, C4361i> f20775c = new LinkedHashMap();

    /* renamed from: d */
    final String f20776d;

    /* renamed from: e */
    int f20777e;

    /* renamed from: f */
    int f20778f;

    /* renamed from: g */
    boolean f20779g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ScheduledExecutorService f20780h;

    /* renamed from: i */
    private final ExecutorService f20781i;

    /* renamed from: j */
    final C10814l f20782j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f20783k;

    /* renamed from: l */
    long f20784l = 0;

    /* renamed from: m */
    long f20785m;

    /* renamed from: n */
    C10816m f20786n = new C10816m();

    /* renamed from: o */
    final C10816m f20787o = new C10816m();

    /* renamed from: p */
    boolean f20788p = false;

    /* renamed from: q */
    final Socket f20789q;

    /* renamed from: r */
    final C10811j f20790r;

    /* renamed from: s */
    final C10804j f20791s;

    /* renamed from: t */
    final Set<Integer> f20792t = new LinkedHashSet();

    /* renamed from: f.g0.i.g$h */
    public static abstract class C4359h {

        /* renamed from: a */
        public static final C4359h f7730a = new C4360a();

        /* renamed from: f.g0.i.g$h$a */
        class C4360a extends C4359h {
            C4360a() {
            }

            /* renamed from: b */
            public void mo23967b(C4361i iVar) {
                iVar.mo23982f(C10786b.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo23966a(C10795g gVar) {
        }

        /* renamed from: b */
        public abstract void mo23967b(C4361i iVar);
    }

    /* renamed from: f.g0.i.g$a */
    class C10796a extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20793b;

        /* renamed from: c */
        final /* synthetic */ C10786b f20794c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10796a(String str, Object[] objArr, int i, C10786b bVar) {
            super(str, objArr);
            this.f20793b = i;
            this.f20794c = bVar;
        }

        /* renamed from: j */
        public void mo24189j() {
            try {
                C10795g.this.mo34071W(this.f20793b, this.f20794c);
            } catch (IOException unused) {
                C10795g.this.m26804j();
            }
        }
    }

    /* renamed from: f.g0.i.g$b */
    class C10797b extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20796b;

        /* renamed from: c */
        final /* synthetic */ long f20797c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10797b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f20796b = i;
            this.f20797c = j;
        }

        /* renamed from: j */
        public void mo24189j() {
            try {
                C10795g.this.f20790r.mo34102c(this.f20796b, this.f20797c);
            } catch (IOException unused) {
                C10795g.this.m26804j();
            }
        }
    }

    /* renamed from: f.g0.i.g$c */
    class C10798c extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20799b;

        /* renamed from: c */
        final /* synthetic */ List f20800c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10798c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f20799b = i;
            this.f20800c = list;
        }

        /* renamed from: j */
        public void mo24189j() {
            if (C10795g.this.f20782j.mo34117a(this.f20799b, this.f20800c)) {
                try {
                    C10795g.this.f20790r.mo34110j(this.f20799b, C10786b.CANCEL);
                    synchronized (C10795g.this) {
                        C10795g.this.f20792t.remove(Integer.valueOf(this.f20799b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: f.g0.i.g$d */
    class C10799d extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20802b;

        /* renamed from: c */
        final /* synthetic */ List f20803c;

        /* renamed from: d */
        final /* synthetic */ boolean f20804d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10799d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f20802b = i;
            this.f20803c = list;
            this.f20804d = z;
        }

        /* renamed from: j */
        public void mo24189j() {
            boolean b = C10795g.this.f20782j.mo34118b(this.f20802b, this.f20803c, this.f20804d);
            if (b) {
                try {
                    C10795g.this.f20790r.mo34110j(this.f20802b, C10786b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f20804d) {
                synchronized (C10795g.this) {
                    C10795g.this.f20792t.remove(Integer.valueOf(this.f20802b));
                }
            }
        }
    }

    /* renamed from: f.g0.i.g$e */
    class C10800e extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20806b;

        /* renamed from: c */
        final /* synthetic */ C4406c f20807c;

        /* renamed from: d */
        final /* synthetic */ int f20808d;

        /* renamed from: e */
        final /* synthetic */ boolean f20809e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10800e(String str, Object[] objArr, int i, C4406c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f20806b = i;
            this.f20807c = cVar;
            this.f20808d = i2;
            this.f20809e = z;
        }

        /* renamed from: j */
        public void mo24189j() {
            try {
                boolean c = C10795g.this.f20782j.mo34119c(this.f20806b, this.f20807c, this.f20808d, this.f20809e);
                if (c) {
                    C10795g.this.f20790r.mo34110j(this.f20806b, C10786b.CANCEL);
                }
                if (c || this.f20809e) {
                    synchronized (C10795g.this) {
                        C10795g.this.f20792t.remove(Integer.valueOf(this.f20806b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f.g0.i.g$f */
    class C10801f extends C10750b {

        /* renamed from: b */
        final /* synthetic */ int f20811b;

        /* renamed from: c */
        final /* synthetic */ C10786b f20812c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10801f(String str, Object[] objArr, int i, C10786b bVar) {
            super(str, objArr);
            this.f20811b = i;
            this.f20812c = bVar;
        }

        /* renamed from: j */
        public void mo24189j() {
            C10795g.this.f20782j.mo34120d(this.f20811b, this.f20812c);
            synchronized (C10795g.this) {
                C10795g.this.f20792t.remove(Integer.valueOf(this.f20811b));
            }
        }
    }

    /* renamed from: f.g0.i.g$g */
    public static class C10802g {

        /* renamed from: a */
        Socket f20814a;

        /* renamed from: b */
        String f20815b;

        /* renamed from: c */
        C4410e f20816c;

        /* renamed from: d */
        C4409d f20817d;

        /* renamed from: e */
        C4359h f20818e = C4359h.f7730a;

        /* renamed from: f */
        C10814l f20819f = C10814l.f20858a;

        /* renamed from: g */
        boolean f20820g;

        /* renamed from: h */
        int f20821h;

        public C10802g(boolean z) {
            this.f20820g = z;
        }

        /* renamed from: a */
        public C10795g mo34081a() {
            return new C10795g(this);
        }

        /* renamed from: b */
        public C10802g mo34082b(C4359h hVar) {
            this.f20818e = hVar;
            return this;
        }

        /* renamed from: c */
        public C10802g mo34083c(int i) {
            this.f20821h = i;
            return this;
        }

        /* renamed from: d */
        public C10802g mo34084d(Socket socket, String str, C4410e eVar, C4409d dVar) {
            this.f20814a = socket;
            this.f20815b = str;
            this.f20816c = eVar;
            this.f20817d = dVar;
            return this;
        }
    }

    /* renamed from: f.g0.i.g$i */
    final class C10803i extends C10750b {

        /* renamed from: b */
        final boolean f20822b;

        /* renamed from: c */
        final int f20823c;

        /* renamed from: d */
        final int f20824d;

        C10803i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C10795g.this.f20776d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f20822b = z;
            this.f20823c = i;
            this.f20824d = i2;
        }

        /* renamed from: j */
        public void mo24189j() {
            C10795g.this.mo34070V(this.f20822b, this.f20823c, this.f20824d);
        }
    }

    /* renamed from: f.g0.i.g$j */
    class C10804j extends C10750b implements C10808h.C10810b {

        /* renamed from: b */
        final C10808h f20826b;

        /* renamed from: f.g0.i.g$j$a */
        class C10805a extends C10750b {

            /* renamed from: b */
            final /* synthetic */ C4361i f20828b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10805a(String str, Object[] objArr, C4361i iVar) {
                super(str, objArr);
                this.f20828b = iVar;
            }

            /* renamed from: j */
            public void mo24189j() {
                try {
                    C10795g.this.f20774b.mo23967b(this.f20828b);
                } catch (IOException e) {
                    C4373f j = C4373f.m12509j();
                    j.mo24007q(4, "Http2Connection.Listener failure for " + C10795g.this.f20776d, e);
                    try {
                        this.f20828b.mo23982f(C10786b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: f.g0.i.g$j$b */
        class C10806b extends C10750b {
            C10806b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: j */
            public void mo24189j() {
                C10795g gVar = C10795g.this;
                gVar.f20774b.mo23966a(gVar);
            }
        }

        /* renamed from: f.g0.i.g$j$c */
        class C10807c extends C10750b {

            /* renamed from: b */
            final /* synthetic */ C10816m f20831b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10807c(String str, Object[] objArr, C10816m mVar) {
                super(str, objArr);
                this.f20831b = mVar;
            }

            /* renamed from: j */
            public void mo24189j() {
                try {
                    C10795g.this.f20790r.mo34100a(this.f20831b);
                } catch (IOException unused) {
                    C10795g.this.m26804j();
                }
            }
        }

        C10804j(C10808h hVar) {
            super("OkHttp %s", C10795g.this.f20776d);
            this.f20826b = hVar;
        }

        /* renamed from: k */
        private void m26837k(C10816m mVar) {
            try {
                C10795g.this.f20780h.execute(new C10807c("OkHttp %s ACK Settings", new Object[]{C10795g.this.f20776d}, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34085b(boolean r11, p156f.p157g0.p161i.C10816m r12) {
            /*
                r10 = this;
                f.g0.i.g r0 = p156f.p157g0.p161i.C10795g.this
                monitor-enter(r0)
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                f.g0.i.m r1 = r1.f20787o     // Catch:{ all -> 0x008f }
                int r1 = r1.mo34124d()     // Catch:{ all -> 0x008f }
                if (r11 == 0) goto L_0x0014
                f.g0.i.g r11 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                f.g0.i.m r11 = r11.f20787o     // Catch:{ all -> 0x008f }
                r11.mo34121a()     // Catch:{ all -> 0x008f }
            L_0x0014:
                f.g0.i.g r11 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                f.g0.i.m r11 = r11.f20787o     // Catch:{ all -> 0x008f }
                r11.mo34128h(r12)     // Catch:{ all -> 0x008f }
                r10.m26837k(r12)     // Catch:{ all -> 0x008f }
                f.g0.i.g r11 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                f.g0.i.m r11 = r11.f20787o     // Catch:{ all -> 0x008f }
                int r11 = r11.mo34124d()     // Catch:{ all -> 0x008f }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x005f
                if (r11 == r1) goto L_0x005f
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x008f }
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                boolean r1 = r1.f20788p     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x003b
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                r1.f20788p = r4     // Catch:{ all -> 0x008f }
            L_0x003b:
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, f.g0.i.i> r1 = r1.f20775c     // Catch:{ all -> 0x008f }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x0060
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, f.g0.i.i> r1 = r1.f20775c     // Catch:{ all -> 0x008f }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x008f }
                f.g0.i.g r5 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, f.g0.i.i> r5 = r5.f20775c     // Catch:{ all -> 0x008f }
                int r5 = r5.size()     // Catch:{ all -> 0x008f }
                f.g0.i.i[] r5 = new p156f.p157g0.p161i.C4361i[r5]     // Catch:{ all -> 0x008f }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x008f }
                r5 = r1
                f.g0.i.i[] r5 = (p156f.p157g0.p161i.C4361i[]) r5     // Catch:{ all -> 0x008f }
                goto L_0x0060
            L_0x005f:
                r11 = r2
            L_0x0060:
                java.util.concurrent.ExecutorService r1 = p156f.p157g0.p161i.C10795g.f20772u     // Catch:{ all -> 0x008f }
                f.g0.i.g$j$b r6 = new f.g0.i.g$j$b     // Catch:{ all -> 0x008f }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008f }
                f.g0.i.g r8 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x008f }
                java.lang.String r8 = r8.f20776d     // Catch:{ all -> 0x008f }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x008f }
                r6.<init>(r7, r4)     // Catch:{ all -> 0x008f }
                r1.execute(r6)     // Catch:{ all -> 0x008f }
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                if (r5 == 0) goto L_0x008e
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x008e
                int r0 = r5.length
            L_0x007f:
                if (r9 >= r0) goto L_0x008e
                r1 = r5[r9]
                monitor-enter(r1)
                r1.mo23979c(r11)     // Catch:{ all -> 0x008b }
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                int r9 = r9 + 1
                goto L_0x007f
            L_0x008b:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                throw r11
            L_0x008e:
                return
            L_0x008f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                goto L_0x0093
            L_0x0092:
                throw r11
            L_0x0093:
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C10795g.C10804j.mo34085b(boolean, f.g0.i.m):void");
        }

        /* renamed from: c */
        public void mo34086c(int i, long j) {
            C10795g gVar = C10795g.this;
            if (i == 0) {
                synchronized (gVar) {
                    C10795g.this.f20785m += j;
                    C10795g.this.notifyAll();
                }
                return;
            }
            C4361i n = gVar.mo34077n(i);
            if (n != null) {
                synchronized (n) {
                    n.mo23979c(j);
                }
            }
        }

        /* renamed from: d */
        public void mo34087d(boolean z, int i, int i2) {
            if (z) {
                synchronized (C10795g.this) {
                    boolean unused = C10795g.this.f20783k = false;
                    C10795g.this.notifyAll();
                }
                return;
            }
            try {
                C10795g.this.f20780h.execute(new C10803i(true, i, i2));
            } catch (RejectedExecutionException unused2) {
            }
        }

        /* renamed from: e */
        public void mo34088e(int i, int i2, List<C10787c> list) {
            C10795g.this.mo34061I(i2, list);
        }

        /* renamed from: f */
        public void mo34089f() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r0.mo23992q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            r0.mo23991p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34090g(boolean r10, int r11, int r12, java.util.List<p156f.p157g0.p161i.C10787c> r13) {
            /*
                r9 = this;
                f.g0.i.g r12 = p156f.p157g0.p161i.C10795g.this
                boolean r12 = r12.mo34063K(r11)
                if (r12 == 0) goto L_0x000e
                f.g0.i.g r12 = p156f.p157g0.p161i.C10795g.this
                r12.mo34060F(r11, r13, r10)
                return
            L_0x000e:
                f.g0.i.g r12 = p156f.p157g0.p161i.C10795g.this
                monitor-enter(r12)
                f.g0.i.g r0 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                f.g0.i.i r0 = r0.mo34077n(r11)     // Catch:{ all -> 0x007d }
                if (r0 != 0) goto L_0x0073
                f.g0.i.g r0 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                boolean r0 = r0.f20779g     // Catch:{ all -> 0x007d }
                if (r0 == 0) goto L_0x0021
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0021:
                f.g0.i.g r0 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                int r0 = r0.f20777e     // Catch:{ all -> 0x007d }
                if (r11 > r0) goto L_0x0029
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0029:
                int r0 = r11 % 2
                f.g0.i.g r1 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                int r1 = r1.f20778f     // Catch:{ all -> 0x007d }
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0035:
                f.s r8 = p156f.p157g0.C4345c.m12351H(r13)     // Catch:{ all -> 0x007d }
                f.g0.i.i r13 = new f.g0.i.i     // Catch:{ all -> 0x007d }
                f.g0.i.g r5 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007d }
                f.g0.i.g r10 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                r10.f20777e = r11     // Catch:{ all -> 0x007d }
                f.g0.i.g r10 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                java.util.Map<java.lang.Integer, f.g0.i.i> r10 = r10.f20775c     // Catch:{ all -> 0x007d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r10.put(r0, r13)     // Catch:{ all -> 0x007d }
                java.util.concurrent.ExecutorService r10 = p156f.p157g0.p161i.C10795g.f20772u     // Catch:{ all -> 0x007d }
                f.g0.i.g$j$a r0 = new f.g0.i.g$j$a     // Catch:{ all -> 0x007d }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
                r3 = 0
                f.g0.i.g r4 = p156f.p157g0.p161i.C10795g.this     // Catch:{ all -> 0x007d }
                java.lang.String r4 = r4.f20776d     // Catch:{ all -> 0x007d }
                r2[r3] = r4     // Catch:{ all -> 0x007d }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r2[r3] = r11     // Catch:{ all -> 0x007d }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007d }
                r10.execute(r0)     // Catch:{ all -> 0x007d }
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0073:
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                r0.mo23992q(r13)
                if (r10 == 0) goto L_0x007c
                r0.mo23991p()
            L_0x007c:
                return
            L_0x007d:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C10795g.C10804j.mo34090g(boolean, int, int, java.util.List):void");
        }

        /* renamed from: h */
        public void mo34091h(int i, C10786b bVar) {
            if (C10795g.this.mo34063K(i)) {
                C10795g.this.mo34062J(i, bVar);
                return;
            }
            C4361i L = C10795g.this.mo34064L(i);
            if (L != null) {
                L.mo23993r(bVar);
            }
        }

        /* renamed from: i */
        public void mo34092i(int i, C10786b bVar, C4411f fVar) {
            C4361i[] iVarArr;
            fVar.mo24297q();
            synchronized (C10795g.this) {
                iVarArr = (C4361i[]) C10795g.this.f20775c.values().toArray(new C4361i[C10795g.this.f20775c.size()]);
                C10795g.this.f20779g = true;
            }
            for (C4361i iVar : iVarArr) {
                if (iVar.mo23984i() > i && iVar.mo23987l()) {
                    iVar.mo23993r(C10786b.REFUSED_STREAM);
                    C10795g.this.mo34064L(iVar.mo23984i());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = p156f.p157g0.p161i.C10786b.PROTOCOL_ERROR;
            r0 = p156f.p157g0.p161i.C10786b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r2 = r4.f20827c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24189j() {
            /*
                r4 = this;
                f.g0.i.b r0 = p156f.p157g0.p161i.C10786b.INTERNAL_ERROR
                f.g0.i.h r1 = r4.f20826b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.mo34097g(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                f.g0.i.h r1 = r4.f20826b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.mo34095b(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                f.g0.i.b r1 = p156f.p157g0.p161i.C10786b.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                f.g0.i.b r0 = p156f.p157g0.p161i.C10786b.CANCEL     // Catch:{ IOException -> 0x001c }
                f.g0.i.g r2 = p156f.p157g0.p161i.C10795g.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                f.g0.i.b r1 = p156f.p157g0.p161i.C10786b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                f.g0.i.b r0 = p156f.p157g0.p161i.C10786b.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                f.g0.i.g r2 = p156f.p157g0.p161i.C10795g.this     // Catch:{ IOException -> 0x0025 }
            L_0x0022:
                r2.mo34076i(r1, r0)     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                f.g0.i.h r0 = r4.f20826b
                p156f.p157g0.C4345c.m12360g(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                f.g0.i.g r3 = p156f.p157g0.p161i.C10795g.this     // Catch:{ IOException -> 0x0031 }
                r3.mo34076i(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                f.g0.i.h r0 = r4.f20826b
                p156f.p157g0.C4345c.m12360g(r0)
                goto L_0x0038
            L_0x0037:
                throw r2
            L_0x0038:
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C10795g.C10804j.mo24189j():void");
        }

        /* renamed from: l */
        public void mo34093l(boolean z, int i, C4410e eVar, int i2) {
            if (C10795g.this.mo34063K(i)) {
                C10795g.this.mo34059C(i, eVar, i2, z);
                return;
            }
            C4361i n = C10795g.this.mo34077n(i);
            if (n == null) {
                C10795g.this.mo34072X(i, C10786b.PROTOCOL_ERROR);
                long j = (long) i2;
                C10795g.this.mo34068S(j);
                eVar.skip(j);
                return;
            }
            n.mo23990o(eVar, i2);
            if (z) {
                n.mo23991p();
            }
        }

        /* renamed from: m */
        public void mo34094m(int i, int i2, int i3, boolean z) {
        }
    }

    static {
        Class<C10795g> cls = C10795g.class;
    }

    C10795g(C10802g gVar) {
        C10802g gVar2 = gVar;
        this.f20782j = gVar2.f20819f;
        boolean z = gVar2.f20820g;
        this.f20773a = z;
        this.f20774b = gVar2.f20818e;
        int i = z ? 1 : 2;
        this.f20778f = i;
        if (gVar2.f20820g) {
            this.f20778f = i + 2;
        }
        if (gVar2.f20820g) {
            this.f20786n.mo34129i(7, 16777216);
        }
        this.f20776d = gVar2.f20815b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C4345c.m12350G(C4345c.m12371r("OkHttp %s Writer", this.f20776d), false));
        this.f20780h = scheduledThreadPoolExecutor;
        if (gVar2.f20821h != 0) {
            C10803i iVar = new C10803i(false, 0, 0);
            int i2 = gVar2.f20821h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f20781i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4345c.m12350G(C4345c.m12371r("OkHttp %s Push Observer", this.f20776d), true));
        this.f20787o.mo34129i(7, SupportMenu.USER_MASK);
        this.f20787o.mo34129i(5, 16384);
        this.f20785m = (long) this.f20787o.mo34124d();
        this.f20789q = gVar2.f20814a;
        this.f20790r = new C10811j(gVar2.f20817d, this.f20773a);
        this.f20791s = new C10804j(new C10808h(gVar2.f20816c, this.f20773a));
    }

    /* renamed from: D */
    private synchronized void m26799D(C10750b bVar) {
        if (!mo34078o()) {
            this.f20781i.execute(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m26804j() {
        try {
            mo34076i(C10786b.PROTOCOL_ERROR, C10786b.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p156f.p157g0.p161i.C4361i m26805t(int r11, java.util.List<p156f.p157g0.p161i.C10787c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            f.g0.i.j r7 = r10.f20790r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f20778f     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            f.g0.i.b r0 = p156f.p157g0.p161i.C10786b.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.mo34065M(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f20779g     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f20778f     // Catch:{ all -> 0x0075 }
            int r0 = r10.f20778f     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f20778f = r0     // Catch:{ all -> 0x0075 }
            f.g0.i.i r9 = new f.g0.i.i     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.f20785m     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f7732b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.mo23988m()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, f.g0.i.i> r0 = r10.f20775c     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            f.g0.i.j r0 = r10.f20790r     // Catch:{ all -> 0x0078 }
            r0.mo34112o(r6, r8, r11, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f20773a     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            f.g0.i.j r0 = r10.f20790r     // Catch:{ all -> 0x0078 }
            r0.mo34105e(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            f.g0.i.j r11 = r10.f20790r
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            f.g0.i.a r11 = new f.g0.i.a     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C10795g.m26805t(int, java.util.List, boolean):f.g0.i.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo34059C(int i, C4410e eVar, int i2, boolean z) {
        C4406c cVar = new C4406c();
        long j = (long) i2;
        eVar.mo24218X0(j);
        eVar.mo9541P0(cVar, j);
        if (cVar.mo24233g1() == j) {
            m26799D(new C10800e("OkHttp %s Push Data[%s]", new Object[]{this.f20776d, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo24233g1() + " != " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo34060F(int i, List<C10787c> list, boolean z) {
        try {
            m26799D(new C10799d("OkHttp %s Push Headers[%s]", new Object[]{this.f20776d, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo34061I(int i, List<C10787c> list) {
        synchronized (this) {
            if (this.f20792t.contains(Integer.valueOf(i))) {
                mo34072X(i, C10786b.PROTOCOL_ERROR);
                return;
            }
            this.f20792t.add(Integer.valueOf(i));
            try {
                m26799D(new C10798c("OkHttp %s Push Request[%s]", new Object[]{this.f20776d, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo34062J(int i, C10786b bVar) {
        m26799D(new C10801f("OkHttp %s Push Reset[%s]", new Object[]{this.f20776d, Integer.valueOf(i)}, i, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo34063K(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public synchronized C4361i mo34064L(int i) {
        C4361i remove;
        remove = this.f20775c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: M */
    public void mo34065M(C10786b bVar) {
        synchronized (this.f20790r) {
            synchronized (this) {
                if (!this.f20779g) {
                    this.f20779g = true;
                    int i = this.f20777e;
                    this.f20790r.mo34108h(i, bVar, C4345c.f7640a);
                }
            }
        }
    }

    /* renamed from: Q */
    public void mo34066Q() {
        mo34067R(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo34067R(boolean z) {
        if (z) {
            this.f20790r.mo34113y();
            this.f20790r.mo34111n(this.f20786n);
            int d = this.f20786n.mo34124d();
            if (d != 65535) {
                this.f20790r.mo34102c(0, (long) (d - SupportMenu.USER_MASK));
            }
        }
        new Thread(this.f20791s).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public synchronized void mo34068S(long j) {
        long j2 = this.f20784l + j;
        this.f20784l = j2;
        if (j2 >= ((long) (this.f20786n.mo34124d() / 2))) {
            mo34073Z(0, this.f20784l);
            this.f20784l = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f20785m), r8.f20790r.mo34099V0());
        r6 = (long) r3;
        r8.f20785m -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34069T(int r9, boolean r10, p163g.C4406c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            f.g0.i.j r12 = r8.f20790r
            r12.mo34098A(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f20785m     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, f.g0.i.i> r3 = r8.f20775c     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.f20785m     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            f.g0.i.j r3 = r8.f20790r     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo34099V0()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f20785m     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f20785m = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            f.g0.i.j r4 = r8.f20790r
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo34098A(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C10795g.mo34069T(int, boolean, g.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo34070V(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f20783k;
                this.f20783k = true;
            }
            if (z2) {
                m26804j();
                return;
            }
        }
        try {
            this.f20790r.mo34104d(z, i, i2);
        } catch (IOException unused) {
            m26804j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo34071W(int i, C10786b bVar) {
        this.f20790r.mo34110j(i, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo34072X(int i, C10786b bVar) {
        try {
            this.f20780h.execute(new C10796a("OkHttp %s stream %d", new Object[]{this.f20776d, Integer.valueOf(i)}, i, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo34073Z(int i, long j) {
        try {
            this.f20780h.execute(new C10797b("OkHttp Window Update %s stream %d", new Object[]{this.f20776d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void close() {
        mo34076i(C10786b.NO_ERROR, C10786b.CANCEL);
    }

    public void flush() {
        this.f20790r.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34076i(C10786b bVar, C10786b bVar2) {
        C4361i[] iVarArr = null;
        try {
            mo34065M(bVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f20775c.isEmpty()) {
                iVarArr = (C4361i[]) this.f20775c.values().toArray(new C4361i[this.f20775c.size()]);
                this.f20775c.clear();
            }
        }
        if (iVarArr != null) {
            for (C4361i f : iVarArr) {
                try {
                    f.mo23982f(bVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f20790r.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f20789q.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f20780h.shutdown();
        this.f20781i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized C4361i mo34077n(int i) {
        return this.f20775c.get(Integer.valueOf(i));
    }

    /* renamed from: o */
    public synchronized boolean mo34078o() {
        return this.f20779g;
    }

    /* renamed from: s */
    public synchronized int mo34079s() {
        return this.f20787o.mo34125e(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: u */
    public C4361i mo34080u(List<C10787c> list, boolean z) {
        return m26805t(0, list, z);
    }
}
