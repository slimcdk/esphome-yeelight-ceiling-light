package p231y2;

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
import okio.C3564c;
import okio.C9837d;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import okio.C9854s;
import org.apache.commons.p194io.FilenameUtils;
import p128b3.C3985a;

/* renamed from: y2.b */
public final class C12013b implements Closeable {

    /* renamed from: s */
    static final Pattern f22002s = Pattern.compile("[a-z0-9_-]{1,120}");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final C9852q f22003t = new C12016c();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3985a f22004a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final File f22005b;

    /* renamed from: c */
    private final File f22006c;

    /* renamed from: d */
    private final File f22007d;

    /* renamed from: e */
    private final File f22008e;

    /* renamed from: f */
    private final int f22009f;

    /* renamed from: g */
    private long f22010g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f22011h;

    /* renamed from: i */
    private long f22012i = 0;

    /* renamed from: j */
    private C9837d f22013j;

    /* renamed from: k */
    private final LinkedHashMap<String, C12019e> f22014k = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f22015l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f22016m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f22017n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f22018o;

    /* renamed from: p */
    private long f22019p = 0;

    /* renamed from: q */
    private final Executor f22020q;

    /* renamed from: r */
    private final Runnable f22021r = new C12014a();

    /* renamed from: y2.b$a */
    class C12014a implements Runnable {
        C12014a() {
        }

