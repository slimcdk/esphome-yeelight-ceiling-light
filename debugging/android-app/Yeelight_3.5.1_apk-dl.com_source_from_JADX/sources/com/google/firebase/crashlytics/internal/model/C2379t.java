package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.t */
final class C2379t extends CrashlyticsReport.C2270e.C2277d.C2295d {

    /* renamed from: a */
    private final String f3960a;

    /* renamed from: com.google.firebase.crashlytics.internal.model.t$b */
    static final class C2381b extends CrashlyticsReport.C2270e.C2277d.C2295d.C2296a {

        /* renamed from: a */
        private String f3961a;

        C2381b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2295d mo18833a() {
            String str = "";
            if (this.f3961a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new C2379t(this.f3961a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2295d.C2296a mo18834b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f3961a = str;
            return this;
        }
    }

    private C2379t(String str) {
        this.f3960a = str;
    }

    @NonNull
    /* renamed from: b */
    public String mo18832b() {
        return this.f3960a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C2270e.C2277d.C2295d) {
            return this.f3960a.equals(((CrashlyticsReport.C2270e.C2277d.C2295d) obj).mo18832b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3960a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f3960a + "}";
    }
}
