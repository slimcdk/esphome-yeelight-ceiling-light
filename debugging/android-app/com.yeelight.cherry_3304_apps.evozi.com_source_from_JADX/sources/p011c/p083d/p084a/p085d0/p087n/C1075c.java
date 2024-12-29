package p011c.p083d.p084a.p085d0.p087n;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C1000d;
import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1144x;
import p011c.p083d.p084a.C1150z;

/* renamed from: c.d.a.d0.n.c */
public final class C1075c {

    /* renamed from: a */
    public final C1144x f1529a;

    /* renamed from: b */
    public final C1150z f1530b;

    /* renamed from: c.d.a.d0.n.c$b */
    public static class C1077b {

        /* renamed from: a */
        final long f1531a;

        /* renamed from: b */
        final C1144x f1532b;

        /* renamed from: c */
        final C1150z f1533c;

        /* renamed from: d */
        private Date f1534d;

        /* renamed from: e */
        private String f1535e;

        /* renamed from: f */
        private Date f1536f;

        /* renamed from: g */
        private String f1537g;

        /* renamed from: h */
        private Date f1538h;

        /* renamed from: i */
        private long f1539i;

        /* renamed from: j */
        private long f1540j;

        /* renamed from: k */
        private String f1541k;

        /* renamed from: l */
        private int f1542l = -1;

