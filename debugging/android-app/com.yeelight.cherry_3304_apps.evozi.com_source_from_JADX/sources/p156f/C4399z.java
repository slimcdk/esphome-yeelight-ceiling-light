package p156f;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p156f.p157g0.C10750b;
import p156f.p157g0.p158e.C10752a;
import p156f.p157g0.p159f.C10757a;
import p156f.p157g0.p159f.C10763g;
import p156f.p157g0.p159f.C4357c;
import p156f.p157g0.p160g.C10765a;
import p156f.p157g0.p160g.C10766b;
import p156f.p157g0.p160g.C10768c;
import p156f.p157g0.p160g.C10773g;
import p156f.p157g0.p160g.C10775j;
import p156f.p157g0.p162k.C4373f;
import p163g.C4402a;

/* renamed from: f.z */
final class C4399z implements C4338e {

    /* renamed from: a */
    final C4396x f7927a;

    /* renamed from: b */
    final C10775j f7928b;

    /* renamed from: c */
    final C4402a f7929c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C4381p f7930d;

    /* renamed from: e */
    final C4318a0 f7931e;

    /* renamed from: f */
    final boolean f7932f;

    /* renamed from: g */
    private boolean f7933g;

    /* renamed from: f.z$a */
    class C4400a extends C4402a {
        C4400a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo9545t() {
            C4399z.this.cancel();
        }
    }

    /* renamed from: f.z$b */
    final class C4401b extends C10750b {

        /* renamed from: b */
        private final C10748f f7935b;

        static {
            Class<C4399z> cls = C4399z.class;
        }

