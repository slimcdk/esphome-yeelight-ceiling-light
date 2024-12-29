package okio;

import android.support.p004v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okio.a */
public class C3560a extends C9854s {

    /* renamed from: h */
    private static final long f5921h;

    /* renamed from: i */
    private static final long f5922i;
    @Nullable

    /* renamed from: j */
    static C3560a f5923j;

    /* renamed from: e */
    private boolean f5924e;
    @Nullable

    /* renamed from: f */
    private C3560a f5925f;

    /* renamed from: g */
    private long f5926g;

    /* renamed from: okio.a$a */
    class C3561a implements C9852q {

        /* renamed from: a */
        final /* synthetic */ C9852q f5927a;

        C3561a(C9852q qVar) {
            this.f5927a = qVar;
        }

        public void close() {
            C3560a.this.mo24712k();
            try {
                this.f5927a.close();
                C3560a.this.mo24714m(true);
            } catch (IOException e) {
                throw C3560a.this.mo24713l(e);
            } catch (Throwable th) {
                C3560a.this.mo24714m(false);
                throw th;
            }
        }

        public void flush() {
            C3560a.this.mo24712k();
            try {
                this.f5927a.flush();
                C3560a.this.mo24714m(true);
            } catch (IOException e) {
                throw C3560a.this.mo24713l(e);
            } catch (Throwable th) {
                C3560a.this.mo24714m(false);
                throw th;
            }
        }

        /* renamed from: j */
        public C9854s mo24475j() {
            return C3560a.this;
        }

