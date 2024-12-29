package p164h.p211a.p212a.p222f;

import java.util.ArrayList;
import java.util.List;
import p154d.p155b.C10697a;
import p154d.p155b.C10699b;
import p154d.p155b.C10701c;
import p154d.p155b.C10727m;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p164h.p211a.p212a.p215b.C10886a;
import p164h.p211a.p212a.p215b.C10887b;
import p164h.p211a.p212a.p215b.C10888c;
import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.c */
public class C11015c implements C10697a, C10886a {

    /* renamed from: n */
    private static final C11158c f21579n = C11156b.m29015a(C11015c.class);

    /* renamed from: a */
    protected C11010b f21580a;

    /* renamed from: b */
    private List<C10701c> f21581b;

    /* renamed from: c */
    private List<C10701c> f21582c;

    /* renamed from: d */
    private List<C10887b> f21583d;

    /* renamed from: e */
    private int f21584e = 0;

    /* renamed from: f */
    private boolean f21585f = true;

    /* renamed from: g */
    private boolean f21586g;

    /* renamed from: h */
    private boolean f21587h;

    /* renamed from: i */
    private volatile boolean f21588i;

    /* renamed from: j */
    private long f21589j = 30000;

    /* renamed from: k */
    private C11016a f21590k;

    /* renamed from: l */
    private volatile long f21591l;

    /* renamed from: m */
    private volatile boolean f21592m;

    /* renamed from: h.a.a.f.c$a */
    public class C11016a extends C10699b {

        /* renamed from: d */
        private final C10727m f21593d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10727m f21594e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f21595f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C11115e.C11116a f21596g = new C11017b();

        public C11016a(C10727m mVar, C10734t tVar, C10740z zVar) {
            super(C11015c.this, tVar, zVar);
            Object obj;
            this.f21593d = mVar;
            C11037n v = C11015c.this.f21580a.mo34849v();
            if (v.mo33964a("javax.servlet.async.request_uri") == null) {
                String str = (String) v.mo33964a("javax.servlet.forward.request_uri");
                if (str != null) {
                    v.mo33965b("javax.servlet.async.request_uri", str);
                    v.mo33965b("javax.servlet.async.context_path", v.mo33964a("javax.servlet.forward.context_path"));
                    v.mo33965b("javax.servlet.async.servlet_path", v.mo33964a("javax.servlet.forward.servlet_path"));
                    v.mo33965b("javax.servlet.async.path_info", v.mo33964a("javax.servlet.forward.path_info"));
                    obj = v.mo33964a("javax.servlet.forward.query_string");
                } else {
                    v.mo33965b("javax.servlet.async.request_uri", v.mo33929v());
                    v.mo33965b("javax.servlet.async.context_path", v.mo33917e());
                    v.mo33965b("javax.servlet.async.servlet_path", v.mo33927s());
                    v.mo33965b("javax.servlet.async.path_info", v.mo33920h());
                    obj = v.mo33928t();
                }
                v.mo33965b("javax.servlet.async.query_string", obj);
            }
        }

        /* renamed from: g */
        public String mo34881g() {
            return this.f21595f;
        }

        /* renamed from: h */
        public C10727m mo34882h() {
            C10727m mVar = this.f21594e;
            return mVar == null ? this.f21593d : mVar;
        }
    }

    /* renamed from: h.a.a.f.c$b */
    public class C11017b extends C11115e.C11116a implements Runnable {
        public C11017b() {
        }

        /* renamed from: f */
        public void mo34200f() {
            C11015c.this.mo34863i();
        }

        public void run() {
            C11015c.this.mo34863i();
        }
    }

    static {
        new C10888c();
    }

