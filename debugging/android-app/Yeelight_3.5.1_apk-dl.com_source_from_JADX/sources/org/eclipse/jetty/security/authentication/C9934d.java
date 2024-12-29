package org.eclipse.jetty.security.authentication;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9278b;
import javax.servlet.http.C9279c;
import javax.servlet.http.C9280d;
import javax.servlet.http.C9281e;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.C9995n;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.security.Constraint;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10356h;
import p208s4.C10364p;
import p208s4.C10368t;
import p234y5.C12072a;
import p234y5.C12080g;
import p234y5.C12089l;
import p239z5.C12151b;
import p239z5.C12159d;
import p239z5.C12181o;
import p239z5.C12193w;

/* renamed from: org.eclipse.jetty.security.authentication.d */
public class C9934d extends C9938e {

    /* renamed from: j */
    private static final C9003c f18207j = C9001b.m21450a(C9934d.class);

    /* renamed from: d */
    private String f18208d;

    /* renamed from: e */
    private String f18209e;

    /* renamed from: f */
    private String f18210f;

    /* renamed from: g */
    private String f18211g;

    /* renamed from: h */
    private boolean f18212h;

    /* renamed from: i */
    private boolean f18213i;

    /* renamed from: org.eclipse.jetty.security.authentication.d$a */
    public static class C9935a extends C12089l implements C12159d.C12166g {
        public C9935a(String str, C12193w wVar) {
            super(str, wVar);
        }

        public String toString() {
            return "Form" + super.toString();
        }
    }

    /* renamed from: org.eclipse.jetty.security.authentication.d$b */
    protected static class C9936b extends C9278b {
        public C9936b(C9277a aVar) {
            super(aVar);
        }

        /* renamed from: f */
        public Enumeration mo37762f() {
            return Collections.enumeration(Collections.list(super.mo37762f()));
        }

        /* renamed from: k */
        public Enumeration mo37766k(String str) {
            return str.toLowerCase(Locale.ENGLISH).startsWith("if-") ? Collections.enumeration(Collections.EMPTY_LIST) : super.mo37766k(str);
        }

        /* renamed from: r */
        public String mo37770r(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return null;
            }
            return super.mo37770r(str);
        }

