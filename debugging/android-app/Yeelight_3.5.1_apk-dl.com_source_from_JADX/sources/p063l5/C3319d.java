package p063l5;

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
import okio.C9837d;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;
import org.apache.commons.p194io.FilenameUtils;
import p056k5.C3300c;
import p092r5.C3636f;
import p203q5.C10283a;

/* renamed from: l5.d */
public final class C3319d implements Closeable, Flushable {

    /* renamed from: u */
    static final Pattern f5376u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    final C10283a f5377a;

    /* renamed from: b */
    final File f5378b;

    /* renamed from: c */
    private final File f5379c;

    /* renamed from: d */
    private final File f5380d;

    /* renamed from: e */
    private final File f5381e;

    /* renamed from: f */
    private final int f5382f;

    /* renamed from: g */
    private long f5383g;

    /* renamed from: h */
    final int f5384h;

    /* renamed from: i */
    private long f5385i = 0;

    /* renamed from: j */
    C9837d f5386j;

    /* renamed from: k */
    final LinkedHashMap<String, C3325d> f5387k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    int f5388l;

    /* renamed from: m */
    boolean f5389m;

    /* renamed from: n */
    boolean f5390n;

    /* renamed from: o */
    boolean f5391o;

    /* renamed from: p */
    boolean f5392p;

    /* renamed from: q */
    boolean f5393q;

    /* renamed from: r */
    private long f5394r = 0;

    /* renamed from: s */
    private final Executor f5395s;

    /* renamed from: t */
    private final Runnable f5396t = new C3321a();

    /* renamed from: l5.d$e */
    public final class C3320e implements Closeable {

        /* renamed from: a */
        private final String f5397a;

        /* renamed from: b */
        private final long f5398b;

        /* renamed from: c */
        private final C9853r[] f5399c;

        C3320e(String str, long j, C9853r[] rVarArr, long[] jArr) {
            this.f5397a = str;
            this.f5398b = j;
            this.f5399c = rVarArr;
        }

        @Nullable
        /* renamed from: a */
        public C3323c mo24050a() {
            return C3319d.this.mo24043i(this.f5397a, this.f5398b);
        }

        /* renamed from: c */
        public C9853r mo24051c(int i) {
            return this.f5399c[i];
        }

        public void close() {
            for (C9853r f : this.f5399c) {
                C3300c.m8921f(f);
            }
        }
    }

