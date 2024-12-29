package com.google.android.datatransport.cct.p103b;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1296m;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.g */
final class C1283g extends C1296m {

    /* renamed from: a */
    private final long f2312a;

    /* renamed from: b */
    private final long f2313b;

    /* renamed from: c */
    private final C1291k f2314c;

    /* renamed from: d */
    private final Integer f2315d;

    /* renamed from: e */
    private final String f2316e;

    /* renamed from: f */
    private final List<C1294l> f2317f;

    /* renamed from: g */
    private final C1303p f2318g;

    /* renamed from: com.google.android.datatransport.cct.b.g$b */
    static final class C1285b extends C1296m.C1297a {

        /* renamed from: a */
        private Long f2319a;

        /* renamed from: b */
        private Long f2320b;

        /* renamed from: c */
        private C1291k f2321c;

        /* renamed from: d */
        private Integer f2322d;

        /* renamed from: e */
        private String f2323e;

        /* renamed from: f */
        private List<C1294l> f2324f;

        /* renamed from: g */
        private C1303p f2325g;

        C1285b() {
        }

        /* renamed from: b */
        public C1296m.C1297a mo10178b(long j) {
            this.f2319a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1296m.C1297a mo10179c(@Nullable C1291k kVar) {
            this.f2321c = kVar;
            return this;
        }

        /* renamed from: d */
        public C1296m.C1297a mo10180d(@Nullable C1303p pVar) {
            this.f2325g = pVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1296m.C1297a mo10181e(@Nullable Integer num) {
            this.f2322d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1296m.C1297a mo10182f(@Nullable String str) {
            this.f2323e = str;
            return this;
        }

        /* renamed from: g */
        public C1296m.C1297a mo10183g(@Nullable List<C1294l> list) {
            this.f2324f = list;
            return this;
        }

        /* renamed from: h */
        public C1296m mo10184h() {
            String str = "";
            if (this.f2319a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f2320b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C1283g(this.f2319a.longValue(), this.f2320b.longValue(), this.f2321c, this.f2322d, this.f2323e, this.f2324f, this.f2325g, (C1284a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: i */
        public C1296m.C1297a mo10185i(long j) {
            this.f2320b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C1283g(long j, long j2, C1291k kVar, Integer num, String str, List list, C1303p pVar, C1284a aVar) {
        this.f2312a = j;
        this.f2313b = j2;
        this.f2314c = kVar;
        this.f2315d = num;
        this.f2316e = str;
        this.f2317f = list;
        this.f2318g = pVar;
    }

    @Nullable
    /* renamed from: b */
    public C1291k mo10168b() {
        return this.f2314c;
    }

    @Nullable
    @Encodable.Field(name = "logEvent")
    /* renamed from: c */
    public List<C1294l> mo10169c() {
        return this.f2317f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo10170d() {
        return this.f2315d;
    }

    @Nullable
    /* renamed from: e */
    public String mo10171e() {
        return this.f2316e;
    }

    public boolean equals(Object obj) {
        C1291k kVar;
        Integer num;
        String str;
        List<C1294l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1296m)) {
            return false;
        }
        C1296m mVar = (C1296m) obj;
        if (this.f2312a == mVar.mo10174g() && this.f2313b == mVar.mo10175h() && ((kVar = this.f2314c) != null ? kVar.equals(((C1283g) mVar).f2314c) : ((C1283g) mVar).f2314c == null) && ((num = this.f2315d) != null ? num.equals(((C1283g) mVar).f2315d) : ((C1283g) mVar).f2315d == null) && ((str = this.f2316e) != null ? str.equals(((C1283g) mVar).f2316e) : ((C1283g) mVar).f2316e == null) && ((list = this.f2317f) != null ? list.equals(((C1283g) mVar).f2317f) : ((C1283g) mVar).f2317f == null)) {
            C1303p pVar = this.f2318g;
            C1303p pVar2 = ((C1283g) mVar).f2318g;
            if (pVar == null) {
                if (pVar2 == null) {
                    return true;
                }
            } else if (pVar.equals(pVar2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C1303p mo10173f() {
        return this.f2318g;
    }

    /* renamed from: g */
    public long mo10174g() {
        return this.f2312a;
    }

    /* renamed from: h */
    public long mo10175h() {
        return this.f2313b;
    }

    public int hashCode() {
        long j = this.f2312a;
        long j2 = this.f2313b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        C1291k kVar = this.f2314c;
        int i2 = 0;
        int hashCode = (i ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f2315d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2316e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1294l> list = this.f2317f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1303p pVar = this.f2318g;
        if (pVar != null) {
            i2 = pVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f2312a + ", requestUptimeMs=" + this.f2313b + ", clientInfo=" + this.f2314c + ", logSource=" + this.f2315d + ", logSourceName=" + this.f2316e + ", logEvents=" + this.f2317f + ", qosTier=" + this.f2318g + "}";
    }
}
