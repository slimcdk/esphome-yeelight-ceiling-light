package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.C0675k;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.f */
final class C0664f extends C0675k {

    /* renamed from: a */
    private final long f389a;

    /* renamed from: b */
    private final Integer f390b;

    /* renamed from: c */
    private final long f391c;

    /* renamed from: d */
    private final byte[] f392d;

    /* renamed from: e */
    private final String f393e;

    /* renamed from: f */
    private final long f394f;

    /* renamed from: g */
    private final NetworkConnectionInfo f395g;

    /* renamed from: com.google.android.datatransport.cct.internal.f$b */
    static final class C0666b extends C0675k.C0676a {

        /* renamed from: a */
        private Long f396a;

        /* renamed from: b */
        private Integer f397b;

        /* renamed from: c */
        private Long f398c;

        /* renamed from: d */
        private byte[] f399d;

        /* renamed from: e */
        private String f400e;

        /* renamed from: f */
        private Long f401f;

        /* renamed from: g */
        private NetworkConnectionInfo f402g;

        C0666b() {
        }

        /* renamed from: a */
        public C0675k mo11174a() {
            String str = "";
            if (this.f396a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f398c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f401f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C0664f(this.f396a.longValue(), this.f397b, this.f398c.longValue(), this.f399d, this.f400e, this.f401f.longValue(), this.f402g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C0675k.C0676a mo11175b(@Nullable Integer num) {
            this.f397b = num;
            return this;
        }

        /* renamed from: c */
        public C0675k.C0676a mo11176c(long j) {
            this.f396a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C0675k.C0676a mo11177d(long j) {
            this.f398c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C0675k.C0676a mo11178e(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f402g = networkConnectionInfo;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0675k.C0676a mo11179f(@Nullable byte[] bArr) {
            this.f399d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0675k.C0676a mo11180g(@Nullable String str) {
            this.f400e = str;
            return this;
        }

        /* renamed from: h */
        public C0675k.C0676a mo11181h(long j) {
            this.f401f = Long.valueOf(j);
            return this;
        }
    }

    private C0664f(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo) {
        this.f389a = j;
        this.f390b = num;
        this.f391c = j2;
        this.f392d = bArr;
        this.f393e = str;
        this.f394f = j3;
        this.f395g = networkConnectionInfo;
    }

    @Nullable
    /* renamed from: b */
    public Integer mo11164b() {
        return this.f390b;
    }

    /* renamed from: c */
    public long mo11165c() {
        return this.f389a;
    }

    /* renamed from: d */
    public long mo11166d() {
        return this.f391c;
    }

    @Nullable
    /* renamed from: e */
    public NetworkConnectionInfo mo11167e() {
        return this.f395g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0675k)) {
            return false;
        }
        C0675k kVar = (C0675k) obj;
        if (this.f389a == kVar.mo11165c() && ((num = this.f390b) != null ? num.equals(kVar.mo11164b()) : kVar.mo11164b() == null) && this.f391c == kVar.mo11166d()) {
            if (Arrays.equals(this.f392d, kVar instanceof C0664f ? ((C0664f) kVar).f392d : kVar.mo11169f()) && ((str = this.f393e) != null ? str.equals(kVar.mo11170g()) : kVar.mo11170g() == null) && this.f394f == kVar.mo11171h()) {
                NetworkConnectionInfo networkConnectionInfo = this.f395g;
                NetworkConnectionInfo e = kVar.mo11167e();
                if (networkConnectionInfo == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public byte[] mo11169f() {
        return this.f392d;
    }

    @Nullable
    /* renamed from: g */
    public String mo11170g() {
        return this.f393e;
    }

    /* renamed from: h */
    public long mo11171h() {
        return this.f394f;
    }

    public int hashCode() {
        long j = this.f389a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f390b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f391c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f392d)) * 1000003;
        String str = this.f393e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f394f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f395g;
        if (networkConnectionInfo != null) {
            i2 = networkConnectionInfo.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f389a + ", eventCode=" + this.f390b + ", eventUptimeMs=" + this.f391c + ", sourceExtension=" + Arrays.toString(this.f392d) + ", sourceExtensionJsonProto3=" + this.f393e + ", timezoneOffsetSeconds=" + this.f394f + ", networkConnectionInfo=" + this.f395g + "}";
    }
}
