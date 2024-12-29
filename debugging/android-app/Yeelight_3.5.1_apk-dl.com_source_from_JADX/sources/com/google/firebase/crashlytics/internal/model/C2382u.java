package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.u */
final class C2382u extends CrashlyticsReport.C2270e.C2297e {

    /* renamed from: a */
    private final int f3962a;

    /* renamed from: b */
    private final String f3963b;

    /* renamed from: c */
    private final String f3964c;

    /* renamed from: d */
    private final boolean f3965d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.u$b */
    static final class C2384b extends CrashlyticsReport.C2270e.C2297e.C2298a {

        /* renamed from: a */
        private Integer f3966a;

        /* renamed from: b */
        private String f3967b;

        /* renamed from: c */
        private String f3968c;

        /* renamed from: d */
        private Boolean f3969d;

        C2384b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2297e mo18839a() {
            String str = "";
            if (this.f3966a == null) {
                str = str + " platform";
            }
            if (this.f3967b == null) {
                str = str + " version";
            }
            if (this.f3968c == null) {
                str = str + " buildVersion";
            }
            if (this.f3969d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C2382u(this.f3966a.intValue(), this.f3967b, this.f3968c, this.f3969d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2297e.C2298a mo18840b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f3968c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2297e.C2298a mo18841c(boolean z) {
            this.f3969d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2297e.C2298a mo18842d(int i) {
            this.f3966a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2297e.C2298a mo18843e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f3967b = str;
            return this;
        }
    }

    private C2382u(int i, String str, String str2, boolean z) {
        this.f3962a = i;
        this.f3963b = str;
        this.f3964c = str2;
        this.f3965d = z;
    }

    @NonNull
    /* renamed from: b */
    public String mo18835b() {
        return this.f3964c;
    }

    /* renamed from: c */
    public int mo18836c() {
        return this.f3962a;
    }

    @NonNull
    /* renamed from: d */
    public String mo18837d() {
        return this.f3963b;
    }

    /* renamed from: e */
    public boolean mo18838e() {
        return this.f3965d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2297e)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2297e eVar = (CrashlyticsReport.C2270e.C2297e) obj;
        return this.f3962a == eVar.mo18836c() && this.f3963b.equals(eVar.mo18837d()) && this.f3964c.equals(eVar.mo18835b()) && this.f3965d == eVar.mo18838e();
    }

    public int hashCode() {
        return ((((((this.f3962a ^ 1000003) * 1000003) ^ this.f3963b.hashCode()) * 1000003) ^ this.f3964c.hashCode()) * 1000003) ^ (this.f3965d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f3962a + ", version=" + this.f3963b + ", buildVersion=" + this.f3964c + ", jailbroken=" + this.f3965d + "}";
    }
}
