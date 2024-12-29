package org.eclipse.jetty.security.authentication;

import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.C9985i;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10362n;
import p208s4.C10364p;
import p234y5.C12079f;
import p239z5.C12159d;

/* renamed from: org.eclipse.jetty.security.authentication.c */
public class C9931c implements C12159d.C12165f {

    /* renamed from: c */
    private static final C9003c f18202c = C9001b.m21450a(C9931c.class);

    /* renamed from: d */
    static final C9279c f18203d = new C9932a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static C10362n f18204e = new C9933b();

    /* renamed from: a */
    protected final C9938e f18205a;

    /* renamed from: b */
    private Object f18206b;

    /* renamed from: org.eclipse.jetty.security.authentication.c$a */
    static class C9932a implements C9279c {
        C9932a() {
        }

        /* renamed from: a */
        public void mo37775a(String str, long j) {
        }

        /* renamed from: b */
        public void mo39905b() {
        }

        /* renamed from: c */
        public void mo39906c(String str) {
        }

        /* renamed from: d */
        public void mo37776d(int i, String str) {
        }

        /* renamed from: e */
        public int mo39907e() {
            return 1024;
        }

        /* renamed from: f */
        public PrintWriter mo37796f() {
            return C9985i.m24692g();
        }

        /* renamed from: g */
        public boolean mo39908g() {
            return true;
        }

        public String getContentType() {
            return null;
        }

        /* renamed from: h */
        public C10362n mo37797h() {
            return C9931c.f18204e;
        }

        /* renamed from: i */
        public String mo39910i() {
            return null;
        }

        /* renamed from: j */
        public void mo37777j(String str, String str2) {
        }

        /* renamed from: k */
        public void mo37778k(int i) {
        }

        /* renamed from: l */
        public String mo37779l(String str) {
            return null;
        }

        /* renamed from: m */
        public boolean mo37780m(String str) {
            return false;
        }

        /* renamed from: n */
        public void mo37798n(int i) {
        }

        /* renamed from: o */
        public void mo37781o(String str, String str2) {
        }

        /* renamed from: p */
        public void mo37782p(int i) {
        }

        /* renamed from: q */
        public void mo37783q(String str) {
        }
    }

    /* renamed from: org.eclipse.jetty.security.authentication.c$b */
    static class C9933b extends C10362n {
        C9933b() {
        }

        /* renamed from: a */
        public void mo39911a(String str) {
        }

        public void write(int i) {
        }
    }

    public C9931c(C9938e eVar) {
        Objects.requireNonNull(eVar, "No Authenticator");
        this.f18205a = eVar;
    }

    /* renamed from: d */
    public static boolean m24355d(C9279c cVar) {
        return cVar == f18203d;
    }

    /* renamed from: a */
    public C12159d mo39903a(C10364p pVar) {
        try {
            C12159d a = this.f18205a.mo39889a(pVar, f18203d, true);
            if (a != null && (a instanceof C12159d.C12167h) && !(a instanceof C12159d.C12166g)) {
                C12079f h = this.f18205a.mo39917d().mo42766h();
                if (h != null) {
                    this.f18206b = h.mo42760f(((C12159d.C12167h) a).getUserIdentity());
                }
                return a;
            }
        } catch (ServerAuthException e) {
            f18202c.mo36848c(e);
        }
        return this;
    }

    /* renamed from: c */
    public Object mo39904c() {
        return this.f18206b;
    }
}
