package p239z5;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.server.handler.C9943d;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p208s4.C10349a;
import p208s4.C10350b;
import p208s4.C10351c;
import p208s4.C10359k;
import p208s4.C10364p;
import p208s4.C10368t;
import p221v5.C10545a;
import p221v5.C10546b;
import p225w5.C11939c;
import p225w5.C11950k;

/* renamed from: z5.c */
public class C12156c implements C10349a, C10545a {

    /* renamed from: n */
    private static final C9003c f22372n = C9001b.m21450a(C12156c.class);

    /* renamed from: a */
    protected C12151b f22373a;

    /* renamed from: b */
    private List<C10351c> f22374b;

    /* renamed from: c */
    private List<C10351c> f22375c;

    /* renamed from: d */
    private List<C10546b> f22376d;

    /* renamed from: e */
    private int f22377e = 0;

    /* renamed from: f */
    private boolean f22378f = true;

    /* renamed from: g */
    private boolean f22379g;

    /* renamed from: h */
    private boolean f22380h;

    /* renamed from: i */
    private volatile boolean f22381i;

    /* renamed from: j */
    private long f22382j = 30000;

    /* renamed from: k */
    private C12157a f22383k;

    /* renamed from: l */
    private volatile long f22384l;

    /* renamed from: m */
    private volatile boolean f22385m;

    /* renamed from: z5.c$a */
    public class C12157a extends C10350b {

        /* renamed from: d */
        private final C10359k f22386d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10359k f22387e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f22388f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C9128e.C9129a f22389g;

        public C12157a(C10359k kVar, C10364p pVar, C10368t tVar) {
            super(C12156c.this, pVar, tVar);
            Object obj;
            this.f22389g = new C12158b();
            this.f22386d = kVar;
            C12181o v = C12156c.this.f22373a.mo42994v();
            if (v.mo40040a("javax.servlet.async.request_uri") == null) {
                String str = (String) v.mo40040a("javax.servlet.forward.request_uri");
                if (str != null) {
                    v.mo41944b("javax.servlet.async.request_uri", str);
                    v.mo41944b("javax.servlet.async.context_path", v.mo40040a("javax.servlet.forward.context_path"));
                    v.mo41944b("javax.servlet.async.servlet_path", v.mo40040a("javax.servlet.forward.servlet_path"));
                    v.mo41944b("javax.servlet.async.path_info", v.mo40040a("javax.servlet.forward.path_info"));
                    obj = v.mo40040a("javax.servlet.forward.query_string");
                } else {
                    v.mo41944b("javax.servlet.async.request_uri", v.mo37774w());
                    v.mo41944b("javax.servlet.async.context_path", v.mo37761e());
                    v.mo41944b("javax.servlet.async.servlet_path", v.mo37771s());
                    v.mo41944b("javax.servlet.async.path_info", v.mo37763g());
                    obj = v.mo37773u();
                }
                v.mo41944b("javax.servlet.async.query_string", obj);
            }
        }

        /* renamed from: g */
        public String mo43028g() {
            return this.f22388f;
        }

        /* renamed from: h */
        public C10359k mo43029h() {
            C10359k kVar = this.f22387e;
            return kVar == null ? this.f22386d : kVar;
        }
    }

    /* renamed from: z5.c$b */
    public class C12158b extends C9128e.C9129a implements Runnable {
        public C12158b() {
        }

        /* renamed from: f */
        public void mo37217f() {
            C12156c.this.mo43011k();
        }

        public void run() {
            C12156c.this.mo43011k();
        }
    }

    static {
        new ContinuationThrowable();
    }

