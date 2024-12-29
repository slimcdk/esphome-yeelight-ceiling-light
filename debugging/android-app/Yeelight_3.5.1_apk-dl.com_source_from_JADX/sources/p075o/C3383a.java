package p075o;

import p075o.C3389e;

/* renamed from: o.a */
final class C3383a extends C3389e {

    /* renamed from: b */
    private final long f5501b;

    /* renamed from: c */
    private final int f5502c;

    /* renamed from: d */
    private final int f5503d;

    /* renamed from: e */
    private final long f5504e;

    /* renamed from: f */
    private final int f5505f;

    /* renamed from: o.a$b */
    static final class C3385b extends C3389e.C3390a {

        /* renamed from: a */
        private Long f5506a;

        /* renamed from: b */
        private Integer f5507b;

        /* renamed from: c */
        private Integer f5508c;

        /* renamed from: d */
        private Long f5509d;

        /* renamed from: e */
        private Integer f5510e;

        C3385b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3389e mo24166a() {
            String str = "";
            if (this.f5506a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f5507b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f5508c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f5509d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f5510e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3383a(this.f5506a.longValue(), this.f5507b.intValue(), this.f5508c.intValue(), this.f5509d.longValue(), this.f5510e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3389e.C3390a mo24167b(int i) {
            this.f5508c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3389e.C3390a mo24168c(long j) {
            this.f5509d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C3389e.C3390a mo24169d(int i) {
            this.f5507b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3389e.C3390a mo24170e(int i) {
            this.f5510e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3389e.C3390a mo24171f(long j) {
            this.f5506a = Long.valueOf(j);
            return this;
        }
    }

    private C3383a(long j, int i, int i2, long j2, int i3) {
        this.f5501b = j;
        this.f5502c = i;
        this.f5503d = i2;
        this.f5504e = j2;
        this.f5505f = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24158b() {
        return this.f5503d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo24159c() {
        return this.f5504e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24160d() {
        return this.f5502c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo24161e() {
        return this.f5505f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3389e)) {
            return false;
        }
        C3389e eVar = (C3389e) obj;
        return this.f5501b == eVar.mo24163f() && this.f5502c == eVar.mo24160d() && this.f5503d == eVar.mo24158b() && this.f5504e == eVar.mo24159c() && this.f5505f == eVar.mo24161e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo24163f() {
        return this.f5501b;
    }

    public int hashCode() {
        long j = this.f5501b;
        long j2 = this.f5504e;
        return this.f5505f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5502c) * 1000003) ^ this.f5503d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f5501b + ", loadBatchSize=" + this.f5502c + ", criticalSectionEnterTimeoutMs=" + this.f5503d + ", eventCleanUpAge=" + this.f5504e + ", maxBlobByteSizePerRow=" + this.f5505f + "}";
    }
}
