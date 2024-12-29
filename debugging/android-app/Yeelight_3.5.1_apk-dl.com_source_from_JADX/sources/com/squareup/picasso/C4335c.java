package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
class C4335c implements Runnable {

    /* renamed from: t */
    private static final Object f7162t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f7163u = new C4336a();

    /* renamed from: v */
    private static final AtomicInteger f7164v = new AtomicInteger();

    /* renamed from: w */
    private static final C4365s f7165w = new C4337b();

    /* renamed from: a */
    final int f7166a = f7164v.incrementAndGet();

    /* renamed from: b */
    final Picasso f7167b;

    /* renamed from: c */
    final C4348i f7168c;

    /* renamed from: d */
    final C4342d f7169d;

    /* renamed from: e */
    final C4368u f7170e;

    /* renamed from: f */
    final String f7171f;

    /* renamed from: g */
    final C4361q f7172g;

    /* renamed from: h */
    final int f7173h;

    /* renamed from: i */
    int f7174i;

    /* renamed from: j */
    final C4365s f7175j;

    /* renamed from: k */
    C4332a f7176k;

    /* renamed from: l */
    List<C4332a> f7177l;

    /* renamed from: m */
    Bitmap f7178m;

    /* renamed from: n */
    Future<?> f7179n;

    /* renamed from: o */
    Picasso.LoadedFrom f7180o;

    /* renamed from: p */
    Exception f7181p;

    /* renamed from: q */
    int f7182q;

    /* renamed from: r */
    int f7183r;

    /* renamed from: s */
    Picasso.Priority f7184s;