    protected C12156c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31639j(p208s4.C10359k r3, p208s4.C10364p r4, p208s4.C10368t r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f22377e     // Catch:{ all -> 0x007a }
            r1 = 1
            if (r0 == r1) goto L_0x0014
            r1 = 6
            if (r0 != r1) goto L_0x000a
            goto L_0x0014
        L_0x000a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r2.mo43016p()     // Catch:{ all -> 0x007a }
            r3.<init>(r4)     // Catch:{ all -> 0x007a }
            throw r3     // Catch:{ all -> 0x007a }
        L_0x0014:
            r0 = 0
            r2.f22379g = r0     // Catch:{ all -> 0x007a }
            r2.f22380h = r0     // Catch:{ all -> 0x007a }
            z5.c$a r0 = r2.f22383k     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0040
            s4.p r0 = r0.mo41934a()     // Catch:{ all -> 0x007a }
            if (r4 != r0) goto L_0x0040
            z5.c$a r0 = r2.f22383k     // Catch:{ all -> 0x007a }
            s4.t r0 = r0.mo41935b()     // Catch:{ all -> 0x007a }
            if (r5 != r0) goto L_0x0040
            z5.c$a r0 = r2.f22383k     // Catch:{ all -> 0x007a }
            s4.k r0 = r0.mo43029h()     // Catch:{ all -> 0x007a }
            if (r3 == r0) goto L_0x0034
            goto L_0x0040
        L_0x0034:
            z5.c$a r3 = r2.f22383k     // Catch:{ all -> 0x007a }
            r4 = 0
            p208s4.C10359k unused = r3.f22387e = r4     // Catch:{ all -> 0x007a }
            z5.c$a r3 = r2.f22383k     // Catch:{ all -> 0x007a }
            java.lang.String unused = r3.f22388f = r4     // Catch:{ all -> 0x007a }
            goto L_0x0047
        L_0x0040:
            z5.c$a r0 = new z5.c$a     // Catch:{ all -> 0x007a }
            r0.<init>(r3, r4, r5)     // Catch:{ all -> 0x007a }
            r2.f22383k = r0     // Catch:{ all -> 0x007a }
        L_0x0047:
            r3 = 2
            r2.f22377e = r3     // Catch:{ all -> 0x007a }
            java.util.List<s4.c> r3 = r2.f22374b     // Catch:{ all -> 0x007a }
            java.util.List<s4.c> r4 = r2.f22375c     // Catch:{ all -> 0x007a }
            r2.f22374b = r4     // Catch:{ all -> 0x007a }
            r2.f22375c = r3     // Catch:{ all -> 0x007a }
            if (r3 == 0) goto L_0x0057
            r3.clear()     // Catch:{ all -> 0x007a }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            java.util.List<s4.c> r3 = r2.f22374b
            if (r3 == 0) goto L_0x0079
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()
            s4.c r4 = (p208s4.C10351c) r4
            z5.c$a r5 = r2.f22383k     // Catch:{ Exception -> 0x0072 }
            r4.mo40722H(r5)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0060
        L_0x0072:
            r4 = move-exception
            e6.c r5 = f22372n
            r5.mo36856j(r4)
            goto L_0x0060
        L_0x0079:
            return
        L_0x007a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007d:
            throw r3
        L_0x007e:
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.m31639j(s4.k, s4.p, s4.t):void");
    }

