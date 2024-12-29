package p239z5;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import org.eclipse.jetty.http.C9888b;
import org.eclipse.jetty.http.C9889c;
import org.eclipse.jetty.http.C9890d;
import org.eclipse.jetty.http.C9892f;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9904i;
import org.eclipse.jetty.http.C9907j;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9909l;
import org.eclipse.jetty.http.C9910m;
import org.eclipse.jetty.http.C9914p;
import org.eclipse.jetty.http.C9915q;
import org.eclipse.jetty.http.C9917s;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.EofException;
import org.eclipse.jetty.util.C9994m;
import org.eclipse.jetty.util.C9997p;
import p131b6.C4002a;
import p152e6.C9001b;
import p152e6.C9003c;
import p157f6.C9042e;
import p208s4.C10361m;
import p208s4.C10362n;
import p225w5.C11938b;
import p225w5.C11940d;
import p225w5.C11942e;
import p225w5.C11950k;
import p225w5.C11951l;

/* renamed from: z5.b */
public abstract class C12151b extends C11938b {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final C9003c f22344B = C9001b.m21450a(C12151b.class);

    /* renamed from: C */
    private static final ThreadLocal<C12151b> f22345C = new ThreadLocal<>();

    /* renamed from: A */
    private boolean f22346A = false;

    /* renamed from: d */
    private int f22347d;

    /* renamed from: e */
    protected final C12170f f22348e;

    /* renamed from: f */
    protected final C12187r f22349f;

    /* renamed from: g */
    protected final C9914p f22350g;

    /* renamed from: h */
    protected final C9917s f22351h;

    /* renamed from: i */
    protected final C9895h f22352i;

    /* renamed from: j */
    protected final C12181o f22353j;

    /* renamed from: k */
    protected volatile C10361m f22354k;

    /* renamed from: l */
    protected final C9889c f22355l;

    /* renamed from: m */
    protected final C9895h f22356m;

    /* renamed from: n */
    protected final C12186q f22357n;

    /* renamed from: o */
    protected volatile C12153b f22358o;

    /* renamed from: p */
    protected volatile C12154c f22359p;

    /* renamed from: q */
    protected volatile PrintWriter f22360q;

    /* renamed from: r */
    int f22361r;

    /* renamed from: s */
    private int f22362s = -2;

    /* renamed from: t */
    private String f22363t;

    /* renamed from: u */
    private boolean f22364u = false;

    /* renamed from: v */
    private boolean f22365v = false;

    /* renamed from: w */
    private boolean f22366w = false;

    /* renamed from: x */
    private boolean f22367x = false;

    /* renamed from: y */
    private boolean f22368y = false;

    /* renamed from: z */
    private boolean f22369z = false;

    /* renamed from: z5.b$a */
    class C12152a extends PrintWriter {
        C12152a(C12151b bVar, Writer writer) {
            super(writer);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                java.io.Writer r1 = r2.out     // Catch:{ IOException -> 0x000b }
                r1.close()     // Catch:{ IOException -> 0x000b }
                goto L_0x000e
            L_0x0009:
                r1 = move-exception
                goto L_0x0010
            L_0x000b:
                r2.setError()     // Catch:{ all -> 0x0009 }
            L_0x000e:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                return
            L_0x0010:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p239z5.C12151b.C12152a.close():void");
        }
    }

    /* renamed from: z5.b$b */
    public class C12153b extends C12178l {
        C12153b() {
            super(C12151b.this);
        }

        /* renamed from: a */
        public void mo39911a(String str) {
            if (!isClosed()) {
                C12151b.this.mo42993u((String) null).print(str);
                return;
            }
            throw new IOException("Closed");
        }

        public void close() {
            if (!isClosed()) {
                if (C12151b.this.mo42974J() || this.f22424c.mo39720g()) {
                    C12151b.this.mo42986m();
                } else {
                    C12151b.this.mo42982i(true);
                }
                super.close();
            }
        }

        public void flush() {
            if (!this.f22424c.mo39720g()) {
                C12151b.this.mo42982i(false);
            }
            super.flush();
        }

