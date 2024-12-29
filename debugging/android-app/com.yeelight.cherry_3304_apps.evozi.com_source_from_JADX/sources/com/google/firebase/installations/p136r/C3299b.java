package com.google.firebase.installations.p136r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.p136r.C3306e;

/* renamed from: com.google.firebase.installations.r.b */
final class C3299b extends C3306e {

    /* renamed from: a */
    private final String f6393a;

    /* renamed from: b */
    private final long f6394b;

    /* renamed from: c */
    private final C3306e.C3308b f6395c;

    /* renamed from: com.google.firebase.installations.r.b$b */
    static final class C3301b extends C3306e.C3307a {

        /* renamed from: a */
        private String f6396a;

        /* renamed from: b */
        private Long f6397b;

        /* renamed from: c */
        private C3306e.C3308b f6398c;

        C3301b() {
        }

        /* renamed from: a */
        public C3306e mo17959a() {
            String str = "";
            if (this.f6397b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C3299b(this.f6396a, this.f6397b.longValue(), this.f6398c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3306e.C3307a mo17960b(C3306e.C3308b bVar) {
            this.f6398c = bVar;
            return this;
        }

        /* renamed from: c */
        public C3306e.C3307a mo17961c(String str) {
            this.f6396a = str;
            return this;
        }

        /* renamed from: d */
        public C3306e.C3307a mo17962d(long j) {
            this.f6397b = Long.valueOf(j);
            return this;
        }
    }

    private C3299b(@Nullable String str, long j, @Nullable C3306e.C3308b bVar) {
        this.f6393a = str;
        this.f6394b = j;
        this.f6395c = bVar;
    }

    @Nullable
    /* renamed from: b */
    public C3306e.C3308b mo17953b() {
        return this.f6395c;
    }

    @Nullable
    /* renamed from: c */
    public String mo17954c() {
        return this.f6393a;
    }

    @NonNull
    /* renamed from: d */
    public long mo17955d() {
        return this.f6394b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3306e)) {
            return false;
        }
        C3306e eVar = (C3306e) obj;
        String str = this.f6393a;
        if (str != null ? str.equals(eVar.mo17954c()) : eVar.mo17954c() == null) {
            if (this.f6394b == eVar.mo17955d()) {
                C3306e.C3308b bVar = this.f6395c;
                C3306e.C3308b b = eVar.mo17953b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6393a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f6394b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C3306e.C3308b bVar = this.f6395c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.f6393a + ", tokenExpirationTimestamp=" + this.f6394b + ", responseCode=" + this.f6395c + "}";
    }
}
