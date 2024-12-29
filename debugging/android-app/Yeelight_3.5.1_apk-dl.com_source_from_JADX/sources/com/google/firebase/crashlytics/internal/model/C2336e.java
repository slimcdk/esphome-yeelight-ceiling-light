package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.e */
final class C2336e extends CrashlyticsReport.C2266d {

    /* renamed from: a */
    private final C0628a<CrashlyticsReport.C2266d.C2268b> f3815a;

    /* renamed from: b */
    private final String f3816b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.e$b */
    static final class C2338b extends CrashlyticsReport.C2266d.C2267a {

        /* renamed from: a */
        private C0628a<CrashlyticsReport.C2266d.C2268b> f3817a;

        /* renamed from: b */
        private String f3818b;

        C2338b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2266d mo18667a() {
            String str = "";
            if (this.f3817a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new C2336e(this.f3817a, this.f3818b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2266d.C2267a mo18668b(C0628a<CrashlyticsReport.C2266d.C2268b> aVar) {
            Objects.requireNonNull(aVar, "Null files");
            this.f3817a = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2266d.C2267a mo18669c(String str) {
            this.f3818b = str;
            return this;
        }
    }

    private C2336e(C0628a<CrashlyticsReport.C2266d.C2268b> aVar, @Nullable String str) {
        this.f3815a = aVar;
        this.f3816b = str;
    }

    @NonNull
    /* renamed from: b */
    public C0628a<CrashlyticsReport.C2266d.C2268b> mo18665b() {
        return this.f3815a;
    }

    @Nullable
    /* renamed from: c */
    public String mo18666c() {
        return this.f3816b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2266d)) {
            return false;
        }
        CrashlyticsReport.C2266d dVar = (CrashlyticsReport.C2266d) obj;
        if (this.f3815a.equals(dVar.mo18665b())) {
            String str = this.f3816b;
            String c = dVar.mo18666c();
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
        int hashCode = (this.f3815a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3816b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f3815a + ", orgId=" + this.f3816b + "}";
    }
}
