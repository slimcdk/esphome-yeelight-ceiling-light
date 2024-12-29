package p239z5;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.http.C9890d;
import org.eclipse.jetty.http.C9891e;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.p195io.Buffers;
import p147d6.C8942b;
import p152e6.C9001b;
import p152e6.C9003c;
import p167h6.C9095a;
import p167h6.C9096b;
import p172i6.C9127d;
import p225w5.C11949j;
import p225w5.C11950k;

/* renamed from: z5.a */
public abstract class C12149a extends C8942b implements C9890d, C12170f {
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final C9003c f22310Z = C9001b.m21450a(C12149a.class);

    /* renamed from: A */
    private String f22311A;

    /* renamed from: B */
    private String f22312B;

    /* renamed from: C */
    private boolean f22313C = true;
    /* access modifiers changed from: protected */

    /* renamed from: Q */
    public int f22314Q = 200000;

    /* renamed from: R */
    protected int f22315R = -1;

    /* renamed from: S */
    protected int f22316S = -1;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public transient Thread[] f22317T;

    /* renamed from: U */
    private final AtomicLong f22318U = new AtomicLong(-1);

    /* renamed from: V */
    private final C9095a f22319V = new C9095a();

    /* renamed from: W */
    private final C9096b f22320W = new C9096b();

    /* renamed from: X */
    private final C9096b f22321X = new C9096b();

    /* renamed from: Y */
    protected final C9891e f22322Y;

    /* renamed from: h */
    private String f22323h;

    /* renamed from: i */
    private C12187r f22324i;

    /* renamed from: j */
    private C9127d f22325j;

    /* renamed from: k */
    private String f22326k;

    /* renamed from: l */
    private int f22327l = 0;

    /* renamed from: m */
    private String f22328m = "https";

    /* renamed from: n */
    private int f22329n = 0;

    /* renamed from: o */
    private String f22330o = "https";

    /* renamed from: p */
    private int f22331p = 0;

    /* renamed from: q */
    private int f22332q = 0;

    /* renamed from: r */
    private int f22333r = 1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f22334s = 0;

    /* renamed from: t */
    private boolean f22335t;

    /* renamed from: u */
    private boolean f22336u;

    /* renamed from: v */
    private String f22337v;

    /* renamed from: w */
    private String f22338w = "X-Forwarded-Host";

    /* renamed from: x */
    private String f22339x = "X-Forwarded-Server";

    /* renamed from: y */
    private String f22340y = "X-Forwarded-For";

    /* renamed from: z */
    private String f22341z = "X-Forwarded-Proto";

    /* renamed from: z5.a$a */
    private class C12150a implements Runnable {

        /* renamed from: a */
        int f22342a = 0;

