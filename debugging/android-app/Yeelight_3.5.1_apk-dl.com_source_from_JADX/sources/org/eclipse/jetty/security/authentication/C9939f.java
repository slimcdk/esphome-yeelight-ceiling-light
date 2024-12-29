package org.eclipse.jetty.security.authentication;

import org.eclipse.jetty.util.security.Constraint;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10364p;
import p208s4.C10368t;
import p239z5.C12159d;

/* renamed from: org.eclipse.jetty.security.authentication.f */
public class C9939f extends C9938e {

    /* renamed from: e */
    private static final C9003c f18217e = C9001b.m21450a(C9939f.class);

    /* renamed from: d */
    private String f18218d = Constraint.__SPNEGO_AUTH;

    public C9939f() {
    }

    public C9939f(String str) {
        this.f18218d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r3 = mo39913e((java.lang.String) null, r0.substring(10), r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p239z5.C12159d mo39889a(p208s4.C10364p r3, p208s4.C10368t r4, boolean r5) {
        /*
            r2 = this;
            r0 = r3
            javax.servlet.http.a r0 = (javax.servlet.http.C9277a) r0
            javax.servlet.http.c r4 = (javax.servlet.http.C9279c) r4
            java.lang.String r1 = "Authorization"
            java.lang.String r0 = r0.mo37770r(r1)
            if (r5 != 0) goto L_0x0013
            org.eclipse.jetty.security.authentication.c r3 = new org.eclipse.jetty.security.authentication.c
            r3.<init>(r2)
            return r3
        L_0x0013:
            java.lang.String r5 = "Negotiate"
            if (r0 != 0) goto L_0x003e
            boolean r3 = org.eclipse.jetty.security.authentication.C9931c.m24355d(r4)     // Catch:{ IOException -> 0x0037 }
            if (r3 == 0) goto L_0x0020
            z5.d r3 = p239z5.C12159d.f22392M     // Catch:{ IOException -> 0x0037 }
            return r3
        L_0x0020:
            e6.c r3 = f18217e     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = "SpengoAuthenticator: sending challenge"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0037 }
            r3.mo36850e(r0, r1)     // Catch:{ IOException -> 0x0037 }
            java.lang.String r3 = "WWW-Authenticate"
            r4.mo37781o(r3, r5)     // Catch:{ IOException -> 0x0037 }
            r3 = 401(0x191, float:5.62E-43)
            r4.mo37778k(r3)     // Catch:{ IOException -> 0x0037 }
            z5.d r3 = p239z5.C12159d.f22394O     // Catch:{ IOException -> 0x0037 }
            return r3
        L_0x0037:
            r3 = move-exception
            org.eclipse.jetty.security.ServerAuthException r4 = new org.eclipse.jetty.security.ServerAuthException
            r4.<init>((java.lang.Throwable) r3)
            throw r4
        L_0x003e:
            boolean r4 = r0.startsWith(r5)
            if (r4 == 0) goto L_0x005b
            r4 = 10
            java.lang.String r4 = r0.substring(r4)
            r5 = 0
            z5.w r3 = r2.mo39913e(r5, r4, r3)
            if (r3 == 0) goto L_0x005b
            y5.l r4 = new y5.l
            java.lang.String r5 = r2.getAuthMethod()
            r4.<init>(r5, r3)
            return r4
        L_0x005b:
            z5.d r3 = p239z5.C12159d.f22392M
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.security.authentication.C9939f.mo39889a(s4.p, s4.t, boolean):z5.d");
    }

    /* renamed from: b */
    public boolean mo39890b(C10364p pVar, C10368t tVar, boolean z, C12159d.C12167h hVar) {
        return true;
    }

    public String getAuthMethod() {
        return this.f18218d;
    }
}
