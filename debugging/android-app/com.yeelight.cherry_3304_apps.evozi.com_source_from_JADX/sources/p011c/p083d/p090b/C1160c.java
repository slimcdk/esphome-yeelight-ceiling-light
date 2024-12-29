package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p011c.p083d.p090b.C1189j;
import p011c.p083d.p090b.C1200r;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.c */
class C1160c implements Runnable {

    /* renamed from: t */
    private static final Object f1957t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f1958u = new C1161a();

    /* renamed from: v */
    private static final AtomicInteger f1959v = new AtomicInteger();

    /* renamed from: w */
    private static final C1220y f1960w = new C1162b();

    /* renamed from: a */
    final int f1961a = f1959v.incrementAndGet();

    /* renamed from: b */
    final C1203t f1962b;

    /* renamed from: c */
    final C1184i f1963c;

    /* renamed from: d */
    final C1168d f1964d;

    /* renamed from: e */
    final C1155a0 f1965e;

    /* renamed from: f */
    final String f1966f;

    /* renamed from: g */
    final C1216w f1967g;

    /* renamed from: h */
    final int f1968h;

    /* renamed from: i */
    int f1969i;

    /* renamed from: j */
    final C1220y f1970j;

    /* renamed from: k */
    C1153a f1971k;

    /* renamed from: l */
    List<C1153a> f1972l;

    /* renamed from: m */
    Bitmap f1973m;

    /* renamed from: n */
    Future<?> f1974n;

    /* renamed from: o */
    C1203t.C1209e f1975o;

    /* renamed from: p */
    Exception f1976p;

    /* renamed from: q */
    int f1977q;

    /* renamed from: r */
    int f1978r;

    /* renamed from: s */
    C1203t.C1210f f1979s;

    /* renamed from: c.d.b.c$a */
    static class C1161a extends ThreadLocal<StringBuilder> {
        C1161a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: c.d.b.c$b */
    static class C1162b extends C1220y {
        C1162b() {
        }

        /* renamed from: c */
        public boolean mo9912c(C1216w wVar) {
            return true;
        }

        /* renamed from: f */
        public C1220y.C1221a mo9913f(C1216w wVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: c.d.b.c$c */
    static class C1163c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1167c0 f1980a;

        /* renamed from: b */
        final /* synthetic */ RuntimeException f1981b;

        C1163c(C1167c0 c0Var, RuntimeException runtimeException) {
            this.f1980a = c0Var;
            this.f1981b = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f1980a.mo9941b() + " crashed with exception.", this.f1981b);
        }
    }

    /* renamed from: c.d.b.c$d */
    static class C1164d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f1982a;

        C1164d(StringBuilder sb) {
            this.f1982a = sb;
        }

        public void run() {
            throw new NullPointerException(this.f1982a.toString());
        }
    }

    /* renamed from: c.d.b.c$e */
    static class C1165e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1167c0 f1983a;

