package org.eclipse.jetty.security.authentication;

import org.eclipse.jetty.util.security.Constraint;
import p208s4.C10364p;
import p208s4.C10368t;
import p239z5.C12159d;

/* renamed from: org.eclipse.jetty.security.authentication.a */
public class C9929a extends C9938e {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r7 = org.eclipse.jetty.util.C9980d.m24665a(r0.substring(r7 + 1), "ISO-8859-1");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p239z5.C12159d mo39889a(p208s4.C10364p r5, p208s4.C10368t r6, boolean r7) {
        /*
            r4 = this;
            javax.servlet.http.a r5 = (javax.servlet.http.C9277a) r5
            javax.servlet.http.c r6 = (javax.servlet.http.C9279c) r6
            java.lang.String r0 = "Authorization"
            java.lang.String r0 = r5.mo37770r(r0)
            if (r7 != 0) goto L_0x0015
            org.eclipse.jetty.security.authentication.c r5 = new org.eclipse.jetty.security.authentication.c     // Catch:{ IOException -> 0x0012 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0012 }
            return r5
        L_0x0012:
            r5 = move-exception
            goto L_0x008c
        L_0x0015:
            if (r0 == 0) goto L_0x005a
            r7 = 32
            int r7 = r0.indexOf(r7)     // Catch:{ IOException -> 0x0012 }
            if (r7 <= 0) goto L_0x005a
            r1 = 0
            java.lang.String r2 = r0.substring(r1, r7)     // Catch:{ IOException -> 0x0012 }
            java.lang.String r3 = "basic"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ IOException -> 0x0012 }
            if (r2 == 0) goto L_0x005a
            int r7 = r7 + 1
            java.lang.String r7 = r0.substring(r7)     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = "ISO-8859-1"
            java.lang.String r7 = org.eclipse.jetty.util.C9980d.m24665a(r7, r0)     // Catch:{ IOException -> 0x0012 }
            r0 = 58
            int r0 = r7.indexOf(r0)     // Catch:{ IOException -> 0x0012 }
            if (r0 <= 0) goto L_0x005a
            java.lang.String r1 = r7.substring(r1, r0)     // Catch:{ IOException -> 0x0012 }
            int r0 = r0 + 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ IOException -> 0x0012 }
            z5.w r5 = r4.mo39913e(r1, r7, r5)     // Catch:{ IOException -> 0x0012 }
            if (r5 == 0) goto L_0x005a
            y5.l r6 = new y5.l     // Catch:{ IOException -> 0x0012 }
            java.lang.String r7 = r4.getAuthMethod()     // Catch:{ IOException -> 0x0012 }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x0012 }
            return r6
        L_0x005a:
            boolean r5 = org.eclipse.jetty.security.authentication.C9931c.m24355d(r6)     // Catch:{ IOException -> 0x0012 }
            if (r5 == 0) goto L_0x0063
            z5.d r5 = p239z5.C12159d.f22392M     // Catch:{ IOException -> 0x0012 }
            return r5
        L_0x0063:
            java.lang.String r5 = "WWW-Authenticate"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012 }
            r7.<init>()     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = "basic realm=\""
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            y5.g r0 = r4.f18214a     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x0012 }
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            r0 = 34
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0012 }
            r6.mo37781o(r5, r7)     // Catch:{ IOException -> 0x0012 }
            r5 = 401(0x191, float:5.62E-43)
            r6.mo37778k(r5)     // Catch:{ IOException -> 0x0012 }
            z5.d r5 = p239z5.C12159d.f22394O     // Catch:{ IOException -> 0x0012 }
            return r5
        L_0x008c:
            org.eclipse.jetty.security.ServerAuthException r6 = new org.eclipse.jetty.security.ServerAuthException
            r6.<init>((java.lang.Throwable) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.security.authentication.C9929a.mo39889a(s4.p, s4.t, boolean):z5.d");
    }

    /* renamed from: b */
    public boolean mo39890b(C10364p pVar, C10368t tVar, boolean z, C12159d.C12167h hVar) {
        return true;
    }

    public String getAuthMethod() {
        return Constraint.__BASIC_AUTH;
    }
}