    /* renamed from: A */
    public void mo43004A() {
        this.f22381i = false;
        this.f22385m = true;
        m31639j(this.f22373a.mo42994v().mo43092R(), this.f22373a.mo42994v(), this.f22373a.mo42998z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo43005B() {
        synchronized (this) {
            int i = this.f22377e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f22378f = false;
                        this.f22377e = 4;
                        mo43026y();
                        int i2 = this.f22377e;
                        if (i2 == 4) {
                            return true;
                        }
                        if (i2 == 7) {
                            this.f22377e = 8;
                            return true;
                        }
                        this.f22378f = false;
                        this.f22377e = 6;
                        return false;
                    } else if (i == 3) {
                        this.f22378f = false;
                        this.f22377e = 6;
                        return false;
                    } else if (i != 6) {
                        if (i == 7) {
                            this.f22378f = false;
                            this.f22377e = 8;
                            return true;
                        }
                        throw new IllegalStateException(mo43016p());
                    }
                }
                this.f22377e = 8;
                return true;
            }
            throw new IllegalStateException(mo43016p());
        }
    }

    /* renamed from: a */
    public void mo41930a(C10351c cVar) {
        synchronized (this) {
            if (this.f22375c == null) {
                this.f22375c = new ArrayList();
            }
            this.f22375c.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo41931b(long j) {
        synchronized (this) {
            this.f22382j = j;
        }
    }

    /* renamed from: c */
    public boolean mo42210c() {
        boolean z;
        synchronized (this) {
            z = this.f22379g;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        mo43008g();
        mo43025x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void complete() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f22377e     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == r1) goto L_0x002d
            r2 = 2
            r3 = 7
            if (r0 == r2) goto L_0x0029
            r2 = 4
            if (r0 == r2) goto L_0x001a
            r1 = 6
            if (r0 == r1) goto L_0x002d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r4.mo43016p()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x001a:
            r4.f22377e = r3     // Catch:{ all -> 0x0037 }
            boolean r0 = r4.f22380h     // Catch:{ all -> 0x0037 }
            r0 = r0 ^ r1
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0028
            r4.mo43008g()
            r4.mo43025x()
        L_0x0028:
            return
        L_0x0029:
            r4.f22377e = r3     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r4.mo43016p()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.complete():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f22383k;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p208s4.C10368t mo41933d() {
        /*
            r1 = this;
            boolean r0 = r1.f22381i
            if (r0 == 0) goto L_0x0015
            z5.c$a r0 = r1.f22383k
            if (r0 == 0) goto L_0x0015
            s4.t r0 = r0.mo41935b()
            if (r0 == 0) goto L_0x0015
            z5.c$a r0 = r1.f22383k
            s4.t r0 = r0.mo41935b()
            return r0
        L_0x0015:
            z5.b r0 = r1.f22373a
            z5.q r0 = r0.mo42998z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.mo41933d():s4.t");
    }

    /* renamed from: e */
    public void mo43006e(C10546b bVar) {
        synchronized (this) {
            if (this.f22376d == null) {
                this.f22376d = new ArrayList();
            }
            this.f22376d.add(bVar);
        }
    }

    /* renamed from: f */
    public void mo43007f() {
        synchronized (this) {
            mo43008g();
            this.f22376d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo43008g() {
        C11950k g = this.f22373a.mo42448g();
        if (g.mo39666o()) {
            synchronized (this) {
                this.f22384l = 0;
                notifyAll();
            }
            return;
        }
        C12157a aVar = this.f22383k;
        if (aVar != null) {
            ((C11939c) g).mo39673v(aVar.f22389g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        mo43008g();
        mo43025x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43009h() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f22377e     // Catch:{ all -> 0x0035 }
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L_0x002e
            r1 = 4
            r3 = 5
            if (r0 == r1) goto L_0x0019
            if (r0 != r3) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            return
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r4.mo43016p()     // Catch:{ all -> 0x0035 }
            r0.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0019:
            boolean r0 = r4.f22380h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4.f22377e = r3     // Catch:{ all -> 0x0035 }
            r4.f22379g = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002d
            r4.mo43008g()
            r4.mo43025x()
        L_0x002d:
            return
        L_0x002e:
            r0 = 3
            r4.f22377e = r0     // Catch:{ all -> 0x0035 }
            r4.f22379g = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.mo43009h():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo43010i(Throwable th) {
        List<C10546b> list;
        List<C10351c> list2;
        synchronized (this) {
            if (this.f22377e == 8) {
                this.f22377e = 9;
                list = this.f22376d;
                list2 = this.f22375c;
            } else {
                throw new IllegalStateException(mo43016p());
            }
        }
        if (list2 != null) {
            for (C10351c next : list2) {
                if (th != null) {
                    try {
                        this.f22383k.mo41934a().mo41944b("javax.servlet.error.exception", th);
                        this.f22383k.mo41934a().mo41944b("javax.servlet.error.message", th.getMessage());
                        next.mo40720E(this.f22383k);
                    } catch (Exception e) {
                        f22372n.mo36856j(e);
                    }
                } else {
                    next.mo40723x(this.f22383k);
                }
            }
        }
        if (list != null) {
            for (C10546b y : list) {
                try {
                    y.mo40015y(this);
                } catch (Exception e2) {
                    f22372n.mo36856j(e2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r3.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.next().mo40721F(r6.f22383k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        f22372n.mo36856j(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r0.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.next().mo40014B(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        f22372n.mo36856j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = r6.f22377e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        if (r0 == 2) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r0 == 4) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r6.f22385m == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        mo43009h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        complete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0063, code lost:
        mo43025x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43011k() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f22377e     // Catch:{ all -> 0x006a }
            r1 = 4
            r2 = 2
            if (r0 == r2) goto L_0x000b
            if (r0 == r1) goto L_0x000b
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x000b:
            java.util.List<v5.b> r0 = r6.f22376d     // Catch:{ all -> 0x006a }
            java.util.List<s4.c> r3 = r6.f22375c     // Catch:{ all -> 0x006a }
            r4 = 1
            r6.f22380h = r4     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0032
            java.util.Iterator r3 = r3.iterator()
        L_0x0019:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r3.next()
            s4.c r4 = (p208s4.C10351c) r4
            z5.c$a r5 = r6.f22383k     // Catch:{ Exception -> 0x002b }
            r4.mo40721F(r5)     // Catch:{ Exception -> 0x002b }
            goto L_0x0019
        L_0x002b:
            r4 = move-exception
            e6.c r5 = f22372n
            r5.mo36856j(r4)
            goto L_0x0019
        L_0x0032:
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r0 = r0.iterator()
        L_0x0038:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r0.next()
            v5.b r3 = (p221v5.C10546b) r3
            r3.mo40014B(r6)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0038
        L_0x0048:
            r3 = move-exception
            e6.c r4 = f22372n
            r4.mo36856j(r3)
            goto L_0x0038
        L_0x004f:
            monitor-enter(r6)
            int r0 = r6.f22377e     // Catch:{ all -> 0x0067 }
            if (r0 == r2) goto L_0x0057
            if (r0 == r1) goto L_0x0057
            goto L_0x0062
        L_0x0057:
            boolean r0 = r6.f22385m     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x005f
            r6.mo43009h()     // Catch:{ all -> 0x0067 }
            goto L_0x0062
        L_0x005f:
            r6.complete()     // Catch:{ all -> 0x0067 }
        L_0x0062:
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            r6.mo43025x()
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            throw r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            goto L_0x006e
        L_0x006d:
            throw r0
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.mo43011k():void");
    }

    /* renamed from: l */
    public C12157a mo43012l() {
        C12157a aVar;
        synchronized (this) {
            aVar = this.f22383k;
        }
        return aVar;
    }

    /* renamed from: m */
    public C12181o mo43013m() {
        return this.f22373a.mo42994v();
    }

    /* renamed from: n */
    public C9943d mo43014n() {
        C12157a aVar = this.f22383k;
        if (aVar != null) {
            return ((C9943d.C9945b) aVar.mo43029h()).mo39960d();
        }
        return null;
    }

    /* renamed from: o */
    public C10364p mo43015o() {
        C12157a aVar = this.f22383k;
        return aVar != null ? aVar.mo41934a() : this.f22373a.mo42994v();
    }

    /* renamed from: p */
    public String mo43016p() {
        String str;
        String sb;
        synchronized (this) {
            StringBuilder sb2 = new StringBuilder();
            int i = this.f22377e;
            if (i == 0) {
                str = "IDLE";
            } else if (i == 1) {
                str = "DISPATCHED";
            } else if (i == 2) {
                str = "ASYNCSTARTED";
            } else if (i == 4) {
                str = "ASYNCWAIT";
            } else if (i == 3) {
                str = "REDISPATCHING";
            } else if (i == 5) {
                str = "REDISPATCH";
            } else if (i == 6) {
                str = "REDISPATCHED";
            } else if (i == 7) {
                str = "COMPLETING";
            } else if (i == 8) {
                str = "UNCOMPLETED";
            } else if (i == 9) {
                str = "COMPLETE";
            } else {
                str = "UNKNOWN?" + this.f22377e;
            }
            sb2.append(str);
            sb2.append(this.f22378f ? ",initial" : "");
            sb2.append(this.f22379g ? ",resumed" : "");
            sb2.append(this.f22380h ? ",expired" : "");
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        return true;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43017q() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.f22385m = r0     // Catch:{ all -> 0x0047 }
            r4.f22381i = r0     // Catch:{ all -> 0x0047 }
            int r1 = r4.f22377e     // Catch:{ all -> 0x0047 }
            r2 = 1
            if (r1 == 0) goto L_0x002b
            r3 = 7
            if (r1 == r3) goto L_0x0025
            r3 = 4
            if (r1 == r3) goto L_0x0023
            r0 = 5
            if (r1 != r0) goto L_0x0019
            r0 = 6
            r4.f22377e = r0     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return r2
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r4.mo43016p()     // Catch:{ all -> 0x0047 }
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0023:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x0025:
            r1 = 8
            r4.f22377e = r1     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return r0
        L_0x002b:
            r4.f22378f = r2     // Catch:{ all -> 0x0047 }
            r4.f22377e = r2     // Catch:{ all -> 0x0047 }
            java.util.List<s4.c> r0 = r4.f22374b     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0036
            r0.clear()     // Catch:{ all -> 0x0047 }
        L_0x0036:
            java.util.List<s4.c> r0 = r4.f22375c     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003e
            r0.clear()     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x003e:
            java.util.List<s4.c> r0 = r4.f22374b     // Catch:{ all -> 0x0047 }
            r4.f22375c = r0     // Catch:{ all -> 0x0047 }
            r0 = 0
            r4.f22374b = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            return r2
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12156c.mo43017q():boolean");
    }

    /* renamed from: r */
    public boolean mo43018r() {
        synchronized (this) {
            int i = this.f22377e;
            return (i == 0 || i == 1 || i == 8 || i == 9) ? false : true;
        }
    }

    /* renamed from: s */
    public boolean mo43019s() {
        synchronized (this) {
            int i = this.f22377e;
            return i == 2 || i == 3 || i == 4 || i == 5;
        }
    }

    /* renamed from: t */
    public boolean mo43020t() {
        boolean z;
        synchronized (this) {
            z = this.f22378f;
        }
        return z;
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "@" + mo43016p();
        }
        return str;
    }

    /* renamed from: u */
    public boolean mo43022u() {
        synchronized (this) {
            int i = this.f22377e;
            return i == 2 || i == 3 || i == 4 || i == 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo43023v() {
        boolean z;
        synchronized (this) {
            z = this.f22377e == 8;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo43024w() {
        synchronized (this) {
            int i = this.f22377e;
            if (i == 1 || i == 6) {
                throw new IllegalStateException(mo43016p());
            }
            this.f22377e = 0;
            this.f22378f = true;
            this.f22379g = false;
            this.f22380h = false;
            this.f22381i = false;
            mo43008g();
            this.f22382j = 30000;
            this.f22376d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo43025x() {
        C11950k g = this.f22373a.mo42448g();
        if (!g.mo39666o()) {
            ((C11939c) g).mo39649A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo43026y() {
        C11950k g = this.f22373a.mo42448g();
        if (this.f22382j <= 0) {
            return;
        }
        if (g.mo39666o()) {
            synchronized (this) {
                this.f22384l = System.currentTimeMillis() + this.f22382j;
                long j = this.f22382j;
                while (this.f22384l > 0 && j > 0 && this.f22373a.mo42966B().isRunning()) {
                    try {
                        wait(j);
                    } catch (InterruptedException e) {
                        f22372n.mo36849d(e);
                    }
                    j = this.f22384l - System.currentTimeMillis();
                }
                if (this.f22384l > 0 && j <= 0 && this.f22373a.mo42966B().isRunning()) {
                    mo43011k();
                }
            }
            return;
        }
        ((C11939c) g).mo39651b(this.f22383k.f22389g, this.f22382j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo43027z(C12151b bVar) {
        synchronized (this) {
            this.f22373a = bVar;
        }
    }
}
