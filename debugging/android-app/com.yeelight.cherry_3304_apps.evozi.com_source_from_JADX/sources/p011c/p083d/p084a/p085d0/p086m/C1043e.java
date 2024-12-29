package p011c.p083d.p084a.p085d0.p086m;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import p163g.C4402a;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4415s;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.m.e */
public final class C1043e {

    /* renamed from: a */
    long f1431a = 0;

    /* renamed from: b */
    long f1432b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f1433c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1031d f1434d;

    /* renamed from: e */
    private List<C1048f> f1435e;

    /* renamed from: f */
    private final C1046c f1436f;

    /* renamed from: g */
    final C1045b f1437g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1047d f1438h = new C1047d();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1047d f1439i = new C1047d();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1027a f1440j = null;

    /* renamed from: c.d.a.d0.m.e$b */
    final class C1045b implements C4415s {

        /* renamed from: a */
        private final C4406c f1441a = new C4406c();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f1442b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f1443c;

        C1045b() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: h */
        private void m2238h(boolean z) {
            long min;
            synchronized (C1043e.this) {
                C1043e.this.f1439i.mo24193k();
                while (C1043e.this.f1432b <= 0 && !this.f1443c && !this.f1442b && C1043e.this.f1440j == null) {
                    try {
                        C1043e.this.m2220z();
                    } catch (Throwable th) {
                        C1043e.this.f1439i.mo9546u();
                        throw th;
                    }
                }
                C1043e.this.f1439i.mo9546u();
                C1043e.this.m2218k();
                min = Math.min(C1043e.this.f1432b, this.f1441a.mo24233g1());
                C1043e.this.f1432b -= min;
            }
            C1043e.this.f1439i.mo24193k();
            try {
                C1043e.this.f1434d.mo9522v0(C1043e.this.f1433c, z && min == this.f1441a.mo24233g1(), this.f1441a, min);
            } finally {
                C1043e.this.f1439i.mo9546u();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f1441a.mo24233g1() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f1441a.mo24233g1() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m2238h(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1444d).mo9522v0(p011c.p083d.p084a.p085d0.p086m.C1043e.m2213e(r8.f1444d), true, (p163g.C4406c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            r2 = r8.f1444d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f1442b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1444d).flush();
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2209a(r8.f1444d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f1444d.f1437g.f1443c != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                monitor-enter(r0)
                boolean r1 = r8.f1442b     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                c.d.a.d0.m.e$b r0 = r0.f1437g
                boolean r0 = r0.f1443c
                r1 = 1
                if (r0 != 0) goto L_0x0040
                g.c r0 = r8.f1441a
                long r2 = r0.mo24233g1()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                g.c r0 = r8.f1441a
                long r2 = r0.mo24233g1()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r8.m2238h(r1)
                goto L_0x001f
            L_0x002d:
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                c.d.a.d0.m.d r2 = r0.f1434d
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                int r3 = r0.f1433c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo9522v0(r3, r4, r5, r6)
            L_0x0040:
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                monitor-enter(r2)
                r8.f1442b = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                c.d.a.d0.m.d r0 = r0.f1434d
                r0.flush()
                c.d.a.d0.m.e r0 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                r0.m2217j()
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                goto L_0x005c
            L_0x005b:
                throw r1
            L_0x005c:
                goto L_0x005b
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1043e.C1045b.close():void");
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return C1043e.this.f1439i;
        }

        public void flush() {
            synchronized (C1043e.this) {
                C1043e.this.m2218k();
            }
            while (this.f1441a.mo24233g1() > 0) {
                m2238h(false);
                C1043e.this.f1434d.flush();
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            this.f1441a.mo9442p0(cVar, j);
            while (this.f1441a.mo24233g1() >= PlaybackStateCompat.ACTION_PREPARE) {
                m2238h(false);
            }
        }
    }

    /* renamed from: c.d.a.d0.m.e$c */
    private final class C1046c implements C4416t {

        /* renamed from: a */
        private final C4406c f1445a;

        /* renamed from: b */
        private final C4406c f1446b;

        /* renamed from: c */
        private final long f1447c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f1448d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f1449e;

        private C1046c(long j) {
            this.f1445a = new C4406c();
            this.f1446b = new C4406c();
            this.f1447c = j;
        }

        /* renamed from: h */
        private void m2244h() {
            if (this.f1448d) {
                throw new IOException("stream closed");
            } else if (C1043e.this.f1440j != null) {
                throw new IOException("stream was reset: " + C1043e.this.f1440j);
            }
        }

        /* renamed from: j */
        private void m2245j() {
            C1043e.this.f1438h.mo24193k();
            while (this.f1446b.mo24233g1() == 0 && !this.f1449e && !this.f1448d && C1043e.this.f1440j == null) {
                try {
                    C1043e.this.m2220z();
                } finally {
                    C1043e.this.f1438h.mo9546u();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
            r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).f1383m += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
            if (p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).f1383m < ((long) (p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).f1385o.mo9585e(65536) / 2))) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).mo9510B0(0, p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).f1383m);
            p011c.p083d.p084a.p085d0.p086m.C1043e.m2212d(r8.f1450f).f1383m = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
            return r9;
         */
        /* renamed from: P0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo9541P0(p163g.C4406c r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00b4
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                monitor-enter(r2)
                r8.m2245j()     // Catch:{ all -> 0x00b1 }
                r8.m2244h()     // Catch:{ all -> 0x00b1 }
                g.c r3 = r8.f1446b     // Catch:{ all -> 0x00b1 }
                long r3 = r3.mo24233g1()     // Catch:{ all -> 0x00b1 }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
                return r9
            L_0x001d:
                g.c r3 = r8.f1446b     // Catch:{ all -> 0x00b1 }
                g.c r4 = r8.f1446b     // Catch:{ all -> 0x00b1 }
                long r4 = r4.mo24233g1()     // Catch:{ all -> 0x00b1 }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00b1 }
                long r9 = r3.mo9541P0(r9, r10)     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                long r3 = r11.f1431a     // Catch:{ all -> 0x00b1 }
                long r3 = r3 + r9
                r11.f1431a = r3     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                long r3 = r11.f1431a     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.d r11 = r11.f1434d     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.o r11 = r11.f1385o     // Catch:{ all -> 0x00b1 }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.mo9585e(r5)     // Catch:{ all -> 0x00b1 }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00b1 }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x0064
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.d r11 = r11.f1434d     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r3 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                int r3 = r3.f1433c     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r4 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                long r6 = r4.f1431a     // Catch:{ all -> 0x00b1 }
                r11.mo9510B0(r3, r6)     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00b1 }
                r11.f1431a = r0     // Catch:{ all -> 0x00b1 }
            L_0x0064:
                monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
                c.d.a.d0.m.e r11 = p011c.p083d.p084a.p085d0.p086m.C1043e.this
                c.d.a.d0.m.d r11 = r11.f1434d
                monitor-enter(r11)
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r2 = r2.f1434d     // Catch:{ all -> 0x00ae }
                long r3 = r2.f1383m     // Catch:{ all -> 0x00ae }
                long r3 = r3 + r9
                r2.f1383m = r3     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r2 = r2.f1434d     // Catch:{ all -> 0x00ae }
                long r2 = r2.f1383m     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.e r4 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r4 = r4.f1434d     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.o r4 = r4.f1385o     // Catch:{ all -> 0x00ae }
                int r4 = r4.mo9585e(r5)     // Catch:{ all -> 0x00ae }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00ae }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00ac
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r2 = r2.f1434d     // Catch:{ all -> 0x00ae }
                r3 = 0
                c.d.a.d0.m.e r4 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r4 = r4.f1434d     // Catch:{ all -> 0x00ae }
                long r4 = r4.f1383m     // Catch:{ all -> 0x00ae }
                r2.mo9510B0(r3, r4)     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.e r2 = p011c.p083d.p084a.p085d0.p086m.C1043e.this     // Catch:{ all -> 0x00ae }
                c.d.a.d0.m.d r2 = r2.f1434d     // Catch:{ all -> 0x00ae }
                r2.f1383m = r0     // Catch:{ all -> 0x00ae }
            L_0x00ac:
                monitor-exit(r11)     // Catch:{ all -> 0x00ae }
                return r9
            L_0x00ae:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00ae }
                throw r9
            L_0x00b1:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
                throw r9
            L_0x00b4:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1043e.C1046c.mo9541P0(g.c, long):long");
        }

        public void close() {
            synchronized (C1043e.this) {
                this.f1448d = true;
                this.f1446b.clear();
                C1043e.this.notifyAll();
            }
            C1043e.this.m2217j();
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return C1043e.this.f1438h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo9543i(C4410e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C1043e.this) {
                    z = this.f1449e;
                    z2 = true;
                    z3 = this.f1446b.mo24233g1() + j > this.f1447c;
                }
                if (z3) {
                    eVar.skip(j);
                    C1043e.this.mo9529n(C1027a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.skip(j);
                    return;
                } else {
                    long P0 = eVar.mo9541P0(this.f1445a, j);
                    if (P0 != -1) {
                        j -= P0;
                        synchronized (C1043e.this) {
                            if (this.f1446b.mo24233g1() != 0) {
                                z2 = false;
                            }
                            this.f1446b.mo24261s0(this.f1445a);
                            if (z2) {
                                C1043e.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* renamed from: c.d.a.d0.m.e$d */
    class C1047d extends C4402a {
        C1047d() {
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
            C1043e.this.mo9529n(C1027a.CANCEL);
        }

        /* renamed from: u */
        public void mo9546u() {
            if (mo24196n()) {
                throw mo9544o((IOException) null);
            }
        }
    }

    C1043e(int i, C1031d dVar, boolean z, boolean z2, List<C1048f> list) {
        if (dVar == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f1433c = i;
            this.f1434d = dVar;
            this.f1432b = (long) dVar.f1386p.mo9585e(65536);
            this.f1436f = new C1046c((long) dVar.f1385o.mo9585e(65536));
            this.f1437g = new C1045b();
            boolean unused = this.f1436f.f1449e = z2;
            boolean unused2 = this.f1437g.f1443c = z;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2217j() {
        boolean z;
        boolean t;
        synchronized (this) {
            z = !this.f1436f.f1449e && this.f1436f.f1448d && (this.f1437g.f1443c || this.f1437g.f1442b);
            t = mo9535t();
        }
        if (z) {
            mo9528l(C1027a.CANCEL);
        } else if (!t) {
            this.f1434d.mo9519n0(this.f1433c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m2218k() {
        if (this.f1437g.f1442b) {
            throw new IOException("stream closed");
        } else if (this.f1437g.f1443c) {
            throw new IOException("stream finished");
        } else if (this.f1440j != null) {
            throw new IOException("stream was reset: " + this.f1440j);
        }
    }

    /* renamed from: m */
    private boolean m2219m(C1027a aVar) {
        synchronized (this) {
            if (this.f1440j != null) {
                return false;
            }
            if (this.f1436f.f1449e && this.f1437g.f1443c) {
                return false;
            }
            this.f1440j = aVar;
            notifyAll();
            this.f1434d.mo9519n0(this.f1433c);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m2220z() {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9527i(long j) {
        this.f1432b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: l */
    public void mo9528l(C1027a aVar) {
        if (m2219m(aVar)) {
            this.f1434d.mo9523y0(this.f1433c, aVar);
        }
    }

    /* renamed from: n */
    public void mo9529n(C1027a aVar) {
        if (m2219m(aVar)) {
            this.f1434d.mo9524z0(this.f1433c, aVar);
        }
    }

    /* renamed from: o */
    public int mo9530o() {
        return this.f1433c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r3.f1438h.mo9546u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<p011c.p083d.p084a.p085d0.p086m.C1048f> mo9531p() {
        /*
            r3 = this;
            monitor-enter(r3)
            c.d.a.d0.m.e$d r0 = r3.f1438h     // Catch:{ all -> 0x003f }
            r0.mo24193k()     // Catch:{ all -> 0x003f }
        L_0x0006:
            java.util.List<c.d.a.d0.m.f> r0 = r3.f1435e     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0012
            c.d.a.d0.m.a r0 = r3.f1440j     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0012
            r3.m2220z()     // Catch:{ all -> 0x0038 }
            goto L_0x0006
        L_0x0012:
            c.d.a.d0.m.e$d r0 = r3.f1438h     // Catch:{ all -> 0x003f }
            r0.mo9546u()     // Catch:{ all -> 0x003f }
            java.util.List<c.d.a.d0.m.f> r0 = r3.f1435e     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x001f
            java.util.List<c.d.a.d0.m.f> r0 = r3.f1435e     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return r0
        L_0x001f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003f }
            c.d.a.d0.m.a r2 = r3.f1440j     // Catch:{ all -> 0x003f }
            r1.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003f }
            r0.<init>(r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x0038:
            r0 = move-exception
            c.d.a.d0.m.e$d r1 = r3.f1438h     // Catch:{ all -> 0x003f }
            r1.mo9546u()     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x0043
        L_0x0042:
            throw r0
        L_0x0043:
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p086m.C1043e.mo9531p():java.util.List");
    }

    /* renamed from: q */
    public C4415s mo9532q() {
        synchronized (this) {
            if (this.f1435e == null) {
                if (!mo9534s()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f1437g;
    }

    /* renamed from: r */
    public C4416t mo9533r() {
        return this.f1436f;
    }

    /* renamed from: s */
    public boolean mo9534s() {
        return this.f1434d.f1372b == ((this.f1433c & 1) == 1);
    }

    /* renamed from: t */
    public synchronized boolean mo9535t() {
        if (this.f1440j != null) {
            return false;
        }
        return (!this.f1436f.f1449e && !this.f1436f.f1448d) || (!this.f1437g.f1443c && !this.f1437g.f1442b) || this.f1435e == null;
    }

    /* renamed from: u */
    public C4417u mo9536u() {
        return this.f1438h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9537v(C4410e eVar, int i) {
        this.f1436f.mo9543i(eVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo9538w() {
        boolean t;
        synchronized (this) {
            boolean unused = this.f1436f.f1449e = true;
            t = mo9535t();
            notifyAll();
        }
        if (!t) {
            this.f1434d.mo9519n0(this.f1433c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo9539x(List<C1048f> list, C1049g gVar) {
        C1027a aVar = null;
        boolean z = true;
        synchronized (this) {
            if (this.f1435e == null) {
                if (gVar.mo9550a()) {
                    aVar = C1027a.PROTOCOL_ERROR;
                } else {
                    this.f1435e = list;
                    z = mo9535t();
                    notifyAll();
                }
            } else if (gVar.mo9551b()) {
                aVar = C1027a.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f1435e);
                arrayList.addAll(list);
                this.f1435e = arrayList;
            }
        }
        if (aVar != null) {
            mo9529n(aVar);
        } else if (!z) {
            this.f1434d.mo9519n0(this.f1433c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void mo9540y(C1027a aVar) {
        if (this.f1440j == null) {
            this.f1440j = aVar;
            notifyAll();
        }
    }
}
