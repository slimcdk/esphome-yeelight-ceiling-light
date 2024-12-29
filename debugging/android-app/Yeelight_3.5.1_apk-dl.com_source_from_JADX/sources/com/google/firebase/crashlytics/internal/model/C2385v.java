package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.v */
final class C2385v extends CrashlyticsReport.C2270e.C2299f {

    /* renamed from: a */
    private final String f3970a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.v$b */
    static final class C2387b extends CrashlyticsReport.C2270e.C2299f.C2300a {

        /* renamed from: a */
        private String f3971a;

        C2387b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2299f mo18845a() {
            String str = "";
            if (this.f3971a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C2385v(this.f3971a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2299f.C2300a mo18846b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f3971a = str;
            return this;
        }
    }

    private C2385v(String str) {
        this.f3970a = str;
    }

    @NonNull
    /* renamed from: b */
    public String mo18844b() {
        return this.f3970a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C2270e.C2299f) {
            return this.f3970a.equals(((CrashlyticsReport.C2270e.C2299f) obj).mo18844b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3970a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f3970a + "}";
    }
}