        /* renamed from: i */
        public void mo43002i(Object obj) {
            boolean z;
            StringBuilder sb;
            C9895h hVar;
            if (isClosed()) {
                throw new IOException("Closed");
            } else if (!this.f22424c.mo39732s()) {
                C9042e eVar = null;
                if (obj instanceof C9892f) {
                    C9892f fVar = (C9892f) obj;
                    C11940d contentType = fVar.getContentType();
                    if (contentType != null) {
                        C9895h hVar2 = C12151b.this.f22356m;
                        C11940d dVar = C9908k.f18090j;
                        if (!hVar2.mo39794j(dVar)) {
                            String A = C12151b.this.f22357n.mo43148A();
                            if (A == null) {
                                C12151b.this.f22356m.mo39789e(dVar, contentType);
                            } else {
                                if (contentType instanceof C11942e.C11943a) {
                                    C11942e.C11943a d = ((C11942e.C11943a) contentType).mo42463d(A);
                                    if (d != null) {
                                        C12151b.this.f22356m.mo39780D(dVar, d);
                                    } else {
                                        hVar = C12151b.this.f22356m;
                                        sb = new StringBuilder();
                                    }
                                } else {
                                    hVar = C12151b.this.f22356m;
                                    sb = new StringBuilder();
                                }
                                sb.append(contentType);
                                sb.append(";charset=");
                                sb.append(C9994m.m24702b(A, ";= "));
                                hVar.mo39779C(dVar, sb.toString());
                            }
                        }
                    }
                    if (fVar.mo39766h() > 0) {
                        C12151b.this.f22356m.mo39784H(C9908k.f18086f, fVar.mo39766h());
                    }
                    C11940d lastModified = fVar.getLastModified();
                    long k = fVar.mo39763g().mo36923k();
                    if (lastModified != null) {
                        C12151b.this.f22356m.mo39780D(C9908k.f18092l, lastModified);
                    } else if (!(fVar.mo39763g() == null || k == -1)) {
                        C12151b.this.f22356m.mo39782F(C9908k.f18092l, k);
                    }
                    C12170f fVar2 = C12151b.this.f22348e;
                    if (!(fVar2 instanceof C4002a) || !((C4002a) fVar2).mo26590a()) {
                        z = false;
                    } else {
                        C12170f fVar3 = C12151b.this.f22348e;
                        z = true;
                    }
                    C11940d f = z ? fVar.mo39762f() : fVar.mo39761e();
                    obj = f == null ? fVar.mo39760d() : f;
                } else if (obj instanceof C9042e) {
                    eVar = (C9042e) obj;
                    C12151b.this.f22356m.mo39782F(C9908k.f18092l, eVar.mo36923k());
                    obj = eVar.mo36921f();
                }
                if (obj instanceof C11940d) {
                    this.f22424c.mo39753l((C11940d) obj, true);
                    C12151b.this.mo42982i(true);
                } else if (obj instanceof InputStream) {
                    InputStream inputStream = (InputStream) obj;
                    try {
                        int E = this.f22424c.mo39711E();
                        C11940d z2 = this.f22424c.mo39739z();
                        while (z2.mo42444y0(inputStream, E) >= 0) {
                            this.f22424c.mo39736w();
                            C12151b.this.f22358o.flush();
                            E = this.f22424c.mo39711E();
                            z2 = this.f22424c.mo39739z();
                        }
                        this.f22424c.mo39736w();
                        C12151b.this.f22358o.flush();
                        if (eVar == null) {
                            inputStream.close();
                        }
                    } finally {
                        if (eVar != null) {
                            eVar.mo36931r();
                        } else {
                            inputStream.close();
                        }
                    }
                } else {
                    throw new IllegalArgumentException("unknown content type?");
                }
            } else {
                throw new IllegalStateException("!empty");
            }
        }

        /* renamed from: k */
        public void mo43003k(C11940d dVar) {
            ((C9904i) this.f22424c).mo39833L(dVar);
        }
    }

    /* renamed from: z5.b$c */
    public class C12154c extends C12179m {
        C12154c(C12151b bVar) {
            super(bVar.f22358o);
        }
    }

    /* renamed from: z5.b$d */
    private class C12155d extends C9910m.C9911a {
        private C12155d() {
        }

        /* synthetic */ C12155d(C12151b bVar, C12152a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo39532a(C11940d dVar) {
            C12151b.this.mo42984k(dVar);
        }

        /* renamed from: b */
        public void mo39533b() {
            C12151b.this.mo42985l();
        }

        /* renamed from: c */
        public void mo39534c() {
            C12151b.this.mo42968D();
        }

        /* renamed from: d */
        public void mo39535d(long j) {
            C12151b.this.mo42976L(j);
        }

        /* renamed from: e */
        public void mo39536e(C11940d dVar, C11940d dVar2) {
            C12151b.this.mo42979O(dVar, dVar2);
        }

        /* renamed from: f */
        public void mo39537f(C11940d dVar, C11940d dVar2, C11940d dVar3) {
            C12151b.this.mo42981R(dVar, dVar2, dVar3);
        }

        /* renamed from: g */
        public void mo39538g(C11940d dVar, int i, C11940d dVar2) {
            if (C12151b.f22344B.mo36846a()) {
                C9003c h = C12151b.f22344B;
                h.mo36850e("Bad request!: " + dVar + " " + i + " " + dVar2, new Object[0]);
            }
        }
    }

    public C12151b(C12170f fVar, C11950k kVar, C12187r rVar) {
        super(kVar);
        String str = C9997p.f18441a;
        this.f22350g = "UTF-8".equals(str) ? new C9914p() : new C9888b(str);
        this.f22348e = fVar;
        C9890d dVar = (C9890d) fVar;
        this.f22351h = mo42978N(dVar.mo39592r0(), kVar, new C12155d(this, (C12152a) null));
        this.f22352i = new C9895h();
        this.f22356m = new C9895h();
        this.f22353j = new C12181o(this);
        this.f22357n = new C12186q(this);
        C9904i M = mo42977M(dVar.mo39572X(), kVar);
        this.f22355l = M;
        M.mo39729q(rVar.mo43171X0());
        this.f22349f = rVar;
    }

    /* renamed from: Q */
    protected static void m31591Q(C12151b bVar) {
        f22345C.set(bVar);
    }

    /* renamed from: o */
    public static C12151b m31593o() {
        return f22345C.get();
    }

    /* renamed from: A */
    public C9895h mo42965A() {
        return this.f22356m;
    }