        C12150a(int i) {
            this.f22342a = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.setPriority(r1 - p239z5.C12149a.m31536Q0(r6.f22343b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
            if (r6.f22343b.isRunning() == false) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
            if (r6.f22343b.mo26541g() == null) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r6.f22343b.mo26538O0(r6.f22342a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            p239z5.C12149a.m31537R0().mo36856j(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
            r5 = p239z5.C12149a.m31537R0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
            r5 = p239z5.C12149a.m31537R0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
            r4 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
            r5 = p239z5.C12149a.m31537R0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            r0.setPriority(r1);
            r0.setName(r2);
            r4 = r6.f22343b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
            if (p239z5.C12149a.m31535P0(r6.f22343b) == null) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
            p239z5.C12149a.m31535P0(r6.f22343b)[r6.f22342a] = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
            r0.setPriority(r1);
            r0.setName(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            monitor-enter(r6.f22343b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
            if (p239z5.C12149a.m31535P0(r6.f22343b) != null) goto L_0x00c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
            p239z5.C12149a.m31535P0(r6.f22343b)[r6.f22342a] = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
            r1 = r0.getPriority();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                z5.a r1 = p239z5.C12149a.this
                monitor-enter(r1)
                z5.a r2 = p239z5.C12149a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f22317T     // Catch:{ all -> 0x00d4 }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                return
            L_0x0011:
                z5.a r2 = p239z5.C12149a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f22317T     // Catch:{ all -> 0x00d4 }
                int r3 = r6.f22342a     // Catch:{ all -> 0x00d4 }
                r2[r3] = r0     // Catch:{ all -> 0x00d4 }
                z5.a r2 = p239z5.C12149a.this     // Catch:{ all -> 0x00d4 }
                java.lang.Thread[] r2 = r2.f22317T     // Catch:{ all -> 0x00d4 }
                int r3 = r6.f22342a     // Catch:{ all -> 0x00d4 }
                r2 = r2[r3]     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00d4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r3.<init>()     // Catch:{ all -> 0x00d4 }
                r3.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = " Acceptor"
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                int r4 = r6.f22342a     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = " "
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                z5.a r4 = p239z5.C12149a.this     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d4 }
                r0.setName(r3)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                int r1 = r0.getPriority()
                r3 = 0
                z5.a r4 = p239z5.C12149a.this     // Catch:{ all -> 0x00b3 }
                int r4 = r4.f22334s     // Catch:{ all -> 0x00b3 }
                int r4 = r1 - r4
                r0.setPriority(r4)     // Catch:{ all -> 0x00b3 }
            L_0x005d:
                z5.a r4 = p239z5.C12149a.this     // Catch:{ all -> 0x00b3 }
                boolean r4 = r4.isRunning()     // Catch:{ all -> 0x00b3 }
                if (r4 == 0) goto L_0x0093
                z5.a r4 = p239z5.C12149a.this     // Catch:{ all -> 0x00b3 }
                java.lang.Object r4 = r4.mo26541g()     // Catch:{ all -> 0x00b3 }
                if (r4 == 0) goto L_0x0093
                z5.a r4 = p239z5.C12149a.this     // Catch:{ EofException -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                int r5 = r6.f22342a     // Catch:{ EofException -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                r4.mo26538O0(r5)     // Catch:{ EofException -> 0x008d, IOException -> 0x0087, InterruptedException -> 0x007e, all -> 0x0075 }
                goto L_0x005d
            L_0x0075:
                r4 = move-exception
                e6.c r5 = p239z5.C12149a.f22310Z     // Catch:{ all -> 0x00b3 }
                r5.mo36856j(r4)     // Catch:{ all -> 0x00b3 }
                goto L_0x005d
            L_0x007e:
                r4 = move-exception
                e6.c r5 = p239z5.C12149a.f22310Z     // Catch:{ all -> 0x00b3 }
            L_0x0083:
                r5.mo36849d(r4)     // Catch:{ all -> 0x00b3 }
                goto L_0x005d
            L_0x0087:
                r4 = move-exception
                e6.c r5 = p239z5.C12149a.f22310Z     // Catch:{ all -> 0x00b3 }
                goto L_0x0083
            L_0x008d:
                r4 = move-exception
                e6.c r5 = p239z5.C12149a.f22310Z     // Catch:{ all -> 0x00b3 }
                goto L_0x0083
            L_0x0093:
                r0.setPriority(r1)
                r0.setName(r2)
                z5.a r4 = p239z5.C12149a.this
                monitor-enter(r4)
                z5.a r0 = p239z5.C12149a.this     // Catch:{ all -> 0x00b0 }
                java.lang.Thread[] r0 = r0.f22317T     // Catch:{ all -> 0x00b0 }
                if (r0 == 0) goto L_0x00ae
                z5.a r0 = p239z5.C12149a.this     // Catch:{ all -> 0x00b0 }
                java.lang.Thread[] r0 = r0.f22317T     // Catch:{ all -> 0x00b0 }
                int r1 = r6.f22342a     // Catch:{ all -> 0x00b0 }
                r0[r1] = r3     // Catch:{ all -> 0x00b0 }
            L_0x00ae:
                monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
                return
            L_0x00b0:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
                throw r0
            L_0x00b3:
                r4 = move-exception
                r0.setPriority(r1)
                r0.setName(r2)
                z5.a r0 = p239z5.C12149a.this
                monitor-enter(r0)
                z5.a r1 = p239z5.C12149a.this     // Catch:{ all -> 0x00d1 }
                java.lang.Thread[] r1 = r1.f22317T     // Catch:{ all -> 0x00d1 }
                if (r1 == 0) goto L_0x00cf
                z5.a r1 = p239z5.C12149a.this     // Catch:{ all -> 0x00d1 }
                java.lang.Thread[] r1 = r1.f22317T     // Catch:{ all -> 0x00d1 }
                int r2 = r6.f22342a     // Catch:{ all -> 0x00d1 }
                r1[r2] = r3     // Catch:{ all -> 0x00d1 }
            L_0x00cf:
                monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
                throw r4
            L_0x00d1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d1 }
                throw r1
            L_0x00d4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
                goto L_0x00d8
            L_0x00d7:
                throw r0
            L_0x00d8:
                goto L_0x00d7
            */
            throw new UnsupportedOperationException("Method not decompiled: p239z5.C12149a.C12150a.run():void");
        }
    }

    public C12149a() {
        C9891e eVar = new C9891e();
        this.f22322Y = eVar;
        mo36753D0(eVar);
    }

    /* renamed from: B */
    public int mo42915B() {
        return this.f22331p;
    }

    /* renamed from: G */
    public void mo42916G(C11950k kVar) {
    }

    /* renamed from: H */
    public double mo42917H() {
        return this.f22320W.mo37116b();
    }

    /* renamed from: I */
    public double mo42918I() {
        return this.f22320W.mo37117c();
    }

    /* renamed from: J */
    public int mo42919J() {
        return (int) this.f22319V.mo37111e();
    }

    /* renamed from: K */
    public boolean mo42920K(C12181o oVar) {
        return this.f22336u && oVar.mo43090P().equalsIgnoreCase("https");
    }

    /* renamed from: L */
    public long mo42921L() {
        return this.f22321X.mo37115a();
    }

    /* renamed from: N */
    public boolean mo42922N() {
        C9127d dVar = this.f22325j;
        return dVar != null ? dVar.mo37187x() : this.f22324i.mo43174a1().mo37187x();
    }

    /* renamed from: O */
    public double mo42923O() {
        return this.f22321X.mo37116b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public abstract void mo26538O0(int i);

    /* renamed from: Q */
    public long mo42924Q() {
        return this.f22321X.mo37118d();
    }

    /* renamed from: R */
    public boolean mo42925R() {
        return this.f22318U.get() != -1;
    }

    /* renamed from: S */
    public String mo42926S() {
        return this.f22330o;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42927S0(p225w5.C11950k r8, p239z5.C12181o r9) {
        /*
            r7 = this;
            z5.b r8 = r9.mo43073E()
            org.eclipse.jetty.http.h r8 = r8.mo42995w()
            java.lang.String r0 = r7.mo42936Y0()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r7.mo42936Y0()
            java.lang.String r0 = r8.mo39802w(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "javax.servlet.request.cipher_suite"
            r9.mo41944b(r1, r0)
        L_0x001d:
            java.lang.String r0 = r7.mo42942d1()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r7.mo42942d1()
            java.lang.String r0 = r8.mo39802w(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = "javax.servlet.request.ssl_session_id"
            r9.mo41944b(r1, r0)
            java.lang.String r0 = "https"
            r9.mo43066A0(r0)
        L_0x0037:
            java.lang.String r0 = r7.mo42938a1()
            java.lang.String r0 = r7.mo42944e1(r8, r0)
            java.lang.String r1 = r7.mo42941c1()
            java.lang.String r1 = r7.mo42944e1(r8, r1)
            java.lang.String r2 = r7.mo42937Z0()
            java.lang.String r2 = r7.mo42944e1(r8, r2)
            java.lang.String r3 = r7.mo42939b1()
            java.lang.String r3 = r7.mo42944e1(r8, r3)
            java.lang.String r4 = r7.f22337v
            r5 = -1
            r6 = 0
            if (r4 == 0) goto L_0x006c
            w5.d r0 = org.eclipse.jetty.http.C9908k.f18085e
            r8.mo39779C(r0, r4)
        L_0x0062:
            r9.mo43068B0(r6)
            r9.mo43070C0(r5)
            r9.mo41952q()
            goto L_0x0079
        L_0x006c:
            if (r0 == 0) goto L_0x0074
            w5.d r1 = org.eclipse.jetty.http.C9908k.f18085e
            r8.mo39779C(r1, r0)
            goto L_0x0062
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r9.mo43068B0(r1)
        L_0x0079:
            if (r2 == 0) goto L_0x0097
            r9.mo43123v0(r2)
            boolean r8 = r7.f22335t
            if (r8 == 0) goto L_0x008d
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)     // Catch:{ UnknownHostException -> 0x0087 }
            goto L_0x008d
        L_0x0087:
            r8 = move-exception
            e6.c r0 = f22310Z
            r0.mo36849d(r8)
        L_0x008d:
            if (r6 != 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            java.lang.String r2 = r6.getHostName()
        L_0x0094:
            r9.mo43124w0(r2)
        L_0x0097:
            if (r3 == 0) goto L_0x009c
            r9.mo43066A0(r3)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12149a.mo42927S0(w5.k, z5.o):void");
    }

    /* renamed from: T */
    public int mo42928T() {
        return this.f22329n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo42929T0(Socket socket) {
        try {
            socket.setTcpNoDelay(true);
            int i = this.f22316S;
            if (i >= 0) {
                socket.setSoLinger(true, i / 1000);
            } else {
                socket.setSoLinger(false, 0);
            }
        } catch (Exception e) {
            f22310Z.mo36849d(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public void mo42930U0(C11949j jVar) {
        jVar.onClose();
        if (this.f22318U.get() != -1) {
            long currentTimeMillis = System.currentTimeMillis() - jVar.mo42446b();
            this.f22320W.mo37121g((long) (jVar instanceof C12151b ? ((C12151b) jVar).mo42996x() : 0));
            this.f22319V.mo37108b();
            this.f22321X.mo37121g(currentTimeMillis);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo42931V0(C11949j jVar) {
        if (this.f22318U.get() != -1) {
            this.f22319V.mo37112f();
        }
    }

    /* renamed from: W */
    public String mo42932W() {
        return this.f22326k;
    }

    /* renamed from: W0 */
    public int mo42933W0() {
        return this.f22332q;
    }

    /* renamed from: X */
    public Buffers mo39572X() {
        return this.f22322Y.mo39572X();
    }

    /* renamed from: X0 */
    public int mo42934X0() {
        return this.f22333r;
    }

    /* renamed from: Y */
    public double mo42935Y() {
        return this.f22321X.mo37117c();
    }

    /* renamed from: Y0 */
    public String mo42936Y0() {
        return this.f22311A;
    }

    /* renamed from: Z0 */
    public String mo42937Z0() {
        return this.f22340y;
    }

    /* renamed from: a1 */
    public String mo42938a1() {
        return this.f22338w;
    }

    /* renamed from: b1 */
    public String mo42939b1() {
        return this.f22341z;
    }

    /* renamed from: c */
    public C12187r mo42940c() {
        return this.f22324i;
    }

    /* renamed from: c1 */
    public String mo42941c1() {
        return this.f22339x;
    }

    /* renamed from: d1 */
    public String mo42942d1() {
        return this.f22312B;
    }

    /* renamed from: e0 */
    public long mo42943e0() {
        long j = this.f22318U.get();
        if (j != -1) {
            return System.currentTimeMillis() - j;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e1 */
    public String mo42944e1(C9895h hVar, String str) {
        String w;
        if (str == null || (w = hVar.mo39802w(str)) == null) {
            return null;
        }
        int indexOf = w.indexOf(44);
        return indexOf == -1 ? w : w.substring(0, indexOf);
    }

    /* renamed from: f */
    public int mo42945f() {
        return this.f22314Q;
    }

    /* renamed from: f1 */
    public int mo42946f1() {
        return this.f22315R;
    }

    /* renamed from: g1 */
    public int mo42947g1() {
        return this.f22327l;
    }

    public String getName() {
        if (this.f22323h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo42932W() == null ? "0.0.0.0" : mo42932W());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(mo26540e() <= 0 ? mo42947g1() : mo26540e());
            this.f22323h = sb.toString();
        }
        return this.f22323h;
    }

    /* renamed from: h1 */
    public boolean mo42949h1() {
        return this.f22313C;
    }

    /* renamed from: i */
    public void mo42950i(C12187r rVar) {
        this.f22324i = rVar;
    }

    /* renamed from: i1 */
    public C9127d mo42951i1() {
        return this.f22325j;
    }

    /* renamed from: j */
    public void mo26542j(C11950k kVar, C12181o oVar) {
        if (mo42953j1()) {
            mo42927S0(kVar, oVar);
        }
    }

    /* renamed from: j0 */
    public String mo42952j0() {
        return this.f22328m;
    }

    /* renamed from: j1 */
    public boolean mo42953j1() {
        return this.f22336u;
    }

    /* renamed from: k */
    public boolean mo42954k(C12181o oVar) {
        return false;
    }

    /* renamed from: k1 */
    public void mo42955k1(String str) {
        this.f22326k = str;
    }

    /* renamed from: l1 */
    public void mo42956l1(int i) {
        this.f22327l = i;
    }

    /* renamed from: m0 */
    public int mo42957m0() {
        return (int) this.f22320W.mo37118d();
    }

    /* renamed from: o0 */
    public int mo42958o0() {
        return (int) this.f22320W.mo37115a();
    }

    /* renamed from: q0 */
    public int mo42959q0() {
        return (int) this.f22319V.mo37109c();
    }

    /* renamed from: r0 */
    public Buffers mo39592r0() {
        return this.f22322Y.mo39592r0();
    }

    @Deprecated
    /* renamed from: s */
    public final int mo42960s() {
        return mo42946f1();
    }

    /* renamed from: t */
    public boolean mo42961t() {
        return this.f22335t;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = mo42932W() == null ? "0.0.0.0" : mo42932W();
        objArr[2] = Integer.valueOf(mo26540e() <= 0 ? mo42947g1() : mo26540e());
        return String.format("%s@%s:%d", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        if (this.f22324i != null) {
            open();
            if (this.f22325j == null) {
                C9127d a1 = this.f22324i.mo43174a1();
                this.f22325j = a1;
                mo36754E0(a1, false);
            }
            super.mo26547u0();
            synchronized (this) {
                this.f22317T = new Thread[mo42934X0()];
                int i = 0;
                while (i < this.f22317T.length) {
                    if (this.f22325j.mo37186h0(new C12150a(i))) {
                        i++;
                    } else {
                        throw new IllegalStateException("!accepting");
                    }
                }
                if (this.f22325j.mo37187x()) {
                    f22310Z.mo36847b("insufficient threads configured for {}", this);
                }
            }
            f22310Z.mo36855i("Started {}", this);
            return;
        }
        throw new IllegalStateException("No server");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        Thread[] threadArr;
        try {
            close();
        } catch (IOException e) {
            f22310Z.mo36856j(e);
        }
        super.mo26548v0();
        synchronized (this) {
            threadArr = this.f22317T;
            this.f22317T = null;
        }
        if (threadArr != null) {
            for (Thread thread : threadArr) {
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
    }

    /* renamed from: y */
    public int mo42963y() {
        return (int) this.f22319V.mo37110d();
    }
}