    protected C11015c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28157h(p154d.p155b.C10727m r3, p154d.p155b.C10734t r4, p154d.p155b.C10740z r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f21584e     // Catch:{ all -> 0x007c }
            r1 = 1
            if (r0 == r1) goto L_0x0014
            r1 = 6
            if (r0 != r1) goto L_0x000a
            goto L_0x0014
        L_0x000a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r4 = r2.mo34867m()     // Catch:{ all -> 0x007c }
            r3.<init>(r4)     // Catch:{ all -> 0x007c }
            throw r3     // Catch:{ all -> 0x007c }
        L_0x0014:
            r0 = 0
            r2.f21586g = r0     // Catch:{ all -> 0x007c }
            r2.f21587h = r0     // Catch:{ all -> 0x007c }
            h.a.a.f.c$a r0 = r2.f21590k     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0042
            h.a.a.f.c$a r0 = r2.f21590k     // Catch:{ all -> 0x007c }
            d.b.t r0 = r0.mo33891a()     // Catch:{ all -> 0x007c }
            if (r4 != r0) goto L_0x0042
            h.a.a.f.c$a r0 = r2.f21590k     // Catch:{ all -> 0x007c }
            d.b.z r0 = r0.mo33892b()     // Catch:{ all -> 0x007c }
            if (r5 != r0) goto L_0x0042
            h.a.a.f.c$a r0 = r2.f21590k     // Catch:{ all -> 0x007c }
            d.b.m r0 = r0.mo34882h()     // Catch:{ all -> 0x007c }
            if (r3 == r0) goto L_0x0036
            goto L_0x0042
        L_0x0036:
            h.a.a.f.c$a r3 = r2.f21590k     // Catch:{ all -> 0x007c }
            r4 = 0
            p154d.p155b.C10727m unused = r3.f21594e = r4     // Catch:{ all -> 0x007c }
            h.a.a.f.c$a r3 = r2.f21590k     // Catch:{ all -> 0x007c }
            java.lang.String unused = r3.f21595f = r4     // Catch:{ all -> 0x007c }
            goto L_0x0049
        L_0x0042:
            h.a.a.f.c$a r0 = new h.a.a.f.c$a     // Catch:{ all -> 0x007c }
            r0.<init>(r3, r4, r5)     // Catch:{ all -> 0x007c }
            r2.f21590k = r0     // Catch:{ all -> 0x007c }
        L_0x0049:
            r3 = 2
            r2.f21584e = r3     // Catch:{ all -> 0x007c }
            java.util.List<d.b.c> r3 = r2.f21581b     // Catch:{ all -> 0x007c }
            java.util.List<d.b.c> r4 = r2.f21582c     // Catch:{ all -> 0x007c }
            r2.f21581b = r4     // Catch:{ all -> 0x007c }
            r2.f21582c = r3     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0059
            r3.clear()     // Catch:{ all -> 0x007c }
        L_0x0059:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            java.util.List<d.b.c> r3 = r2.f21581b
            if (r3 == 0) goto L_0x007b
            java.util.Iterator r3 = r3.iterator()
        L_0x0062:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007b
            java.lang.Object r4 = r3.next()
            d.b.c r4 = (p154d.p155b.C10701c) r4
            h.a.a.f.c$a r5 = r2.f21590k     // Catch:{ Exception -> 0x0074 }
            r4.mo33898H(r5)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0062
        L_0x0074:
            r4 = move-exception
            h.a.a.h.y.c r5 = f21579n
            r5.mo35495k(r4)
            goto L_0x0062
        L_0x007b:
            return
        L_0x007c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007f:
            throw r3
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.m28157h(d.b.m, d.b.t, d.b.z):void");
    }

