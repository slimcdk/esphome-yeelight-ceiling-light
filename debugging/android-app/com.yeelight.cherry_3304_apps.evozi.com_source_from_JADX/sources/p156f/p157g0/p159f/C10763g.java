package p156f.p157g0.p159f;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import p156f.C10833u;
import p156f.C4317a;
import p156f.C4338e;
import p156f.C4340e0;
import p156f.C4375j;
import p156f.C4381p;
import p156f.C4396x;
import p156f.p157g0.C4344a;
import p156f.p157g0.C4345c;
import p156f.p157g0.p159f.C10761f;
import p156f.p157g0.p160g.C10768c;

/* renamed from: f.g0.f.g */
public final class C10763g {

    /* renamed from: a */
    public final C4317a f20654a;

    /* renamed from: b */
    private C10761f.C10762a f20655b;

    /* renamed from: c */
    private C4340e0 f20656c;

    /* renamed from: d */
    private final C4375j f20657d;

    /* renamed from: e */
    public final C4338e f20658e;

    /* renamed from: f */
    public final C4381p f20659f;

    /* renamed from: g */
    private final Object f20660g;

    /* renamed from: h */
    private final C10761f f20661h;

    /* renamed from: i */
    private int f20662i;

    /* renamed from: j */
    private C4357c f20663j;

    /* renamed from: k */
    private boolean f20664k;

    /* renamed from: l */
    private boolean f20665l;

    /* renamed from: m */
    private boolean f20666m;

    /* renamed from: n */
    private C10768c f20667n;

    /* renamed from: f.g0.f.g$a */
    public static final class C10764a extends WeakReference<C10763g> {

        /* renamed from: a */
        public final Object f20668a;

        C10764a(C10763g gVar, Object obj) {
            super(gVar);
            this.f20668a = obj;
        }
    }

    public C10763g(C4375j jVar, C4317a aVar, C4338e eVar, C4381p pVar, Object obj) {
        this.f20657d = jVar;
        this.f20654a = aVar;
        this.f20658e = eVar;
        this.f20659f = pVar;
        this.f20661h = new C10761f(aVar, m26659p(), eVar, pVar);
        this.f20660g = obj;
    }