        /* renamed from: q0 */
        public void mo24476q0(C3564c cVar, long j) {
            C9856t.m23805b(cVar.f5933b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C3568o oVar = cVar.f5932a;
                    while (true) {
                        if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            break;
                        }
                        j2 += (long) (oVar.f5939c - oVar.f5938b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        oVar = oVar.f5942f;
                    }
                    C3560a.this.mo24712k();
                    try {
                        this.f5927a.mo24476q0(cVar, j2);
                        j -= j2;
                        C3560a.this.mo24714m(true);
                    } catch (IOException e) {
                        throw C3560a.this.mo24713l(e);
                    } catch (Throwable th) {
                        C3560a.this.mo24714m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f5927a + ")";
        }
    }

    /* renamed from: okio.a$b */
    class C3562b implements C9853r {

        /* renamed from: a */
        final /* synthetic */ C9853r f5929a;

        C3562b(C9853r rVar) {
            this.f5929a = rVar;
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            C3560a.this.mo24712k();
            try {
                long R0 = this.f5929a.mo24477R0(cVar, j);
                C3560a.this.mo24714m(true);
                return R0;
            } catch (IOException e) {
                throw C3560a.this.mo24713l(e);
            } catch (Throwable th) {
                C3560a.this.mo24714m(false);
                throw th;
            }
        }

        public void close() {
            try {
                this.f5929a.close();
                C3560a.this.mo24714m(true);
            } catch (IOException e) {
                throw C3560a.this.mo24713l(e);
            } catch (Throwable th) {
                C3560a.this.mo24714m(false);
                throw th;
            }
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return C3560a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f5929a + ")";
        }
    }

    /* renamed from: okio.a$c */
    private static final class C3563c extends Thread {
        C3563c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo24481t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.a> r0 = okio.C3560a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.a r1 = okio.C3560a.m9968i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                okio.a r2 = okio.C3560a.f5923j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                okio.C3560a.f5923j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo24481t()     // Catch:{ InterruptedException -> 0x0000 }
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
            throw new UnsupportedOperationException("Method not decompiled: okio.C3560a.C3563c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f5921h = millis;
        f5922i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    /* renamed from: i */
    static C3560a m9968i() {
        Class<C3560a> cls = C3560a.class;
        C3560a aVar = f5923j.f5925f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            cls.wait(f5921h);
            if (f5923j.f5925f != null || System.nanoTime() - nanoTime < f5922i) {
                return null;
            }
            return f5923j;
        }
        long p = aVar.m9970p(nanoTime);
        if (p > 0) {
            long j = p / 1000000;
            cls.wait(j, (int) (p - (1000000 * j)));
            return null;
        }
        f5923j.f5925f = aVar.f5925f;
        aVar.f5925f = null;
        return aVar;
    }

    /* renamed from: j */
    private static synchronized boolean m9969j(C3560a aVar) {
        boolean z;
        synchronized (C3560a.class) {
            C3560a aVar2 = f5923j;
            while (true) {
                if (aVar2 == null) {
                    z = true;
                    break;
                }
                C3560a aVar3 = aVar2.f5925f;
                if (aVar3 == aVar) {
                    aVar2.f5925f = aVar.f5925f;
                    aVar.f5925f = null;
                    z = false;
                    break;
                }
                aVar2 = aVar3;
            }
        }
        return z;
    }

    /* renamed from: p */
    private long m9970p(long j) {
        return this.f5926g - j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0052 A[EDGE_INSN: B:34:0x0052->B:23:0x0052 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m9971q(okio.C3560a r6, long r7, boolean r9) {
        /*
            java.lang.Class<okio.a> r0 = okio.C3560a.class
            monitor-enter(r0)
            okio.a r1 = f5923j     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x0016
            okio.a r1 = new okio.a     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            f5923j = r1     // Catch:{ all -> 0x0067 }
            okio.a$c r1 = new okio.a$c     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r1.start()     // Catch:{ all -> 0x0067 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0067 }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.mo39087c()     // Catch:{ all -> 0x0067 }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0067 }
        L_0x002b:
            long r7 = r7 + r1
            r6.f5926g = r7     // Catch:{ all -> 0x0067 }
            goto L_0x003c
        L_0x002f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            if (r9 == 0) goto L_0x0061
            long r7 = r6.mo39087c()     // Catch:{ all -> 0x0067 }
            r6.f5926g = r7     // Catch:{ all -> 0x0067 }
        L_0x003c:
            long r7 = r6.m9970p(r1)     // Catch:{ all -> 0x0067 }
            okio.a r9 = f5923j     // Catch:{ all -> 0x0067 }
        L_0x0042:
            okio.a r3 = r9.f5925f     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0052
            long r3 = r3.m9970p(r1)     // Catch:{ all -> 0x0067 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            okio.a r9 = r9.f5925f     // Catch:{ all -> 0x0067 }
            goto L_0x0042
        L_0x0052:
            okio.a r7 = r9.f5925f     // Catch:{ all -> 0x0067 }
            r6.f5925f = r7     // Catch:{ all -> 0x0067 }
            r9.f5925f = r6     // Catch:{ all -> 0x0067 }
            okio.a r6 = f5923j     // Catch:{ all -> 0x0067 }
            if (r9 != r6) goto L_0x005f
            r0.notify()     // Catch:{ all -> 0x0067 }
        L_0x005f:
            monitor-exit(r0)
            return
        L_0x0061:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0067 }
            r6.<init>()     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x006b
        L_0x006a:
            throw r6
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C3560a.m9971q(okio.a, long, boolean):void");
    }

    /* renamed from: k */
    public final void mo24712k() {
        if (!this.f5924e) {
            long h = mo39109h();
            boolean e = mo39089e();
            if (h != 0 || e) {
                this.f5924e = true;
                m9971q(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final IOException mo24713l(IOException iOException) {
        return !mo24715n() ? iOException : mo24480o(iOException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo24714m(boolean z) {
        if (mo24715n() && z) {
            throw mo24480o((IOException) null);
        }
    }

    /* renamed from: n */
    public final boolean mo24715n() {
        if (!this.f5924e) {
            return false;
        }
        this.f5924e = false;
        return m9969j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo24480o(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final C9852q mo24716r(C9852q qVar) {
        return new C3561a(qVar);
    }

    /* renamed from: s */
    public final C9853r mo24717s(C9853r rVar) {
        return new C3562b(rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo24481t() {
    }
}
