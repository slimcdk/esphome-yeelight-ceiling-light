package p156f.p157g0.p158e;

import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p156f.C4318a0;
import p156f.C4332c0;
import p156f.C4334d;
import p156f.C4388s;
import p156f.p157g0.C4344a;
import p156f.p157g0.p160g.C10769d;
import p156f.p157g0.p160g.C10771e;

/* renamed from: f.g0.e.c */
public final class C4348c {
    @Nullable

    /* renamed from: a */
    public final C4318a0 f7659a;
    @Nullable

    /* renamed from: b */
    public final C4332c0 f7660b;

    /* renamed from: f.g0.e.c$a */
    public static class C4349a {

        /* renamed from: a */
        final long f7661a;

        /* renamed from: b */
        final C4318a0 f7662b;

        /* renamed from: c */
        final C4332c0 f7663c;

        /* renamed from: d */
        private Date f7664d;

        /* renamed from: e */
        private String f7665e;

        /* renamed from: f */
        private Date f7666f;

        /* renamed from: g */
        private String f7667g;

        /* renamed from: h */
        private Date f7668h;

        /* renamed from: i */
        private long f7669i;

        /* renamed from: j */
        private long f7670j;

        /* renamed from: k */
        private String f7671k;

        /* renamed from: l */
        private int f7672l = -1;

        public C4349a(long j, C4318a0 a0Var, C4332c0 c0Var) {
            this.f7661a = j;
            this.f7662b = a0Var;
            this.f7663c = c0Var;
            if (c0Var != null) {
                this.f7669i = c0Var.mo23856J();
                this.f7670j = c0Var.mo23854F();
                C4388s n = c0Var.mo23864n();
                int h = n.mo24089h();
                for (int i = 0; i < h; i++) {
                    String e = n.mo24086e(i);
                    String i2 = n.mo24091i(i);
                    if ("Date".equalsIgnoreCase(e)) {
                        this.f7664d = C10769d.m26683b(i2);
                        this.f7665e = i2;
                    } else if ("Expires".equalsIgnoreCase(e)) {
                        this.f7668h = C10769d.m26683b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e)) {
                        this.f7666f = C10769d.m26683b(i2);
                        this.f7667g = i2;
                    } else if ("ETag".equalsIgnoreCase(e)) {
                        this.f7671k = i2;
                    } else if ("Age".equalsIgnoreCase(e)) {
                        this.f7672l = C10771e.m26690f(i2, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m12382a() {
            Date date = this.f7664d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f7670j - date.getTime());
            }
            int i = this.f7672l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f7670j;
            return j + (j2 - this.f7669i) + (this.f7661a - j2);
        }

        /* renamed from: b */
        private long m12383b() {
            C4334d b = this.f7663c.mo23858b();
            if (b.mo23887d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) b.mo23887d());
            }
            if (this.f7668h != null) {
                Date date = this.f7664d;
                long time = this.f7668h.getTime() - (date != null ? date.getTime() : this.f7670j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f7666f == null || this.f7663c.mo23855I().mo23815i().mo24101A() != null) {
                return 0;
            } else {
                Date date2 = this.f7664d;
                long time2 = (date2 != null ? date2.getTime() : this.f7669i) - this.f7666f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private C4348c m12384d() {
            if (this.f7663c == null) {
                return new C4348c(this.f7662b, (C4332c0) null);
            }
            if (this.f7662b.mo23812f() && this.f7663c.mo23861h() == null) {
                return new C4348c(this.f7662b, (C4332c0) null);
            }
            if (!C4348c.m12381a(this.f7663c, this.f7662b)) {
                return new C4348c(this.f7662b, (C4332c0) null);
            }
            C4334d b = this.f7662b.mo23808b();
            if (b.mo23891h() || m12385e(this.f7662b)) {
                return new C4348c(this.f7662b, (C4332c0) null);
            }
            C4334d b2 = this.f7663c.mo23858b();
            long a = m12382a();
            long b3 = m12383b();
            if (b.mo23887d() != -1) {
                b3 = Math.min(b3, TimeUnit.SECONDS.toMillis((long) b.mo23887d()));
            }
            long j = 0;
            long millis = b.mo23889f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo23889f()) : 0;
            if (!b2.mo23890g() && b.mo23888e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo23888e());
            }
            if (!b2.mo23891h()) {
                long j2 = millis + a;
                if (j2 < j + b3) {
                    C4332c0.C4333a u = this.f7663c.mo23869u();
                    if (j2 >= b3) {
                        u.mo23870a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > MiStatInterface.MAX_UPLOAD_INTERVAL && m12386f()) {
                        u.mo23870a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C4348c((C4318a0) null, u.mo23872c());
                }
            }
            String str = this.f7671k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f7666f != null) {
                str = this.f7667g;
            } else if (this.f7664d == null) {
                return new C4348c(this.f7662b, (C4332c0) null);
            } else {
                str = this.f7665e;
            }
            C4388s.C4389a f = this.f7662b.mo23811e().mo24088f();
            C4344a.f7639a.mo23926b(f, str2, str);
            C4318a0.C4319a h = this.f7662b.mo23814h();
            h.mo23821e(f.mo24097d());
            return new C4348c(h.mo23818b(), this.f7663c);
        }

        /* renamed from: e */
        private static boolean m12385e(C4318a0 a0Var) {
            return (a0Var.mo23809c("If-Modified-Since") == null && a0Var.mo23809c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m12386f() {
            return this.f7663c.mo23858b().mo23887d() == -1 && this.f7668h == null;
        }

        /* renamed from: c */
        public C4348c mo23939c() {
            C4348c d = m12384d();
            return (d.f7659a == null || !this.f7662b.mo23808b().mo23893j()) ? d : new C4348c((C4318a0) null, (C4332c0) null);
        }
    }

    C4348c(C4318a0 a0Var, C4332c0 c0Var) {
        this.f7659a = a0Var;
        this.f7660b = c0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo23858b().mo23885b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12381a(p156f.C4332c0 r3, p156f.C4318a0 r4) {
        /*
            int r0 = r3.mo23860g()
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
            java.lang.String r0 = r3.mo23862i(r0)
            if (r0 != 0) goto L_0x005a
            f.d r0 = r3.mo23858b()
            int r0 = r0.mo23887d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            f.d r0 = r3.mo23858b()
            boolean r0 = r0.mo23886c()
            if (r0 != 0) goto L_0x005a
            f.d r0 = r3.mo23858b()
            boolean r0 = r0.mo23885b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            f.d r3 = r3.mo23858b()
            boolean r3 = r3.mo23892i()
            if (r3 != 0) goto L_0x006f
            f.d r3 = r4.mo23808b()
            boolean r3 = r3.mo23892i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.p157g0.p158e.C4348c.m12381a(f.c0, f.a0):boolean");
    }
}
