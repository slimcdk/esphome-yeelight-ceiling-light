package p156f.p157g0.p161i;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import p156f.C4388s;
import p156f.p157g0.C4345c;
import p156f.p157g0.p161i.C10787c;
import p163g.C4402a;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: f.g0.i.i */
public final class C4361i {

    /* renamed from: a */
    long f7731a = 0;

    /* renamed from: b */
    long f7732b;

    /* renamed from: c */
    final int f7733c;

    /* renamed from: d */
    final C10795g f7734d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Deque<C4388s> f7735e = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10787c.C10788a f7736f;

    /* renamed from: g */
    private boolean f7737g;

    /* renamed from: h */
    private final C4363b f7738h;

    /* renamed from: i */
    final C4362a f7739i;

    /* renamed from: j */
    final C4364c f7740j = new C4364c();

    /* renamed from: k */
    final C4364c f7741k = new C4364c();

    /* renamed from: l */
    C10786b f7742l = null;

    /* renamed from: f.g0.i.i$a */
    final class C4362a implements C4415s {

        /* renamed from: a */
        private final C4406c f7743a = new C4406c();

        /* renamed from: b */
        boolean f7744b;

        /* renamed from: c */
        boolean f7745c;

        C4362a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m12464a(boolean z) {
            long min;
            synchronized (C4361i.this) {
                C4361i.this.f7741k.mo24193k();
                while (C4361i.this.f7732b <= 0 && !this.f7745c && !this.f7744b && C4361i.this.f7742l == null) {
                    try {
                        C4361i.this.mo23995t();
                    } catch (Throwable th) {
                        C4361i.this.f7741k.mo23998u();
                        throw th;
                    }
                }
                C4361i.this.f7741k.mo23998u();
                C4361i.this.mo23981e();
                min = Math.min(C4361i.this.f7732b, this.f7743a.mo24233g1());
                C4361i.this.f7732b -= min;
            }
            C4361i.this.f7741k.mo24193k();
            try {
                C4361i.this.f7734d.mo34069T(C4361i.this.f7733c, z && min == this.f7743a.mo24233g1(), this.f7743a, min);
            } finally {
                C4361i.this.f7741k.mo23998u();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f7743a.mo24233g1() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f7743a.mo24233g1() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m12464a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.f7746d;
            r0.f7734d.mo34069T(r0.f7733c, true, (p163g.C4406c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.f7746d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f7744b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f7746d.f7734d.flush();
            r8.f7746d.mo23980d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f7746d.f7739i.f7745c != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                f.g0.i.i r0 = p156f.p157g0.p161i.C4361i.this
                monitor-enter(r0)
                boolean r1 = r8.f7744b     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                f.g0.i.i r0 = p156f.p157g0.p161i.C4361i.this
                f.g0.i.i$a r0 = r0.f7739i
                boolean r0 = r0.f7745c
                r1 = 1
                if (r0 != 0) goto L_0x003a
                g.c r0 = r8.f7743a
                long r2 = r0.mo24233g1()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                g.c r0 = r8.f7743a
                long r2 = r0.mo24233g1()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.m12464a(r1)
                goto L_0x001f
            L_0x002d:
                f.g0.i.i r0 = p156f.p157g0.p161i.C4361i.this
                f.g0.i.g r2 = r0.f7734d
                int r3 = r0.f7733c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo34069T(r3, r4, r5, r6)
            L_0x003a:
                f.g0.i.i r2 = p156f.p157g0.p161i.C4361i.this
                monitor-enter(r2)
                r8.f7744b = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                f.g0.i.i r0 = p156f.p157g0.p161i.C4361i.this
                f.g0.i.g r0 = r0.f7734d
                r0.flush()
                f.g0.i.i r0 = p156f.p157g0.p161i.C4361i.this
                r0.mo23980d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C4361i.C4362a.close():void");
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return C4361i.this.f7741k;
        }

        public void flush() {
            synchronized (C4361i.this) {
                C4361i.this.mo23981e();
            }
            while (this.f7743a.mo24233g1() > 0) {
                m12464a(false);
                C4361i.this.f7734d.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            this.f7743a.mo9442p0(cVar, j);
            while (this.f7743a.mo24233g1() >= PlaybackStateCompat.ACTION_PREPARE) {
                m12464a(false);
            }
        }
    }

    /* renamed from: f.g0.i.i$b */
    private final class C4363b implements C4416t {

        /* renamed from: a */
        private final C4406c f7747a = new C4406c();

        /* renamed from: b */
        private final C4406c f7748b = new C4406c();

        /* renamed from: c */
        private final long f7749c;

        /* renamed from: d */
        boolean f7750d;

        /* renamed from: e */
        boolean f7751e;

        C4363b(long j) {
            this.f7749c = j;
        }

        /* renamed from: b */
        private void m12467b(long j) {
            C4361i.this.f7734d.mo34068S(j);
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            C10786b bVar;
            long j2;
            C10787c.C10788a aVar;
            C4388s sVar;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (C4361i.this) {
                        C4361i.this.f7740j.mo24193k();
                        try {
                            bVar = C4361i.this.f7742l != null ? C4361i.this.f7742l : null;
                            if (!this.f7750d) {
                                if (C4361i.this.f7735e.isEmpty() || C4361i.this.f7736f == null) {
                                    if (this.f7748b.mo24233g1() > 0) {
                                        j2 = this.f7748b.mo9541P0(cVar, Math.min(j3, this.f7748b.mo24233g1()));
                                        C4361i.this.f7731a += j2;
                                        if (bVar == null && C4361i.this.f7731a >= ((long) (C4361i.this.f7734d.f20786n.mo34124d() / 2))) {
                                            C4361i.this.f7734d.mo34073Z(C4361i.this.f7733c, C4361i.this.f7731a);
                                            C4361i.this.f7731a = 0;
                                        }
                                    } else {
                                        C4406c cVar2 = cVar;
                                        if (this.f7751e || bVar != null) {
                                            j2 = -1;
                                        } else {
                                            C4361i.this.mo23995t();
                                        }
                                    }
                                    sVar = null;
                                    aVar = null;
                                } else {
                                    sVar = (C4388s) C4361i.this.f7735e.removeFirst();
                                    aVar = C4361i.this.f7736f;
                                    C4406c cVar3 = cVar;
                                    j2 = -1;
                                }
                                C4361i.this.f7740j.mo23998u();
                                if (sVar != null && aVar != null) {
                                    aVar.mo34050a(sVar);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C4361i.this.f7740j.mo23998u();
                        }
                    }
                }
                if (j2 != -1) {
                    m12467b(j2);
                    return j2;
                } else if (bVar == null) {
                    return -1;
                } else {
                    throw new C10817n(bVar);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j3);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo23997a(C4410e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C4361i.this) {
                    z = this.f7751e;
                    z2 = true;
                    z3 = this.f7748b.mo24233g1() + j > this.f7749c;
                }
                if (z3) {
                    eVar.skip(j);
                    C4361i.this.mo23983h(C10786b.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long P0 = eVar.mo9541P0(this.f7747a, j);
                    if (P0 != -1) {
                        j -= P0;
                        synchronized (C4361i.this) {
                            if (this.f7748b.mo24233g1() != 0) {
                                z2 = false;
                            }
                            this.f7748b.mo24261s0(this.f7747a);
                            if (z2) {
                                C4361i.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() {
            long g1;
            C10787c.C10788a aVar;
            ArrayList<C4388s> arrayList;
            synchronized (C4361i.this) {
                this.f7750d = true;
                g1 = this.f7748b.mo24233g1();
                this.f7748b.clear();
                aVar = null;
                if (C4361i.this.f7735e.isEmpty() || C4361i.this.f7736f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(C4361i.this.f7735e);
                    C4361i.this.f7735e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = C4361i.this.f7736f;
                    arrayList = arrayList3;
                }
                C4361i.this.notifyAll();
            }
            if (g1 > 0) {
                m12467b(g1);
            }
            C4361i.this.mo23980d();
            if (aVar != null) {
                for (C4388s a : arrayList) {
                    aVar.mo34050a(a);
                }
            }
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return C4361i.this.f7740j;
        }
    }

    /* renamed from: f.g0.i.i$c */
    class C4364c extends C4402a {
        C4364c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo9544o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo9545t() {
            C4361i.this.mo23983h(C10786b.CANCEL);
        }

        /* renamed from: u */
        public void mo23998u() {
            if (mo24196n()) {
                throw mo9544o((IOException) null);
            }
        }
    }

    C4361i(int i, C10795g gVar, boolean z, boolean z2, @Nullable C4388s sVar) {
        if (gVar != null) {
            this.f7733c = i;
            this.f7734d = gVar;
            this.f7732b = (long) gVar.f20787o.mo34124d();
            this.f7738h = new C4363b((long) gVar.f20786n.mo34124d());
            C4362a aVar = new C4362a();
            this.f7739i = aVar;
            this.f7738h.f7751e = z2;
            aVar.f7745c = z;
            if (sVar != null) {
                this.f7735e.add(sVar);
            }
            if (mo23987l() && sVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo23987l() && sVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: g */
    private boolean m12445g(C10786b bVar) {
        synchronized (this) {
            if (this.f7742l != null) {
                return false;
            }
            if (this.f7738h.f7751e && this.f7739i.f7745c) {
                return false;
            }
            this.f7742l = bVar;
            notifyAll();
            this.f7734d.mo34064L(this.f7733c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo23979c(long j) {
        this.f7732b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23980d() {
        boolean z;
        boolean m;
        synchronized (this) {
            z = !this.f7738h.f7751e && this.f7738h.f7750d && (this.f7739i.f7745c || this.f7739i.f7744b);
            m = mo23988m();
        }
        if (z) {
            mo23982f(C10786b.CANCEL);
        } else if (!m) {
            this.f7734d.mo34064L(this.f7733c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo23981e() {
        C4362a aVar = this.f7739i;
        if (aVar.f7744b) {
            throw new IOException("stream closed");
        } else if (aVar.f7745c) {
            throw new IOException("stream finished");
        } else if (this.f7742l != null) {
            throw new C10817n(this.f7742l);
        }
    }

    /* renamed from: f */
    public void mo23982f(C10786b bVar) {
        if (m12445g(bVar)) {
            this.f7734d.mo34071W(this.f7733c, bVar);
        }
    }

    /* renamed from: h */
    public void mo23983h(C10786b bVar) {
        if (m12445g(bVar)) {
            this.f7734d.mo34072X(this.f7733c, bVar);
        }
    }

    /* renamed from: i */
    public int mo23984i() {
        return this.f7733c;
    }

    /* renamed from: j */
    public C4415s mo23985j() {
        synchronized (this) {
            if (!this.f7737g) {
                if (!mo23987l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f7739i;
    }

    /* renamed from: k */
    public C4416t mo23986k() {
        return this.f7738h;
    }

    /* renamed from: l */
    public boolean mo23987l() {
        return this.f7734d.f20773a == ((this.f7733c & 1) == 1);
    }

    /* renamed from: m */
    public synchronized boolean mo23988m() {
        if (this.f7742l != null) {
            return false;
        }
        return (!this.f7738h.f7751e && !this.f7738h.f7750d) || (!this.f7739i.f7745c && !this.f7739i.f7744b) || !this.f7737g;
    }

    /* renamed from: n */
    public C4417u mo23989n() {
        return this.f7740j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo23990o(C4410e eVar, int i) {
        this.f7738h.mo23997a(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo23991p() {
        boolean m;
        synchronized (this) {
            this.f7738h.f7751e = true;
            m = mo23988m();
            notifyAll();
        }
        if (!m) {
            this.f7734d.mo34064L(this.f7733c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo23992q(List<C10787c> list) {
        boolean m;
        synchronized (this) {
            this.f7737g = true;
            this.f7735e.add(C4345c.m12351H(list));
            m = mo23988m();
            notifyAll();
        }
        if (!m) {
            this.f7734d.mo34064L(this.f7733c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo23993r(C10786b bVar) {
        if (this.f7742l == null) {
            this.f7742l = bVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.f7740j.mo23998u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p156f.C4388s mo23994s() {
        /*
            r2 = this;
            monitor-enter(r2)
            f.g0.i.i$c r0 = r2.f7740j     // Catch:{ all -> 0x003c }
            r0.mo24193k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<f.s> r0 = r2.f7735e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            f.g0.i.b r0 = r2.f7742l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.mo23995t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            f.g0.i.i$c r0 = r2.f7740j     // Catch:{ all -> 0x003c }
            r0.mo23998u()     // Catch:{ all -> 0x003c }
            java.util.Deque<f.s> r0 = r2.f7735e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<f.s> r0 = r2.f7735e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            f.s r0 = (p156f.C4388s) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            f.g0.i.n r0 = new f.g0.i.n     // Catch:{ all -> 0x003c }
            f.g0.i.b r1 = r2.f7742l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            f.g0.i.i$c r1 = r2.f7740j     // Catch:{ all -> 0x003c }
            r1.mo23998u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0040
        L_0x003f:
            throw r0
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p161i.C4361i.mo23994s():f.s");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo23995t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public C4417u mo23996u() {
        return this.f7741k;
    }
}
