package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.g */
final class C3122g extends CrashlyticsReport.C3054d.C3055a {

    /* renamed from: a */
    private final String f6010a;

    /* renamed from: b */
    private final String f6011b;

    /* renamed from: c */
    private final String f6012c;

    /* renamed from: d */
    private final CrashlyticsReport.C3054d.C3055a.C3057b f6013d;

    /* renamed from: e */
    private final String f6014e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.g$b */
    static final class C3124b extends CrashlyticsReport.C3054d.C3055a.C3056a {

        /* renamed from: a */
        private String f6015a;

        /* renamed from: b */
        private String f6016b;

        /* renamed from: c */
        private String f6017c;

        /* renamed from: d */
        private CrashlyticsReport.C3054d.C3055a.C3057b f6018d;

        /* renamed from: e */
        private String f6019e;

        C3124b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3055a mo17487a() {
            String str = "";
            if (this.f6015a == null) {
                str = str + " identifier";
            }
            if (this.f6016b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C3122g(this.f6015a, this.f6016b, this.f6017c, this.f6018d, this.f6019e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3055a.C3056a mo17488b(String str) {
            this.f6017c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3055a.C3056a mo17489c(String str) {
            if (str != null) {
                this.f6015a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3055a.C3056a mo17490d(String str) {
            this.f6019e = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3055a.C3056a mo17491e(String str) {
            if (str != null) {
                this.f6016b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private C3122g(String str, String str2, @Nullable String str3, @Nullable CrashlyticsReport.C3054d.C3055a.C3057b bVar, @Nullable String str4) {
        this.f6010a = str;
        this.f6011b = str2;
        this.f6012c = str3;
        this.f6013d = bVar;
        this.f6014e = str4;
    }

    @Nullable
    /* renamed from: b */
    public String mo17482b() {
        return this.f6012c;
    }

    @NonNull
    /* renamed from: c */
    public String mo17483c() {
        return this.f6010a;
    }

    @Nullable
    /* renamed from: d */
    public String mo17484d() {
        return this.f6014e;
    }

    @Nullable
    /* renamed from: e */
    public CrashlyticsReport.C3054d.C3055a.C3057b mo17485e() {
        return this.f6013d;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.C3054d.C3055a.C3057b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3055a)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3055a aVar = (CrashlyticsReport.C3054d.C3055a) obj;
        if (this.f6010a.equals(aVar.mo17483c()) && this.f6011b.equals(aVar.mo17486f()) && ((str = this.f6012c) != null ? str.equals(aVar.mo17482b()) : aVar.mo17482b() == null) && ((bVar = this.f6013d) != null ? bVar.equals(aVar.mo17485e()) : aVar.mo17485e() == null)) {
            String str2 = this.f6014e;
            String d = aVar.mo17484d();
            if (str2 == null) {
                if (d == null) {
                    return true;
                }
            } else if (str2.equals(d)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo17486f() {
        return this.f6011b;
    }

    public int hashCode() {
        int hashCode = (((this.f6010a.hashCode() ^ 1000003) * 1000003) ^ this.f6011b.hashCode()) * 1000003;
        String str = this.f6012c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.C3054d.C3055a.C3057b bVar = this.f6013d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f6014e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        return "Application{identifier=" + this.f6010a + ", version=" + this.f6011b + ", displayVersion=" + this.f6012c + ", organization=" + this.f6013d + ", installationUuid=" + this.f6014e + "}";
    }
}
