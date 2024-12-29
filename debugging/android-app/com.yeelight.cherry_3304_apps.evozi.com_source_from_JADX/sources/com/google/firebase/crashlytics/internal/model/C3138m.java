package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;

/* renamed from: com.google.firebase.crashlytics.internal.model.m */
final class C3138m extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a {

    /* renamed from: a */
    private final long f6065a;

    /* renamed from: b */
    private final long f6066b;

    /* renamed from: c */
    private final String f6067c;

    /* renamed from: d */
    private final String f6068d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.m$b */
    static final class C3140b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a {

        /* renamed from: a */
        private Long f6069a;

        /* renamed from: b */
        private Long f6070b;

        /* renamed from: c */
        private String f6071c;

        /* renamed from: d */
        private String f6072d;

        C3140b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a mo17550a() {
            String str = "";
            if (this.f6069a == null) {
                str = str + " baseAddress";
            }
            if (this.f6070b == null) {
                str = str + " size";
            }
            if (this.f6071c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C3138m(this.f6069a.longValue(), this.f6070b.longValue(), this.f6071c, this.f6072d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a mo17551b(long j) {
            this.f6069a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a mo17552c(String str) {
            if (str != null) {
                this.f6071c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a mo17553d(long j) {
            this.f6070b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a mo17554e(@Nullable String str) {
            this.f6072d = str;
            return this;
        }
    }

    private C3138m(long j, long j2, String str, @Nullable String str2) {
        this.f6065a = j;
        this.f6066b = j2;
        this.f6067c = str;
        this.f6068d = str2;
    }

    @NonNull
    /* renamed from: b */
    public long mo17545b() {
        return this.f6065a;
    }

    @NonNull
    /* renamed from: c */
    public String mo17546c() {
        return this.f6067c;
    }

    /* renamed from: d */
    public long mo17547d() {
        return this.f6066b;
    }

    @Encodable.Ignore
    @Nullable
    /* renamed from: e */
    public String mo17548e() {
        return this.f6068d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a aVar = (CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a) obj;
        if (this.f6065a == aVar.mo17545b() && this.f6066b == aVar.mo17547d() && this.f6067c.equals(aVar.mo17546c())) {
            String str = this.f6068d;
            String e = aVar.mo17548e();
            if (str == null) {
                if (e == null) {
                    return true;
                }
            } else if (str.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6065a;
        long j2 = this.f6066b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f6067c.hashCode()) * 1000003;
        String str = this.f6068d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f6065a + ", size=" + this.f6066b + ", name=" + this.f6067c + ", uuid=" + this.f6068d + "}";
    }
}
