package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
final class C2447b extends TokenResult {

    /* renamed from: a */
    private final String f4141a;

    /* renamed from: b */
    private final long f4142b;

    /* renamed from: c */
    private final TokenResult.ResponseCode f4143c;

    /* renamed from: com.google.firebase.installations.remote.b$b */
    static final class C2449b extends TokenResult.C2443a {

        /* renamed from: a */
        private String f4144a;

        /* renamed from: b */
        private Long f4145b;

        /* renamed from: c */
        private TokenResult.ResponseCode f4146c;

        C2449b() {
        }

        /* renamed from: a */
        public TokenResult mo19110a() {
            String str = "";
            if (this.f4145b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2447b(this.f4144a, this.f4145b.longValue(), this.f4146c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public TokenResult.C2443a mo19111b(TokenResult.ResponseCode responseCode) {
            this.f4146c = responseCode;
            return this;
        }

        /* renamed from: c */
        public TokenResult.C2443a mo19112c(String str) {
            this.f4144a = str;
            return this;
        }

        /* renamed from: d */
        public TokenResult.C2443a mo19113d(long j) {
            this.f4145b = Long.valueOf(j);
            return this;
        }
    }

    private C2447b(@Nullable String str, long j, @Nullable TokenResult.ResponseCode responseCode) {
        this.f4141a = str;
        this.f4142b = j;
        this.f4143c = responseCode;
    }

    @Nullable
    /* renamed from: b */
    public TokenResult.ResponseCode mo19107b() {
        return this.f4143c;
    }

    @Nullable
    /* renamed from: c */
    public String mo19108c() {
        return this.f4141a;
    }

    @NonNull
    /* renamed from: d */
    public long mo19109d() {
        return this.f4142b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f4141a;
        if (str != null ? str.equals(tokenResult.mo19108c()) : tokenResult.mo19108c() == null) {
            if (this.f4142b == tokenResult.mo19109d()) {
                TokenResult.ResponseCode responseCode = this.f4143c;
                TokenResult.ResponseCode b = tokenResult.mo19107b();
                if (responseCode == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (responseCode.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4141a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f4142b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f4143c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f4141a + ", tokenExpirationTimestamp=" + this.f4142b + ", responseCode=" + this.f4143c + "}";
    }
}
