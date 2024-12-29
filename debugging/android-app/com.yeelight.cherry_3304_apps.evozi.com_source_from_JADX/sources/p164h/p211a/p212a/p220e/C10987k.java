package p164h.p211a.p212a.p220e;

import java.io.PrintStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p154d.p155b.p204f0.C10718l;
import p154d.p155b.p204f0.C10719m;
import p164h.p211a.p212a.p220e.C10975a;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11039o;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p222f.p224w.C11059g;
import p164h.p211a.p212a.p228h.p233x.C11153e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.e.k */
public abstract class C10987k extends C11059g implements C10975a.C10976a {

    /* renamed from: u */
    private static final C11158c f21460u = C11156b.m29015a(C10987k.class);

    /* renamed from: k */
    private boolean f21461k = false;

    /* renamed from: l */
    private C10975a f21462l;

    /* renamed from: m */
    private C10975a.C10977b f21463m = new C10980d();

    /* renamed from: n */
    private String f21464n;

    /* renamed from: o */
    private String f21465o;

    /* renamed from: p */
    private final Map<String, String> f21466p = new HashMap();

    /* renamed from: q */
    private C10983g f21467q;

    /* renamed from: r */
    private boolean f21468r;

    /* renamed from: s */
    private C10982f f21469s;

    /* renamed from: t */
    private boolean f21470t = true;

    /* renamed from: h.a.a.e.k$a */
    class C10988a implements C10719m {
        C10988a(C10987k kVar) {
        }

        /* renamed from: j */
        public void mo33952j(C10718l lVar) {
            C11037n v;
            C11010b o = C11010b.m28113o();
            if (o != null && (v = o.mo34849v()) != null && v.mo33966c()) {
                lVar.mo33949a().mo33939b("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
            }
        }

        /* renamed from: p */
        public void mo33953p(C10718l lVar) {
        }
    }

    /* renamed from: h.a.a.e.k$b */
    static /* synthetic */ class C10989b {

        /* renamed from: a */
        static final /* synthetic */ int[] f21471a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                d.b.d[] r0 = p154d.p155b.C4316d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21471a = r0
                d.b.d r1 = p154d.p155b.C4316d.REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21471a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.b.d r1 = p154d.p155b.C4316d.ASYNC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21471a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.b.d r1 = p154d.p155b.C4316d.FORWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.C10987k.C10989b.<clinit>():void");
        }
    }

    protected C10987k() {
    }

    /* renamed from: U0 */
    public static C10987k m27980U0() {
        C11052c.C11054b g1 = C11052c.m28456g1();
        if (g1 == null) {
            return null;
        }
        return (C10987k) g1.mo35080c().mo35051L0(C10987k.class);
    }

    /* renamed from: A */
    public C10983g mo34716A() {
        return this.f21467q;
    }

