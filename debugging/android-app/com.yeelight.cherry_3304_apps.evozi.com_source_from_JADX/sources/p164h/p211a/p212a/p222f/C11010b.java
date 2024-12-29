package p164h.p211a.p212a.p222f;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import p154d.p155b.C10731q;
import p154d.p155b.C10732r;
import p164h.p211a.p212a.p216c.C10890b;
import p164h.p211a.p212a.p216c.C10891c;
import p164h.p211a.p212a.p216c.C10892d;
import p164h.p211a.p212a.p216c.C10894f;
import p164h.p211a.p212a.p216c.C10896h;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10906j;
import p164h.p211a.p212a.p216c.C10909k;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p216c.C10911m;
import p164h.p211a.p212a.p216c.C10912n;
import p164h.p211a.p212a.p216c.C10918r;
import p164h.p211a.p212a.p216c.C10919s;
import p164h.p211a.p212a.p216c.C10921u;
import p164h.p211a.p212a.p217d.C10927c;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p217d.C10949s;
import p164h.p211a.p212a.p222f.p225x.C11061a;
import p164h.p211a.p212a.p228h.C11132o;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;
import p164h.p211a.p212a.p228h.p235z.C11165e;

/* renamed from: h.a.a.f.b */
public abstract class C11010b extends C10927c {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final C11158c f21551B = C11156b.m29015a(C11010b.class);

    /* renamed from: G */
    private static final ThreadLocal<C11010b> f21552G = new ThreadLocal<>();

    /* renamed from: A */
    private boolean f21553A = false;

    /* renamed from: d */
    private int f21554d;

    /* renamed from: e */
    protected final C11028f f21555e;

    /* renamed from: f */
    protected final C11040p f21556f;

    /* renamed from: g */
    protected final C10918r f21557g;

    /* renamed from: h */
    protected final C10921u f21558h;

    /* renamed from: i */
    protected final C10897i f21559i;

    /* renamed from: j */
    protected final C11037n f21560j;

    /* renamed from: k */
    protected volatile C10731q f21561k;

    /* renamed from: l */
    protected final C10891c f21562l;

    /* renamed from: m */
    protected final C10897i f21563m;

    /* renamed from: n */
    protected final C11039o f21564n;

    /* renamed from: o */
    protected volatile C11012b f21565o;

    /* renamed from: p */
    protected volatile C11013c f21566p;

    /* renamed from: q */
    protected volatile PrintWriter f21567q;

    /* renamed from: r */
    int f21568r;

    /* renamed from: s */
    private int f21569s = -2;

    /* renamed from: t */
    private String f21570t;

    /* renamed from: u */
    private boolean f21571u = false;

    /* renamed from: v */
    private boolean f21572v = false;

    /* renamed from: w */
    private boolean f21573w = false;

    /* renamed from: x */
    private boolean f21574x = false;

    /* renamed from: y */
    private boolean f21575y = false;

    /* renamed from: z */
    private boolean f21576z = false;

    /* renamed from: h.a.a.f.b$a */
    class C11011a extends PrintWriter {
        C11011a(C11010b bVar, Writer writer) {
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
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11010b.C11011a.close():void");
        }
    }

    /* renamed from: h.a.a.f.b$b */
    public class C11012b extends C11035l {
        C11012b() {
            super(C11010b.this);
        }

        public void close() {
            if (!isClosed()) {
                if (C11010b.this.mo34829H() || this.f21624b.mo34399g()) {
                    C11010b.this.mo34841m();
                } else {
                    C11010b.this.mo34837i(true);
                }
                super.close();
            }
        }

        public void flush() {
            if (!this.f21624b.mo34399g()) {
                C11010b.this.mo34837i(false);
            }
            super.flush();
        }