    /* renamed from: l5.d$a */
    class C3321a implements Runnable {
        C3321a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r1 = r6.f5401a;
            r1.f5393q = true;
            r1.f5386j = okio.C9845l.m23737c(okio.C9845l.m23736b());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                l5.d r0 = p063l5.C3319d.this
                monitor-enter(r0)
                l5.d r1 = p063l5.C3319d.this     // Catch:{ all -> 0x003f }
                boolean r2 = r1.f5390n     // Catch:{ all -> 0x003f }
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                boolean r5 = r1.f5391o     // Catch:{ all -> 0x003f }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0015
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x0015:
                r1.mo24037B()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                l5.d r1 = p063l5.C3319d.this     // Catch:{ all -> 0x003f }
                r1.f5392p = r4     // Catch:{ all -> 0x003f }
            L_0x001d:
                l5.d r1 = p063l5.C3319d.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.mo24047m()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003d
                l5.d r1 = p063l5.C3319d.this     // Catch:{ IOException -> 0x002f }
                r1.mo24048v()     // Catch:{ IOException -> 0x002f }
                l5.d r1 = p063l5.C3319d.this     // Catch:{ IOException -> 0x002f }
                r1.f5388l = r3     // Catch:{ IOException -> 0x002f }
                goto L_0x003d
            L_0x002f:
                l5.d r1 = p063l5.C3319d.this     // Catch:{ all -> 0x003f }
                r1.f5393q = r4     // Catch:{ all -> 0x003f }
                okio.q r2 = okio.C9845l.m23736b()     // Catch:{ all -> 0x003f }
                okio.d r2 = okio.C9845l.m23737c(r2)     // Catch:{ all -> 0x003f }
                r1.f5386j = r2     // Catch:{ all -> 0x003f }
            L_0x003d:
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x003f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.C3321a.run():void");
        }
    }

    /* renamed from: l5.d$b */
    class C3322b extends C9533e {
        static {
            Class<C3319d> cls = C3319d.class;
        }

        C3322b(C9852q qVar) {
            super(qVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo24054a(IOException iOException) {
            C3319d.this.f5389m = true;
        }
    }

    /* renamed from: l5.d$c */
    public final class C3323c {

        /* renamed from: a */
        final C3325d f5403a;

        /* renamed from: b */
        final boolean[] f5404b;

        /* renamed from: c */
        private boolean f5405c;

        /* renamed from: l5.d$c$a */
        class C3324a extends C9533e {
            C3324a(C9852q qVar) {
                super(qVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo24054a(IOException iOException) {
                synchronized (C3319d.this) {
                    C3323c.this.mo24057c();
                }
            }
        }

        C3323c(C3325d dVar) {
            this.f5403a = dVar;
            this.f5404b = dVar.f5412e ? null : new boolean[C3319d.this.f5384h];
        }

        /* renamed from: a */
        public void mo24055a() {
            synchronized (C3319d.this) {
                if (!this.f5405c) {
                    if (this.f5403a.f5413f == this) {
                        C3319d.this.mo24038c(this, false);
                    }
                    this.f5405c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void mo24056b() {
            synchronized (C3319d.this) {
                if (!this.f5405c) {
                    if (this.f5403a.f5413f == this) {
                        C3319d.this.mo24038c(this, true);
                    }
                    this.f5405c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo24057c() {
            if (this.f5403a.f5413f == this) {
                int i = 0;
                while (true) {
                    C3319d dVar = C3319d.this;
                    if (i < dVar.f5384h) {
                        try {
                            dVar.f5377a.mo41800f(this.f5403a.f5411d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f5403a.f5413f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: d */
        public C9852q mo24058d(int i) {
            synchronized (C3319d.this) {
                if (!this.f5405c) {
                    C3325d dVar = this.f5403a;
                    if (dVar.f5413f != this) {
                        C9852q b = C9845l.m23736b();
                        return b;
                    }
                    if (!dVar.f5412e) {
                        this.f5404b[i] = true;
                    }
                    try {
                        C3324a aVar = new C3324a(C3319d.this.f5377a.mo41796b(dVar.f5411d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C9845l.m23736b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: l5.d$d */
    private final class C3325d {

        /* renamed from: a */
        final String f5408a;

        /* renamed from: b */
        final long[] f5409b;

        /* renamed from: c */
        final File[] f5410c;

        /* renamed from: d */
        final File[] f5411d;

        /* renamed from: e */
        boolean f5412e;

        /* renamed from: f */
        C3323c f5413f;

        /* renamed from: g */
        long f5414g;

        C3325d(String str) {
            this.f5408a = str;
            int i = C3319d.this.f5384h;
            this.f5409b = new long[i];
            this.f5410c = new File[i];
            this.f5411d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            int length = sb.length();
            for (int i2 = 0; i2 < C3319d.this.f5384h; i2++) {
                sb.append(i2);
                this.f5410c[i2] = new File(C3319d.this.f5378b, sb.toString());
                sb.append(".tmp");
                this.f5411d[i2] = new File(C3319d.this.f5378b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        private IOException m9051a(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo24059b(String[] strArr) {
            if (strArr.length == C3319d.this.f5384h) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f5409b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m9051a(strArr);
                    }
                }
                return;
            }
            throw m9051a(strArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3320e mo24060c() {
            if (Thread.holdsLock(C3319d.this)) {
                C9853r[] rVarArr = new C9853r[C3319d.this.f5384h];
                long[] jArr = (long[]) this.f5409b.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        C3319d dVar = C3319d.this;
                        if (i2 >= dVar.f5384h) {
                            return new C3320e(this.f5408a, this.f5414g, rVarArr, jArr);
                        }
                        rVarArr[i2] = dVar.f5377a.mo41795a(this.f5410c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C3319d dVar2 = C3319d.this;
                            if (i >= dVar2.f5384h || rVarArr[i] == null) {
                                try {
                                    dVar2.mo24036A(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                C3300c.m8921f(rVarArr[i]);
                                i++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24061d(C9837d dVar) {
            for (long c1 : this.f5409b) {
                dVar.mo24736R(32).mo24744c1(c1);
            }
        }
    }

    static {
        Class<C3319d> cls = C3319d.class;
    }

    C3319d(C10283a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f5377a = aVar;
        this.f5378b = file;
        this.f5382f = i;
        this.f5379c = new File(file, "journal");
        this.f5380d = new File(file, "journal.tmp");
        this.f5381e = new File(file, "journal.bkp");
        this.f5384h = i2;
        this.f5383g = j;
        this.f5395s = executor;
    }

    /* renamed from: D */
    private void m9025D(String str) {
        if (!f5376u.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: a */
    private synchronized void m9026a() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public static C3319d m9027d(C10283a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C3319d(aVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C3300c.m8912F("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: n */
    private C9837d m9028n() {
        return C9845l.m23737c(new C3322b(this.f5377a.mo41801g(this.f5379c)));
    }

    /* renamed from: p */
    private void m9029p() {
        this.f5377a.mo41800f(this.f5380d);
        Iterator<C3325d> it = this.f5387k.values().iterator();
        while (it.hasNext()) {
            C3325d next = it.next();
            int i = 0;
            if (next.f5413f == null) {
                while (i < this.f5384h) {
                    this.f5385i += next.f5409b[i];
                    i++;
                }
            } else {
                next.f5413f = null;
                while (i < this.f5384h) {
                    this.f5377a.mo41800f(next.f5410c[i]);
                    this.f5377a.mo41800f(next.f5411d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f5388l = r0 - r9.f5387k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo24734Q() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo24048v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f5386j = m9028n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9030q() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            q5.a r1 = r9.f5377a
            java.io.File r2 = r9.f5379c
            okio.r r1 = r1.mo41795a(r2)
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
            int r7 = r9.f5382f     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f5384h     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo24725G0()     // Catch:{ EOFException -> 0x005d }
            r9.m9031s(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r2 = r9.f5387k     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f5388l = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo24734Q()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.mo24048v()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            okio.d r0 = r9.m9028n()     // Catch:{ all -> 0x00a8 }
            r9.f5386j = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            p056k5.C3300c.m8921f(r1)
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
            p056k5.C3300c.m8921f(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.m9030q():void");
    }

    /* renamed from: s */
    private void m9031s(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f5387k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C3325d dVar = this.f5387k.get(str2);
            if (dVar == null) {
                dVar = new C3325d(str2);
                this.f5387k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f5412e = true;
                dVar.f5413f = null;
                dVar.mo24059b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f5413f = new C3323c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo24036A(C3325d dVar) {
        C3323c cVar = dVar.f5413f;
        if (cVar != null) {
            cVar.mo24057c();
        }
        for (int i = 0; i < this.f5384h; i++) {
            this.f5377a.mo41800f(dVar.f5410c[i]);
            long j = this.f5385i;
            long[] jArr = dVar.f5409b;
            this.f5385i = j - jArr[i];
            jArr[i] = 0;
        }
        this.f5388l++;
        this.f5386j.mo24757i0("REMOVE").mo24736R(32).mo24757i0(dVar.f5408a).mo24736R(10);
        this.f5387k.remove(dVar.f5408a);
        if (mo24047m()) {
            this.f5395s.execute(this.f5396t);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo24037B() {
        while (this.f5385i > this.f5383g) {
            mo24036A(this.f5387k.values().iterator().next());
        }
        this.f5392p = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo24038c(p063l5.C3319d.C3323c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            l5.d$d r0 = r10.f5403a     // Catch:{ all -> 0x00fb }
            l5.d$c r1 = r0.f5413f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f5412e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f5384h     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f5404b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            q5.a r3 = r9.f5377a     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f5411d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo41798d(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo24055a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo24055a()     // Catch:{ all -> 0x00fb }
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
            int r10 = r9.f5384h     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f5411d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            q5.a r2 = r9.f5377a     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo41798d(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f5410c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            q5.a r3 = r9.f5377a     // Catch:{ all -> 0x00fb }
            r3.mo41799e(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f5409b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            q5.a r10 = r9.f5377a     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo41802h(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f5409b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f5385i     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f5385i = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            q5.a r2 = r9.f5377a     // Catch:{ all -> 0x00fb }
            r2.mo41800f(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f5388l     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f5388l = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f5413f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f5412e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f5412e = r1     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            okio.d r10 = r10.mo24757i0(r1)     // Catch:{ all -> 0x00fb }
            r10.mo24736R(r3)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f5408a     // Catch:{ all -> 0x00fb }
            r10.mo24757i0(r1)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            r0.mo24061d(r10)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            r10.mo24736R(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f5394r     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f5394r = r1     // Catch:{ all -> 0x00fb }
            r0.f5414g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r10 = r9.f5387k     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f5408a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            okio.d r10 = r10.mo24757i0(r11)     // Catch:{ all -> 0x00fb }
            r10.mo24736R(r3)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f5408a     // Catch:{ all -> 0x00fb }
            r10.mo24757i0(r11)     // Catch:{ all -> 0x00fb }
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            r10.mo24736R(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            okio.d r10 = r9.f5386j     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f5385i     // Catch:{ all -> 0x00fb }
            long r0 = r9.f5383g     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo24047m()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f5395s     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f5396t     // Catch:{ all -> 0x00fb }
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
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.mo24038c(l5.d$c, boolean):void");
    }

    public synchronized void close() {
        if (this.f5390n) {
            if (!this.f5391o) {
                for (C3325d dVar : (C3325d[]) this.f5387k.values().toArray(new C3325d[this.f5387k.size()])) {
                    C3323c cVar = dVar.f5413f;
                    if (cVar != null) {
                        cVar.mo24055a();
                    }
                }
                mo24037B();
                this.f5386j.close();
                this.f5386j = null;
                this.f5391o = true;
                return;
            }
        }
        this.f5391o = true;
    }

    /* renamed from: f */
    public void mo24040f() {
        close();
        this.f5377a.mo41797c(this.f5378b);
    }

    public synchronized void flush() {
        if (this.f5390n) {
            m9026a();
            mo24037B();
            this.f5386j.flush();
        }
    }

    @Nullable
    /* renamed from: h */
    public C3323c mo24042h(String str) {
        return mo24043i(str, -1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p063l5.C3319d.C3323c mo24043i(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo24046l()     // Catch:{ all -> 0x0074 }
            r5.m9026a()     // Catch:{ all -> 0x0074 }
            r5.m9025D(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r0 = r5.f5387k     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            l5.d$d r0 = (p063l5.C3319d.C3325d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f5414g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            l5.d$c r7 = r0.f5413f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f5392p     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f5393q     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            okio.d r7 = r5.f5386j     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            okio.d r7 = r7.mo24757i0(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            okio.d r7 = r7.mo24736R(r8)     // Catch:{ all -> 0x0074 }
            okio.d r7 = r7.mo24757i0(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.mo24736R(r8)     // Catch:{ all -> 0x0074 }
            okio.d r7 = r5.f5386j     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f5389m     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            l5.d$d r0 = new l5.d$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r7 = r5.f5387k     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            l5.d$c r6 = new l5.d$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f5413f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f5395s     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f5396t     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.mo24043i(java.lang.String, long):l5.d$c");
    }

    public synchronized boolean isClosed() {
        return this.f5391o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p063l5.C3319d.C3320e mo24045k(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo24046l()     // Catch:{ all -> 0x0050 }
            r3.m9026a()     // Catch:{ all -> 0x0050 }
            r3.m9025D(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r0 = r3.f5387k     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            l5.d$d r0 = (p063l5.C3319d.C3325d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f5412e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            l5.d$e r0 = r0.mo24060c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f5388l     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f5388l = r1     // Catch:{ all -> 0x0050 }
            okio.d r1 = r3.f5386j     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.d r1 = r1.mo24757i0(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.d r1 = r1.mo24736R(r2)     // Catch:{ all -> 0x0050 }
            okio.d r4 = r1.mo24757i0(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.mo24736R(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo24047m()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f5395s     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f5396t     // Catch:{ all -> 0x0050 }
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
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.mo24045k(java.lang.String):l5.d$e");
    }

    /* renamed from: l */
    public synchronized void mo24046l() {
        if (!this.f5390n) {
            if (this.f5377a.mo41798d(this.f5381e)) {
                if (this.f5377a.mo41798d(this.f5379c)) {
                    this.f5377a.mo41800f(this.f5381e);
                } else {
                    this.f5377a.mo41799e(this.f5381e, this.f5379c);
                }
            }
            if (this.f5377a.mo41798d(this.f5379c)) {
                try {
                    m9030q();
                    m9029p();
                    this.f5390n = true;
                    return;
                } catch (IOException e) {
                    C3636f j = C3636f.m10368j();
                    j.mo25943q(5, "DiskLruCache " + this.f5378b + " is corrupt: " + e.getMessage() + ", removing", e);
                    mo24040f();
                    this.f5391o = false;
                } catch (Throwable th) {
                    this.f5391o = false;
                    throw th;
                }
            }
            mo24048v();
            this.f5390n = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo24047m() {
        int i = this.f5388l;
        return i >= 2000 && i >= this.f5387k.size();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public synchronized void mo24048v() {
        C9837d dVar = this.f5386j;
        if (dVar != null) {
            dVar.close();
        }
        C9837d c = C9845l.m23737c(this.f5377a.mo41796b(this.f5380d));
        try {
            c.mo24757i0("libcore.io.DiskLruCache").mo24736R(10);
            c.mo24757i0(TimerCodec.ENABLE).mo24736R(10);
            c.mo24744c1((long) this.f5382f).mo24736R(10);
            c.mo24744c1((long) this.f5384h).mo24736R(10);
            c.mo24736R(10);
            for (C3325d next : this.f5387k.values()) {
                if (next.f5413f != null) {
                    c.mo24757i0("DIRTY").mo24736R(32);
                    c.mo24757i0(next.f5408a);
                } else {
                    c.mo24757i0("CLEAN").mo24736R(32);
                    c.mo24757i0(next.f5408a);
                    next.mo24061d(c);
                }
                c.mo24736R(10);
            }
            c.close();
            if (this.f5377a.mo41798d(this.f5379c)) {
                this.f5377a.mo41799e(this.f5379c, this.f5381e);
            }
            this.f5377a.mo41799e(this.f5380d, this.f5379c);
            this.f5377a.mo41800f(this.f5381e);
            this.f5386j = m9028n();
            this.f5389m = false;
            this.f5393q = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo24049z(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo24046l()     // Catch:{ all -> 0x0029 }
            r6.m9026a()     // Catch:{ all -> 0x0029 }
            r6.m9025D(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, l5.d$d> r0 = r6.f5387k     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            l5.d$d r7 = (p063l5.C3319d.C3325d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo24036A(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f5385i     // Catch:{ all -> 0x0029 }
            long r3 = r6.f5383g     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f5392p = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3319d.mo24049z(java.lang.String):boolean");
    }
}
