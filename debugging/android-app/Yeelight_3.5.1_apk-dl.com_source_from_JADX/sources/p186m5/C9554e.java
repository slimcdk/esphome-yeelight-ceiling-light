package p186m5;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.C3504a;
import okhttp3.C3522d0;
import okhttp3.C3531j;
import okhttp3.C3537p;
import okhttp3.C3552x;
import okhttp3.C9796e;
import okhttp3.C9834u;
import okhttp3.internal.connection.C3526a;
import okhttp3.internal.connection.RouteException;
import p056k5.C3299a;
import p056k5.C3300c;
import p073n5.C9729c;
import p186m5.C9552d;

/* renamed from: m5.e */
public final class C9554e {

    /* renamed from: a */
    public final C3504a f17441a;

    /* renamed from: b */
    private C9552d.C9553a f17442b;

    /* renamed from: c */
    private C3522d0 f17443c;

    /* renamed from: d */
    private final C3531j f17444d;

    /* renamed from: e */
    public final C9796e f17445e;

    /* renamed from: f */
    public final C3537p f17446f;

    /* renamed from: g */
    private final Object f17447g;

    /* renamed from: h */
    private final C9552d f17448h;

    /* renamed from: i */
    private int f17449i;

    /* renamed from: j */
    private C3526a f17450j;

    /* renamed from: k */
    private boolean f17451k;

    /* renamed from: l */
    private boolean f17452l;

    /* renamed from: m */
    private boolean f17453m;

    /* renamed from: n */
    private C9729c f17454n;

    /* renamed from: m5.e$a */
    public static final class C9555a extends WeakReference<C9554e> {

        /* renamed from: a */
        public final Object f17455a;

        C9555a(C9554e eVar, Object obj) {
            super(eVar);
            this.f17455a = obj;
        }
    }

    public C9554e(C3531j jVar, C3504a aVar, C9796e eVar, C3537p pVar, Object obj) {
        this.f17444d = jVar;
        this.f17441a = aVar;
        this.f17445e = eVar;
        this.f17446f = pVar;
        this.f17448h = new C9552d(aVar, m23243p(), eVar, pVar);
        this.f17447g = obj;
    }