        /* renamed from: h */
        public void mo34857h(Object obj) {
            boolean z;
            StringBuilder sb;
            C10929e eVar;
            C10897i iVar;
            if (isClosed()) {
                throw new IOException("Closed");
            } else if (!this.f21624b.mo34389B()) {
                C11165e eVar2 = null;
                if (obj instanceof C10894f) {
                    C10894f fVar = (C10894f) obj;
                    C10929e contentType = fVar.getContentType();
                    if (contentType != null && !C11010b.this.f21563m.mo34472i(C10910l.f21157i)) {
                        String t = C11010b.this.f21564n.mo34992t();
                        if (t == null) {
                            C11010b.this.f21563m.mo34468e(C10910l.f21157i, contentType);
                        } else {
                            if (contentType instanceof C10931f.C10932a) {
                                C10931f.C10932a d = ((C10931f.C10932a) contentType).mo34620d(t);
                                if (d != null) {
                                    C11010b.this.f21563m.mo34459B(C10910l.f21157i, d);
                                } else {
                                    iVar = C11010b.this.f21563m;
                                    eVar = C10910l.f21157i;
                                    sb = new StringBuilder();
                                }
                            } else {
                                iVar = C11010b.this.f21563m;
                                eVar = C10910l.f21157i;
                                sb = new StringBuilder();
                            }
                            sb.append(contentType);
                            sb.append(";charset=");
                            sb.append(C11132o.m28907b(t, ";= "));
                            iVar.mo34458A(eVar, sb.toString());
                        }
                    }
                    if (fVar.mo34444f() > 0) {
                        C11010b.this.f21563m.mo34463F(C10910l.f21154f, fVar.mo34444f());
                    }
                    C10929e e = fVar.mo34443e();
                    long d2 = fVar.mo34441c().mo35503d();
                    if (e != null) {
                        C11010b.this.f21563m.mo34459B(C10910l.f21159k, e);
                    } else if (!(fVar.mo34441c() == null || d2 == -1)) {
                        C11010b.this.f21563m.mo34461D(C10910l.f21159k, d2);
                    }
                    C11028f fVar2 = C11010b.this.f21555e;
                    if (!(fVar2 instanceof C11061a) || !((C11061a) fVar2).mo35102a()) {
                        z = false;
                    } else {
                        C11028f fVar3 = C11010b.this.f21555e;
                        z = true;
                    }
                    C10929e b = z ? fVar.mo34440b() : fVar.mo34439a();
                    obj = b == null ? fVar.mo34442d() : b;
                } else if (obj instanceof C11165e) {
                    eVar2 = (C11165e) obj;
                    C11010b.this.f21563m.mo34461D(C10910l.f21159k, eVar2.mo35503d());
                    obj = eVar2.mo35502c();
                }
                if (obj instanceof C10929e) {
                    this.f21624b.mo34432o((C10929e) obj, true);
                    C11010b.this.mo34837i(true);
                } else if (obj instanceof InputStream) {
                    InputStream inputStream = (InputStream) obj;
                    try {
                        int C = this.f21624b.mo34390C();
                        C10929e w = this.f21624b.mo34415w();
                        while (w.mo34595y0(inputStream, C) >= 0) {
                            this.f21624b.mo34412t();
                            C11010b.this.f21565o.flush();
                            C = this.f21624b.mo34390C();
                            w = this.f21624b.mo34415w();
                        }
                        this.f21624b.mo34412t();
                        C11010b.this.f21565o.flush();
                        if (eVar2 == null) {
                            inputStream.close();
                        }
                    } finally {
                        if (eVar2 != null) {
                            eVar2.mo35507i();
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

        /* renamed from: i */
        public void mo34858i(C10929e eVar) {
            ((C10906j) this.f21624b).mo34511J(eVar);
        }
    }

    /* renamed from: h.a.a.f.b$c */
    public class C11013c extends C11036m {
        C11013c(C11010b bVar) {
            super(bVar.f21565o);
        }
    }

    /* renamed from: h.a.a.f.b$d */
    private class C11014d extends C10912n.C10913a {
        private C11014d() {
        }

        /* synthetic */ C11014d(C11010b bVar, C11011a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo34201a(C10929e eVar) {
            C11010b.this.mo34839k(eVar);
        }

        /* renamed from: b */
        public void mo34202b() {
            C11010b.this.mo34840l();
        }

        /* renamed from: c */
        public void mo34203c() {
            C11010b.this.mo34825D();
        }

        /* renamed from: d */
        public void mo34204d(long j) {
            C11010b.this.mo34831J(j);
        }

        /* renamed from: e */
        public void mo34205e(C10929e eVar, C10929e eVar2) {
            C11010b.this.mo34834M(eVar, eVar2);
        }

        /* renamed from: f */
        public void mo34206f(C10929e eVar, C10929e eVar2, C10929e eVar3) {
            C11010b.this.mo34836P(eVar, eVar2, eVar3);
        }

        /* renamed from: g */
        public void mo34207g(C10929e eVar, int i, C10929e eVar2) {
            if (C11010b.f21551B.mo35485a()) {
                C11158c h = C11010b.f21551B;
                h.mo35489e("Bad request!: " + eVar + " " + i + " " + eVar2, new Object[0]);
            }
        }
    }

    public C11010b(C11028f fVar, C10942n nVar, C11040p pVar) {
        super(nVar);
        this.f21557g = "UTF-8".equals(C11139s.f22070a) ? new C10918r() : new C10890b(C11139s.f22070a);
        this.f21555e = fVar;
        C10892d dVar = (C10892d) fVar;
        this.f21558h = mo34833L(dVar.mo34261m0(), nVar, new C11014d(this, (C11011a) null));
        this.f21559i = new C10897i();
        this.f21563m = new C10897i();
        this.f21560j = new C11037n(this);
        this.f21564n = new C11039o(this);
        C10906j K = mo34832K(dVar.mo34245W(), nVar);
        this.f21562l = K;
        K.mo34408q(pVar.mo35005S0());
        this.f21556f = pVar;
    }

    /* renamed from: O */
    protected static void m28111O(C11010b bVar) {
        f21552G.set(bVar);
    }

    /* renamed from: o */
    public static C11010b m28113o() {
        return f21552G.get();
    }

    /* renamed from: A */
    public C10897i mo34822A() {
        return this.f21563m;
    }

    /* renamed from: B */
    public C11040p mo34823B() {
        return this.f21556f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017d, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0180, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0181, code lost:
        r2 = r5;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0185, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0186, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        f21551B.mo35487c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r15.f21560j.mo34969o0(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0197, code lost:
        if (r15.f21564n.mo33885g() == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0199, code lost:
        r15.f21562l.mo34405m(500, (java.lang.String) null, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a6, code lost:
        if (r15.f21560j.f21650a.mo34880y() == false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ac, code lost:
        if (r6.isRunning() != false) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b0, code lost:
        if (r15.f21556f != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b3, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        f21551B.mo35488d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d2, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e3, code lost:
        r6 = r15.f21556f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01e6, code lost:
        r6 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e7, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0238, code lost:
        if (r15.f21562l.mo34397e() == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02c5, code lost:
        if (r15.f21562l.mo34397e() == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        if (r15.f21556f != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        f21551B.mo35492h(java.lang.String.valueOf(r15.f21557g), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r15.f21560j.mo34969o0(true);
        r9 = r15.f21562l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        if (r11 != null) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        r7 = 500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        r9.mo34405m(r7, (java.lang.String) null, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0120, code lost:
        if (r15.f21560j.f21650a.mo34880y() == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0126, code lost:
        if (r6.isRunning() != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012a, code lost:
        if (r15.f21556f != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012d, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        f21551B.mo35487c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r15.f21560j.mo34969o0(true);
        r15.f21564n.mo33931c(r7.mo34456b(), r7.mo34455a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014d, code lost:
        if (r15.f21560j.f21650a.mo34880y() == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0153, code lost:
        if (r6.isRunning() != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        if (r15.f21556f != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        f21551B.mo35487c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r15.f21560j.mo34969o0(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016e, code lost:
        if (r15.f21560j.f21650a.mo34880y() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0174, code lost:
        if (r6.isRunning() != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0178, code lost:
        if (r15.f21556f != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0185 A[ExcHandler: o (r7v17 'e' h.a.a.d.o A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6 A[ExcHandler: c (r7v11 'e' h.a.a.b.c A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112 A[Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa, all -> 0x01d2, all -> 0x01b3, all -> 0x0180, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113 A[Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa, all -> 0x01d2, all -> 0x01b3, all -> 0x0180, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0122 A[Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa, all -> 0x01d2, all -> 0x01b3, all -> 0x0180, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012d A[ExcHandler: h (r7v39 'e' h.a.a.c.h A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015a A[ExcHandler: q (r7v31 'e' h.a.a.d.q A[CUSTOM_DECLARE]), Splitter:B:20:0x005a] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34824C() {
        /*
            r15 = this;
            java.lang.String r0 = "100 continues not sent"
            r1 = 404(0x194, float:5.66E-43)
            r2 = 0
            r3 = 0
            r4 = 1
            h.a.a.h.y.c r5 = f21551B     // Catch:{ all -> 0x0274 }
            boolean r5 = r5.mo35485a()     // Catch:{ all -> 0x0274 }
            if (r5 == 0) goto L_0x0035
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0274 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0274 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0270 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0270 }
            r7.<init>()     // Catch:{ all -> 0x0270 }
            r7.append(r5)     // Catch:{ all -> 0x0270 }
            java.lang.String r8 = " - "
            r7.append(r8)     // Catch:{ all -> 0x0270 }
            h.a.a.c.r r8 = r15.f21557g     // Catch:{ all -> 0x0270 }
            r7.append(r8)     // Catch:{ all -> 0x0270 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0270 }
            r6.setName(r7)     // Catch:{ all -> 0x0270 }
            goto L_0x0036
        L_0x0035:
            r5 = r2
        L_0x0036:
            h.a.a.f.p r6 = r15.f21556f     // Catch:{ all -> 0x0270 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x0270 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x0270 }
            boolean r7 = r7.mo34868n()     // Catch:{ all -> 0x0270 }
            if (r7 == 0) goto L_0x004c
            if (r6 == 0) goto L_0x004c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x0270 }
            if (r7 == 0) goto L_0x004c
            r7 = 1
            goto L_0x004d
        L_0x004c:
            r7 = 0
        L_0x004d:
            r8 = r2
            r9 = 0
        L_0x004f:
            if (r7 == 0) goto L_0x01ea
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01e6 }
            r7.mo34969o0(r3)     // Catch:{ all -> 0x01e6 }
            r7 = 400(0x190, float:5.6E-43)
            r10 = 500(0x1f4, float:7.0E-43)
            h.a.a.c.r r11 = r15.f21557g     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            r11.mo34427k()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            h.a.a.c.r r11 = r15.f21557g     // Catch:{ Exception -> 0x0066, c -> 0x01b6, all -> 0x00fc }
            java.lang.String r11 = r11.mo34422e()     // Catch:{ Exception -> 0x0066, c -> 0x01b6, all -> 0x00fc }
            goto L_0x007d
        L_0x0066:
            r11 = move-exception
            h.a.a.h.y.c r12 = f21551B     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            java.lang.String r13 = "Failed UTF-8 decode for request path, trying ISO-8859-1"
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            r12.mo35486b(r13, r14)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            h.a.a.h.y.c r12 = f21551B     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            r12.mo35488d(r11)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            h.a.a.c.r r11 = r15.f21557g     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            java.lang.String r12 = "ISO-8859-1"
            java.lang.String r11 = r11.mo34535f(r12)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
        L_0x007d:
            java.lang.String r11 = p164h.p211a.p212a.p228h.C11139s.m28936b(r11)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fc }
            if (r11 != 0) goto L_0x00aa
            h.a.a.f.n r12 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            java.lang.String r12 = r12.mo33923m()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            java.lang.String r13 = "CONNECT"
            boolean r12 = r12.equals(r13)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            if (r12 != 0) goto L_0x00aa
            h.a.a.c.r r12 = r15.f21557g     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            java.lang.String r12 = r12.mo34429n()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            if (r12 == 0) goto L_0x00a4
            h.a.a.c.r r12 = r15.f21557g     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            java.lang.String r12 = r12.mo34424h()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            if (r12 == 0) goto L_0x00a4
            java.lang.String r11 = "/"
            goto L_0x00aa
        L_0x00a4:
            h.a.a.c.h r12 = new h.a.a.c.h     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.<init>(r7)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            throw r12     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
        L_0x00aa:
            h.a.a.f.n r12 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.mo34972r0(r11)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            h.a.a.f.b$b r12 = r15.f21565o     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            if (r12 == 0) goto L_0x00b8
            h.a.a.f.b$b r12 = r15.f21565o     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.mo34909b()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
        L_0x00b8:
            h.a.a.f.n r12 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            h.a.a.f.c r12 = r12.f21650a     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            boolean r12 = r12.mo34871q()     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            if (r12 == 0) goto L_0x00d6
            h.a.a.f.n r12 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            d.b.d r13 = p154d.p155b.C4316d.REQUEST     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.mo34968n0(r13)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            h.a.a.f.f r12 = r15.f21555e     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            h.a.a.d.n r13 = r15.f21308b     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            h.a.a.f.n r14 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.mo34783H(r13, r14)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r6.mo35009W0(r15)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            goto L_0x00e0
        L_0x00d6:
            h.a.a.f.n r12 = r15.f21560j     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            d.b.d r13 = p154d.p155b.C4316d.ASYNC     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r12.mo34968n0(r13)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
            r6.mo35010X0(r15)     // Catch:{ c -> 0x01b6, o -> 0x0185, q -> 0x015a, h -> 0x012d, all -> 0x00fa }
        L_0x00e0:
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01e6 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x01e6 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x01e6 }
            if (r7 != 0) goto L_0x00f7
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x01e6 }
            if (r7 == 0) goto L_0x00f7
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x01e6 }
            if (r7 == 0) goto L_0x00f7
        L_0x00f4:
            r7 = 1
            goto L_0x004f
        L_0x00f7:
            r7 = 0
            goto L_0x004f
        L_0x00fa:
            r8 = move-exception
            goto L_0x00fe
        L_0x00fc:
            r8 = move-exception
            r11 = r2
        L_0x00fe:
            h.a.a.h.y.c r12 = f21551B     // Catch:{ all -> 0x01d2 }
            h.a.a.c.r r13 = r15.f21557g     // Catch:{ all -> 0x01d2 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01d2 }
            r12.mo35492h(r13, r8)     // Catch:{ all -> 0x01d2 }
            h.a.a.f.n r9 = r15.f21560j     // Catch:{ all -> 0x01b3 }
            r9.mo34969o0(r4)     // Catch:{ all -> 0x01b3 }
            h.a.a.c.c r9 = r15.f21562l     // Catch:{ all -> 0x01b3 }
            if (r11 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r7 = 500(0x1f4, float:7.0E-43)
        L_0x0115:
            r9.mo34405m(r7, r2, r2, r4)     // Catch:{ all -> 0x01b3 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x0180 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x0180 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x017c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            goto L_0x017a
        L_0x012d:
            r7 = move-exception
            h.a.a.h.y.c r10 = f21551B     // Catch:{ all -> 0x01d2 }
            r10.mo35487c(r7)     // Catch:{ all -> 0x01d2 }
            h.a.a.f.n r9 = r15.f21560j     // Catch:{ all -> 0x01b3 }
            r9.mo34969o0(r4)     // Catch:{ all -> 0x01b3 }
            h.a.a.f.o r9 = r15.f21564n     // Catch:{ all -> 0x01b3 }
            int r10 = r7.mo34456b()     // Catch:{ all -> 0x01b3 }
            java.lang.String r7 = r7.mo34455a()     // Catch:{ all -> 0x01b3 }
            r9.mo33931c(r10, r7)     // Catch:{ all -> 0x01b3 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x0180 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x0180 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x017c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            goto L_0x017a
        L_0x015a:
            r7 = move-exception
            r8 = r7
            h.a.a.h.y.c r7 = f21551B     // Catch:{ all -> 0x01d2 }
            r7.mo35487c(r8)     // Catch:{ all -> 0x01d2 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01b3 }
            r7.mo34969o0(r4)     // Catch:{ all -> 0x01b3 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x0180 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x0180 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x017c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
        L_0x017a:
            r7 = 1
            goto L_0x017d
        L_0x017c:
            r7 = 0
        L_0x017d:
            r9 = 1
            goto L_0x004f
        L_0x0180:
            r6 = move-exception
            r2 = r5
            r9 = 1
            goto L_0x0277
        L_0x0185:
            r7 = move-exception
            r8 = r7
            h.a.a.h.y.c r7 = f21551B     // Catch:{ all -> 0x01d2 }
            r7.mo35487c(r8)     // Catch:{ all -> 0x01d2 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01b3 }
            r7.mo34969o0(r4)     // Catch:{ all -> 0x01b3 }
            h.a.a.f.o r7 = r15.f21564n     // Catch:{ all -> 0x01b3 }
            boolean r7 = r7.mo33885g()     // Catch:{ all -> 0x01b3 }
            if (r7 != 0) goto L_0x019e
            h.a.a.c.c r7 = r15.f21562l     // Catch:{ all -> 0x01b3 }
            r7.mo34405m(r10, r2, r2, r4)     // Catch:{ all -> 0x01b3 }
        L_0x019e:
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x0180 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x0180 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x0180 }
            if (r7 != 0) goto L_0x017c
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x0180 }
            if (r7 == 0) goto L_0x017c
            goto L_0x017a
        L_0x01b3:
            r2 = move-exception
            r9 = 1
            goto L_0x01d3
        L_0x01b6:
            r7 = move-exception
            h.a.a.h.y.c r10 = f21551B     // Catch:{ all -> 0x01d2 }
            r10.mo35488d(r7)     // Catch:{ all -> 0x01d2 }
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01e6 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x01e6 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x01e6 }
            if (r7 != 0) goto L_0x00f7
            boolean r7 = r6.isRunning()     // Catch:{ all -> 0x01e6 }
            if (r7 == 0) goto L_0x00f7
            h.a.a.f.p r7 = r15.f21556f     // Catch:{ all -> 0x01e6 }
            if (r7 == 0) goto L_0x00f7
            goto L_0x00f4
        L_0x01d2:
            r2 = move-exception
        L_0x01d3:
            h.a.a.f.n r7 = r15.f21560j     // Catch:{ all -> 0x01e6 }
            h.a.a.f.c r7 = r7.f21650a     // Catch:{ all -> 0x01e6 }
            boolean r7 = r7.mo34880y()     // Catch:{ all -> 0x01e6 }
            if (r7 != 0) goto L_0x01e5
            boolean r6 = r6.isRunning()     // Catch:{ all -> 0x01e6 }
            if (r6 == 0) goto L_0x01e5
            h.a.a.f.p r6 = r15.f21556f     // Catch:{ all -> 0x01e6 }
        L_0x01e5:
            throw r2     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            r6 = move-exception
            r2 = r5
            goto L_0x0277
        L_0x01ea:
            if (r5 == 0) goto L_0x01f3
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r5)
        L_0x01f3:
            h.a.a.f.n r2 = r15.f21560j
            h.a.a.f.c r2 = r2.f21650a
            boolean r2 = r2.mo34873s()
            if (r2 == 0) goto L_0x026f
            h.a.a.f.n r2 = r15.f21560j
            h.a.a.f.c r2 = r2.f21650a
            r2.mo34862g(r8)
            boolean r2 = r15.f21572v
            if (r2 == 0) goto L_0x021e
            h.a.a.h.y.c r2 = f21551B
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r2.mo35489e(r0, r5)
            r15.f21572v = r3
            h.a.a.f.o r0 = r15.f21564n
            boolean r0 = r0.mo33885g()
            if (r0 != 0) goto L_0x021e
            h.a.a.c.c r0 = r15.f21562l
            r0.mo34394c(r3)
        L_0x021e:
            h.a.a.d.n r0 = r15.f21308b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x0265
            if (r9 == 0) goto L_0x023b
            h.a.a.d.n r0 = r15.f21308b
            r0.mo34370t()
            h.a.a.c.c r0 = r15.f21562l
            r0.mo34394c(r3)
            h.a.a.c.c r0 = r15.f21562l
            boolean r0 = r0.mo34397e()
            if (r0 != 0) goto L_0x026a
            goto L_0x0265
        L_0x023b:
            h.a.a.f.o r0 = r15.f21564n
            boolean r0 = r0.mo33885g()
            if (r0 != 0) goto L_0x0250
            h.a.a.f.n r0 = r15.f21560j
            boolean r0 = r0.mo34954Z()
            if (r0 != 0) goto L_0x0250
            h.a.a.f.o r0 = r15.f21564n
            r0.mo33933e(r1)
        L_0x0250:
            h.a.a.f.o r0 = r15.f21564n
            r0.mo34988p()
            h.a.a.c.c r0 = r15.f21562l
            boolean r0 = r0.mo34398f()
            if (r0 == 0) goto L_0x026a
            h.a.a.f.f r0 = r15.f21555e
            h.a.a.d.n r1 = r15.f21308b
            r0.mo34800X(r1)
            goto L_0x026a
        L_0x0265:
            h.a.a.f.o r0 = r15.f21564n
            r0.mo34988p()
        L_0x026a:
            h.a.a.f.n r0 = r15.f21560j
            r0.mo34969o0(r4)
        L_0x026f:
            return
        L_0x0270:
            r6 = move-exception
            r8 = r2
            r2 = r5
            goto L_0x0276
        L_0x0274:
            r6 = move-exception
            r8 = r2
        L_0x0276:
            r9 = 0
        L_0x0277:
            if (r2 == 0) goto L_0x0280
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.setName(r2)
        L_0x0280:
            h.a.a.f.n r2 = r15.f21560j
            h.a.a.f.c r2 = r2.f21650a
            boolean r2 = r2.mo34873s()
            if (r2 == 0) goto L_0x02fc
            h.a.a.f.n r2 = r15.f21560j
            h.a.a.f.c r2 = r2.f21650a
            r2.mo34862g(r8)
            boolean r2 = r15.f21572v
            if (r2 == 0) goto L_0x02ab
            h.a.a.h.y.c r2 = f21551B
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r2.mo35489e(r0, r5)
            r15.f21572v = r3
            h.a.a.f.o r0 = r15.f21564n
            boolean r0 = r0.mo33885g()
            if (r0 != 0) goto L_0x02ab
            h.a.a.c.c r0 = r15.f21562l
            r0.mo34394c(r3)
        L_0x02ab:
            h.a.a.d.n r0 = r15.f21308b
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x02f2
            if (r9 == 0) goto L_0x02c8
            h.a.a.d.n r0 = r15.f21308b
            r0.mo34370t()
            h.a.a.c.c r0 = r15.f21562l
            r0.mo34394c(r3)
            h.a.a.c.c r0 = r15.f21562l
            boolean r0 = r0.mo34397e()
            if (r0 != 0) goto L_0x02f7
            goto L_0x02f2
        L_0x02c8:
            h.a.a.f.o r0 = r15.f21564n
            boolean r0 = r0.mo33885g()
            if (r0 != 0) goto L_0x02dd
            h.a.a.f.n r0 = r15.f21560j
            boolean r0 = r0.mo34954Z()
            if (r0 != 0) goto L_0x02dd
            h.a.a.f.o r0 = r15.f21564n
            r0.mo33933e(r1)
        L_0x02dd:
            h.a.a.f.o r0 = r15.f21564n
            r0.mo34988p()
            h.a.a.c.c r0 = r15.f21562l
            boolean r0 = r0.mo34398f()
            if (r0 == 0) goto L_0x02f7
            h.a.a.f.f r0 = r15.f21555e
            h.a.a.d.n r1 = r15.f21308b
            r0.mo34800X(r1)
            goto L_0x02f7
        L_0x02f2:
            h.a.a.f.o r0 = r15.f21564n
            r0.mo34988p()
        L_0x02f7:
            h.a.a.f.n r0 = r15.f21560j
            r0.mo34969o0(r4)
        L_0x02fc:
            goto L_0x02fe
        L_0x02fd:
            throw r6
        L_0x02fe:
            goto L_0x02fd
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11010b.mo34824C():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo34825D() {
        C10891c cVar;
        int i;
        this.f21554d++;
        this.f21562l.mo34400h(this.f21569s);
        int i2 = this.f21569s;
        if (i2 == 10) {
            this.f21562l.mo34406n(this.f21574x);
            if (this.f21558h.mo34518f()) {
                this.f21563m.mo34468e(C10910l.f21155g, C10909k.f21151f);
                this.f21562l.mo34394c(true);
            } else if ("CONNECT".equals(this.f21560j.mo33923m())) {
                this.f21562l.mo34394c(true);
                this.f21558h.mo34515c(true);
            }
            if (this.f21556f.mo35004R0()) {
                this.f21562l.mo34407p(this.f21560j.mo34951W());
            }
        } else if (i2 == 11) {
            this.f21562l.mo34406n(this.f21574x);
            if (!this.f21558h.mo34518f()) {
                this.f21563m.mo34468e(C10910l.f21155g, C10909k.f21150e);
                this.f21562l.mo34394c(false);
            }
            if (this.f21556f.mo35004R0()) {
                this.f21562l.mo34407p(this.f21560j.mo34951W());
            }
            if (!this.f21575y) {
                f21551B.mo35489e("!host {}", this);
                cVar = this.f21562l;
                i = 400;
            } else if (this.f21571u) {
                f21551B.mo35489e("!expectation {}", this);
                cVar = this.f21562l;
                i = 417;
            }
            cVar.mo34403k(i, (String) null);
            this.f21563m.mo34459B(C10910l.f21155g, C10909k.f21150e);
            this.f21562l.mo34404l(this.f21563m, true);
            this.f21562l.complete();
            return;
        }
        String str = this.f21570t;
        if (str != null) {
            this.f21560j.mo34964j0(str);
        }
        if ((((C10912n) this.f21558h).mo34522j() > 0 || ((C10912n) this.f21558h).mo34525m()) && !this.f21572v) {
            this.f21576z = true;
        } else {
            mo34824C();
        }
    }

    /* renamed from: E */
    public boolean mo34826E(C11037n nVar) {
        C11028f fVar = this.f21555e;
        return fVar != null && fVar.mo34782B(nVar);
    }

    /* renamed from: F */
    public boolean mo34827F() {
        return this.f21553A;
    }

    /* renamed from: G */
    public boolean mo34828G() {
        return this.f21573w;
    }

    /* renamed from: H */
    public boolean mo34829H() {
        return this.f21568r > 0;
    }

    /* renamed from: I */
    public boolean mo34830I() {
        return this.f21562l.mo34399g();
    }

    /* renamed from: J */
    public void mo34831J(long j) {
        if (this.f21576z) {
            this.f21576z = false;
            mo34824C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C10906j mo34832K(C10935i iVar, C10942n nVar) {
        return new C10906j(iVar, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C10912n mo34833L(C10935i iVar, C10942n nVar, C10912n.C10913a aVar) {
        return new C10912n(iVar, nVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 != 40) goto L_0x008e;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34834M(p164h.p211a.p212a.p217d.C10929e r8, p164h.p211a.p212a.p217d.C10929e r9) {
        /*
            r7 = this;
            h.a.a.c.l r0 = p164h.p211a.p212a.p216c.C10910l.f21152d
            int r0 = r0.mo34616f(r8)
            r1 = 16
            if (r0 == r1) goto L_0x0082
            r1 = 21
            if (r0 == r1) goto L_0x007b
            r1 = 24
            r2 = 1
            if (r0 == r1) goto L_0x0021
            r1 = 27
            if (r0 == r1) goto L_0x001d
            r1 = 40
            if (r0 == r1) goto L_0x007b
            goto L_0x008e
        L_0x001d:
            r7.f21575y = r2
            goto L_0x008e
        L_0x0021:
            h.a.a.c.k r0 = p164h.p211a.p212a.p216c.C10909k.f21149d
            h.a.a.d.e r9 = r0.mo34618h(r9)
            h.a.a.c.k r0 = p164h.p211a.p212a.p216c.C10909k.f21149d
            int r0 = r0.mo34616f(r9)
            r1 = 6
            if (r0 == r1) goto L_0x0074
            r3 = 7
            if (r0 == r3) goto L_0x006d
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = ","
            java.lang.String[] r0 = r0.split(r4)
            r4 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x008e
            int r5 = r0.length
            if (r4 >= r5) goto L_0x008e
            h.a.a.c.k r5 = p164h.p211a.p212a.p216c.C10909k.f21149d
            r6 = r0[r4]
            java.lang.String r6 = r6.trim()
            h.a.a.d.f$a r5 = r5.mo34612b(r6)
            if (r5 != 0) goto L_0x0054
        L_0x0051:
            r7.f21571u = r2
            goto L_0x006a
        L_0x0054:
            int r5 = r5.mo34621e()
            if (r5 == r1) goto L_0x0064
            if (r5 == r3) goto L_0x005d
            goto L_0x0051
        L_0x005d:
            h.a.a.c.c r5 = r7.f21562l
            boolean r5 = r5 instanceof p164h.p211a.p212a.p216c.C10906j
            r7.f21573w = r5
            goto L_0x006a
        L_0x0064:
            h.a.a.c.c r5 = r7.f21562l
            boolean r5 = r5 instanceof p164h.p211a.p212a.p216c.C10906j
            r7.f21572v = r5
        L_0x006a:
            int r4 = r4 + 1
            goto L_0x003e
        L_0x006d:
            h.a.a.c.c r0 = r7.f21562l
            boolean r0 = r0 instanceof p164h.p211a.p212a.p216c.C10906j
            r7.f21573w = r0
            goto L_0x008e
        L_0x0074:
            h.a.a.c.c r0 = r7.f21562l
            boolean r0 = r0 instanceof p164h.p211a.p212a.p216c.C10906j
            r7.f21572v = r0
            goto L_0x008e
        L_0x007b:
            h.a.a.c.k r0 = p164h.p211a.p212a.p216c.C10909k.f21149d
            h.a.a.d.e r9 = r0.mo34618h(r9)
            goto L_0x008e
        L_0x0082:
            h.a.a.d.f r0 = p164h.p211a.p212a.p216c.C10920t.f21262c
            h.a.a.d.e r9 = r0.mo34618h(r9)
            java.lang.String r0 = p164h.p211a.p212a.p216c.C10920t.m27558a(r9)
            r7.f21570t = r0
        L_0x008e:
            h.a.a.c.i r0 = r7.f21559i
            r0.mo34468e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11010b.mo34834M(h.a.a.d.e, h.a.a.d.e):void");
    }

    /* renamed from: N */
    public void mo34835N() {
        this.f21558h.reset();
        this.f21558h.mo34516d();
        this.f21559i.mo34471h();
        this.f21560j.mo34958d0();
        this.f21562l.reset();
        this.f21562l.mo34396d();
        this.f21563m.mo34471h();
        this.f21564n.mo34996w();
        this.f21557g.mo34534a();
        this.f21566p = null;
        this.f21553A = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo34836P(C10929e eVar, C10929e eVar2, C10929e eVar3) {
        C10929e Y0 = eVar2.mo34566Y0();
        this.f21575y = false;
        this.f21571u = false;
        this.f21572v = false;
        this.f21573w = false;
        this.f21576z = false;
        this.f21570t = null;
        if (this.f21560j.mo34950V() == 0) {
            this.f21560j.mo34932G0(System.currentTimeMillis());
        }
        this.f21560j.mo34970p0(eVar.toString());
        try {
            this.f21574x = false;
            int f = C10911m.f21163a.mo34616f(eVar);
            if (f == 3) {
                this.f21574x = true;
                this.f21557g.mo34538q(Y0.mo34608e0(), Y0.getIndex(), Y0.length());
            } else if (f != 8) {
                this.f21557g.mo34538q(Y0.mo34608e0(), Y0.getIndex(), Y0.length());
            } else {
                this.f21557g.mo34539s(Y0.mo34608e0(), Y0.getIndex(), Y0.length());
            }
            this.f21560j.mo34934H0(this.f21557g);
            if (eVar3 == null) {
                this.f21560j.mo34973s0("");
                this.f21569s = 9;
                return;
            }
            C10931f.C10932a c = C10919s.f21257a.mo34613c(eVar3);
            if (c != null) {
                int f2 = C10919s.f21257a.mo34616f(c);
                this.f21569s = f2;
                if (f2 <= 0) {
                    this.f21569s = 10;
                }
                this.f21560j.mo34973s0(c.toString());
                return;
            }
            throw new C10896h(400, (String) null);
        } catch (Exception e) {
            f21551B.mo35487c(e);
            if (e instanceof C10896h) {
                throw ((C10896h) e);
            }
            throw new C10896h(400, (String) null, e);
        }
    }

    /* renamed from: a */
    public boolean mo34185a() {
        return this.f21562l.mo34392a() && (this.f21558h.mo34513a() || this.f21576z);
    }

    /* renamed from: d */
    public boolean mo34186d() {
        return this.f21560j.mo34982y().mo34872r();
    }

    /* renamed from: i */
    public void mo34837i(boolean z) {
        if (!this.f21562l.mo34399g()) {
            this.f21562l.mo34403k(this.f21564n.mo34994u(), this.f21564n.mo34991s());
            try {
                if (this.f21572v && this.f21564n.mo34994u() != 100) {
                    this.f21562l.mo34394c(false);
                }
                this.f21562l.mo34404l(this.f21563m, z);
            } catch (RuntimeException e) {
                C11158c cVar = f21551B;
                cVar.mo35486b("header full: " + e, new Object[0]);
                this.f21564n.mo34997x();
                this.f21562l.reset();
                this.f21562l.mo34403k(500, (String) null);
                this.f21562l.mo34404l(this.f21563m, true);
                this.f21562l.complete();
                throw new C10896h(500);
            }
        }
        if (z) {
            this.f21562l.complete();
        }
    }

    /* renamed from: j */
    public void mo34838j() {
        if (!this.f21562l.mo34399g()) {
            this.f21562l.mo34403k(this.f21564n.mo34994u(), this.f21564n.mo34991s());
            try {
                this.f21562l.mo34404l(this.f21563m, true);
            } catch (RuntimeException e) {
                C11158c cVar = f21551B;
                cVar.mo35486b("header full: " + e, new Object[0]);
                f21551B.mo35487c(e);
                this.f21564n.mo34997x();
                this.f21562l.reset();
                this.f21562l.mo34403k(500, (String) null);
                this.f21562l.mo34404l(this.f21563m, true);
                this.f21562l.complete();
                throw new C10896h(500);
            }
        }
        this.f21562l.complete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo34839k(C10929e eVar) {
        if (this.f21576z) {
            this.f21576z = false;
            mo34824C();
        }
    }

    /* renamed from: l */
    public void mo34840l() {
        this.f21553A = true;
    }

    /* renamed from: m */
    public void mo34841m() {
        try {
            mo34837i(false);
            this.f21562l.mo34402j();
        } catch (IOException e) {
            e = e;
            if (!(e instanceof C10943o)) {
                e = new C10943o((Throwable) e);
            }
            throw e;
        }
    }

    /* renamed from: n */
    public C11028f mo34842n() {
        return this.f21555e;
    }

    public void onClose() {
        f21551B.mo35489e("closed {}", this);
    }

    /* renamed from: p */
    public C10891c mo34843p() {
        return this.f21562l;
    }

    /* renamed from: q */
    public C10731q mo34844q() {
        if (this.f21572v) {
            if (((C10912n) this.f21558h).mo34523k() == null || ((C10912n) this.f21558h).mo34523k().length() < 2) {
                if (!this.f21562l.mo34399g()) {
                    ((C10906j) this.f21562l).mo34510I(100);
                } else {
                    throw new IllegalStateException("Committed before 100 Continues");
                }
            }
            this.f21572v = false;
        }
        if (this.f21561k == null) {
            this.f21561k = new C11034k(this);
        }
        return this.f21561k;
    }

    /* renamed from: r */
    public int mo34845r() {
        return (!this.f21555e.mo34786M() || this.f21308b.mo34356g() != this.f21555e.mo34811g()) ? this.f21308b.mo34356g() > 0 ? this.f21308b.mo34356g() : this.f21555e.mo34811g() : this.f21555e.mo34817q();
    }

    /* renamed from: s */
    public C10732r mo34846s() {
        if (this.f21565o == null) {
            this.f21565o = new C11012b();
        }
        return this.f21565o;
    }

    /* renamed from: t */
    public C10921u mo34847t() {
        return this.f21558h;
    }

    public String toString() {
        return String.format("%s,g=%s,p=%s,r=%d", new Object[]{super.toString(), this.f21562l, this.f21558h, Integer.valueOf(this.f21554d)});
    }

    /* renamed from: u */
    public PrintWriter mo34848u(String str) {
        mo34846s();
        if (this.f21566p == null) {
            this.f21566p = new C11013c(this);
            this.f21567q = this.f21556f.mo35013a1() ? new C10949s(this.f21566p) : new C11011a(this, this.f21566p);
        }
        this.f21566p.mo34914b(str);
        return this.f21567q;
    }

    /* renamed from: v */
    public C11037n mo34849v() {
        return this.f21560j;
    }

    /* renamed from: w */
    public C10897i mo34850w() {
        return this.f21559i;
    }

    /* renamed from: x */
    public int mo34851x() {
        return this.f21554d;
    }

    /* renamed from: y */
    public boolean mo34852y() {
        return this.f21555e.mo34818r();
    }

    /* renamed from: z */
    public C11039o mo34853z() {
        return this.f21564n;
    }
}
