package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.d */
final class C2333d extends CrashlyticsReport.C2264c {

    /* renamed from: a */
    private final String f3811a;

    /* renamed from: b */
    private final String f3812b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.d$b */
    static final class C2335b extends CrashlyticsReport.C2264c.C2265a {

        /* renamed from: a */
        private String f3813a;

        /* renamed from: b */
        private String f3814b;

        C2335b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2264c mo18662a() {
            String str = "";
            if (this.f3813a == null) {
                str = str + " key";
            }
            if (this.f3814b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C2333d(this.f3813a, this.f3814b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2264c.C2265a mo18663b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f3813a = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2264c.C2265a mo18664c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f3814b = str;
            return this;
        }
    }

    private C2333d(String str, String str2) {
        this.f3811a = str;
        this.f3812b = str2;
    }

    @NonNull
    /* renamed from: b */
    public String mo18660b() {
        return this.f3811a;
    }

    @NonNull
    /* renamed from: c */
    public String mo18661c() {
        return this.f3812b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2264c)) {
            return false;
        }
        CrashlyticsReport.C2264c cVar = (CrashlyticsReport.C2264c) obj;
        return this.f3811a.equals(cVar.mo18660b()) && this.f3812b.equals(cVar.mo18661c());
    }

    public int hashCode() {
        return ((this.f3811a.hashCode() ^ 1000003) * 1000003) ^ this.f3812b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f3811a + ", value=" + this.f3812b + "}";
    }
}
