package p164h.p211a.p212a.p220e.p221o;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import p154d.p155b.C10724j;
import p154d.p155b.C10730p;
import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10710d;
import p154d.p155b.p204f0.C10711e;
import p154d.p155b.p204f0.C10712f;
import p154d.p155b.p204f0.C10713g;
import p164h.p211a.p212a.p220e.C10975a;
import p164h.p211a.p212a.p220e.C10990l;
import p164h.p211a.p212a.p220e.C10991m;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p222f.C11046u;
import p164h.p211a.p212a.p228h.C11129m;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.C11139s;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.e.o.e */
public class C11001e extends C11005f {

    /* renamed from: j */
    private static final C11158c f21501j = C11156b.m29015a(C11001e.class);

    /* renamed from: d */
    private String f21502d;

    /* renamed from: e */
    private String f21503e;

    /* renamed from: f */
    private String f21504f;

    /* renamed from: g */
    private String f21505g;

    /* renamed from: h */
    private boolean f21506h;

    /* renamed from: i */
    private boolean f21507i;

    /* renamed from: h.a.a.e.o.e$a */
    public static class C11002a extends C10991m implements C11018d.C11024f {
        public C11002a(String str, C11046u uVar) {
            super(str, uVar);
        }

        public String toString() {
            return "Form" + super.toString();
        }
    }

    /* renamed from: h.a.a.e.o.e$b */
    protected static class C11003b extends C10710d {
        public C11003b(C10709c cVar) {
            super(cVar);
        }

        /* renamed from: g */
        public Enumeration mo33919g() {
            return Collections.enumeration(Collections.list(super.mo33919g()));
        }

        /* renamed from: l */
        public Enumeration mo33922l(String str) {
            return str.toLowerCase(Locale.ENGLISH).startsWith("if-") ? Collections.enumeration(Collections.EMPTY_LIST) : super.mo33922l(str);
        }