        public C1077b(long j, C1144x xVar, C1150z zVar) {
            this.f1531a = j;
            this.f1532b = xVar;
            this.f1533c = zVar;
            if (zVar != null) {
                C1130q s = zVar.mo9865s();
                int g = s.mo9748g();
                for (int i = 0; i < g; i++) {
                    String d = s.mo9746d(i);
                    String h = s.mo9749h(i);
                    if ("Date".equalsIgnoreCase(d)) {
                        this.f1534d = C1088g.m2463b(h);
                        this.f1535e = h;
                    } else if ("Expires".equalsIgnoreCase(d)) {
                        this.f1538h = C1088g.m2463b(h);
                    } else if ("Last-Modified".equalsIgnoreCase(d)) {
                        this.f1536f = C1088g.m2463b(h);
                        this.f1537g = h;
                    } else if ("ETag".equalsIgnoreCase(d)) {
                        this.f1541k = h;
                    } else if ("Age".equalsIgnoreCase(d)) {
                        this.f1542l = C1079e.m2421a(h, -1);
                    } else if (C1096k.f1610c.equalsIgnoreCase(d)) {
                        this.f1539i = Long.parseLong(h);
                    } else if (C1096k.f1611d.equalsIgnoreCase(d)) {
                        this.f1540j = Long.parseLong(h);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m2402a() {
            Date date = this.f1534d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f1540j - date.getTime());
            }
            int i = this.f1542l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f1540j;
            return j + (j2 - this.f1539i) + (this.f1531a - j2);
        }

        /* renamed from: b */
        private long m2403b() {
            C1000d l = this.f1533c.mo9858l();
            if (l.mo9416d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) l.mo9416d());
            }
            if (this.f1538h != null) {
                Date date = this.f1534d;
                long time = this.f1538h.getTime() - (date != null ? date.getTime() : this.f1540j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f1536f == null || this.f1533c.mo9872y().mo9838k().mo9759B() != null) {
                return 0;
            } else {
                Date date2 = this.f1534d;
                long time2 = (date2 != null ? date2.getTime() : this.f1539i) - this.f1536f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0108  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private p011c.p083d.p084a.p085d0.p087n.C1075c m2404d() {
            /*
                r13 = this;
                c.d.a.z r0 = r13.f1533c
                r1 = 0
                if (r0 != 0) goto L_0x000d
                c.d.a.d0.n.c r0 = new c.d.a.d0.n.c
                c.d.a.x r2 = r13.f1532b
                r0.<init>(r2, r1)
                return r0
            L_0x000d:
                c.d.a.x r0 = r13.f1532b
                boolean r0 = r0.mo9839l()
                if (r0 == 0) goto L_0x0025
                c.d.a.z r0 = r13.f1533c
                c.d.a.p r0 = r0.mo9862p()
                if (r0 != 0) goto L_0x0025
                c.d.a.d0.n.c r0 = new c.d.a.d0.n.c
                c.d.a.x r2 = r13.f1532b
                r0.<init>(r2, r1)
                return r0
            L_0x0025:
                c.d.a.z r0 = r13.f1533c
                c.d.a.x r2 = r13.f1532b
                boolean r0 = p011c.p083d.p084a.p085d0.p087n.C1075c.m2401a(r0, r2)
                if (r0 != 0) goto L_0x0037
                c.d.a.d0.n.c r0 = new c.d.a.d0.n.c
                c.d.a.x r2 = r13.f1532b
                r0.<init>(r2, r1)
                return r0
            L_0x0037:
                c.d.a.x r0 = r13.f1532b
                c.d.a.d r0 = r0.mo9834g()
                boolean r2 = r0.mo9420h()
                if (r2 != 0) goto L_0x010e
                c.d.a.x r2 = r13.f1532b
                boolean r2 = m2405e(r2)
                if (r2 == 0) goto L_0x004d
                goto L_0x010e
            L_0x004d:
                long r2 = r13.m2402a()
                long r4 = r13.m2403b()
                int r6 = r0.mo9416d()
                r7 = -1
                if (r6 == r7) goto L_0x006b
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                int r8 = r0.mo9416d()
                long r8 = (long) r8
                long r8 = r6.toMillis(r8)
                long r4 = java.lang.Math.min(r4, r8)
            L_0x006b:
                int r6 = r0.mo9418f()
                r8 = 0
                if (r6 == r7) goto L_0x007f
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                int r10 = r0.mo9418f()
                long r10 = (long) r10
                long r10 = r6.toMillis(r10)
                goto L_0x0080
            L_0x007f:
                r10 = r8
            L_0x0080:
                c.d.a.z r6 = r13.f1533c
                c.d.a.d r6 = r6.mo9858l()
                boolean r12 = r6.mo9419g()
                if (r12 != 0) goto L_0x009d
                int r12 = r0.mo9417e()
                if (r12 == r7) goto L_0x009d
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.mo9417e()
                long r8 = (long) r0
                long r8 = r7.toMillis(r8)
            L_0x009d:
                boolean r0 = r6.mo9420h()
                if (r0 != 0) goto L_0x00d6
                long r10 = r10 + r2
                long r8 = r8 + r4
                int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x00d6
                c.d.a.z r0 = r13.f1533c
                c.d.a.z$b r0 = r0.mo9870w()
                java.lang.String r6 = "Warning"
                int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r7 < 0) goto L_0x00ba
                java.lang.String r4 = "110 HttpURLConnection \"Response is stale\""
                r0.mo9873k(r6, r4)
            L_0x00ba:
                r4 = 86400000(0x5265c00, double:4.2687272E-316)
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 <= 0) goto L_0x00cc
                boolean r2 = r13.m2406f()
                if (r2 == 0) goto L_0x00cc
                java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.mo9873k(r6, r2)
            L_0x00cc:
                c.d.a.d0.n.c r2 = new c.d.a.d0.n.c
                c.d.a.z r0 = r0.mo9875m()
                r2.<init>(r1, r0)
                return r2
            L_0x00d6:
                c.d.a.x r0 = r13.f1532b
                c.d.a.x$b r0 = r0.mo9841n()
                java.lang.String r2 = r13.f1541k
                if (r2 == 0) goto L_0x00e6
                java.lang.String r3 = "If-None-Match"
            L_0x00e2:
                r0.mo9850i(r3, r2)
                goto L_0x00f6
            L_0x00e6:
                java.util.Date r2 = r13.f1536f
                java.lang.String r3 = "If-Modified-Since"
                if (r2 == 0) goto L_0x00ef
                java.lang.String r2 = r13.f1537g
                goto L_0x00e2
            L_0x00ef:
                java.util.Date r2 = r13.f1534d
                if (r2 == 0) goto L_0x00f6
                java.lang.String r2 = r13.f1535e
                goto L_0x00e2
            L_0x00f6:
                c.d.a.x r0 = r0.mo9848g()
                boolean r2 = m2405e(r0)
                if (r2 == 0) goto L_0x0108
                c.d.a.d0.n.c r2 = new c.d.a.d0.n.c
                c.d.a.z r3 = r13.f1533c
                r2.<init>(r0, r3)
                goto L_0x010d
            L_0x0108:
                c.d.a.d0.n.c r2 = new c.d.a.d0.n.c
                r2.<init>(r0, r1)
            L_0x010d:
                return r2
            L_0x010e:
                c.d.a.d0.n.c r0 = new c.d.a.d0.n.c
                c.d.a.x r2 = r13.f1532b
                r0.<init>(r2, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p087n.C1075c.C1077b.m2404d():c.d.a.d0.n.c");
        }

        /* renamed from: e */
        private static boolean m2405e(C1144x xVar) {
            return (xVar.mo9835h("If-Modified-Since") == null && xVar.mo9835h("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m2406f() {
            return this.f1533c.mo9858l().mo9416d() == -1 && this.f1538h == null;
        }

        /* renamed from: c */
        public C1075c mo9596c() {
            C1075c d = m2404d();
            return (d.f1529a == null || !this.f1532b.mo9834g().mo9422j()) ? d : new C1075c((C1144x) null, (C1150z) null);
        }
    }

    private C1075c(C1144x xVar, C1150z zVar) {
        this.f1529a = xVar;
        this.f1530b = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo9858l().mo9414b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2401a(p011c.p083d.p084a.C1150z r3, p011c.p083d.p084a.C1144x r4) {
        /*
            int r0 = r3.mo9861o()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo9863q(r0)
            if (r0 != 0) goto L_0x005a
            c.d.a.d r0 = r3.mo9858l()
            int r0 = r0.mo9416d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            c.d.a.d r0 = r3.mo9858l()
            boolean r0 = r0.mo9415c()
            if (r0 != 0) goto L_0x005a
            c.d.a.d r0 = r3.mo9858l()
            boolean r0 = r0.mo9414b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            c.d.a.d r3 = r3.mo9858l()
            boolean r3 = r3.mo9421i()
            if (r3 != 0) goto L_0x006f
            c.d.a.d r3 = r4.mo9834g()
            boolean r3 = r3.mo9421i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.p085d0.p087n.C1075c.m2401a(c.d.a.z, c.d.a.x):boolean");
    }
}
