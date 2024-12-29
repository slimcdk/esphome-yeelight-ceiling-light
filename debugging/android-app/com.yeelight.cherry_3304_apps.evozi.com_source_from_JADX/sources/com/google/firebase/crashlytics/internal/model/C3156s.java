package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.s */
final class C3156s extends CrashlyticsReport.C3054d.C3061d.C3079d {

    /* renamed from: a */
    private final String f6117a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.s$b */
    static final class C3158b extends CrashlyticsReport.C3054d.C3061d.C3079d.C3080a {

        /* renamed from: a */
        private String f6118a;

        C3158b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3079d mo17617a() {
            String str = "";
            if (this.f6118a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C3156s(this.f6118a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3079d.C3080a mo17618b(String str) {
            if (str != null) {
                this.f6118a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    private C3156s(String str) {
        this.f6117a = str;
    }

    @NonNull
    /* renamed from: b */
    public String mo17616b() {
        return this.f6117a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C3054d.C3061d.C3079d) {
            return this.f6117a.equals(((CrashlyticsReport.C3054d.C3061d.C3079d) obj).mo17616b());
        }
        return false;
    }

    public int hashCode() {
        return this.f6117a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f6117a + "}";
    }
}
