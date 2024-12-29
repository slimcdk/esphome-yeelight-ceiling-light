package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C0677l;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.g */
final class C0667g extends C0677l {

    /* renamed from: a */
    private final long f403a;

    /* renamed from: b */
    private final long f404b;

    /* renamed from: c */
    private final ClientInfo f405c;

    /* renamed from: d */
    private final Integer f406d;

    /* renamed from: e */
    private final String f407e;

    /* renamed from: f */
    private final List<C0675k> f408f;

    /* renamed from: g */
    private final QosTier f409g;

    /* renamed from: com.google.android.datatransport.cct.internal.g$b */
    static final class C0669b extends C0677l.C0678a {

        /* renamed from: a */
        private Long f410a;

        /* renamed from: b */
        private Long f411b;

        /* renamed from: c */
        private ClientInfo f412c;

        /* renamed from: d */
        private Integer f413d;

        /* renamed from: e */
        private String f414e;

        /* renamed from: f */
        private List<C0675k> f415f;

        /* renamed from: g */
        private QosTier f416g;

        C0669b() {
        }

        /* renamed from: a */
        public C0677l mo11192a() {
            String str = "";
            if (this.f410a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f411b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C0667g(this.f410a.longValue(), this.f411b.longValue(), this.f412c, this.f413d, this.f414e, this.f415f, this.f416g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C0677l.C0678a mo11193b(@Nullable ClientInfo clientInfo) {
            this.f412c = clientInfo;
            return this;
        }

        /* renamed from: c */
        public C0677l.C0678a mo11194c(@Nullable List<C0675k> list) {
            this.f415f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0677l.C0678a mo11195d(@Nullable Integer num) {
            this.f413d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0677l.C0678a mo11196e(@Nullable String str) {
            this.f414e = str;
            return this;
        }

        /* renamed from: f */
        public C0677l.C0678a mo11197f(@Nullable QosTier qosTier) {
            this.f416g = qosTier;
            return this;
        }

        /* renamed from: g */
        public C0677l.C0678a mo11198g(long j) {
            this.f410a = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public C0677l.C0678a mo11199h(long j) {
            this.f411b = Long.valueOf(j);
            return this;
        }
    }

    private C0667g(long j, long j2, @Nullable ClientInfo clientInfo, @Nullable Integer num, @Nullable String str, @Nullable List<C0675k> list, @Nullable QosTier qosTier) {
        this.f403a = j;
        this.f404b = j2;
        this.f405c = clientInfo;
        this.f406d = num;
        this.f407e = str;
        this.f408f = list;
        this.f409g = qosTier;
    }

    @Nullable
    /* renamed from: b */
    public ClientInfo mo11182b() {
        return this.f405c;
    }

    @Nullable
    @Encodable.Field(name = "logEvent")
    /* renamed from: c */
    public List<C0675k> mo11183c() {
        return this.f408f;
    }

    @Nullable
    /* renamed from: d */
    public Integer mo11184d() {
        return this.f406d;
    }

    @Nullable
    /* renamed from: e */
    public String mo11185e() {
        return this.f407e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<C0675k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0677l)) {
            return false;
        }
        C0677l lVar = (C0677l) obj;
        if (this.f403a == lVar.mo11188g() && this.f404b == lVar.mo11189h() && ((clientInfo = this.f405c) != null ? clientInfo.equals(lVar.mo11182b()) : lVar.mo11182b() == null) && ((num = this.f406d) != null ? num.equals(lVar.mo11184d()) : lVar.mo11184d() == null) && ((str = this.f407e) != null ? str.equals(lVar.mo11185e()) : lVar.mo11185e() == null) && ((list = this.f408f) != null ? list.equals(lVar.mo11183c()) : lVar.mo11183c() == null)) {
            QosTier qosTier = this.f409g;
            QosTier f = lVar.mo11187f();
            if (qosTier == null) {
                if (f == null) {
                    return true;
                }
            } else if (qosTier.equals(f)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public QosTier mo11187f() {
        return this.f409g;
    }

    /* renamed from: g */
    public long mo11188g() {
        return this.f403a;
    }

    /* renamed from: h */
    public long mo11189h() {
        return this.f404b;
    }

    public int hashCode() {
        long j = this.f403a;
        long j2 = this.f404b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        ClientInfo clientInfo = this.f405c;
        int i2 = 0;
        int hashCode = (i ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f406d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f407e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C0675k> list = this.f408f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f409g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f403a + ", requestUptimeMs=" + this.f404b + ", clientInfo=" + this.f405c + ", logSource=" + this.f406d + ", logSourceName=" + this.f407e + ", logEvents=" + this.f408f + ", qosTier=" + this.f409g + "}";
    }
}
