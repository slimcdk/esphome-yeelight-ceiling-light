package org.eclipse.jetty.server.handler;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.C9279c;
import org.apache.commons.p194io.FilenameUtils;
import org.eclipse.jetty.http.C9916r;
import org.eclipse.jetty.util.C9978b;
import org.eclipse.jetty.util.C9979c;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9996o;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.LazyList;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;
import p157f6.C9042e;
import p208s4.C10356h;
import p208s4.C10359k;
import p208s4.C10360l;
import p208s4.C10365q;
import p208s4.C10366r;
import p225w5.C11940d;
import p239z5.C12151b;
import p239z5.C12172h;
import p239z5.C12175i;
import p239z5.C12181o;
import p239z5.C12187r;

/* renamed from: org.eclipse.jetty.server.handler.d */
public class C9943d extends C9951i implements C9978b, C12187r.C12188a {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final C9003c f18221d0 = C9001b.m21450a(C9943d.class);

    /* renamed from: e0 */
    private static final ThreadLocal<C9945b> f18222e0 = new ThreadLocal<>();

    /* renamed from: A */
    private EventListener[] f18223A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C9003c f18224B;

    /* renamed from: C */
    private boolean f18225C;

    /* renamed from: Q */
    private int f18226Q;

    /* renamed from: R */
    private int f18227R;

    /* renamed from: S */
    private boolean f18228S;

    /* renamed from: T */
    private boolean f18229T;

    /* renamed from: U */
    private Object f18230U;

    /* renamed from: V */
    private Object f18231V;

    /* renamed from: W */
    private Object f18232W;

    /* renamed from: X */
    private Object f18233X;

    /* renamed from: Y */
    private Map<String, Object> f18234Y;

    /* renamed from: Z */
    private String[] f18235Z;

    /* renamed from: a0 */
    private boolean f18236a0;

    /* renamed from: b0 */
    private boolean f18237b0;

    /* renamed from: c0 */
    private volatile int f18238c0;

    /* renamed from: n */
    protected C9945b f18239n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C9979c f18240o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C9979c f18241p;

    /* renamed from: q */
    private final Map<String, String> f18242q;

    /* renamed from: r */
    private ClassLoader f18243r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f18244s;

    /* renamed from: t */
    private String f18245t;

    /* renamed from: u */
    private C9042e f18246u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C9916r f18247v;

    /* renamed from: w */
    private String[] f18248w;

    /* renamed from: x */
    private C9947f f18249x;

    /* renamed from: y */
    private String[] f18250y;

    /* renamed from: z */
    private Set<String> f18251z;

    /* renamed from: org.eclipse.jetty.server.handler.d$a */
    private static class C9944a implements C8948d {

        /* renamed from: a */
        final ClassLoader f18252a;

        C9944a(ClassLoader classLoader) {
            this.f18252a = classLoader;
        }

        /* JADX WARNING: type inference failed for: r1v7, types: [org.eclipse.jetty.server.handler.d$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: p0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26544p0(java.lang.Appendable r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.ClassLoader r0 = r5.f18252a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.Appendable r0 = r6.append(r0)
                java.lang.String r1 = "\n"
                r0.append(r1)
                java.lang.ClassLoader r0 = r5.f18252a
                if (r0 == 0) goto L_0x004f
                java.lang.ClassLoader r0 = r0.getParent()
                if (r0 == 0) goto L_0x004f
                boolean r1 = r0 instanceof p147d6.C8948d
                if (r1 != 0) goto L_0x0023
                org.eclipse.jetty.server.handler.d$a r1 = new org.eclipse.jetty.server.handler.d$a
                r1.<init>(r0)
                r0 = r1
            L_0x0023:
                java.lang.ClassLoader r1 = r5.f18252a
                boolean r2 = r1 instanceof java.net.URLClassLoader
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0044
                r2 = 2
                java.util.Collection[] r2 = new java.util.Collection[r2]
                java.net.URLClassLoader r1 = (java.net.URLClassLoader) r1
                java.net.URL[] r1 = r1.getURLs()
                java.util.List r1 = org.eclipse.jetty.util.C9996o.m24714a(r1)
                r2[r3] = r1
                java.util.Set r0 = java.util.Collections.singleton(r0)
                r2[r4] = r0
                p147d6.C8942b.m21357G0(r6, r7, r2)
                goto L_0x004f
            L_0x0044:
                java.util.Collection[] r1 = new java.util.Collection[r4]
                java.util.Set r0 = java.util.Collections.singleton(r0)
                r1[r3] = r0
                p147d6.C8942b.m21357G0(r6, r7, r1)
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.server.handler.C9943d.C9944a.mo26544p0(java.lang.Appendable, java.lang.String):void");
        }
    }

    /* renamed from: org.eclipse.jetty.server.handler.d$b */
    public class C9945b implements C10359k {
        protected C9945b() {
        }

        /* renamed from: a */
        public synchronized Object mo39957a(String str) {
            Object a;
            a = C9943d.this.mo39576a(str);
            if (a == null && C9943d.this.f18241p != null) {
                a = C9943d.this.f18241p.mo39576a(str);
            }
            return a;
        }

        /* renamed from: b */
        public String mo39958b(String str) {
            C11940d b;
            if (C9943d.this.f18247v == null || (b = C9943d.this.f18247v.mo39860b(str)) == null) {
                return null;
            }
            return b.toString();
        }

        /* renamed from: c */
        public synchronized Enumeration mo39959c() {
            HashSet hashSet;
            hashSet = new HashSet();
            if (C9943d.this.f18241p != null) {
                Enumeration<String> e = C9943d.this.f18241p.mo40207e();
                while (e.hasMoreElements()) {
                    hashSet.add(e.nextElement());
                }
            }
            Enumeration<String> e2 = C9943d.this.f18240o.mo40207e();
            while (e2.hasMoreElements()) {
                hashSet.add(e2.nextElement());
            }
            return Collections.enumeration(hashSet);
        }