        C4401b(C10748f fVar) {
            super("OkHttp %s", C4399z.this.mo24186f());
            this.f7935b = fVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x003d }] */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24189j() {
            /*
                r5 = this;
                f.z r0 = p156f.C4399z.this
                g.a r0 = r0.f7929c
                r0.mo24193k()
                r0 = 1
                r1 = 0
                f.z r2 = p156f.C4399z.this     // Catch:{ IOException -> 0x003f }
                f.c0 r2 = r2.mo24185d()     // Catch:{ IOException -> 0x003f }
                f.z r3 = p156f.C4399z.this     // Catch:{ IOException -> 0x003f }
                f.g0.g.j r3 = r3.f7928b     // Catch:{ IOException -> 0x003f }
                boolean r1 = r3.mo34035e()     // Catch:{ IOException -> 0x003f }
                if (r1 == 0) goto L_0x0028
                f.f r1 = r5.f7935b     // Catch:{ IOException -> 0x003b }
                f.z r2 = p156f.C4399z.this     // Catch:{ IOException -> 0x003b }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x003b }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x003b }
                r1.mo24537b(r2, r3)     // Catch:{ IOException -> 0x003b }
                goto L_0x002f
            L_0x0028:
                f.f r1 = r5.f7935b     // Catch:{ IOException -> 0x003b }
                f.z r3 = p156f.C4399z.this     // Catch:{ IOException -> 0x003b }
                r1.mo24536a(r3, r2)     // Catch:{ IOException -> 0x003b }
            L_0x002f:
                f.z r0 = p156f.C4399z.this
                f.x r0 = r0.f7927a
                f.n r0 = r0.mo24160l()
                r0.mo24052e(r5)
                goto L_0x007d
            L_0x003b:
                r1 = move-exception
                goto L_0x0042
            L_0x003d:
                r0 = move-exception
                goto L_0x007e
            L_0x003f:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0042:
                f.z r2 = p156f.C4399z.this     // Catch:{ all -> 0x003d }
                java.io.IOException r1 = r2.mo24187j(r1)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x006a
                f.g0.k.f r0 = p156f.p157g0.p162k.C4373f.m12509j()     // Catch:{ all -> 0x003d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
                r3.<init>()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x003d }
                f.z r4 = p156f.C4399z.this     // Catch:{ all -> 0x003d }
                java.lang.String r4 = r4.mo24188k()     // Catch:{ all -> 0x003d }
                r3.append(r4)     // Catch:{ all -> 0x003d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
                r0.mo24007q(r2, r3, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x006a:
                f.z r0 = p156f.C4399z.this     // Catch:{ all -> 0x003d }
                f.p r0 = r0.f7930d     // Catch:{ all -> 0x003d }
                f.z r2 = p156f.C4399z.this     // Catch:{ all -> 0x003d }
                r0.mo24056b(r2, r1)     // Catch:{ all -> 0x003d }
                f.f r0 = r5.f7935b     // Catch:{ all -> 0x003d }
                f.z r2 = p156f.C4399z.this     // Catch:{ all -> 0x003d }
                r0.mo24537b(r2, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x007d:
                return
            L_0x007e:
                f.z r1 = p156f.C4399z.this
                f.x r1 = r1.f7927a
                f.n r1 = r1.mo24160l()
                r1.mo24052e(r5)
                goto L_0x008b
            L_0x008a:
                throw r0
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: p156f.C4399z.C4401b.mo24189j():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo24190k(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C4399z.this.f7930d.mo24056b(C4399z.this, interruptedIOException);
                this.f7935b.mo24537b(C4399z.this, interruptedIOException);
                C4399z.this.f7927a.mo24160l().mo24052e(this);
            } catch (Throwable th) {
                C4399z.this.f7927a.mo24160l().mo24052e(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C4399z mo24191n() {
            return C4399z.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public String mo24192o() {
            return C4399z.this.f7931e.mo23815i().mo24114m();
        }
    }

    private C4399z(C4396x xVar, C4318a0 a0Var, boolean z) {
        this.f7927a = xVar;
        this.f7931e = a0Var;
        this.f7932f = z;
        this.f7928b = new C10775j(xVar, z);
        C4400a aVar = new C4400a();
        this.f7929c = aVar;
        aVar.mo24317g((long) xVar.mo24154c(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private void m12740b() {
        this.f7928b.mo34036j(C4373f.m12509j().mo24005n("response.body().close()"));
    }

    /* renamed from: e */
    static C4399z m12741e(C4396x xVar, C4318a0 a0Var, boolean z) {
        C4399z zVar = new C4399z(xVar, a0Var, z);
        zVar.f7930d = xVar.mo24162o().mo24075a(zVar);
        return zVar;
    }

    /* renamed from: J */
    public C4332c0 mo23903J() {
        synchronized (this) {
            if (!this.f7933g) {
                this.f7933g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m12740b();
        this.f7929c.mo24193k();
        this.f7930d.mo24057c(this);
        try {
            this.f7927a.mo24160l().mo24050b(this);
            C4332c0 d = mo24185d();
            if (d != null) {
                this.f7927a.mo24160l().mo24053f(this);
                return d;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException j = mo24187j(e);
            this.f7930d.mo24056b(this, j);
            throw j;
        } catch (Throwable th) {
            this.f7927a.mo24160l().mo24053f(this);
            throw th;
        }
    }

    /* renamed from: K */
    public boolean mo23904K() {
        return this.f7928b.mo34035e();
    }

    /* renamed from: Q */
    public void mo23905Q(C10748f fVar) {
        synchronized (this) {
            if (!this.f7933g) {
                this.f7933g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m12740b();
        this.f7930d.mo24057c(this);
        this.f7927a.mo24160l().mo24049a(new C4401b(fVar));
    }

    /* renamed from: c */
    public C4399z clone() {
        return m12741e(this.f7927a, this.f7931e, this.f7932f);
    }

    public void cancel() {
        this.f7928b.mo34034b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4332c0 mo24185d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7927a.mo24166s());
        arrayList.add(this.f7928b);
        arrayList.add(new C10765a(this.f7927a.mo24159k()));
        arrayList.add(new C10752a(this.f7927a.mo24167t()));
        arrayList.add(new C10757a(this.f7927a));
        if (!this.f7932f) {
            arrayList.addAll(this.f7927a.mo24168u());
        }
        arrayList.add(new C10766b(this.f7932f));
        return new C10773g(arrayList, (C10763g) null, (C10768c) null, (C4357c) null, 0, this.f7931e, this, this.f7930d, this.f7927a.mo24156e(), this.f7927a.mo24148D(), this.f7927a.mo24152N()).mo34026d(this.f7931e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo24186f() {
        return this.f7931e.mo23815i().mo24102C();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j */
    public IOException mo24187j(@Nullable IOException iOException) {
        if (!this.f7929c.mo24196n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo24188k() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo23904K() ? "canceled " : "");
        sb.append(this.f7932f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(mo24186f());
        return sb.toString();
    }
}