    /* renamed from: e */
    private Socket m23238e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f17454n = null;
        }
        if (z2) {
            this.f17452l = true;
        }
        C3526a aVar = this.f17450j;
        if (aVar == null) {
            return null;
        }
        if (z) {
            aVar.f5723k = true;
        }
        if (this.f17454n != null) {
            return null;
        }
        if (!this.f17452l && !aVar.f5723k) {
            return null;
        }
        m23241l(aVar);
        if (this.f17450j.f5726n.isEmpty()) {
            this.f17450j.f5727o = System.nanoTime();
            if (C3299a.f5331a.mo23928e(this.f17444d, this.f17450j)) {
                socket = this.f17450j.mo24453q();
                this.f17450j = null;
                return socket;
            }
        }
        socket = null;
        this.f17450j = null;
        return socket;
    }

    /* renamed from: f */
    private C3526a m23239f(int i, int i2, int i3, int i4, boolean z) {
        C3526a aVar;
        Socket n;
        C3526a aVar2;
        Socket socket;
        boolean z2;
        C3522d0 d0Var;
        boolean z3;
        C9552d.C9553a aVar3;
        synchronized (this.f17444d) {
            if (this.f17452l) {
                throw new IllegalStateException("released");
            } else if (this.f17454n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f17453m) {
                aVar = this.f17450j;
                n = m23242n();
                aVar2 = this.f17450j;
                socket = null;
                if (aVar2 != null) {
                    aVar = null;
                } else {
                    aVar2 = null;
                }
                if (!this.f17451k) {
                    aVar = null;
                }
                if (aVar2 == null) {
                    C3299a.f5331a.mo23931h(this.f17444d, this.f17441a, this, (C3522d0) null);
                    C3526a aVar4 = this.f17450j;
                    if (aVar4 != null) {
                        aVar2 = aVar4;
                        z2 = true;
                        d0Var = null;
                    } else {
                        d0Var = this.f17443c;
                    }
                } else {
                    d0Var = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C3300c.m8922g(n);
        if (aVar != null) {
            this.f17446f.mo24521h(this.f17445e, aVar);
        }
        if (z2) {
            this.f17446f.mo24520g(this.f17445e, aVar2);
        }
        if (aVar2 != null) {
            return aVar2;
        }
        if (d0Var != null || ((aVar3 = this.f17442b) != null && aVar3.mo38519b())) {
            z3 = false;
        } else {
            this.f17442b = this.f17448h.mo38517e();
            z3 = true;
        }
        synchronized (this.f17444d) {
            if (!this.f17453m) {
                if (z3) {
                    List<C3522d0> a = this.f17442b.mo38518a();
                    int size = a.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        C3522d0 d0Var2 = a.get(i5);
                        C3299a.f5331a.mo23931h(this.f17444d, this.f17441a, this, d0Var2);
                        C3526a aVar5 = this.f17450j;
                        if (aVar5 != null) {
                            this.f17443c = d0Var2;
                            aVar2 = aVar5;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (d0Var == null) {
                        d0Var = this.f17442b.mo38520c();
                    }
                    this.f17443c = d0Var;
                    this.f17449i = 0;
                    aVar2 = new C3526a(this.f17444d, d0Var);
                    mo38521a(aVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            aVar2.mo24446d(i, i2, i3, i4, z, this.f17445e, this.f17446f);
            m23243p().mo38512a(aVar2.mo24452p());
            synchronized (this.f17444d) {
                this.f17451k = true;
                C3299a.f5331a.mo23932i(this.f17444d, aVar2);
                if (aVar2.mo24450n()) {
                    socket = C3299a.f5331a.mo23929f(this.f17444d, this.f17441a, this);
                    aVar2 = this.f17450j;
                }
            }
            C3300c.m8922g(socket);
        }
        this.f17446f.mo24520g(this.f17445e, aVar2);
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo24449m(r9) != false) goto L_0x0018;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.C3526a m23240g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.a r0 = r3.m23239f(r4, r5, r6, r7, r8)
            okhttp3.j r1 = r3.f17444d
            monitor-enter(r1)
            int r2 = r0.f5724l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo24449m(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo38527j()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x001c:
            throw r4
        L_0x001d:
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: p186m5.C9554e.m23240g(int, int, int, int, boolean, boolean):okhttp3.internal.connection.a");
    }

    /* renamed from: l */
    private void m23241l(C3526a aVar) {
        int size = aVar.f5726n.size();
        for (int i = 0; i < size; i++) {
            if (aVar.f5726n.get(i).get() == this) {
                aVar.f5726n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    private Socket m23242n() {
        C3526a aVar = this.f17450j;
        if (aVar == null || !aVar.f5723k) {
            return null;
        }
        return m23238e(false, false, true);
    }

    /* renamed from: p */
    private C9551c m23243p() {
        return C3299a.f5331a.mo23933j(this.f17444d);
    }

    /* renamed from: a */
    public void mo38521a(C3526a aVar, boolean z) {
        if (this.f17450j == null) {
            this.f17450j = aVar;
            this.f17451k = z;
            aVar.f5726n.add(new C9555a(this, this.f17447g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo38522b() {
        C9729c cVar;
        C3526a aVar;
        synchronized (this.f17444d) {
            this.f17453m = true;
            cVar = this.f17454n;
            aVar = this.f17450j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (aVar != null) {
            aVar.mo24445c();
        }
    }

    /* renamed from: c */
    public C9729c mo38523c() {
        C9729c cVar;
        synchronized (this.f17444d) {
            cVar = this.f17454n;
        }
        return cVar;
    }

    /* renamed from: d */
    public synchronized C3526a mo38524d() {
        return this.f17450j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f17442b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38525h() {
        /*
            r1 = this;
            okhttp3.d0 r0 = r1.f17443c
            if (r0 != 0) goto L_0x0019
            m5.d$a r0 = r1.f17442b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo38519b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            m5.d r0 = r1.f17448h
            boolean r0 = r0.mo38516c()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p186m5.C9554e.mo38525h():boolean");
    }

    /* renamed from: i */
    public C9729c mo38526i(C3552x xVar, C9834u.C9835a aVar, boolean z) {
        try {
            C9729c o = m23240g(aVar.mo38905e(), aVar.mo38902b(), aVar.mo38903c(), xVar.mo24627w(), xVar.mo24606K(), z).mo24451o(xVar, aVar, this);
            synchronized (this.f17444d) {
                this.f17454n = o;
            }
            return o;
        } catch (IOException e) {
            throw new RouteException(e);
        }
    }

    /* renamed from: j */
    public void mo38527j() {
        C3526a aVar;
        Socket e;
        synchronized (this.f17444d) {
            aVar = this.f17450j;
            e = m23238e(true, false, false);
            if (this.f17450j != null) {
                aVar = null;
            }
        }
        C3300c.m8922g(e);
        if (aVar != null) {
            this.f17446f.mo24521h(this.f17445e, aVar);
        }
    }

    /* renamed from: k */
    public void mo38528k() {
        C3526a aVar;
        Socket e;
        synchronized (this.f17444d) {
            aVar = this.f17450j;
            e = m23238e(false, true, false);
            if (this.f17450j != null) {
                aVar = null;
            }
        }
        C3300c.m8922g(e);
        if (aVar != null) {
            C3299a.f5331a.mo23934k(this.f17445e, (IOException) null);
            this.f17446f.mo24521h(this.f17445e, aVar);
            this.f17446f.mo24514a(this.f17445e);
        }
    }

    /* renamed from: m */
    public Socket mo38529m(C3526a aVar) {
        if (this.f17454n == null && this.f17450j.f5726n.size() == 1) {
            Socket e = m23238e(true, false, false);
            this.f17450j = aVar;
            aVar.f5726n.add(this.f17450j.f5726n.get(0));
            return e;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public C3522d0 mo38530o() {
        return this.f17443c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != okhttp3.internal.http2.ErrorCode.CANCEL) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38531q(java.io.IOException r7) {
        /*
            r6 = this;
            okhttp3.j r0 = r6.f17444d
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0062 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch:{ all -> 0x0062 }
            okhttp3.internal.http2.ErrorCode r7 = r7.errorCode     // Catch:{ all -> 0x0062 }
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0062 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f17449i     // Catch:{ all -> 0x0062 }
            int r7 = r7 + r4
            r6.f17449i = r7     // Catch:{ all -> 0x0062 }
            if (r7 <= r4) goto L_0x0043
            goto L_0x001e
        L_0x001a:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ all -> 0x0062 }
            if (r7 == r1) goto L_0x0043
        L_0x001e:
            r6.f17443c = r3     // Catch:{ all -> 0x0062 }
            goto L_0x0041
        L_0x0021:
            okhttp3.internal.connection.a r1 = r6.f17450j     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.mo24450n()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
        L_0x002f:
            okhttp3.internal.connection.a r1 = r6.f17450j     // Catch:{ all -> 0x0062 }
            int r1 = r1.f5724l     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0041
            okhttp3.d0 r1 = r6.f17443c     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            m5.d r5 = r6.f17448h     // Catch:{ all -> 0x0062 }
            r5.mo38515a(r1, r7)     // Catch:{ all -> 0x0062 }
            goto L_0x001e
        L_0x0041:
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            okhttp3.internal.connection.a r1 = r6.f17450j     // Catch:{ all -> 0x0062 }
            java.net.Socket r7 = r6.m23238e(r7, r2, r4)     // Catch:{ all -> 0x0062 }
            okhttp3.internal.connection.a r2 = r6.f17450j     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0054
            boolean r2 = r6.f17451k     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            p056k5.C3300c.m8922g(r7)
            if (r3 == 0) goto L_0x0061
            okhttp3.p r7 = r6.f17446f
            okhttp3.e r0 = r6.f17445e
            r7.mo24521h(r0, r3)
        L_0x0061:
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0065:
            throw r7
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: p186m5.C9554e.mo38531q(java.io.IOException):void");
    }

    /* renamed from: r */
    public void mo38532r(boolean z, C9729c cVar, long j, IOException iOException) {
        C3526a aVar;
        Socket e;
        boolean z2;
        this.f17446f.mo24528p(this.f17445e, j);
        synchronized (this.f17444d) {
            if (cVar != null) {
                if (cVar == this.f17454n) {
                    if (!z) {
                        this.f17450j.f5724l++;
                    }
                    aVar = this.f17450j;
                    e = m23238e(z, false, true);
                    if (this.f17450j != null) {
                        aVar = null;
                    }
                    z2 = this.f17452l;
                }
            }
            throw new IllegalStateException("expected " + this.f17454n + " but was " + cVar);
        }
        C3300c.m8922g(e);
        if (aVar != null) {
            this.f17446f.mo24521h(this.f17445e, aVar);
        }
        if (iOException != null) {
            this.f17446f.mo24515b(this.f17445e, C3299a.f5331a.mo23934k(this.f17445e, iOException));
        } else if (z2) {
            C3299a.f5331a.mo23934k(this.f17445e, (IOException) null);
            this.f17446f.mo24514a(this.f17445e);
        }
    }

    public String toString() {
        C3526a d = mo38524d();
        return d != null ? d.toString() : this.f17441a.toString();
    }
}
