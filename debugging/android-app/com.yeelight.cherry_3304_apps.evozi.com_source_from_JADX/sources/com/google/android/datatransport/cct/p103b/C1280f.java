package com.google.android.datatransport.cct.p103b;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1294l;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.b.f */
final class C1280f extends C1294l {

    /* renamed from: a */
    private final long f2298a;

    /* renamed from: b */
    private final Integer f2299b;

    /* renamed from: c */
    private final long f2300c;

    /* renamed from: d */
    private final byte[] f2301d;

    /* renamed from: e */
    private final String f2302e;

    /* renamed from: f */
    private final long f2303f;

    /* renamed from: g */
    private final C1299o f2304g;

    /* renamed from: com.google.android.datatransport.cct.b.f$b */
    static final class C1282b extends C1294l.C1295a {

        /* renamed from: a */
        private Long f2305a;

        /* renamed from: b */
        private Integer f2306b;

        /* renamed from: c */
        private Long f2307c;

        /* renamed from: d */
        private byte[] f2308d;

        /* renamed from: e */
        private String f2309e;

        /* renamed from: f */
        private Long f2310f;

        /* renamed from: g */
        private C1299o f2311g;

        C1282b() {
        }

        /* renamed from: a */
        public C1294l.C1295a mo10160a(long j) {
            this.f2305a = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public C1294l.C1295a mo10161b(@Nullable C1299o oVar) {
            this.f2311g = oVar;
            return this;
        }

        /* renamed from: c */
        public C1294l.C1295a mo10162c(@Nullable Integer num) {
            this.f2306b = num;
            return this;
        }

        /* renamed from: d */
        public C1294l mo10163d() {
            String str = "";
            if (this.f2305a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f2307c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f2310f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1280f(this.f2305a.longValue(), this.f2306b, this.f2307c.longValue(), this.f2308d, this.f2309e, this.f2310f.longValue(), this.f2311g, (C1281a) null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: e */
        public C1294l.C1295a mo10164e(long j) {
            this.f2307c = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C1294l.C1295a mo10165f(long j) {
            this.f2310f = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1294l.C1295a mo10166g(@Nullable String str) {
            this.f2309e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1294l.C1295a mo10167h(@Nullable byte[] bArr) {
            this.f2308d = bArr;
            return this;
        }
    }

    /* synthetic */ C1280f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C1299o oVar, C1281a aVar) {
        this.f2298a = j;
        this.f2299b = num;
        this.f2300c = j2;
        this.f2301d = bArr;
        this.f2302e = str;
        this.f2303f = j3;
        this.f2304g = oVar;
    }

    @Nullable
    /* renamed from: c */
    public Integer mo10150c() {
        return this.f2299b;
    }

    /* renamed from: d */
    public long mo10151d() {
        return this.f2298a;
    }

    /* renamed from: e */
    public long mo10152e() {
        return this.f2300c;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1294l)) {
            return false;
        }
        C1294l lVar = (C1294l) obj;
        if (this.f2298a == lVar.mo10151d() && ((num = this.f2299b) != null ? num.equals(((C1280f) lVar).f2299b) : ((C1280f) lVar).f2299b == null) && this.f2300c == lVar.mo10152e()) {
            if (Arrays.equals(this.f2301d, lVar instanceof C1280f ? ((C1280f) lVar).f2301d : lVar.mo10155g()) && ((str = this.f2302e) != null ? str.equals(((C1280f) lVar).f2302e) : ((C1280f) lVar).f2302e == null) && this.f2303f == lVar.mo10158i()) {
                C1299o oVar = this.f2304g;
                C1299o oVar2 = ((C1280f) lVar).f2304g;
                if (oVar == null) {
                    if (oVar2 == null) {
                        return true;
                    }
                } else if (oVar.equals(oVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public C1299o mo10154f() {
        return this.f2304g;
    }

    @Nullable
    /* renamed from: g */
    public byte[] mo10155g() {
        return this.f2301d;
    }

    @Nullable
    /* renamed from: h */
    public String mo10156h() {
        return this.f2302e;
    }

    public int hashCode() {
        long j = this.f2298a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2299b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f2300c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2301d)) * 1000003;
        String str = this.f2302e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f2303f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1299o oVar = this.f2304g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    /* renamed from: i */
    public long mo10158i() {
        return this.f2303f;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f2298a + ", eventCode=" + this.f2299b + ", eventUptimeMs=" + this.f2300c + ", sourceExtension=" + Arrays.toString(this.f2301d) + ", sourceExtensionJsonProto3=" + this.f2302e + ", timezoneOffsetSeconds=" + this.f2303f + ", networkConnectionInfo=" + this.f2304g + "}";
    }
}