        /* renamed from: r */
        public String mo33926r(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return null;
            }
            return super.mo33926r(str);
        }
    }

    /* renamed from: h.a.a.e.o.e$c */
    protected static class C11004c extends C10712f {
        public C11004c(C10711e eVar) {
            super(eVar);
        }

        /* renamed from: q */
        private boolean m28049q(String str) {
            return !"Cache-Control".equalsIgnoreCase(str) && !"Pragma".equalsIgnoreCase(str) && !"ETag".equalsIgnoreCase(str) && !"Expires".equalsIgnoreCase(str) && !"Last-Modified".equalsIgnoreCase(str) && !"Age".equalsIgnoreCase(str);
        }

        /* renamed from: a */
        public void mo33930a(String str, long j) {
            if (m28049q(str)) {
                super.mo33930a(str, j);
            }
        }

        /* renamed from: d */
        public void mo33932d(String str, String str2) {
            if (m28049q(str)) {
                super.mo33932d(str, str2);
            }
        }

        /* renamed from: l */
        public void mo33935l(String str, String str2) {
            if (m28049q(str)) {
                super.mo33935l(str, str2);
            }
        }
    }

    /* renamed from: j */
    private void m28037j(String str) {
        if (str == null || str.trim().length() == 0) {
            this.f21503e = null;
            this.f21502d = null;
            return;
        }
        if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            f21501j.mo35486b("form-error-page must start with /", new Object[0]);
            str = MiotCloudImpl.COOKIE_PATH + str;
        }
        this.f21502d = str;
        this.f21503e = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f21503e;
            this.f21503e = str2.substring(0, str2.indexOf(63));
        }
    }

    /* renamed from: k */
    private void m28038k(String str) {
        if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            f21501j.mo35486b("form-login-page must start with /", new Object[0]);
            str = MiotCloudImpl.COOKIE_PATH + str;
        }
        this.f21504f = str;
        this.f21505g = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f21505g;
            this.f21505g = str2.substring(0, str2.indexOf(63));
        }
    }

    /* renamed from: a */
    public C11018d mo34712a(C10734t tVar, C10740z zVar, boolean z) {
        String str;
        C10709c cVar = (C10709c) tVar;
        C10711e eVar = (C10711e) zVar;
        String v = cVar.mo33929v();
        if (v == null) {
            v = MiotCloudImpl.COOKIE_PATH;
        }
        if (!z && !mo34777h(v)) {
            return new C10995c(this);
        }
        if (mo34778i(C11139s.m28935a(cVar.mo33927s(), cVar.mo33920h())) && !C10995c.m28014e(eVar)) {
            return new C10995c(this);
        }
        C10713g p = cVar.mo33925p(true);
        try {
            if (mo34777h(v)) {
                String o = cVar.mo33971o("j_username");
                C11046u f = mo34776f(o, cVar.mo33971o("j_password"), cVar);
                C10713g p2 = cVar.mo33925p(true);
                if (f != null) {
                    synchronized (p2) {
                        str = (String) p2.mo33938a("org.eclipse.jetty.security.form_URI");
                        if (str == null || str.length() == 0) {
                            str = cVar.mo33917e();
                            if (str.length() == 0) {
                                str = MiotCloudImpl.COOKIE_PATH;
                            }
                        }
                    }
                    eVar.mo33889k(0);
                    eVar.mo33937n(eVar.mo33934f(str));
                    return new C11002a(mo34714c(), f);
                }
                if (f21501j.mo35485a()) {
                    C11158c cVar2 = f21501j;
                    cVar2.mo35489e("Form authentication FAILED for " + C11137q.m28922e(o), new Object[0]);
                }
                if (this.f21502d == null) {
                    if (eVar != null) {
                        eVar.mo33933e(403);
                    }
                } else if (this.f21506h) {
                    C10724j j = cVar.mo33970j(this.f21502d);
                    eVar.mo33935l("Cache-Control", "No-cache");
                    eVar.mo33930a("Expires", 1);
                    j.mo33957a(new C11003b(cVar), new C11004c(eVar));
                } else {
                    eVar.mo33937n(eVar.mo33934f(C11139s.m28935a(cVar.mo33917e(), this.f21502d)));
                }
                return C11018d.f21602F;
            }
            C11018d dVar = (C11018d) p.mo33938a("org.eclipse.jetty.security.UserIdentity");
            if (dVar != null) {
                if (!(dVar instanceof C11018d.C11025g) || this.f21508a == null || this.f21508a.mo34739a(((C11018d.C11025g) dVar).mo34765a())) {
                    String str2 = (String) p.mo33938a("org.eclipse.jetty.security.form_URI");
                    if (str2 != null) {
                        C11129m mVar = (C11129m) p.mo33938a("org.eclipse.jetty.security.form_POST");
                        if (mVar != null) {
                            StringBuffer n = cVar.mo33924n();
                            if (cVar.mo33928t() != null) {
                                n.append("?");
                                n.append(cVar.mo33928t());
                            }
                            if (str2.equals(n.toString())) {
                                p.mo33940e("org.eclipse.jetty.security.form_POST");
                                C11037n v2 = tVar instanceof C11037n ? (C11037n) tVar : C11010b.m28113o().mo34849v();
                                v2.mo34970p0("POST");
                                v2.mo34971q0(mVar);
                            }
                        } else {
                            p.mo33940e("org.eclipse.jetty.security.form_URI");
                        }
                    }
                    return dVar;
                }
                p.mo33940e("org.eclipse.jetty.security.UserIdentity");
            }
            if (C10995c.m28014e(eVar)) {
                f21501j.mo35489e("auth deferred {}", p.getId());
                return C11018d.f21599C;
            }
            synchronized (p) {
                if (p.mo33938a("org.eclipse.jetty.security.form_URI") == null || this.f21507i) {
                    StringBuffer n2 = cVar.mo33924n();
                    if (cVar.mo33928t() != null) {
                        n2.append("?");
                        n2.append(cVar.mo33928t());
                    }
                    p.mo33939b("org.eclipse.jetty.security.form_URI", n2.toString());
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(tVar.getContentType()) && "POST".equals(cVar.mo33923m())) {
                        C11037n v3 = tVar instanceof C11037n ? (C11037n) tVar : C11010b.m28113o().mo34849v();
                        v3.mo34980x();
                        p.mo33939b("org.eclipse.jetty.security.form_POST", new C11129m(v3.mo34937J()));
                    }
                }
            }
            if (this.f21506h) {
                C10724j j2 = cVar.mo33970j(this.f21504f);
                eVar.mo33935l("Cache-Control", "No-cache");
                eVar.mo33930a("Expires", 1);
                j2.mo33957a(new C11003b(cVar), new C11004c(eVar));
            } else {
                eVar.mo33937n(eVar.mo33934f(C11139s.m28935a(cVar.mo33917e(), this.f21504f)));
            }
            return C11018d.f21601E;
        } catch (IOException e) {
            throw new C10990l((Throwable) e);
        } catch (C10730p e2) {
            throw new C10990l((Throwable) e2);
        }
    }

    /* renamed from: b */
    public void mo34713b(C10975a.C10976a aVar) {
        super.mo34713b(aVar);
        String I = aVar.mo34717I("org.eclipse.jetty.security.form_login_page");
        if (I != null) {
            m28038k(I);
        }
        String I2 = aVar.mo34717I("org.eclipse.jetty.security.form_error_page");
        if (I2 != null) {
            m28037j(I2);
        }
        String I3 = aVar.mo34717I("org.eclipse.jetty.security.dispatch");
        this.f21506h = I3 == null ? this.f21506h : Boolean.valueOf(I3).booleanValue();
    }

    /* renamed from: c */
    public String mo34714c() {
        return "FORM";
    }

    /* renamed from: d */
    public boolean mo34715d(C10734t tVar, C10740z zVar, boolean z, C11018d.C11025g gVar) {
        return true;
    }

    /* renamed from: f */
    public C11046u mo34776f(String str, Object obj, C10734t tVar) {
        C11046u f = super.mo34776f(str, obj, tVar);
        if (f != null) {
            ((C10709c) tVar).mo33925p(true).mo33939b("org.eclipse.jetty.security.UserIdentity", new C11006g(mo34714c(), f, obj));
        }
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r5 = r5.charAt(r0);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34777h(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "/j_security_check"
            int r0 = r5.indexOf(r0)
            r1 = 0
            if (r0 >= 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = r0 + 17
            int r2 = r5.length()
            r3 = 1
            if (r0 != r2) goto L_0x0014
            return r3
        L_0x0014:
            char r5 = r5.charAt(r0)
            r0 = 59
            if (r5 == r0) goto L_0x0028
            r0 = 35
            if (r5 == r0) goto L_0x0028
            r0 = 47
            if (r5 == r0) goto L_0x0028
            r0 = 63
            if (r5 != r0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.p221o.C11001e.mo34777h(java.lang.String):boolean");
    }

    /* renamed from: i */
    public boolean mo34778i(String str) {
        return str != null && (str.equals(this.f21503e) || str.equals(this.f21505g));
    }
}
