package okhttp3;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.connection.C3526a;
import okio.C3560a;
import p056k5.C9296b;
import p063l5.C9530a;
import p073n5.C9726a;
import p073n5.C9727b;
import p073n5.C9729c;
import p073n5.C9734g;
import p073n5.C9736j;
import p092r5.C3636f;
import p186m5.C9549a;
import p186m5.C9554e;

/* renamed from: okhttp3.y */
final class C3555y implements C9796e {

    /* renamed from: a */
    final C3552x f5900a;

    /* renamed from: b */
    final C9736j f5901b;

    /* renamed from: c */
    final C3560a f5902c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C3537p f5903d;

    /* renamed from: e */
    final C3558z f5904e;

    /* renamed from: f */
    final boolean f5905f;

    /* renamed from: g */
    private boolean f5906g;

    /* renamed from: okhttp3.y$a */
    class C3556a extends C3560a {
        C3556a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo24481t() {
            C3555y.this.cancel();
        }
    }

    /* renamed from: okhttp3.y$b */
    final class C3557b extends C9296b {

        /* renamed from: b */
        private final C9798f f5908b;

        static {
            Class<C3555y> cls = C3555y.class;
        }

        C3557b(C9798f fVar) {
            super("OkHttp %s", C3555y.this.mo24644f());
            this.f5908b = fVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x003d }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24648c() {
            /*
                r5 = this;
                okhttp3.y r0 = okhttp3.C3555y.this
                okio.a r0 = r0.f5902c
                r0.mo24712k()
                r0 = 1
                r1 = 0
                okhttp3.y r2 = okhttp3.C3555y.this     // Catch:{ IOException -> 0x003f }
                okhttp3.b0 r2 = r2.mo24643d()     // Catch:{ IOException -> 0x003f }
                okhttp3.y r3 = okhttp3.C3555y.this     // Catch:{ IOException -> 0x003f }
                n5.j r3 = r3.f5901b     // Catch:{ IOException -> 0x003f }
                boolean r1 = r3.mo38913e()     // Catch:{ IOException -> 0x003f }
                if (r1 == 0) goto L_0x0028
                okhttp3.f r1 = r5.f5908b     // Catch:{ IOException -> 0x003b }
                okhttp3.y r2 = okhttp3.C3555y.this     // Catch:{ IOException -> 0x003b }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x003b }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x003b }
                r1.mo25991b(r2, r3)     // Catch:{ IOException -> 0x003b }
                goto L_0x002f
            L_0x0028:
                okhttp3.f r1 = r5.f5908b     // Catch:{ IOException -> 0x003b }
                okhttp3.y r3 = okhttp3.C3555y.this     // Catch:{ IOException -> 0x003b }
                r1.mo25990a(r3, r2)     // Catch:{ IOException -> 0x003b }
            L_0x002f:
                okhttp3.y r0 = okhttp3.C3555y.this
                okhttp3.x r0 = r0.f5900a
                okhttp3.n r0 = r0.mo24618i()
                r0.mo24512d(r5)
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
                okhttp3.y r2 = okhttp3.C3555y.this     // Catch:{ all -> 0x003d }
                java.io.IOException r1 = r2.mo24645g(r1)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x006a
                r5.f r0 = p092r5.C3636f.m10368j()     // Catch:{ all -> 0x003d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
                r3.<init>()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x003d }
                okhttp3.y r4 = okhttp3.C3555y.this     // Catch:{ all -> 0x003d }
                java.lang.String r4 = r4.mo24646h()     // Catch:{ all -> 0x003d }
                r3.append(r4)     // Catch:{ all -> 0x003d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
                r0.mo25943q(r2, r3, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x006a:
                okhttp3.y r0 = okhttp3.C3555y.this     // Catch:{ all -> 0x003d }
                okhttp3.p r0 = r0.f5903d     // Catch:{ all -> 0x003d }
                okhttp3.y r2 = okhttp3.C3555y.this     // Catch:{ all -> 0x003d }
                r0.mo24515b(r2, r1)     // Catch:{ all -> 0x003d }
                okhttp3.f r0 = r5.f5908b     // Catch:{ all -> 0x003d }
                okhttp3.y r2 = okhttp3.C3555y.this     // Catch:{ all -> 0x003d }
                r0.mo25991b(r2, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x007d:
                return
            L_0x007e:
                okhttp3.y r1 = okhttp3.C3555y.this
                okhttp3.x r1 = r1.f5900a
                okhttp3.n r1 = r1.mo24618i()
                r1.mo24512d(r5)
                goto L_0x008b
            L_0x008a:
                throw r0
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3555y.C3557b.mo24648c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24649d(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C3555y.this.f5903d.mo24515b(C3555y.this, interruptedIOException);
                this.f5908b.mo25991b(C3555y.this, interruptedIOException);
                C3555y.this.f5900a.mo24618i().mo24512d(this);
            } catch (Throwable th) {
                C3555y.this.f5900a.mo24618i().mo24512d(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3555y mo24650f() {
            return C3555y.this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public String mo24651o() {
            return C3555y.this.f5904e.mo24660i().mo24573m();
        }
    }

    private C3555y(C3552x xVar, C3558z zVar, boolean z) {
        this.f5900a = xVar;
        this.f5904e = zVar;
        this.f5905f = z;
        this.f5901b = new C9736j(xVar, z);
        C3556a aVar = new C3556a();
        this.f5902c = aVar;
        aVar.mo39091g((long) xVar.mo24612c(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private void m9934b() {
        this.f5901b.mo38914j(C3636f.m10368j().mo25941n("response.body().close()"));
    }

    /* renamed from: e */
    static C3555y m9935e(C3552x xVar, C3558z zVar, boolean z) {
        C3555y yVar = new C3555y(xVar, zVar, z);
        yVar.f5903d = xVar.mo24620k().mo24534a(yVar);
        return yVar;
    }

    /* renamed from: H */
    public boolean mo24639H() {
        return this.f5901b.mo38913e();
    }

    /* renamed from: c */
    public C3555y clone() {
        return m9935e(this.f5900a, this.f5904e, this.f5905f);
    }

    public void cancel() {
        this.f5901b.mo38912b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3509b0 mo24643d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5900a.mo24624r());
        arrayList.add(this.f5901b);
        arrayList.add(new C9726a(this.f5900a.mo24617h()));
        arrayList.add(new C9530a(this.f5900a.mo24625s()));
        arrayList.add(new C9549a(this.f5900a));
        if (!this.f5905f) {
            arrayList.addAll(this.f5900a.mo24626t());
        }
        arrayList.add(new C9727b(this.f5905f));
        return new C9734g(arrayList, (C9554e) null, (C9729c) null, (C3526a) null, 0, this.f5904e, this, this.f5903d, this.f5900a.mo24614e(), this.f5900a.mo24605E(), this.f5900a.mo24609O()).mo38904d(this.f5904e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo24644f() {
        return this.f5904e.mo24660i().mo24561C();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: g */
    public IOException mo24645g(@Nullable IOException iOException) {
        if (!this.f5902c.mo24715n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo24646h() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo24639H() ? "canceled " : "");
        sb.append(this.f5905f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(mo24644f());
        return sb.toString();
    }

    /* renamed from: v */
    public void mo24647v(C9798f fVar) {
        synchronized (this) {
            if (!this.f5906g) {
                this.f5906g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m9934b();
        this.f5903d.mo24516c(this);
        this.f5900a.mo24618i().mo24510a(new C3557b(fVar));
    }
}
