package p063l5;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.C3509b0;
import okhttp3.C3520d;
import okhttp3.C3544s;
import okhttp3.C3558z;
import p056k5.C3299a;
import p073n5.C9730d;
import p073n5.C9732e;

/* renamed from: l5.c */
public final class C3317c {
    @Nullable

    /* renamed from: a */
    public final C3558z f5362a;
    @Nullable

    /* renamed from: b */
    public final C3509b0 f5363b;

    /* renamed from: l5.c$a */
    public static class C3318a {

        /* renamed from: a */
        final long f5364a;

        /* renamed from: b */
        final C3558z f5365b;

        /* renamed from: c */
        final C3509b0 f5366c;

        /* renamed from: d */
        private Date f5367d;

        /* renamed from: e */
        private String f5368e;

        /* renamed from: f */
        private Date f5369f;

        /* renamed from: g */
        private String f5370g;

        /* renamed from: h */
        private Date f5371h;

        /* renamed from: i */
        private long f5372i;

        /* renamed from: j */
        private long f5373j;

        /* renamed from: k */
        private String f5374k;

        /* renamed from: l */
        private int f5375l = -1;

        public C3318a(long j, C3558z zVar, C3509b0 b0Var) {
            this.f5364a = j;
            this.f5365b = zVar;
            this.f5366c = b0Var;
            if (b0Var != null) {
                this.f5372i = b0Var.mo24355A();
                this.f5373j = b0Var.mo24371v();
                C3544s k = b0Var.mo24363k();
                int h = k.mo24548h();
                for (int i = 0; i < h; i++) {
                    String e = k.mo24545e(i);
                    String i2 = k.mo24550i(i);
                    if ("Date".equalsIgnoreCase(e)) {
                        this.f5367d = C9730d.m23353b(i2);
                        this.f5368e = i2;
                    } else if ("Expires".equalsIgnoreCase(e)) {
                        this.f5371h = C9730d.m23353b(i2);
                    } else if ("Last-Modified".equalsIgnoreCase(e)) {
                        this.f5369f = C9730d.m23353b(i2);
                        this.f5370g = i2;
                    } else if ("ETag".equalsIgnoreCase(e)) {
                        this.f5374k = i2;
                    } else if ("Age".equalsIgnoreCase(e)) {
                        this.f5375l = C9732e.m23360f(i2, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m9019a() {
            Date date = this.f5367d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f5373j - date.getTime());
            }
            int i = this.f5375l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f5373j;
            return j + (j2 - this.f5372i) + (this.f5364a - j2);
        }

        /* renamed from: b */
        private long m9020b() {
            C3520d c = this.f5366c.mo24357c();
            if (c.mo24414d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) c.mo24414d());
            }
            if (this.f5371h != null) {
                Date date = this.f5367d;
                long time = this.f5371h.getTime() - (date != null ? date.getTime() : this.f5373j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f5369f == null || this.f5366c.mo24372z().mo24660i().mo24560A() != null) {
                return 0;
            } else {
                Date date2 = this.f5367d;
                long time2 = (date2 != null ? date2.getTime() : this.f5372i) - this.f5369f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private C3317c m9021d() {
            if (this.f5366c == null) {
                return new C3317c(this.f5365b, (C3509b0) null);
            }
            if (this.f5365b.mo24657f() && this.f5366c.mo24360f() == null) {
                return new C3317c(this.f5365b, (C3509b0) null);
            }
            if (!C3317c.m9018a(this.f5366c, this.f5365b)) {
                return new C3317c(this.f5365b, (C3509b0) null);
            }
            C3520d b = this.f5365b.mo24653b();
            if (b.mo24418h() || m9022e(this.f5365b)) {
                return new C3317c(this.f5365b, (C3509b0) null);
            }
            C3520d c = this.f5366c.mo24357c();
            long a = m9019a();
            long b2 = m9020b();
            if (b.mo24414d() != -1) {
                b2 = Math.min(b2, TimeUnit.SECONDS.toMillis((long) b.mo24414d()));
            }
            long j = 0;
            long millis = b.mo24416f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo24416f()) : 0;
            if (!c.mo24417g() && b.mo24415e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo24415e());
            }
            if (!c.mo24418h()) {
                long j2 = millis + a;
                if (j2 < j + b2) {
                    C3509b0.C3510a p = this.f5366c.mo24367p();
                    if (j2 >= b2) {
                        p.mo24373a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m9023f()) {
                        p.mo24373a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C3317c((C3558z) null, p.mo24375c());
                }
            }
            String str = this.f5374k;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = "If-None-Match";
            } else if (this.f5369f != null) {
                str = this.f5370g;
            } else if (this.f5367d == null) {
                return new C3317c(this.f5365b, (C3509b0) null);
            } else {
                str = this.f5368e;
            }
            C3544s.C3545a f = this.f5365b.mo24656e().mo24547f();
            C3299a.f5331a.mo23925b(f, str2, str);
            return new C3317c(this.f5365b.mo24659h().mo24665d(f.mo24556d()).mo24663b(), this.f5366c);
        }

        /* renamed from: e */
        private static boolean m9022e(C3558z zVar) {
            return (zVar.mo24654c("If-Modified-Since") == null && zVar.mo24654c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m9023f() {
            return this.f5366c.mo24357c().mo24414d() == -1 && this.f5371h == null;
        }

        /* renamed from: c */
        public C3317c mo24035c() {
            C3317c d = m9021d();
            return (d.f5362a == null || !this.f5365b.mo24653b().mo24420j()) ? d : new C3317c((C3558z) null, (C3509b0) null);
        }
    }

    C3317c(C3558z zVar, C3509b0 b0Var) {
        this.f5362a = zVar;
        this.f5363b = b0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo24357c().mo24412b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9018a(okhttp3.C3509b0 r3, okhttp3.C3558z r4) {
        /*
            int r0 = r3.mo24359d()
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
            java.lang.String r0 = r3.mo24361h(r0)
            if (r0 != 0) goto L_0x005a
            okhttp3.d r0 = r3.mo24357c()
            int r0 = r0.mo24414d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            okhttp3.d r0 = r3.mo24357c()
            boolean r0 = r0.mo24413c()
            if (r0 != 0) goto L_0x005a
            okhttp3.d r0 = r3.mo24357c()
            boolean r0 = r0.mo24412b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            okhttp3.d r3 = r3.mo24357c()
            boolean r3 = r3.mo24419i()
            if (r3 != 0) goto L_0x006f
            okhttp3.d r3 = r4.mo24653b()
            boolean r3 = r3.mo24419i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p063l5.C3317c.m9018a(okhttp3.b0, okhttp3.z):boolean");
    }
}
