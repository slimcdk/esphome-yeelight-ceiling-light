package com.google.android.datatransport.cct.p103b;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1264a;

/* renamed from: com.google.android.datatransport.cct.b.c */
final class C1273c extends C1264a {

    /* renamed from: a */
    private final Integer f2277a;

    /* renamed from: b */
    private final String f2278b;

    /* renamed from: c */
    private final String f2279c;

    /* renamed from: d */
    private final String f2280d;

    /* renamed from: e */
    private final String f2281e;

    /* renamed from: f */
    private final String f2282f;

    /* renamed from: g */
    private final String f2283g;

    /* renamed from: h */
    private final String f2284h;

    /* renamed from: com.google.android.datatransport.cct.b.c$b */
    static final class C1275b extends C1264a.C1265a {

        /* renamed from: a */
        private Integer f2285a;

        /* renamed from: b */
        private String f2286b;

        /* renamed from: c */
        private String f2287c;

        /* renamed from: d */
        private String f2288d;

        /* renamed from: e */
        private String f2289e;

        /* renamed from: f */
        private String f2290f;

        /* renamed from: g */
        private String f2291g;

        /* renamed from: h */
        private String f2292h;

        C1275b() {
        }

        /* renamed from: a */
        public C1264a.C1265a mo10124a(@Nullable Integer num) {
            this.f2285a = num;
            return this;
        }

        /* renamed from: b */
        public C1264a.C1265a mo10125b(@Nullable String str) {
            this.f2288d = str;
            return this;
        }

        /* renamed from: c */
        public C1264a mo10126c() {
            return new C1273c(this.f2285a, this.f2286b, this.f2287c, this.f2288d, this.f2289e, this.f2290f, this.f2291g, this.f2292h, (C1274a) null);
        }

        /* renamed from: d */
        public C1264a.C1265a mo10127d(@Nullable String str) {
            this.f2292h = str;
            return this;
        }

        /* renamed from: e */
        public C1264a.C1265a mo10128e(@Nullable String str) {
            this.f2287c = str;
            return this;
        }

        /* renamed from: f */
        public C1264a.C1265a mo10129f(@Nullable String str) {
            this.f2291g = str;
            return this;
        }

        /* renamed from: g */
        public C1264a.C1265a mo10130g(@Nullable String str) {
            this.f2286b = str;
            return this;
        }

        /* renamed from: h */
        public C1264a.C1265a mo10131h(@Nullable String str) {
            this.f2290f = str;
            return this;
        }

        /* renamed from: i */
        public C1264a.C1265a mo10132i(@Nullable String str) {
            this.f2289e = str;
            return this;
        }
    }

    /* synthetic */ C1273c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1274a aVar) {
        this.f2277a = num;
        this.f2278b = str;
        this.f2279c = str2;
        this.f2280d = str3;
        this.f2281e = str4;
        this.f2282f = str5;
        this.f2283g = str6;
        this.f2284h = str7;
    }

    @Nullable
    /* renamed from: b */
    public String mo10116b() {
        return this.f2280d;
    }

    @Nullable
    /* renamed from: c */
    public String mo10117c() {
        return this.f2284h;
    }

    @Nullable
    /* renamed from: d */
    public String mo10118d() {
        return this.f2279c;
    }

    @Nullable
    /* renamed from: e */
    public String mo10119e() {
        return this.f2283g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1264a)) {
            return false;
        }
        Integer num = this.f2277a;
        if (num != null ? num.equals(((C1273c) obj).f2277a) : ((C1273c) obj).f2277a == null) {
            String str = this.f2278b;
            if (str != null ? str.equals(((C1273c) obj).f2278b) : ((C1273c) obj).f2278b == null) {
                String str2 = this.f2279c;
                if (str2 != null ? str2.equals(((C1273c) obj).f2279c) : ((C1273c) obj).f2279c == null) {
                    String str3 = this.f2280d;
                    if (str3 != null ? str3.equals(((C1273c) obj).f2280d) : ((C1273c) obj).f2280d == null) {
                        String str4 = this.f2281e;
                        if (str4 != null ? str4.equals(((C1273c) obj).f2281e) : ((C1273c) obj).f2281e == null) {
                            String str5 = this.f2282f;
                            if (str5 != null ? str5.equals(((C1273c) obj).f2282f) : ((C1273c) obj).f2282f == null) {
                                String str6 = this.f2283g;
                                if (str6 != null ? str6.equals(((C1273c) obj).f2283g) : ((C1273c) obj).f2283g == null) {
                                    String str7 = this.f2284h;
                                    String str8 = ((C1273c) obj).f2284h;
                                    if (str7 == null) {
                                        if (str8 == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(str8)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo10120f() {
        return this.f2278b;
    }

    @Nullable
    /* renamed from: g */
    public String mo10121g() {
        return this.f2282f;
    }

    @Nullable
    /* renamed from: h */
    public String mo10122h() {
        return this.f2281e;
    }

    public int hashCode() {
        Integer num = this.f2277a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2278b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2279c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2280d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2281e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2282f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2283g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2284h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    @Nullable
    /* renamed from: i */
    public Integer mo10123i() {
        return this.f2277a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f2277a + ", model=" + this.f2278b + ", hardware=" + this.f2279c + ", device=" + this.f2280d + ", product=" + this.f2281e + ", osBuild=" + this.f2282f + ", manufacturer=" + this.f2283g + ", fingerprint=" + this.f2284h + "}";
    }
}