    /* renamed from: com.squareup.picasso.c$a */
    static class C4336a extends ThreadLocal<StringBuilder> {
        C4336a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class C4337b extends C4365s {
        C4337b() {
        }

        /* renamed from: c */
        public boolean mo28100c(C4361q qVar) {
            return true;
        }

        /* renamed from: f */
        public C4365s.C4366a mo28101f(C4361q qVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + qVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    static class C4338c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4372w f7185a;

        /* renamed from: b */
        final /* synthetic */ RuntimeException f7186b;

        C4338c(C4372w wVar, RuntimeException runtimeException) {
            this.f7185a = wVar;
            this.f7186b = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f7185a.mo28248b() + " crashed with exception.", this.f7186b);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    static class C4339d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f7187a;

        C4339d(StringBuilder sb) {
            this.f7187a = sb;
        }

        public void run() {
            throw new NullPointerException(this.f7187a.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    static class C4340e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4372w f7188a;

        C4340e(C4372w wVar) {
            this.f7188a = wVar;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f7188a.mo28248b() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    static class C4341f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4372w f7189a;

        C4341f(C4372w wVar) {
            this.f7189a = wVar;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f7189a.mo28248b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    C4335c(Picasso picasso, C4348i iVar, C4342d dVar, C4368u uVar, C4332a aVar, C4365s sVar) {
        this.f7167b = picasso;
        this.f7168c = iVar;
        this.f7169d = dVar;
        this.f7170e = uVar;
        this.f7176k = aVar;
        this.f7171f = aVar.mo28125d();
        this.f7172g = aVar.mo28130i();
        this.f7184s = aVar.mo28129h();
        this.f7173h = aVar.mo28126e();
        this.f7174i = aVar.mo28127f();
        this.f7175j = sVar;
        this.f7183r = sVar.mo28102e();
    }

    /* renamed from: A */
    static void m12285A(C4361q qVar) {
        String a = qVar.mo28209a();
        StringBuilder sb = f7163u.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: b */
    static Bitmap m12286b(List<C4372w> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C4372w wVar = list.get(i);
            try {
                Bitmap a = wVar.mo28247a(bitmap);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(wVar.mo28248b());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C4372w b : list) {
                        sb.append(b.mo28248b());
                        sb.append(10);
                    }
                    Picasso.f7116p.post(new C4339d(sb));
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    Picasso.f7116p.post(new C4340e(wVar));
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    Picasso.f7116p.post(new C4341f(wVar));
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.f7116p.post(new C4338c(wVar, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    private Picasso.Priority m12287e() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<C4332a> list = this.f7177l;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        C4332a aVar = this.f7176k;
        if (aVar == null && !z2) {
            z = false;
        }
        if (!z) {
            return priority;
        }
        if (aVar != null) {
            priority = aVar.mo28129h();
        }
        if (z2) {
            int size = this.f7177l.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority h = this.f7177l.get(i).mo28129h();
                if (h.ordinal() > priority.ordinal()) {
                    priority = h;
                }
            }
        }
        return priority;
    }

    /* renamed from: f */
    static Bitmap m12288f(InputStream inputStream, C4361q qVar) {
        C4356m mVar = new C4356m(inputStream);
        long c = mVar.mo28192c(65536);
        BitmapFactory.Options d = C4365s.m12392d(qVar);
        boolean g = C4365s.m12393g(d);
        boolean t = C4376y.m12446t(mVar);
        mVar.mo28190a(c);
        if (t) {
            byte[] x = C4376y.m12450x(mVar);
            if (g) {
                BitmapFactory.decodeByteArray(x, 0, x.length, d);
                C4365s.m12391b(qVar.f7246h, qVar.f7247i, d, qVar);
            }
            return BitmapFactory.decodeByteArray(x, 0, x.length, d);
        }
        if (g) {
            BitmapFactory.decodeStream(mVar, (Rect) null, d);
            C4365s.m12391b(qVar.f7246h, qVar.f7247i, d, qVar);
            mVar.mo28190a(c);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(mVar, (Rect) null, d);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: h */
    static C4335c m12289h(Picasso picasso, C4348i iVar, C4342d dVar, C4368u uVar, C4332a aVar) {
        C4361q i = aVar.mo28130i();
        List<C4365s> h = picasso.mo28109h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4365s sVar = h.get(i2);
            if (sVar.mo28100c(i)) {
                return new C4335c(picasso, iVar, dVar, uVar, aVar, sVar);
            }
        }
        return new C4335c(picasso, iVar, dVar, uVar, aVar, f7165w);
    }

    /* renamed from: v */
    private static boolean m12290v(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m12291z(com.squareup.picasso.C4361q r13, android.graphics.Bitmap r14, int r15) {
        /*
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            boolean r2 = r13.f7250l
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r3 = r13.mo28213e()
            r4 = 0
            if (r3 == 0) goto L_0x00af
            int r3 = r13.f7246h
            int r5 = r13.f7247i
            float r6 = r13.f7251m
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            boolean r7 = r13.f7254p
            if (r7 == 0) goto L_0x002d
            float r7 = r13.f7252n
            float r9 = r13.f7253o
            r8.setRotate(r6, r7, r9)
            goto L_0x0030
        L_0x002d:
            r8.setRotate(r6)
        L_0x0030:
            boolean r6 = r13.f7248j
            if (r6 == 0) goto L_0x0074
            float r13 = (float) r3
            float r6 = (float) r0
            float r7 = r13 / r6
            float r9 = (float) r5
            float r10 = (float) r1
            float r11 = r9 / r10
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0053
            float r11 = r11 / r7
            float r10 = r10 * r11
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r13 = (int) r10
            int r6 = r1 - r13
            int r6 = r6 / 2
            float r10 = (float) r13
            float r11 = r9 / r10
            r9 = r7
            r7 = r0
            goto L_0x0067
        L_0x0053:
            float r7 = r7 / r11
            float r6 = r6 * r7
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r7 = r0 - r6
            int r7 = r7 / 2
            float r9 = (float) r6
            float r13 = r13 / r9
            r9 = r13
            r13 = r1
            r4 = r7
            r7 = r6
            r6 = 0
        L_0x0067:
            boolean r0 = m12290v(r2, r0, r1, r3, r5)
            if (r0 == 0) goto L_0x0070
            r8.preScale(r9, r11)
        L_0x0070:
            r5 = r6
            r6 = r7
            r7 = r13
            goto L_0x00b2
        L_0x0074:
            boolean r13 = r13.f7249k
            if (r13 == 0) goto L_0x008e
            float r13 = (float) r3
            float r6 = (float) r0
            float r13 = r13 / r6
            float r6 = (float) r5
            float r7 = (float) r1
            float r6 = r6 / r7
            int r7 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            boolean r2 = m12290v(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r13)
            goto L_0x00af
        L_0x008e:
            if (r3 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x00af
        L_0x0092:
            if (r3 != r0) goto L_0x0096
            if (r5 == r1) goto L_0x00af
        L_0x0096:
            if (r3 == 0) goto L_0x009b
            float r13 = (float) r3
            float r6 = (float) r0
            goto L_0x009d
        L_0x009b:
            float r13 = (float) r5
            float r6 = (float) r1
        L_0x009d:
            float r13 = r13 / r6
            if (r5 == 0) goto L_0x00a3
            float r6 = (float) r5
            float r7 = (float) r1
            goto L_0x00a5
        L_0x00a3:
            float r6 = (float) r3
            float r7 = (float) r0
        L_0x00a5:
            float r6 = r6 / r7
            boolean r2 = m12290v(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r6)
        L_0x00af:
            r6 = r0
            r7 = r1
            r5 = 0
        L_0x00b2:
            if (r15 == 0) goto L_0x00b8
            float r13 = (float) r15
            r8.preRotate(r13)
        L_0x00b8:
            r9 = 1
            r3 = r14
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            if (r13 == r14) goto L_0x00c4
            r14.recycle()
            r14 = r13
        L_0x00c4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C4335c.m12291z(com.squareup.picasso.q, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28135c(C4332a aVar) {
        String str;
        String str2;
        boolean z = this.f7167b.f7131n;
        C4361q qVar = aVar.f7148b;
        if (this.f7176k == null) {
            this.f7176k = aVar;
            if (z) {
                List<C4332a> list = this.f7177l;
                if (list == null || list.isEmpty()) {
                    str = qVar.mo28212d();
                    str2 = "to empty hunter";
                } else {
                    str = qVar.mo28212d();
                    str2 = C4376y.m12439m(this, "to ");
                }
                C4376y.m12448v("Hunter", "joined", str, str2);
                return;
            }
            return;
        }
        if (this.f7177l == null) {
            this.f7177l = new ArrayList(3);
        }
        this.f7177l.add(aVar);
        if (z) {
            C4376y.m12448v("Hunter", "joined", qVar.mo28212d(), C4376y.m12439m(this, "to "));
        }
        Picasso.Priority h = aVar.mo28129h();
        if (h.ordinal() > this.f7184s.ordinal()) {
            this.f7184s = h;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f7179n;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28136d() {
        /*
            r2 = this;
            com.squareup.picasso.a r0 = r2.f7176k
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<com.squareup.picasso.a> r0 = r2.f7177l
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f7179n
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C4335c.mo28136d():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28137g(C4332a aVar) {
        boolean z;
        if (this.f7176k == aVar) {
            this.f7176k = null;
            z = true;
        } else {
            List<C4332a> list = this.f7177l;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.mo28129h() == this.f7184s) {
            this.f7184s = m12287e();
        }
        if (this.f7167b.f7131n) {
            C4376y.m12448v("Hunter", "removed", aVar.f7148b.mo28212d(), C4376y.m12439m(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C4332a mo28138i() {
        return this.f7176k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C4332a> mo28139j() {
        return this.f7177l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C4361q mo28140k() {
        return this.f7172g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Exception mo28141l() {
        return this.f7181p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo28142m() {
        return this.f7171f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Picasso.LoadedFrom mo28143n() {
        return this.f7180o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo28144o() {
        return this.f7173h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Picasso mo28145q() {
        return this.f7167b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Picasso.Priority mo28146r() {
        return this.f7184s;
    }

    public void run() {
        C4348i iVar;
        C4348i iVar2;
        try {
            m12285A(this.f7172g);
            if (this.f7167b.f7131n) {
                C4376y.m12447u("Hunter", "executing", C4376y.m12438l(this));
            }
            Bitmap t = mo28149t();
            this.f7178m = t;
            if (t == null) {
                this.f7168c.mo28171e(this);
            } else {
                this.f7168c.mo28170d(this);
            }
        } catch (Downloader.ResponseException e) {
            if (!e.localCacheOnly || e.responseCode != 504) {
                this.f7181p = e;
            }
            iVar = this.f7168c;
        } catch (NetworkRequestHandler.ContentLengthException e2) {
            this.f7181p = e2;
            iVar2 = this.f7168c;
            iVar2.mo28173g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (IOException e3) {
            this.f7181p = e3;
            iVar2 = this.f7168c;
            iVar2.mo28173g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f7170e.mo28232a().mo28245a(new PrintWriter(stringWriter));
            this.f7181p = new RuntimeException(stringWriter.toString(), e4);
            iVar = this.f7168c;
        } catch (Exception e5) {
            this.f7181p = e5;
            iVar = this.f7168c;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        iVar.mo28171e(this);
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Bitmap mo28148s() {
        return this.f7178m;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Bitmap mo28149t() {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f7173h)) {
            bitmap = this.f7169d.get(this.f7171f);
            if (bitmap != null) {
                this.f7170e.mo28235d();
                this.f7180o = Picasso.LoadedFrom.MEMORY;
                if (this.f7167b.f7131n) {
                    C4376y.m12448v("Hunter", "decoded", this.f7172g.mo28212d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        C4361q qVar = this.f7172g;
        qVar.f7241c = this.f7183r == 0 ? NetworkPolicy.OFFLINE.index : this.f7174i;
        C4365s.C4366a f = this.f7175j.mo28101f(qVar, this.f7174i);
        if (f != null) {
            this.f7180o = f.mo28230c();
            this.f7182q = f.mo28229b();
            bitmap = f.mo28228a();
            if (bitmap == null) {
                InputStream d = f.mo28231d();
                try {
                    Bitmap f2 = m12288f(d, this.f7172g);
                    C4376y.m12431e(d);
                    bitmap = f2;
                } catch (Throwable th) {
                    C4376y.m12431e(d);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f7167b.f7131n) {
                C4376y.m12447u("Hunter", "decoded", this.f7172g.mo28212d());
            }
            this.f7170e.mo28233b(bitmap);
            if (this.f7172g.mo28214f() || this.f7182q != 0) {
                synchronized (f7162t) {
                    if (this.f7172g.mo28213e() || this.f7182q != 0) {
                        bitmap = m12291z(this.f7172g, bitmap, this.f7182q);
                        if (this.f7167b.f7131n) {
                            C4376y.m12447u("Hunter", "transformed", this.f7172g.mo28212d());
                        }
                    }
                    if (this.f7172g.mo28210b()) {
                        bitmap = m12286b(this.f7172g.f7245g, bitmap);
                        if (this.f7167b.f7131n) {
                            C4376y.m12448v("Hunter", "transformed", this.f7172g.mo28212d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f7170e.mo28234c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo28150u() {
        Future<?> future = this.f7179n;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo28151x(boolean z, NetworkInfo networkInfo) {
        int i = this.f7183r;
        if (!(i > 0)) {
            return false;
        }
        this.f7183r = i - 1;
        return this.f7175j.mo28103h(z, networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo28152y() {
        return this.f7175j.mo28104i();
    }
}
