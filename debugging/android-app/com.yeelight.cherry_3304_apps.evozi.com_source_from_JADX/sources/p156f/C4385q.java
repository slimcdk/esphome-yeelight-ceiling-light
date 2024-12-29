package p156f;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p156f.p157g0.C4345c;
import p163g.C4406c;
import p163g.C4409d;

/* renamed from: f.q */
public final class C4385q extends C4322b0 {

    /* renamed from: c */
    private static final C4392v f7820c = C4392v.m12670c("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f7821a;

    /* renamed from: b */
    private final List<String> f7822b;

    /* renamed from: f.q$a */
    public static final class C4386a {

        /* renamed from: a */
        private final List<String> f7823a;

        /* renamed from: b */
        private final List<String> f7824b;

        /* renamed from: c */
        private final Charset f7825c;

        public C4386a() {
            this((Charset) null);
        }

        public C4386a(Charset charset) {
            this.f7823a = new ArrayList();
            this.f7824b = new ArrayList();
            this.f7825c = charset;
        }

        /* renamed from: a */
        public C4386a mo24076a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f7823a.add(C4390t.m12619c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f7825c));
                this.f7824b.add(C4390t.m12619c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f7825c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C4386a mo24077b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f7823a.add(C4390t.m12619c(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f7825c));
                this.f7824b.add(C4390t.m12619c(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f7825c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: c */
        public C4385q mo24078c() {
            return new C4385q(this.f7823a, this.f7824b);
        }
    }

    C4385q(List<String> list, List<String> list2) {
        this.f7821a = C4345c.m12373t(list);
        this.f7822b = C4345c.m12373t(list2);
    }

    /* renamed from: h */
    private long m12586h(@Nullable C4409d dVar, boolean z) {
        C4406c cVar = z ? new C4406c() : dVar.mo24208H();
        int size = this.f7821a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.mo24247n1(38);
            }
            cVar.mo24269u1(this.f7821a.get(i));
            cVar.mo24247n1(61);
            cVar.mo24269u1(this.f7822b.get(i));
        }
        if (!z) {
            return 0;
        }
        long g1 = cVar.mo24233g1();
        cVar.clear();
        return g1;
    }

    /* renamed from: a */
    public long mo23827a() {
        return m12586h((C4409d) null, true);
    }

    /* renamed from: b */
    public C4392v mo23828b() {
        return f7820c;
    }

    /* renamed from: g */
    public void mo23829g(C4409d dVar) {
        m12586h(dVar, false);
    }
}
