package p047j;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: j.d */
public final class C3258d {

    /* renamed from: a */
    private final long f5249a;

    /* renamed from: b */
    private final long f5250b;

    /* renamed from: j.d$a */
    public static final class C3259a {

        /* renamed from: a */
        private long f5251a = 0;

        /* renamed from: b */
        private long f5252b = 0;

        C3259a() {
        }

        /* renamed from: a */
        public C3258d mo23816a() {
            return new C3258d(this.f5251a, this.f5252b);
        }

        /* renamed from: b */
        public C3259a mo23817b(long j) {
            this.f5251a = j;
            return this;
        }

        /* renamed from: c */
        public C3259a mo23818c(long j) {
            this.f5252b = j;
            return this;
        }
    }

    static {
        new C3259a().mo23816a();
    }

    C3258d(long j, long j2) {
        this.f5249a = j;
        this.f5250b = j2;
    }

    /* renamed from: c */
    public static C3259a m8736c() {
        return new C3259a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo23814a() {
        return this.f5249a;
    }

    @Protobuf(tag = 2)
    /* renamed from: b */
    public long mo23815b() {
        return this.f5250b;
    }
}