    /* renamed from: a */
    public void mo33880a(long j) {
        synchronized (this) {
            this.f21589j = j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f21590k;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p154d.p155b.C10740z mo33881b() {
        /*
            r1 = this;
            boolean r0 = r1.f21588i
            if (r0 == 0) goto L_0x0015
            h.a.a.f.c$a r0 = r1.f21590k
            if (r0 == 0) goto L_0x0015
            d.b.z r0 = r0.mo33892b()
            if (r0 == 0) goto L_0x0015
            h.a.a.f.c$a r0 = r1.f21590k
            d.b.z r0 = r0.mo33892b()
            return r0
        L_0x0015:
            h.a.a.f.b r0 = r1.f21580a
            h.a.a.f.o r0 = r0.mo34853z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.mo33881b():d.b.z");
    }

    /* renamed from: c */
    public void mo33882c(C10701c cVar) {
        synchronized (this) {
            if (this.f21582c == null) {
                this.f21582c = new ArrayList();
            }
            this.f21582c.add(cVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        mo34860e();
        mo34876u();
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
            int r0 = r4.f21584e     // Catch:{ all -> 0x0037 }
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
            java.lang.String r1 = r4.mo34867m()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x001a:
            r4.f21584e = r3     // Catch:{ all -> 0x0037 }
            boolean r0 = r4.f21587h     // Catch:{ all -> 0x0037 }
            r0 = r0 ^ r1
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0028
            r4.mo34860e()
            r4.mo34876u()
        L_0x0028:
            return
        L_0x0029:
            r4.f21584e = r3     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            return
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r4.mo34867m()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.complete():void");
    }

    /* renamed from: d */
    public void mo34859d() {
        synchronized (this) {
            mo34860e();
            this.f21583d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo34860e() {
        C10942n g = this.f21580a.mo34605g();
        if (g.mo34365o()) {
            synchronized (this) {
                this.f21591l = 0;
                notifyAll();
            }
            return;
        }
        C11016a aVar = this.f21590k;
        if (aVar != null) {
            ((C10928d) g).mo34353e(aVar.f21596g);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        mo34860e();
        mo34876u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34861f() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f21584e     // Catch:{ all -> 0x0035 }
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
            java.lang.String r1 = r4.mo34867m()     // Catch:{ all -> 0x0035 }
            r0.<init>(r1)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0019:
            boolean r0 = r4.f21587h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4.f21584e = r3     // Catch:{ all -> 0x0035 }
            r4.f21586g = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002d
            r4.mo34860e()
            r4.mo34876u()
        L_0x002d:
            return
        L_0x002e:
            r0 = 3
            r4.f21584e = r0     // Catch:{ all -> 0x0035 }
            r4.f21586g = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.mo34861f():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo34862g(Throwable th) {
        List<C10887b> list;
        List<C10701c> list2;
        synchronized (this) {
            if (this.f21584e == 8) {
                this.f21584e = 9;
                list = this.f21583d;
                list2 = this.f21582c;
            } else {
                throw new IllegalStateException(mo34867m());
            }
        }
        if (list2 != null) {
            for (C10701c next : list2) {
                if (th != null) {
                    try {
                        this.f21590k.mo33891a().mo33965b("javax.servlet.error.exception", th);
                        this.f21590k.mo33891a().mo33965b("javax.servlet.error.message", th.getMessage());
                        next.mo33899I(this.f21590k);
                    } catch (Exception e) {
                        f21579n.mo35495k(e);
                    }
                } else {
                    next.mo33901z(this.f21590k);
                }
            }
        }
        if (list != null) {
            for (C10887b f : list) {
                try {
                    f.mo34387f(this);
                } catch (Exception e2) {
                    f21579n.mo35495k(e2);
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
        r3.next().mo33900n(r6.f21590k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        f21579n.mo35495k(r4);
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
        r0.next().mo34386K(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        f21579n.mo35495k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = r6.f21584e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        if (r0 == 2) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r0 == 4) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r6.f21592m == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        mo34861f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005f, code lost:
        complete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0063, code lost:
        mo34876u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r3 == null) goto L_0x0032;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34863i() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f21584e     // Catch:{ all -> 0x006a }
            r1 = 4
            r2 = 2
            if (r0 == r2) goto L_0x000b
            if (r0 == r1) goto L_0x000b
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x000b:
            java.util.List<h.a.a.b.b> r0 = r6.f21583d     // Catch:{ all -> 0x006a }
            java.util.List<d.b.c> r3 = r6.f21582c     // Catch:{ all -> 0x006a }
            r4 = 1
            r6.f21587h = r4     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0032
            java.util.Iterator r3 = r3.iterator()
        L_0x0019:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r3.next()
            d.b.c r4 = (p154d.p155b.C10701c) r4
            h.a.a.f.c$a r5 = r6.f21590k     // Catch:{ Exception -> 0x002b }
            r4.mo33900n(r5)     // Catch:{ Exception -> 0x002b }
            goto L_0x0019
        L_0x002b:
            r4 = move-exception
            h.a.a.h.y.c r5 = f21579n
            r5.mo35495k(r4)
            goto L_0x0019
        L_0x0032:
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r0 = r0.iterator()
        L_0x0038:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r0.next()
            h.a.a.b.b r3 = (p164h.p211a.p212a.p215b.C10887b) r3
            r3.mo34386K(r6)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0038
        L_0x0048:
            r3 = move-exception
            h.a.a.h.y.c r4 = f21579n
            r4.mo35495k(r3)
            goto L_0x0038
        L_0x004f:
            monitor-enter(r6)
            int r0 = r6.f21584e     // Catch:{ all -> 0x0067 }
            if (r0 == r2) goto L_0x0057
            if (r0 == r1) goto L_0x0057
            goto L_0x0062
        L_0x0057:
            boolean r0 = r6.f21592m     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x005f
            r6.mo34861f()     // Catch:{ all -> 0x0067 }
            goto L_0x0062
        L_0x005f:
            r6.complete()     // Catch:{ all -> 0x0067 }
        L_0x0062:
            monitor-exit(r6)     // Catch:{ all -> 0x0067 }
            r6.mo34876u()
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
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.mo34863i():void");
    }

    /* renamed from: j */
    public C11016a mo34864j() {
        C11016a aVar;
        synchronized (this) {
            aVar = this.f21590k;
        }
        return aVar;
    }

    /* renamed from: k */
    public C11052c mo34865k() {
        C11016a aVar = this.f21590k;
        if (aVar != null) {
            return ((C11052c.C11054b) aVar.mo34882h()).mo35080c();
        }
        return null;
    }

    /* renamed from: l */
    public C10734t mo34866l() {
        C11016a aVar = this.f21590k;
        return aVar != null ? aVar.mo33891a() : this.f21580a.mo34849v();
    }

    /* renamed from: m */
    public String mo34867m() {
        String str;
        String sb;
        synchronized (this) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f21584e == 0) {
                str = "IDLE";
            } else if (this.f21584e == 1) {
                str = "DISPATCHED";
            } else if (this.f21584e == 2) {
                str = "ASYNCSTARTED";
            } else if (this.f21584e == 4) {
                str = "ASYNCWAIT";
            } else if (this.f21584e == 3) {
                str = "REDISPATCHING";
            } else if (this.f21584e == 5) {
                str = "REDISPATCH";
            } else if (this.f21584e == 6) {
                str = "REDISPATCHED";
            } else if (this.f21584e == 7) {
                str = "COMPLETING";
            } else if (this.f21584e == 8) {
                str = "UNCOMPLETED";
            } else if (this.f21584e == 9) {
                str = "COMPLETE";
            } else {
                str = "UNKNOWN?" + this.f21584e;
            }
            sb2.append(str);
            sb2.append(this.f21585f ? ",initial" : "");
            sb2.append(this.f21586g ? ",resumed" : "");
            sb2.append(this.f21587h ? ",expired" : "");
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        return true;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34868n() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.f21592m = r0     // Catch:{ all -> 0x004b }
            r4.f21588i = r0     // Catch:{ all -> 0x004b }
            int r1 = r4.f21584e     // Catch:{ all -> 0x004b }
            r2 = 1
            if (r1 == 0) goto L_0x002b
            r3 = 7
            if (r1 == r3) goto L_0x0025
            r3 = 4
            if (r1 == r3) goto L_0x0023
            r0 = 5
            if (r1 != r0) goto L_0x0019
            r0 = 6
            r4.f21584e = r0     // Catch:{ all -> 0x004b }
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r2
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r4.mo34867m()     // Catch:{ all -> 0x004b }
            r0.<init>(r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0023:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r0
        L_0x0025:
            r1 = 8
            r4.f21584e = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r0
        L_0x002b:
            r4.f21585f = r2     // Catch:{ all -> 0x004b }
            r4.f21584e = r2     // Catch:{ all -> 0x004b }
            java.util.List<d.b.c> r0 = r4.f21581b     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0038
            java.util.List<d.b.c> r0 = r4.f21581b     // Catch:{ all -> 0x004b }
            r0.clear()     // Catch:{ all -> 0x004b }
        L_0x0038:
            java.util.List<d.b.c> r0 = r4.f21582c     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0042
            java.util.List<d.b.c> r0 = r4.f21582c     // Catch:{ all -> 0x004b }
            r0.clear()     // Catch:{ all -> 0x004b }
            goto L_0x0049
        L_0x0042:
            java.util.List<d.b.c> r0 = r4.f21581b     // Catch:{ all -> 0x004b }
            r4.f21582c = r0     // Catch:{ all -> 0x004b }
            r0 = 0
            r4.f21581b = r0     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return r2
        L_0x004b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11015c.mo34868n():boolean");
    }

    /* renamed from: o */
    public boolean mo34869o() {
        synchronized (this) {
            int i = this.f21584e;
            return (i == 0 || i == 1 || i == 8 || i == 9) ? false : true;
        }
    }

    /* renamed from: p */
    public boolean mo34870p() {
        synchronized (this) {
            int i = this.f21584e;
            return i == 2 || i == 3 || i == 4 || i == 5;
        }
    }

    /* renamed from: q */
    public boolean mo34871q() {
        boolean z;
        synchronized (this) {
            z = this.f21585f;
        }
        return z;
    }

    /* renamed from: r */
    public boolean mo34872r() {
        synchronized (this) {
            int i = this.f21584e;
            return i == 2 || i == 3 || i == 4 || i == 7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo34873s() {
        boolean z;
        synchronized (this) {
            z = this.f21584e == 8;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo34874t() {
        synchronized (this) {
            int i = this.f21584e;
            if (i == 1 || i == 6) {
                throw new IllegalStateException(mo34867m());
            }
            this.f21584e = 0;
            this.f21585f = true;
            this.f21586g = false;
            this.f21587h = false;
            this.f21588i = false;
            mo34860e();
            this.f21589j = 30000;
            this.f21583d = null;
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "@" + mo34867m();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo34876u() {
        C10942n g = this.f21580a.mo34605g();
        if (!g.mo34365o()) {
            ((C10928d) g).mo34376y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo34877v() {
        C10942n g = this.f21580a.mo34605g();
        if (this.f21589j <= 0) {
            return;
        }
        if (g.mo34365o()) {
            synchronized (this) {
                this.f21591l = System.currentTimeMillis() + this.f21589j;
                long j = this.f21589j;
                while (this.f21591l > 0 && j > 0 && this.f21580a.mo34823B().isRunning()) {
                    try {
                        wait(j);
                    } catch (InterruptedException e) {
                        f21579n.mo35488d(e);
                    }
                    j = this.f21591l - System.currentTimeMillis();
                }
                if (this.f21591l > 0 && j <= 0 && this.f21580a.mo34823B().isRunning()) {
                    mo34863i();
                }
            }
            return;
        }
        ((C10928d) g).mo34349b(this.f21590k.f21596g, this.f21589j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo34878w(C11010b bVar) {
        synchronized (this) {
            this.f21580a = bVar;
        }
    }

    /* renamed from: x */
    public void mo34879x() {
        this.f21588i = false;
        this.f21592m = true;
        m28157h(this.f21580a.mo34849v().mo34946R(), this.f21580a.mo34849v(), this.f21580a.mo34853z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo34880y() {
        synchronized (this) {
            int i = this.f21584e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.f21585f = false;
                        this.f21584e = 4;
                        mo34877v();
                        if (this.f21584e == 4) {
                            return true;
                        }
                        if (this.f21584e == 7) {
                            this.f21584e = 8;
                            return true;
                        }
                        this.f21585f = false;
                        this.f21584e = 6;
                        return false;
                    } else if (i == 3) {
                        this.f21585f = false;
                        this.f21584e = 6;
                        return false;
                    } else if (i != 6) {
                        if (i == 7) {
                            this.f21585f = false;
                            this.f21584e = 8;
                            return true;
                        }
                        throw new IllegalStateException(mo34867m());
                    }
                }
                this.f21584e = 8;
                return true;
            }
            throw new IllegalStateException(mo34867m());
        }
    }
}
