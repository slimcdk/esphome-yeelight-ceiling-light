package p156f.p157g0.p158e;

import com.miot.service.manager.timer.TimerCodec;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.p271io.FilenameUtils;
import p156f.p157g0.C4345c;
import p156f.p157g0.p162k.C4373f;
import p156f.p157g0.p208j.C10818a;
import p163g.C10843m;
import p163g.C4409d;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: f.g0.e.d */
public final class C4350d implements Closeable, Flushable {

    /* renamed from: u */
    static final Pattern f7673u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    final C10818a f7674a;

    /* renamed from: b */
    final File f7675b;

    /* renamed from: c */
    private final File f7676c;

    /* renamed from: d */
    private final File f7677d;

    /* renamed from: e */
    private final File f7678e;

    /* renamed from: f */
    private final int f7679f;

    /* renamed from: g */
    private long f7680g;

    /* renamed from: h */
    final int f7681h;

    /* renamed from: i */
    private long f7682i = 0;

    /* renamed from: j */
    C4409d f7683j;

    /* renamed from: k */
    final LinkedHashMap<String, C4356d> f7684k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    int f7685l;

    /* renamed from: m */
    boolean f7686m;

    /* renamed from: n */
    boolean f7687n;

    /* renamed from: o */
    boolean f7688o;

    /* renamed from: p */
    boolean f7689p;

    /* renamed from: q */
    boolean f7690q;

    /* renamed from: r */
    private long f7691r = 0;

    /* renamed from: s */
    private final Executor f7692s;

    /* renamed from: t */
    private final Runnable f7693t = new C4352a();

    /* renamed from: f.g0.e.d$e */
    public final class C4351e implements Closeable {

        /* renamed from: a */
        private final String f7694a;

        /* renamed from: b */
        private final long f7695b;

        /* renamed from: c */
        private final C4416t[] f7696c;

        C4351e(String str, long j, C4416t[] tVarArr, long[] jArr) {
            this.f7694a = str;
            this.f7695b = j;
            this.f7696c = tVarArr;
        }

        @Nullable
        /* renamed from: a */
        public C4354c mo23954a() {
            return C4350d.this.mo23950j(this.f7694a, this.f7695b);
        }

        /* renamed from: b */
        public C4416t mo23955b(int i) {
            return this.f7696c[i];
        }

        public void close() {
            for (C4416t g : this.f7696c) {
                C4345c.m12360g(g);
            }
        }
    }

