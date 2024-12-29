package p123a3;

import com.squareup.okhttp.C4277d;
import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: a3.c */
public final class C3934c {

    /* renamed from: a */
    public final C4312v f6586a;

    /* renamed from: b */
    public final C4318x f6587b;

    /* renamed from: a3.c$b */
    public static class C3936b {

        /* renamed from: a */
        final long f6588a;

        /* renamed from: b */
        final C4312v f6589b;

        /* renamed from: c */
        final C4318x f6590c;

        /* renamed from: d */
        private Date f6591d;

        /* renamed from: e */
        private String f6592e;

        /* renamed from: f */
        private Date f6593f;

        /* renamed from: g */
        private String f6594g;

        /* renamed from: h */
        private Date f6595h;

        /* renamed from: i */
        private long f6596i;

        /* renamed from: j */
        private long f6597j;

        /* renamed from: k */
        private String f6598k;

        /* renamed from: l */
        private int f6599l = -1;

        public C3936b(long j, C4312v vVar, C4318x xVar) {
            this.f6588a = j;
            this.f6589b = vVar;
            this.f6590c = xVar;
            if (xVar != null) {
                C4299p s = xVar.mo28064s();
                int g = s.mo27935g();
                for (int i = 0; i < g; i++) {
                    String d = s.mo27933d(i);
                    String h = s.mo27936h(i);
                    if ("Date".equalsIgnoreCase(d)) {
                        this.f6591d = C3947g.m11321b(h);
                        this.f6592e = h;
                    } else if ("Expires".equalsIgnoreCase(d)) {
                        this.f6595h = C3947g.m11321b(h);
                    } else if ("Last-Modified".equalsIgnoreCase(d)) {
                        this.f6593f = C3947g.m11321b(h);
                        this.f6594g = h;
                    } else if ("ETag".equalsIgnoreCase(d)) {
                        this.f6598k = h;
                    } else if ("Age".equalsIgnoreCase(d)) {
                        this.f6599l = C3938e.m11279a(h, -1);
                    } else if (C3955k.f6667c.equalsIgnoreCase(d)) {
                        this.f6596i = Long.parseLong(h);
                    } else if (C3955k.f6668d.equalsIgnoreCase(d)) {
                        this.f6597j = Long.parseLong(h);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m11260a() {
            Date date = this.f6591d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f6597j - date.getTime());
            }
            int i = this.f6599l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f6597j;
            return j + (j2 - this.f6596i) + (this.f6588a - j2);
        }

        /* renamed from: b */
        private long m11261b() {
            C4277d l = this.f6590c.mo28057l();
            if (l.mo27837d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) l.mo27837d());
            }
            if (this.f6595h != null) {
                Date date = this.f6591d;
                long time = this.f6595h.getTime() - (date != null ? date.getTime() : this.f6597j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f6593f == null || this.f6590c.mo28071y().mo28037k().mo27946B() != null) {
                return 0;
            } else {
                Date date2 = this.f6591d;
                long time2 = (date2 != null ? date2.getTime() : this.f6596i) - this.f6593f.getTime();
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
        private p123a3.C3934c m11262d() {
            /*
                r13 = this;
                com.squareup.okhttp.x r0 = r13.f6590c
                r1 = 0
                if (r0 != 0) goto L_0x000d
                a3.c r0 = new a3.c
                com.squareup.okhttp.v r2 = r13.f6589b
                r0.<init>(r2, r1)
                return r0
            L_0x000d:
                com.squareup.okhttp.v r0 = r13.f6589b
                boolean r0 = r0.mo28038l()
                if (r0 == 0) goto L_0x0025
                com.squareup.okhttp.x r0 = r13.f6590c
                com.squareup.okhttp.o r0 = r0.mo28061p()
                if (r0 != 0) goto L_0x0025
                a3.c r0 = new a3.c
                com.squareup.okhttp.v r2 = r13.f6589b
                r0.<init>(r2, r1)
                return r0
            L_0x0025:
                com.squareup.okhttp.x r0 = r13.f6590c
                com.squareup.okhttp.v r2 = r13.f6589b
                boolean r0 = p123a3.C3934c.m11259a(r0, r2)
                if (r0 != 0) goto L_0x0037
                a3.c r0 = new a3.c
                com.squareup.okhttp.v r2 = r13.f6589b
                r0.<init>(r2, r1)
                return r0
            L_0x0037:
                com.squareup.okhttp.v r0 = r13.f6589b
                com.squareup.okhttp.d r0 = r0.mo28033g()
                boolean r2 = r0.mo27841h()
                if (r2 != 0) goto L_0x010e
                com.squareup.okhttp.v r2 = r13.f6589b
                boolean r2 = m11263e(r2)
                if (r2 == 0) goto L_0x004d
                goto L_0x010e
            L_0x004d:
                long r2 = r13.m11260a()
                long r4 = r13.m11261b()
                int r6 = r0.mo27837d()
                r7 = -1
                if (r6 == r7) goto L_0x006b
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                int r8 = r0.mo27837d()
                long r8 = (long) r8
                long r8 = r6.toMillis(r8)
                long r4 = java.lang.Math.min(r4, r8)
            L_0x006b:
                int r6 = r0.mo27839f()
                r8 = 0
                if (r6 == r7) goto L_0x007f
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
                int r10 = r0.mo27839f()
                long r10 = (long) r10
                long r10 = r6.toMillis(r10)
                goto L_0x0080
            L_0x007f:
                r10 = r8
            L_0x0080:
                com.squareup.okhttp.x r6 = r13.f6590c
                com.squareup.okhttp.d r6 = r6.mo28057l()
                boolean r12 = r6.mo27840g()
                if (r12 != 0) goto L_0x009d
                int r12 = r0.mo27838e()
                if (r12 == r7) goto L_0x009d
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
                int r0 = r0.mo27838e()
                long r8 = (long) r0
                long r8 = r7.toMillis(r8)
            L_0x009d:
                boolean r0 = r6.mo27841h()
                if (r0 != 0) goto L_0x00d6
                long r10 = r10 + r2
                long r8 = r8 + r4
                int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x00d6
                com.squareup.okhttp.x r0 = r13.f6590c
                com.squareup.okhttp.x$b r0 = r0.mo28069w()
                java.lang.String r6 = "Warning"
                int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
                if (r7 < 0) goto L_0x00ba
                java.lang.String r4 = "110 HttpURLConnection \"Response is stale\""
                r0.mo28072k(r6, r4)
            L_0x00ba:
                r4 = 86400000(0x5265c00, double:4.2687272E-316)
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 <= 0) goto L_0x00cc
                boolean r2 = r13.m11264f()
                if (r2 == 0) goto L_0x00cc
                java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
                r0.mo28072k(r6, r2)
            L_0x00cc:
                a3.c r2 = new a3.c
                com.squareup.okhttp.x r0 = r0.mo28074m()
                r2.<init>(r1, r0)
                return r2
            L_0x00d6:
                com.squareup.okhttp.v r0 = r13.f6589b
                com.squareup.okhttp.v$b r0 = r0.mo28040n()
                java.lang.String r2 = r13.f6598k
                if (r2 == 0) goto L_0x00e6
                java.lang.String r3 = "If-None-Match"
            L_0x00e2:
                r0.mo28049i(r3, r2)
                goto L_0x00f6
            L_0x00e6:
                java.util.Date r2 = r13.f6593f
                java.lang.String r3 = "If-Modified-Since"
                if (r2 == 0) goto L_0x00ef
                java.lang.String r2 = r13.f6594g
                goto L_0x00e2
            L_0x00ef:
                java.util.Date r2 = r13.f6591d
                if (r2 == 0) goto L_0x00f6
                java.lang.String r2 = r13.f6592e
                goto L_0x00e2
            L_0x00f6:
                com.squareup.okhttp.v r0 = r0.mo28047g()
                boolean r2 = m11263e(r0)
                if (r2 == 0) goto L_0x0108
                a3.c r2 = new a3.c
                com.squareup.okhttp.x r3 = r13.f6590c
                r2.<init>(r0, r3)
                goto L_0x010d
            L_0x0108:
                a3.c r2 = new a3.c
                r2.<init>(r0, r1)
            L_0x010d:
                return r2
            L_0x010e:
                a3.c r0 = new a3.c
                com.squareup.okhttp.v r2 = r13.f6589b
                r0.<init>(r2, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p123a3.C3934c.C3936b.m11262d():a3.c");
        }

        /* renamed from: e */
        private static boolean m11263e(C4312v vVar) {
            return (vVar.mo28034h("If-Modified-Since") == null && vVar.mo28034h("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m11264f() {
            return this.f6590c.mo28057l().mo27837d() == -1 && this.f6595h == null;
        }

        /* renamed from: c */
        public C3934c mo26432c() {
            C3934c d = m11262d();
            return (d.f6586a == null || !this.f6589b.mo28033g().mo27843j()) ? d : new C3934c((C4312v) null, (C4318x) null);
        }
    }

    private C3934c(C4312v vVar, C4318x xVar) {
        this.f6586a = vVar;
        this.f6587b = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo28057l().mo27835b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11259a(com.squareup.okhttp.C4318x r3, com.squareup.okhttp.C4312v r4) {
        /*
            int r0 = r3.mo28060o()
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
            java.lang.String r0 = r3.mo28062q(r0)
            if (r0 != 0) goto L_0x005a
            com.squareup.okhttp.d r0 = r3.mo28057l()
            int r0 = r0.mo27837d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            com.squareup.okhttp.d r0 = r3.mo28057l()
            boolean r0 = r0.mo27836c()
            if (r0 != 0) goto L_0x005a
            com.squareup.okhttp.d r0 = r3.mo28057l()
            boolean r0 = r0.mo27835b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            com.squareup.okhttp.d r3 = r3.mo28057l()
            boolean r3 = r3.mo27842i()
            if (r3 != 0) goto L_0x006f
            com.squareup.okhttp.d r3 = r4.mo28033g()
            boolean r3 = r3.mo27842i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p123a3.C3934c.m11259a(com.squareup.okhttp.x, com.squareup.okhttp.v):boolean");
    }
}
