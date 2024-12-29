package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.n */
final class C3141n extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c {

    /* renamed from: a */
    private final String f6073a;

    /* renamed from: b */
    private final String f6074b;

    /* renamed from: c */
    private final C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> f6075c;

    /* renamed from: d */
    private final CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c f6076d;

    /* renamed from: e */
    private final int f6077e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.n$b */
    static final class C3143b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a {

        /* renamed from: a */
        private String f6078a;

        /* renamed from: b */
        private String f6079b;

        /* renamed from: c */
        private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> f6080c;

        /* renamed from: d */
        private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c f6081d;

        /* renamed from: e */
        private Integer f6082e;

        C3143b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c mo17566a() {
            String str = "";
            if (this.f6078a == null) {
                str = str + " type";
            }
            if (this.f6080c == null) {
                str = str + " frames";
            }
            if (this.f6082e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C3141n(this.f6078a, this.f6079b, this.f6080c, this.f6081d, this.f6082e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a mo17567b(CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar) {
            this.f6081d = cVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a mo17568c(C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> vVar) {
            if (vVar != null) {
                this.f6080c = vVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a mo17569d(int i) {
            this.f6082e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a mo17570e(String str) {
            this.f6079b = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a mo17571f(String str) {
            if (str != null) {
                this.f6078a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private C3141n(String str, @Nullable String str2, C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> vVar, @Nullable CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar, int i) {
        this.f6073a = str;
        this.f6074b = str2;
        this.f6075c = vVar;
        this.f6076d = cVar;
        this.f6077e = i;
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c mo17561b() {
        return this.f6076d;
    }

    @NonNull
    /* renamed from: c */
    public C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> mo17562c() {
        return this.f6075c;
    }

    /* renamed from: d */
    public int mo17563d() {
        return this.f6077e;
    }

    @Nullable
    /* renamed from: e */
    public String mo17564e() {
        return this.f6074b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f6076d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f6074b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c) r5
            java.lang.String r1 = r4.f6073a
            java.lang.String r3 = r5.mo17565f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f6074b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo17564e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo17564e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            com.google.firebase.crashlytics.internal.model.v<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b> r1 = r4.f6075c
            com.google.firebase.crashlytics.internal.model.v r3 = r5.mo17562c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c r1 = r4.f6076d
            if (r1 != 0) goto L_0x0043
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c r1 = r5.mo17561b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$c r3 = r5.mo17561b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f6077e
            int r5 = r5.mo17563d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C3141n.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo17565f() {
        return this.f6073a;
    }

    public int hashCode() {
        int hashCode = (this.f6073a.hashCode() ^ 1000003) * 1000003;
        String str = this.f6074b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f6075c.hashCode()) * 1000003;
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c cVar = this.f6076d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f6077e;
    }

    public String toString() {
        return "Exception{type=" + this.f6073a + ", reason=" + this.f6074b + ", frames=" + this.f6075c + ", causedBy=" + this.f6076d + ", overflowCount=" + this.f6077e + "}";
    }
}
