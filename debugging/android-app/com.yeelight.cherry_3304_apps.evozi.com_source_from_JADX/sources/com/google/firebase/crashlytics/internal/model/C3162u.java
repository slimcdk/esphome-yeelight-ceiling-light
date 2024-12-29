package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.u */
final class C3162u extends CrashlyticsReport.C3054d.C3083f {

    /* renamed from: a */
    private final String f6127a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.u$b */
    static final class C3164b extends CrashlyticsReport.C3054d.C3083f.C3084a {

        /* renamed from: a */
        private String f6128a;

        C3164b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3083f mo17629a() {
            String str = "";
            if (this.f6128a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new C3162u(this.f6128a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3083f.C3084a mo17630b(String str) {
            if (str != null) {
                this.f6128a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    private C3162u(String str) {
        this.f6127a = str;
    }

    @NonNull
    /* renamed from: b */
    public String mo17628b() {
        return this.f6127a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C3054d.C3083f) {
            return this.f6127a.equals(((CrashlyticsReport.C3054d.C3083f) obj).mo17628b());
        }
        return false;
    }

    public int hashCode() {
        return this.f6127a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f6127a + "}";
    }
}
