package p047j;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p035g.C3193l;

/* renamed from: j.a */
public final class C3252a {

    /* renamed from: a */
    private final C3260e f5235a;

    /* renamed from: b */
    private final List<C3256c> f5236b;

    /* renamed from: c */
    private final C3254b f5237c;

    /* renamed from: d */
    private final String f5238d;

    /* renamed from: j.a$a */
    public static final class C3253a {

        /* renamed from: a */
        private C3260e f5239a = null;

        /* renamed from: b */
        private List<C3256c> f5240b = new ArrayList();

        /* renamed from: c */
        private C3254b f5241c = null;

        /* renamed from: d */
        private String f5242d = "";

        C3253a() {
        }

        /* renamed from: a */
        public C3253a mo23801a(C3256c cVar) {
            this.f5240b.add(cVar);
            return this;
        }

        /* renamed from: b */
        public C3252a mo23802b() {
            return new C3252a(this.f5239a, Collections.unmodifiableList(this.f5240b), this.f5241c, this.f5242d);
        }

        /* renamed from: c */
        public C3253a mo23803c(String str) {
            this.f5242d = str;
            return this;
        }

        /* renamed from: d */
        public C3253a mo23804d(C3254b bVar) {
            this.f5241c = bVar;
            return this;
        }

        /* renamed from: e */
        public C3253a mo23805e(C3260e eVar) {
            this.f5239a = eVar;
            return this;
        }
    }

    static {
        new C3253a().mo23802b();
    }

    C3252a(C3260e eVar, List<C3256c> list, C3254b bVar, String str) {
        this.f5235a = eVar;
        this.f5236b = list;
        this.f5237c = bVar;
        this.f5238d = str;
    }

    /* renamed from: e */
    public static C3253a m8715e() {
        return new C3253a();
    }

    @Protobuf(tag = 4)
    /* renamed from: a */
    public String mo23796a() {
        return this.f5238d;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    /* renamed from: b */
    public C3254b mo23797b() {
        return this.f5237c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    /* renamed from: c */
    public List<C3256c> mo23798c() {
        return this.f5236b;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    /* renamed from: d */
    public C3260e mo23799d() {
        return this.f5235a;
    }

    /* renamed from: f */
    public byte[] mo23800f() {
        return C3193l.m8594a(this);
    }
}
