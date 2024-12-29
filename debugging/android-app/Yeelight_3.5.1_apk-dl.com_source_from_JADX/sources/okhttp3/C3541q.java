package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.C3564c;
import okio.C9837d;
import p056k5.C3300c;

/* renamed from: okhttp3.q */
public final class C3541q extends C3505a0 {

    /* renamed from: c */
    private static final C3548v f5793c = C3548v.m9871c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f5794a;

    /* renamed from: b */
    private final List<String> f5795b;

    /* renamed from: okhttp3.q$a */
    public static final class C3542a {

        /* renamed from: a */
        private final List<String> f5796a;

        /* renamed from: b */
        private final List<String> f5797b;

        /* renamed from: c */
        private final Charset f5798c;

        public C3542a() {
            this((Charset) null);
        }

        public C3542a(Charset charset) {
            this.f5796a = new ArrayList();
            this.f5797b = new ArrayList();
            this.f5798c = charset;
        }

        /* renamed from: a */
        public C3542a mo24535a(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f5796a.add(C3546t.m9820c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f5798c));
            this.f5797b.add(C3546t.m9820c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f5798c));
            return this;
        }

        /* renamed from: b */
        public C3542a mo24536b(String str, String str2) {
            Objects.requireNonNull(str, "name == null");
            Objects.requireNonNull(str2, "value == null");
            this.f5796a.add(C3546t.m9820c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f5798c));
            this.f5797b.add(C3546t.m9820c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f5798c));
            return this;
        }

        /* renamed from: c */
        public C3541q mo24537c() {
            return new C3541q(this.f5796a, this.f5797b);
        }
    }

    C3541q(List<String> list, List<String> list2) {
        this.f5794a = C3300c.m8934s(list);
        this.f5795b = C3300c.m8934s(list2);
    }

    /* renamed from: g */
    private long m9787g(@Nullable C9837d dVar, boolean z) {
        C3564c cVar = z ? new C3564c() : dVar.mo24724F();
        int size = this.f5794a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo24736R(38);
            }
            cVar.mo24757i0(this.f5794a.get(i));
            cVar.mo24736R(61);
            cVar.mo24757i0(this.f5795b.get(i));
        }
        if (!z) {
            return 0;
        }
        long i1 = cVar.mo24758i1();
        cVar.clear();
        return i1;
    }

    /* renamed from: a */
    public long mo24351a() {
        return m9787g((C9837d) null, true);
    }

    /* renamed from: b */
    public C3548v mo24352b() {
        return f5793c;
    }

    /* renamed from: f */
    public void mo24353f(C9837d dVar) {
        m9787g(dVar, false);
    }
}
