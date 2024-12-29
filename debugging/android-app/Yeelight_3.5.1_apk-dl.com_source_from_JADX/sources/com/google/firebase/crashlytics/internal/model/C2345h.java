package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.h */
final class C2345h extends CrashlyticsReport.C2270e.C2271a {

    /* renamed from: a */
    private final String f3845a;

    /* renamed from: b */
    private final String f3846b;

    /* renamed from: c */
    private final String f3847c;

    /* renamed from: d */
    private final CrashlyticsReport.C2270e.C2271a.C2273b f3848d;

    /* renamed from: e */
    private final String f3849e;

    /* renamed from: f */
    private final String f3850f;

    /* renamed from: g */
    private final String f3851g;

    /* renamed from: com.google.firebase.crashlytics.internal.model.h$b */
    static final class C2347b extends CrashlyticsReport.C2270e.C2271a.C2272a {

        /* renamed from: a */
        private String f3852a;

        /* renamed from: b */
        private String f3853b;

        /* renamed from: c */
        private String f3854c;

        /* renamed from: d */
        private CrashlyticsReport.C2270e.C2271a.C2273b f3855d;

        /* renamed from: e */
        private String f3856e;

        /* renamed from: f */
        private String f3857f;

        /* renamed from: g */
        private String f3858g;

        C2347b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2271a mo18697a() {
            String str = "";
            if (this.f3852a == null) {
                str = str + " identifier";
            }
            if (this.f3853b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C2345h(this.f3852a, this.f3853b, this.f3854c, this.f3855d, this.f3856e, this.f3857f, this.f3858g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18698b(@Nullable String str) {
            this.f3857f = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18699c(@Nullable String str) {
            this.f3858g = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18700d(String str) {
            this.f3854c = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18701e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f3852a = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18702f(String str) {
            this.f3856e = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2270e.C2271a.C2272a mo18703g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f3853b = str;
            return this;
        }
    }

    private C2345h(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.C2270e.C2271a.C2273b bVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.f3845a = str;
        this.f3846b = str2;
        this.f3847c = str3;
        this.f3848d = bVar;
        this.f3849e = str4;
        this.f3850f = str5;
        this.f3851g = str6;
    }

    @Nullable
    /* renamed from: b */
    public String mo18690b() {
        return this.f3850f;
    }

    @Nullable
    /* renamed from: c */
    public String mo18691c() {
        return this.f3851g;
    }

    @Nullable
    /* renamed from: d */
    public String mo18692d() {
        return this.f3847c;
    }

    @NonNull
    /* renamed from: e */
    public String mo18693e() {
        return this.f3845a;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C2270e.C2271a.C2273b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2271a)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2271a aVar = (CrashlyticsReport.C2270e.C2271a) obj;
        if (this.f3845a.equals(aVar.mo18693e()) && this.f3846b.equals(aVar.mo18696h()) && ((str = this.f3847c) != null ? str.equals(aVar.mo18692d()) : aVar.mo18692d() == null) && ((bVar = this.f3848d) != null ? bVar.equals(aVar.mo18695g()) : aVar.mo18695g() == null) && ((str2 = this.f3849e) != null ? str2.equals(aVar.mo18694f()) : aVar.mo18694f() == null) && ((str3 = this.f3850f) != null ? str3.equals(aVar.mo18690b()) : aVar.mo18690b() == null)) {
            String str4 = this.f3851g;
            String c = aVar.mo18691c();
            if (str4 == null) {
                if (c == null) {
                    return true;
                }
            } else if (str4.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo18694f() {
        return this.f3849e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.C2270e.C2271a.C2273b mo18695g() {
        return this.f3848d;
    }

    @NonNull
    /* renamed from: h */
    public String mo18696h() {
        return this.f3846b;
    }

    public int hashCode() {
        int hashCode = (((this.f3845a.hashCode() ^ 1000003) * 1000003) ^ this.f3846b.hashCode()) * 1000003;
        String str = this.f3847c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.C2270e.C2271a.C2273b bVar = this.f3848d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f3849e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3850f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3851g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f3845a + ", version=" + this.f3846b + ", displayVersion=" + this.f3847c + ", organization=" + this.f3848d + ", installationUuid=" + this.f3849e + ", developmentPlatform=" + this.f3850f + ", developmentPlatformVersion=" + this.f3851g + "}";
    }
}
