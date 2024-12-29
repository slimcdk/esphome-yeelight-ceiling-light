package p163g;

import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: g.a */
public class C4402a extends C4417u {

    /* renamed from: h */
    private static final long f7937h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i */
    private static final long f7938i = TimeUnit.MILLISECONDS.toNanos(f7937h);
    @Nullable

    /* renamed from: j */
    static C4402a f7939j;

    /* renamed from: e */
    private boolean f7940e;
    @Nullable

    /* renamed from: f */
    private C4402a f7941f;

    /* renamed from: g */
    private long f7942g;

    /* renamed from: g.a$a */
    class C4403a implements C4415s {

        /* renamed from: a */
        final /* synthetic */ C4415s f7943a;

        C4403a(C4415s sVar) {
            this.f7943a = sVar;
        }

        public void close() {
            C4402a.this.mo24193k();
            try {
                this.f7943a.close();
                C4402a.this.mo24195m(true);
            } catch (IOException e) {
                throw C4402a.this.mo24194l(e);
            } catch (Throwable th) {
                C4402a.this.mo24195m(false);
                throw th;
            }
        }

        /* renamed from: f */
        public C4417u mo9440f() {
            return C4402a.this;
        }

        public void flush() {
            C4402a.this.mo24193k();
            try {
                this.f7943a.flush();
                C4402a.this.mo24195m(true);
            } catch (IOException e) {
                throw C4402a.this.mo24194l(e);
            } catch (Throwable th) {
                C4402a.this.mo24195m(false);
                throw th;
            }
        }

        /* renamed from: p0 */
        public void mo9442p0(C4406c cVar, long j) {
            C10851v.m27080b(cVar.f7949b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C4413p pVar = cVar.f7948a;
                    while (true) {
                        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            break;
                        }
                        j2 += (long) (pVar.f7960c - pVar.f7959b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        pVar = pVar.f7963f;
                    }
                    C4402a.this.mo24193k();
                    try {
                        this.f7943a.mo9442p0(cVar, j2);
                        j -= j2;
                        C4402a.this.mo24195m(true);
                    } catch (IOException e) {
                        throw C4402a.this.mo24194l(e);
                    } catch (Throwable th) {
                        C4402a.this.mo24195m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f7943a + ")";
        }
    }

    /* renamed from: g.a$b */
    class C4404b implements C4416t {

        /* renamed from: a */
        final /* synthetic */ C4416t f7945a;

        C4404b(C4416t tVar) {
            this.f7945a = tVar;
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            C4402a.this.mo24193k();
            try {
                long P0 = this.f7945a.mo9541P0(cVar, j);
                C4402a.this.mo24195m(true);
                return P0;
            } catch (IOException e) {
                throw C4402a.this.mo24194l(e);
            } catch (Throwable th) {
                C4402a.this.mo24195m(false);
                throw th;
            }
        }

        public void close() {
            try {
                this.f7945a.close();
                C4402a.this.mo24195m(true);
            } catch (IOException e) {
                throw C4402a.this.mo24194l(e);
            } catch (Throwable th) {
                C4402a.this.mo24195m(false);
                throw th;
            }
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return C4402a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f7945a + ")";
        }
    }

    /* renamed from: g.a$c */
    private static final class C4405c extends Thread {
        C4405c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo9545t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<g.a> r0 = p163g.C4402a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                g.a r1 = p163g.C4402a.m12755i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                g.a r2 = p163g.C4402a.f7939j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p163g.C4402a.f7939j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo9545t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x001d
            L_0x001c:
                throw r1
            L_0x001d:
                goto L_0x001c
            */
            throw new UnsupportedOperationException("Method not decompiled: p163g.C4402a.C4405c.run():void");
        }
    }

    @Nullable
    /* renamed from: i */
    static C4402a m12755i() {
        Class<C4402a> cls = C4402a.class;
        C4402a aVar = f7939j.f7941f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            cls.wait(f7937h);
            if (f7939j.f7941f != null || System.nanoTime() - nanoTime < f7938i) {
                return null;
            }
            return f7939j;
        }
        long p = aVar.m12757p(nanoTime);
        if (p > 0) {
            long j = p / 1000000;
            cls.wait(j, (int) (p - (1000000 * j)));
            return null;
        }
        f7939j.f7941f = aVar.f7941f;
        aVar.f7941f = null;
        return aVar;
    }