    /* renamed from: I */
    public String mo34717I(String str) {
        return this.f21466p.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0137, code lost:
        if (r10 != null) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x00f2=Splitter:B:61:0x00f2, B:87:0x0134=Splitter:B:87:0x0134} */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34757L(java.lang.String r20, p164h.p211a.p212a.p222f.C11037n r21, p154d.p155b.p204f0.C10709c r22, p154d.p155b.p204f0.C10711e r23) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            r8 = r21
            r1 = r22
            r2 = r23
            h.a.a.f.o r4 = r21.mo34942N()
            h.a.a.f.i r9 = r19.mo35097M0()
            if (r9 != 0) goto L_0x0015
            return
        L_0x0015:
            h.a.a.e.a r10 = r7.f21462l
            boolean r3 = r7.mo34758O0(r8)
            if (r3 == 0) goto L_0x0167
            java.lang.Object r5 = r19.mo34729Y0(r20, r21)
            boolean r3 = r7.mo34726P0(r0, r8, r4, r5)
            r11 = 403(0x193, float:5.65E-43)
            r12 = 1
            if (r3 != 0) goto L_0x0037
            boolean r0 = r21.mo34954Z()
            if (r0 != 0) goto L_0x0036
            r2.mo33933e(r11)
            r8.mo34969o0(r12)
        L_0x0036:
            return
        L_0x0037:
            boolean r13 = r7.mo34728W0(r8, r4, r5)
            if (r13 == 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            h.a.a.h.y.c r0 = f21460u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No authenticator for: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.mo35486b(r1, r3)
            boolean r0 = r21.mo34954Z()
            if (r0 != 0) goto L_0x0064
            r2.mo33933e(r11)
            r8.mo34969o0(r12)
        L_0x0064:
            return
        L_0x0065:
            r3 = 0
            h.a.a.f.d r6 = r21.mo34921B()     // Catch:{ l -> 0x014c }
            if (r6 == 0) goto L_0x0070
            h.a.a.f.d r14 = p164h.p211a.p212a.p222f.C11018d.f21600D     // Catch:{ l -> 0x014c }
            if (r6 != r14) goto L_0x0079
        L_0x0070:
            if (r10 != 0) goto L_0x0075
            h.a.a.f.d r6 = p164h.p211a.p212a.p222f.C11018d.f21599C     // Catch:{ l -> 0x014c }
            goto L_0x0079
        L_0x0075:
            h.a.a.f.d r6 = r10.mo34712a(r1, r2, r13)     // Catch:{ l -> 0x014c }
        L_0x0079:
            boolean r14 = r6 instanceof p164h.p211a.p212a.p222f.C11018d.C11026h     // Catch:{ l -> 0x014c }
            if (r14 == 0) goto L_0x008b
            r1 = r6
            h.a.a.f.d$h r1 = (p164h.p211a.p212a.p222f.C11018d.C11026h) r1     // Catch:{ l -> 0x014c }
            d.b.f0.c r1 = r1.mo34888C()     // Catch:{ l -> 0x014c }
            r14 = r6
            h.a.a.f.d$h r14 = (p164h.p211a.p212a.p222f.C11018d.C11026h) r14     // Catch:{ l -> 0x014c }
            d.b.f0.e r2 = r14.mo34889g()     // Catch:{ l -> 0x014c }
        L_0x008b:
            r14 = r1
            r15 = r2
            boolean r1 = r6 instanceof p164h.p211a.p212a.p222f.C11018d.C11024f     // Catch:{ l -> 0x0148 }
            if (r1 == 0) goto L_0x0096
            r8.mo34969o0(r12)     // Catch:{ l -> 0x0148 }
            goto L_0x013d
        L_0x0096:
            boolean r1 = r6 instanceof p164h.p211a.p212a.p222f.C11018d.C11025g     // Catch:{ l -> 0x0148 }
            if (r1 == 0) goto L_0x00fd
            r2 = r6
            h.a.a.f.d$g r2 = (p164h.p211a.p212a.p222f.C11018d.C11025g) r2     // Catch:{ l -> 0x0148 }
            r8.mo34963i0(r6)     // Catch:{ l -> 0x0148 }
            h.a.a.e.f r1 = r7.f21469s     // Catch:{ l -> 0x0148 }
            if (r1 == 0) goto L_0x00b0
            h.a.a.e.f r1 = r7.f21469s     // Catch:{ l -> 0x0148 }
            h.a.a.f.u r6 = r2.mo34765a()     // Catch:{ l -> 0x0148 }
            java.lang.Object r1 = r1.mo34736d(r6)     // Catch:{ l -> 0x0148 }
            r6 = r1
            goto L_0x00b1
        L_0x00b0:
            r6 = r3
        L_0x00b1:
            if (r13 == 0) goto L_0x00ef
            h.a.a.f.u r16 = r2.mo34765a()     // Catch:{ l -> 0x00ec, all -> 0x00e9 }
            r1 = r19
            r3 = r2
            r2 = r20
            r17 = r3
            r3 = r21
            r18 = r6
            r6 = r16
            boolean r1 = r1.mo34727Q0(r2, r3, r4, r5, r6)     // Catch:{ l -> 0x00e4, all -> 0x00df }
            if (r1 != 0) goto L_0x00dc
            java.lang.String r0 = "!role"
            r15.mo33931c(r11, r0)     // Catch:{ l -> 0x00e4, all -> 0x00df }
            r8.mo34969o0(r12)     // Catch:{ l -> 0x00e4, all -> 0x00df }
            h.a.a.e.f r0 = r7.f21469s
            if (r0 == 0) goto L_0x00db
            r1 = r18
            r0.mo34735c(r1)
        L_0x00db:
            return
        L_0x00dc:
            r1 = r18
            goto L_0x00f2
        L_0x00df:
            r0 = move-exception
            r1 = r18
            goto L_0x0143
        L_0x00e4:
            r0 = move-exception
            r1 = r18
            goto L_0x0146
        L_0x00e9:
            r0 = move-exception
            r1 = r6
            goto L_0x0143
        L_0x00ec:
            r0 = move-exception
            r1 = r6
            goto L_0x0146
        L_0x00ef:
            r17 = r2
            r1 = r6
        L_0x00f2:
            r9.mo34757L(r0, r8, r14, r15)     // Catch:{ l -> 0x0145, all -> 0x0142 }
            if (r10 == 0) goto L_0x013c
            r6 = r17
            r10.mo34715d(r14, r15, r13, r6)     // Catch:{ l -> 0x0145, all -> 0x0142 }
            goto L_0x013c
        L_0x00fd:
            boolean r1 = r6 instanceof p164h.p211a.p212a.p222f.C11018d.C11023e     // Catch:{ l -> 0x0148 }
            if (r1 == 0) goto L_0x0125
            r1 = r6
            h.a.a.e.o.c r1 = (p164h.p211a.p212a.p220e.p221o.C10995c) r1     // Catch:{ l -> 0x0148 }
            r8.mo34963i0(r6)     // Catch:{ l -> 0x0148 }
            r9.mo34757L(r0, r8, r14, r15)     // Catch:{ all -> 0x011e }
            java.lang.Object r1 = r1.mo34772d()     // Catch:{ l -> 0x0148 }
            if (r10 == 0) goto L_0x013c
            h.a.a.f.d r0 = r21.mo34921B()     // Catch:{ l -> 0x0145, all -> 0x0142 }
            boolean r2 = r0 instanceof p164h.p211a.p212a.p222f.C11018d.C11025g     // Catch:{ l -> 0x0145, all -> 0x0142 }
            if (r2 == 0) goto L_0x0139
            h.a.a.f.d$g r0 = (p164h.p211a.p212a.p222f.C11018d.C11025g) r0     // Catch:{ l -> 0x0145, all -> 0x0142 }
            r10.mo34715d(r14, r15, r13, r0)     // Catch:{ l -> 0x0145, all -> 0x0142 }
            goto L_0x013c
        L_0x011e:
            r0 = move-exception
            r2 = r0
            java.lang.Object r3 = r1.mo34772d()     // Catch:{ l -> 0x0148 }
            throw r2     // Catch:{ l -> 0x0148 }
        L_0x0125:
            r8.mo34963i0(r6)     // Catch:{ l -> 0x0148 }
            h.a.a.e.f r1 = r7.f21469s     // Catch:{ l -> 0x0148 }
            if (r1 == 0) goto L_0x0133
            h.a.a.e.f r1 = r7.f21469s     // Catch:{ l -> 0x0148 }
            java.lang.Object r1 = r1.mo34736d(r3)     // Catch:{ l -> 0x0148 }
            goto L_0x0134
        L_0x0133:
            r1 = r3
        L_0x0134:
            r9.mo34757L(r0, r8, r14, r15)     // Catch:{ l -> 0x0145, all -> 0x0142 }
            if (r10 == 0) goto L_0x013c
        L_0x0139:
            r10.mo34715d(r14, r15, r13, r3)     // Catch:{ l -> 0x0145, all -> 0x0142 }
        L_0x013c:
            r3 = r1
        L_0x013d:
            h.a.a.e.f r0 = r7.f21469s
            if (r0 == 0) goto L_0x016a
            goto L_0x015b
        L_0x0142:
            r0 = move-exception
        L_0x0143:
            r3 = r1
            goto L_0x015f
        L_0x0145:
            r0 = move-exception
        L_0x0146:
            r3 = r1
            goto L_0x014e
        L_0x0148:
            r0 = move-exception
            goto L_0x014e
        L_0x014a:
            r0 = move-exception
            goto L_0x015f
        L_0x014c:
            r0 = move-exception
            r15 = r2
        L_0x014e:
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x014a }
            r15.mo33931c(r1, r0)     // Catch:{ all -> 0x014a }
            h.a.a.e.f r0 = r7.f21469s
            if (r0 == 0) goto L_0x016a
        L_0x015b:
            r0.mo34735c(r3)
            goto L_0x016a
        L_0x015f:
            h.a.a.e.f r1 = r7.f21469s
            if (r1 == 0) goto L_0x0166
            r1.mo34735c(r3)
        L_0x0166:
            throw r0
        L_0x0167:
            r9.mo34757L(r0, r8, r1, r2)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.C10987k.mo34757L(java.lang.String, h.a.a.f.n, d.b.f0.c, d.b.f0.e):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public boolean mo34758O0(C11037n nVar) {
        int i = C10989b.f21471a[nVar.mo34931G().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 || !this.f21461k || nVar.mo33964a("org.eclipse.jetty.server.welcome") == null) {
            return false;
        }
        nVar.mo34959e0("org.eclipse.jetty.server.welcome");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public abstract boolean mo34726P0(String str, C11037n nVar, C11039o oVar, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public abstract boolean mo34727Q0(String str, C11037n nVar, C11039o oVar, Object obj, C11046u uVar);

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public C10982f mo34759R0() {
        return (C10982f) mo34900d().mo35459F0(C10982f.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public C10983g mo34760S0() {
        List<C10983g> H0 = mo34900d().mo35461H0(C10983g.class);
        String V0 = mo34762V0();
        if (V0 != null) {
            for (C10983g next : H0) {
                if (next.getName() != null && next.getName().equals(V0)) {
                    return next;
                }
            }
            return null;
        } else if (H0.size() == 1) {
            return H0.get(0);
        } else {
            return null;
        }
    }

    /* renamed from: T0 */
    public C10975a mo34761T0() {
        return this.f21462l;
    }

    /* renamed from: V0 */
    public String mo34762V0() {
        return this.f21464n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public abstract boolean mo34728W0(C11037n nVar, C11039o oVar, Object obj);

    /* renamed from: X0 */
    public void mo34763X0(C11018d.C11025g gVar) {
        f21460u.mo35489e("logout {}", gVar);
        C10983g A = mo34716A();
        if (A != null) {
            A.mo34742d(gVar.mo34765a());
        }
        C10982f j = mo34719j();
        if (j != null) {
            j.mo34735c((Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public abstract Object mo34729Y0(String str, C11037n nVar);

    /* renamed from: Z0 */
    public String mo34764Z0(String str, String str2) {
        if (!isRunning()) {
            return this.f21466p.put(str, str2);
        }
        throw new IllegalStateException("running");
    }

    /* renamed from: c */
    public String mo34718c() {
        return this.f21465o;
    }

    /* renamed from: j */
    public C10982f mo34719j() {
        return this.f21469s;
    }

    /* renamed from: p */
    public boolean mo34720p() {
        return this.f21470t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        C10975a.C10977b bVar;
        C11052c.C11054b g1 = C11052c.m28456g1();
        if (g1 != null) {
            Enumeration f = g1.mo35082f();
            while (f != null && f.hasMoreElements()) {
                String str = (String) f.nextElement();
                if (str.startsWith("org.eclipse.jetty.security.") && mo34717I(str) == null) {
                    mo34764Z0(str, g1.mo35081d(str));
                }
            }
            g1.mo35080c().mo35055Y0(new C10988a(this));
        }
        if (this.f21467q == null) {
            C10983g S0 = mo34760S0();
            this.f21467q = S0;
            if (S0 != null) {
                this.f21468r = true;
            }
        }
        if (this.f21469s == null) {
            C10983g gVar = this.f21467q;
            if (gVar != null) {
                this.f21469s = gVar.mo34744j();
            }
            PrintStream printStream = System.err;
            printStream.println("Null identity service, trying login service: " + this.f21469s);
            if (this.f21469s == null) {
                this.f21469s = mo34759R0();
            }
            PrintStream printStream2 = System.err;
            printStream2.println("Finding identity service: " + this.f21469s);
            if (this.f21469s == null && this.f21464n != null) {
                this.f21469s = new C10981e();
            }
        }
        if (this.f21467q != null) {
            PrintStream printStream3 = System.err;
            printStream3.println("LoginService=" + this.f21467q + " identityService=" + this.f21469s);
            if (this.f21467q.mo34744j() == null) {
                this.f21467q.mo34740b(this.f21469s);
            } else if (this.f21467q.mo34744j() != this.f21469s) {
                throw new IllegalStateException("LoginService has different IdentityService to " + this);
            }
        }
        if (!this.f21468r) {
            C10983g gVar2 = this.f21467q;
            if (gVar2 instanceof C11153e) {
                ((C11153e) gVar2).start();
            }
        }
        if (!(this.f21462l != null || (bVar = this.f21463m) == null || this.f21469s == null)) {
            C10975a a = bVar.mo34721a(mo34900d(), C11052c.m28456g1(), this, this.f21469s, this.f21467q);
            this.f21462l = a;
            if (a != null) {
                this.f21465o = a.mo34714c();
            }
        }
        C10975a aVar = this.f21462l;
        if (aVar != null) {
            aVar.mo34713b(this);
            C10975a aVar2 = this.f21462l;
            if (aVar2 instanceof C11153e) {
                ((C11153e) aVar2).start();
            }
        } else if (this.f21464n != null) {
            C11158c cVar = f21460u;
            cVar.mo35486b("No ServerAuthentication for " + this, new Object[0]);
            throw new IllegalStateException("No ServerAuthentication");
        }
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        super.mo34263q0();
        if (!this.f21468r) {
            C10983g gVar = this.f21467q;
            if (gVar instanceof C11153e) {
                ((C11153e) gVar).stop();
            }
        }
    }
}
