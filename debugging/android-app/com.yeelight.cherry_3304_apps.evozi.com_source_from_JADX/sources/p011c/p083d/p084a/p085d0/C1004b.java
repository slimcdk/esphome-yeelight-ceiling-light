package p011c.p083d.p084a.p085d0;

import com.miot.service.manager.timer.TimerCodec;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.commons.p271io.FilenameUtils;
import p011c.p083d.p084a.p085d0.p088o.C1106a;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.b */
public final class C1004b implements Closeable {

    /* renamed from: s */
    static final Pattern f1280s = Pattern.compile("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final C4415s f1281t = new C1007c();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1106a f1282a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f1283b;

    /* renamed from: c */
    private final File f1284c;

    /* renamed from: d */
    private final File f1285d;

    /* renamed from: e */
    private final File f1286e;

    /* renamed from: f */
    private final int f1287f;

    /* renamed from: g */
    private long f1288g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f1289h;

    /* renamed from: i */
    private long f1290i = 0;

    /* renamed from: j */
    private C4409d f1291j;

    /* renamed from: k */
    private final LinkedHashMap<String, C1010e> f1292k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1293l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f1294m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f1295n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f1296o;

    /* renamed from: p */
    private long f1297p = 0;

    /* renamed from: q */
    private final Executor f1298q;

    /* renamed from: r */
    private final Runnable f1299r = new C1005a();

    /* renamed from: c.d.a.d0.b$a */
    class C1005a implements Runnable {
        C1005a() {
        }

        public void run() {
            synchronized (C1004b.this) {
                if (!(!C1004b.this.f1295n) && !C1004b.this.f1296o) {
                    try {
                        C1004b.this.m1991d0();
                        if (C1004b.this.m1982T()) {
                            C1004b.this.m1988a0();
                            int unused = C1004b.this.f1293l = 0;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* renamed from: c.d.a.d0.b$b */
    class C1006b extends C1012c {
        static {
            Class<C1004b> cls = C1004b.class;
        }

        C1006b(C4415s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9439a(IOException iOException) {
            boolean unused = C1004b.this.f1294m = true;
        }
    }

    /* renamed from: c.d.a.d0.b$c */
    static class C1007c implements C4415s {
        C1007c() {
        }

        public void close() {
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return C4417u.f7967d;
        }

        public void flush() {
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            cVar.skip(j);
        }
    }

    /* renamed from: c.d.a.d0.b$d */
    public final class C1008d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1010e f1302a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f1303b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f1304c;

        /* renamed from: c.d.a.d0.b$d$a */
        class C1009a extends C1012c {
            C1009a(C4415s sVar) {
                super(sVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo9439a(IOException iOException) {
                synchronized (C1004b.this) {
                    boolean unused = C1008d.this.f1304c = true;
                }
            }
        }

        private C1008d(C1010e eVar) {
            this.f1302a = eVar;
            this.f1303b = eVar.f1311e ? null : new boolean[C1004b.this.f1289h];
        }

        /* synthetic */ C1008d(C1004b bVar, C1010e eVar, C1005a aVar) {
            this(eVar);
        }

        /* renamed from: a */
        public void mo9443a() {
            synchronized (C1004b.this) {
                C1004b.this.m1979J(this, false);
            }
        }

        /* renamed from: e */
        public void mo9444e() {
            synchronized (C1004b.this) {
                if (this.f1304c) {
                    C1004b.this.m1979J(this, false);
                    boolean unused = C1004b.this.m1990c0(this.f1302a);
                } else {
                    C1004b.this.m1979J(this, true);
                }
            }
        }

        /* renamed from: f */
        public C4415s mo9445f(int i) {
            C1009a aVar;
            synchronized (C1004b.this) {
                if (this.f1302a.f1312f == this) {
                    if (!this.f1302a.f1311e) {
                        this.f1303b[i] = true;
                    }
                    try {
                        aVar = new C1009a(C1004b.this.f1282a.mo9659b(this.f1302a.f1310d[i]));
                    } catch (FileNotFoundException unused) {
                        return C1004b.f1281t;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }
    }

    /* renamed from: c.d.a.d0.b$e */
    private final class C1010e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f1307a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f1308b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final File[] f1309c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final File[] f1310d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f1311e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C1008d f1312f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f1313g;

        private C1010e(String str) {
            this.f1307a = str;
            this.f1308b = new long[C1004b.this.f1289h];
            this.f1309c = new File[C1004b.this.f1289h];
            this.f1310d = new File[C1004b.this.f1289h];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i = 0; i < C1004b.this.f1289h; i++) {
                sb.append(i);
                this.f1309c[i] = new File(C1004b.this.f1283b, sb.toString());
                sb.append(".tmp");
                this.f1310d[i] = new File(C1004b.this.f1283b, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ C1010e(C1004b bVar, String str, C1005a aVar) {
            this(str);
        }

        /* renamed from: l */
        private IOException m2028l(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m2029m(String[] strArr) {
            if (strArr.length == C1004b.this.f1289h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f1308b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m2028l(strArr);
                        throw null;
                    }
                }
                return;
            }
            m2028l(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C1011f mo9446n() {
            if (Thread.holdsLock(C1004b.this)) {
                C4416t[] tVarArr = new C4416t[C1004b.this.f1289h];
                long[] jArr = (long[]) this.f1308b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C1004b.this.f1289h) {
                    try {
                        tVarArr[i2] = C1004b.this.f1282a.mo9658a(this.f1309c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C1004b.this.f1289h && tVarArr[i] != null) {
                            C1024k.m2092c(tVarArr[i]);
                            i++;
                        }
                        return null;
                    }
                }
                return new C1011f(C1004b.this, this.f1307a, this.f1313g, tVarArr, jArr, (C1005a) null);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo9447o(C4409d dVar) {
            for (long Z0 : this.f1308b) {
                dVar.mo24217U(32).mo24220Z0(Z0);
            }
        }
    }

    /* renamed from: c.d.a.d0.b$f */
    public final class C1011f implements Closeable {

        /* renamed from: a */
        private final String f1315a;

        /* renamed from: b */
        private final long f1316b;

        /* renamed from: c */
        private final C4416t[] f1317c;

        private C1011f(String str, long j, C4416t[] tVarArr, long[] jArr) {
            this.f1315a = str;
            this.f1316b = j;
            this.f1317c = tVarArr;
        }

        /* synthetic */ C1011f(C1004b bVar, String str, long j, C4416t[] tVarArr, long[] jArr, C1005a aVar) {
            this(str, j, tVarArr, jArr);
        }

        /* renamed from: a */
        public C1008d mo9448a() {
            return C1004b.this.m1981Q(this.f1315a, this.f1316b);
        }

        /* renamed from: b */
        public C4416t mo9449b(int i) {
            return this.f1317c[i];
        }

        public void close() {
            for (C4416t c : this.f1317c) {
                C1024k.m2092c(c);
            }
        }
    }

    static {
        Class<C1004b> cls = C1004b.class;
    }

    C1004b(C1106a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f1282a = aVar;
        this.f1283b = file;
        this.f1287f = i;
        this.f1284c = new File(file, "journal");
        this.f1285d = new File(file, "journal.tmp");
        this.f1286e = new File(file, "journal.bkp");
        this.f1289h = i2;
        this.f1288g = j;
        this.f1298q = executor;
    }

    /* renamed from: I */
    private synchronized void m1978I() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m1979J(p011c.p083d.p084a.p085d0.C1004b.C1008d r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            c.d.a.d0.b$e r0 = r10.f1302a     // Catch:{ all -> 0x0118 }
            c.d.a.d0.b$d r1 = r0.f1312f     // Catch:{ all -> 0x0118 }
            if (r1 != r10) goto L_0x0112
            r1 = 0
            if (r11 == 0) goto L_0x0051
            boolean r2 = r0.f1311e     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0051
            r2 = 0
        L_0x0015:
            int r3 = r9.f1289h     // Catch:{ all -> 0x0118 }
            if (r2 >= r3) goto L_0x0051
            boolean[] r3 = r10.f1303b     // Catch:{ all -> 0x0118 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x0037
            c.d.a.d0.o.a r3 = r9.f1282a     // Catch:{ all -> 0x0118 }
            java.io.File[] r4 = r0.f1310d     // Catch:{ all -> 0x0118 }
            r4 = r4[r2]     // Catch:{ all -> 0x0118 }
            boolean r3 = r3.mo9661d(r4)     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x0034
            r10.mo9443a()     // Catch:{ all -> 0x0118 }
            monitor-exit(r9)
            return
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0037:
            r10.mo9443a()     // Catch:{ all -> 0x0118 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r11.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0118 }
            r11.append(r2)     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0118 }
            r10.<init>(r11)     // Catch:{ all -> 0x0118 }
            throw r10     // Catch:{ all -> 0x0118 }
        L_0x0051:
            int r10 = r9.f1289h     // Catch:{ all -> 0x0118 }
            if (r1 >= r10) goto L_0x0091
            java.io.File[] r10 = r0.f1310d     // Catch:{ all -> 0x0118 }
            r10 = r10[r1]     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x0089
            c.d.a.d0.o.a r2 = r9.f1282a     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.mo9661d(r10)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x008e
            java.io.File[] r2 = r0.f1309c     // Catch:{ all -> 0x0118 }
            r2 = r2[r1]     // Catch:{ all -> 0x0118 }
            c.d.a.d0.o.a r3 = r9.f1282a     // Catch:{ all -> 0x0118 }
            r3.mo9662e(r10, r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.f1308b     // Catch:{ all -> 0x0118 }
            r3 = r10[r1]     // Catch:{ all -> 0x0118 }
            c.d.a.d0.o.a r10 = r9.f1282a     // Catch:{ all -> 0x0118 }
            long r5 = r10.mo9665h(r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.f1308b     // Catch:{ all -> 0x0118 }
            r10[r1] = r5     // Catch:{ all -> 0x0118 }
            long r7 = r9.f1290i     // Catch:{ all -> 0x0118 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f1290i = r7     // Catch:{ all -> 0x0118 }
            goto L_0x008e
        L_0x0089:
            c.d.a.d0.o.a r2 = r9.f1282a     // Catch:{ all -> 0x0118 }
            r2.mo9663f(r10)     // Catch:{ all -> 0x0118 }
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0091:
            int r10 = r9.f1293l     // Catch:{ all -> 0x0118 }
            r1 = 1
            int r10 = r10 + r1
            r9.f1293l = r10     // Catch:{ all -> 0x0118 }
            r10 = 0
            p011c.p083d.p084a.p085d0.C1004b.C1008d unused = r0.f1312f = r10     // Catch:{ all -> 0x0118 }
            boolean r10 = r0.f1311e     // Catch:{ all -> 0x0118 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00d4
            boolean unused = r0.f1311e = r1     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "CLEAN"
            g.d r10 = r10.mo24232g0(r1)     // Catch:{ all -> 0x0118 }
            r10.mo24217U(r3)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r0.f1307a     // Catch:{ all -> 0x0118 }
            r10.mo24232g0(r1)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            r0.mo9447o(r10)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            r10.mo24217U(r2)     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x00f6
            long r10 = r9.f1297p     // Catch:{ all -> 0x0118 }
            r1 = 1
            long r1 = r1 + r10
            r9.f1297p = r1     // Catch:{ all -> 0x0118 }
            long unused = r0.f1313g = r10     // Catch:{ all -> 0x0118 }
            goto L_0x00f6
        L_0x00d4:
            java.util.LinkedHashMap<java.lang.String, c.d.a.d0.b$e> r10 = r9.f1292k     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.f1307a     // Catch:{ all -> 0x0118 }
            r10.remove(r11)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = "REMOVE"
            g.d r10 = r10.mo24232g0(r11)     // Catch:{ all -> 0x0118 }
            r10.mo24217U(r3)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.f1307a     // Catch:{ all -> 0x0118 }
            r10.mo24232g0(r11)     // Catch:{ all -> 0x0118 }
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            r10.mo24217U(r2)     // Catch:{ all -> 0x0118 }
        L_0x00f6:
            g.d r10 = r9.f1291j     // Catch:{ all -> 0x0118 }
            r10.flush()     // Catch:{ all -> 0x0118 }
            long r10 = r9.f1290i     // Catch:{ all -> 0x0118 }
            long r0 = r9.f1288g     // Catch:{ all -> 0x0118 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0109
            boolean r10 = r9.m1982T()     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x0110
        L_0x0109:
            java.util.concurrent.Executor r10 = r9.f1298q     // Catch:{ all -> 0x0118 }
            java.lang.Runnable r11 = r9.f1299r     // Catch:{ all -> 0x0118 }
            r10.execute(r11)     // Catch:{ all -> 0x0118 }
        L_0x0110:
            monitor-exit(r9)
            return
        L_0x0112:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0118 }
            r10.<init>()     // Catch:{ all -> 0x0118 }
            throw r10     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x011c
        L_0x011b:
            throw r10
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.C1004b.m1979J(c.d.a.d0.b$d, boolean):void");
    }

    /* renamed from: K */
    public static C1004b m1980K(C1106a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C1004b(aVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C1024k.m2106q("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return null;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p011c.p083d.p084a.p085d0.C1004b.C1008d m1981Q(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo9434S()     // Catch:{ all -> 0x0067 }
            r5.m1978I()     // Catch:{ all -> 0x0067 }
            r5.m1992e0(r6)     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, c.d.a.d0.b$e> r0 = r5.f1292k     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0067 }
            c.d.a.d0.b$e r0 = (p011c.p083d.p084a.p085d0.C1004b.C1010e) r0     // Catch:{ all -> 0x0067 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0023
            long r1 = r0.f1313g     // Catch:{ all -> 0x0067 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0025
        L_0x0023:
            monitor-exit(r5)
            return r3
        L_0x0025:
            if (r0 == 0) goto L_0x002f
            c.d.a.d0.b$d r7 = r0.f1312f     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x002f
            monitor-exit(r5)
            return r3
        L_0x002f:
            g.d r7 = r5.f1291j     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "DIRTY"
            g.d r7 = r7.mo24232g0(r8)     // Catch:{ all -> 0x0067 }
            r8 = 32
            g.d r7 = r7.mo24217U(r8)     // Catch:{ all -> 0x0067 }
            g.d r7 = r7.mo24232g0(r6)     // Catch:{ all -> 0x0067 }
            r8 = 10
            r7.mo24217U(r8)     // Catch:{ all -> 0x0067 }
            g.d r7 = r5.f1291j     // Catch:{ all -> 0x0067 }
            r7.flush()     // Catch:{ all -> 0x0067 }
            boolean r7 = r5.f1294m     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0051
            monitor-exit(r5)
            return r3
        L_0x0051:
            if (r0 != 0) goto L_0x005d
            c.d.a.d0.b$e r0 = new c.d.a.d0.b$e     // Catch:{ all -> 0x0067 }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, c.d.a.d0.b$e> r7 = r5.f1292k     // Catch:{ all -> 0x0067 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0067 }
        L_0x005d:
            c.d.a.d0.b$d r6 = new c.d.a.d0.b$d     // Catch:{ all -> 0x0067 }
            r6.<init>(r5, r0, r3)     // Catch:{ all -> 0x0067 }
            p011c.p083d.p084a.p085d0.C1004b.C1008d unused = r0.f1312f = r6     // Catch:{ all -> 0x0067 }
            monitor-exit(r5)
            return r6
        L_0x0067:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.C1004b.m1981Q(java.lang.String, long):c.d.a.d0.b$d");
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public boolean m1982T() {
        int i = this.f1293l;
        return i >= 2000 && i >= this.f1292k.size();
    }

    /* renamed from: V */
    private C4409d m1983V() {
        return C10843m.m27008c(new C1006b(this.f1282a.mo9664g(this.f1284c)));
    }

    /* renamed from: W */
    private void m1984W() {
        this.f1282a.mo9663f(this.f1285d);
        Iterator<C1010e> it = this.f1292k.values().iterator();
        while (it.hasNext()) {
            C1010e next = it.next();
            int i = 0;
            if (next.f1312f == null) {
                while (i < this.f1289h) {
                    this.f1290i += next.f1308b[i];
                    i++;
                }
            } else {
                C1008d unused = next.f1312f = null;
                while (i < this.f1289h) {
                    this.f1282a.mo9663f(next.f1309c[i]);
                    this.f1282a.mo9663f(next.f1310d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f1293l = r0 - r9.f1292k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo24274x() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        m1988a0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f1291j = m1983V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1985X() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            c.d.a.d0.o.a r1 = r9.f1282a
            java.io.File r2 = r9.f1284c
            g.t r1 = r1.mo9658a(r2)
            g.e r1 = p163g.C10843m.m27009d(r1)
            java.lang.String r2 = r1.mo24203C0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.mo24203C0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.mo24203C0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.mo24203C0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.mo24203C0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.f1287f     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f1289h     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo24203C0()     // Catch:{ EOFException -> 0x005d }
            r9.m1986Z(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, c.d.a.d0.b$e> r2 = r9.f1292k     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f1293l = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo24274x()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.m1988a0()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            g.d r0 = r9.m1983V()     // Catch:{ all -> 0x00a8 }
            r9.f1291j = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            p011c.p083d.p084a.p085d0.C1024k.m2092c(r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r7.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a8 }
            r7.append(r2)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r3)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r5)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a8 }
            throw r4     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            p011c.p083d.p084a.p085d0.C1024k.m2092c(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.C1004b.m1985X():void");
    }

    /* renamed from: Z */
    private void m1986Z(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f1292k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1010e eVar = this.f1292k.get(str2);
            if (eVar == null) {
                eVar = new C1010e(this, str2, (C1005a) null);
                this.f1292k.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = eVar.f1311e = true;
                C1008d unused2 = eVar.f1312f = null;
                eVar.m2029m(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C1008d unused3 = eVar.f1312f = new C1008d(this, eVar, (C1005a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public synchronized void m1988a0() {
        if (this.f1291j != null) {
            this.f1291j.close();
        }
        C4409d c = C10843m.m27008c(this.f1282a.mo9659b(this.f1285d));
        try {
            c.mo24232g0("libcore.io.DiskLruCache").mo24217U(10);
            c.mo24232g0(TimerCodec.ENABLE).mo24217U(10);
            c.mo24220Z0((long) this.f1287f).mo24217U(10);
            c.mo24220Z0((long) this.f1289h).mo24217U(10);
            c.mo24217U(10);
            for (C1010e next : this.f1292k.values()) {
                if (next.f1312f != null) {
                    c.mo24232g0("DIRTY").mo24217U(32);
                    c.mo24232g0(next.f1307a);
                } else {
                    c.mo24232g0("CLEAN").mo24217U(32);
                    c.mo24232g0(next.f1307a);
                    next.mo9447o(c);
                }
                c.mo24217U(10);
            }
            c.close();
            if (this.f1282a.mo9661d(this.f1284c)) {
                this.f1282a.mo9662e(this.f1284c, this.f1286e);
            }
            this.f1282a.mo9662e(this.f1285d, this.f1284c);
            this.f1282a.mo9663f(this.f1286e);
            this.f1291j = m1983V();
            this.f1294m = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public boolean m1990c0(C1010e eVar) {
        if (eVar.f1312f != null) {
            boolean unused = eVar.f1312f.f1304c = true;
        }
        for (int i = 0; i < this.f1289h; i++) {
            this.f1282a.mo9663f(eVar.f1309c[i]);
            this.f1290i -= eVar.f1308b[i];
            eVar.f1308b[i] = 0;
        }
        this.f1293l++;
        this.f1291j.mo24232g0("REMOVE").mo24217U(32).mo24232g0(eVar.f1307a).mo24217U(10);
        this.f1292k.remove(eVar.f1307a);
        if (m1982T()) {
            this.f1298q.execute(this.f1299r);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m1991d0() {
        while (this.f1290i > this.f1288g) {
            m1990c0(this.f1292k.values().iterator().next());
        }
    }

    /* renamed from: e0 */
    private void m1992e0(String str) {
        if (!f1280s.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: L */
    public void mo9431L() {
        close();
        this.f1282a.mo9660c(this.f1283b);
    }

    /* renamed from: M */
    public C1008d mo9432M(String str) {
        return m1981Q(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return null;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p011c.p083d.p084a.p085d0.C1004b.C1011f mo9433R(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo9434S()     // Catch:{ all -> 0x0052 }
            r3.m1978I()     // Catch:{ all -> 0x0052 }
            r3.m1992e0(r4)     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap<java.lang.String, c.d.a.d0.b$e> r0 = r3.f1292k     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0052 }
            c.d.a.d0.b$e r0 = (p011c.p083d.p084a.p085d0.C1004b.C1010e) r0     // Catch:{ all -> 0x0052 }
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r2 = r0.f1311e     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0050
        L_0x001c:
            c.d.a.d0.b$f r0 = r0.mo9446n()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r3)
            return r1
        L_0x0024:
            int r1 = r3.f1293l     // Catch:{ all -> 0x0052 }
            int r1 = r1 + 1
            r3.f1293l = r1     // Catch:{ all -> 0x0052 }
            g.d r1 = r3.f1291j     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "READ"
            g.d r1 = r1.mo24232g0(r2)     // Catch:{ all -> 0x0052 }
            r2 = 32
            g.d r1 = r1.mo24217U(r2)     // Catch:{ all -> 0x0052 }
            g.d r4 = r1.mo24232g0(r4)     // Catch:{ all -> 0x0052 }
            r1 = 10
            r4.mo24217U(r1)     // Catch:{ all -> 0x0052 }
            boolean r4 = r3.m1982T()     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004e
            java.util.concurrent.Executor r4 = r3.f1298q     // Catch:{ all -> 0x0052 }
            java.lang.Runnable r1 = r3.f1299r     // Catch:{ all -> 0x0052 }
            r4.execute(r1)     // Catch:{ all -> 0x0052 }
        L_0x004e:
            monitor-exit(r3)
            return r0
        L_0x0050:
            monitor-exit(r3)
            return r1
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.C1004b.mo9433R(java.lang.String):c.d.a.d0.b$f");
    }

    /* renamed from: S */
    public synchronized void mo9434S() {
        if (!this.f1295n) {
            if (this.f1282a.mo9661d(this.f1286e)) {
                if (this.f1282a.mo9661d(this.f1284c)) {
                    this.f1282a.mo9663f(this.f1286e);
                } else {
                    this.f1282a.mo9662e(this.f1286e, this.f1284c);
                }
            }
            if (this.f1282a.mo9661d(this.f1284c)) {
                try {
                    m1985X();
                    m1984W();
                    this.f1295n = true;
                    return;
                } catch (IOException e) {
                    C1019i f = C1019i.m2068f();
                    f.mo9478i("DiskLruCache " + this.f1283b + " is corrupt: " + e.getMessage() + ", removing");
                    mo9431L();
                    this.f1296o = false;
                }
            }
            m1988a0();
            this.f1295n = true;
        }
    }

    /* renamed from: b0 */
    public synchronized boolean mo9435b0(String str) {
        mo9434S();
        m1978I();
        m1992e0(str);
        C1010e eVar = this.f1292k.get(str);
        if (eVar == null) {
            return false;
        }
        return m1990c0(eVar);
    }

    public synchronized void close() {
        if (this.f1295n) {
            if (!this.f1296o) {
                for (C1010e eVar : (C1010e[]) this.f1292k.values().toArray(new C1010e[this.f1292k.size()])) {
                    if (eVar.f1312f != null) {
                        eVar.f1312f.mo9443a();
                    }
                }
                m1991d0();
                this.f1291j.close();
                this.f1291j = null;
                this.f1296o = true;
                return;
            }
        }
        this.f1296o = true;
    }

    public synchronized boolean isClosed() {
        return this.f1296o;
    }
}