        C1165e(C1167c0 c0Var) {
            this.f1983a = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f1983a.mo9941b() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: c.d.b.c$f */
    static class C1166f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1167c0 f1984a;

        C1166f(C1167c0 c0Var) {
            this.f1984a = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f1984a.mo9941b() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    C1160c(C1203t tVar, C1184i iVar, C1168d dVar, C1155a0 a0Var, C1153a aVar, C1220y yVar) {
        this.f1962b = tVar;
        this.f1963c = iVar;
        this.f1964d = dVar;
        this.f1965e = a0Var;
        this.f1971k = aVar;
        this.f1966f = aVar.mo9889d();
        this.f1967g = aVar.mo9894i();
        this.f1979s = aVar.mo9893h();
        this.f1968h = aVar.mo9890e();
        this.f1969i = aVar.mo9891f();
        this.f1970j = yVar;
        this.f1978r = yVar.mo9994e();
    }

    /* renamed from: b */
    static Bitmap m2971b(List<C1167c0> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C1167c0 c0Var = list.get(i);
            try {
                Bitmap a = c0Var.mo9940a(bitmap);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(c0Var.mo9941b());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C1167c0 b : list) {
                        sb.append(b.mo9941b());
                        sb.append(10);
                    }
                    C1203t.f2054p.post(new C1164d(sb));
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C1203t.f2054p.post(new C1165e(c0Var));
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C1203t.f2054p.post(new C1166f(c0Var));
                    return null;
                }
            } catch (RuntimeException e) {
                C1203t.f2054p.post(new C1163c(c0Var, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: e */
    private C1203t.C1210f m2972e() {
        C1203t.C1210f fVar = C1203t.C1210f.LOW;
        List<C1153a> list = this.f1972l;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.f1971k == null && !z2) {
            z = false;
        }
        if (!z) {
            return fVar;
        }
        C1153a aVar = this.f1971k;
        if (aVar != null) {
            fVar = aVar.mo9893h();
        }
        if (z2) {
            int size = this.f1972l.size();
            for (int i = 0; i < size; i++) {
                C1203t.C1210f h = this.f1972l.get(i).mo9893h();
                if (h.ordinal() > fVar.ordinal()) {
                    fVar = h;
                }
            }
        }
        return fVar;
    }

    /* renamed from: f */
    static Bitmap m2973f(InputStream inputStream, C1216w wVar) {
        C1195n nVar = new C1195n(inputStream);
        long b = nVar.mo9985b(65536);
        BitmapFactory.Options d = C1220y.m3151d(wVar);
        boolean g = C1220y.m3152g(d);
        boolean t = C1173e0.m3029t(nVar);
        nVar.mo9983a(b);
        if (t) {
            byte[] x = C1173e0.m3033x(nVar);
            if (g) {
                BitmapFactory.decodeByteArray(x, 0, x.length, d);
                C1220y.m3150b(wVar.f2111h, wVar.f2112i, d, wVar);
            }
            return BitmapFactory.decodeByteArray(x, 0, x.length, d);
        }
        if (g) {
            BitmapFactory.decodeStream(nVar, (Rect) null, d);
            C1220y.m3150b(wVar.f2111h, wVar.f2112i, d, wVar);
            nVar.mo9983a(b);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(nVar, (Rect) null, d);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: h */
    static C1160c m2974h(C1203t tVar, C1184i iVar, C1168d dVar, C1155a0 a0Var, C1153a aVar) {
        C1216w i = aVar.mo9894i();
        List<C1220y> h = tVar.mo10001h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1220y yVar = h.get(i2);
            if (yVar.mo9912c(i)) {
                return new C1160c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new C1160c(tVar, iVar, dVar, a0Var, aVar, f1960w);
    }

    /* renamed from: u */
    private static boolean m2975u(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m2976x(p011c.p083d.p090b.C1216w r13, android.graphics.Bitmap r14, int r15) {
        /*
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            boolean r2 = r13.f2115l
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r3 = r13.mo10026e()
            r4 = 0
            if (r3 == 0) goto L_0x00af
            int r3 = r13.f2111h
            int r5 = r13.f2112i
            float r6 = r13.f2116m
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            boolean r7 = r13.f2119p
            if (r7 == 0) goto L_0x002d
            float r7 = r13.f2117n
            float r9 = r13.f2118o
            r8.setRotate(r6, r7, r9)
            goto L_0x0030
        L_0x002d:
            r8.setRotate(r6)
        L_0x0030:
            boolean r6 = r13.f2113j
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
            boolean r0 = m2975u(r2, r0, r1, r3, r5)
            if (r0 == 0) goto L_0x0070
            r8.preScale(r9, r11)
        L_0x0070:
            r5 = r6
            r6 = r7
            r7 = r13
            goto L_0x00b2
        L_0x0074:
            boolean r13 = r13.f2114k
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
            boolean r2 = m2975u(r2, r0, r1, r3, r5)
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
            boolean r2 = m2975u(r2, r0, r1, r3, r5)
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
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1160c.m2976x(c.d.b.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: y */
    static void m2977y(C1216w wVar) {
        String a = wVar.mo10022a();
        StringBuilder sb = f1958u.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9916c(C1153a aVar) {
        String str;
        String str2;
        boolean z = this.f1962b.f2069n;
        C1216w wVar = aVar.f1913b;
        if (this.f1971k == null) {
            this.f1971k = aVar;
            if (z) {
                List<C1153a> list = this.f1972l;
                if (list == null || list.isEmpty()) {
                    str = wVar.mo10025d();
                    str2 = "to empty hunter";
                } else {
                    str = wVar.mo10025d();
                    str2 = C1173e0.m3022m(this, "to ");
                }
                C1173e0.m3031v("Hunter", "joined", str, str2);
                return;
            }
            return;
        }
        if (this.f1972l == null) {
            this.f1972l = new ArrayList(3);
        }
        this.f1972l.add(aVar);
        if (z) {
            C1173e0.m3031v("Hunter", "joined", wVar.mo10025d(), C1173e0.m3022m(this, "to "));
        }
        C1203t.C1210f h = aVar.mo9893h();
        if (h.ordinal() > this.f1979s.ordinal()) {
            this.f1979s = h;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f1974n;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9917d() {
        /*
            r2 = this;
            c.d.b.a r0 = r2.f1971k
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<c.d.b.a> r0 = r2.f1972l
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f1974n
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p090b.C1160c.mo9917d():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9918g(C1153a aVar) {
        boolean z;
        if (this.f1971k == aVar) {
            this.f1971k = null;
            z = true;
        } else {
            List<C1153a> list = this.f1972l;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.mo9893h() == this.f1979s) {
            this.f1979s = m2972e();
        }
        if (this.f1962b.f2069n) {
            C1173e0.m3031v("Hunter", "removed", aVar.f1913b.mo10025d(), C1173e0.m3022m(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1153a mo9919i() {
        return this.f1971k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C1153a> mo9920j() {
        return this.f1972l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1216w mo9921k() {
        return this.f1967g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Exception mo9922l() {
        return this.f1976p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo9923m() {
        return this.f1966f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C1203t.C1209e mo9924n() {
        return this.f1975o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo9925o() {
        return this.f1968h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C1203t mo9926p() {
        return this.f1962b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C1203t.C1210f mo9927q() {
        return this.f1979s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Bitmap mo9928r() {
        return this.f1973m;
    }

    public void run() {
        C1184i iVar;
        C1184i iVar2;
        try {
            m2977y(this.f1967g);
            if (this.f1962b.f2069n) {
                C1173e0.m3030u("Hunter", "executing", C1173e0.m3021l(this));
            }
            Bitmap s = mo9930s();
            this.f1973m = s;
            if (s == null) {
                this.f1963c.mo9961e(this);
            } else {
                this.f1963c.mo9960d(this);
            }
        } catch (C1189j.C1191b e) {
            if (!e.f2019a || e.f2020b != 504) {
                this.f1976p = e;
            }
            iVar = this.f1963c;
        } catch (C1200r.C1201a e2) {
            this.f1976p = e2;
            iVar2 = this.f1963c;
            iVar2.mo9963g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (IOException e3) {
            this.f1976p = e3;
            iVar2 = this.f1963c;
            iVar2.mo9963g(this);
            Thread.currentThread().setName("Picasso-Idle");
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f1965e.mo9899a().mo9914a(new PrintWriter(stringWriter));
            this.f1976p = new RuntimeException(stringWriter.toString(), e4);
            iVar = this.f1963c;
        } catch (Exception e5) {
            this.f1976p = e5;
            iVar = this.f1963c;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        iVar.mo9961e(this);
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Bitmap mo9930s() {
        Bitmap bitmap;
        if (C1198p.m3091a(this.f1968h)) {
            bitmap = this.f1964d.mo9942a(this.f1966f);
            if (bitmap != null) {
                this.f1965e.mo9902d();
                this.f1975o = C1203t.C1209e.MEMORY;
                if (this.f1962b.f2069n) {
                    C1173e0.m3031v("Hunter", "decoded", this.f1967g.mo10025d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.f1967g.f2106c = this.f1978r == 0 ? C1199q.OFFLINE.f2050a : this.f1969i;
        C1220y.C1221a f = this.f1970j.mo9913f(this.f1967g, this.f1969i);
        if (f != null) {
            this.f1975o = f.mo10043c();
            this.f1977q = f.mo10042b();
            bitmap = f.mo10041a();
            if (bitmap == null) {
                InputStream d = f.mo10044d();
                try {
                    Bitmap f2 = m2973f(d, this.f1967g);
                    C1173e0.m3014e(d);
                    bitmap = f2;
                } catch (Throwable th) {
                    C1173e0.m3014e(d);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f1962b.f2069n) {
                C1173e0.m3030u("Hunter", "decoded", this.f1967g.mo10025d());
            }
            this.f1965e.mo9900b(bitmap);
            if (this.f1967g.mo10027f() || this.f1977q != 0) {
                synchronized (f1957t) {
                    if (this.f1967g.mo10026e() || this.f1977q != 0) {
                        bitmap = m2976x(this.f1967g, bitmap, this.f1977q);
                        if (this.f1962b.f2069n) {
                            C1173e0.m3030u("Hunter", "transformed", this.f1967g.mo10025d());
                        }
                    }
                    if (this.f1967g.mo10023b()) {
                        bitmap = m2971b(this.f1967g.f2110g, bitmap);
                        if (this.f1962b.f2069n) {
                            C1173e0.m3031v("Hunter", "transformed", this.f1967g.mo10025d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f1965e.mo9901c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo9931t() {
        Future<?> future = this.f1974n;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo9932v(boolean z, NetworkInfo networkInfo) {
        if (!(this.f1978r > 0)) {
            return false;
        }
        this.f1978r--;
        return this.f1970j.mo9995h(z, networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo9933w() {
        return this.f1970j.mo9996i();
    }
}