    /* renamed from: j */
    private static synchronized boolean m12756j(C4402a aVar) {
        boolean z;
        synchronized (C4402a.class) {
            C4402a aVar2 = f7939j;
            while (true) {
                if (aVar2 == null) {
                    z = true;
                    break;
                } else if (aVar2.f7941f == aVar) {
                    aVar2.f7941f = aVar.f7941f;
                    aVar.f7941f = null;
                    z = false;
                    break;
                } else {
                    aVar2 = aVar2.f7941f;
                }
            }
        }
        return z;
    }

    /* renamed from: p */
    private long m12757p(long j) {
        return this.f7942g - j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[EDGE_INSN: B:34:0x0054->B:23:0x0054 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m12758q(p163g.C4402a r6, long r7, boolean r9) {
        /*
            java.lang.Class<g.a> r0 = p163g.C4402a.class
            monitor-enter(r0)
            g.a r1 = f7939j     // Catch:{ all -> 0x0069 }
            if (r1 != 0) goto L_0x0016
            g.a r1 = new g.a     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            f7939j = r1     // Catch:{ all -> 0x0069 }
            g.a$c r1 = new g.a$c     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            r1.start()     // Catch:{ all -> 0x0069 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0069 }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.mo24313c()     // Catch:{ all -> 0x0069 }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0069 }
        L_0x002b:
            long r7 = r7 + r1
            r6.f7942g = r7     // Catch:{ all -> 0x0069 }
            goto L_0x003c
        L_0x002f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            if (r9 == 0) goto L_0x0063
            long r7 = r6.mo24313c()     // Catch:{ all -> 0x0069 }
            r6.f7942g = r7     // Catch:{ all -> 0x0069 }
        L_0x003c:
            long r7 = r6.m12757p(r1)     // Catch:{ all -> 0x0069 }
            g.a r9 = f7939j     // Catch:{ all -> 0x0069 }
        L_0x0042:
            g.a r3 = r9.f7941f     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0054
            g.a r3 = r9.f7941f     // Catch:{ all -> 0x0069 }
            long r3 = r3.m12757p(r1)     // Catch:{ all -> 0x0069 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            g.a r9 = r9.f7941f     // Catch:{ all -> 0x0069 }
            goto L_0x0042
        L_0x0054:
            g.a r7 = r9.f7941f     // Catch:{ all -> 0x0069 }
            r6.f7941f = r7     // Catch:{ all -> 0x0069 }
            r9.f7941f = r6     // Catch:{ all -> 0x0069 }
            g.a r6 = f7939j     // Catch:{ all -> 0x0069 }
            if (r9 != r6) goto L_0x0061
            r0.notify()     // Catch:{ all -> 0x0069 }
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0069 }
            r6.<init>()     // Catch:{ all -> 0x0069 }
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006d
        L_0x006c:
            throw r6
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.C4402a.m12758q(g.a, long, boolean):void");
    }

    /* renamed from: k */
    public final void mo24193k() {
        if (!this.f7940e) {
            long h = mo24318h();
            boolean e = mo24315e();
            if (h != 0 || e) {
                this.f7940e = true;
                m12758q(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final IOException mo24194l(IOException iOException) {
        return !mo24196n() ? iOException : mo9544o(iOException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo24195m(boolean z) {
        if (mo24196n() && z) {
            throw mo9544o((IOException) null);
        }
    }

    /* renamed from: n */
    public final boolean mo24196n() {
        if (!this.f7940e) {
            return false;
        }
        this.f7940e = false;
        return m12756j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo9544o(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final C4415s mo24197r(C4415s sVar) {
        return new C4403a(sVar);
    }

    /* renamed from: s */
    public final C4416t mo24198s(C4416t tVar) {
        return new C4404b(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo9545t() {
    }
}
