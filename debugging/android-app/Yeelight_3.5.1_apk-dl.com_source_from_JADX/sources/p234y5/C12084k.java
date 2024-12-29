package p234y5;

import java.io.PrintStream;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.C9285i;
import javax.servlet.http.HttpSessionEvent;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9950h;
import p147d6.C8949e;
import p152e6.C9001b;
import p152e6.C9003c;
import p234y5.C12072a;
import p239z5.C12151b;
import p239z5.C12159d;
import p239z5.C12181o;
import p239z5.C12186q;
import p239z5.C12193w;

/* renamed from: y5.k */
public abstract class C12084k extends C9950h implements C12072a.C12073a {

    /* renamed from: u */
    private static final C9003c f22130u = C9001b.m21450a(C12084k.class);

    /* renamed from: k */
    private boolean f22131k = false;

    /* renamed from: l */
    private C12072a f22132l;

    /* renamed from: m */
    private C12072a.C12074b f22133m = new C12077d();

    /* renamed from: n */
    private String f22134n;

    /* renamed from: o */
    private String f22135o;

    /* renamed from: p */
    private final Map<String, String> f22136p = new HashMap();

    /* renamed from: q */
    private C12080g f22137q;

    /* renamed from: r */
    private boolean f22138r;

    /* renamed from: s */
    private C12079f f22139s;

    /* renamed from: t */
    private boolean f22140t = true;

    /* renamed from: y5.k$a */
    class C12085a implements C9285i {
        C12085a(C12084k kVar) {
        }

        /* renamed from: j */
        public void mo37791j(HttpSessionEvent httpSessionEvent) {
            C12181o v;
            C12151b o = C12151b.m31593o();
            if (o != null && (v = o.mo42994v()) != null && v.mo41945c()) {
                httpSessionEvent.getSession().mo26626b("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
            }
        }

        /* renamed from: n */
        public void mo37792n(HttpSessionEvent httpSessionEvent) {
        }
    }

    /* renamed from: y5.k$b */
    static class C12086b implements Principal {
        C12086b() {
        }

        public String getName() {
            return null;
        }

        public String toString() {
            return "No User";
        }
    }

    /* renamed from: y5.k$c */
    static class C12087c implements Principal {
        C12087c() {
        }

        public String getName() {
            return "Nobody";
        }

        public String toString() {
            return getName();
        }
    }

    /* renamed from: y5.k$d */
    static /* synthetic */ class C12088d {

        /* renamed from: a */
        static final /* synthetic */ int[] f22141a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                javax.servlet.DispatcherType[] r0 = javax.servlet.DispatcherType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22141a = r0
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22141a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.ASYNC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22141a     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.FORWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p234y5.C12084k.C12088d.<clinit>():void");
        }
    }

    static {
        new C12086b();
        new C12087c();
    }

    protected C12084k() {
    }

    /* renamed from: Z0 */
    public static C12084k m31190Z0() {
        C9943d.C9945b m1 = C9943d.m24416m1();
        if (m1 == null) {
            return null;
        }
        return (C12084k) m1.mo39960d().mo39923Q0(C12084k.class);
    }

