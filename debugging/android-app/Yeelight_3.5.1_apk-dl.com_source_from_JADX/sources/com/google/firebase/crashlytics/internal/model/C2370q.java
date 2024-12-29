package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.q */
final class C2370q extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e {

    /* renamed from: a */
    private final String f3932a;

    /* renamed from: b */
    private final int f3933b;

    /* renamed from: c */
    private final C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> f3934c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.q$b */
    static final class C2372b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2289a {

        /* renamed from: a */
        private String f3935a;

        /* renamed from: b */
        private Integer f3936b;

        /* renamed from: c */
        private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> f3937c;

        C2372b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e mo18798a() {
            String str = "";
            if (this.f3935a == null) {
                str = str + " name";
            }
            if (this.f3936b == null) {
                str = str + " importance";
            }
            if (this.f3937c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C2370q(this.f3935a, this.f3936b.intValue(), this.f3937c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2289a mo18799b(C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> aVar) {
            Objects.requireNonNull(aVar, "Null frames");
            this.f3937c = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2289a mo18800c(int i) {
            this.f3936b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2289a mo18801d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f3935a = str;
            return this;
        }
    }

    private C2370q(String str, int i, C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> aVar) {
        this.f3932a = str;
        this.f3933b = i;
        this.f3934c = aVar;
    }

    @NonNull
    /* renamed from: b */
    public C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> mo18795b() {
        return this.f3934c;
    }

    /* renamed from: c */
    public int mo18796c() {
        return this.f3933b;
    }

    @NonNull
    /* renamed from: d */
    public String mo18797d() {
        return this.f3932a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e eVar = (CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e) obj;
        return this.f3932a.equals(eVar.mo18797d()) && this.f3933b == eVar.mo18796c() && this.f3934c.equals(eVar.mo18795b());
    }

    public int hashCode() {
        return ((((this.f3932a.hashCode() ^ 1000003) * 1000003) ^ this.f3933b) * 1000003) ^ this.f3934c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f3932a + ", importance=" + this.f3933b + ", frames=" + this.f3934c + "}";
    }
}