    /* renamed from: e */
    private Socket m26654e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f20667n = null;
        }
        if (z2) {
            this.f20665l = true;
        }
        C4357c cVar = this.f20663j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f7722k = true;
        }
        if (this.f20667n != null) {
            return null;
        }
        if (!this.f20665l && !this.f20663j.f7722k) {
            return null;
        }
        m26657l(this.f20663j);
        if (this.f20663j.f7725n.isEmpty()) {
            this.f20663j.f7726o = System.nanoTime();
            if (C4344a.f7639a.mo23929e(this.f20657d, this.f20663j)) {
                socket = this.f20663j.mo23976q();
                this.f20663j = null;
                return socket;
            }
        }
        socket = null;
        this.f20663j = null;
        return socket;
    }

    /* renamed from: f */
    private C4357c m26655f(int i, int i2, int i3, int i4, boolean z) {
        Socket n;
        Socket socket;
        C4357c cVar;
        C4357c cVar2;
        boolean z2;
        C4340e0 e0Var;
        boolean z3;
        C10761f.C10762a aVar;
        synchronized (this.f20657d) {
            if (this.f20665l) {
                throw new IllegalStateException("released");
            } else if (this.f20667n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f20666m) {
                C4357c cVar3 = this.f20663j;
                n = m26658n();
                socket = null;
                if (this.f20663j != null) {
                    cVar2 = this.f20663j;
                    cVar = null;
                } else {
                    cVar = cVar3;
                    cVar2 = null;
                }
                if (!this.f20664k) {
                    cVar = null;
                }
                if (cVar2 == null) {
                    C4344a.f7639a.mo23932h(this.f20657d, this.f20654a, this, (C4340e0) null);
                    if (this.f20663j != null) {
                        cVar2 = this.f20663j;
                        e0Var = null;
                        z2 = true;
                    } else {
                        e0Var = this.f20656c;
                    }
                } else {
                    e0Var = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        C4345c.m12361h(n);
        if (cVar != null) {
            this.f20659f.mo24062h(this.f20658e, cVar);
        }
        if (z2) {
            this.f20659f.mo24061g(this.f20658e, cVar2);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (e0Var != null || ((aVar = this.f20655b) != null && aVar.mo33999b())) {
            z3 = false;
        } else {
            this.f20655b = this.f20661h.mo33997e();
            z3 = true;
        }
        synchronized (this.f20657d) {
            if (!this.f20666m) {
                if (z3) {
                    List<C4340e0> a = this.f20655b.mo33998a();
                    int size = a.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        C4340e0 e0Var2 = a.get(i5);
                        C4344a.f7639a.mo23932h(this.f20657d, this.f20654a, this, e0Var2);
                        if (this.f20663j != null) {
                            cVar2 = this.f20663j;
                            this.f20656c = e0Var2;
                            z2 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (!z2) {
                    if (e0Var == null) {
                        e0Var = this.f20655b.mo34000c();
                    }
                    this.f20656c = e0Var;
                    this.f20662i = 0;
                    cVar2 = new C4357c(this.f20657d, e0Var);
                    mo34001a(cVar2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            cVar2.mo23969d(i, i2, i3, i4, z, this.f20658e, this.f20659f);
            m26659p().mo33989a(cVar2.mo23975p());
            synchronized (this.f20657d) {
                this.f20664k = true;
                C4344a.f7639a.mo23933i(this.f20657d, cVar2);
                if (cVar2.mo23973n()) {
                    socket = C4344a.f7639a.mo23930f(this.f20657d, this.f20654a, this);
                    cVar2 = this.f20663j;
                }
            }
            C4345c.m12361h(socket);
        }
        this.f20659f.mo24061g(this.f20658e, cVar2);
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.mo23972m(r9) != false) goto L_0x0018;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p156f.p157g0.p159f.C4357c m26656g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            f.g0.f.c r0 = r3.m26655f(r4, r5, r6, r7, r8)
            f.j r1 = r3.f20657d
            monitor-enter(r1)
            int r2 = r0.f7723l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.mo23972m(r9)
            if (r1 != 0) goto L_0x0018
            r3.mo34007j()
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
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p159f.C10763g.m26656g(int, int, int, int, boolean, boolean):f.g0.f.c");
    }

    /* renamed from: l */
    private void m26657l(C4357c cVar) {
        int size = cVar.f7725n.size();
        for (int i = 0; i < size; i++) {
            if (cVar.f7725n.get(i).get() == this) {
                cVar.f7725n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    private Socket m26658n() {
        C4357c cVar = this.f20663j;
        if (cVar == null || !cVar.f7722k) {
            return null;
        }
        return m26654e(false, false, true);
    }

    /* renamed from: p */
    private C10759d m26659p() {
        return C4344a.f7639a.mo23934j(this.f20657d);
    }

    /* renamed from: a */
    public void mo34001a(C4357c cVar, boolean z) {
        if (this.f20663j == null) {
            this.f20663j = cVar;
            this.f20664k = z;
            cVar.f7725n.add(new C10764a(this, this.f20660g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo34002b() {
        C10768c cVar;
        C4357c cVar2;
        synchronized (this.f20657d) {
            this.f20666m = true;
            cVar = this.f20667n;
            cVar2 = this.f20663j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.mo23968c();
        }
    }

    /* renamed from: c */
    public C10768c mo34003c() {
        C10768c cVar;
        synchronized (this.f20657d) {
            cVar = this.f20667n;
        }
        return cVar;
    }

    /* renamed from: d */
    public synchronized C4357c mo34004d() {
        return this.f20663j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f20655b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34005h() {
        /*
            r1 = this;
            f.e0 r0 = r1.f20656c
            if (r0 != 0) goto L_0x0019
            f.g0.f.f$a r0 = r1.f20655b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo33999b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            f.g0.f.f r0 = r1.f20661h
            boolean r0 = r0.mo33996c()
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
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p159f.C10763g.mo34005h():boolean");
    }

    /* renamed from: i */
    public C10768c mo34006i(C4396x xVar, C10833u.C10834a aVar, boolean z) {
        try {
            C10768c o = m26656g(aVar.mo34027e(), aVar.mo34024b(), aVar.mo34025c(), xVar.mo24170x(), xVar.mo24149E(), z).mo23974o(xVar, aVar, this);
            synchronized (this.f20657d) {
                this.f20667n = o;
            }
            return o;
        } catch (IOException e) {
            throw new C10760e(e);
        }
    }

    /* renamed from: j */
    public void mo34007j() {
        C4357c cVar;
        Socket e;
        synchronized (this.f20657d) {
            cVar = this.f20663j;
            e = m26654e(true, false, false);
            if (this.f20663j != null) {
                cVar = null;
            }
        }
        C4345c.m12361h(e);
        if (cVar != null) {
            this.f20659f.mo24062h(this.f20658e, cVar);
        }
    }

    /* renamed from: k */
    public void mo34008k() {
        C4357c cVar;
        Socket e;
        synchronized (this.f20657d) {
            cVar = this.f20663j;
            e = m26654e(false, true, false);
            if (this.f20663j != null) {
                cVar = null;
            }
        }
        C4345c.m12361h(e);
        if (cVar != null) {
            C4344a.f7639a.mo23935k(this.f20658e, (IOException) null);
            this.f20659f.mo24062h(this.f20658e, cVar);
            this.f20659f.mo24055a(this.f20658e);
        }
    }

    /* renamed from: m */
    public Socket mo34009m(C4357c cVar) {
        if (this.f20667n == null && this.f20663j.f7725n.size() == 1) {
            Socket e = m26654e(true, false, false);
            this.f20663j = cVar;
            cVar.f7725n.add(this.f20663j.f7725n.get(0));
            return e;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public C4340e0 mo34010o() {
        return this.f20656c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != p156f.p157g0.p161i.C10786b.CANCEL) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34011q(java.io.IOException r7) {
        /*
            r6 = this;
            f.j r0 = r6.f20657d
            monitor-enter(r0)
            boolean r1 = r7 instanceof p156f.p157g0.p161i.C10817n     // Catch:{ all -> 0x0066 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            f.g0.i.n r7 = (p156f.p157g0.p161i.C10817n) r7     // Catch:{ all -> 0x0066 }
            f.g0.i.b r7 = r7.f20861a     // Catch:{ all -> 0x0066 }
            f.g0.i.b r1 = p156f.p157g0.p161i.C10786b.REFUSED_STREAM     // Catch:{ all -> 0x0066 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f20662i     // Catch:{ all -> 0x0066 }
            int r7 = r7 + r4
            r6.f20662i = r7     // Catch:{ all -> 0x0066 }
            if (r7 <= r4) goto L_0x0047
            goto L_0x001e
        L_0x001a:
            f.g0.i.b r1 = p156f.p157g0.p161i.C10786b.CANCEL     // Catch:{ all -> 0x0066 }
            if (r7 == r1) goto L_0x0047
        L_0x001e:
            r6.f20656c = r3     // Catch:{ all -> 0x0066 }
            goto L_0x0045
        L_0x0021:
            f.g0.f.c r1 = r6.f20663j     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
            f.g0.f.c r1 = r6.f20663j     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.mo23973n()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof p156f.p157g0.p161i.C10785a     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
        L_0x0031:
            f.g0.f.c r1 = r6.f20663j     // Catch:{ all -> 0x0066 }
            int r1 = r1.f7723l     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0045
            f.e0 r1 = r6.f20656c     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            f.g0.f.f r1 = r6.f20661h     // Catch:{ all -> 0x0066 }
            f.e0 r5 = r6.f20656c     // Catch:{ all -> 0x0066 }
            r1.mo33995a(r5, r7)     // Catch:{ all -> 0x0066 }
            goto L_0x001e
        L_0x0045:
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            f.g0.f.c r1 = r6.f20663j     // Catch:{ all -> 0x0066 }
            java.net.Socket r7 = r6.m26654e(r7, r2, r4)     // Catch:{ all -> 0x0066 }
            f.g0.f.c r2 = r6.f20663j     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0058
            boolean r2 = r6.f20664k     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            p156f.p157g0.C4345c.m12361h(r7)
            if (r3 == 0) goto L_0x0065
            f.p r7 = r6.f20659f
            f.e r0 = r6.f20658e
            r7.mo24062h(r0, r3)
        L_0x0065:
            return
        L_0x0066:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r7
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p159f.C10763g.mo34011q(java.io.IOException):void");
    }

    /* renamed from: r */
    public void mo34012r(boolean z, C10768c cVar, long j, IOException iOException) {
        C4357c cVar2;
        Socket e;
        boolean z2;
        this.f20659f.mo24069p(this.f20658e, j);
        synchronized (this.f20657d) {
            if (cVar != null) {
                if (cVar == this.f20667n) {
                    if (!z) {
                        this.f20663j.f7723l++;
                    }
                    cVar2 = this.f20663j;
                    e = m26654e(z, false, true);
                    if (this.f20663j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f20665l;
                }
            }
            throw new IllegalStateException("expected " + this.f20667n + " but was " + cVar);
        }
        C4345c.m12361h(e);
        if (cVar2 != null) {
            this.f20659f.mo24062h(this.f20658e, cVar2);
        }
        if (iOException != null) {
            this.f20659f.mo24056b(this.f20658e, C4344a.f7639a.mo23935k(this.f20658e, iOException));
        } else if (z2) {
            C4344a.f7639a.mo23935k(this.f20658e, (IOException) null);
            this.f20659f.mo24055a(this.f20658e);
        }
    }

    public String toString() {
        C4357c d = mo34004d();
        return d != null ? d.toString() : this.f20654a.toString();
    }
}
