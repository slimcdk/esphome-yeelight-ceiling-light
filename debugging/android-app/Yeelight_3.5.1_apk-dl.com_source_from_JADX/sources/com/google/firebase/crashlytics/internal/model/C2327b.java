package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.b */
final class C2327b extends CrashlyticsReport {

    /* renamed from: b */
    private final String f3779b;

    /* renamed from: c */
    private final String f3780c;

    /* renamed from: d */
    private final int f3781d;

    /* renamed from: e */
    private final String f3782e;

    /* renamed from: f */
    private final String f3783f;

    /* renamed from: g */
    private final String f3784g;

    /* renamed from: h */
    private final CrashlyticsReport.C2270e f3785h;

    /* renamed from: i */
    private final CrashlyticsReport.C2266d f3786i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b */
    static final class C2329b extends CrashlyticsReport.C2263b {

        /* renamed from: a */
        private String f3787a;

        /* renamed from: b */
        private String f3788b;

        /* renamed from: c */
        private Integer f3789c;

        /* renamed from: d */
        private String f3790d;

        /* renamed from: e */
        private String f3791e;

        /* renamed from: f */
        private String f3792f;

        /* renamed from: g */
        private CrashlyticsReport.C2270e f3793g;

        /* renamed from: h */
        private CrashlyticsReport.C2266d f3794h;

        C2329b() {
        }

        private C2329b(CrashlyticsReport crashlyticsReport) {
            this.f3787a = crashlyticsReport.mo18628i();
            this.f3788b = crashlyticsReport.mo18624e();
            this.f3789c = Integer.valueOf(crashlyticsReport.mo18627h());
            this.f3790d = crashlyticsReport.mo18625f();
            this.f3791e = crashlyticsReport.mo18622c();
            this.f3792f = crashlyticsReport.mo18623d();
            this.f3793g = crashlyticsReport.mo18629j();
            this.f3794h = crashlyticsReport.mo18626g();
        }

        /* renamed from: a */
        public CrashlyticsReport mo18651a() {
            String str = "";
            if (this.f3787a == null) {
                str = str + " sdkVersion";
            }
            if (this.f3788b == null) {
                str = str + " gmpAppId";
            }
            if (this.f3789c == null) {
                str = str + " platform";
            }
            if (this.f3790d == null) {
                str = str + " installationUuid";
            }
            if (this.f3791e == null) {
                str = str + " buildVersion";
            }
            if (this.f3792f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C2327b(this.f3787a, this.f3788b, this.f3789c.intValue(), this.f3790d, this.f3791e, this.f3792f, this.f3793g, this.f3794h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2263b mo18652b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f3791e = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2263b mo18653c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f3792f = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2263b mo18654d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f3788b = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2263b mo18655e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f3790d = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2263b mo18656f(CrashlyticsReport.C2266d dVar) {
            this.f3794h = dVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2263b mo18657g(int i) {
            this.f3789c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C2263b mo18658h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f3787a = str;
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C2263b mo18659i(CrashlyticsReport.C2270e eVar) {
            this.f3793g = eVar;
            return this;
        }
    }

    private C2327b(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.C2270e eVar, @Nullable CrashlyticsReport.C2266d dVar) {
        this.f3779b = str;
        this.f3780c = str2;
        this.f3781d = i;
        this.f3782e = str3;
        this.f3783f = str4;
        this.f3784g = str5;
        this.f3785h = eVar;
        this.f3786i = dVar;
    }

    @NonNull
    /* renamed from: c */
    public String mo18622c() {
        return this.f3783f;
    }

    @NonNull
    /* renamed from: d */
    public String mo18623d() {
        return this.f3784g;
    }

    @NonNull
    /* renamed from: e */
    public String mo18624e() {
        return this.f3780c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.C2270e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f3779b.equals(crashlyticsReport.mo18628i()) && this.f3780c.equals(crashlyticsReport.mo18624e()) && this.f3781d == crashlyticsReport.mo18627h() && this.f3782e.equals(crashlyticsReport.mo18625f()) && this.f3783f.equals(crashlyticsReport.mo18622c()) && this.f3784g.equals(crashlyticsReport.mo18623d()) && ((eVar = this.f3785h) != null ? eVar.equals(crashlyticsReport.mo18629j()) : crashlyticsReport.mo18629j() == null)) {
            CrashlyticsReport.C2266d dVar = this.f3786i;
            CrashlyticsReport.C2266d g = crashlyticsReport.mo18626g();
            if (dVar == null) {
                if (g == null) {
                    return true;
                }
            } else if (dVar.equals(g)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo18625f() {
        return this.f3782e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.C2266d mo18626g() {
        return this.f3786i;
    }

    /* renamed from: h */
    public int mo18627h() {
        return this.f3781d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f3779b.hashCode() ^ 1000003) * 1000003) ^ this.f3780c.hashCode()) * 1000003) ^ this.f3781d) * 1000003) ^ this.f3782e.hashCode()) * 1000003) ^ this.f3783f.hashCode()) * 1000003) ^ this.f3784g.hashCode()) * 1000003;
        CrashlyticsReport.C2270e eVar = this.f3785h;
        int i = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.C2266d dVar = this.f3786i;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    @NonNull
    /* renamed from: i */
    public String mo18628i() {
        return this.f3779b;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C2270e mo18629j() {
        return this.f3785h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CrashlyticsReport.C2263b mo18630k() {
        return new C2329b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f3779b + ", gmpAppId=" + this.f3780c + ", platform=" + this.f3781d + ", installationUuid=" + this.f3782e + ", buildVersion=" + this.f3783f + ", displayVersion=" + this.f3784g + ", session=" + this.f3785h + ", ndkPayload=" + this.f3786i + "}";
    }
}
