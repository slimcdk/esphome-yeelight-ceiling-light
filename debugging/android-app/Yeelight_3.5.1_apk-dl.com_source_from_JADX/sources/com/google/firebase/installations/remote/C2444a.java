package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
final class C2444a extends InstallationResponse {

    /* renamed from: a */
    private final String f4131a;

    /* renamed from: b */
    private final String f4132b;

    /* renamed from: c */
    private final String f4133c;

    /* renamed from: d */
    private final TokenResult f4134d;

    /* renamed from: e */
    private final InstallationResponse.ResponseCode f4135e;

    /* renamed from: com.google.firebase.installations.remote.a$b */
    static final class C2446b extends InstallationResponse.C2442a {

        /* renamed from: a */
        private String f4136a;

        /* renamed from: b */
        private String f4137b;

        /* renamed from: c */
        private String f4138c;

        /* renamed from: d */
        private TokenResult f4139d;

        /* renamed from: e */
        private InstallationResponse.ResponseCode f4140e;

        C2446b() {
        }

        /* renamed from: a */
        public InstallationResponse mo19101a() {
            return new C2444a(this.f4136a, this.f4137b, this.f4138c, this.f4139d, this.f4140e);
        }

        /* renamed from: b */
        public InstallationResponse.C2442a mo19102b(TokenResult tokenResult) {
            this.f4139d = tokenResult;
            return this;
        }

        /* renamed from: c */
        public InstallationResponse.C2442a mo19103c(String str) {
            this.f4137b = str;
            return this;
        }

        /* renamed from: d */
        public InstallationResponse.C2442a mo19104d(String str) {
            this.f4138c = str;
            return this;
        }

        /* renamed from: e */
        public InstallationResponse.C2442a mo19105e(InstallationResponse.ResponseCode responseCode) {
            this.f4140e = responseCode;
            return this;
        }

        /* renamed from: f */
        public InstallationResponse.C2442a mo19106f(String str) {
            this.f4136a = str;
            return this;
        }
    }

    private C2444a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable TokenResult tokenResult, @Nullable InstallationResponse.ResponseCode responseCode) {
        this.f4131a = str;
        this.f4132b = str2;
        this.f4133c = str3;
        this.f4134d = tokenResult;
        this.f4135e = responseCode;
    }

    @Nullable
    /* renamed from: b */
    public TokenResult mo19096b() {
        return this.f4134d;
    }

    @Nullable
    /* renamed from: c */
    public String mo19097c() {
        return this.f4132b;
    }

    @Nullable
    /* renamed from: d */
    public String mo19098d() {
        return this.f4133c;
    }

    @Nullable
    /* renamed from: e */
    public InstallationResponse.ResponseCode mo19099e() {
        return this.f4135e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f4131a;
        if (str != null ? str.equals(installationResponse.mo19100f()) : installationResponse.mo19100f() == null) {
            String str2 = this.f4132b;
            if (str2 != null ? str2.equals(installationResponse.mo19097c()) : installationResponse.mo19097c() == null) {
                String str3 = this.f4133c;
                if (str3 != null ? str3.equals(installationResponse.mo19098d()) : installationResponse.mo19098d() == null) {
                    TokenResult tokenResult = this.f4134d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.mo19096b()) : installationResponse.mo19096b() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f4135e;
                        InstallationResponse.ResponseCode e = installationResponse.mo19099e();
                        if (responseCode == null) {
                            if (e == null) {
                                return true;
                            }
                        } else if (responseCode.equals(e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo19100f() {
        return this.f4131a;
    }

    public int hashCode() {
        String str = this.f4131a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4132b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4133c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f4134d;
        int hashCode4 = (hashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f4135e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f4131a + ", fid=" + this.f4132b + ", refreshToken=" + this.f4133c + ", authToken=" + this.f4134d + ", responseCode=" + this.f4135e + "}";
    }
}