    /* renamed from: F */
    public C12080g mo42738F() {
        return this.f22137q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public boolean mo42780T0(C12181o oVar) {
        int i = C12088d.f22141a[oVar.mo43079H().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 || !this.f22131k || oVar.mo40040a("org.eclipse.jetty.server.welcome") == null) {
            return false;
        }
        oVar.mo43105e0("org.eclipse.jetty.server.welcome");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public abstract boolean mo42748U0(String str, C12181o oVar, C12186q qVar, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public abstract boolean mo42749V0(String str, C12181o oVar, C12186q qVar, Object obj, C12193w wVar);

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C12079f mo42781W0() {
        return (C12079f) mo39919c().mo36758K0(C12079f.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public C12080g mo42782X0() {
        List<C12080g> M0 = mo39919c().mo36760M0(C12080g.class);
        String a1 = mo42784a1();
        if (a1 != null) {
            for (C12080g next : M0) {
                if (next.getName() != null && next.getName().equals(a1)) {
                    return next;
                }
            }
            return null;
        } else if (M0.size() == 1) {
            return M0.get(0);
        } else {
            return null;
        }
    }

    /* renamed from: Y0 */
    public C12072a mo42783Y0() {
        return this.f22132l;
    }

    /* renamed from: a1 */
    public String mo42784a1() {
        return this.f22134n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public abstract boolean mo42750b1(C12181o oVar, C12186q qVar, Object obj);

    /* renamed from: c1 */
    public void mo42785c1(C12159d.C12167h hVar) {
        f22130u.mo36850e("logout {}", hVar);
        C12080g F = mo42738F();
        if (F != null) {
            F.mo42761a(hVar.getUserIdentity());
        }
        C12079f h = mo42741h();
        if (h != null) {
            h.mo42758d((Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public abstract Object mo42751d1(String str, C12181o oVar);

    /* renamed from: e1 */
    public String mo42786e1(String str, String str2) {
        if (!isRunning()) {
            return this.f22136p.put(str, str2);
        }
        throw new IllegalStateException("running");
    }

    public String getAuthMethod() {
        return this.f22135o;
    }

    public String getInitParameter(String str) {
        return this.f22136p.get(str);
    }

    /* renamed from: h */
    public C12079f mo42741h() {
        return this.f22139s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0133, code lost:
        if (r10 != null) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x00f0=Splitter:B:61:0x00f0, B:87:0x0130=Splitter:B:87:0x0130} */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39972q(java.lang.String r20, p239z5.C12181o r21, javax.servlet.http.C9277a r22, javax.servlet.http.C9279c r23) {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            r8 = r21
            r1 = r22
            r2 = r23
            z5.q r4 = r21.mo43088N()
            z5.i r9 = r19.mo39983R0()
            if (r9 != 0) goto L_0x0015
            return
        L_0x0015:
            y5.a r10 = r7.f22132l
            boolean r3 = r7.mo42780T0(r8)
            if (r3 == 0) goto L_0x0163
            java.lang.Object r5 = r19.mo42751d1(r20, r21)
            boolean r3 = r7.mo42748U0(r0, r8, r4, r5)
            r11 = 403(0x193, float:5.65E-43)
            r12 = 1
            if (r3 != 0) goto L_0x0037
            boolean r0 = r21.mo43100Z()
            if (r0 != 0) goto L_0x0036
            r2.mo37778k(r11)
            r8.mo43115o0(r12)
        L_0x0036:
            return
        L_0x0037:
            boolean r13 = r7.mo42750b1(r8, r4, r5)
            if (r13 == 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            e6.c r0 = f22130u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "No authenticator for: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.mo36847b(r1, r3)
            boolean r0 = r21.mo43100Z()
            if (r0 != 0) goto L_0x0064
            r2.mo37778k(r11)
            r8.mo43115o0(r12)
        L_0x0064:
            return
        L_0x0065:
            r3 = 0
            z5.d r6 = r21.mo43069C()     // Catch:{ ServerAuthException -> 0x0148 }
            if (r6 == 0) goto L_0x0070
            z5.d r14 = p239z5.C12159d.f22393N     // Catch:{ ServerAuthException -> 0x0148 }
            if (r6 != r14) goto L_0x0079
        L_0x0070:
            if (r10 != 0) goto L_0x0075
            z5.d r6 = p239z5.C12159d.f22392M     // Catch:{ ServerAuthException -> 0x0148 }
            goto L_0x0079
        L_0x0075:
            z5.d r6 = r10.mo39889a(r1, r2, r13)     // Catch:{ ServerAuthException -> 0x0148 }
        L_0x0079:
            boolean r14 = r6 instanceof p239z5.C12159d.C12168i     // Catch:{ ServerAuthException -> 0x0148 }
            if (r14 == 0) goto L_0x008b
            r1 = r6
            z5.d$i r1 = (p239z5.C12159d.C12168i) r1     // Catch:{ ServerAuthException -> 0x0148 }
            javax.servlet.http.a r1 = r1.mo43037p()     // Catch:{ ServerAuthException -> 0x0148 }
            r14 = r6
            z5.d$i r14 = (p239z5.C12159d.C12168i) r14     // Catch:{ ServerAuthException -> 0x0148 }
            javax.servlet.http.c r2 = r14.mo43036e()     // Catch:{ ServerAuthException -> 0x0148 }
        L_0x008b:
            r14 = r1
            r15 = r2
            boolean r1 = r6 instanceof p239z5.C12159d.C12166g     // Catch:{ ServerAuthException -> 0x0144 }
            if (r1 == 0) goto L_0x0096
            r8.mo43115o0(r12)     // Catch:{ ServerAuthException -> 0x0144 }
            goto L_0x0139
        L_0x0096:
            boolean r1 = r6 instanceof p239z5.C12159d.C12167h     // Catch:{ ServerAuthException -> 0x0144 }
            if (r1 == 0) goto L_0x00fb
            r2 = r6
            z5.d$h r2 = (p239z5.C12159d.C12167h) r2     // Catch:{ ServerAuthException -> 0x0144 }
            r8.mo43109i0(r6)     // Catch:{ ServerAuthException -> 0x0144 }
            y5.f r1 = r7.f22139s     // Catch:{ ServerAuthException -> 0x0144 }
            if (r1 == 0) goto L_0x00ae
            z5.w r6 = r2.getUserIdentity()     // Catch:{ ServerAuthException -> 0x0144 }
            java.lang.Object r1 = r1.mo42760f(r6)     // Catch:{ ServerAuthException -> 0x0144 }
            r6 = r1
            goto L_0x00af
        L_0x00ae:
            r6 = r3
        L_0x00af:
            if (r13 == 0) goto L_0x00ed
            z5.w r16 = r2.getUserIdentity()     // Catch:{ ServerAuthException -> 0x00ea, all -> 0x00e7 }
            r1 = r19
            r3 = r2
            r2 = r20
            r17 = r3
            r3 = r21
            r18 = r6
            r6 = r16
            boolean r1 = r1.mo42749V0(r2, r3, r4, r5, r6)     // Catch:{ ServerAuthException -> 0x00e2, all -> 0x00dd }
            if (r1 != 0) goto L_0x00da
            java.lang.String r0 = "!role"
            r15.mo37776d(r11, r0)     // Catch:{ ServerAuthException -> 0x00e2, all -> 0x00dd }
            r8.mo43115o0(r12)     // Catch:{ ServerAuthException -> 0x00e2, all -> 0x00dd }
            y5.f r0 = r7.f22139s
            if (r0 == 0) goto L_0x00d9
            r1 = r18
            r0.mo42758d(r1)
        L_0x00d9:
            return
        L_0x00da:
            r1 = r18
            goto L_0x00f0
        L_0x00dd:
            r0 = move-exception
            r1 = r18
            goto L_0x013f
        L_0x00e2:
            r0 = move-exception
            r1 = r18
            goto L_0x0142
        L_0x00e7:
            r0 = move-exception
            r1 = r6
            goto L_0x013f
        L_0x00ea:
            r0 = move-exception
            r1 = r6
            goto L_0x0142
        L_0x00ed:
            r17 = r2
            r1 = r6
        L_0x00f0:
            r9.mo39972q(r0, r8, r14, r15)     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            if (r10 == 0) goto L_0x0138
            r6 = r17
            r10.mo39890b(r14, r15, r13, r6)     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            goto L_0x0138
        L_0x00fb:
            boolean r1 = r6 instanceof p239z5.C12159d.C12165f     // Catch:{ ServerAuthException -> 0x0144 }
            if (r1 == 0) goto L_0x0123
            r1 = r6
            org.eclipse.jetty.security.authentication.c r1 = (org.eclipse.jetty.security.authentication.C9931c) r1     // Catch:{ ServerAuthException -> 0x0144 }
            r8.mo43109i0(r6)     // Catch:{ ServerAuthException -> 0x0144 }
            r9.mo39972q(r0, r8, r14, r15)     // Catch:{ all -> 0x011c }
            java.lang.Object r1 = r1.mo39904c()     // Catch:{ ServerAuthException -> 0x0144 }
            if (r10 == 0) goto L_0x0138
            z5.d r0 = r21.mo43069C()     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            boolean r2 = r0 instanceof p239z5.C12159d.C12167h     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            if (r2 == 0) goto L_0x0135
            z5.d$h r0 = (p239z5.C12159d.C12167h) r0     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            r10.mo39890b(r14, r15, r13, r0)     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            goto L_0x0138
        L_0x011c:
            r0 = move-exception
            r2 = r0
            java.lang.Object r3 = r1.mo39904c()     // Catch:{ ServerAuthException -> 0x0144 }
            throw r2     // Catch:{ ServerAuthException -> 0x0144 }
        L_0x0123:
            r8.mo43109i0(r6)     // Catch:{ ServerAuthException -> 0x0144 }
            y5.f r1 = r7.f22139s     // Catch:{ ServerAuthException -> 0x0144 }
            if (r1 == 0) goto L_0x012f
            java.lang.Object r1 = r1.mo42760f(r3)     // Catch:{ ServerAuthException -> 0x0144 }
            goto L_0x0130
        L_0x012f:
            r1 = r3
        L_0x0130:
            r9.mo39972q(r0, r8, r14, r15)     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
            if (r10 == 0) goto L_0x0138
        L_0x0135:
            r10.mo39890b(r14, r15, r13, r3)     // Catch:{ ServerAuthException -> 0x0141, all -> 0x013e }
        L_0x0138:
            r3 = r1
        L_0x0139:
            y5.f r0 = r7.f22139s
            if (r0 == 0) goto L_0x0166
            goto L_0x0157
        L_0x013e:
            r0 = move-exception
        L_0x013f:
            r3 = r1
            goto L_0x015b
        L_0x0141:
            r0 = move-exception
        L_0x0142:
            r3 = r1
            goto L_0x014a
        L_0x0144:
            r0 = move-exception
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            goto L_0x015b
        L_0x0148:
            r0 = move-exception
            r15 = r2
        L_0x014a:
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0146 }
            r15.mo37776d(r1, r0)     // Catch:{ all -> 0x0146 }
            y5.f r0 = r7.f22139s
            if (r0 == 0) goto L_0x0166
        L_0x0157:
            r0.mo42758d(r3)
            goto L_0x0166
        L_0x015b:
            y5.f r1 = r7.f22139s
            if (r1 == 0) goto L_0x0162
            r1.mo42758d(r3)
        L_0x0162:
            throw r0
        L_0x0163:
            r9.mo39972q(r0, r8, r1, r2)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p234y5.C12084k.mo39972q(java.lang.String, z5.o, javax.servlet.http.a, javax.servlet.http.c):void");
    }

    /* renamed from: r */
    public boolean mo42742r() {
        return this.f22140t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        C12072a.C12074b bVar;
        C9943d.C9945b m1 = C9943d.m24416m1();
        if (m1 != null) {
            Enumeration f = m1.mo39962f();
            while (f != null && f.hasMoreElements()) {
                String str = (String) f.nextElement();
                if (str.startsWith("org.eclipse.jetty.security.") && getInitParameter(str) == null) {
                    mo42786e1(str, m1.getInitParameter(str));
                }
            }
            m1.mo39960d().mo39934e1(new C12085a(this));
        }
        if (this.f22137q == null) {
            C12080g X0 = mo42782X0();
            this.f22137q = X0;
            if (X0 != null) {
                this.f22138r = true;
            }
        }
        if (this.f22139s == null) {
            C12080g gVar = this.f22137q;
            if (gVar != null) {
                this.f22139s = gVar.mo42766h();
            }
            PrintStream printStream = System.err;
            printStream.println("Null identity service, trying login service: " + this.f22139s);
            if (this.f22139s == null) {
                this.f22139s = mo42781W0();
            }
            PrintStream printStream2 = System.err;
            printStream2.println("Finding identity service: " + this.f22139s);
            if (this.f22139s == null && this.f22134n != null) {
                this.f22139s = new C12078e();
            }
        }
        if (this.f22137q != null) {
            PrintStream printStream3 = System.err;
            printStream3.println("LoginService=" + this.f22137q + " identityService=" + this.f22139s);
            if (this.f22137q.mo42766h() == null) {
                this.f22137q.mo42764d(this.f22139s);
            } else if (this.f22137q.mo42766h() != this.f22139s) {
                throw new IllegalStateException("LoginService has different IdentityService to " + this);
            }
        }
        if (!this.f22138r) {
            C12080g gVar2 = this.f22137q;
            if (gVar2 instanceof C8949e) {
                ((C8949e) gVar2).start();
            }
        }
        if (!(this.f22132l != null || (bVar = this.f22133m) == null || this.f22139s == null)) {
            C12072a a = bVar.mo42743a(mo39919c(), C9943d.m24416m1(), this, this.f22139s, this.f22137q);
            this.f22132l = a;
            if (a != null) {
                this.f22135o = a.getAuthMethod();
            }
        }
        C12072a aVar = this.f22132l;
        if (aVar != null) {
            aVar.mo39891c(this);
            C12072a aVar2 = this.f22132l;
            if (aVar2 instanceof C8949e) {
                ((C8949e) aVar2).start();
            }
        } else if (this.f22134n != null) {
            C9003c cVar = f22130u;
            cVar.mo36847b("No ServerAuthentication for " + this, new Object[0]);
            throw new IllegalStateException("No ServerAuthentication");
        }
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        super.mo26548v0();
        if (!this.f22138r) {
            C12080g gVar = this.f22137q;
            if (gVar instanceof C8949e) {
                ((C8949e) gVar).stop();
            }
        }
    }
}
