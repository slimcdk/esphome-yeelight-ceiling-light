package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.l */
final class C3135l extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b {

    /* renamed from: a */
    private final C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> f6057a;

    /* renamed from: b */
    private final CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c f6058b;

    /* renamed from: c */
    private final CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d f6059c;

    /* renamed from: d */
    private final C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> f6060d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.l$b */
    static final class C3137b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b {

        /* renamed from: a */
        private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> f6061a;

        /* renamed from: b */
        private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c f6062b;

        /* renamed from: c */
        private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d f6063c;

        /* renamed from: d */
        private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> f6064d;

        C3137b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b mo17556a() {
            String str = "";
            if (this.f6061a == null) {
                str = str + " threads";
            }
            if (this.f6062b == null) {
                str = str + " exception";
            }
            if (this.f6063c == null) {
                str = str + " signal";
            }
            if (this.f6064d == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C3135l(this.f6061a, this.f6062b, this.f6063c, this.f6064d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b mo17557b(C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> vVar) {
            if (vVar != null) {
                this.f6064d = vVar;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b mo17558c(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar) {
            if (cVar != null) {
                this.f6062b = cVar;
                return this;
            }
            throw new NullPointerException("Null exception");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b mo17559d(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d dVar) {
            if (dVar != null) {
                this.f6063c = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b mo17560e(C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> vVar) {
            if (vVar != null) {
                this.f6061a = vVar;
                return this;
            }
            throw new NullPointerException("Null threads");
        }
    }

    private C3135l(C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> vVar, CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar, CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d dVar, C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> vVar2) {
        this.f6057a = vVar;
        this.f6058b = cVar;
        this.f6059c = dVar;
        this.f6060d = vVar2;
    }

    @NonNull
    /* renamed from: b */
    public C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> mo17541b() {
        return this.f6060d;
    }

    @NonNull
    /* renamed from: c */
    public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c mo17542c() {
        return this.f6058b;
    }

    @NonNull
    /* renamed from: d */
    public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d mo17543d() {
        return this.f6059c;
    }

    @NonNull
    /* renamed from: e */
    public C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> mo17544e() {
        return this.f6057a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d.C3062a.C3064b)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b bVar = (CrashlyticsReport.C3054d.C3061d.C3062a.C3064b) obj;
        return this.f6057a.equals(bVar.mo17544e()) && this.f6058b.equals(bVar.mo17542c()) && this.f6059c.equals(bVar.mo17543d()) && this.f6060d.equals(bVar.mo17541b());
    }

    public int hashCode() {
        return ((((((this.f6057a.hashCode() ^ 1000003) * 1000003) ^ this.f6058b.hashCode()) * 1000003) ^ this.f6059c.hashCode()) * 1000003) ^ this.f6060d.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f6057a + ", exception=" + this.f6058b + ", signal=" + this.f6059c + ", binaries=" + this.f6060d + "}";
    }
}
