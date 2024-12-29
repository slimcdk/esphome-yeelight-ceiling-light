package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.C3283m;

/* renamed from: com.google.firebase.installations.a */
final class C3266a extends C3283m {

    /* renamed from: a */
    private final String f6321a;

    /* renamed from: b */
    private final long f6322b;

    /* renamed from: c */
    private final long f6323c;

    /* renamed from: com.google.firebase.installations.a$b */
    static final class C3268b extends C3283m.C3284a {

        /* renamed from: a */
        private String f6324a;

        /* renamed from: b */
        private Long f6325b;

        /* renamed from: c */
        private Long f6326c;

        C3268b() {
        }

        /* renamed from: a */
        public C3283m mo17885a() {
            String str = "";
            if (this.f6324a == null) {
                str = str + " token";
            }
            if (this.f6325b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f6326c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C3266a(this.f6324a, this.f6325b.longValue(), this.f6326c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3283m.C3284a mo17886b(String str) {
            if (str != null) {
                this.f6324a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: c */
        public C3283m.C3284a mo17887c(long j) {
            this.f6326c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C3283m.C3284a mo17888d(long j) {
            this.f6325b = Long.valueOf(j);
            return this;
        }
    }

    private C3266a(String str, long j, long j2) {
        this.f6321a = str;
        this.f6322b = j;
        this.f6323c = j2;
    }

    @NonNull
    /* renamed from: b */
    public String mo17879b() {
        return this.f6321a;
    }

    @NonNull
    /* renamed from: c */
    public long mo17880c() {
        return this.f6323c;
    }

    @NonNull
    /* renamed from: d */
    public long mo17881d() {
        return this.f6322b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3283m)) {
            return false;
        }
        C3283m mVar = (C3283m) obj;
        return this.f6321a.equals(mVar.mo17879b()) && this.f6322b == mVar.mo17881d() && this.f6323c == mVar.mo17880c();
    }

    public int hashCode() {
        long j = this.f6322b;
        long j2 = this.f6323c;
        return ((((this.f6321a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f6321a + ", tokenExpirationTimestamp=" + this.f6322b + ", tokenCreationTimestamp=" + this.f6323c + "}";
    }
}