    /* renamed from: B */
    public C12187r mo42966B() {
        return this.f22349f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017b, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x017e, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017f, code lost:
        r2 = r5;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0183, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0184, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        f22344B.mo36848c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r15.f22353j.mo43115o0(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0195, code lost:
        if (r15.f22357n.mo39908g() == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0197, code lost:
        r15.f22355l.mo39727o(500, (java.lang.String) null, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a4, code lost:
        if (r15.f22353j.f22453a.mo43005B() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01aa, code lost:
        if (r6.isRunning() != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ae, code lost:
        if (r15.f22349f != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b1, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b4, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        f22344B.mo36849d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d0, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e1, code lost:
        r6 = r15.f22349f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e4, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e5, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0236, code lost:
        if (r15.f22355l.mo39718e() == false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02c3, code lost:
        if (r15.f22355l.mo39718e() == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r12 = f22344B;
        r12.mo36847b("Failed UTF-8 decode for request path, trying ISO-8859-1", new java.lang.Object[0]);
        r12.mo36849d(r11);
        r11 = r15.f22350g.mo39855f("ISO-8859-1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r15.f22349f != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f8, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        f22344B.mo36852g(java.lang.String.valueOf(r15.f22350g), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r15.f22353j.mo43115o0(true);
        r9 = r15.f22355l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r11 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0111, code lost:
        r7 = 500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0113, code lost:
        r9.mo39727o(r7, (java.lang.String) null, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011e, code lost:
        if (r15.f22353j.f22453a.mo43005B() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0124, code lost:
        if (r6.isRunning() != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0128, code lost:
        if (r15.f22349f != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        f22344B.mo36848c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r15.f22353j.mo43115o0(true);
        r15.f22357n.mo37776d(r7.getStatus(), r7.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (r15.f22353j.f22453a.mo43005B() == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r6.isRunning() != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0155, code lost:
        if (r15.f22349f != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0158, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0159, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        f22344B.mo36848c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r15.f22353j.mo43115o0(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016c, code lost:
        if (r15.f22353j.f22453a.mo43005B() == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0172, code lost:
        if (r6.isRunning() != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0176, code lost:
        if (r15.f22349f != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0178, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0183 A[ExcHandler: EofException (r7v17 'e' org.eclipse.jetty.io.EofException A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b4 A[ExcHandler: ContinuationThrowable (r7v11 'e' org.eclipse.jetty.continuation.ContinuationThrowable A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110 A[Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8, all -> 0x01d0, all -> 0x01b1, all -> 0x017e, all -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0111 A[Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8, all -> 0x01d0, all -> 0x01b1, all -> 0x017e, all -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0120 A[Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8, all -> 0x01d0, all -> 0x01b1, all -> 0x017e, all -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012b A[ExcHandler: HttpException (r7v39 'e' org.eclipse.jetty.http.HttpException A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0158 A[ExcHandler: RuntimeIOException (r7v31 'e' org.eclipse.jetty.io.RuntimeIOException A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42967C() {
        /*
            r15 = this;
            java.lang.String r0 = "100 continues not sent"
            r1 = 404(0x194, float:5.66E-43)
            r2 = 0
            r3 = 0
            r4 = 1
            e6.c r5 = f22344B     // Catch:{ all -> 0x0272 }
            boolean r5 = r5.mo36846a()     // Catch:{ all -> 0x0272 }
            if (r5 == 0) goto L_0x0035
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0272 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0272 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x026e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x026e }
            r7.<init>()     // Catch:{ all -> 0x026e }
            r7.append(r5)     // Catch:{ all -> 0x026e }
            java.lang.String r8 = " - "
            r7.append(r8)     // Catch:{ all -> 0x026e }
            org.eclipse.jetty.http.p r8 = r15.f22350g     // Catch:{ all -> 0x026e }
            r7.append(r8)     // Catch:{ all -> 0x026e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x026e }
            r6.setName(r7)     // Catch:{ all -> 0x026e }
            goto L_0x0036
        L_0x0035:
            r5 = r2
        L_0x0036:
            z5.r r6 = r15.f22349f     // Catch:{ all -> 0x026e }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x026e }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x026e }
            boolean r7 = r7.mo43017q()     // Catch:{ all -> 0x026e }
            if (r7 == 0) goto L_0x004c
            if (r6 == 0) goto L_0x004c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x026e }
            if (r7 == 0) goto L_0x004c
            r7 = 1
            goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            r8 = r2
            r9 = 0
        L_0x004f:
            if (r7 == 0) goto L_0x01e8
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01e4 }
            r7.mo43115o0(r3)     // Catch:{ all -> 0x01e4 }
            r7 = 400(0x190, float:5.6E-43)
            r10 = 500(0x1f4, float:7.0E-43)
            org.eclipse.jetty.http.p r11 = r15.f22350g     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            r11.mo39748k()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            org.eclipse.jetty.http.p r11 = r15.f22350g     // Catch:{ Exception -> 0x0066, ContinuationThrowable -> 0x01b4, all -> 0x00fa }
            java.lang.String r11 = r11.mo39743e()     // Catch:{ Exception -> 0x0066, ContinuationThrowable -> 0x01b4, all -> 0x00fa }
            goto L_0x007b
        L_0x0066:
            r11 = move-exception
            e6.c r12 = f22344B     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            java.lang.String r13 = "Failed UTF-8 decode for request path, trying ISO-8859-1"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            r12.mo36847b(r13, r14)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            r12.mo36849d(r11)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            org.eclipse.jetty.http.p r11 = r15.f22350g     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            java.lang.String r12 = "ISO-8859-1"
            java.lang.String r11 = r11.mo39855f(r12)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
        L_0x007b:
            java.lang.String r11 = org.eclipse.jetty.util.C9997p.m24724b(r11)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00fa }
            if (r11 != 0) goto L_0x00a8
            z5.o r12 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            java.lang.String r12 = r12.mo37767l()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            java.lang.String r13 = "CONNECT"
            boolean r12 = r12.equals(r13)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            if (r12 != 0) goto L_0x00a8
            org.eclipse.jetty.http.p r12 = r15.f22350g     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            java.lang.String r12 = r12.mo39750n()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            if (r12 == 0) goto L_0x00a2
            org.eclipse.jetty.http.p r12 = r15.f22350g     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            java.lang.String r12 = r12.mo39745h()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            if (r12 == 0) goto L_0x00a2
            java.lang.String r11 = "/"
            goto L_0x00a8
        L_0x00a2:
            org.eclipse.jetty.http.HttpException r12 = new org.eclipse.jetty.http.HttpException     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.<init>(r7)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            throw r12     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
        L_0x00a8:
            z5.o r12 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.mo43118r0(r11)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            z5.b$b r12 = r15.f22358o     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            if (r12 == 0) goto L_0x00b6
            z5.b$b r12 = r15.f22358o     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.mo43050f()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
        L_0x00b6:
            z5.o r12 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            z5.c r12 = r12.f22453a     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            boolean r12 = r12.mo43020t()     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            if (r12 == 0) goto L_0x00d4
            z5.o r12 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            javax.servlet.DispatcherType r13 = javax.servlet.DispatcherType.REQUEST     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.mo43114n0(r13)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            z5.f r12 = r15.f22348e     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            w5.k r13 = r15.f21821b     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            z5.o r14 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.mo26542j(r13, r14)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r6.mo43175b1(r15)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            goto L_0x00de
        L_0x00d4:
            z5.o r12 = r15.f22353j     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            javax.servlet.DispatcherType r13 = javax.servlet.DispatcherType.ASYNC     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r12.mo43114n0(r13)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
            r6.mo43176c1(r15)     // Catch:{ ContinuationThrowable -> 0x01b4, EofException -> 0x0183, RuntimeIOException -> 0x0158, HttpException -> 0x012b, all -> 0x00f8 }
        L_0x00de:
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01e4 }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x01e4 }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x01e4 }
            if (r7 != 0) goto L_0x00f5
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x01e4 }
            if (r7 == 0) goto L_0x00f5
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x01e4 }
            if (r7 == 0) goto L_0x00f5
        L_0x00f2:
            r7 = 1
            goto L_0x004f
        L_0x00f5:
            r7 = 0
            goto L_0x004f
        L_0x00f8:
            r8 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r8 = move-exception
            r11 = r2
        L_0x00fc:
            e6.c r12 = f22344B     // Catch:{ all -> 0x01d0 }
            org.eclipse.jetty.http.p r13 = r15.f22350g     // Catch:{ all -> 0x01d0 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01d0 }
            r12.mo36852g(r13, r8)     // Catch:{ all -> 0x01d0 }
            z5.o r9 = r15.f22353j     // Catch:{ all -> 0x01b1 }
            r9.mo43115o0(r4)     // Catch:{ all -> 0x01b1 }
            org.eclipse.jetty.http.c r9 = r15.f22355l     // Catch:{ all -> 0x01b1 }
            if (r11 != 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r7 = 500(0x1f4, float:7.0E-43)
        L_0x0113:
            r9.mo39727o(r7, r2, r2, r4)     // Catch:{ all -> 0x01b1 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x017e }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x017e }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x017e }
            if (r7 != 0) goto L_0x017a
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            goto L_0x0178
        L_0x012b:
            r7 = move-exception
            e6.c r10 = f22344B     // Catch:{ all -> 0x01d0 }
            r10.mo36848c(r7)     // Catch:{ all -> 0x01d0 }
            z5.o r9 = r15.f22353j     // Catch:{ all -> 0x01b1 }
            r9.mo43115o0(r4)     // Catch:{ all -> 0x01b1 }
            z5.q r9 = r15.f22357n     // Catch:{ all -> 0x01b1 }
            int r10 = r7.getStatus()     // Catch:{ all -> 0x01b1 }
            java.lang.String r7 = r7.getReason()     // Catch:{ all -> 0x01b1 }
            r9.mo37776d(r10, r7)     // Catch:{ all -> 0x01b1 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x017e }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x017e }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x017e }
            if (r7 != 0) goto L_0x017a
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            goto L_0x0178
        L_0x0158:
            r7 = move-exception
            r8 = r7
            e6.c r7 = f22344B     // Catch:{ all -> 0x01d0 }
            r7.mo36848c(r8)     // Catch:{ all -> 0x01d0 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01b1 }
            r7.mo43115o0(r4)     // Catch:{ all -> 0x01b1 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x017e }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x017e }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x017e }
            if (r7 != 0) goto L_0x017a
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
        L_0x0178:
            r7 = 1
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            r9 = 1
            goto L_0x004f
        L_0x017e:
            r6 = move-exception
            r2 = r5
            r9 = 1
            goto L_0x0275
        L_0x0183:
            r7 = move-exception
            r8 = r7
            e6.c r7 = f22344B     // Catch:{ all -> 0x01d0 }
            r7.mo36848c(r8)     // Catch:{ all -> 0x01d0 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01b1 }
            r7.mo43115o0(r4)     // Catch:{ all -> 0x01b1 }
            z5.q r7 = r15.f22357n     // Catch:{ all -> 0x01b1 }
            boolean r7 = r7.mo39908g()     // Catch:{ all -> 0x01b1 }
            if (r7 != 0) goto L_0x019c
            org.eclipse.jetty.http.c r7 = r15.f22355l     // Catch:{ all -> 0x01b1 }
            r7.mo39727o(r10, r2, r2, r4)     // Catch:{ all -> 0x01b1 }
        L_0x019c:
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x017e }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x017e }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x017e }
            if (r7 != 0) goto L_0x017a
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x017e }
            if (r7 == 0) goto L_0x017a
            goto L_0x0178
        L_0x01b1:
            r2 = move-exception
            r9 = 1
            goto L_0x01d1
        L_0x01b4:
            r7 = move-exception
            e6.c r10 = f22344B     // Catch:{ all -> 0x01d0 }
            r10.mo36849d(r7)     // Catch:{ all -> 0x01d0 }
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01e4 }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x01e4 }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x01e4 }
            if (r7 != 0) goto L_0x00f5
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x01e4 }
            if (r7 == 0) goto L_0x00f5
            z5.r r7 = r15.f22349f     // Catch:{ all -> 0x01e4 }
            if (r7 == 0) goto L_0x00f5
            goto L_0x00f2
        L_0x01d0:
            r2 = move-exception
        L_0x01d1:
            z5.o r7 = r15.f22353j     // Catch:{ all -> 0x01e4 }
            z5.c r7 = r7.f22453a     // Catch:{ all -> 0x01e4 }
            boolean r7 = r7.mo43005B()     // Catch:{ all -> 0x01e4 }
            if (r7 != 0) goto L_0x01e3
            boolean r6 = r6.isRunning()     // Catch:{ all -> 0x01e4 }
            if (r6 == 0) goto L_0x01e3
            z5.r r6 = r15.f22349f     // Catch:{ all -> 0x01e4 }
        L_0x01e3:
            throw r2     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r6 = move-exception
            r2 = r5
            goto L_0x0275
        L_0x01e8:
            if (r5 == 0) goto L_0x01f1
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r5)
        L_0x01f1:
            z5.o r2 = r15.f22353j
            z5.c r2 = r2.f22453a
            boolean r2 = r2.mo43023v()
            if (r2 == 0) goto L_0x026d
            z5.o r2 = r15.f22353j
            z5.c r2 = r2.f22453a
            r2.mo43010i(r8)
            boolean r2 = r15.f22365v
            if (r2 == 0) goto L_0x021c
            e6.c r2 = f22344B
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r2.mo36850e(r0, r5)
            r15.f22365v = r3
            z5.q r0 = r15.f22357n
            boolean r0 = r0.mo39908g()
            if (r0 != 0) goto L_0x021c
            org.eclipse.jetty.http.c r0 = r15.f22355l
            r0.mo39715c(r3)
        L_0x021c:
            w5.k r0 = r15.f21821b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0263
            if (r9 == 0) goto L_0x0239
            w5.k r0 = r15.f21821b
            r0.mo39670t()
            org.eclipse.jetty.http.c r0 = r15.f22355l
            r0.mo39715c(r3)
            org.eclipse.jetty.http.c r0 = r15.f22355l
            boolean r0 = r0.mo39718e()
            if (r0 != 0) goto L_0x0268
            goto L_0x0263
        L_0x0239:
            z5.q r0 = r15.f22357n
            boolean r0 = r0.mo39908g()
            if (r0 != 0) goto L_0x024e
            z5.o r0 = r15.f22353j
            boolean r0 = r0.mo43100Z()
            if (r0 != 0) goto L_0x024e
            z5.q r0 = r15.f22357n
            r0.mo37778k(r1)
        L_0x024e:
            z5.q r0 = r15.f22357n
            r0.mo43159s()
            org.eclipse.jetty.http.c r0 = r15.f22355l
            boolean r0 = r0.mo39719f()
            if (r0 == 0) goto L_0x0268
            z5.f r0 = r15.f22348e
            w5.k r1 = r15.f21821b
            r0.mo42916G(r1)
            goto L_0x0268
        L_0x0263:
            z5.q r0 = r15.f22357n
            r0.mo43159s()
        L_0x0268:
            z5.o r0 = r15.f22353j
            r0.mo43115o0(r4)
        L_0x026d:
            return
        L_0x026e:
            r6 = move-exception
            r8 = r2
            r2 = r5
            goto L_0x0274
        L_0x0272:
            r6 = move-exception
            r8 = r2
        L_0x0274:
            r9 = 0
        L_0x0275:
            if (r2 == 0) goto L_0x027e
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.setName(r2)
        L_0x027e:
            z5.o r2 = r15.f22353j
            z5.c r2 = r2.f22453a
            boolean r2 = r2.mo43023v()
            if (r2 == 0) goto L_0x02fa
            z5.o r2 = r15.f22353j
            z5.c r2 = r2.f22453a
            r2.mo43010i(r8)
            boolean r2 = r15.f22365v
            if (r2 == 0) goto L_0x02a9
            e6.c r2 = f22344B
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r2.mo36850e(r0, r5)
            r15.f22365v = r3
            z5.q r0 = r15.f22357n
            boolean r0 = r0.mo39908g()
            if (r0 != 0) goto L_0x02a9
            org.eclipse.jetty.http.c r0 = r15.f22355l
            r0.mo39715c(r3)
        L_0x02a9:
            w5.k r0 = r15.f21821b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x02f0
            if (r9 == 0) goto L_0x02c6
            w5.k r0 = r15.f21821b
            r0.mo39670t()
            org.eclipse.jetty.http.c r0 = r15.f22355l
            r0.mo39715c(r3)
            org.eclipse.jetty.http.c r0 = r15.f22355l
            boolean r0 = r0.mo39718e()
            if (r0 != 0) goto L_0x02f5
            goto L_0x02f0
        L_0x02c6:
            z5.q r0 = r15.f22357n
            boolean r0 = r0.mo39908g()
            if (r0 != 0) goto L_0x02db
            z5.o r0 = r15.f22353j
            boolean r0 = r0.mo43100Z()
            if (r0 != 0) goto L_0x02db
            z5.q r0 = r15.f22357n
            r0.mo37778k(r1)
        L_0x02db:
            z5.q r0 = r15.f22357n
            r0.mo43159s()
            org.eclipse.jetty.http.c r0 = r15.f22355l
            boolean r0 = r0.mo39719f()
            if (r0 == 0) goto L_0x02f5
            z5.f r0 = r15.f22348e
            w5.k r1 = r15.f21821b
            r0.mo42916G(r1)
            goto L_0x02f5
        L_0x02f0:
            z5.q r0 = r15.f22357n
            r0.mo43159s()
        L_0x02f5:
            z5.o r0 = r15.f22353j
            r0.mo43115o0(r4)
        L_0x02fa:
            goto L_0x02fc
        L_0x02fb:
            throw r6
        L_0x02fc:
            goto L_0x02fb
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12151b.mo42967C():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo42968D() {
        C9889c cVar;
        int i;
        this.f22347d++;
        this.f22355l.mo39722i(this.f22362s);
        int i2 = this.f22362s;
        if (i2 == 10) {
            this.f22355l.mo39728p(this.f22367x);
            if (this.f22351h.mo39840f()) {
                this.f22356m.mo39789e(C9908k.f18087g, C9907j.f18082f);
                this.f22355l.mo39715c(true);
            } else if ("CONNECT".equals(this.f22353j.mo37767l())) {
                this.f22355l.mo39715c(true);
                this.f22351h.mo39837c(true);
            }
            if (this.f22349f.mo43170W0()) {
                this.f22355l.mo39721h(this.f22353j.mo43097W());
            }
        } else if (i2 == 11) {
            this.f22355l.mo39728p(this.f22367x);
            if (!this.f22351h.mo39840f()) {
                this.f22356m.mo39789e(C9908k.f18087g, C9907j.f18081e);
                this.f22355l.mo39715c(false);
            }
            if (this.f22349f.mo43170W0()) {
                this.f22355l.mo39721h(this.f22353j.mo43097W());
            }
            if (!this.f22368y) {
                f22344B.mo36850e("!host {}", this);
                cVar = this.f22355l;
                i = 400;
            } else if (this.f22364u) {
                f22344B.mo36850e("!expectation {}", this);
                cVar = this.f22355l;
                i = 417;
            }
            cVar.mo39725m(i, (String) null);
            this.f22356m.mo39780D(C9908k.f18087g, C9907j.f18081e);
            this.f22355l.mo39726n(this.f22356m, true);
            this.f22355l.complete();
            return;
        }
        String str = this.f22363t;
        if (str != null) {
            this.f22353j.mo43110j0(str);
        }
        if ((((C9910m) this.f22351h).mo39844j() > 0 || ((C9910m) this.f22351h).mo39847m()) && !this.f22365v) {
            this.f22369z = true;
        } else {
            mo42967C();
        }
    }

    /* renamed from: E */
    public void mo42969E() {
        this.f22361r++;
    }

    /* renamed from: F */
    public void mo42970F() {
        this.f22361r--;
        if (this.f22358o != null) {
            this.f22358o.mo43050f();
        }
    }

    /* renamed from: G */
    public boolean mo42971G(C12181o oVar) {
        C12170f fVar = this.f22348e;
        return fVar != null && fVar.mo42920K(oVar);
    }

    /* renamed from: H */
    public boolean mo42972H() {
        return this.f22346A;
    }

    /* renamed from: I */
    public boolean mo42973I() {
        return this.f22366w;
    }

    /* renamed from: J */
    public boolean mo42974J() {
        return this.f22361r > 0;
    }

    /* renamed from: K */
    public boolean mo42975K() {
        return this.f22355l.mo39720g();
    }

    /* renamed from: L */
    public void mo42976L(long j) {
        if (this.f22369z) {
            this.f22369z = false;
            mo42967C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C9904i mo42977M(Buffers buffers, C11950k kVar) {
        return new C9904i(buffers, kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public C9910m mo42978N(Buffers buffers, C11950k kVar, C9910m.C9911a aVar) {
        return new C9910m(buffers, kVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != 40) goto L_0x008c;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42979O(p225w5.C11940d r8, p225w5.C11940d r9) {
        /*
            r7 = this;
            org.eclipse.jetty.http.k r0 = org.eclipse.jetty.http.C9908k.f18084d
            int r0 = r0.mo42459f(r8)
            r1 = 16
            if (r0 == r1) goto L_0x0080
            r1 = 21
            if (r0 == r1) goto L_0x0079
            r1 = 24
            r2 = 1
            if (r0 == r1) goto L_0x0021
            r1 = 27
            if (r0 == r1) goto L_0x001d
            r1 = 40
            if (r0 == r1) goto L_0x0079
            goto L_0x008c
        L_0x001d:
            r7.f22368y = r2
            goto L_0x008c
        L_0x0021:
            org.eclipse.jetty.http.j r0 = org.eclipse.jetty.http.C9907j.f18080d
            w5.d r9 = r0.mo42461h(r9)
            int r0 = r0.mo42459f(r9)
            r1 = 6
            if (r0 == r1) goto L_0x0072
            r3 = 7
            if (r0 == r3) goto L_0x006b
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = ","
            java.lang.String[] r0 = r0.split(r4)
            r4 = 0
        L_0x003c:
            if (r0 == 0) goto L_0x008c
            int r5 = r0.length
            if (r4 >= r5) goto L_0x008c
            org.eclipse.jetty.http.j r5 = org.eclipse.jetty.http.C9907j.f18080d
            r6 = r0[r4]
            java.lang.String r6 = r6.trim()
            w5.e$a r5 = r5.mo42455b(r6)
            if (r5 != 0) goto L_0x0052
        L_0x004f:
            r7.f22364u = r2
            goto L_0x0068
        L_0x0052:
            int r5 = r5.mo42464e()
            if (r5 == r1) goto L_0x0062
            if (r5 == r3) goto L_0x005b
            goto L_0x004f
        L_0x005b:
            org.eclipse.jetty.http.c r5 = r7.f22355l
            boolean r5 = r5 instanceof org.eclipse.jetty.http.C9904i
            r7.f22366w = r5
            goto L_0x0068
        L_0x0062:
            org.eclipse.jetty.http.c r5 = r7.f22355l
            boolean r5 = r5 instanceof org.eclipse.jetty.http.C9904i
            r7.f22365v = r5
        L_0x0068:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x006b:
            org.eclipse.jetty.http.c r0 = r7.f22355l
            boolean r0 = r0 instanceof org.eclipse.jetty.http.C9904i
            r7.f22366w = r0
            goto L_0x008c
        L_0x0072:
            org.eclipse.jetty.http.c r0 = r7.f22355l
            boolean r0 = r0 instanceof org.eclipse.jetty.http.C9904i
            r7.f22365v = r0
            goto L_0x008c
        L_0x0079:
            org.eclipse.jetty.http.j r0 = org.eclipse.jetty.http.C9907j.f18080d
            w5.d r9 = r0.mo42461h(r9)
            goto L_0x008c
        L_0x0080:
            w5.e r0 = org.eclipse.jetty.http.C9916r.f18145d
            w5.d r9 = r0.mo42461h(r9)
            java.lang.String r0 = org.eclipse.jetty.http.C9916r.m24281a(r9)
            r7.f22363t = r0
        L_0x008c:
            org.eclipse.jetty.http.h r0 = r7.f22352i
            r0.mo39789e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12151b.mo42979O(w5.d, w5.d):void");
    }

    /* renamed from: P */
    public void mo42980P() {
        this.f22351h.reset();
        this.f22351h.mo39838d();
        this.f22352i.mo39792h();
        this.f22353j.mo43104d0();
        this.f22355l.reset();
        this.f22355l.mo39717d();
        this.f22356m.mo39792h();
        this.f22357n.mo43151D();
        this.f22350g.mo39854a();
        this.f22359p = null;
        this.f22346A = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo42981R(C11940d dVar, C11940d dVar2, C11940d dVar3) {
        C11940d b1 = dVar2.mo42421b1();
        this.f22368y = false;
        this.f22364u = false;
        this.f22365v = false;
        this.f22366w = false;
        this.f22369z = false;
        this.f22363t = null;
        if (this.f22353j.mo43096V() == 0) {
            this.f22353j.mo43078G0(System.currentTimeMillis());
        }
        this.f22353j.mo43116p0(dVar.toString());
        try {
            this.f22367x = false;
            int f = C9909l.f18097a.mo42459f(dVar);
            if (f == 3) {
                this.f22367x = true;
                this.f22350g.mo39858q(b1.mo42451g0(), b1.mo42409L0(), b1.length());
            } else if (f != 8) {
                this.f22350g.mo39858q(b1.mo42451g0(), b1.mo42409L0(), b1.length());
            } else {
                this.f22350g.mo39859s(b1.mo42451g0(), b1.mo42409L0(), b1.length());
            }
            this.f22353j.mo43080H0(this.f22350g);
            if (dVar3 == null) {
                this.f22353j.mo43119s0("");
                this.f22362s = 9;
                return;
            }
            C11942e eVar = C9915q.f18140a;
            C11942e.C11943a c = eVar.mo42456c(dVar3);
            if (c != null) {
                int f2 = eVar.mo42459f(c);
                this.f22362s = f2;
                if (f2 <= 0) {
                    this.f22362s = 10;
                }
                this.f22353j.mo43119s0(c.toString());
                return;
            }
            throw new HttpException(400, (String) null);
        } catch (Exception e) {
            f22344B.mo36848c(e);
            if (e instanceof HttpException) {
                throw ((HttpException) e);
            }
            throw new HttpException(400, (String) null, e);
        }
    }

    /* renamed from: a */
    public boolean mo39518a() {
        return this.f22355l.mo39713a() && (this.f22351h.mo39835a() || this.f22369z);
    }

    /* renamed from: i */
    public void mo42982i(boolean z) {
        if (!this.f22355l.mo39720g()) {
            this.f22355l.mo39725m(this.f22357n.mo43149B(), this.f22357n.mo43166y());
            try {
                if (this.f22365v && this.f22357n.mo43149B() != 100) {
                    this.f22355l.mo39715c(false);
                }
                this.f22355l.mo39726n(this.f22356m, z);
            } catch (RuntimeException e) {
                C9003c cVar = f22344B;
                cVar.mo36847b("header full: " + e, new Object[0]);
                this.f22357n.mo43152E();
                this.f22355l.reset();
                this.f22355l.mo39725m(500, (String) null);
                this.f22355l.mo39726n(this.f22356m, true);
                this.f22355l.complete();
                throw new HttpException(500);
            }
        }
        if (z) {
            this.f22355l.complete();
        }
    }

    /* renamed from: j */
    public void mo42983j() {
        if (!this.f22355l.mo39720g()) {
            this.f22355l.mo39725m(this.f22357n.mo43149B(), this.f22357n.mo43166y());
            try {
                this.f22355l.mo39726n(this.f22356m, true);
            } catch (RuntimeException e) {
                C9003c cVar = f22344B;
                cVar.mo36847b("header full: " + e, new Object[0]);
                cVar.mo36848c(e);
                this.f22357n.mo43152E();
                this.f22355l.reset();
                this.f22355l.mo39725m(500, (String) null);
                this.f22355l.mo39726n(this.f22356m, true);
                this.f22355l.complete();
                throw new HttpException(500);
            }
        }
        this.f22355l.complete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo42984k(C11940d dVar) {
        if (this.f22369z) {
            this.f22369z = false;
            mo42967C();
        }
    }

    /* renamed from: l */
    public void mo42985l() {
        this.f22346A = true;
    }

    /* renamed from: m */
    public void mo42986m() {
        try {
            mo42982i(false);
            this.f22355l.mo39724k();
        } catch (IOException e) {
            e = e;
            if (!(e instanceof EofException)) {
                e = new EofException((Throwable) e);
            }
            throw e;
        }
    }

    /* renamed from: n */
    public C12170f mo42987n() {
        return this.f22348e;
    }

    public void onClose() {
        f22344B.mo36850e("closed {}", this);
    }

    /* renamed from: p */
    public C9889c mo42988p() {
        return this.f22355l;
    }

    /* renamed from: q */
    public C10361m mo42989q() {
        if (this.f22365v) {
            if (((C9910m) this.f22351h).mo39845k() == null || ((C9910m) this.f22351h).mo39845k().length() < 2) {
                if (!this.f22355l.mo39720g()) {
                    ((C9904i) this.f22355l).mo39832K(100);
                } else {
                    throw new IllegalStateException("Committed before 100 Continues");
                }
            }
            this.f22365v = false;
        }
        if (this.f22354k == null) {
            this.f22354k = new C12177k(this);
        }
        return this.f22354k;
    }

    /* renamed from: r */
    public int mo42990r() {
        return (!this.f22348e.mo42922N() || this.f21821b.mo39655f() != this.f22348e.mo42945f()) ? this.f21821b.mo39655f() > 0 ? this.f21821b.mo39655f() : this.f22348e.mo42945f() : this.f22348e.mo42960s();
    }

    /* renamed from: s */
    public C10362n mo42991s() {
        if (this.f22358o == null) {
            this.f22358o = new C12153b();
        }
        return this.f22358o;
    }

    /* renamed from: t */
    public C9917s mo42992t() {
        return this.f22351h;
    }

    public String toString() {
        return String.format("%s,g=%s,p=%s,r=%d", new Object[]{super.toString(), this.f22355l, this.f22351h, Integer.valueOf(this.f22347d)});
    }

    /* renamed from: u */
    public PrintWriter mo42993u(String str) {
        mo42991s();
        if (this.f22359p == null) {
            this.f22359p = new C12154c(this);
            this.f22360q = this.f22349f.mo43179f1() ? new C11951l(this.f22359p) : new C12152a(this, this.f22359p);
        }
        this.f22359p.mo43055c(str);
        return this.f22360q;
    }

    /* renamed from: v */
    public C12181o mo42994v() {
        return this.f22353j;
    }

    /* renamed from: w */
    public C9895h mo42995w() {
        return this.f22352i;
    }

    /* renamed from: x */
    public int mo42996x() {
        return this.f22347d;
    }

    /* renamed from: y */
    public boolean mo42997y() {
        return this.f22348e.mo42961t();
    }

    /* renamed from: z */
    public C12186q mo42998z() {
        return this.f22357n;
    }
}
