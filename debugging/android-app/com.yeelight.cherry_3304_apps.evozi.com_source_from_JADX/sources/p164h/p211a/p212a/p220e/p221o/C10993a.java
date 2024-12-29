package p164h.p211a.p212a.p220e.p221o;

import p154d.p155b.C10734t;
import p154d.p155b.C10740z;
import p164h.p211a.p212a.p222f.C11018d;

/* renamed from: h.a.a.e.o.a */
public class C10993a extends C11005f {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r7 = p164h.p211a.p212a.p228h.C11107d.m28795a(r0.substring(r7 + 1), "ISO-8859-1");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p164h.p211a.p212a.p222f.C11018d mo34712a(p154d.p155b.C10734t r5, p154d.p155b.C10740z r6, boolean r7) {
        /*
            r4 = this;
            d.b.f0.c r5 = (p154d.p155b.p204f0.C10709c) r5
            d.b.f0.e r6 = (p154d.p155b.p204f0.C10711e) r6
            java.lang.String r0 = "Authorization"
            java.lang.String r0 = r5.mo33926r(r0)
            if (r7 != 0) goto L_0x0015
            h.a.a.e.o.c r5 = new h.a.a.e.o.c     // Catch:{ IOException -> 0x0012 }
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
            java.lang.String r7 = p164h.p211a.p212a.p228h.C11107d.m28795a(r7, r0)     // Catch:{ IOException -> 0x0012 }
            r0 = 58
            int r0 = r7.indexOf(r0)     // Catch:{ IOException -> 0x0012 }
            if (r0 <= 0) goto L_0x005a
            java.lang.String r1 = r7.substring(r1, r0)     // Catch:{ IOException -> 0x0012 }
            int r0 = r0 + 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ IOException -> 0x0012 }
            h.a.a.f.u r5 = r4.mo34776f(r1, r7, r5)     // Catch:{ IOException -> 0x0012 }
            if (r5 == 0) goto L_0x005a
            h.a.a.e.m r6 = new h.a.a.e.m     // Catch:{ IOException -> 0x0012 }
            java.lang.String r7 = r4.mo34714c()     // Catch:{ IOException -> 0x0012 }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x0012 }
            return r6
        L_0x005a:
            boolean r5 = p164h.p211a.p212a.p220e.p221o.C10995c.m28014e(r6)     // Catch:{ IOException -> 0x0012 }
            if (r5 == 0) goto L_0x0063
            h.a.a.f.d r5 = p164h.p211a.p212a.p222f.C11018d.f21599C     // Catch:{ IOException -> 0x0012 }
            return r5
        L_0x0063:
            java.lang.String r5 = "WWW-Authenticate"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0012 }
            r7.<init>()     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = "basic realm=\""
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            h.a.a.e.g r0 = r4.f21508a     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x0012 }
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            r0 = 34
            r7.append(r0)     // Catch:{ IOException -> 0x0012 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0012 }
            r6.mo33935l(r5, r7)     // Catch:{ IOException -> 0x0012 }
            r5 = 401(0x191, float:5.62E-43)
            r6.mo33933e(r5)     // Catch:{ IOException -> 0x0012 }
            h.a.a.f.d r5 = p164h.p211a.p212a.p222f.C11018d.f21601E     // Catch:{ IOException -> 0x0012 }
            return r5
        L_0x008c:
            h.a.a.e.l r6 = new h.a.a.e.l
            r6.<init>((java.lang.Throwable) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p220e.p221o.C10993a.mo34712a(d.b.t, d.b.z, boolean):h.a.a.f.d");
    }

    /* renamed from: c */
    public String mo34714c() {
        return "BASIC";
    }

    /* renamed from: d */
    public boolean mo34715d(C10734t tVar, C10740z zVar, boolean z, C11018d.C11025g gVar) {
        return true;
    }
}
