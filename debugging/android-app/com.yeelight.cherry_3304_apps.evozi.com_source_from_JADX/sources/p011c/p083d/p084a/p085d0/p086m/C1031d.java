package p011c.p083d.p084a.p085d0.p086m;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
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
import p011c.p083d.p084a.C1143w;
import p011c.p083d.p084a.p085d0.C1013d;
import p011c.p083d.p084a.p085d0.C1015f;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p086m.C1028b;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;

/* renamed from: c.d.a.d0.m.d */
public final class C1031d implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final ExecutorService f1370w = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C1024k.m2106q("OkHttp FramedConnection", true));

    /* renamed from: a */
    final C1143w f1371a;

    /* renamed from: b */
    final boolean f1372b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1060k f1373c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<Integer, C1043e> f1374d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f1375e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f1376f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1377g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f1378h;

    /* renamed from: i */
    private long f1379i;

    /* renamed from: j */
    private final ExecutorService f1380j;

    /* renamed from: k */
    private Map<Integer, C1065m> f1381k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1066n f1382l;

    /* renamed from: m */
    long f1383m;

    /* renamed from: n */
    long f1384n;

    /* renamed from: o */
    final C1068o f1385o;

    /* renamed from: p */
    final C1068o f1386p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f1387q;

    /* renamed from: r */
    final C1072q f1388r;

    /* renamed from: s */
    final Socket f1389s;

    /* renamed from: t */
    final C1030c f1390t;

    /* renamed from: u */
    final C1040i f1391u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Set<Integer> f1392v;

    /* renamed from: c.d.a.d0.m.d$a */
    class C1032a extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1393b;

        /* renamed from: c */
        final /* synthetic */ C1027a f1394c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1032a(String str, Object[] objArr, int i, C1027a aVar) {
            super(str, objArr);
            this.f1393b = i;
            this.f1394c = aVar;
        }

        /* renamed from: b */
        public void mo9465b() {
            try {
                C1031d.this.mo9523y0(this.f1393b, this.f1394c);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$b */
    class C1033b extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1396b;

        /* renamed from: c */
        final /* synthetic */ long f1397c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1033b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f1396b = i;
            this.f1397c = j;
        }

        /* renamed from: b */
        public void mo9465b() {
            try {
                C1031d.this.f1390t.mo9502c(this.f1396b, this.f1397c);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$c */
    class C1034c extends C1015f {

        /* renamed from: b */
        final /* synthetic */ boolean f1399b;

        /* renamed from: c */
        final /* synthetic */ int f1400c;

        /* renamed from: d */
        final /* synthetic */ int f1401d;

        /* renamed from: e */
        final /* synthetic */ C1065m f1402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1034c(String str, Object[] objArr, boolean z, int i, int i2, C1065m mVar) {
            super(str, objArr);
            this.f1399b = z;
            this.f1400c = i;
            this.f1401d = i2;
            this.f1402e = mVar;
        }

        /* renamed from: b */
        public void mo9465b() {
            try {
                C1031d.this.m2165w0(this.f1399b, this.f1400c, this.f1401d, this.f1402e);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$d */
    class C1035d extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1404b;

        /* renamed from: c */
        final /* synthetic */ List f1405c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1035d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f1404b = i;
            this.f1405c = list;
        }

        /* renamed from: b */
        public void mo9465b() {
            if (C1031d.this.f1382l.mo9577a(this.f1404b, this.f1405c)) {
                try {
                    C1031d.this.f1390t.mo9506k(this.f1404b, C1027a.CANCEL);
                    synchronized (C1031d.this) {
                        C1031d.this.f1392v.remove(Integer.valueOf(this.f1404b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$e */
    class C1036e extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1407b;

        /* renamed from: c */
        final /* synthetic */ List f1408c;

        /* renamed from: d */
        final /* synthetic */ boolean f1409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1036e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f1407b = i;
            this.f1408c = list;
            this.f1409d = z;
        }

        /* renamed from: b */
        public void mo9465b() {
            boolean b = C1031d.this.f1382l.mo9578b(this.f1407b, this.f1408c, this.f1409d);
            if (b) {
                try {
                    C1031d.this.f1390t.mo9506k(this.f1407b, C1027a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f1409d) {
                synchronized (C1031d.this) {
                    C1031d.this.f1392v.remove(Integer.valueOf(this.f1407b));
                }
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$f */
    class C1037f extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1411b;

        /* renamed from: c */
        final /* synthetic */ C4406c f1412c;

        /* renamed from: d */
        final /* synthetic */ int f1413d;

        /* renamed from: e */
        final /* synthetic */ boolean f1414e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1037f(String str, Object[] objArr, int i, C4406c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f1411b = i;
            this.f1412c = cVar;
            this.f1413d = i2;
            this.f1414e = z;
        }

        /* renamed from: b */
        public void mo9465b() {
            try {
                boolean c = C1031d.this.f1382l.mo9579c(this.f1411b, this.f1412c, this.f1413d, this.f1414e);
                if (c) {
                    C1031d.this.f1390t.mo9506k(this.f1411b, C1027a.CANCEL);
                }
                if (c || this.f1414e) {
                    synchronized (C1031d.this) {
                        C1031d.this.f1392v.remove(Integer.valueOf(this.f1411b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$g */
    class C1038g extends C1015f {

        /* renamed from: b */
        final /* synthetic */ int f1416b;

        /* renamed from: c */
        final /* synthetic */ C1027a f1417c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1038g(String str, Object[] objArr, int i, C1027a aVar) {
            super(str, objArr);
            this.f1416b = i;
            this.f1417c = aVar;
        }

        /* renamed from: b */
        public void mo9465b() {
            C1031d.this.f1382l.mo9580d(this.f1416b, this.f1417c);
            synchronized (C1031d.this) {
                C1031d.this.f1392v.remove(Integer.valueOf(this.f1416b));
            }
        }
    }

    /* renamed from: c.d.a.d0.m.d$h */
    public static class C1039h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f1419a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Socket f1420b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1060k f1421c = C1060k.f1506a;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C1143w f1422d = C1143w.SPDY_3;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C1066n f1423e = C1066n.f1514a;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f1424f;

        public C1039h(String str, boolean z, Socket socket) {
            this.f1419a = str;
            this.f1424f = z;
            this.f1420b = socket;
        }

        /* renamed from: g */
        public C1031d mo9525g() {
            return new C1031d(this, (C1032a) null);
        }

        /* renamed from: h */
        public C1039h mo9526h(C1143w wVar) {
            this.f1422d = wVar;
            return this;
        }
    }

    /* renamed from: c.d.a.d0.m.d$i */
    class C1040i extends C1015f implements C1028b.C1029a {

        /* renamed from: b */
        C1028b f1425b;

        /* renamed from: c.d.a.d0.m.d$i$a */
        class C1041a extends C1015f {

            /* renamed from: b */
            final /* synthetic */ C1043e f1427b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1041a(String str, Object[] objArr, C1043e eVar) {
                super(str, objArr);
                this.f1427b = eVar;
            }

            /* renamed from: b */
            public void mo9465b() {
                try {
                    C1031d.this.f1373c.mo9570a(this.f1427b);
                } catch (IOException e) {
                    Logger logger = C1013d.f1320a;
                    Level level = Level.INFO;
                    logger.log(level, "StreamHandler failure for " + C1031d.this.f1375e, e);
                    try {
                        this.f1427b.mo9528l(C1027a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: c.d.a.d0.m.d$i$b */
        class C1042b extends C1015f {

            /* renamed from: b */
            final /* synthetic */ C1068o f1429b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1042b(String str, Object[] objArr, C1068o oVar) {
                super(str, objArr);
                this.f1429b = oVar;
            }

            /* renamed from: b */
            public void mo9465b() {
                try {
                    C1031d.this.f1390t.mo9508q0(this.f1429b);
                } catch (IOException unused) {
                }
            }
        }

        private C1040i() {
            super("OkHttp %s", C1031d.this.f1375e);
        }

        /* synthetic */ C1040i(C1031d dVar, C1032a aVar) {
            this();
        }

        /* renamed from: g */
        private void m2195g(C1068o oVar) {
            C1031d.f1370w.execute(new C1042b("OkHttp %s ACK Settings", new Object[]{C1031d.this.f1375e}, oVar));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r1 = p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR;
            r0 = p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r2 = r5.f1426c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9465b() {
            /*
                r5 = this;
                c.d.a.d0.m.a r0 = p011c.p083d.p084a.p085d0.p086m.C1027a.INTERNAL_ERROR
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.q r1 = r1.f1388r     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.d r2 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                java.net.Socket r2 = r2.f1389s     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                g.t r2 = p163g.C10843m.m27018m(r2)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                g.e r2 = p163g.C10843m.m27009d(r2)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.d r3 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                boolean r3 = r3.f1372b     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.b r1 = r1.mo9562a(r2, r3)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                r5.f1425b = r1     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.d r2 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                boolean r2 = r2.f1372b     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                if (r2 != 0) goto L_0x0025
                r1.mo9486A0()     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
            L_0x0025:
                c.d.a.d0.m.b r1 = r5.f1425b     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                boolean r1 = r1.mo9487G(r5)     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0025
            L_0x002e:
                c.d.a.d0.m.a r1 = p011c.p083d.p084a.p085d0.p086m.C1027a.NO_ERROR     // Catch:{ IOException -> 0x0038, all -> 0x0035 }
                c.d.a.d0.m.a r0 = p011c.p083d.p084a.p085d0.p086m.C1027a.CANCEL     // Catch:{ IOException -> 0x0039 }
                c.d.a.d0.m.d r2 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0042 }
                goto L_0x003f
            L_0x0035:
                r1 = move-exception
                r2 = r0
                goto L_0x004c
            L_0x0038:
                r1 = r0
            L_0x0039:
                c.d.a.d0.m.a r1 = p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR     // Catch:{ all -> 0x0048 }
                c.d.a.d0.m.a r0 = p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR     // Catch:{ all -> 0x0048 }
                c.d.a.d0.m.d r2 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0042 }
            L_0x003f:
                r2.m2145V(r1, r0)     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                c.d.a.d0.m.b r0 = r5.f1425b
                p011c.p083d.p084a.p085d0.C1024k.m2092c(r0)
                return
            L_0x0048:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x004c:
                c.d.a.d0.m.d r3 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ IOException -> 0x0051 }
                r3.m2145V(r2, r0)     // Catch:{ IOException -> 0x0051 }
            L_0x0051:
                c.d.a.d0.m.b r0 = r5.f1425b
                p011c.p083d.p084a.p085d0.C1024k.m2092c(r0)
                goto L_0x0058
            L_0x0057:
                throw r1
            L_0x0058:
                goto L_0x0057
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1031d.C1040i.mo9465b():void");
        }

        /* renamed from: c */
        public void mo9488c(int i, long j) {
            C1031d dVar = C1031d.this;
            if (i == 0) {
                synchronized (dVar) {
                    C1031d.this.f1384n += j;
                    C1031d.this.notifyAll();
                }
                return;
            }
            C1043e Z = dVar.mo9514Z(i);
            if (Z != null) {
                synchronized (Z) {
                    Z.mo9527i(j);
                }
            }
        }

        /* renamed from: d */
        public void mo9489d(boolean z, int i, int i2) {
            if (z) {
                C1065m J = C1031d.this.m2158m0(i);
                if (J != null) {
                    J.mo9575b();
                    return;
                }
                return;
            }
            C1031d.this.m2166x0(true, i, i2, (C1065m) null);
        }

        /* renamed from: e */
        public void mo9490e(int i, int i2, List<C1048f> list) {
            C1031d.this.m2151f0(i2, list);
        }

        /* renamed from: f */
        public void mo9491f() {
        }

        /* renamed from: k */
        public void mo9492k(int i, C1027a aVar) {
            if (C1031d.this.m2157k0(i)) {
                C1031d.this.m2156j0(i, aVar);
                return;
            }
            C1043e n0 = C1031d.this.mo9519n0(i);
            if (n0 != null) {
                n0.mo9540y(aVar);
            }
        }

        /* renamed from: l */
        public void mo9493l(boolean z, int i, C4410e eVar, int i2) {
            if (C1031d.this.m2157k0(i)) {
                C1031d.this.m2149d0(i, eVar, i2, z);
                return;
            }
            C1043e Z = C1031d.this.mo9514Z(i);
            if (Z == null) {
                C1031d.this.mo9524z0(i, C1027a.INVALID_STREAM);
                eVar.skip((long) i2);
                return;
            }
            Z.mo9537v(eVar, i2);
            if (z) {
                Z.mo9538w();
            }
        }

        /* renamed from: m */
        public void mo9494m(int i, int i2, int i3, boolean z) {
        }

        /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9495n(boolean r7, p011c.p083d.p084a.p085d0.p086m.C1068o r8) {
            /*
                r6 = this;
                c.d.a.d0.m.d r0 = p011c.p083d.p084a.p085d0.p086m.C1031d.this
                monitor-enter(r0)
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.o r1 = r1.f1386p     // Catch:{ all -> 0x0093 }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.mo9585e(r2)     // Catch:{ all -> 0x0093 }
                if (r7 == 0) goto L_0x0016
                c.d.a.d0.m.d r7 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.o r7 = r7.f1386p     // Catch:{ all -> 0x0093 }
                r7.mo9581a()     // Catch:{ all -> 0x0093 }
            L_0x0016:
                c.d.a.d0.m.d r7 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.o r7 = r7.f1386p     // Catch:{ all -> 0x0093 }
                r7.mo9589i(r8)     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.d r7 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                c.d.a.w r7 = r7.mo9513X()     // Catch:{ all -> 0x0093 }
                c.d.a.w r3 = p011c.p083d.p084a.C1143w.HTTP_2     // Catch:{ all -> 0x0093 }
                if (r7 != r3) goto L_0x002a
                r6.m2195g(r8)     // Catch:{ all -> 0x0093 }
            L_0x002a:
                c.d.a.d0.m.d r7 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.o r7 = r7.f1386p     // Catch:{ all -> 0x0093 }
                int r7 = r7.mo9585e(r2)     // Catch:{ all -> 0x0093 }
                r8 = -1
                r2 = 0
                r4 = 0
                if (r7 == r8) goto L_0x0079
                if (r7 == r1) goto L_0x0079
                int r7 = r7 - r1
                long r7 = (long) r7     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.f1387q     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x004f
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                r1.mo9511T(r7)     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                r5 = 1
                boolean unused = r1.f1387q = r5     // Catch:{ all -> 0x0093 }
            L_0x004f:
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f1374d     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x007a
                c.d.a.d0.m.d r1 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f1374d     // Catch:{ all -> 0x0093 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.d r4 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x0093 }
                java.util.Map r4 = r4.f1374d     // Catch:{ all -> 0x0093 }
                int r4 = r4.size()     // Catch:{ all -> 0x0093 }
                c.d.a.d0.m.e[] r4 = new p011c.p083d.p084a.p085d0.p086m.C1043e[r4]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ all -> 0x0093 }
                r4 = r1
                c.d.a.d0.m.e[] r4 = (p011c.p083d.p084a.p085d0.p086m.C1043e[]) r4     // Catch:{ all -> 0x0093 }
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
                r2.mo9527i(r7)     // Catch:{ all -> 0x008f }
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
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1031d.C1040i.mo9495n(boolean, c.d.a.d0.m.o):void");
        }

        /* renamed from: o */
        public void mo9496o(int i, C1027a aVar, C4411f fVar) {
            C1043e[] eVarArr;
            fVar.mo24297q();
            synchronized (C1031d.this) {
                eVarArr = (C1043e[]) C1031d.this.f1374d.values().toArray(new C1043e[C1031d.this.f1374d.size()]);
                boolean unused = C1031d.this.f1378h = true;
            }
            for (C1043e eVar : eVarArr) {
                if (eVar.mo9530o() > i && eVar.mo9534s()) {
                    eVar.mo9540y(C1027a.REFUSED_STREAM);
                    C1031d.this.mo9519n0(eVar.mo9530o());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
            if (r14.mo9553d() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            r0.mo9529n(p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR);
            r8.f1426c.mo9519n0(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
            r0.mo9539x(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            r0.mo9538w();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9497p(boolean r9, boolean r10, int r11, int r12, java.util.List<p011c.p083d.p084a.p085d0.p086m.C1048f> r13, p011c.p083d.p084a.p085d0.p086m.C1049g r14) {
            /*
                r8 = this;
                c.d.a.d0.m.d r12 = p011c.p083d.p084a.p085d0.p086m.C1031d.this
                boolean r12 = r12.m2157k0(r11)
                if (r12 == 0) goto L_0x000e
                c.d.a.d0.m.d r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.this
                r9.m2150e0(r11, r13, r10)
                return
            L_0x000e:
                c.d.a.d0.m.d r12 = p011c.p083d.p084a.p085d0.p086m.C1031d.this
                monitor-enter(r12)
                c.d.a.d0.m.d r0 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.f1378h     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                c.d.a.d0.m.d r0 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.e r0 = r0.mo9514Z(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.mo9552c()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                c.d.a.d0.m.d r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.a r10 = p011c.p083d.p084a.p085d0.p086m.C1027a.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.mo9524z0(r11, r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x0032:
                c.d.a.d0.m.d r14 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.f1376f     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                c.d.a.d0.m.d r0 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.f1377g     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                c.d.a.d0.m.e r14 = new c.d.a.d0.m.e     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.d r4 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.d r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.f1376f = r11     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.d r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.f1374d     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.f1370w     // Catch:{ all -> 0x00a5 }
                c.d.a.d0.m.d$i$a r10 = new c.d.a.d0.m.d$i$a     // Catch:{ all -> 0x00a5 }
                java.lang.String r13 = "OkHttp %s stream %d"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                r1 = 0
                c.d.a.d0.m.d r2 = p011c.p083d.p084a.p085d0.p086m.C1031d.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r2 = r2.f1375e     // Catch:{ all -> 0x00a5 }
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
                boolean r9 = r14.mo9553d()
                if (r9 == 0) goto L_0x009c
                c.d.a.d0.m.a r9 = p011c.p083d.p084a.p085d0.p086m.C1027a.PROTOCOL_ERROR
                r0.mo9529n(r9)
                c.d.a.d0.m.d r9 = p011c.p083d.p084a.p085d0.p086m.C1031d.this
                r9.mo9519n0(r11)
                return
            L_0x009c:
                r0.mo9539x(r13, r14)
                if (r10 == 0) goto L_0x00a4
                r0.mo9538w()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1031d.C1040i.mo9497p(boolean, boolean, int, int, java.util.List, c.d.a.d0.m.g):void");
        }
    }

    static {
        Class<C1031d> cls = C1031d.class;
    }

    private C1031d(C1039h hVar) {
        this.f1374d = new HashMap();
        this.f1379i = System.nanoTime();
        this.f1383m = 0;
        this.f1385o = new C1068o();
        this.f1386p = new C1068o();
        this.f1387q = false;
        this.f1392v = new LinkedHashSet();
        this.f1371a = hVar.f1422d;
        this.f1382l = hVar.f1423e;
        this.f1372b = hVar.f1424f;
        this.f1373c = hVar.f1421c;
        this.f1377g = hVar.f1424f ? 1 : 2;
        if (hVar.f1424f && this.f1371a == C1143w.HTTP_2) {
            this.f1377g += 2;
        }
        boolean c = hVar.f1424f;
        if (hVar.f1424f) {
            this.f1385o.mo9591k(7, 0, 16777216);
        }
        this.f1375e = hVar.f1419a;
        C1143w wVar = this.f1371a;
        if (wVar == C1143w.HTTP_2) {
            this.f1388r = new C1053i();
            this.f1380j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C1024k.m2106q(String.format("OkHttp %s Push Observer", new Object[]{this.f1375e}), true));
            this.f1386p.mo9591k(7, 0, SupportMenu.USER_MASK);
            this.f1386p.mo9591k(5, 0, 16384);
        } else if (wVar == C1143w.SPDY_3) {
            this.f1388r = new C1069p();
            this.f1380j = null;
        } else {
            throw new AssertionError(this.f1371a);
        }
        this.f1384n = (long) this.f1386p.mo9585e(65536);
        this.f1389s = hVar.f1420b;
        this.f1390t = this.f1388r.mo9563b(C10843m.m27008c(C10843m.m27014i(hVar.f1420b)), this.f1372b);
        this.f1391u = new C1040i(this, (C1032a) null);
        new Thread(this.f1391u).start();
    }

    /* synthetic */ C1031d(C1039h hVar, C1032a aVar) {
        this(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m2145V(C1027a aVar, C1027a aVar2) {
        int i;
        C1043e[] eVarArr;
        C1065m[] mVarArr = null;
        try {
            mo9521u0(aVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f1374d.isEmpty()) {
                eVarArr = (C1043e[]) this.f1374d.values().toArray(new C1043e[this.f1374d.size()]);
                this.f1374d.clear();
                m2161r0(false);
            } else {
                eVarArr = null;
            }
            if (this.f1381k != null) {
                this.f1381k = null;
                mVarArr = (C1065m[]) this.f1381k.values().toArray(new C1065m[this.f1381k.size()]);
            }
        }
        if (eVarArr != null) {
            for (C1043e l : eVarArr) {
                try {
                    l.mo9528l(aVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (mVarArr != null) {
            for (C1065m a : mVarArr) {
                a.mo9574a();
            }
        }
        try {
            this.f1390t.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f1389s.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: b0 */
    private C1043e m2148b0(int i, List<C1048f> list, boolean z, boolean z2) {
        int i2;
        C1043e eVar;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.f1390t) {
            synchronized (this) {
                if (!this.f1378h) {
                    i2 = this.f1377g;
                    this.f1377g += 2;
                    eVar = new C1043e(i2, this, z3, z4, list);
                    if (eVar.mo9535t()) {
                        this.f1374d.put(Integer.valueOf(i2), eVar);
                        m2161r0(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i == 0) {
                this.f1390t.mo9500W0(z3, z4, i2, i, list);
            } else if (!this.f1372b) {
                this.f1390t.mo9504e(i, i2, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z) {
            this.f1390t.flush();
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m2149d0(int i, C4410e eVar, int i2, boolean z) {
        C4406c cVar = new C4406c();
        long j = (long) i2;
        eVar.mo24218X0(j);
        eVar.mo9541P0(cVar, j);
        if (cVar.mo24233g1() == j) {
            this.f1380j.execute(new C1037f("OkHttp %s Push Data[%s]", new Object[]{this.f1375e, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo24233g1() + " != " + i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m2150e0(int i, List<C1048f> list, boolean z) {
        this.f1380j.execute(new C1036e("OkHttp %s Push Headers[%s]", new Object[]{this.f1375e, Integer.valueOf(i)}, i, list, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m2151f0(int i, List<C1048f> list) {
        synchronized (this) {
            if (this.f1392v.contains(Integer.valueOf(i))) {
                mo9524z0(i, C1027a.PROTOCOL_ERROR);
                return;
            }
            this.f1392v.add(Integer.valueOf(i));
            this.f1380j.execute(new C1035d("OkHttp %s Push Request[%s]", new Object[]{this.f1375e, Integer.valueOf(i)}, i, list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m2156j0(int i, C1027a aVar) {
        this.f1380j.execute(new C1038g("OkHttp %s Push Reset[%s]", new Object[]{this.f1375e, Integer.valueOf(i)}, i, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public boolean m2157k0(int i) {
        return this.f1371a == C1143w.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public synchronized C1065m m2158m0(int i) {
        return this.f1381k != null ? this.f1381k.remove(Integer.valueOf(i)) : null;
    }

    /* renamed from: r0 */
    private synchronized void m2161r0(boolean z) {
        long j;
        if (z) {
            try {
                j = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = Long.MAX_VALUE;
        }
        this.f1379i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m2165w0(boolean z, int i, int i2, C1065m mVar) {
        synchronized (this.f1390t) {
            if (mVar != null) {
                mVar.mo9576c();
            }
            this.f1390t.mo9503d(z, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m2166x0(boolean z, int i, int i2, C1065m mVar) {
        f1370w.execute(new C1034c("OkHttp %s ping %08x%08x", new Object[]{this.f1375e, Integer.valueOf(i), Integer.valueOf(i2)}, z, i, i2, mVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo9510B0(int i, long j) {
        f1370w.execute(new C1033b("OkHttp Window Update %s stream %d", new Object[]{this.f1375e, Integer.valueOf(i)}, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo9511T(long j) {
        this.f1384n += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: W */
    public synchronized long mo9512W() {
        return this.f1379i;
    }

    /* renamed from: X */
    public C1143w mo9513X() {
        return this.f1371a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public synchronized C1043e mo9514Z(int i) {
        return this.f1374d.get(Integer.valueOf(i));
    }

    /* renamed from: a0 */
    public synchronized boolean mo9515a0() {
        return this.f1379i != Long.MAX_VALUE;
    }

    /* renamed from: c0 */
    public C1043e mo9516c0(List<C1048f> list, boolean z, boolean z2) {
        return m2148b0(0, list, z, z2);
    }

    public void close() {
        m2145V(C1027a.NO_ERROR, C1027a.CANCEL);
    }

    public void flush() {
        this.f1390t.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public synchronized C1043e mo9519n0(int i) {
        C1043e remove;
        remove = this.f1374d.remove(Integer.valueOf(i));
        if (remove != null && this.f1374d.isEmpty()) {
            m2161r0(true);
        }
        notifyAll();
        return remove;
    }

    /* renamed from: o0 */
    public void mo9520o0() {
        this.f1390t.mo9509y();
        this.f1390t.mo9501a1(this.f1385o);
        int e = this.f1385o.mo9585e(65536);
        if (e != 65536) {
            this.f1390t.mo9502c(0, (long) (e - 65536));
        }
    }

    /* renamed from: u0 */
    public void mo9521u0(C1027a aVar) {
        synchronized (this.f1390t) {
            synchronized (this) {
                if (!this.f1378h) {
                    this.f1378h = true;
                    int i = this.f1376f;
                    this.f1390t.mo9507q(i, aVar, C1024k.f1343a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f1384n), r8.f1390t.mo9499V0());
        r6 = (long) r3;
        r8.f1384n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9522v0(int r9, boolean r10, p163g.C4406c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            c.d.a.d0.m.c r12 = r8.f1390t
            r12.mo9498A(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0062
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f1384n     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, c.d.a.d0.m.e> r3 = r8.f1374d     // Catch:{ InterruptedException -> 0x005a }
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
            long r3 = r8.f1384n     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            c.d.a.d0.m.c r3 = r8.f1390t     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo9499V0()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f1384n     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f1384n = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            c.d.a.d0.m.c r4 = r8.f1390t
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo9498A(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0060
        L_0x005a:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0060:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1031d.mo9522v0(int, boolean, g.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo9523y0(int i, C1027a aVar) {
        this.f1390t.mo9506k(i, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo9524z0(int i, C1027a aVar) {
        f1370w.submit(new C1032a("OkHttp %s stream %d", new Object[]{this.f1375e, Integer.valueOf(i)}, i, aVar));
    }
}
