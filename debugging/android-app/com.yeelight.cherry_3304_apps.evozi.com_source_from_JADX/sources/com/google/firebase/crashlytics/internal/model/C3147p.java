package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.p */
final class C3147p extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e {

    /* renamed from: a */
    private final String f6089a;

    /* renamed from: b */
    private final int f6090b;

    /* renamed from: c */
    private final C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> f6091c;

    /* renamed from: com.google.firebase.crashlytics.internal.model.p$b */
    static final class C3149b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a {

        /* renamed from: a */
        private String f6092a;

        /* renamed from: b */
        private Integer f6093b;

        /* renamed from: c */
        private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> f6094c;

        C3149b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e mo17582a() {
            String str = "";
            if (this.f6092a == null) {
                str = str + " name";
            }
            if (this.f6093b == null) {
                str = str + " importance";
            }
            if (this.f6094c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C3147p(this.f6092a, this.f6093b.intValue(), this.f6094c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a mo17583b(C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> vVar) {
            if (vVar != null) {
                this.f6094c = vVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a mo17584c(int i) {
            this.f6093b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a mo17585d(String str) {
            if (str != null) {
                this.f6092a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private C3147p(String str, int i, C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> vVar) {
        this.f6089a = str;
        this.f6090b = i;
        this.f6091c = vVar;
    }

    @NonNull
    /* renamed from: b */
    public C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> mo17579b() {
        return this.f6091c;
    }

    /* renamed from: c */
    public int mo17580c() {
        return this.f6090b;
    }

    @NonNull
    /* renamed from: d */
    public String mo17581d() {
        return this.f6089a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e eVar = (CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e) obj;
        return this.f6089a.equals(eVar.mo17581d()) && this.f6090b == eVar.mo17580c() && this.f6091c.equals(eVar.mo17579b());
    }

    public int hashCode() {
        return ((((this.f6089a.hashCode() ^ 1000003) * 1000003) ^ this.f6090b) * 1000003) ^ this.f6091c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f6089a + ", importance=" + this.f6090b + ", frames=" + this.f6091c + "}";
    }
}
