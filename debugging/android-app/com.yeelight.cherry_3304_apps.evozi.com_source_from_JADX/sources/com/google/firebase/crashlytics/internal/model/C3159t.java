package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.t */
final class C3159t extends CrashlyticsReport.C3054d.C3081e {

    /* renamed from: a */
    private final int f6119a;

    /* renamed from: b */
    private final String f6120b;

    /* renamed from: c */
    private final String f6121c;

    /* renamed from: d */
    private final boolean f6122d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.t$b */
    static final class C3161b extends CrashlyticsReport.C3054d.C3081e.C3082a {

        /* renamed from: a */
        private Integer f6123a;

        /* renamed from: b */
        private String f6124b;

        /* renamed from: c */
        private String f6125c;

        /* renamed from: d */
        private Boolean f6126d;

        C3161b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3081e mo17623a() {
            String str = "";
            if (this.f6123a == null) {
                str = str + " platform";
            }
            if (this.f6124b == null) {
                str = str + " version";
            }
            if (this.f6125c == null) {
                str = str + " buildVersion";
            }
            if (this.f6126d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C3159t(this.f6123a.intValue(), this.f6124b, this.f6125c, this.f6126d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3081e.C3082a mo17624b(String str) {
            if (str != null) {
                this.f6125c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3081e.C3082a mo17625c(boolean z) {
            this.f6126d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3081e.C3082a mo17626d(int i) {
            this.f6123a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3081e.C3082a mo17627e(String str) {
            if (str != null) {
                this.f6124b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private C3159t(int i, String str, String str2, boolean z) {
        this.f6119a = i;
        this.f6120b = str;
        this.f6121c = str2;
        this.f6122d = z;
    }

    @NonNull
    /* renamed from: b */
    public String mo17619b() {
        return this.f6121c;
    }

    /* renamed from: c */
    public int mo17620c() {
        return this.f6119a;
    }

    @NonNull
    /* renamed from: d */
    public String mo17621d() {
        return this.f6120b;
    }

    /* renamed from: e */
    public boolean mo17622e() {
        return this.f6122d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3081e)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3081e eVar = (CrashlyticsReport.C3054d.C3081e) obj;
        return this.f6119a == eVar.mo17620c() && this.f6120b.equals(eVar.mo17621d()) && this.f6121c.equals(eVar.mo17619b()) && this.f6122d == eVar.mo17622e();
    }

    public int hashCode() {
        return ((((((this.f6119a ^ 1000003) * 1000003) ^ this.f6120b.hashCode()) * 1000003) ^ this.f6121c.hashCode()) * 1000003) ^ (this.f6122d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f6119a + ", version=" + this.f6120b + ", buildVersion=" + this.f6121c + ", jailbroken=" + this.f6122d + "}";
    }
}
