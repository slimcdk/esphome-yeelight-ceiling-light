package p236z2;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.location.LocationRequestCompat;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.C3564c;
import okio.C9838e;
import okio.C9845l;
import p231y2.C12022d;
import p231y2.C12024f;
import p231y2.C12033k;
import p236z2.C12097a;

/* renamed from: z2.c */
public final class C12100c implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final ExecutorService f22156w = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C12033k.m31057q("OkHttp FramedConnection", true));

    /* renamed from: a */
    final Protocol f22157a;

    /* renamed from: b */
    final boolean f22158b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12128i f22159c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<Integer, C12112d> f22160d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f22161e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f22162f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f22163g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f22164h;

    /* renamed from: i */
    private long f22165i;

    /* renamed from: j */
    private final ExecutorService f22166j;

    /* renamed from: k */
    private Map<Integer, C12133k> f22167k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12134l f22168l;

    /* renamed from: m */
    long f22169m;

    /* renamed from: n */
    long f22170n;

    /* renamed from: o */
    final C12136m f22171o;

    /* renamed from: p */
    final C12136m f22172p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f22173q;

    /* renamed from: r */
    final C12140o f22174r;

    /* renamed from: s */
    final Socket f22175s;

    /* renamed from: t */
    final C12099b f22176t;

    /* renamed from: u */
    final C12109i f22177u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Set<Integer> f22178v;

    /* renamed from: z2.c$a */
    class C12101a extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22179b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f22180c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12101a(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f22179b = i;
            this.f22180c = errorCode;
        }

        /* renamed from: c */
        public void mo27856c() {
            try {
                C12100c.this.mo42851z0(this.f22179b, this.f22180c);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: z2.c$b */
    class C12102b extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22182b;

        /* renamed from: c */
        final /* synthetic */ long f22183c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12102b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f22182b = i;
            this.f22183c = j;
        }

        /* renamed from: c */
        public void mo27856c() {
            try {
                C12100c.this.f22176t.mo42829b(this.f22182b, this.f22183c);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: z2.c$c */
    class C12103c extends C12024f {

        /* renamed from: b */
        final /* synthetic */ boolean f22185b;

        /* renamed from: c */
        final /* synthetic */ int f22186c;

        /* renamed from: d */
        final /* synthetic */ int f22187d;

        /* renamed from: e */
        final /* synthetic */ C12133k f22188e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12103c(String str, Object[] objArr, boolean z, int i, int i2, C12133k kVar) {
            super(str, objArr);
            this.f22185b = z;
            this.f22186c = i;
            this.f22187d = i2;
            this.f22188e = kVar;
        }

        /* renamed from: c */
        public void mo27856c() {
            try {
                C12100c.this.m31295x0(this.f22185b, this.f22186c, this.f22187d, this.f22188e);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: z2.c$d */
    class C12104d extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22190b;

        /* renamed from: c */
        final /* synthetic */ List f22191c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12104d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f22190b = i;
            this.f22191c = list;
        }

        /* renamed from: c */
        public void mo27856c() {
            if (C12100c.this.f22168l.mo42896a(this.f22190b, this.f22191c)) {
                try {
                    C12100c.this.f22176t.mo42834o(this.f22190b, ErrorCode.CANCEL);
                    synchronized (C12100c.this) {
                        C12100c.this.f22178v.remove(Integer.valueOf(this.f22190b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: z2.c$e */
    class C12105e extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22193b;

        /* renamed from: c */
        final /* synthetic */ List f22194c;

        /* renamed from: d */
        final /* synthetic */ boolean f22195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12105e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f22193b = i;
            this.f22194c = list;
            this.f22195d = z;
        }

        /* renamed from: c */
        public void mo27856c() {
            boolean b = C12100c.this.f22168l.mo42897b(this.f22193b, this.f22194c, this.f22195d);
            if (b) {
                try {
                    C12100c.this.f22176t.mo42834o(this.f22193b, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f22195d) {
                synchronized (C12100c.this) {
                    C12100c.this.f22178v.remove(Integer.valueOf(this.f22193b));
                }
            }
        }
    }

    /* renamed from: z2.c$f */
    class C12106f extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22197b;

        /* renamed from: c */
        final /* synthetic */ C3564c f22198c;

        /* renamed from: d */
        final /* synthetic */ int f22199d;

        /* renamed from: e */
        final /* synthetic */ boolean f22200e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12106f(String str, Object[] objArr, int i, C3564c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f22197b = i;
            this.f22198c = cVar;
            this.f22199d = i2;
            this.f22200e = z;
        }

        /* renamed from: c */
        public void mo27856c() {
            try {
                boolean c = C12100c.this.f22168l.mo42898c(this.f22197b, this.f22198c, this.f22199d, this.f22200e);
                if (c) {
                    C12100c.this.f22176t.mo42834o(this.f22197b, ErrorCode.CANCEL);
                }
                if (c || this.f22200e) {
                    synchronized (C12100c.this) {
                        C12100c.this.f22178v.remove(Integer.valueOf(this.f22197b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: z2.c$g */
    class C12107g extends C12024f {

        /* renamed from: b */
        final /* synthetic */ int f22202b;

        /* renamed from: c */
        final /* synthetic */ ErrorCode f22203c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12107g(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.f22202b = i;
            this.f22203c = errorCode;
        }

        /* renamed from: c */
        public void mo27856c() {
            C12100c.this.f22168l.mo42899d(this.f22202b, this.f22203c);
            synchronized (C12100c.this) {
                C12100c.this.f22178v.remove(Integer.valueOf(this.f22202b));
            }
        }
    }

    /* renamed from: z2.c$h */
    public static class C12108h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f22205a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Socket f22206b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C12128i f22207c = C12128i.f22288a;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Protocol f22208d = Protocol.SPDY_3;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C12134l f22209e = C12134l.f22296a;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f22210f;

        public C12108h(String str, boolean z, Socket socket) {
            this.f22205a = str;
            this.f22210f = z;
            this.f22206b = socket;
        }

        /* renamed from: g */
        public C12100c mo42852g() {
            return new C12100c(this, (C12101a) null);
        }

        /* renamed from: h */
        public C12108h mo42853h(Protocol protocol) {
            this.f22208d = protocol;
            return this;
        }
    }

    /* renamed from: z2.c$i */
    class C12109i extends C12024f implements C12097a.C12098a {

        /* renamed from: b */
        C12097a f22211b;

        /* renamed from: z2.c$i$a */
        class C12110a extends C12024f {

            /* renamed from: b */
            final /* synthetic */ C12112d f22213b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12110a(String str, Object[] objArr, C12112d dVar) {
                super(str, objArr);
                this.f22213b = dVar;
            }

            /* renamed from: c */
            public void mo27856c() {
                try {
                    C12100c.this.f22159c.mo42889a(this.f22213b);
                } catch (IOException e) {
                    Logger logger = C12022d.f22042a;
                    Level level = Level.INFO;
                    logger.log(level, "StreamHandler failure for " + C12100c.this.f22161e, e);
                    try {
                        this.f22213b.mo42855l(ErrorCode.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: z2.c$i$b */
        class C12111b extends C12024f {

            /* renamed from: b */
            final /* synthetic */ C12136m f22215b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12111b(String str, Object[] objArr, C12136m mVar) {
                super(str, objArr);
                this.f22215b = mVar;
            }

            /* renamed from: c */
            public void mo27856c() {
                try {
                    C12100c.this.f22176t.mo42835x(this.f22215b);
                } catch (IOException unused) {
                }
            }
        }

        private C12109i() {
            super("OkHttp %s", C12100c.this.f22161e);
        }

        /* synthetic */ C12109i(C12100c cVar, C12101a aVar) {
            this();
        }

        /* renamed from: d */
        private void m31326d(C12136m mVar) {
            C12100c.f22156w.execute(new C12111b("OkHttp %s ACK Settings", new Object[]{C12100c.this.f22161e}, mVar));
        }

        /* renamed from: b */
        public void mo42815b(int i, long j) {
            C12100c cVar = C12100c.this;
            if (i == 0) {
                synchronized (cVar) {
                    C12100c cVar2 = C12100c.this;
                    cVar2.f22170n += j;
                    cVar2.notifyAll();
                }
                return;
            }
            C12112d V = cVar.mo42842V(i);
            if (V != null) {
                synchronized (V) {
                    V.mo42854i(j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            p236z2.C12100c.m31273a(r5.f22212c, r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003a */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo27856c() {
            /*
                r5 = this;
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.INTERNAL_ERROR
                z2.c r1 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                z2.o r2 = r1.f22174r     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                java.net.Socket r1 = r1.f22175s     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                okio.r r1 = okio.C9845l.m23747m(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                okio.e r1 = okio.C9845l.m23738d(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                z2.c r3 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r3 = r3.f22158b     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                z2.a r1 = r2.mo42881a(r1, r3)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                r5.f22211b = r1     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                z2.c r2 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r2 = r2.f22158b     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                if (r2 != 0) goto L_0x0023
                r1.mo42814C0()     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            L_0x0023:
                z2.a r1 = r5.f22211b     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r1 = r1.mo42813C(r5)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                if (r1 == 0) goto L_0x002c
                goto L_0x0023
            L_0x002c:
                com.squareup.okhttp.internal.framed.ErrorCode r1 = com.squareup.okhttp.internal.framed.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003a }
                z2.c r2 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0041 }
                r2.m31272N(r1, r0)     // Catch:{ IOException -> 0x0041 }
                goto L_0x0041
            L_0x0036:
                r1 = move-exception
                r2 = r0
                goto L_0x004b
            L_0x0039:
                r1 = r0
            L_0x003a:
                com.squareup.okhttp.internal.framed.ErrorCode r0 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0047 }
                z2.c r1 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0041 }
                r1.m31272N(r0, r0)     // Catch:{ IOException -> 0x0041 }
            L_0x0041:
                z2.a r0 = r5.f22211b
                p231y2.C12033k.m31043c(r0)
                return
            L_0x0047:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x004b:
                z2.c r3 = p236z2.C12100c.this     // Catch:{ IOException -> 0x0050 }
                r3.m31272N(r2, r0)     // Catch:{ IOException -> 0x0050 }
            L_0x0050:
                z2.a r0 = r5.f22211b
                p231y2.C12033k.m31043c(r0)
                goto L_0x0057
            L_0x0056:
                throw r1
            L_0x0057:
                goto L_0x0056
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12100c.C12109i.mo27856c():void");
        }

        /* renamed from: e */
        public void mo42816e(boolean z, int i, int i2) {
            if (z) {
                C12133k A = C12100c.this.m31289o0(i);
                if (A != null) {
                    A.mo42894b();
                    return;
                }
                return;
            }
            C12100c.this.m31296y0(true, i, i2, (C12133k) null);
        }

        /* renamed from: g */
        public void mo42817g(int i, int i2, List<C12117e> list) {
            C12100c.this.m31281h0(i2, list);
        }

        /* renamed from: h */
        public void mo42818h() {
        }

        /* renamed from: i */
        public void mo42819i(boolean z, int i, C9838e eVar, int i2) {
            if (C12100c.this.m31285k0(i)) {
                C12100c.this.m31278f0(i, eVar, i2, z);
                return;
            }
            C12112d V = C12100c.this.mo42842V(i);
            if (V == null) {
                C12100c.this.mo42837A0(i, ErrorCode.INVALID_STREAM);
                eVar.skip((long) i2);
                return;
            }
            V.mo42864v(eVar, i2);
            if (z) {
                V.mo42865w();
            }
        }

        /* renamed from: j */
        public void mo42820j(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: o */
        public void mo42821o(int i, ErrorCode errorCode) {
            if (C12100c.this.m31285k0(i)) {
                C12100c.this.m31283j0(i, errorCode);
                return;
            }
            C12112d p0 = C12100c.this.mo42847p0(i);
            if (p0 != null) {
                p0.mo42867y(errorCode);
            }
        }

        /* renamed from: q */
        public void mo42822q(int i, ErrorCode errorCode, ByteString byteString) {
            C12112d[] dVarArr;
            byteString.size();
            synchronized (C12100c.this) {
                dVarArr = (C12112d[]) C12100c.this.f22160d.values().toArray(new C12112d[C12100c.this.f22160d.size()]);
                boolean unused = C12100c.this.f22164h = true;
            }
            for (C12112d dVar : dVarArr) {
                if (dVar.mo42857o() > i && dVar.mo42861s()) {
                    dVar.mo42867y(ErrorCode.REFUSED_STREAM);
                    C12100c.this.mo42847p0(dVar.mo42857o());
                }
            }
        }

        /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42823r(boolean r7, p236z2.C12136m r8) {
            /*
                r6 = this;
                z2.c r0 = p236z2.C12100c.this
                monitor-enter(r0)
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                z2.m r1 = r1.f22172p     // Catch:{ all -> 0x0093 }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.mo42904e(r2)     // Catch:{ all -> 0x0093 }
                if (r7 == 0) goto L_0x0016
                z2.c r7 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                z2.m r7 = r7.f22172p     // Catch:{ all -> 0x0093 }
                r7.mo42900a()     // Catch:{ all -> 0x0093 }
            L_0x0016:
                z2.c r7 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                z2.m r7 = r7.f22172p     // Catch:{ all -> 0x0093 }
                r7.mo42908i(r8)     // Catch:{ all -> 0x0093 }
                z2.c r7 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                com.squareup.okhttp.Protocol r7 = r7.mo42841T()     // Catch:{ all -> 0x0093 }
                com.squareup.okhttp.Protocol r3 = com.squareup.okhttp.Protocol.HTTP_2     // Catch:{ all -> 0x0093 }
                if (r7 != r3) goto L_0x002a
                r6.m31326d(r8)     // Catch:{ all -> 0x0093 }
            L_0x002a:
                z2.c r7 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                z2.m r7 = r7.f22172p     // Catch:{ all -> 0x0093 }
                int r7 = r7.mo42904e(r2)     // Catch:{ all -> 0x0093 }
                r8 = -1
                r2 = 0
                r4 = 0
                if (r7 == r8) goto L_0x0079
                if (r7 == r1) goto L_0x0079
                int r7 = r7 - r1
                long r7 = (long) r7     // Catch:{ all -> 0x0093 }
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.f22173q     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x004f
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                r1.mo42839J(r7)     // Catch:{ all -> 0x0093 }
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                r5 = 1
                boolean unused = r1.f22173q = r5     // Catch:{ all -> 0x0093 }
            L_0x004f:
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f22160d     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x007a
                z2.c r1 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f22160d     // Catch:{ all -> 0x0093 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0093 }
                z2.c r4 = p236z2.C12100c.this     // Catch:{ all -> 0x0093 }
                java.util.Map r4 = r4.f22160d     // Catch:{ all -> 0x0093 }
                int r4 = r4.size()     // Catch:{ all -> 0x0093 }
                z2.d[] r4 = new p236z2.C12112d[r4]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ all -> 0x0093 }
                r4 = r1
                z2.d[] r4 = (p236z2.C12112d[]) r4     // Catch:{ all -> 0x0093 }
                goto L_0x007a
            L_0x0079:
                r7 = r2
            L_0x007a:
                monitor-exit(r0)     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x0092
                int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x0092
                int r0 = r4.length
                r1 = 0
            L_0x0083:
                if (r1 >= r0) goto L_0x0092
                r2 = r4[r1]
                monitor-enter(r2)
                r2.mo42854i(r7)     // Catch:{ all -> 0x008f }
                monitor-exit(r2)     // Catch:{ all -> 0x008f }
                int r1 = r1 + 1
                goto L_0x0083
            L_0x008f:
                r7 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x008f }
                throw r7
            L_0x0092:
                return
            L_0x0093:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0093 }
                goto L_0x0097
            L_0x0096:
                throw r7
            L_0x0097:
                goto L_0x0096
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12100c.C12109i.mo42823r(boolean, z2.m):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
            if (r14.failIfStreamPresent() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            r0.mo42856n(com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR);
            r8.f22212c.mo42847p0(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
            r0.mo42866x(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            r0.mo42865w();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42824s(boolean r9, boolean r10, int r11, int r12, java.util.List<p236z2.C12117e> r13, com.squareup.okhttp.internal.framed.HeadersMode r14) {
            /*
                r8 = this;
                z2.c r12 = p236z2.C12100c.this
                boolean r12 = r12.m31285k0(r11)
                if (r12 == 0) goto L_0x000e
                z2.c r9 = p236z2.C12100c.this
                r9.m31279g0(r11, r13, r10)
                return
            L_0x000e:
                z2.c r12 = p236z2.C12100c.this
                monitor-enter(r12)
                z2.c r0 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.f22164h     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                z2.c r0 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                z2.d r0 = r0.mo42842V(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.failIfStreamAbsent()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                z2.c r9 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                com.squareup.okhttp.internal.framed.ErrorCode r10 = com.squareup.okhttp.internal.framed.ErrorCode.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.mo42837A0(r11, r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x0032:
                z2.c r14 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.f22162f     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                z2.c r0 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.f22163g     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                z2.d r14 = new z2.d     // Catch:{ all -> 0x00a5 }
                z2.c r4 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                z2.c r9 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.f22162f = r11     // Catch:{ all -> 0x00a5 }
                z2.c r9 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.f22160d     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = p236z2.C12100c.f22156w     // Catch:{ all -> 0x00a5 }
                z2.c$i$a r10 = new z2.c$i$a     // Catch:{ all -> 0x00a5 }
                java.lang.String r13 = "OkHttp %s stream %d"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                r1 = 0
                z2.c r2 = p236z2.C12100c.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r2 = r2.f22161e     // Catch:{ all -> 0x00a5 }
                r0[r1] = r2     // Catch:{ all -> 0x00a5 }
                r1 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r0[r1] = r11     // Catch:{ all -> 0x00a5 }
                r10.<init>(r13, r0, r14)     // Catch:{ all -> 0x00a5 }
                r9.execute(r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x008a:
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                boolean r9 = r14.failIfStreamPresent()
                if (r9 == 0) goto L_0x009c
                com.squareup.okhttp.internal.framed.ErrorCode r9 = com.squareup.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                r0.mo42856n(r9)
                z2.c r9 = p236z2.C12100c.this
                r9.mo42847p0(r11)
                return
            L_0x009c:
                r0.mo42866x(r13, r14)
                if (r10 == 0) goto L_0x00a4
                r0.mo42865w()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p236z2.C12100c.C12109i.mo42824s(boolean, boolean, int, int, java.util.List, com.squareup.okhttp.internal.framed.HeadersMode):void");
        }
    }

    static {
        Class<C12100c> cls = C12100c.class;
    }

    private C12100c(C12108h hVar) {
        this.f22160d = new HashMap();
        this.f22165i = System.nanoTime();
        this.f22169m = 0;
        C12136m mVar = new C12136m();
        this.f22171o = mVar;
        C12136m mVar2 = new C12136m();
        this.f22172p = mVar2;
        this.f22173q = false;
        this.f22178v = new LinkedHashSet();
        Protocol a = hVar.f22208d;
        this.f22157a = a;
        this.f22168l = hVar.f22209e;
        boolean c = hVar.f22210f;
        this.f22158b = c;
        this.f22159c = hVar.f22207c;
        this.f22163g = hVar.f22210f ? 1 : 2;
        if (hVar.f22210f && a == Protocol.HTTP_2) {
            this.f22163g += 2;
        }
        boolean unused = hVar.f22210f;
        if (hVar.f22210f) {
            mVar.mo42910k(7, 0, 16777216);
        }
        String e = hVar.f22205a;
        this.f22161e = e;
        if (a == Protocol.HTTP_2) {
            this.f22174r = new C12121g();
            this.f22166j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C12033k.m31057q(String.format("OkHttp %s Push Observer", new Object[]{e}), true));
            mVar2.mo42910k(7, 0, SupportMenu.USER_MASK);
            mVar2.mo42910k(5, 0, 16384);
        } else if (a == Protocol.SPDY_3) {
            this.f22174r = new C12137n();
            this.f22166j = null;
        } else {
            throw new AssertionError(a);
        }
        this.f22170n = (long) mVar2.mo42904e(65536);
        this.f22175s = hVar.f22206b;
        this.f22176t = this.f22174r.mo42882b(C9845l.m23737c(C9845l.m23743i(hVar.f22206b)), c);
        C12109i iVar = new C12109i(this, (C12101a) null);
        this.f22177u = iVar;
        new Thread(iVar).start();
    }

    /* synthetic */ C12100c(C12108h hVar, C12101a aVar) {
        this(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m31272N(ErrorCode errorCode, ErrorCode errorCode2) {
        int i;
        C12112d[] dVarArr;
        C12133k[] kVarArr = null;
        try {
            mo42849v0(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f22160d.isEmpty()) {
                dVarArr = (C12112d[]) this.f22160d.values().toArray(new C12112d[this.f22160d.size()]);
                this.f22160d.clear();
                m31293u0(false);
            } else {
                dVarArr = null;
            }
            Map<Integer, C12133k> map = this.f22167k;
            if (map != null) {
                this.f22167k = null;
                kVarArr = (C12133k[]) map.values().toArray(new C12133k[this.f22167k.size()]);
            }
        }
        if (dVarArr != null) {
            for (C12112d l : dVarArr) {
                try {
                    l.mo42855l(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (kVarArr != null) {
            for (C12133k a : kVarArr) {
                a.mo42893a();
            }
        }
        try {
            this.f22176t.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f22175s.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: c0 */
    private C12112d m31275c0(int i, List<C12117e> list, boolean z, boolean z2) {
        int i2;
        C12112d dVar;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.f22176t) {
            synchronized (this) {
                if (!this.f22164h) {
                    i2 = this.f22163g;
                    this.f22163g = i2 + 2;
                    dVar = new C12112d(i2, this, z3, z4, list);
                    if (dVar.mo42862t()) {
                        this.f22160d.put(Integer.valueOf(i2), dVar);
                        m31293u0(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i == 0) {
                this.f22176t.mo42828Y0(z3, z4, i2, i, list);
            } else if (!this.f22158b) {
                this.f22176t.mo42833g(i, i2, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z) {
            this.f22176t.flush();
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m31278f0(int i, C9838e eVar, int i2, boolean z) {
        C3564c cVar = new C3564c();
        long j = (long) i2;
        eVar.mo24742a1(j);
        eVar.mo24477R0(cVar, j);
        if (cVar.mo24758i1() == j) {
            this.f22166j.execute(new C12106f("OkHttp %s Push Data[%s]", new Object[]{this.f22161e, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo24758i1() + " != " + i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m31279g0(int i, List<C12117e> list, boolean z) {
        this.f22166j.execute(new C12105e("OkHttp %s Push Headers[%s]", new Object[]{this.f22161e, Integer.valueOf(i)}, i, list, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m31281h0(int i, List<C12117e> list) {
        synchronized (this) {
            if (this.f22178v.contains(Integer.valueOf(i))) {
                mo42837A0(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.f22178v.add(Integer.valueOf(i));
            this.f22166j.execute(new C12104d("OkHttp %s Push Request[%s]", new Object[]{this.f22161e, Integer.valueOf(i)}, i, list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m31283j0(int i, ErrorCode errorCode) {
        this.f22166j.execute(new C12107g("OkHttp %s Push Reset[%s]", new Object[]{this.f22161e, Integer.valueOf(i)}, i, errorCode));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public boolean m31285k0(int i) {
        return this.f22157a == Protocol.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public synchronized C12133k m31289o0(int i) {
        Map<Integer, C12133k> map;
        map = this.f22167k;
        return map != null ? map.remove(Integer.valueOf(i)) : null;
    }

    /* renamed from: u0 */
    private synchronized void m31293u0(boolean z) {
        long j;
        if (z) {
            try {
                j = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        this.f22165i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m31295x0(boolean z, int i, int i2, C12133k kVar) {
        synchronized (this.f22176t) {
            if (kVar != null) {
                kVar.mo42895c();
            }
            this.f22176t.mo42830e(z, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m31296y0(boolean z, int i, int i2, C12133k kVar) {
        f22156w.execute(new C12103c("OkHttp %s ping %08x%08x", new Object[]{this.f22161e, Integer.valueOf(i), Integer.valueOf(i2)}, z, i, i2, kVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo42837A0(int i, ErrorCode errorCode) {
        f22156w.submit(new C12101a("OkHttp %s stream %d", new Object[]{this.f22161e, Integer.valueOf(i)}, i, errorCode));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo42838D0(int i, long j) {
        f22156w.execute(new C12102b("OkHttp Window Update %s stream %d", new Object[]{this.f22161e, Integer.valueOf(i)}, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo42839J(long j) {
        this.f22170n += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: P */
    public synchronized long mo42840P() {
        return this.f22165i;
    }

    /* renamed from: T */
    public Protocol mo42841T() {
        return this.f22157a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public synchronized C12112d mo42842V(int i) {
        return this.f22160d.get(Integer.valueOf(i));
    }

    /* renamed from: W */
    public synchronized boolean mo42843W() {
        return this.f22165i != LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public void close() {
        m31272N(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* renamed from: d0 */
    public C12112d mo42845d0(List<C12117e> list, boolean z, boolean z2) {
        return m31275c0(0, list, z, z2);
    }

    public void flush() {
        this.f22176t.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public synchronized C12112d mo42847p0(int i) {
        C12112d remove;
        remove = this.f22160d.remove(Integer.valueOf(i));
        if (remove != null && this.f22160d.isEmpty()) {
            m31293u0(true);
        }
        notifyAll();
        return remove;
    }

    /* renamed from: r0 */
    public void mo42848r0() {
        this.f22176t.mo42825S();
        this.f22176t.mo42831e0(this.f22171o);
        int e = this.f22171o.mo42904e(65536);
        if (e != 65536) {
            this.f22176t.mo42829b(0, (long) (e - 65536));
        }
    }

    /* renamed from: v0 */
    public void mo42849v0(ErrorCode errorCode) {
        synchronized (this.f22176t) {
            synchronized (this) {
                if (!this.f22164h) {
                    this.f22164h = true;
                    int i = this.f22162f;
                    this.f22176t.mo42836y(i, errorCode, C12033k.f22065a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f22176t.mo42827X0());
        r6 = (long) r3;
        r8.f22170n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42850w0(int r9, boolean r10, okio.C3564c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            z2.b r12 = r8.f22176t
            r12.mo42826X(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f22170n     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, z2.d> r3 = r8.f22160d     // Catch:{ InterruptedException -> 0x0058 }
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
            z2.b r3 = r8.f22176t     // Catch:{ all -> 0x0056 }
            int r3 = r3.mo42827X0()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f22170n     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f22170n = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            z2.b r4 = r8.f22176t
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.mo42826X(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x005e
        L_0x0058:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x005e:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236z2.C12100c.mo42850w0(int, boolean, okio.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo42851z0(int i, ErrorCode errorCode) {
        this.f22176t.mo42834o(i, errorCode);
    }
}