        public void run() {
            synchronized (C12013b.this) {
                if (!(!C12013b.this.f22017n) && !C12013b.this.f22018o) {
                    try {
                        C12013b.this.m30940f0();
                        if (C12013b.this.m30929J()) {
                            C12013b.this.m30934W();
                            int unused = C12013b.this.f22015l = 0;
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /* renamed from: y2.b$b */
    class C12015b extends C12021c {
        static {
            Class<C12013b> cls = C12013b.class;
        }

        C12015b(C9852q qVar) {
            super(qVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42633a(IOException iOException) {
            boolean unused = C12013b.this.f22016m = true;
        }
    }

    /* renamed from: y2.b$c */
    static class C12016c implements C9852q {
        C12016c() {
        }

        public void close() {
        }

        public void flush() {
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return C9854s.f17853d;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            cVar.skip(j);
        }
    }

    /* renamed from: y2.b$d */
    public final class C12017d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12019e f22024a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f22025b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f22026c;

        /* renamed from: y2.b$d$a */
        class C12018a extends C12021c {
            C12018a(C9852q qVar) {
                super(qVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo42633a(IOException iOException) {
                synchronized (C12013b.this) {
                    boolean unused = C12017d.this.f22026c = true;
                }
            }
        }

        private C12017d(C12019e eVar) {
            this.f22024a = eVar;
            this.f22025b = eVar.f22033e ? null : new boolean[C12013b.this.f22011h];
        }

        /* synthetic */ C12017d(C12013b bVar, C12019e eVar, C12014a aVar) {
            this(eVar);
        }

        /* renamed from: a */
        public void mo42634a() {
            synchronized (C12013b.this) {
                C12013b.this.m30926A(this, false);
            }
        }

        /* renamed from: e */
        public void mo42635e() {
            synchronized (C12013b.this) {
                if (this.f22026c) {
                    C12013b.this.m30926A(this, false);
                    boolean unused = C12013b.this.m30938d0(this.f22024a);
                } else {
                    C12013b.this.m30926A(this, true);
                }
            }
        }

        /* renamed from: f */
        public C9852q mo42636f(int i) {
            C12018a aVar;
            synchronized (C12013b.this) {
                if (this.f22024a.f22034f == this) {
                    if (!this.f22024a.f22033e) {
                        this.f22025b[i] = true;
                    }
                    try {
                        aVar = new C12018a(C12013b.this.f22004a.mo26563b(this.f22024a.f22032d[i]));
                    } catch (FileNotFoundException unused) {
                        return C12013b.f22003t;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }
    }

    /* renamed from: y2.b$e */
    private final class C12019e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f22029a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f22030b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final File[] f22031c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final File[] f22032d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f22033e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C12017d f22034f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f22035g;

        private C12019e(String str) {
            this.f22029a = str;
            this.f22030b = new long[C12013b.this.f22011h];
            this.f22031c = new File[C12013b.this.f22011h];
            this.f22032d = new File[C12013b.this.f22011h];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i = 0; i < C12013b.this.f22011h; i++) {
                sb.append(i);
                this.f22031c[i] = new File(C12013b.this.f22005b, sb.toString());
                sb.append(".tmp");
                this.f22032d[i] = new File(C12013b.this.f22005b, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ C12019e(C12013b bVar, String str, C12014a aVar) {
            this(str);
        }

        /* renamed from: l */
        private IOException m30979l(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public void m30980m(String[] strArr) {
            if (strArr.length == C12013b.this.f22011h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f22030b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m30979l(strArr);
                    }
                }
                return;
            }
            throw m30979l(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C12020f mo42637n() {
            if (Thread.holdsLock(C12013b.this)) {
                C9853r[] rVarArr = new C9853r[C12013b.this.f22011h];
                long[] jArr = (long[]) this.f22030b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C12013b.this.f22011h) {
                    try {
                        rVarArr[i2] = C12013b.this.f22004a.mo26562a(this.f22031c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C12013b.this.f22011h && rVarArr[i] != null) {
                            C12033k.m31043c(rVarArr[i]);
                            i++;
                        }
                        return null;
                    }
                }
                return new C12020f(C12013b.this, this.f22029a, this.f22035g, rVarArr, jArr, (C12014a) null);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo42638o(C9837d dVar) {
            for (long c1 : this.f22030b) {
                dVar.mo24736R(32).mo24744c1(c1);
            }
        }
    }

    /* renamed from: y2.b$f */
    public final class C12020f implements Closeable {

        /* renamed from: a */
        private final String f22037a;

        /* renamed from: b */
        private final long f22038b;

        /* renamed from: c */
        private final C9853r[] f22039c;

        private C12020f(String str, long j, C9853r[] rVarArr, long[] jArr) {
            this.f22037a = str;
            this.f22038b = j;
            this.f22039c = rVarArr;
        }

        /* synthetic */ C12020f(C12013b bVar, String str, long j, C9853r[] rVarArr, long[] jArr, C12014a aVar) {
            this(str, j, rVarArr, jArr);
        }

        /* renamed from: a */
        public C12017d mo42639a() {
            return C12013b.this.m30928G(this.f22037a, this.f22038b);
        }

        /* renamed from: c */
        public C9853r mo42640c(int i) {
            return this.f22039c[i];
        }

        public void close() {
            for (C9853r c : this.f22039c) {
                C12033k.m31043c(c);
            }
        }
    }

    static {
        Class<C12013b> cls = C12013b.class;
    }

    C12013b(C3985a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f22004a = aVar;
        this.f22005b = file;
        this.f22009f = i;
        this.f22006c = new File(file, "journal");
        this.f22007d = new File(file, "journal.tmp");
        this.f22008e = new File(file, "journal.bkp");
        this.f22011h = i2;
        this.f22010g = j;
        this.f22020q = executor;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        return;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m30926A(p231y2.C12013b.C12017d r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            y2.b$e r0 = r10.f22024a     // Catch:{ all -> 0x0118 }
            y2.b$d r1 = r0.f22034f     // Catch:{ all -> 0x0118 }
            if (r1 != r10) goto L_0x0112
            r1 = 0
            if (r11 == 0) goto L_0x0051
            boolean r2 = r0.f22033e     // Catch:{ all -> 0x0118 }
            if (r2 != 0) goto L_0x0051
            r2 = 0
        L_0x0015:
            int r3 = r9.f22011h     // Catch:{ all -> 0x0118 }
            if (r2 >= r3) goto L_0x0051
            boolean[] r3 = r10.f22025b     // Catch:{ all -> 0x0118 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0118 }
            if (r3 == 0) goto L_0x0037
            b3.a r3 = r9.f22004a     // Catch:{ all -> 0x0118 }
            java.io.File[] r4 = r0.f22032d     // Catch:{ all -> 0x0118 }
            r4 = r4[r2]     // Catch:{ all -> 0x0118 }
            boolean r3 = r3.mo26565d(r4)     // Catch:{ all -> 0x0118 }
            if (r3 != 0) goto L_0x0034
            r10.mo42634a()     // Catch:{ all -> 0x0118 }
            monitor-exit(r9)
            return
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0037:
            r10.mo42634a()     // Catch:{ all -> 0x0118 }
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
            int r10 = r9.f22011h     // Catch:{ all -> 0x0118 }
            if (r1 >= r10) goto L_0x0091
            java.io.File[] r10 = r0.f22032d     // Catch:{ all -> 0x0118 }
            r10 = r10[r1]     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x0089
            b3.a r2 = r9.f22004a     // Catch:{ all -> 0x0118 }
            boolean r2 = r2.mo26565d(r10)     // Catch:{ all -> 0x0118 }
            if (r2 == 0) goto L_0x008e
            java.io.File[] r2 = r0.f22031c     // Catch:{ all -> 0x0118 }
            r2 = r2[r1]     // Catch:{ all -> 0x0118 }
            b3.a r3 = r9.f22004a     // Catch:{ all -> 0x0118 }
            r3.mo26566e(r10, r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.f22030b     // Catch:{ all -> 0x0118 }
            r3 = r10[r1]     // Catch:{ all -> 0x0118 }
            b3.a r10 = r9.f22004a     // Catch:{ all -> 0x0118 }
            long r5 = r10.mo26569h(r2)     // Catch:{ all -> 0x0118 }
            long[] r10 = r0.f22030b     // Catch:{ all -> 0x0118 }
            r10[r1] = r5     // Catch:{ all -> 0x0118 }
            long r7 = r9.f22012i     // Catch:{ all -> 0x0118 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f22012i = r7     // Catch:{ all -> 0x0118 }
            goto L_0x008e
        L_0x0089:
            b3.a r2 = r9.f22004a     // Catch:{ all -> 0x0118 }
            r2.mo26567f(r10)     // Catch:{ all -> 0x0118 }
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0091:
            int r10 = r9.f22015l     // Catch:{ all -> 0x0118 }
            r1 = 1
            int r10 = r10 + r1
            r9.f22015l = r10     // Catch:{ all -> 0x0118 }
            r10 = 0
            p231y2.C12013b.C12017d unused = r0.f22034f = r10     // Catch:{ all -> 0x0118 }
            boolean r10 = r0.f22033e     // Catch:{ all -> 0x0118 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00d4
            boolean unused = r0.f22033e = r1     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "CLEAN"
            okio.d r10 = r10.mo24757i0(r1)     // Catch:{ all -> 0x0118 }
            r10.mo24736R(r3)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = r0.f22029a     // Catch:{ all -> 0x0118 }
            r10.mo24757i0(r1)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            r0.mo42638o(r10)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            r10.mo24736R(r2)     // Catch:{ all -> 0x0118 }
            if (r11 == 0) goto L_0x00f6
            long r10 = r9.f22019p     // Catch:{ all -> 0x0118 }
            r1 = 1
            long r1 = r1 + r10
            r9.f22019p = r1     // Catch:{ all -> 0x0118 }
            long unused = r0.f22035g = r10     // Catch:{ all -> 0x0118 }
            goto L_0x00f6
        L_0x00d4:
            java.util.LinkedHashMap<java.lang.String, y2.b$e> r10 = r9.f22014k     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.f22029a     // Catch:{ all -> 0x0118 }
            r10.remove(r11)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = "REMOVE"
            okio.d r10 = r10.mo24757i0(r11)     // Catch:{ all -> 0x0118 }
            r10.mo24736R(r3)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            java.lang.String r11 = r0.f22029a     // Catch:{ all -> 0x0118 }
            r10.mo24757i0(r11)     // Catch:{ all -> 0x0118 }
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            r10.mo24736R(r2)     // Catch:{ all -> 0x0118 }
        L_0x00f6:
            okio.d r10 = r9.f22013j     // Catch:{ all -> 0x0118 }
            r10.flush()     // Catch:{ all -> 0x0118 }
            long r10 = r9.f22012i     // Catch:{ all -> 0x0118 }
            long r0 = r9.f22010g     // Catch:{ all -> 0x0118 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0109
            boolean r10 = r9.m30929J()     // Catch:{ all -> 0x0118 }
            if (r10 == 0) goto L_0x0110
        L_0x0109:
            java.util.concurrent.Executor r10 = r9.f22020q     // Catch:{ all -> 0x0118 }
            java.lang.Runnable r11 = r9.f22021r     // Catch:{ all -> 0x0118 }
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
        throw new UnsupportedOperationException("Method not decompiled: p231y2.C12013b.m30926A(y2.b$d, boolean):void");
    }

    /* renamed from: B */
    public static C12013b m30927B(C3985a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C12013b(aVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C12033k.m31057q("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return null;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p231y2.C12013b.C12017d m30928G(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo42628I()     // Catch:{ all -> 0x0067 }
            r5.m30952z()     // Catch:{ all -> 0x0067 }
            r5.m30941g0(r6)     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, y2.b$e> r0 = r5.f22014k     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0067 }
            y2.b$e r0 = (p231y2.C12013b.C12019e) r0     // Catch:{ all -> 0x0067 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0025
            if (r0 == 0) goto L_0x0023
            long r1 = r0.f22035g     // Catch:{ all -> 0x0067 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0025
        L_0x0023:
            monitor-exit(r5)
            return r3
        L_0x0025:
            if (r0 == 0) goto L_0x002f
            y2.b$d r7 = r0.f22034f     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x002f
            monitor-exit(r5)
            return r3
        L_0x002f:
            okio.d r7 = r5.f22013j     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "DIRTY"
            okio.d r7 = r7.mo24757i0(r8)     // Catch:{ all -> 0x0067 }
            r8 = 32
            okio.d r7 = r7.mo24736R(r8)     // Catch:{ all -> 0x0067 }
            okio.d r7 = r7.mo24757i0(r6)     // Catch:{ all -> 0x0067 }
            r8 = 10
            r7.mo24736R(r8)     // Catch:{ all -> 0x0067 }
            okio.d r7 = r5.f22013j     // Catch:{ all -> 0x0067 }
            r7.flush()     // Catch:{ all -> 0x0067 }
            boolean r7 = r5.f22016m     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0051
            monitor-exit(r5)
            return r3
        L_0x0051:
            if (r0 != 0) goto L_0x005d
            y2.b$e r0 = new y2.b$e     // Catch:{ all -> 0x0067 }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, y2.b$e> r7 = r5.f22014k     // Catch:{ all -> 0x0067 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0067 }
        L_0x005d:
            y2.b$d r6 = new y2.b$d     // Catch:{ all -> 0x0067 }
            r6.<init>(r5, r0, r3)     // Catch:{ all -> 0x0067 }
            p231y2.C12013b.C12017d unused = r0.f22034f = r6     // Catch:{ all -> 0x0067 }
            monitor-exit(r5)
            return r6
        L_0x0067:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p231y2.C12013b.m30928G(java.lang.String, long):y2.b$d");
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public boolean m30929J() {
        int i = this.f22015l;
        return i >= 2000 && i >= this.f22014k.size();
    }

    /* renamed from: N */
    private C9837d m30930N() {
        return C9845l.m23737c(new C12015b(this.f22004a.mo26568g(this.f22006c)));
    }

    /* renamed from: P */
    private void m30931P() {
        this.f22004a.mo26567f(this.f22007d);
        Iterator<C12019e> it = this.f22014k.values().iterator();
        while (it.hasNext()) {
            C12019e next = it.next();
            int i = 0;
            if (next.f22034f == null) {
                while (i < this.f22011h) {
                    this.f22012i += next.f22030b[i];
                    i++;
                }
            } else {
                C12017d unused = next.f22034f = null;
                while (i < this.f22011h) {
                    this.f22004a.mo26567f(next.f22031c[i]);
                    this.f22004a.mo26567f(next.f22032d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f22015l = r0 - r9.f22014k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo24734Q() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        m30934W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f22013j = m30930N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30932T() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            b3.a r1 = r9.f22004a
            java.io.File r2 = r9.f22006c
            okio.r r1 = r1.mo26562a(r2)
            okio.e r1 = okio.C9845l.m23738d(r1)
            java.lang.String r2 = r1.mo24725G0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.mo24725G0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.mo24725G0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.mo24725G0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.mo24725G0()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.f22009f     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f22011h     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo24725G0()     // Catch:{ EOFException -> 0x005d }
            r9.m30933V(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, y2.b$e> r2 = r9.f22014k     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f22015l = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo24734Q()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.m30934W()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            okio.d r0 = r9.m30930N()     // Catch:{ all -> 0x00a8 }
            r9.f22013j = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            p231y2.C12033k.m31043c(r1)
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
            p231y2.C12033k.m31043c(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p231y2.C12013b.m30932T():void");
    }

    /* renamed from: V */
    private void m30933V(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f22014k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C12019e eVar = this.f22014k.get(str2);
            if (eVar == null) {
                eVar = new C12019e(this, str2, (C12014a) null);
                this.f22014k.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = eVar.f22033e = true;
                C12017d unused2 = eVar.f22034f = null;
                eVar.m30980m(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C12017d unused3 = eVar.f22034f = new C12017d(this, eVar, (C12014a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: W */
    public synchronized void m30934W() {
        C9837d dVar = this.f22013j;
        if (dVar != null) {
            dVar.close();
        }
        C9837d c = C9845l.m23737c(this.f22004a.mo26563b(this.f22007d));
        try {
            c.mo24757i0("libcore.io.DiskLruCache").mo24736R(10);
            c.mo24757i0(TimerCodec.ENABLE).mo24736R(10);
            c.mo24744c1((long) this.f22009f).mo24736R(10);
            c.mo24744c1((long) this.f22011h).mo24736R(10);
            c.mo24736R(10);
            for (C12019e next : this.f22014k.values()) {
                if (next.f22034f != null) {
                    c.mo24757i0("DIRTY").mo24736R(32);
                    c.mo24757i0(next.f22029a);
                } else {
                    c.mo24757i0("CLEAN").mo24736R(32);
                    c.mo24757i0(next.f22029a);
                    next.mo42638o(c);
                }
                c.mo24736R(10);
            }
            c.close();
            if (this.f22004a.mo26565d(this.f22006c)) {
                this.f22004a.mo26566e(this.f22006c, this.f22008e);
            }
            this.f22004a.mo26566e(this.f22007d, this.f22006c);
            this.f22004a.mo26567f(this.f22008e);
            this.f22013j = m30930N();
            this.f22016m = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public boolean m30938d0(C12019e eVar) {
        if (eVar.f22034f != null) {
            boolean unused = eVar.f22034f.f22026c = true;
        }
        for (int i = 0; i < this.f22011h; i++) {
            this.f22004a.mo26567f(eVar.f22031c[i]);
            this.f22012i -= eVar.f22030b[i];
            eVar.f22030b[i] = 0;
        }
        this.f22015l++;
        this.f22013j.mo24757i0("REMOVE").mo24736R(32).mo24757i0(eVar.f22029a).mo24736R(10);
        this.f22014k.remove(eVar.f22029a);
        if (m30929J()) {
            this.f22020q.execute(this.f22021r);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m30940f0() {
        while (this.f22012i > this.f22010g) {
            m30938d0(this.f22014k.values().iterator().next());
        }
    }

    /* renamed from: g0 */
    private void m30941g0(String str) {
        if (!f22002s.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: z */
    private synchronized void m30952z() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: D */
    public void mo42625D() {
        close();
        this.f22004a.mo26564c(this.f22005b);
    }

    /* renamed from: E */
    public C12017d mo42626E(String str) {
        return m30928G(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        return null;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p231y2.C12013b.C12020f mo42627H(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo42628I()     // Catch:{ all -> 0x0052 }
            r3.m30952z()     // Catch:{ all -> 0x0052 }
            r3.m30941g0(r4)     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap<java.lang.String, y2.b$e> r0 = r3.f22014k     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0052 }
            y2.b$e r0 = (p231y2.C12013b.C12019e) r0     // Catch:{ all -> 0x0052 }
            r1 = 0
            if (r0 == 0) goto L_0x0050
            boolean r2 = r0.f22033e     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x001c
            goto L_0x0050
        L_0x001c:
            y2.b$f r0 = r0.mo42637n()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r3)
            return r1
        L_0x0024:
            int r1 = r3.f22015l     // Catch:{ all -> 0x0052 }
            int r1 = r1 + 1
            r3.f22015l = r1     // Catch:{ all -> 0x0052 }
            okio.d r1 = r3.f22013j     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "READ"
            okio.d r1 = r1.mo24757i0(r2)     // Catch:{ all -> 0x0052 }
            r2 = 32
            okio.d r1 = r1.mo24736R(r2)     // Catch:{ all -> 0x0052 }
            okio.d r4 = r1.mo24757i0(r4)     // Catch:{ all -> 0x0052 }
            r1 = 10
            r4.mo24736R(r1)     // Catch:{ all -> 0x0052 }
            boolean r4 = r3.m30929J()     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x004e
            java.util.concurrent.Executor r4 = r3.f22020q     // Catch:{ all -> 0x0052 }
            java.lang.Runnable r1 = r3.f22021r     // Catch:{ all -> 0x0052 }
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
        throw new UnsupportedOperationException("Method not decompiled: p231y2.C12013b.mo42627H(java.lang.String):y2.b$f");
    }

    /* renamed from: I */
    public synchronized void mo42628I() {
        if (!this.f22017n) {
            if (this.f22004a.mo26565d(this.f22008e)) {
                if (this.f22004a.mo26565d(this.f22006c)) {
                    this.f22004a.mo26567f(this.f22008e);
                } else {
                    this.f22004a.mo26566e(this.f22008e, this.f22006c);
                }
            }
            if (this.f22004a.mo26565d(this.f22006c)) {
                try {
                    m30932T();
                    m30931P();
                    this.f22017n = true;
                    return;
                } catch (IOException e) {
                    C12028i f = C12028i.m31019f();
                    f.mo42654i("DiskLruCache " + this.f22005b + " is corrupt: " + e.getMessage() + ", removing");
                    mo42625D();
                    this.f22018o = false;
                }
            }
            m30934W();
            this.f22017n = true;
        }
    }

    /* renamed from: c0 */
    public synchronized boolean mo42629c0(String str) {
        mo42628I();
        m30952z();
        m30941g0(str);
        C12019e eVar = this.f22014k.get(str);
        if (eVar == null) {
            return false;
        }
        return m30938d0(eVar);
    }

    public synchronized void close() {
        if (this.f22017n) {
            if (!this.f22018o) {
                for (C12019e eVar : (C12019e[]) this.f22014k.values().toArray(new C12019e[this.f22014k.size()])) {
                    if (eVar.f22034f != null) {
                        eVar.f22034f.mo42634a();
                    }
                }
                m30940f0();
                this.f22013j.close();
                this.f22013j = null;
                this.f22018o = true;
                return;
            }
        }
        this.f22018o = true;
    }

    public synchronized boolean isClosed() {
        return this.f22018o;
    }
}
