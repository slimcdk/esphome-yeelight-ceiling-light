package p035g;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import p035g.C3188i;

/* renamed from: g.b */
final class C3173b extends C3188i {

    /* renamed from: a */
    private final String f5111a;

    /* renamed from: b */
    private final Integer f5112b;

    /* renamed from: c */
    private final C3187h f5113c;

    /* renamed from: d */
    private final long f5114d;

    /* renamed from: e */
    private final long f5115e;

    /* renamed from: f */
    private final Map<String, String> f5116f;

    /* renamed from: g.b$b */
    static final class C3175b extends C3188i.C3189a {

        /* renamed from: a */
        private String f5117a;

        /* renamed from: b */
        private Integer f5118b;

        /* renamed from: c */
        private C3187h f5119c;

        /* renamed from: d */
        private Long f5120d;

        /* renamed from: e */
        private Long f5121e;

        /* renamed from: f */
        private Map<String, String> f5122f;

        C3175b() {
        }

        /* renamed from: d */
        public C3188i mo23709d() {
            String str = "";
            if (this.f5117a == null) {
                str = str + " transportName";
            }
            if (this.f5119c == null) {
                str = str + " encodedPayload";
            }
            if (this.f5120d == null) {
                str = str + " eventMillis";
            }
            if (this.f5121e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f5122f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C3173b(this.f5117a, this.f5118b, this.f5119c, this.f5120d.longValue(), this.f5121e.longValue(), this.f5122f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Map<String, String> mo23710e() {
            Map<String, String> map = this.f5122f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public C3188i.C3189a mo23711f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f5122f = map;
            return this;
        }

        /* renamed from: g */
        public C3188i.C3189a mo23712g(Integer num) {
            this.f5118b = num;
            return this;
        }

        /* renamed from: h */
        public C3188i.C3189a mo23713h(C3187h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f5119c = hVar;
            return this;
        }

        /* renamed from: i */
        public C3188i.C3189a mo23714i(long j) {
            this.f5120d = Long.valueOf(j);
            return this;
        }

        /* renamed from: j */
        public C3188i.C3189a mo23715j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f5117a = str;
            return this;
        }

        /* renamed from: k */
        public C3188i.C3189a mo23716k(long j) {
            this.f5121e = Long.valueOf(j);
            return this;
        }
    }

    private C3173b(String str, @Nullable Integer num, C3187h hVar, long j, long j2, Map<String, String> map) {
        this.f5111a = str;
        this.f5112b = num;
        this.f5113c = hVar;
        this.f5114d = j;
        this.f5115e = j2;
        this.f5116f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo23700c() {
        return this.f5116f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo23701d() {
        return this.f5112b;
    }

    /* renamed from: e */
    public C3187h mo23702e() {
        return this.f5113c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f5112b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p035g.C3188i
            r2 = 0
            if (r1 == 0) goto L_0x005b
            g.i r8 = (p035g.C3188i) r8
            java.lang.String r1 = r7.f5111a
            java.lang.String r3 = r8.mo23706j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f5112b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo23701d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo23701d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            g.h r1 = r7.f5113c
            g.h r3 = r8.mo23702e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f5114d
            long r5 = r8.mo23704f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f5115e
            long r5 = r8.mo23707k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f5116f
            java.util.Map r8 = r8.mo23700c()
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
        throw new UnsupportedOperationException("Method not decompiled: p035g.C3173b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public long mo23704f() {
        return this.f5114d;
    }

    public int hashCode() {
        int hashCode = (this.f5111a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5112b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f5114d;
        long j2 = this.f5115e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f5113c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f5116f.hashCode();
    }

    /* renamed from: j */
    public String mo23706j() {
        return this.f5111a;
    }

    /* renamed from: k */
    public long mo23707k() {
        return this.f5115e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f5111a + ", code=" + this.f5112b + ", encodedPayload=" + this.f5113c + ", eventMillis=" + this.f5114d + ", uptimeMillis=" + this.f5115e + ", autoMetadata=" + this.f5116f + "}";
    }
}