        /* renamed from: d */
        public C9943d mo39960d() {
            return C9943d.this;
        }

        /* renamed from: e */
        public String mo39961e() {
            return (C9943d.this.f18244s == null || !C9943d.this.f18244s.equals(MiotCloudImpl.COOKIE_PATH)) ? C9943d.this.f18244s : "";
        }

        /* renamed from: f */
        public Enumeration mo39962f() {
            return C9943d.this.mo39946q1();
        }

        /* renamed from: g */
        public C10356h mo39963g(String str) {
            String str2;
            if (str == null || !str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
                return null;
            }
            try {
                int indexOf = str.indexOf(63);
                if (indexOf > 0) {
                    str2 = str.substring(indexOf + 1);
                    str = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                return new C12172h(C9943d.this, C9997p.m24723a(mo39961e(), str), C9997p.m24724b(C9997p.m24726d(str)), str2);
            } catch (Exception e) {
                C9943d.f18221d0.mo36849d(e);
                return null;
            }
        }

        public String getInitParameter(String str) {
            return C9943d.this.getInitParameter(str);
        }

        public URL getResource(String str) {
            C9042e u1 = C9943d.this.mo39951u1(str);
            if (u1 == null || !u1.mo36919c()) {
                return null;
            }
            return u1.mo36938h();
        }

        /* renamed from: h */
        public void mo39966h(boolean z) {
        }

        public void log(String str) {
            C9943d.this.f18224B.mo36855i(str, new Object[0]);
        }

        public void log(String str, Throwable th) {
            C9943d.this.f18224B.mo36852g(str, th);
        }

        public String toString() {
            return "ServletContext@" + C9943d.this.toString();
        }
    }

    public C9943d() {
        this.f18244s = MiotCloudImpl.COOKIE_PATH;
        this.f18226Q = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this.f18227R = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this.f18228S = false;
        this.f18229T = false;
        this.f18236a0 = false;
        this.f18237b0 = true;
        this.f18239n = new C9945b();
        this.f18240o = new C9979c();
        this.f18241p = new C9979c();
        this.f18242q = new HashMap();
    }

    protected C9943d(C9945b bVar) {
        this.f18244s = MiotCloudImpl.COOKIE_PATH;
        this.f18226Q = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", 1000).intValue();
        this.f18227R = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", 200000).intValue();
        this.f18228S = false;
        this.f18229T = false;
        this.f18236a0 = false;
        this.f18237b0 = true;
        this.f18239n = bVar;
        this.f18240o = new C9979c();
        this.f18241p = new C9979c();
        this.f18242q = new HashMap();
    }