        /* renamed from: t */
        public long mo37772t(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return -1;
            }
            return super.mo37772t(str);
        }
    }

    /* renamed from: org.eclipse.jetty.security.authentication.d$c */
    protected static class C9937c extends C9280d {
        public C9937c(C9279c cVar) {
            super(cVar);
        }

        /* renamed from: t */
        private boolean m24388t(String str) {
            return !"Cache-Control".equalsIgnoreCase(str) && !"Pragma".equalsIgnoreCase(str) && !"ETag".equalsIgnoreCase(str) && !"Expires".equalsIgnoreCase(str) && !"Last-Modified".equalsIgnoreCase(str) && !"Age".equalsIgnoreCase(str);
        }

        /* renamed from: a */
        public void mo37775a(String str, long j) {
            if (m24388t(str)) {
                super.mo37775a(str, j);
            }
        }

        /* renamed from: j */
        public void mo37777j(String str, String str2) {
            if (m24388t(str)) {
                super.mo37777j(str, str2);
            }
        }

        /* renamed from: o */
        public void mo37781o(String str, String str2) {
            if (m24388t(str)) {
                super.mo37781o(str, str2);
            }
        }
    }

    /* renamed from: i */
    private void m24376i(String str) {
        if (str == null || str.trim().length() == 0) {
            this.f18209e = null;
            this.f18208d = null;
            return;
        }
        if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            f18207j.mo36847b("form-error-page must start with /", new Object[0]);
            str = MiotCloudImpl.COOKIE_PATH + str;
        }
        this.f18208d = str;
        this.f18209e = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f18209e;
            this.f18209e = str2.substring(0, str2.indexOf(63));
        }
    }

    /* renamed from: j */
    private void m24377j(String str) {
        if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            f18207j.mo36847b("form-login-page must start with /", new Object[0]);
            str = MiotCloudImpl.COOKIE_PATH + str;
        }
        this.f18210f = str;
        this.f18211g = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f18211g;
            this.f18211g = str2.substring(0, str2.indexOf(63));
        }
    }

    /* renamed from: a */
    public C12159d mo39889a(C10364p pVar, C10368t tVar, boolean z) {
        C12080g gVar;
        String str;
        C9277a aVar = (C9277a) pVar;
        C9279c cVar = (C9279c) tVar;
        String w = aVar.mo37774w();
        if (w == null) {
            w = MiotCloudImpl.COOKIE_PATH;
        }
        if (!z && !mo39914g(w)) {
            return new C9931c(this);
        }
        if (mo39915h(C9997p.m24723a(aVar.mo37771s(), aVar.mo37763g())) && !C9931c.m24355d(cVar)) {
            return new C9931c(this);
        }
        C9281e p = aVar.mo37769p(true);
        try {
            if (mo39914g(w)) {
                String o = aVar.mo41951o("j_username");
                C12193w e = mo39913e(o, aVar.mo41951o("j_password"), aVar);
                C9281e p2 = aVar.mo37769p(true);
                if (e != null) {
                    synchronized (p2) {
                        str = (String) p2.mo26625a("org.eclipse.jetty.security.form_URI");
                        if (str == null || str.length() == 0) {
                            str = aVar.mo37761e();
                            if (str.length() == 0) {
                                str = MiotCloudImpl.COOKIE_PATH;
                            }
                        }
                    }
                    cVar.mo37798n(0);
                    cVar.mo37783q(cVar.mo37779l(str));
                    return new C9935a(getAuthMethod(), e);
                }
                C9003c cVar2 = f18207j;
                if (cVar2.mo36846a()) {
                    cVar2.mo36850e("Form authentication FAILED for " + C9995n.m24709e(o), new Object[0]);
                }
                String str2 = this.f18208d;
                if (str2 == null) {
                    if (cVar != null) {
                        cVar.mo37778k(TypedValues.CycleType.TYPE_ALPHA);
                    }
                } else if (this.f18212h) {
                    C10356h i = aVar.mo41949i(str2);
                    cVar.mo37781o("Cache-Control", "No-cache");
                    cVar.mo37775a("Expires", 1);
                    i.mo41940a(new C9936b(aVar), new C9937c(cVar));
                } else {
                    cVar.mo37783q(cVar.mo37779l(C9997p.m24723a(aVar.mo37761e(), this.f18208d)));
                }
                return C12159d.f22395P;
            }
            C12159d dVar = (C12159d) p.mo26625a(SessionAuthentication.__J_AUTHENTICATED);
            if (dVar != null) {
                if (!(dVar instanceof C12159d.C12167h) || (gVar = this.f18214a) == null || gVar.mo42763c(((C12159d.C12167h) dVar).getUserIdentity())) {
                    String str3 = (String) p.mo26625a("org.eclipse.jetty.security.form_URI");
                    if (str3 != null) {
                        MultiMap multiMap = (MultiMap) p.mo26625a("org.eclipse.jetty.security.form_POST");
                        if (multiMap != null) {
                            StringBuffer n = aVar.mo37768n();
                            if (aVar.mo37773u() != null) {
                                n.append("?");
                                n.append(aVar.mo37773u());
                            }
                            if (str3.equals(n.toString())) {
                                p.mo26628d("org.eclipse.jetty.security.form_POST");
                                C12181o v = pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v();
                                v.mo43116p0("POST");
                                v.mo43117q0(multiMap);
                            }
                        } else {
                            p.mo26628d("org.eclipse.jetty.security.form_URI");
                        }
                    }
                    return dVar;
                }
                p.mo26628d(SessionAuthentication.__J_AUTHENTICATED);
            }
            if (C9931c.m24355d(cVar)) {
                f18207j.mo36850e("auth deferred {}", p.getId());
                return C12159d.f22392M;
            }
            synchronized (p) {
                if (p.mo26625a("org.eclipse.jetty.security.form_URI") == null || this.f18213i) {
                    StringBuffer n2 = aVar.mo37768n();
                    if (aVar.mo37773u() != null) {
                        n2.append("?");
                        n2.append(aVar.mo37773u());
                    }
                    p.mo26626b("org.eclipse.jetty.security.form_URI", n2.toString());
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(pVar.getContentType()) && "POST".equals(aVar.mo37767l())) {
                        C12181o v2 = pVar instanceof C12181o ? (C12181o) pVar : C12151b.m31593o().mo42994v();
                        v2.mo43127y();
                        p.mo26626b("org.eclipse.jetty.security.form_POST", new MultiMap(v2.mo43085K()));
                    }
                }
            }
            if (this.f18212h) {
                C10356h i2 = aVar.mo41949i(this.f18210f);
                cVar.mo37781o("Cache-Control", "No-cache");
                cVar.mo37775a("Expires", 1);
                i2.mo41940a(new C9936b(aVar), new C9937c(cVar));
            } else {
                cVar.mo37783q(cVar.mo37779l(C9997p.m24723a(aVar.mo37761e(), this.f18210f)));
            }
            return C12159d.f22394O;
        } catch (IOException e2) {
            throw new ServerAuthException((Throwable) e2);
        } catch (ServletException e3) {
            throw new ServerAuthException((Throwable) e3);
        }
    }

    /* renamed from: b */
    public boolean mo39890b(C10364p pVar, C10368t tVar, boolean z, C12159d.C12167h hVar) {
        return true;
    }

    /* renamed from: c */
    public void mo39891c(C12072a.C12073a aVar) {
        super.mo39891c(aVar);
        String initParameter = aVar.getInitParameter("org.eclipse.jetty.security.form_login_page");
        if (initParameter != null) {
            m24377j(initParameter);
        }
        String initParameter2 = aVar.getInitParameter("org.eclipse.jetty.security.form_error_page");
        if (initParameter2 != null) {
            m24376i(initParameter2);
        }
        String initParameter3 = aVar.getInitParameter("org.eclipse.jetty.security.dispatch");
        this.f18212h = initParameter3 == null ? this.f18212h : Boolean.valueOf(initParameter3).booleanValue();
    }

    /* renamed from: e */
    public C12193w mo39913e(String str, Object obj, C10364p pVar) {
        C12193w e = super.mo39913e(str, obj, pVar);
        if (e != null) {
            ((C9277a) pVar).mo37769p(true).mo26626b(SessionAuthentication.__J_AUTHENTICATED, new SessionAuthentication(getAuthMethod(), e, obj));
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r5 = r5.charAt(r0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39914g(java.lang.String r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.security.authentication.C9934d.mo39914g(java.lang.String):boolean");
    }

    public String getAuthMethod() {
        return Constraint.__FORM_AUTH;
    }

    /* renamed from: h */
    public boolean mo39915h(String str) {
        return str != null && (str.equals(this.f18209e) || str.equals(this.f18211g));
    }
}
