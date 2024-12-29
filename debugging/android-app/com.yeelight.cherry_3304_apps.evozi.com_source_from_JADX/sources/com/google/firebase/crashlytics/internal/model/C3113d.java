package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.d */
final class C3113d extends CrashlyticsReport.C3050c {

    /* renamed from: a */
    private final C3165v<CrashlyticsReport.C3050c.C3052b> f5980a;

    /* renamed from: b */
    private final String f5981b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.d$b */
    static final class C3115b extends CrashlyticsReport.C3050c.C3051a {

        /* renamed from: a */
        private C3165v<CrashlyticsReport.C3050c.C3052b> f5982a;

        /* renamed from: b */
        private String f5983b;

        C3115b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3050c mo17459a() {
            String str = "";
            if (this.f5982a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C3113d(this.f5982a, this.f5983b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3050c.C3051a mo17460b(C3165v<CrashlyticsReport.C3050c.C3052b> vVar) {
            if (vVar != null) {
                this.f5982a = vVar;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3050c.C3051a mo17461c(String str) {
            this.f5983b = str;
            return this;
        }
    }

    private C3113d(C3165v<CrashlyticsReport.C3050c.C3052b> vVar, @Nullable String str) {
        this.f5980a = vVar;
        this.f5981b = str;
    }

    @NonNull
    /* renamed from: b */
    public C3165v<CrashlyticsReport.C3050c.C3052b> mo17457b() {
        return this.f5980a;
    }

    @Nullable
    /* renamed from: c */
    public String mo17458c() {
        return this.f5981b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3050c)) {
            return false;
        }
        CrashlyticsReport.C3050c cVar = (CrashlyticsReport.C3050c) obj;
        if (this.f5980a.equals(cVar.mo17457b())) {
            String str = this.f5981b;
            String c = cVar.mo17458c();
            if (str == null) {
                if (c == null) {
                    return true;
                }
            } else if (str.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f5980a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5981b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f5980a + ", orgId=" + this.f5981b + "}";
    }
}
