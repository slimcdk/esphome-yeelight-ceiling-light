package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.k */
final class C3132k extends CrashlyticsReport.C3054d.C3061d.C3062a {

    /* renamed from: a */
    private final CrashlyticsReport.C3054d.C3061d.C3062a.C3064b f6049a;

    /* renamed from: b */
    private final C3165v<CrashlyticsReport.C3048b> f6050b;

    /* renamed from: c */
    private final Boolean f6051c;

    /* renamed from: d */
    private final int f6052d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.k$b */
    static final class C3134b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3063a {

        /* renamed from: a */
        private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b f6053a;

        /* renamed from: b */
        private C3165v<CrashlyticsReport.C3048b> f6054b;

        /* renamed from: c */
        private Boolean f6055c;

        /* renamed from: d */
        private Integer f6056d;

        C3134b() {
        }

        private C3134b(CrashlyticsReport.C3054d.C3061d.C3062a aVar) {
            this.f6053a = aVar.mo17533d();
            this.f6054b = aVar.mo17532c();
            this.f6055c = aVar.mo17531b();
            this.f6056d = Integer.valueOf(aVar.mo17534e());
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a mo17536a() {
            String str = "";
            if (this.f6053a == null) {
                str = str + " execution";
            }
            if (this.f6056d == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C3132k(this.f6053a, this.f6054b, this.f6055c, this.f6056d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3063a mo17537b(@Nullable Boolean bool) {
            this.f6055c = bool;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3063a mo17538c(C3165v<CrashlyticsReport.C3048b> vVar) {
            this.f6054b = vVar;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3063a mo17539d(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b bVar) {
            if (bVar != null) {
                this.f6053a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3063a mo17540e(int i) {
            this.f6056d = Integer.valueOf(i);
            return this;
        }
    }

    private C3132k(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b bVar, @Nullable C3165v<CrashlyticsReport.C3048b> vVar, @Nullable Boolean bool, int i) {
        this.f6049a = bVar;
        this.f6050b = vVar;
        this.f6051c = bool;
        this.f6052d = i;
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo17531b() {
        return this.f6051c;
    }

    @Nullable
    /* renamed from: c */
    public C3165v<CrashlyticsReport.C3048b> mo17532c() {
        return this.f6050b;
    }

    @NonNull
    /* renamed from: d */
    public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b mo17533d() {
        return this.f6049a;
    }

    /* renamed from: e */
    public int mo17534e() {
        return this.f6052d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f6051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f6050b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a
            r2 = 0
            if (r1 == 0) goto L_0x004c
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b r1 = r4.f6049a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b r3 = r5.mo17533d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            com.google.firebase.crashlytics.internal.model.v<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b> r1 = r4.f6050b
            if (r1 != 0) goto L_0x0022
            com.google.firebase.crashlytics.internal.model.v r1 = r5.mo17532c()
            if (r1 != 0) goto L_0x004a
            goto L_0x002c
        L_0x0022:
            com.google.firebase.crashlytics.internal.model.v r3 = r5.mo17532c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x002c:
            java.lang.Boolean r1 = r4.f6051c
            if (r1 != 0) goto L_0x0037
            java.lang.Boolean r1 = r5.mo17531b()
            if (r1 != 0) goto L_0x004a
            goto L_0x0041
        L_0x0037:
            java.lang.Boolean r3 = r5.mo17531b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0041:
            int r1 = r4.f6052d
            int r5 = r5.mo17534e()
            if (r1 != r5) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C3132k.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public CrashlyticsReport.C3054d.C3061d.C3062a.C3063a mo17535f() {
        return new C3134b(this);
    }

    public int hashCode() {
        int hashCode = (this.f6049a.hashCode() ^ 1000003) * 1000003;
        C3165v<CrashlyticsReport.C3048b> vVar = this.f6050b;
        int i = 0;
        int hashCode2 = (hashCode ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Boolean bool = this.f6051c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f6052d;
    }

    public String toString() {
        return "Application{execution=" + this.f6049a + ", customAttributes=" + this.f6050b + ", background=" + this.f6051c + ", uiOrientation=" + this.f6052d + "}";
    }
}
