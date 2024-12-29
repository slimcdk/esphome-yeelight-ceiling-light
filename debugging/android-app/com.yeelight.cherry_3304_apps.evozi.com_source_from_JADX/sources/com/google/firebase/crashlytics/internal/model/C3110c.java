package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.c */
final class C3110c extends CrashlyticsReport.C3048b {

    /* renamed from: a */
    private final String f5976a;

    /* renamed from: b */
    private final String f5977b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.c$b */
    static final class C3112b extends CrashlyticsReport.C3048b.C3049a {

        /* renamed from: a */
        private String f5978a;

        /* renamed from: b */
        private String f5979b;

        C3112b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3048b mo17454a() {
            String str = "";
            if (this.f5978a == null) {
                str = str + " key";
            }
            if (this.f5979b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C3110c(this.f5978a, this.f5979b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3048b.C3049a mo17455b(String str) {
            if (str != null) {
                this.f5978a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3048b.C3049a mo17456c(String str) {
            if (str != null) {
                this.f5979b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    private C3110c(String str, String str2) {
        this.f5976a = str;
        this.f5977b = str2;
    }

    @NonNull
    /* renamed from: b */
    public String mo17452b() {
        return this.f5976a;
    }

    @NonNull
    /* renamed from: c */
    public String mo17453c() {
        return this.f5977b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3048b)) {
            return false;
        }
        CrashlyticsReport.C3048b bVar = (CrashlyticsReport.C3048b) obj;
        return this.f5976a.equals(bVar.mo17452b()) && this.f5977b.equals(bVar.mo17453c());
    }

    public int hashCode() {
        return ((this.f5976a.hashCode() ^ 1000003) * 1000003) ^ this.f5977b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f5976a + ", value=" + this.f5977b + "}";
    }
}