    /* renamed from: C1 */
    private String m24409C1(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    /* renamed from: m1 */
    public static C9945b m24416m1() {
        return f18222e0.get();
    }

    /* renamed from: A1 */
    public C9042e mo39925A1(String str) {
        return C9042e.m21617n(str);
    }

    /* renamed from: B1 */
    public C9042e mo39926B1(URL url) {
        return C9042e.m21619p(url);
    }

    /* renamed from: C */
    public void mo39927C(boolean z) {
        synchronized (this) {
            this.f18236a0 = z;
            this.f18238c0 = isRunning() ? this.f18236a0 ? 2 : this.f18237b0 ? 1 : 3 : 0;
        }
    }

    /* renamed from: D1 */
    public void mo39928D1(boolean z) {
        this.f18229T = z;
    }

    /* renamed from: E1 */
    public void mo39929E1(String str) {
        if (str == null || str.length() <= 1 || !str.endsWith(MiotCloudImpl.COOKIE_PATH)) {
            this.f18244s = str;
            if (mo39919c() == null) {
                return;
            }
            if (mo39919c().mo36745M() || mo39919c().mo36748n0()) {
                C12175i[] P = mo39919c().mo39921P(C9946e.class);
                int i = 0;
                while (P != null && i < P.length) {
                    ((C9946e) P[i]).mo39971U0();
                    i++;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ends with /");
    }

    /* renamed from: F1 */
    public void mo39930F1(C9947f fVar) {
        if (fVar != null) {
            fVar.mo26716i(mo39919c());
        }
        if (mo39919c() != null) {
            mo39919c().mo43169V0().mo36766f(this, this.f18249x, fVar, "errorHandler", true);
        }
        this.f18249x = fVar;
    }

    /* renamed from: G1 */
    public void mo39931G1(EventListener[] eventListenerArr) {
        this.f18230U = null;
        this.f18231V = null;
        this.f18232W = null;
        this.f18233X = null;
        this.f18223A = eventListenerArr;
        int i = 0;
        while (eventListenerArr != null && i < eventListenerArr.length) {
            EventListener eventListener = this.f18223A[i];
            if (eventListener instanceof C10360l) {
                this.f18230U = LazyList.add(this.f18230U, eventListener);
            }
            if (eventListener instanceof C10366r) {
                this.f18232W = LazyList.add(this.f18232W, eventListener);
            }
            if (eventListener instanceof C10365q) {
                this.f18233X = LazyList.add(this.f18233X, eventListener);
            }
            i++;
        }
    }

    /* renamed from: H1 */
    public void mo39932H1(String str, Object obj) {
        mo39919c().mo43169V0().mo36766f(this, this.f18234Y.put(str, obj), obj, str, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public void mo39933I1() {
        String str = this.f18242q.get("org.eclipse.jetty.server.context.ManagedAttributes");
        if (str != null) {
            this.f18234Y = new HashMap();
            for (String put : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                this.f18234Y.put(put, (Object) null);
            }
            Enumeration c = this.f18239n.mo39959c();
            while (c.hasMoreElements()) {
                String str2 = (String) c.nextElement();
                mo39938h1(str2, this.f18239n.mo39957a(str2));
            }
        }
        super.mo26547u0();
        C9947f fVar = this.f18249x;
        if (fVar != null) {
            fVar.start();
        }
        if (this.f18230U != null) {
            ServletContextEvent servletContextEvent = new ServletContextEvent(this.f18239n);
            for (int i = 0; i < LazyList.size(this.f18230U); i++) {
                mo39935f1((C10360l) LazyList.get(this.f18230U, i), servletContextEvent);
            }
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: T0 */
    public void mo26711T0(java.lang.String r7, p239z5.C12181o r8, javax.servlet.http.C9277a r9, javax.servlet.http.C9279c r10) {
        /*
            r6 = this;
            javax.servlet.DispatcherType r0 = r8.mo43079H()
            boolean r1 = r8.mo43084J0()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r2 = r6.f18233X     // Catch:{ HttpException -> 0x00b6 }
            r3 = 0
            if (r2 == 0) goto L_0x0024
            int r2 = org.eclipse.jetty.util.LazyList.size(r2)     // Catch:{ HttpException -> 0x00b6 }
            r4 = 0
        L_0x0014:
            if (r4 >= r2) goto L_0x0024
            java.lang.Object r5 = r6.f18233X     // Catch:{ HttpException -> 0x00b6 }
            java.lang.Object r5 = org.eclipse.jetty.util.LazyList.get(r5, r4)     // Catch:{ HttpException -> 0x00b6 }
            java.util.EventListener r5 = (java.util.EventListener) r5     // Catch:{ HttpException -> 0x00b6 }
            r8.mo43125x(r5)     // Catch:{ HttpException -> 0x00b6 }
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0024:
            java.lang.Object r2 = r6.f18232W     // Catch:{ HttpException -> 0x00b6 }
            if (r2 == 0) goto L_0x0043
            int r2 = org.eclipse.jetty.util.LazyList.size(r2)     // Catch:{ HttpException -> 0x00b6 }
            javax.servlet.ServletRequestEvent r4 = new javax.servlet.ServletRequestEvent     // Catch:{ HttpException -> 0x00b6 }
            org.eclipse.jetty.server.handler.d$b r5 = r6.f18239n     // Catch:{ HttpException -> 0x00b6 }
            r4.<init>(r5, r9)     // Catch:{ HttpException -> 0x00b6 }
        L_0x0033:
            if (r3 >= r2) goto L_0x0043
            java.lang.Object r5 = r6.f18232W     // Catch:{ HttpException -> 0x00b6 }
            java.lang.Object r5 = org.eclipse.jetty.util.LazyList.get(r5, r3)     // Catch:{ HttpException -> 0x00b6 }
            s4.r r5 = (p208s4.C10366r) r5     // Catch:{ HttpException -> 0x00b6 }
            r5.mo41957A(r4)     // Catch:{ HttpException -> 0x00b6 }
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0043:
            javax.servlet.DispatcherType r2 = javax.servlet.DispatcherType.REQUEST     // Catch:{ HttpException -> 0x00b6 }
            boolean r0 = r2.equals(r0)     // Catch:{ HttpException -> 0x00b6 }
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6.mo39956z1(r7)     // Catch:{ HttpException -> 0x00b6 }
            if (r0 != 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            org.eclipse.jetty.http.HttpException r7 = new org.eclipse.jetty.http.HttpException     // Catch:{ HttpException -> 0x00b6 }
            r0 = 404(0x194, float:5.66E-43)
            r7.<init>(r0)     // Catch:{ HttpException -> 0x00b6 }
            throw r7     // Catch:{ HttpException -> 0x00b6 }
        L_0x005a:
            boolean r0 = r6.mo39985V0()     // Catch:{ HttpException -> 0x00b6 }
            if (r0 == 0) goto L_0x0064
            r6.mo39986W0(r7, r8, r9, r10)     // Catch:{ HttpException -> 0x00b6 }
            goto L_0x0077
        L_0x0064:
            org.eclipse.jetty.server.handler.i r0 = r6.f18270l     // Catch:{ HttpException -> 0x00b6 }
            if (r0 == 0) goto L_0x0070
            z5.i r2 = r6.f18267j     // Catch:{ HttpException -> 0x00b6 }
            if (r0 != r2) goto L_0x0070
            r0.mo26711T0(r7, r8, r9, r10)     // Catch:{ HttpException -> 0x00b6 }
            goto L_0x0077
        L_0x0070:
            z5.i r0 = r6.f18267j     // Catch:{ HttpException -> 0x00b6 }
            if (r0 == 0) goto L_0x0077
            r0.mo39972q(r7, r8, r9, r10)     // Catch:{ HttpException -> 0x00b6 }
        L_0x0077:
            if (r1 == 0) goto L_0x0108
            java.lang.Object r7 = r6.f18232W
            if (r7 == 0) goto L_0x009b
            javax.servlet.ServletRequestEvent r7 = new javax.servlet.ServletRequestEvent
            org.eclipse.jetty.server.handler.d$b r10 = r6.f18239n
            r7.<init>(r10, r9)
            java.lang.Object r9 = r6.f18232W
            int r9 = org.eclipse.jetty.util.LazyList.size(r9)
        L_0x008a:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x009b
            java.lang.Object r9 = r6.f18232W
            java.lang.Object r9 = org.eclipse.jetty.util.LazyList.get(r9, r10)
            s4.r r9 = (p208s4.C10366r) r9
            r9.mo41958v(r7)
            r9 = r10
            goto L_0x008a
        L_0x009b:
            java.lang.Object r7 = r6.f18233X
            if (r7 == 0) goto L_0x0108
            int r7 = org.eclipse.jetty.util.LazyList.size(r7)
        L_0x00a3:
            int r9 = r7 + -1
            if (r7 <= 0) goto L_0x0108
            java.lang.Object r7 = r6.f18233X
            java.lang.Object r7 = org.eclipse.jetty.util.LazyList.get(r7, r9)
            java.util.EventListener r7 = (java.util.EventListener) r7
            r8.mo43106f0(r7)
            r7 = r9
            goto L_0x00a3
        L_0x00b4:
            r7 = move-exception
            goto L_0x0109
        L_0x00b6:
            r7 = move-exception
            e6.c r0 = f18221d0     // Catch:{ all -> 0x00b4 }
            r0.mo36848c(r7)     // Catch:{ all -> 0x00b4 }
            r0 = 1
            r8.mo43115o0(r0)     // Catch:{ all -> 0x00b4 }
            int r0 = r7.getStatus()     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = r7.getReason()     // Catch:{ all -> 0x00b4 }
            r10.mo37776d(r0, r7)     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r7 = r6.f18232W
            if (r7 == 0) goto L_0x00ef
            javax.servlet.ServletRequestEvent r7 = new javax.servlet.ServletRequestEvent
            org.eclipse.jetty.server.handler.d$b r10 = r6.f18239n
            r7.<init>(r10, r9)
            java.lang.Object r9 = r6.f18232W
            int r9 = org.eclipse.jetty.util.LazyList.size(r9)
        L_0x00de:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x00ef
            java.lang.Object r9 = r6.f18232W
            java.lang.Object r9 = org.eclipse.jetty.util.LazyList.get(r9, r10)
            s4.r r9 = (p208s4.C10366r) r9
            r9.mo41958v(r7)
            r9 = r10
            goto L_0x00de
        L_0x00ef:
            java.lang.Object r7 = r6.f18233X
            if (r7 == 0) goto L_0x0108
            int r7 = org.eclipse.jetty.util.LazyList.size(r7)
        L_0x00f7:
            int r9 = r7 + -1
            if (r7 <= 0) goto L_0x0108
            java.lang.Object r7 = r6.f18233X
            java.lang.Object r7 = org.eclipse.jetty.util.LazyList.get(r7, r9)
            java.util.EventListener r7 = (java.util.EventListener) r7
            r8.mo43106f0(r7)
            r7 = r9
            goto L_0x00f7
        L_0x0108:
            return
        L_0x0109:
            if (r1 == 0) goto L_0x0146
            java.lang.Object r10 = r6.f18232W
            if (r10 == 0) goto L_0x012d
            javax.servlet.ServletRequestEvent r10 = new javax.servlet.ServletRequestEvent
            org.eclipse.jetty.server.handler.d$b r0 = r6.f18239n
            r10.<init>(r0, r9)
            java.lang.Object r9 = r6.f18232W
            int r9 = org.eclipse.jetty.util.LazyList.size(r9)
        L_0x011c:
            int r0 = r9 + -1
            if (r9 <= 0) goto L_0x012d
            java.lang.Object r9 = r6.f18232W
            java.lang.Object r9 = org.eclipse.jetty.util.LazyList.get(r9, r0)
            s4.r r9 = (p208s4.C10366r) r9
            r9.mo41958v(r10)
            r9 = r0
            goto L_0x011c
        L_0x012d:
            java.lang.Object r9 = r6.f18233X
            if (r9 == 0) goto L_0x0146
            int r9 = org.eclipse.jetty.util.LazyList.size(r9)
        L_0x0135:
            int r10 = r9 + -1
            if (r9 <= 0) goto L_0x0146
            java.lang.Object r9 = r6.f18233X
            java.lang.Object r9 = org.eclipse.jetty.util.LazyList.get(r9, r10)
            java.util.EventListener r9 = (java.util.EventListener) r9
            r8.mo43106f0(r9)
            r9 = r10
            goto L_0x0135
        L_0x0146:
            goto L_0x0148
        L_0x0147:
            throw r7
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.server.handler.C9943d.mo26711T0(java.lang.String, z5.o, javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0117 A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b A[Catch:{ all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26712U0(java.lang.String r18, p239z5.C12181o r19, javax.servlet.http.C9277a r20, javax.servlet.http.C9279c r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r0 = r20
            r3 = r21
            e6.c r4 = f18221d0
            boolean r5 = r4.mo36846a()
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 4
            r10 = 1
            if (r5 == 0) goto L_0x0030
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r11 = r19.mo37761e()
            r5[r8] = r11
            java.lang.String r11 = r19.mo37771s()
            r5[r10] = r11
            java.lang.String r11 = r19.mo37763g()
            r5[r7] = r11
            r5[r6] = r1
            java.lang.String r11 = "scope {}|{}|{} @ {}"
            r4.mo36850e(r11, r5)
        L_0x0030:
            javax.servlet.DispatcherType r5 = r19.mo43079H()
            org.eclipse.jetty.server.handler.d$b r11 = r19.mo43077G()
            org.eclipse.jetty.server.handler.d$b r12 = r1.f18239n
            java.lang.String r13 = "/"
            if (r11 == r12) goto L_0x00a6
            javax.servlet.DispatcherType r12 = javax.servlet.DispatcherType.REQUEST
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0053
            javax.servlet.DispatcherType r12 = javax.servlet.DispatcherType.ASYNC
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            r6 = r18
        L_0x0051:
            r12 = r6
            goto L_0x0092
        L_0x0053:
            boolean r12 = r1.f18228S
            if (r12 == 0) goto L_0x005c
            java.lang.String r12 = org.eclipse.jetty.util.C9997p.m24725c(r18)
            goto L_0x005e
        L_0x005c:
            r12 = r18
        L_0x005e:
            boolean r15 = r1.mo39936g1(r12, r2, r3)
            if (r15 != 0) goto L_0x0065
            return
        L_0x0065:
            int r15 = r12.length()
            java.lang.String r6 = r1.f18244s
            int r6 = r6.length()
            if (r15 <= r6) goto L_0x0086
            java.lang.String r6 = r1.f18244s
            int r6 = r6.length()
            if (r6 <= r10) goto L_0x0084
            java.lang.String r6 = r1.f18244s
            int r6 = r6.length()
            java.lang.String r6 = r12.substring(r6)
            r12 = r6
        L_0x0084:
            r6 = r12
            goto L_0x0092
        L_0x0086:
            java.lang.String r6 = r1.f18244s
            int r6 = r6.length()
            if (r6 != r10) goto L_0x0090
            r6 = r13
            goto L_0x0051
        L_0x0090:
            r12 = r13
            r6 = 0
        L_0x0092:
            java.lang.ClassLoader r15 = r1.f18243r
            if (r15 == 0) goto L_0x00a9
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r16 = r15.getContextClassLoader()
            java.lang.ClassLoader r7 = r1.f18243r
            r15.setContextClassLoader(r7)
            r7 = r16
            goto L_0x00ab
        L_0x00a6:
            r6 = r18
            r12 = r6
        L_0x00a9:
            r7 = 0
            r15 = 0
        L_0x00ab:
            java.lang.String r8 = r19.mo37761e()     // Catch:{ all -> 0x015c }
            java.lang.String r9 = r19.mo37771s()     // Catch:{ all -> 0x0156 }
            java.lang.String r14 = r19.mo37763g()     // Catch:{ all -> 0x0152 }
            org.eclipse.jetty.server.handler.d$b r10 = r1.f18239n     // Catch:{ all -> 0x014f }
            r2.mo43112l0(r10)     // Catch:{ all -> 0x014f }
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r10 = f18222e0     // Catch:{ all -> 0x014f }
            r18 = r14
            org.eclipse.jetty.server.handler.d$b r14 = r1.f18239n     // Catch:{ all -> 0x014b }
            r10.set(r14)     // Catch:{ all -> 0x014b }
            javax.servlet.DispatcherType r14 = javax.servlet.DispatcherType.INCLUDE     // Catch:{ all -> 0x014b }
            boolean r5 = r14.equals(r5)     // Catch:{ all -> 0x014b }
            if (r5 != 0) goto L_0x00eb
            boolean r5 = r12.startsWith(r13)     // Catch:{ all -> 0x014b }
            if (r5 == 0) goto L_0x00eb
            java.lang.String r5 = r1.f18244s     // Catch:{ all -> 0x014b }
            int r5 = r5.length()     // Catch:{ all -> 0x014b }
            r13 = 1
            if (r5 != r13) goto L_0x00df
            java.lang.String r5 = ""
            goto L_0x00e1
        L_0x00df:
            java.lang.String r5 = r1.f18244s     // Catch:{ all -> 0x014b }
        L_0x00e1:
            r2.mo43113m0(r5)     // Catch:{ all -> 0x014b }
            r5 = 0
            r2.mo43072D0(r5)     // Catch:{ all -> 0x014b }
            r2.mo43118r0(r6)     // Catch:{ all -> 0x014b }
        L_0x00eb:
            boolean r5 = r4.mo36846a()     // Catch:{ all -> 0x014b }
            if (r5 == 0) goto L_0x0111
            java.lang.String r5 = "context={}|{}|{} @ {}"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x014b }
            java.lang.String r13 = r19.mo37761e()     // Catch:{ all -> 0x014b }
            r14 = 0
            r6[r14] = r13     // Catch:{ all -> 0x014b }
            java.lang.String r13 = r19.mo37771s()     // Catch:{ all -> 0x014b }
            r14 = 1
            r6[r14] = r13     // Catch:{ all -> 0x014b }
            java.lang.String r13 = r19.mo37763g()     // Catch:{ all -> 0x014b }
            r14 = 2
            r6[r14] = r13     // Catch:{ all -> 0x014b }
            r13 = 3
            r6[r13] = r1     // Catch:{ all -> 0x014b }
            r4.mo36850e(r5, r6)     // Catch:{ all -> 0x014b }
        L_0x0111:
            boolean r4 = r17.mo39985V0()     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x011b
            r1.mo39987X0(r12, r2, r0, r3)     // Catch:{ all -> 0x014b }
            goto L_0x012e
        L_0x011b:
            org.eclipse.jetty.server.handler.i r4 = r1.f18270l     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0123
            r4.mo26712U0(r12, r2, r0, r3)     // Catch:{ all -> 0x014b }
            goto L_0x012e
        L_0x0123:
            org.eclipse.jetty.server.handler.i r4 = r1.f18269k     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x012b
            r4.mo26711T0(r12, r2, r0, r3)     // Catch:{ all -> 0x014b }
            goto L_0x012e
        L_0x012b:
            r1.mo26711T0(r12, r2, r0, r3)     // Catch:{ all -> 0x014b }
        L_0x012e:
            org.eclipse.jetty.server.handler.d$b r0 = r1.f18239n
            if (r11 == r0) goto L_0x014a
            java.lang.ClassLoader r0 = r1.f18243r
            if (r0 == 0) goto L_0x0139
            r15.setContextClassLoader(r7)
        L_0x0139:
            r2.mo43112l0(r11)
            r10.set(r11)
            r2.mo43113m0(r8)
            r2.mo43072D0(r9)
            r3 = r18
            r2.mo43118r0(r3)
        L_0x014a:
            return
        L_0x014b:
            r0 = move-exception
            r3 = r18
            goto L_0x015a
        L_0x014f:
            r0 = move-exception
            r3 = r14
            goto L_0x015a
        L_0x0152:
            r0 = move-exception
            r5 = 0
            r3 = r5
            goto L_0x015a
        L_0x0156:
            r0 = move-exception
            r5 = 0
            r3 = r5
            r9 = r3
        L_0x015a:
            r14 = r8
            goto L_0x0161
        L_0x015c:
            r0 = move-exception
            r5 = 0
            r3 = r5
            r9 = r3
            r14 = r9
        L_0x0161:
            org.eclipse.jetty.server.handler.d$b r4 = r1.f18239n
            if (r11 == r4) goto L_0x017d
            java.lang.ClassLoader r4 = r1.f18243r
            if (r4 == 0) goto L_0x016c
            r15.setContextClassLoader(r7)
        L_0x016c:
            r2.mo43112l0(r11)
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r4 = f18222e0
            r4.set(r11)
            r2.mo43113m0(r14)
            r2.mo43072D0(r9)
            r2.mo43118r0(r3)
        L_0x017d:
            goto L_0x017f
        L_0x017e:
            throw r0
        L_0x017f:
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.server.handler.C9943d.mo26712U0(java.lang.String, z5.o, javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* renamed from: a */
    public Object mo39576a(String str) {
        return this.f18240o.mo39576a(str);
    }

    /* renamed from: b */
    public void mo39578b(String str, Object obj) {
        mo39938h1(str, obj);
        this.f18240o.mo39578b(str, obj);
    }

    /* renamed from: b0 */
    public void mo39579b0() {
        Enumeration<String> e = this.f18240o.mo40207e();
        while (e.hasMoreElements()) {
            mo39938h1(e.nextElement(), (Object) null);
        }
        this.f18240o.mo39579b0();
    }

    /* renamed from: d */
    public void mo39582d(String str) {
        mo39938h1(str, (Object) null);
        this.f18240o.mo39582d(str);
    }

    /* renamed from: e1 */
    public void mo39934e1(EventListener eventListener) {
        mo39931G1((EventListener[]) LazyList.addToArray(mo39945p1(), eventListener, EventListener.class));
    }

    /* renamed from: f1 */
    public void mo39935f1(C10360l lVar, ServletContextEvent servletContextEvent) {
        lVar.mo41942g(servletContextEvent);
        f18221d0.mo36855i("started {}", this);
    }

    /* renamed from: g1 */
    public boolean mo39936g1(String str, C12181o oVar, C9279c cVar) {
        String str2;
        String name;
        DispatcherType H = oVar.mo43079H();
        int i = this.f18238c0;
        if (!(i == 0 || i == 2)) {
            if (i == 3) {
                oVar.mo43115o0(true);
                cVar.mo37778k(TypedValues.PositionType.TYPE_PERCENT_WIDTH);
            } else if (DispatcherType.REQUEST.equals(H) && oVar.mo43100Z()) {
                return false;
            } else {
                String[] strArr = this.f18250y;
                if (strArr != null && strArr.length > 0) {
                    String C1 = m24409C1(oVar.mo41952q());
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        String[] strArr2 = this.f18250y;
                        if (i2 >= strArr2.length) {
                            break;
                        }
                        String str3 = strArr2[i2];
                        if (str3 != null) {
                            if (str3.startsWith("*.")) {
                                z = str3.regionMatches(true, 2, C1, C1.indexOf(".") + 1, str3.length() - 2);
                            } else {
                                z = str3.equalsIgnoreCase(C1);
                            }
                        }
                        i2++;
                    }
                    if (!z) {
                        return false;
                    }
                }
                Set<String> set = this.f18251z;
                if (set != null && set.size() > 0 && ((name = C12151b.m31593o().mo42987n().getName()) == null || !this.f18251z.contains(name))) {
                    return false;
                }
                if (this.f18244s.length() > 1) {
                    if (!str.startsWith(this.f18244s)) {
                        return false;
                    }
                    if (str.length() > this.f18244s.length() && str.charAt(this.f18244s.length()) != '/') {
                        return false;
                    }
                    if (!this.f18225C && this.f18244s.length() == str.length()) {
                        oVar.mo43115o0(true);
                        if (oVar.mo37773u() != null) {
                            str2 = C9997p.m24723a(oVar.mo37774w(), MiotCloudImpl.COOKIE_PATH) + "?" + oVar.mo37773u();
                        } else {
                            str2 = C9997p.m24723a(oVar.mo37774w(), MiotCloudImpl.COOKIE_PATH);
                        }
                        cVar.mo37783q(str2);
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String getInitParameter(String str) {
        return this.f18242q.get(str);
    }

    /* renamed from: h1 */
    public void mo39938h1(String str, Object obj) {
        Map<String, Object> map = this.f18234Y;
        if (map != null && map.containsKey(str)) {
            mo39932H1(str, obj);
        }
    }

    /* renamed from: i */
    public void mo26716i(C12187r rVar) {
        if (this.f18249x != null) {
            C12187r c = mo39919c();
            if (!(c == null || c == rVar)) {
                c.mo43169V0().mo36766f(this, this.f18249x, (Object) null, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, true);
            }
            super.mo26716i(rVar);
            if (!(rVar == null || rVar == c)) {
                rVar.mo43169V0().mo36766f(this, (Object) null, this.f18249x, XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, true);
            }
            this.f18249x.mo26716i(rVar);
            return;
        }
        super.mo26716i(rVar);
    }

    /* renamed from: i1 */
    public C9042e mo39939i1() {
        C9042e eVar = this.f18246u;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    /* renamed from: j1 */
    public ClassLoader mo39940j1() {
        return this.f18243r;
    }

    /* renamed from: k1 */
    public String mo39941k1() {
        ClassLoader classLoader = this.f18243r;
        if (classLoader == null || !(classLoader instanceof URLClassLoader)) {
            return null;
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < uRLs.length; i++) {
            try {
                File e = mo39926B1(uRLs[i]).mo36920e();
                if (e != null && e.exists()) {
                    if (sb.length() > 0) {
                        sb.append(File.pathSeparatorChar);
                    }
                    sb.append(e.getAbsolutePath());
                }
            } catch (IOException e2) {
                f18221d0.mo36848c(e2);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: l1 */
    public String mo39942l1() {
        return this.f18244s;
    }

    /* renamed from: n1 */
    public String mo39943n1() {
        return this.f18245t;
    }

    /* renamed from: o1 */
    public C9947f mo39944o1() {
        return this.f18249x;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        mo36757J0(appendable);
        C8942b.m21357G0(appendable, str, Collections.singletonList(new C9944a(mo39940j1())), C9996o.m24714a(mo39981o()), mo36759L0(), this.f18242q.entrySet(), this.f18240o.mo40206c(), this.f18241p.mo40206c());
    }

    /* renamed from: p1 */
    public EventListener[] mo39945p1() {
        return this.f18223A;
    }

    /* renamed from: q1 */
    public Enumeration mo39946q1() {
        return Collections.enumeration(this.f18242q.keySet());
    }

    /* renamed from: r1 */
    public int mo39947r1() {
        return this.f18227R;
    }

    /* renamed from: s1 */
    public int mo39948s1() {
        return this.f18226Q;
    }

    /* renamed from: t1 */
    public C9916r mo39949t1() {
        if (this.f18247v == null) {
            this.f18247v = new C9916r();
        }
        return this.f18247v;
    }

    public String toString() {
        String name;
        String[] w1 = mo39953w1();
        StringBuilder sb = new StringBuilder();
        Package packageR = getClass().getPackage();
        if (!(packageR == null || (name = packageR.getName()) == null || name.length() <= 0)) {
            for (String charAt : name.split("\\.")) {
                sb.append(charAt.charAt(0));
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            }
        }
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(mo39942l1());
        sb.append(',');
        sb.append(mo39939i1());
        if (w1 != null && w1.length > 0) {
            sb.append(',');
            sb.append(w1[0]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007f  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26547u0() {
        /*
            r5 = this;
            r0 = 0
            r5.f18238c0 = r0
            java.lang.String r0 = r5.f18244s
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = r5.mo39943n1()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = r5.mo39942l1()
            goto L_0x0016
        L_0x0012:
            java.lang.String r0 = r5.mo39943n1()
        L_0x0016:
            e6.c r0 = p152e6.C9001b.m21451b(r0)
            r5.f18224B = r0
            r0 = 0
            java.lang.ClassLoader r1 = r5.f18243r     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0032
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0073 }
            java.lang.ClassLoader r2 = r1.getContextClassLoader()     // Catch:{ all -> 0x002f }
            java.lang.ClassLoader r3 = r5.f18243r     // Catch:{ all -> 0x0071 }
            r1.setContextClassLoader(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0034
        L_0x002f:
            r3 = move-exception
            r2 = r0
            goto L_0x0076
        L_0x0032:
            r1 = r0
            r2 = r1
        L_0x0034:
            org.eclipse.jetty.http.r r3 = r5.f18247v     // Catch:{ all -> 0x0071 }
            if (r3 != 0) goto L_0x003f
            org.eclipse.jetty.http.r r3 = new org.eclipse.jetty.http.r     // Catch:{ all -> 0x0071 }
            r3.<init>()     // Catch:{ all -> 0x0071 }
            r5.f18247v = r3     // Catch:{ all -> 0x0071 }
        L_0x003f:
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r3 = f18222e0     // Catch:{ all -> 0x0071 }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x0071 }
            org.eclipse.jetty.server.handler.d$b r4 = (org.eclipse.jetty.server.handler.C9943d.C9945b) r4     // Catch:{ all -> 0x0071 }
            org.eclipse.jetty.server.handler.d$b r0 = r5.f18239n     // Catch:{ all -> 0x006e }
            r3.set(r0)     // Catch:{ all -> 0x006e }
            r5.mo39933I1()     // Catch:{ all -> 0x006e }
            monitor-enter(r5)     // Catch:{ all -> 0x006e }
            boolean r0 = r5.f18236a0     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0056
            r0 = 2
            goto L_0x005d
        L_0x0056:
            boolean r0 = r5.f18237b0     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 3
        L_0x005d:
            r5.f18238c0 = r0     // Catch:{ all -> 0x006b }
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            r3.set(r4)
            java.lang.ClassLoader r0 = r5.f18243r
            if (r0 == 0) goto L_0x006a
            r1.setContextClassLoader(r2)
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r3 = move-exception
            r0 = r4
            goto L_0x0076
        L_0x0071:
            r3 = move-exception
            goto L_0x0076
        L_0x0073:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0076:
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r4 = f18222e0
            r4.set(r0)
            java.lang.ClassLoader r0 = r5.f18243r
            if (r0 == 0) goto L_0x0082
            r1.setContextClassLoader(r2)
        L_0x0082:
            throw r3
        L_0x0083:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Null contextPath"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.server.handler.C9943d.mo26547u0():void");
    }

    /* renamed from: u1 */
    public C9042e mo39951u1(String str) {
        if (str == null || !str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            throw new MalformedURLException(str);
        } else if (this.f18246u == null) {
            return null;
        } else {
            try {
                String b = C9997p.m24724b(str);
                C9042e a = this.f18246u.mo36927a(b);
                if (this.f18229T || a.mo36928d() == null) {
                    return a;
                }
                if (a.mo36919c()) {
                    C9003c cVar = f18221d0;
                    cVar.mo36847b("Aliased resource: " + a + "~=" + a.mo36928d(), new Object[0]);
                } else if (b.endsWith(MiotCloudImpl.COOKIE_PATH) && a.mo36928d().toString().endsWith(b)) {
                    return a;
                } else {
                    C9003c cVar2 = f18221d0;
                    if (cVar2.mo36846a()) {
                        cVar2.mo36850e("Aliased resource: " + a + "~=" + a.mo36928d(), new Object[0]);
                    }
                }
                return null;
            } catch (Exception e) {
                f18221d0.mo36849d(e);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26548v0() {
        /*
            r11 = this;
            java.lang.String r0 = "stopped {}"
            r1 = 0
            r11.f18238c0 = r1
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r2 = f18222e0
            java.lang.Object r3 = r2.get()
            org.eclipse.jetty.server.handler.d$b r3 = (org.eclipse.jetty.server.handler.C9943d.C9945b) r3
            org.eclipse.jetty.server.handler.d$b r4 = r11.f18239n
            r2.set(r4)
            r2 = 1
            r4 = 0
            java.lang.ClassLoader r5 = r11.f18243r     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x002b
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008c }
            java.lang.ClassLoader r6 = r5.getContextClassLoader()     // Catch:{ all -> 0x0026 }
            java.lang.ClassLoader r7 = r11.f18243r     // Catch:{ all -> 0x008a }
            r5.setContextClassLoader(r7)     // Catch:{ all -> 0x008a }
            goto L_0x002d
        L_0x0026:
            r6 = move-exception
            r10 = r6
            r6 = r4
            r4 = r10
            goto L_0x0090
        L_0x002b:
            r5 = r4
            r6 = r5
        L_0x002d:
            super.mo26548v0()     // Catch:{ all -> 0x008a }
            java.lang.Object r7 = r11.f18230U     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0052
            javax.servlet.ServletContextEvent r7 = new javax.servlet.ServletContextEvent     // Catch:{ all -> 0x008a }
            org.eclipse.jetty.server.handler.d$b r8 = r11.f18239n     // Catch:{ all -> 0x008a }
            r7.<init>(r8)     // Catch:{ all -> 0x008a }
            java.lang.Object r8 = r11.f18230U     // Catch:{ all -> 0x008a }
            int r8 = org.eclipse.jetty.util.LazyList.size(r8)     // Catch:{ all -> 0x008a }
        L_0x0041:
            int r9 = r8 + -1
            if (r8 <= 0) goto L_0x0052
            java.lang.Object r8 = r11.f18230U     // Catch:{ all -> 0x008a }
            java.lang.Object r8 = org.eclipse.jetty.util.LazyList.get(r8, r9)     // Catch:{ all -> 0x008a }
            s4.l r8 = (p208s4.C10360l) r8     // Catch:{ all -> 0x008a }
            r8.mo41943m(r7)     // Catch:{ all -> 0x008a }
            r8 = r9
            goto L_0x0041
        L_0x0052:
            org.eclipse.jetty.server.handler.f r7 = r11.f18249x     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0059
            r7.stop()     // Catch:{ all -> 0x008a }
        L_0x0059:
            org.eclipse.jetty.server.handler.d$b r7 = r11.f18239n     // Catch:{ all -> 0x008a }
            java.util.Enumeration r7 = r7.mo39959c()     // Catch:{ all -> 0x008a }
        L_0x005f:
            boolean r8 = r7.hasMoreElements()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x006f
            java.lang.Object r8 = r7.nextElement()     // Catch:{ all -> 0x008a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x008a }
            r11.mo39938h1(r8, r4)     // Catch:{ all -> 0x008a }
            goto L_0x005f
        L_0x006f:
            e6.c r4 = f18221d0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r4.mo36855i(r0, r2)
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r0 = f18222e0
            r0.set(r3)
            java.lang.ClassLoader r0 = r11.f18243r
            if (r0 == 0) goto L_0x0084
            r5.setContextClassLoader(r6)
        L_0x0084:
            org.eclipse.jetty.util.c r0 = r11.f18241p
            r0.mo39579b0()
            return
        L_0x008a:
            r4 = move-exception
            goto L_0x0090
        L_0x008c:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r6
        L_0x0090:
            e6.c r7 = f18221d0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r7.mo36855i(r0, r2)
            java.lang.ThreadLocal<org.eclipse.jetty.server.handler.d$b> r0 = f18222e0
            r0.set(r3)
            java.lang.ClassLoader r0 = r11.f18243r
            if (r0 == 0) goto L_0x00a5
            r5.setContextClassLoader(r6)
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r4
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.server.handler.C9943d.mo26548v0():void");
    }

    /* renamed from: v1 */
    public C9945b mo39952v1() {
        return this.f18239n;
    }

    /* renamed from: w1 */
    public String[] mo39953w1() {
        return this.f18250y;
    }

    /* renamed from: x1 */
    public String[] mo39954x1() {
        return this.f18248w;
    }

    /* renamed from: y1 */
    public boolean mo39955y1() {
        return this.f18229T;
    }

    /* renamed from: z1 */
    public boolean mo39956z1(String str) {
        boolean z = false;
        if (str != null && this.f18235Z != null) {
            while (str.startsWith("//")) {
                str = C9997p.m24725c(str);
            }
            int i = 0;
            while (!z) {
                String[] strArr = this.f18235Z;
                if (i >= strArr.length) {
                    break;
                }
                boolean g = C9995n.m24711g(str, strArr[i]);
                i++;
                z = g;
            }
        }
        return z;
    }
}
