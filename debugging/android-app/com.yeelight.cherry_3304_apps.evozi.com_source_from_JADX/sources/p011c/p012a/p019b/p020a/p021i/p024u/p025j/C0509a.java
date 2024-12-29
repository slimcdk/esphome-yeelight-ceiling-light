package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0521d;

/* renamed from: c.a.b.a.i.u.j.a */
final class C0509a extends C0521d {

    /* renamed from: b */
    private final long f140b;

    /* renamed from: c */
    private final int f141c;

    /* renamed from: d */
    private final int f142d;

    /* renamed from: e */
    private final long f143e;

    /* renamed from: f */
    private final int f144f;

    /* renamed from: c.a.b.a.i.u.j.a$b */
    static final class C0511b extends C0521d.C0522a {

        /* renamed from: a */
        private Long f145a;

        /* renamed from: b */
        private Integer f146b;

        /* renamed from: c */
        private Integer f147c;

        /* renamed from: d */
        private Long f148d;

        /* renamed from: e */
        private Integer f149e;

        C0511b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0521d mo8492a() {
            String str = "";
            if (this.f145a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f146b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f147c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f148d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f149e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0509a(this.f145a.longValue(), this.f146b.intValue(), this.f147c.intValue(), this.f148d.longValue(), this.f149e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0521d.C0522a mo8493b(int i) {
            this.f147c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0521d.C0522a mo8494c(long j) {
            this.f148d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0521d.C0522a mo8495d(int i) {
            this.f146b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0521d.C0522a mo8496e(int i) {
            this.f149e = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0521d.C0522a mo8497f(long j) {
            this.f145a = Long.valueOf(j);
            return this;
        }
    }

    private C0509a(long j, int i, int i2, long j2, int i3) {
        this.f140b = j;
        this.f141c = i;
        this.f142d = i2;
        this.f143e = j2;
        this.f144f = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8484b() {
        return this.f142d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo8485c() {
        return this.f143e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8486d() {
        return this.f141c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8487e() {
        return this.f144f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0521d)) {
            return false;
        }
        C0521d dVar = (C0521d) obj;
        return this.f140b == dVar.mo8489f() && this.f141c == dVar.mo8486d() && this.f142d == dVar.mo8484b() && this.f143e == dVar.mo8485c() && this.f144f == dVar.mo8487e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo8489f() {
        return this.f140b;
    }

    public int hashCode() {
        long j = this.f140b;
        long j2 = this.f143e;
        return this.f144f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f141c) * 1000003) ^ this.f142d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f140b + ", loadBatchSize=" + this.f141c + ", criticalSectionEnterTimeoutMs=" + this.f142d + ", eventCleanUpAge=" + this.f143e + ", maxBlobByteSizePerRow=" + this.f144f + "}";
    }
}
