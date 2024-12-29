package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.o */
final class C3144o extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d {

    /* renamed from: a */
    private final String f6083a;

    /* renamed from: b */
    private final String f6084b;

    /* renamed from: c */
    private final long f6085c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.o$b */
    static final class C3146b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a {

        /* renamed from: a */
        private String f6086a;

        /* renamed from: b */
        private String f6087b;

        /* renamed from: c */
        private Long f6088c;

        C3146b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d mo17575a() {
            String str = "";
            if (this.f6086a == null) {
                str = str + " name";
            }
            if (this.f6087b == null) {
                str = str + " code";
            }
            if (this.f6088c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C3144o(this.f6086a, this.f6087b, this.f6088c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a mo17576b(long j) {
            this.f6088c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a mo17577c(String str) {
            if (str != null) {
                this.f6087b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a mo17578d(String str) {
            if (str != null) {
                this.f6086a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private C3144o(String str, String str2, long j) {
        this.f6083a = str;
        this.f6084b = str2;
        this.f6085c = j;
    }

    @NonNull
    /* renamed from: b */
    public long mo17572b() {
        return this.f6085c;
    }

    @NonNull
    /* renamed from: c */
    public String mo17573c() {
        return this.f6084b;
    }

    @NonNull
    /* renamed from: d */
    public String mo17574d() {
        return this.f6083a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d dVar = (CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d) obj;
        return this.f6083a.equals(dVar.mo17574d()) && this.f6084b.equals(dVar.mo17573c()) && this.f6085c == dVar.mo17572b();
    }

    public int hashCode() {
        long j = this.f6085c;
        return ((((this.f6083a.hashCode() ^ 1000003) * 1000003) ^ this.f6084b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f6083a + ", code=" + this.f6084b + ", address=" + this.f6085c + "}";
    }
}
