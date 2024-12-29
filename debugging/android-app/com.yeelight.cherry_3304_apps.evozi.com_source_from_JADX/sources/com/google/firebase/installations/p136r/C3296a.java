package com.google.firebase.installations.p136r;

import androidx.annotation.Nullable;
import com.google.firebase.installations.p136r.C3303d;

/* renamed from: com.google.firebase.installations.r.a */
final class C3296a extends C3303d {

    /* renamed from: a */
    private final String f6383a;

    /* renamed from: b */
    private final String f6384b;

    /* renamed from: c */
    private final String f6385c;

    /* renamed from: d */
    private final C3306e f6386d;

    /* renamed from: e */
    private final C3303d.C3305b f6387e;

    /* renamed from: com.google.firebase.installations.r.a$b */
    static final class C3298b extends C3303d.C3304a {

        /* renamed from: a */
        private String f6388a;

        /* renamed from: b */
        private String f6389b;

        /* renamed from: c */
        private String f6390c;

        /* renamed from: d */
        private C3306e f6391d;

        /* renamed from: e */
        private C3303d.C3305b f6392e;

        C3298b() {
        }

        /* renamed from: a */
        public C3303d mo17947a() {
            return new C3296a(this.f6388a, this.f6389b, this.f6390c, this.f6391d, this.f6392e);
        }

        /* renamed from: b */
        public C3303d.C3304a mo17948b(C3306e eVar) {
            this.f6391d = eVar;
            return this;
        }

        /* renamed from: c */
        public C3303d.C3304a mo17949c(String str) {
            this.f6389b = str;
            return this;
        }

        /* renamed from: d */
        public C3303d.C3304a mo17950d(String str) {
            this.f6390c = str;
            return this;
        }

        /* renamed from: e */
        public C3303d.C3304a mo17951e(C3303d.C3305b bVar) {
            this.f6392e = bVar;
            return this;
        }

        /* renamed from: f */
        public C3303d.C3304a mo17952f(String str) {
            this.f6388a = str;
            return this;
        }
    }

    private C3296a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C3306e eVar, @Nullable C3303d.C3305b bVar) {
        this.f6383a = str;
        this.f6384b = str2;
        this.f6385c = str3;
        this.f6386d = eVar;
        this.f6387e = bVar;
    }

    @Nullable
    /* renamed from: b */
    public C3306e mo17939b() {
        return this.f6386d;
    }

    @Nullable
    /* renamed from: c */
    public String mo17940c() {
        return this.f6384b;
    }

    @Nullable
    /* renamed from: d */
    public String mo17941d() {
        return this.f6385c;
    }

    @Nullable
    /* renamed from: e */
    public C3303d.C3305b mo17942e() {
        return this.f6387e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3303d)) {
            return false;
        }
        C3303d dVar = (C3303d) obj;
        String str = this.f6383a;
        if (str != null ? str.equals(dVar.mo17944f()) : dVar.mo17944f() == null) {
            String str2 = this.f6384b;
            if (str2 != null ? str2.equals(dVar.mo17940c()) : dVar.mo17940c() == null) {
                String str3 = this.f6385c;
                if (str3 != null ? str3.equals(dVar.mo17941d()) : dVar.mo17941d() == null) {
                    C3306e eVar = this.f6386d;
                    if (eVar != null ? eVar.equals(dVar.mo17939b()) : dVar.mo17939b() == null) {
                        C3303d.C3305b bVar = this.f6387e;
                        C3303d.C3305b e = dVar.mo17942e();
                        if (bVar == null) {
                            if (e == null) {
                                return true;
                            }
                        } else if (bVar.equals(e)) {
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
    public String mo17944f() {
        return this.f6383a;
    }

    public int hashCode() {
        String str = this.f6383a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f6384b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6385c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C3306e eVar = this.f6386d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C3303d.C3305b bVar = this.f6387e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f6383a + ", fid=" + this.f6384b + ", refreshToken=" + this.f6385c + ", authToken=" + this.f6386d + ", responseCode=" + this.f6387e + "}";
    }
}
