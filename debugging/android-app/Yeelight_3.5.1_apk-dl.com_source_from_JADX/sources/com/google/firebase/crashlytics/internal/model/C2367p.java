package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.p */
final class C2367p extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d {

    /* renamed from: a */
    private final String f3926a;

    /* renamed from: b */
    private final String f3927b;

    /* renamed from: c */
    private final long f3928c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.p$b */
    static final class C2369b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.C2287a {

        /* renamed from: a */
        private String f3929a;

        /* renamed from: b */
        private String f3930b;

        /* renamed from: c */
        private Long f3931c;

        C2369b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d mo18791a() {
            String str = "";
            if (this.f3929a == null) {
                str = str + " name";
            }
            if (this.f3930b == null) {
                str = str + " code";
            }
            if (this.f3931c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C2367p(this.f3929a, this.f3930b, this.f3931c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.C2287a mo18792b(long j) {
            this.f3931c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.C2287a mo18793c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f3930b = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.C2287a mo18794d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f3929a = str;
            return this;
        }
    }

    private C2367p(String str, String str2, long j) {
        this.f3926a = str;
        this.f3927b = str2;
        this.f3928c = j;
    }

    @NonNull
    /* renamed from: b */
    public long mo18788b() {
        return this.f3928c;
    }

    @NonNull
    /* renamed from: c */
    public String mo18789c() {
        return this.f3927b;
    }

    @NonNull
    /* renamed from: d */
    public String mo18790d() {
        return this.f3926a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d dVar = (CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d) obj;
        return this.f3926a.equals(dVar.mo18790d()) && this.f3927b.equals(dVar.mo18789c()) && this.f3928c == dVar.mo18788b();
    }

    public int hashCode() {
        long j = this.f3928c;
        return ((((this.f3926a.hashCode() ^ 1000003) * 1000003) ^ this.f3927b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f3926a + ", code=" + this.f3927b + ", address=" + this.f3928c + "}";
    }
}
