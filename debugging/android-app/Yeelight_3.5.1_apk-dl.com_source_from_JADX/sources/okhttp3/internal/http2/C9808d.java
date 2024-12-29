package okhttp3.internal.http2;

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
import okhttp3.internal.http2.C9823e;
import okio.ByteString;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import p056k5.C3300c;
import p056k5.C9296b;
import p092r5.C3636f;
import p199p5.C10273b;

/* renamed from: okhttp3.internal.http2.d */
public final class C9808d implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final ExecutorService f17725u = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C3300c.m8912F("OkHttp Http2Connection", true));

    /* renamed from: a */
    final boolean f17726a;

    /* renamed from: b */
    final C9816h f17727b;

    /* renamed from: c */
    final Map<Integer, C3527f> f17728c = new LinkedHashMap();

    /* renamed from: d */
    final String f17729d;

    /* renamed from: e */
    int f17730e;

    /* renamed from: f */
    int f17731f;

    /* renamed from: g */
    boolean f17732g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ScheduledExecutorService f17733h;

    /* renamed from: i */
    private final ExecutorService f17734i;

    /* renamed from: j */
    final C10273b f17735j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f17736k;

    /* renamed from: l */
    long f17737l = 0;

    /* renamed from: m */
    long f17738m;

    /* renamed from: n */
    C9829i f17739n = new C9829i();

    /* renamed from: o */
    final C9829i f17740o;

    /* renamed from: p */
    boolean f17741p;

    /* renamed from: q */
    final Socket f17742q;

    /* renamed from: r */
    final C9826g f17743r;

    /* renamed from: s */
    final C9819j f17744s;

    /* renamed from: t */
    final Set<Integer> f17745t;

    /* renamed from: okhttp3.internal.http2.d$a */
    class C9809a extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17746b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f17747c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9809a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f17746b = i;
            this.f17747c = errorCode;
        }

        /* renamed from: c */
        public void mo24648c() {
            try {
                C9808d.this.mo39017P(this.f17746b, this.f17747c);
            } catch (IOException unused) {
                C9808d.this.m23544i();
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$b */
    class C9810b extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17749b;

        /* renamed from: c */
        final /* synthetic */ long f17750c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9810b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f17749b = i;
            this.f17750c = j;
        }

        /* renamed from: c */
        public void mo24648c() {
            try {
                C9808d.this.f17743r.mo39051b(this.f17749b, this.f17750c);
            } catch (IOException unused) {
                C9808d.this.m23544i();
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$c */
    class C9811c extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17752b;

        /* renamed from: c */
        final /* synthetic */ List f17753c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9811c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f17752b = i;
            this.f17753c = list;
        }

        /* renamed from: c */
        public void mo24648c() {
            if (C9808d.this.f17735j.mo41760a(this.f17752b, this.f17753c)) {
                try {
                    C9808d.this.f17743r.mo39060i(this.f17752b, ErrorCode.CANCEL);
                    synchronized (C9808d.this) {
                        C9808d.this.f17745t.remove(Integer.valueOf(this.f17752b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$d */
    class C9812d extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17755b;

        /* renamed from: c */
        final /* synthetic */ List f17756c;

        /* renamed from: d */
        final /* synthetic */ boolean f17757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9812d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f17755b = i;
            this.f17756c = list;
            this.f17757d = z;
        }

        /* renamed from: c */
        public void mo24648c() {
            boolean b = C9808d.this.f17735j.mo41761b(this.f17755b, this.f17756c, this.f17757d);
            if (b) {
                try {
                    C9808d.this.f17743r.mo39060i(this.f17755b, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f17757d) {
                synchronized (C9808d.this) {
                    C9808d.this.f17745t.remove(Integer.valueOf(this.f17755b));
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$e */
    class C9813e extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17759b;

        /* renamed from: c */
        final /* synthetic */ C3564c f17760c;

        /* renamed from: d */
        final /* synthetic */ int f17761d;

        /* renamed from: e */
        final /* synthetic */ boolean f17762e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9813e(String str, Object[] objArr, int i, C3564c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f17759b = i;
            this.f17760c = cVar;
            this.f17761d = i2;
            this.f17762e = z;
        }

        /* renamed from: c */
        public void mo24648c() {
            try {
                boolean c = C9808d.this.f17735j.mo41762c(this.f17759b, this.f17760c, this.f17761d, this.f17762e);
                if (c) {
                    C9808d.this.f17743r.mo39060i(this.f17759b, ErrorCode.CANCEL);
                }
                if (c || this.f17762e) {
                    synchronized (C9808d.this) {
                        C9808d.this.f17745t.remove(Integer.valueOf(this.f17759b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$f */
    class C9814f extends C9296b {

        /* renamed from: b */
        final /* synthetic */ int f17764b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f17765c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9814f(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f17764b = i;
            this.f17765c = errorCode;
        }

        /* renamed from: c */
        public void mo24648c() {
            C9808d.this.f17735j.mo41763d(this.f17764b, this.f17765c);
            synchronized (C9808d.this) {
                C9808d.this.f17745t.remove(Integer.valueOf(this.f17764b));
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.d$g */
    public static class C9815g {

        /* renamed from: a */
        Socket f17767a;

        /* renamed from: b */
        String f17768b;

        /* renamed from: c */
        C9838e f17769c;

        /* renamed from: d */
        C9837d f17770d;

        /* renamed from: e */
        C9816h f17771e = C9816h.f17775a;

        /* renamed from: f */
        C10273b f17772f = C10273b.f19350a;

        /* renamed from: g */
        boolean f17773g;

        /* renamed from: h */
        int f17774h;

        public C9815g(boolean z) {
            this.f17773g = z;
        }

        /* renamed from: a */
        public C9808d mo39030a() {
            return new C9808d(this);
        }

        /* renamed from: b */
        public C9815g mo39031b(C9816h hVar) {
            this.f17771e = hVar;
            return this;
        }

        /* renamed from: c */
        public C9815g mo39032c(int i) {
            this.f17774h = i;
            return this;
        }

        /* renamed from: d */
        public C9815g mo39033d(Socket socket, String str, C9838e eVar, C9837d dVar) {
            this.f17767a = socket;
            this.f17768b = str;
            this.f17769c = eVar;
            this.f17770d = dVar;
            return this;
        }
    }

    /* renamed from: okhttp3.internal.http2.d$h */
    public static abstract class C9816h {

        /* renamed from: a */
        public static final C9816h f17775a = new C9817a();

        /* renamed from: okhttp3.internal.http2.d$h$a */
        class C9817a extends C9816h {
            C9817a() {
            }

            /* renamed from: b */
            public void mo24444b(C3527f fVar) {
                fVar.mo24459f(ErrorCode.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo24443a(C9808d dVar) {
        }

        /* renamed from: b */
        public abstract void mo24444b(C3527f fVar);
    }

    /* renamed from: okhttp3.internal.http2.d$i */
    final class C9818i extends C9296b {

        /* renamed from: b */
        final boolean f17776b;

        /* renamed from: c */
        final int f17777c;

        /* renamed from: d */
        final int f17778d;

        C9818i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C9808d.this.f17729d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f17776b = z;
            this.f17777c = i;
            this.f17778d = i2;
        }

        /* renamed from: c */
        public void mo24648c() {
            C9808d.this.mo39016N(this.f17776b, this.f17777c, this.f17778d);
        }
    }

    /* renamed from: okhttp3.internal.http2.d$j */
    class C9819j extends C9296b implements C9823e.C9825b {

        /* renamed from: b */
        final C9823e f17780b;

        /* renamed from: okhttp3.internal.http2.d$j$a */
        class C9820a extends C9296b {

            /* renamed from: b */
            final /* synthetic */ C3527f f17782b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9820a(String str, Object[] objArr, C3527f fVar) {
                super(str, objArr);
                this.f17782b = fVar;
            }

            /* renamed from: c */
            public void mo24648c() {
                try {
                    C9808d.this.f17727b.mo24444b(this.f17782b);
                } catch (IOException e) {
                    C3636f j = C3636f.m10368j();
                    j.mo25943q(4, "Http2Connection.Listener failure for " + C9808d.this.f17729d, e);
                    try {
                        this.f17782b.mo24459f(ErrorCode.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.d$j$b */
        class C9821b extends C9296b {
            C9821b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: c */
            public void mo24648c() {
                C9808d dVar = C9808d.this;
                dVar.f17727b.mo24443a(dVar);
            }
        }

        /* renamed from: okhttp3.internal.http2.d$j$c */
        class C9822c extends C9296b {

            /* renamed from: b */
            final /* synthetic */ C9829i f17785b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9822c(String str, Object[] objArr, C9829i iVar) {
                super(str, objArr);
                this.f17785b = iVar;
            }

            /* renamed from: c */
            public void mo24648c() {
                try {
                    C9808d.this.f17743r.mo39050a(this.f17785b);
                } catch (IOException unused) {
                    C9808d.this.m23544i();
                }
            }
        }

        C9819j(C9823e eVar) {
            super("OkHttp %s", C9808d.this.f17729d);
            this.f17780b = eVar;
        }

        /* renamed from: d */
        private void m23581d(C9829i iVar) {
            try {
                C9808d.this.f17733h.execute(new C9822c("OkHttp %s ACK Settings", new Object[]{C9808d.this.f17729d}, iVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: b */
        public void mo39034b(int i, long j) {
            C9808d dVar = C9808d.this;
            if (i == 0) {
                synchronized (dVar) {
                    C9808d dVar2 = C9808d.this;
                    dVar2.f17738m += j;
                    dVar2.notifyAll();
                }
                return;
            }
            C3527f k = dVar.mo39023k(i);
            if (k != null) {
                synchronized (k) {
                    k.mo24456c(j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r4.f17781c.mo39022h(r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24648c() {
            /*
                r4 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.e r1 = r4.f17780b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r1.mo39046d(r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
            L_0x0007:
                okhttp3.internal.http2.e r1 = r4.f17780b     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                r2 = 0
                boolean r1 = r1.mo39044c(r2, r4)     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x001e, all -> 0x001b }
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x001f }
                okhttp3.internal.http2.d r2 = okhttp3.internal.http2.C9808d.this     // Catch:{ IOException -> 0x0026 }
                r2.mo39022h(r1, r0)     // Catch:{ IOException -> 0x0026 }
                goto L_0x0026
            L_0x001b:
                r2 = move-exception
                r1 = r0
                goto L_0x002d
            L_0x001e:
                r1 = r0
            L_0x001f:
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x002c }
                okhttp3.internal.http2.d r1 = okhttp3.internal.http2.C9808d.this     // Catch:{ IOException -> 0x0026 }
                r1.mo39022h(r0, r0)     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                okhttp3.internal.http2.e r0 = r4.f17780b
                p056k5.C3300c.m8921f(r0)
                return
            L_0x002c:
                r2 = move-exception
            L_0x002d:
                okhttp3.internal.http2.d r3 = okhttp3.internal.http2.C9808d.this     // Catch:{ IOException -> 0x0032 }
                r3.mo39022h(r1, r0)     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                okhttp3.internal.http2.e r0 = r4.f17780b
                p056k5.C3300c.m8921f(r0)
                goto L_0x0039
            L_0x0038:
                throw r2
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9808d.C9819j.mo24648c():void");
        }

        /* renamed from: e */
        public void mo39035e(boolean z, int i, int i2) {
            if (z) {
                synchronized (C9808d.this) {
                    boolean unused = C9808d.this.f17736k = false;
                    C9808d.this.notifyAll();
                }
                return;
            }
            try {
                C9808d.this.f17733h.execute(new C9818i(true, i, i2));
            } catch (RejectedExecutionException unused2) {
            }
        }

        /* renamed from: g */
        public void mo39036g(int i, int i2, List<C9802a> list) {
            C9808d.this.mo39029z(i2, list);
        }

        /* renamed from: h */
        public void mo39037h() {
        }

        /* renamed from: i */
        public void mo39038i(boolean z, int i, C9838e eVar, int i2) {
            if (C9808d.this.mo39009B(i)) {
                C9808d.this.mo39027q(i, eVar, i2, z);
                return;
            }
            C3527f k = C9808d.this.mo39023k(i);
            if (k == null) {
                C9808d.this.mo39018T(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                C9808d.this.mo39014I(j);
                eVar.skip(j);
                return;
            }
            k.mo24467o(eVar, i2);
            if (z) {
                k.mo24468p();
            }
        }

        /* renamed from: j */
        public void mo39039j(int i, int i2, int i3, boolean z) {
        }

        /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo39040k(boolean r11, okhttp3.internal.http2.C9829i r12) {
            /*
                r10 = this;
                okhttp3.internal.http2.d r0 = okhttp3.internal.http2.C9808d.this
                monitor-enter(r0)
                okhttp3.internal.http2.d r1 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.i r1 = r1.f17740o     // Catch:{ all -> 0x008b }
                int r1 = r1.mo39069d()     // Catch:{ all -> 0x008b }
                if (r11 == 0) goto L_0x0014
                okhttp3.internal.http2.d r11 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.i r11 = r11.f17740o     // Catch:{ all -> 0x008b }
                r11.mo39066a()     // Catch:{ all -> 0x008b }
            L_0x0014:
                okhttp3.internal.http2.d r11 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.i r11 = r11.f17740o     // Catch:{ all -> 0x008b }
                r11.mo39073h(r12)     // Catch:{ all -> 0x008b }
                r10.m23581d(r12)     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.d r11 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.i r11 = r11.f17740o     // Catch:{ all -> 0x008b }
                int r11 = r11.mo39069d()     // Catch:{ all -> 0x008b }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x005b
                if (r11 == r1) goto L_0x005b
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.d r1 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                boolean r6 = r1.f17741p     // Catch:{ all -> 0x008b }
                if (r6 != 0) goto L_0x0039
                r1.f17741p = r4     // Catch:{ all -> 0x008b }
            L_0x0039:
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r1 = r1.f17728c     // Catch:{ all -> 0x008b }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008b }
                if (r1 != 0) goto L_0x005c
                okhttp3.internal.http2.d r1 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r1 = r1.f17728c     // Catch:{ all -> 0x008b }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.d r5 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r5 = r5.f17728c     // Catch:{ all -> 0x008b }
                int r5 = r5.size()     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.f[] r5 = new okhttp3.internal.http2.C3527f[r5]     // Catch:{ all -> 0x008b }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x008b }
                r5 = r1
                okhttp3.internal.http2.f[] r5 = (okhttp3.internal.http2.C3527f[]) r5     // Catch:{ all -> 0x008b }
                goto L_0x005c
            L_0x005b:
                r11 = r2
            L_0x005c:
                java.util.concurrent.ExecutorService r1 = okhttp3.internal.http2.C9808d.f17725u     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.d$j$b r6 = new okhttp3.internal.http2.d$j$b     // Catch:{ all -> 0x008b }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008b }
                okhttp3.internal.http2.d r8 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x008b }
                java.lang.String r8 = r8.f17729d     // Catch:{ all -> 0x008b }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x008b }
                r6.<init>(r7, r4)     // Catch:{ all -> 0x008b }
                r1.execute(r6)     // Catch:{ all -> 0x008b }
                monitor-exit(r0)     // Catch:{ all -> 0x008b }
                if (r5 == 0) goto L_0x008a
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x008a
                int r0 = r5.length
            L_0x007b:
                if (r9 >= r0) goto L_0x008a
                r1 = r5[r9]
                monitor-enter(r1)
                r1.mo24456c(r11)     // Catch:{ all -> 0x0087 }
                monitor-exit(r1)     // Catch:{ all -> 0x0087 }
                int r9 = r9 + 1
                goto L_0x007b
            L_0x0087:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0087 }
                throw r11
            L_0x008a:
                return
            L_0x008b:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008b }
                goto L_0x008f
            L_0x008e:
                throw r11
            L_0x008f:
                goto L_0x008e
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9808d.C9819j.mo39040k(boolean, okhttp3.internal.http2.i):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
            r0.mo24469q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            r0.mo24468p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo39041l(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.C9802a> r13) {
            /*
                r9 = this;
                okhttp3.internal.http2.d r12 = okhttp3.internal.http2.C9808d.this
                boolean r12 = r12.mo39009B(r11)
                if (r12 == 0) goto L_0x000e
                okhttp3.internal.http2.d r12 = okhttp3.internal.http2.C9808d.this
                r12.mo39028v(r11, r13, r10)
                return
            L_0x000e:
                okhttp3.internal.http2.d r12 = okhttp3.internal.http2.C9808d.this
                monitor-enter(r12)
                okhttp3.internal.http2.d r0 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x0077 }
                okhttp3.internal.http2.f r0 = r0.mo39023k(r11)     // Catch:{ all -> 0x0077 }
                if (r0 != 0) goto L_0x006d
                okhttp3.internal.http2.d r0 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x0077 }
                boolean r1 = r0.f17732g     // Catch:{ all -> 0x0077 }
                if (r1 == 0) goto L_0x0021
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                return
            L_0x0021:
                int r1 = r0.f17730e     // Catch:{ all -> 0x0077 }
                if (r11 > r1) goto L_0x0027
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                return
            L_0x0027:
                int r1 = r11 % 2
                int r0 = r0.f17731f     // Catch:{ all -> 0x0077 }
                r2 = 2
                int r0 = r0 % r2
                if (r1 != r0) goto L_0x0031
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                return
            L_0x0031:
                okhttp3.s r8 = p056k5.C3300c.m8913G(r13)     // Catch:{ all -> 0x0077 }
                okhttp3.internal.http2.f r13 = new okhttp3.internal.http2.f     // Catch:{ all -> 0x0077 }
                okhttp3.internal.http2.d r5 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x0077 }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0077 }
                okhttp3.internal.http2.d r10 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x0077 }
                r10.f17730e = r11     // Catch:{ all -> 0x0077 }
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r10 = r10.f17728c     // Catch:{ all -> 0x0077 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0077 }
                r10.put(r0, r13)     // Catch:{ all -> 0x0077 }
                java.util.concurrent.ExecutorService r10 = okhttp3.internal.http2.C9808d.f17725u     // Catch:{ all -> 0x0077 }
                okhttp3.internal.http2.d$j$a r0 = new okhttp3.internal.http2.d$j$a     // Catch:{ all -> 0x0077 }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
                r3 = 0
                okhttp3.internal.http2.d r4 = okhttp3.internal.http2.C9808d.this     // Catch:{ all -> 0x0077 }
                java.lang.String r4 = r4.f17729d     // Catch:{ all -> 0x0077 }
                r2[r3] = r4     // Catch:{ all -> 0x0077 }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0077 }
                r2[r3] = r11     // Catch:{ all -> 0x0077 }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x0077 }
                r10.execute(r0)     // Catch:{ all -> 0x0077 }
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                return
            L_0x006d:
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                r0.mo24469q(r13)
                if (r10 == 0) goto L_0x0076
                r0.mo24468p()
            L_0x0076:
                return
            L_0x0077:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x0077 }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9808d.C9819j.mo39041l(boolean, int, int, java.util.List):void");
        }

        /* renamed from: m */
        public void mo39042m(int i, ErrorCode errorCode) {
            if (C9808d.this.mo39009B(i)) {
                C9808d.this.mo39008A(i, errorCode);
                return;
            }
            C3527f D = C9808d.this.mo39010D(i);
            if (D != null) {
                D.mo24470r(errorCode);
            }
        }

        /* renamed from: n */
        public void mo39043n(int i, ErrorCode errorCode, ByteString byteString) {
            C3527f[] fVarArr;
            byteString.size();
            synchronized (C9808d.this) {
                fVarArr = (C3527f[]) C9808d.this.f17728c.values().toArray(new C3527f[C9808d.this.f17728c.size()]);
                C9808d.this.f17732g = true;
            }
            for (C3527f fVar : fVarArr) {
                if (fVar.mo24461i() > i && fVar.mo24464l()) {
                    fVar.mo24470r(ErrorCode.REFUSED_STREAM);
                    C9808d.this.mo39010D(fVar.mo24461i());
                }
            }
        }
    }

    static {
        Class<C9808d> cls = C9808d.class;
    }

    C9808d(C9815g gVar) {
        C9815g gVar2 = gVar;
        C9829i iVar = new C9829i();
        this.f17740o = iVar;
        this.f17741p = false;
        this.f17745t = new LinkedHashSet();
        this.f17735j = gVar2.f17772f;
        boolean z = gVar2.f17773g;
        this.f17726a = z;
        this.f17727b = gVar2.f17771e;
        int i = z ? 1 : 2;
        this.f17731f = i;
        if (z) {
            this.f17731f = i + 2;
        }
        if (z) {
            this.f17739n.mo39074i(7, 16777216);
        }
        String str = gVar2.f17768b;
        this.f17729d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C3300c.m8912F(C3300c.m8932q("OkHttp %s Writer", str), false));
        this.f17733h = scheduledThreadPoolExecutor;
        if (gVar2.f17774h != 0) {
            C9818i iVar2 = new C9818i(false, 0, 0);
            int i2 = gVar2.f17774h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar2, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f17734i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C3300c.m8912F(C3300c.m8932q("OkHttp %s Push Observer", str), true));
        iVar.mo39074i(7, SupportMenu.USER_MASK);
        iVar.mo39074i(5, 16384);
        this.f17738m = (long) iVar.mo39069d();
        this.f17742q = gVar2.f17767a;
        this.f17743r = new C9826g(gVar2.f17770d, z);
        this.f17744s = new C9819j(new C9823e(gVar2.f17769c, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m23544i() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            mo39022h(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.C3527f m23545n(int r11, java.util.List<okhttp3.internal.http2.C9802a> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.g r7 = r10.f17743r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f17731f     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.mo39011E(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f17732g     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f17731f     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f17731f = r0     // Catch:{ all -> 0x0073 }
            okhttp3.internal.http2.f r9 = new okhttp3.internal.http2.f     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f17738m     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f5729b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.mo24465m()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r0 = r10.f17728c     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            okhttp3.internal.http2.g r0 = r10.f17743r     // Catch:{ all -> 0x0076 }
            r0.mo39062l(r6, r8, r11, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f17726a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            okhttp3.internal.http2.g r0 = r10.f17743r     // Catch:{ all -> 0x0076 }
            r0.mo39058g(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            okhttp3.internal.http2.g r11 = r10.f17743r
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9808d.m23545n(int, java.util.List, boolean):okhttp3.internal.http2.f");
    }

    /* renamed from: s */
    private synchronized void m23546s(C9296b bVar) {
        if (!mo39024l()) {
            this.f17734i.execute(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo39008A(int i, ErrorCode errorCode) {
        m23546s(new C9814f("OkHttp %s Push Reset[%s]", new Object[]{this.f17729d, Integer.valueOf(i)}, i, errorCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo39009B(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized C3527f mo39010D(int i) {
        C3527f remove;
        remove = this.f17728c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: E */
    public void mo39011E(ErrorCode errorCode) {
        synchronized (this.f17743r) {
            synchronized (this) {
                if (!this.f17732g) {
                    this.f17732g = true;
                    int i = this.f17730e;
                    this.f17743r.mo39056f(i, errorCode, C3300c.f5332a);
                }
            }
        }
    }

    /* renamed from: G */
    public void mo39012G() {
        mo39013H(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo39013H(boolean z) {
        if (z) {
            this.f17743r.mo39047S();
            this.f17743r.mo39061k(this.f17739n);
            int d = this.f17739n.mo39069d();
            if (d != 65535) {
                this.f17743r.mo39051b(0, (long) (d - SupportMenu.USER_MASK));
            }
        }
        new Thread(this.f17744s).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public synchronized void mo39014I(long j) {
        long j2 = this.f17737l + j;
        this.f17737l = j2;
        if (j2 >= ((long) (this.f17739n.mo39069d() / 2))) {
            mo39019V(0, this.f17737l);
            this.f17737l = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f17743r.mo39049X0());
        r6 = (long) r3;
        r8.f17738m -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39015J(int r9, boolean r10, okio.C3564c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.g r12 = r8.f17743r
            r12.mo39048X(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f17738m     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.f> r3 = r8.f17728c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            okhttp3.internal.http2.g r3 = r8.f17743r     // Catch:{ all -> 0x0056 }
            int r3 = r3.mo39049X0()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f17738m     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f17738m = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            okhttp3.internal.http2.g r4 = r8.f17743r
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.mo39048X(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9808d.mo39015J(int, boolean, okio.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo39016N(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f17736k;
                this.f17736k = true;
            }
            if (z2) {
                m23544i();
                return;
            }
        }
        try {
            this.f17743r.mo39055e(z, i, i2);
        } catch (IOException unused) {
            m23544i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo39017P(int i, ErrorCode errorCode) {
        this.f17743r.mo39060i(i, errorCode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo39018T(int i, ErrorCode errorCode) {
        try {
            this.f17733h.execute(new C9809a("OkHttp %s stream %d", new Object[]{this.f17729d, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo39019V(int i, long j) {
        try {
            this.f17733h.execute(new C9810b("OkHttp Window Update %s stream %d", new Object[]{this.f17729d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void close() {
        mo39022h(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() {
        this.f17743r.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo39022h(ErrorCode errorCode, ErrorCode errorCode2) {
        C3527f[] fVarArr = null;
        try {
            mo39011E(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f17728c.isEmpty()) {
                fVarArr = (C3527f[]) this.f17728c.values().toArray(new C3527f[this.f17728c.size()]);
                this.f17728c.clear();
            }
        }
        if (fVarArr != null) {
            for (C3527f f : fVarArr) {
                try {
                    f.mo24459f(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f17743r.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f17742q.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f17733h.shutdown();
        this.f17734i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized C3527f mo39023k(int i) {
        return this.f17728c.get(Integer.valueOf(i));
    }

    /* renamed from: l */
    public synchronized boolean mo39024l() {
        return this.f17732g;
    }

    /* renamed from: m */
    public synchronized int mo39025m() {
        return this.f17740o.mo39070e(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: p */
    public C3527f mo39026p(List<C9802a> list, boolean z) {
        return m23545n(0, list, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo39027q(int i, C9838e eVar, int i2, boolean z) {
        C3564c cVar = new C3564c();
        long j = (long) i2;
        eVar.mo24742a1(j);
        eVar.mo24477R0(cVar, j);
        if (cVar.mo24758i1() == j) {
            m23546s(new C9813e("OkHttp %s Push Data[%s]", new Object[]{this.f17729d, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo24758i1() + " != " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo39028v(int i, List<C9802a> list, boolean z) {
        try {
            m23546s(new C9812d("OkHttp %s Push Headers[%s]", new Object[]{this.f17729d, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo39029z(int i, List<C9802a> list) {
        synchronized (this) {
            if (this.f17745t.contains(Integer.valueOf(i))) {
                mo39018T(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.f17745t.add(Integer.valueOf(i));
            try {
                m23546s(new C9811c("OkHttp %s Push Request[%s]", new Object[]{this.f17729d, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
