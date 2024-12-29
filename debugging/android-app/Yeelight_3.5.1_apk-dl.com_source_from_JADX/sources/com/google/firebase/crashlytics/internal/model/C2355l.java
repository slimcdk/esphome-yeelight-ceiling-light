package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.l */
final class C2355l extends CrashlyticsReport.C2270e.C2277d.C2278a {

    /* renamed from: a */
    private final CrashlyticsReport.C2270e.C2277d.C2278a.C2280b f3888a;

    /* renamed from: b */
    private final C0628a<CrashlyticsReport.C2264c> f3889b;

    /* renamed from: c */
    private final C0628a<CrashlyticsReport.C2264c> f3890c;

    /* renamed from: d */
    private final Boolean f3891d;

    /* renamed from: e */
    private final int f3892e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.l$b */
    static final class C2357b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2279a {

        /* renamed from: a */
        private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b f3893a;

        /* renamed from: b */
        private C0628a<CrashlyticsReport.C2264c> f3894b;

        /* renamed from: c */
        private C0628a<CrashlyticsReport.C2264c> f3895c;

        /* renamed from: d */
        private Boolean f3896d;

        /* renamed from: e */
        private Integer f3897e;

        C2357b() {
        }

        private C2357b(CrashlyticsReport.C2270e.C2277d.C2278a aVar) {
            this.f3893a = aVar.mo18745d();
            this.f3894b = aVar.mo18744c();
            this.f3895c = aVar.mo18746e();
            this.f3896d = aVar.mo18743b();
            this.f3897e = Integer.valueOf(aVar.mo18747f());
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a mo18749a() {
            String str = "";
            if (this.f3893a == null) {
                str = str + " execution";
            }
            if (this.f3897e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C2355l(this.f3893a, this.f3894b, this.f3895c, this.f3896d, this.f3897e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18750b(@Nullable Boolean bool) {
            this.f3896d = bool;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18751c(C0628a<CrashlyticsReport.C2264c> aVar) {
            this.f3894b = aVar;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18752d(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f3893a = bVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18753e(C0628a<CrashlyticsReport.C2264c> aVar) {
            this.f3895c = aVar;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18754f(int i) {
            this.f3897e = Integer.valueOf(i);
            return this;
        }
    }

    private C2355l(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b bVar, @Nullable C0628a<CrashlyticsReport.C2264c> aVar, @Nullable C0628a<CrashlyticsReport.C2264c> aVar2, @Nullable Boolean bool, int i) {
        this.f3888a = bVar;
        this.f3889b = aVar;
        this.f3890c = aVar2;
        this.f3891d = bool;
        this.f3892e = i;
    }

    @Nullable
    /* renamed from: b */
    public Boolean mo18743b() {
        return this.f3891d;
    }

    @Nullable
    /* renamed from: c */
    public C0628a<CrashlyticsReport.C2264c> mo18744c() {
        return this.f3889b;
    }

    @NonNull
    /* renamed from: d */
    public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b mo18745d() {
        return this.f3888a;
    }

    @Nullable
    /* renamed from: e */
    public C0628a<CrashlyticsReport.C2264c> mo18746e() {
        return this.f3890c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f3890c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f3891d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f3889b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a) r5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b r1 = r4.f3888a
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b r3 = r5.mo18745d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            c1.a<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c> r1 = r4.f3889b
            if (r1 != 0) goto L_0x0022
            c1.a r1 = r5.mo18744c()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            c1.a r3 = r5.mo18744c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            c1.a<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c> r1 = r4.f3890c
            if (r1 != 0) goto L_0x0037
            c1.a r1 = r5.mo18746e()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            c1.a r3 = r5.mo18746e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.f3891d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.mo18743b()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.mo18743b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f3892e
            int r5 = r5.mo18747f()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C2355l.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo18747f() {
        return this.f3892e;
    }

    /* renamed from: g */
    public CrashlyticsReport.C2270e.C2277d.C2278a.C2279a mo18748g() {
        return new C2357b(this);
    }

    public int hashCode() {
        int hashCode = (this.f3888a.hashCode() ^ 1000003) * 1000003;
        C0628a<CrashlyticsReport.C2264c> aVar = this.f3889b;
        int i = 0;
        int hashCode2 = (hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        C0628a<CrashlyticsReport.C2264c> aVar2 = this.f3890c;
        int hashCode3 = (hashCode2 ^ (aVar2 == null ? 0 : aVar2.hashCode())) * 1000003;
        Boolean bool = this.f3891d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f3892e;
    }

    public String toString() {
        return "Application{execution=" + this.f3888a + ", customAttributes=" + this.f3889b + ", internalKeys=" + this.f3890c + ", background=" + this.f3891d + ", uiOrientation=" + this.f3892e + "}";
    }
}
