package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.C2440b;
import com.google.firebase.installations.local.PersistedInstallation;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.local.a */
final class C2437a extends C2440b {

    /* renamed from: a */
    private final String f4115a;

    /* renamed from: b */
    private final PersistedInstallation.RegistrationStatus f4116b;

    /* renamed from: c */
    private final String f4117c;

    /* renamed from: d */
    private final String f4118d;

    /* renamed from: e */
    private final long f4119e;

    /* renamed from: f */
    private final long f4120f;

    /* renamed from: g */
    private final String f4121g;

    /* renamed from: com.google.firebase.installations.local.a$b */
    static final class C2439b extends C2440b.C2441a {

        /* renamed from: a */
        private String f4122a;

        /* renamed from: b */
        private PersistedInstallation.RegistrationStatus f4123b;

        /* renamed from: c */
        private String f4124c;

        /* renamed from: d */
        private String f4125d;

        /* renamed from: e */
        private Long f4126e;

        /* renamed from: f */
        private Long f4127f;

        /* renamed from: g */
        private String f4128g;

        C2439b() {
        }

        private C2439b(C2440b bVar) {
            this.f4122a = bVar.mo19068d();
            this.f4123b = bVar.mo19072g();
            this.f4124c = bVar.mo19066b();
            this.f4125d = bVar.mo19071f();
            this.f4126e = Long.valueOf(bVar.mo19067c());
            this.f4127f = Long.valueOf(bVar.mo19073h());
            this.f4128g = bVar.mo19069e();
        }

        /* renamed from: a */
        public C2440b mo19077a() {
            String str = "";
            if (this.f4123b == null) {
                str = str + " registrationStatus";
            }
            if (this.f4126e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f4127f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2437a(this.f4122a, this.f4123b, this.f4124c, this.f4125d, this.f4126e.longValue(), this.f4127f.longValue(), this.f4128g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C2440b.C2441a mo19078b(@Nullable String str) {
            this.f4124c = str;
            return this;
        }

        /* renamed from: c */
        public C2440b.C2441a mo19079c(long j) {
            this.f4126e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C2440b.C2441a mo19080d(String str) {
            this.f4122a = str;
            return this;
        }

        /* renamed from: e */
        public C2440b.C2441a mo19081e(@Nullable String str) {
            this.f4128g = str;
            return this;
        }

        /* renamed from: f */
        public C2440b.C2441a mo19082f(@Nullable String str) {
            this.f4125d = str;
            return this;
        }

        /* renamed from: g */
        public C2440b.C2441a mo19083g(PersistedInstallation.RegistrationStatus registrationStatus) {
            Objects.requireNonNull(registrationStatus, "Null registrationStatus");
            this.f4123b = registrationStatus;
            return this;
        }

        /* renamed from: h */
        public C2440b.C2441a mo19084h(long j) {
            this.f4127f = Long.valueOf(j);
            return this;
        }
    }

    private C2437a(@Nullable String str, PersistedInstallation.RegistrationStatus registrationStatus, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f4115a = str;
        this.f4116b = registrationStatus;
        this.f4117c = str2;
        this.f4118d = str3;
        this.f4119e = j;
        this.f4120f = j2;
        this.f4121g = str4;
    }

    @Nullable
    /* renamed from: b */
    public String mo19066b() {
        return this.f4117c;
    }

    /* renamed from: c */
    public long mo19067c() {
        return this.f4119e;
    }

    @Nullable
    /* renamed from: d */
    public String mo19068d() {
        return this.f4115a;
    }

    @Nullable
    /* renamed from: e */
    public String mo19069e() {
        return this.f4121g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2440b)) {
            return false;
        }
        C2440b bVar = (C2440b) obj;
        String str3 = this.f4115a;
        if (str3 != null ? str3.equals(bVar.mo19068d()) : bVar.mo19068d() == null) {
            if (this.f4116b.equals(bVar.mo19072g()) && ((str = this.f4117c) != null ? str.equals(bVar.mo19066b()) : bVar.mo19066b() == null) && ((str2 = this.f4118d) != null ? str2.equals(bVar.mo19071f()) : bVar.mo19071f() == null) && this.f4119e == bVar.mo19067c() && this.f4120f == bVar.mo19073h()) {
                String str4 = this.f4121g;
                String e = bVar.mo19069e();
                if (str4 == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (str4.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo19071f() {
        return this.f4118d;
    }

    @NonNull
    /* renamed from: g */
    public PersistedInstallation.RegistrationStatus mo19072g() {
        return this.f4116b;
    }

    /* renamed from: h */
    public long mo19073h() {
        return this.f4120f;
    }

    public int hashCode() {
        String str = this.f4115a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4116b.hashCode()) * 1000003;
        String str2 = this.f4117c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4118d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f4119e;
        long j2 = this.f4120f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f4121g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C2440b.C2441a mo19075n() {
        return new C2439b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f4115a + ", registrationStatus=" + this.f4116b + ", authToken=" + this.f4117c + ", refreshToken=" + this.f4118d + ", expiresInSecs=" + this.f4119e + ", tokenCreationEpochInSecs=" + this.f4120f + ", fisError=" + this.f4121g + "}";
    }
}
