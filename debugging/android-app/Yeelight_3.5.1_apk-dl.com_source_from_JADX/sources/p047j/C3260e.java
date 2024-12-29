package p047j;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: j.e */
public final class C3260e {

    /* renamed from: a */
    private final long f5253a;

    /* renamed from: b */
    private final long f5254b;

    /* renamed from: j.e$a */
    public static final class C3261a {

        /* renamed from: a */
        private long f5255a = 0;

        /* renamed from: b */
        private long f5256b = 0;

        C3261a() {
        }

        /* renamed from: a */
        public C3260e mo23821a() {
            return new C3260e(this.f5255a, this.f5256b);
        }

        /* renamed from: b */
        public C3261a mo23822b(long j) {
            this.f5256b = j;
            return this;
        }

        /* renamed from: c */
        public C3261a mo23823c(long j) {
            this.f5255a = j;
            return this;
        }
    }

    static {
        new C3261a().mo23821a();
    }

    C3260e(long j, long j2) {
        this.f5253a = j;
        this.f5254b = j2;
    }

    /* renamed from: c */
    public static C3261a m8742c() {
        return new C3261a();
    }

    @Protobuf(tag = 2)
    /* renamed from: a */
    public long mo23819a() {
        return this.f5254b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public long mo23820b() {
        return this.f5253a;
    }
}
