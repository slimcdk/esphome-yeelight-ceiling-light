package p047j;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: j.b */
public final class C3254b {

    /* renamed from: a */
    private final C3258d f5243a;

    /* renamed from: j.b$a */
    public static final class C3255a {

        /* renamed from: a */
        private C3258d f5244a = null;

        C3255a() {
        }

        /* renamed from: a */
        public C3254b mo23807a() {
            return new C3254b(this.f5244a);
        }

        /* renamed from: b */
        public C3255a mo23808b(C3258d dVar) {
            this.f5244a = dVar;
            return this;
        }
    }

    static {
        new C3255a().mo23807a();
    }

    C3254b(C3258d dVar) {
        this.f5243a = dVar;
    }

    /* renamed from: b */
    public static C3255a m8726b() {
        return new C3255a();
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    /* renamed from: a */
    public C3258d mo23806a() {
        return this.f5243a;
    }
}
