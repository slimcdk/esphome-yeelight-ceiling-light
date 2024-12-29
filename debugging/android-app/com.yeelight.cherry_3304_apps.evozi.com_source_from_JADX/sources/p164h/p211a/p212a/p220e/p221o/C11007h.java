package p164h.p211a.p212a.p220e.p221o;

import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p164h.p211a.p212a.p222f.C11018d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.e.o.h */
public class C11007h extends C11005f {

    /* renamed from: e */
    private static final C11158c f21515e = C11156b.m29015a(C11007h.class);

    /* renamed from: d */
    private String f21516d = "SPNEGO";

    public C11007h() {
    }

    public C11007h(String str) {
        this.f21516d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r3 = mo34776f((java.lang.String) null, r0.substring(10), r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p211a.p212a.p222f.C11018d mo34712a(p154d.p155b.C10734t r3, p154d.p155b.C10740z r4, boolean r5) {
        /*
            r2 = this;
            r0 = r3
            d.b.f0.c r0 = (p154d.p155b.p204f0.C10709c) r0
            d.b.f0.e r4 = (p154d.p155b.p204f0.C10711e) r4
            java.lang.String r1 = "Authorization"
            java.lang.String r0 = r0.mo33926r(r1)
            if (r5 != 0) goto L_0x0013
            h.a.a.e.o.c r3 = new h.a.a.e.o.c
            r3.<init>(r2)
            return r3
        L_0x0013:
            java.lang.String r5 = "Negotiate"
            if (r0 != 0) goto L_0x003e
            boolean r3 = p164h.p211a.p212a.p220e.p221o.C10995c.m28014e(r4)     // Catch:{ IOException -> 0x0037 }
            if (r3 == 0) goto L_0x0020
            h.a.a.f.d r3 = p164h.p211a.p212a.p222f.C11018d.f21599C     // Catch:{ IOException -> 0x0037 }
            return r3
        L_0x0020:
            h.a.a.h.y.c r3 = f21515e     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = "SpengoAuthenticator: sending challenge"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0037 }
            r3.mo35489e(r0, r1)     // Catch:{ IOException -> 0x0037 }
            java.lang.String r3 = "WWW-Authenticate"
            r4.mo33935l(r3, r5)     // Catch:{ IOException -> 0x0037 }
            r3 = 401(0x191, float:5.62E-43)
            r4.mo33933e(r3)     // Catch:{ IOException -> 0x0037 }
            h.a.a.f.d r3 = p164h.p211a.p212a.p222f.C11018d.f21601E     // Catch:{ IOException -> 0x0037 }
            return r3
        L_0x0037:
            r3 = move-exception
            h.a.a.e.l r4 = new h.a.a.e.l
            r4.<init>((java.lang.Throwable) r3)
            throw r4
        L_0x003e:
            if (r0 == 0) goto L_0x005d
            boolean r4 = r0.startsWith(r5)
            if (r4 == 0) goto L_0x005d
            r4 = 10
            java.lang.String r4 = r0.substring(r4)
            r5 = 0
            h.a.a.f.u r3 = r2.mo34776f(r5, r4, r3)
            if (r3 == 0) goto L_0x005d
            h.a.a.e.m r4 = new h.a.a.e.m
            java.lang.String r5 = r2.mo34714c()
            r4.<init>(r5, r3)
            return r4
        L_0x005d:
            h.a.a.f.d r3 = p164h.p211a.p212a.p222f.C11018d.f21599C
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.p221o.C11007h.mo34712a(d.b.t, d.b.z, boolean):h.a.a.f.d");
    }

    /* renamed from: c */
    public String mo34714c() {
        return this.f21516d;
    }

    /* renamed from: d */
    public boolean mo34715d(C10734t tVar, C10740z zVar, boolean z, C11018d.C11025g gVar) {
        return true;
    }
}
