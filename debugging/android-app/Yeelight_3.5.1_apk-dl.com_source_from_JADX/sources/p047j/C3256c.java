package p047j;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j.c */
public final class C3256c {

    /* renamed from: a */
    private final String f5245a;

    /* renamed from: b */
    private final List<LogEventDropped> f5246b;

    /* renamed from: j.c$a */
    public static final class C3257a {

        /* renamed from: a */
        private String f5247a = "";

        /* renamed from: b */
        private List<LogEventDropped> f5248b = new ArrayList();

        C3257a() {
        }

        /* renamed from: a */
        public C3256c mo23811a() {
            return new C3256c(this.f5247a, Collections.unmodifiableList(this.f5248b));
        }

        /* renamed from: b */
        public C3257a mo23812b(List<LogEventDropped> list) {
            this.f5248b = list;
            return this;
        }

        /* renamed from: c */
        public C3257a mo23813c(String str) {
            this.f5247a = str;
            return this;
        }
    }

    static {
        new C3257a().mo23811a();
    }

    C3256c(String str, List<LogEventDropped> list) {
        this.f5245a = str;
        this.f5246b = list;
    }

    /* renamed from: c */
    public static C3257a m8730c() {
        return new C3257a();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    /* renamed from: a */
    public List<LogEventDropped> mo23809a() {
        return this.f5246b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public String mo23810b() {
        return this.f5245a;
    }
}
