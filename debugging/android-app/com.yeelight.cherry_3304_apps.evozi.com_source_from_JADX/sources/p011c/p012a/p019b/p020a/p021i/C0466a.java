package p011c.p012a.p019b.p020a.p021i;

import androidx.annotation.Nullable;
import java.util.Map;
import p011c.p012a.p019b.p020a.p021i.C0481h;

/* renamed from: c.a.b.a.i.a */
final class C0466a extends C0481h {

    /* renamed from: a */
    private final String f55a;

    /* renamed from: b */
    private final Integer f56b;

    /* renamed from: c */
    private final C0480g f57c;

    /* renamed from: d */
    private final long f58d;

    /* renamed from: e */
    private final long f59e;

    /* renamed from: f */
    private final Map<String, String> f60f;

    /* renamed from: c.a.b.a.i.a$b */
    static final class C0468b extends C0481h.C0482a {

        /* renamed from: a */
        private String f61a;

        /* renamed from: b */
        private Integer f62b;

        /* renamed from: c */
        private C0480g f63c;

        /* renamed from: d */
        private Long f64d;

        /* renamed from: e */
        private Long f65e;

        /* renamed from: f */
        private Map<String, String> f66f;

        C0468b() {
        }

        /* renamed from: d */
        public C0481h mo8414d() {
            String str = "";
            if (this.f61a == null) {
                str = str + " transportName";
            }
            if (this.f63c == null) {
                str = str + " encodedPayload";
            }
            if (this.f64d == null) {
                str = str + " eventMillis";
            }
            if (this.f65e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f66f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C0466a(this.f61a, this.f62b, this.f63c, this.f64d.longValue(), this.f65e.longValue(), this.f66f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo8415e() {
            Map<String, String> map = this.f66f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C0481h.C0482a mo8416f(Map<String, String> map) {
            if (map != null) {
                this.f66f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: g */
        public C0481h.C0482a mo8417g(Integer num) {
            this.f62b = num;
            return this;
        }

        /* renamed from: h */
        public C0481h.C0482a mo8418h(C0480g gVar) {
            if (gVar != null) {
                this.f63c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: i */
        public C0481h.C0482a mo8419i(long j) {
            this.f64d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C0481h.C0482a mo8420j(String str) {
            if (str != null) {
                this.f61a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: k */
        public C0481h.C0482a mo8421k(long j) {
            this.f65e = Long.valueOf(j);
            return this;
        }
    }

    private C0466a(String str, @Nullable Integer num, C0480g gVar, long j, long j2, Map<String, String> map) {
        this.f55a = str;
        this.f56b = num;
        this.f57c = gVar;
        this.f58d = j;
        this.f59e = j2;
        this.f60f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo8405c() {
        return this.f60f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo8406d() {
        return this.f56b;
    }

    /* renamed from: e */
    public C0480g mo8407e() {
        return this.f57c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f56b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p011c.p012a.p019b.p020a.p021i.C0481h
            r2 = 0
            if (r1 == 0) goto L_0x005b
            c.a.b.a.i.h r8 = (p011c.p012a.p019b.p020a.p021i.C0481h) r8
            java.lang.String r1 = r7.f55a
            java.lang.String r3 = r8.mo8411j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f56b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo8406d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo8406d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            c.a.b.a.i.g r1 = r7.f57c
            c.a.b.a.i.g r3 = r8.mo8407e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f58d
            long r5 = r8.mo8409f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f59e
            long r5 = r8.mo8412k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f60f
            java.util.Map r8 = r8.mo8405c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p019b.p020a.p021i.C0466a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public long mo8409f() {
        return this.f58d;
    }

    public int hashCode() {
        int hashCode = (this.f55a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f56b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f58d;
        long j2 = this.f59e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f57c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f60f.hashCode();
    }

    /* renamed from: j */
    public String mo8411j() {
        return this.f55a;
    }

    /* renamed from: k */
    public long mo8412k() {
        return this.f59e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f55a + ", code=" + this.f56b + ", encodedPayload=" + this.f57c + ", eventMillis=" + this.f58d + ", uptimeMillis=" + this.f59e + ", autoMetadata=" + this.f60f + "}";
    }
}
