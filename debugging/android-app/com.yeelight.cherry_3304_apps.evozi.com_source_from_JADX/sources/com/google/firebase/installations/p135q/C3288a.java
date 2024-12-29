package com.google.firebase.installations.p135q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.p135q.C3292c;
import com.google.firebase.installations.p135q.C3294d;

/* renamed from: com.google.firebase.installations.q.a */
final class C3288a extends C3294d {

    /* renamed from: a */
    private final String f6358a;

    /* renamed from: b */
    private final C3292c.C3293a f6359b;

    /* renamed from: c */
    private final String f6360c;

    /* renamed from: d */
    private final String f6361d;

    /* renamed from: e */
    private final long f6362e;

    /* renamed from: f */
    private final long f6363f;

    /* renamed from: g */
    private final String f6364g;

    /* renamed from: com.google.firebase.installations.q.a$b */
    static final class C3290b extends C3294d.C3295a {

        /* renamed from: a */
        private String f6365a;

        /* renamed from: b */
        private C3292c.C3293a f6366b;

        /* renamed from: c */
        private String f6367c;

        /* renamed from: d */
        private String f6368d;

        /* renamed from: e */
        private Long f6369e;

        /* renamed from: f */
        private Long f6370f;

        /* renamed from: g */
        private String f6371g;

        C3290b() {
        }

        private C3290b(C3294d dVar) {
            this.f6365a = dVar.mo17907d();
            this.f6366b = dVar.mo17911g();
            this.f6367c = dVar.mo17905b();
            this.f6368d = dVar.mo17910f();
            this.f6369e = Long.valueOf(dVar.mo17906c());
            this.f6370f = Long.valueOf(dVar.mo17912h());
            this.f6371g = dVar.mo17908e();
        }

        /* renamed from: a */
        public C3294d mo17916a() {
            String str = "";
            if (this.f6366b == null) {
                str = str + " registrationStatus";
            }
            if (this.f6369e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f6370f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C3288a(this.f6365a, this.f6366b, this.f6367c, this.f6368d, this.f6369e.longValue(), this.f6370f.longValue(), this.f6371g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3294d.C3295a mo17917b(@Nullable String str) {
            this.f6367c = str;
            return this;
        }

        /* renamed from: c */
        public C3294d.C3295a mo17918c(long j) {
            this.f6369e = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C3294d.C3295a mo17919d(String str) {
            this.f6365a = str;
            return this;
        }

        /* renamed from: e */
        public C3294d.C3295a mo17920e(@Nullable String str) {
            this.f6371g = str;
            return this;
        }

        /* renamed from: f */
        public C3294d.C3295a mo17921f(@Nullable String str) {
            this.f6368d = str;
            return this;
        }

        /* renamed from: g */
        public C3294d.C3295a mo17922g(C3292c.C3293a aVar) {
            if (aVar != null) {
                this.f6366b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: h */
        public C3294d.C3295a mo17923h(long j) {
            this.f6370f = Long.valueOf(j);
            return this;
        }
    }

    private C3288a(@Nullable String str, C3292c.C3293a aVar, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4) {
        this.f6358a = str;
        this.f6359b = aVar;
        this.f6360c = str2;
        this.f6361d = str3;
        this.f6362e = j;
        this.f6363f = j2;
        this.f6364g = str4;
    }

    @Nullable
    /* renamed from: b */
    public String mo17905b() {
        return this.f6360c;
    }

    /* renamed from: c */
    public long mo17906c() {
        return this.f6362e;
    }

    @Nullable
    /* renamed from: d */
    public String mo17907d() {
        return this.f6358a;
    }

    @Nullable
    /* renamed from: e */
    public String mo17908e() {
        return this.f6364g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3294d)) {
            return false;
        }
        C3294d dVar = (C3294d) obj;
        String str3 = this.f6358a;
        if (str3 != null ? str3.equals(dVar.mo17907d()) : dVar.mo17907d() == null) {
            if (this.f6359b.equals(dVar.mo17911g()) && ((str = this.f6360c) != null ? str.equals(dVar.mo17905b()) : dVar.mo17905b() == null) && ((str2 = this.f6361d) != null ? str2.equals(dVar.mo17910f()) : dVar.mo17910f() == null) && this.f6362e == dVar.mo17906c() && this.f6363f == dVar.mo17912h()) {
                String str4 = this.f6364g;
                String e = dVar.mo17908e();
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
    public String mo17910f() {
        return this.f6361d;
    }

    @NonNull
    /* renamed from: g */
    public C3292c.C3293a mo17911g() {
        return this.f6359b;
    }

    /* renamed from: h */
    public long mo17912h() {
        return this.f6363f;
    }

    public int hashCode() {
        String str = this.f6358a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f6359b.hashCode()) * 1000003;
        String str2 = this.f6360c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6361d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f6362e;
        long j2 = this.f6363f;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f6364g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: n */
    public C3294d.C3295a mo17914n() {
        return new C3290b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f6358a + ", registrationStatus=" + this.f6359b + ", authToken=" + this.f6360c + ", refreshToken=" + this.f6361d + ", expiresInSecs=" + this.f6362e + ", tokenCreationEpochInSecs=" + this.f6363f + ", fisError=" + this.f6364g + "}";
    }
}