    /* renamed from: f.g0.e.d$a */
    class C4352a implements Runnable {
        C4352a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f7698a.f7690q = true;
            r5.f7698a.f7683j = p163g.C10843m.m27008c(p163g.C10843m.m27007b());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                f.g0.e.d r0 = p156f.p157g0.p158e.C4350d.this
                monitor-enter(r0)
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f7687n     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                f.g0.e.d r4 = p156f.p157g0.p158e.C4350d.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.f7688o     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ IOException -> 0x001d }
                r1.mo23943K()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ all -> 0x0045 }
                r1.f7689p = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.mo23953s()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ IOException -> 0x0033 }
                r1.mo23940F()     // Catch:{ IOException -> 0x0033 }
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ IOException -> 0x0033 }
                r1.f7685l = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ all -> 0x0045 }
                r1.f7690q = r3     // Catch:{ all -> 0x0045 }
                f.g0.e.d r1 = p156f.p157g0.p158e.C4350d.this     // Catch:{ all -> 0x0045 }
                g.s r2 = p163g.C10843m.m27007b()     // Catch:{ all -> 0x0045 }
                g.d r2 = p163g.C10843m.m27008c(r2)     // Catch:{ all -> 0x0045 }
                r1.f7683j = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.C4352a.run():void");
        }
    }

    /* renamed from: f.g0.e.d$b */
    class C4353b extends C10755e {
        static {
            Class<C4350d> cls = C4350d.class;
        }

        C4353b(C4415s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo23958a(IOException iOException) {
            C4350d.this.f7686m = true;
        }
    }

    /* renamed from: f.g0.e.d$c */
    public final class C4354c {

        /* renamed from: a */
        final C4356d f7700a;

        /* renamed from: b */
        final boolean[] f7701b;

        /* renamed from: c */
        private boolean f7702c;

        /* renamed from: f.g0.e.d$c$a */
        class C4355a extends C10755e {
            C4355a(C4415s sVar) {
                super(sVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo23958a(IOException iOException) {
                synchronized (C4350d.this) {
                    C4354c.this.mo23961c();
                }
            }
        }

        C4354c(C4356d dVar) {
            this.f7700a = dVar;
            this.f7701b = dVar.f7709e ? null : new boolean[C4350d.this.f7681h];
        }

        /* renamed from: a */
        public void mo23959a() {
            synchronized (C4350d.this) {
                if (!this.f7702c) {
                    if (this.f7700a.f7710f == this) {
                        C4350d.this.mo23944b(this, false);
                    }
                    this.f7702c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void mo23960b() {
            synchronized (C4350d.this) {
                if (!this.f7702c) {
                    if (this.f7700a.f7710f == this) {
                        C4350d.this.mo23944b(this, true);
                    }
                    this.f7702c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo23961c() {
            if (this.f7700a.f7710f == this) {
                int i = 0;
                while (true) {
                    C4350d dVar = C4350d.this;
                    if (i < dVar.f7681h) {
                        try {
                            dVar.f7674a.mo34136f(this.f7700a.f7708d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f7700a.f7710f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: d */
        public C4415s mo23962d(int i) {
            synchronized (C4350d.this) {
                if (this.f7702c) {
                    throw new IllegalStateException();
                } else if (this.f7700a.f7710f != this) {
                    C4415s b = C10843m.m27007b();
                    return b;
                } else {
                    if (!this.f7700a.f7709e) {
                        this.f7701b[i] = true;
                    }
                    try {
                        C4355a aVar = new C4355a(C4350d.this.f7674a.mo34132b(this.f7700a.f7708d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C10843m.m27007b();
                    }
                }
            }
        }
    }

    /* renamed from: f.g0.e.d$d */
    private final class C4356d {

        /* renamed from: a */
        final String f7705a;

        /* renamed from: b */
        final long[] f7706b;

        /* renamed from: c */
        final File[] f7707c;

        /* renamed from: d */
        final File[] f7708d;

        /* renamed from: e */
        boolean f7709e;

        /* renamed from: f */
        C4354c f7710f;

        /* renamed from: g */
        long f7711g;

        C4356d(String str) {
            this.f7705a = str;
            int i = C4350d.this.f7681h;
            this.f7706b = new long[i];
            this.f7707c = new File[i];
            this.f7708d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i2 = 0; i2 < C4350d.this.f7681h; i2++) {
                sb.append(i2);
                this.f7707c[i2] = new File(C4350d.this.f7675b, sb.toString());
                sb.append(".tmp");
                this.f7708d[i2] = new File(C4350d.this.f7675b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        private IOException m12414a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo23963b(String[] strArr) {
            if (strArr.length == C4350d.this.f7681h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f7706b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m12414a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m12414a(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4351e mo23964c() {
            if (Thread.holdsLock(C4350d.this)) {
                C4416t[] tVarArr = new C4416t[C4350d.this.f7681h];
                long[] jArr = (long[]) this.f7706b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C4350d.this.f7681h) {
                    try {
                        tVarArr[i2] = C4350d.this.f7674a.mo34131a(this.f7707c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C4350d.this.f7681h && tVarArr[i] != null) {
                            C4345c.m12360g(tVarArr[i]);
                            i++;
                        }
                        try {
                            C4350d.this.mo23942J(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new C4351e(this.f7705a, this.f7711g, tVarArr, jArr);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo23965d(C4409d dVar) {
            for (long Z0 : this.f7706b) {
                dVar.mo24217U(32).mo24220Z0(Z0);
            }
        }
    }

    static {
        Class<C4350d> cls = C4350d.class;
    }

    C4350d(C10818a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f7674a = aVar;
        this.f7675b = file;
        this.f7679f = i;
        this.f7676c = new File(file, "journal");
        this.f7677d = new File(file, "journal.tmp");
        this.f7678e = new File(file, "journal.bkp");
        this.f7681h = i2;
        this.f7680g = j;
        this.f7692s = executor;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f7685l = r0 - r9.f7684k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo24274x() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo23940F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f7683j = m12393t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12388C() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            f.g0.j.a r1 = r9.f7674a
            java.io.File r2 = r9.f7676c
            g.t r1 = r1.mo34131a(r2)
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
            int r7 = r9.f7679f     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f7681h     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo24203C0()     // Catch:{ EOFException -> 0x005d }
            r9.m12389D(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r2 = r9.f7684k     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f7685l = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo24274x()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.mo23940F()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            g.d r0 = r9.m12393t()     // Catch:{ all -> 0x00a8 }
            r9.f7683j = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            p156f.p157g0.C4345c.m12360g(r1)
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
            p156f.p157g0.C4345c.m12360g(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.m12388C():void");
    }

    /* renamed from: D */
    private void m12389D(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f7684k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C4356d dVar = this.f7684k.get(str2);
            if (dVar == null) {
                dVar = new C4356d(str2);
                this.f7684k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f7709e = true;
                dVar.f7710f = null;
                dVar.mo23963b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f7710f = new C4354c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: L */
    private void m12390L(String str) {
        if (!f7673u.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: a */
    private synchronized void m12391a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: g */
    public static C4350d m12392g(C10818a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C4350d(aVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4345c.m12350G("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: t */
    private C4409d m12393t() {
        return C10843m.m27008c(new C4353b(this.f7674a.mo34137g(this.f7676c)));
    }

    /* renamed from: u */
    private void m12394u() {
        this.f7674a.mo34136f(this.f7677d);
        Iterator<C4356d> it = this.f7684k.values().iterator();
        while (it.hasNext()) {
            C4356d next = it.next();
            int i = 0;
            if (next.f7710f == null) {
                while (i < this.f7681h) {
                    this.f7682i += next.f7706b[i];
                    i++;
                }
            } else {
                next.f7710f = null;
                while (i < this.f7681h) {
                    this.f7674a.mo34136f(next.f7707c[i]);
                    this.f7674a.mo34136f(next.f7708d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public synchronized void mo23940F() {
        if (this.f7683j != null) {
            this.f7683j.close();
        }
        C4409d c = C10843m.m27008c(this.f7674a.mo34132b(this.f7677d));
        try {
            c.mo24232g0("libcore.io.DiskLruCache").mo24217U(10);
            c.mo24232g0(TimerCodec.ENABLE).mo24217U(10);
            c.mo24220Z0((long) this.f7679f).mo24217U(10);
            c.mo24220Z0((long) this.f7681h).mo24217U(10);
            c.mo24217U(10);
            for (C4356d next : this.f7684k.values()) {
                if (next.f7710f != null) {
                    c.mo24232g0("DIRTY").mo24217U(32);
                    c.mo24232g0(next.f7705a);
                } else {
                    c.mo24232g0("CLEAN").mo24217U(32);
                    c.mo24232g0(next.f7705a);
                    next.mo23965d(c);
                }
                c.mo24217U(10);
            }
            c.close();
            if (this.f7674a.mo34134d(this.f7676c)) {
                this.f7674a.mo34135e(this.f7676c, this.f7678e);
            }
            this.f7674a.mo34135e(this.f7677d, this.f7676c);
            this.f7674a.mo34136f(this.f7678e);
            this.f7683j = m12393t();
            this.f7686m = false;
            this.f7690q = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo23941I(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo23952o()     // Catch:{ all -> 0x0029 }
            r6.m12391a()     // Catch:{ all -> 0x0029 }
            r6.m12390L(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r0 = r6.f7684k     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            f.g0.e.d$d r7 = (p156f.p157g0.p158e.C4350d.C4356d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo23942J(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f7682i     // Catch:{ all -> 0x0029 }
            long r3 = r6.f7680g     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f7689p = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.mo23941I(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo23942J(C4356d dVar) {
        C4354c cVar = dVar.f7710f;
        if (cVar != null) {
            cVar.mo23961c();
        }
        for (int i = 0; i < this.f7681h; i++) {
            this.f7674a.mo34136f(dVar.f7707c[i]);
            long j = this.f7682i;
            long[] jArr = dVar.f7706b;
            this.f7682i = j - jArr[i];
            jArr[i] = 0;
        }
        this.f7685l++;
        this.f7683j.mo24232g0("REMOVE").mo24217U(32).mo24232g0(dVar.f7705a).mo24217U(10);
        this.f7684k.remove(dVar.f7705a);
        if (mo23953s()) {
            this.f7692s.execute(this.f7693t);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo23943K() {
        while (this.f7682i > this.f7680g) {
            mo23942J(this.f7684k.values().iterator().next());
        }
        this.f7689p = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo23944b(p156f.p157g0.p158e.C4350d.C4354c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            f.g0.e.d$d r0 = r10.f7700a     // Catch:{ all -> 0x00fb }
            f.g0.e.d$c r1 = r0.f7710f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f7709e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f7681h     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f7701b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            f.g0.j.a r3 = r9.f7674a     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f7708d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo34134d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo23959a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo23959a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f7681h     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f7708d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            f.g0.j.a r2 = r9.f7674a     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo34134d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f7707c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            f.g0.j.a r3 = r9.f7674a     // Catch:{ all -> 0x00fb }
            r3.mo34135e(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f7706b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            f.g0.j.a r10 = r9.f7674a     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo34138h(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f7706b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f7682i     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f7682i = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            f.g0.j.a r2 = r9.f7674a     // Catch:{ all -> 0x00fb }
            r2.mo34136f(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f7685l     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f7685l = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f7710f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f7709e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f7709e = r1     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            g.d r10 = r10.mo24232g0(r1)     // Catch:{ all -> 0x00fb }
            r10.mo24217U(r3)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f7705a     // Catch:{ all -> 0x00fb }
            r10.mo24232g0(r1)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            r0.mo23965d(r10)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            r10.mo24217U(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f7691r     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f7691r = r1     // Catch:{ all -> 0x00fb }
            r0.f7711g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r10 = r9.f7684k     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f7705a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            g.d r10 = r10.mo24232g0(r11)     // Catch:{ all -> 0x00fb }
            r10.mo24217U(r3)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f7705a     // Catch:{ all -> 0x00fb }
            r10.mo24232g0(r11)     // Catch:{ all -> 0x00fb }
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            r10.mo24217U(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            g.d r10 = r9.f7683j     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f7682i     // Catch:{ all -> 0x00fb }
            long r0 = r9.f7680g     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo23953s()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f7692s     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f7693t     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00ff
        L_0x00fe:
            throw r10
        L_0x00ff:
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.mo23944b(f.g0.e.d$c, boolean):void");
    }

    public synchronized void close() {
        if (this.f7687n) {
            if (!this.f7688o) {
                for (C4356d dVar : (C4356d[]) this.f7684k.values().toArray(new C4356d[this.f7684k.size()])) {
                    if (dVar.f7710f != null) {
                        dVar.f7710f.mo23959a();
                    }
                }
                mo23943K();
                this.f7683j.close();
                this.f7683j = null;
                this.f7688o = true;
                return;
            }
        }
        this.f7688o = true;
    }

    public synchronized void flush() {
        if (this.f7687n) {
            m12391a();
            mo23943K();
            this.f7683j.flush();
        }
    }

    /* renamed from: h */
    public void mo23947h() {
        close();
        this.f7674a.mo34133c(this.f7675b);
    }

    @Nullable
    /* renamed from: i */
    public C4354c mo23948i(String str) {
        return mo23950j(str, -1);
    }

    public synchronized boolean isClosed() {
        return this.f7688o;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p156f.p157g0.p158e.C4350d.C4354c mo23950j(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo23952o()     // Catch:{ all -> 0x0074 }
            r5.m12391a()     // Catch:{ all -> 0x0074 }
            r5.m12390L(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r0 = r5.f7684k     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            f.g0.e.d$d r0 = (p156f.p157g0.p158e.C4350d.C4356d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f7711g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            f.g0.e.d$c r7 = r0.f7710f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f7689p     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f7690q     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            g.d r7 = r5.f7683j     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            g.d r7 = r7.mo24232g0(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            g.d r7 = r7.mo24217U(r8)     // Catch:{ all -> 0x0074 }
            g.d r7 = r7.mo24232g0(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.mo24217U(r8)     // Catch:{ all -> 0x0074 }
            g.d r7 = r5.f7683j     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f7686m     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            f.g0.e.d$d r0 = new f.g0.e.d$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r7 = r5.f7684k     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            f.g0.e.d$c r6 = new f.g0.e.d$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f7710f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f7692s     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f7693t     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.mo23950j(java.lang.String, long):f.g0.e.d$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p156f.p157g0.p158e.C4350d.C4351e mo23951n(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo23952o()     // Catch:{ all -> 0x0050 }
            r3.m12391a()     // Catch:{ all -> 0x0050 }
            r3.m12390L(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, f.g0.e.d$d> r0 = r3.f7684k     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            f.g0.e.d$d r0 = (p156f.p157g0.p158e.C4350d.C4356d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f7709e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            f.g0.e.d$e r0 = r0.mo23964c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f7685l     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f7685l = r1     // Catch:{ all -> 0x0050 }
            g.d r1 = r3.f7683j     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            g.d r1 = r1.mo24232g0(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            g.d r1 = r1.mo24217U(r2)     // Catch:{ all -> 0x0050 }
            g.d r4 = r1.mo24232g0(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.mo24217U(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo23953s()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f7692s     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f7693t     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4350d.mo23951n(java.lang.String):f.g0.e.d$e");
    }

    /* renamed from: o */
    public synchronized void mo23952o() {
        if (!this.f7687n) {
            if (this.f7674a.mo34134d(this.f7678e)) {
                if (this.f7674a.mo34134d(this.f7676c)) {
                    this.f7674a.mo34136f(this.f7678e);
                } else {
                    this.f7674a.mo34135e(this.f7678e, this.f7676c);
                }
            }
            if (this.f7674a.mo34134d(this.f7676c)) {
                try {
                    m12388C();
                    m12394u();
                    this.f7687n = true;
                    return;
                } catch (IOException e) {
                    C4373f j = C4373f.m12509j();
                    j.mo24007q(5, "DiskLruCache " + this.f7675b + " is corrupt: " + e.getMessage() + ", removing", e);
                    mo23947h();
                    this.f7688o = false;
                } catch (Throwable th) {
                    this.f7688o = false;
                    throw th;
                }
            }
            mo23940F();
            this.f7687n = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo23953s() {
        int i = this.f7685l;
        return i >= 2000 && i >= this.f7684k.size();
    }
}
