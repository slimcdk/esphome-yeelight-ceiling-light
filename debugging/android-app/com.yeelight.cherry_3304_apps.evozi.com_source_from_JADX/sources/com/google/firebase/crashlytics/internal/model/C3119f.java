package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;

/* renamed from: com.google.firebase.crashlytics.internal.model.f */
final class C3119f extends CrashlyticsReport.C3054d {

    /* renamed from: a */
    private final String f5988a;

    /* renamed from: b */
    private final String f5989b;

    /* renamed from: c */
    private final long f5990c;

    /* renamed from: d */
    private final Long f5991d;

    /* renamed from: e */
    private final boolean f5992e;

    /* renamed from: f */
    private final CrashlyticsReport.C3054d.C3055a f5993f;

    /* renamed from: g */
    private final CrashlyticsReport.C3054d.C3083f f5994g;

    /* renamed from: h */
    private final CrashlyticsReport.C3054d.C3081e f5995h;

    /* renamed from: i */
    private final CrashlyticsReport.C3054d.C3059c f5996i;

    /* renamed from: j */
    private final C3165v<CrashlyticsReport.C3054d.C3061d> f5997j;

    /* renamed from: k */
    private final int f5998k;

    /* renamed from: com.google.firebase.crashlytics.internal.model.f$b */
    static final class C3121b extends CrashlyticsReport.C3054d.C3058b {

        /* renamed from: a */
        private String f5999a;

        /* renamed from: b */
        private String f6000b;

        /* renamed from: c */
        private Long f6001c;

        /* renamed from: d */
        private Long f6002d;

        /* renamed from: e */
        private Boolean f6003e;

        /* renamed from: f */
        private CrashlyticsReport.C3054d.C3055a f6004f;

        /* renamed from: g */
        private CrashlyticsReport.C3054d.C3083f f6005g;

        /* renamed from: h */
        private CrashlyticsReport.C3054d.C3081e f6006h;

        /* renamed from: i */
        private CrashlyticsReport.C3054d.C3059c f6007i;

        /* renamed from: j */
        private C3165v<CrashlyticsReport.C3054d.C3061d> f6008j;

        /* renamed from: k */
        private Integer f6009k;

        C3121b() {
        }

        private C3121b(CrashlyticsReport.C3054d dVar) {
            this.f5999a = dVar.mo17471f();
            this.f6000b = dVar.mo17473h();
            this.f6001c = Long.valueOf(dVar.mo17476k());
            this.f6002d = dVar.mo17469d();
            this.f6003e = Boolean.valueOf(dVar.mo17478m());
            this.f6004f = dVar.mo17467b();
            this.f6005g = dVar.mo17477l();
            this.f6006h = dVar.mo17475j();
            this.f6007i = dVar.mo17468c();
            this.f6008j = dVar.mo17470e();
            this.f6009k = Integer.valueOf(dVar.mo17472g());
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d mo17493a() {
            String str = "";
            if (this.f5999a == null) {
                str = str + " generator";
            }
            if (this.f6000b == null) {
                str = str + " identifier";
            }
            if (this.f6001c == null) {
                str = str + " startedAt";
            }
            if (this.f6003e == null) {
                str = str + " crashed";
            }
            if (this.f6004f == null) {
                str = str + " app";
            }
            if (this.f6009k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C3119f(this.f5999a, this.f6000b, this.f6001c.longValue(), this.f6002d, this.f6003e.booleanValue(), this.f6004f, this.f6005g, this.f6006h, this.f6007i, this.f6008j, this.f6009k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3058b mo17494b(CrashlyticsReport.C3054d.C3055a aVar) {
            if (aVar != null) {
                this.f6004f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3058b mo17495c(boolean z) {
            this.f6003e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3058b mo17496d(CrashlyticsReport.C3054d.C3059c cVar) {
            this.f6007i = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3058b mo17497e(Long l) {
            this.f6002d = l;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3058b mo17498f(C3165v<CrashlyticsReport.C3054d.C3061d> vVar) {
            this.f6008j = vVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C3054d.C3058b mo17499g(String str) {
            if (str != null) {
                this.f5999a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        /* renamed from: h */
        public CrashlyticsReport.C3054d.C3058b mo17500h(int i) {
            this.f6009k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C3054d.C3058b mo17501i(String str) {
            if (str != null) {
                this.f6000b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        /* renamed from: k */
        public CrashlyticsReport.C3054d.C3058b mo17503k(CrashlyticsReport.C3054d.C3081e eVar) {
            this.f6006h = eVar;
            return this;
        }

        /* renamed from: l */
        public CrashlyticsReport.C3054d.C3058b mo17504l(long j) {
            this.f6001c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public CrashlyticsReport.C3054d.C3058b mo17505m(CrashlyticsReport.C3054d.C3083f fVar) {
            this.f6005g = fVar;
            return this;
        }
    }

    private C3119f(String str, String str2, long j, @Nullable Long l, boolean z, CrashlyticsReport.C3054d.C3055a aVar, @Nullable CrashlyticsReport.C3054d.C3083f fVar, @Nullable CrashlyticsReport.C3054d.C3081e eVar, @Nullable CrashlyticsReport.C3054d.C3059c cVar, @Nullable C3165v<CrashlyticsReport.C3054d.C3061d> vVar, int i) {
        this.f5988a = str;
        this.f5989b = str2;
        this.f5990c = j;
        this.f5991d = l;
        this.f5992e = z;
        this.f5993f = aVar;
        this.f5994g = fVar;
        this.f5995h = eVar;
        this.f5996i = cVar;
        this.f5997j = vVar;
        this.f5998k = i;
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C3054d.C3055a mo17467b() {
        return this.f5993f;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C3054d.C3059c mo17468c() {
        return this.f5996i;
    }

    @Nullable
    /* renamed from: d */
    public Long mo17469d() {
        return this.f5991d;
    }

    @Nullable
    /* renamed from: e */
    public C3165v<CrashlyticsReport.C3054d.C3061d> mo17470e() {
        return this.f5997j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f5991d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f5994g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f5995h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f5996i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f5997j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d) r8
            java.lang.String r1 = r7.f5988a
            java.lang.String r3 = r8.mo17471f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f5989b
            java.lang.String r3 = r8.mo17473h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f5990c
            long r5 = r8.mo17476k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f5991d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.mo17469d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.mo17469d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f5992e
            boolean r3 = r8.mo17478m()
            if (r1 != r3) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a r1 = r7.f5993f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a r3 = r8.mo17467b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$f r1 = r7.f5994g
            if (r1 != 0) goto L_0x0061
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$f r1 = r8.mo17477l()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$f r3 = r8.mo17477l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$e r1 = r7.f5995h
            if (r1 != 0) goto L_0x0076
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$e r1 = r8.mo17475j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$e r3 = r8.mo17475j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$c r1 = r7.f5996i
            if (r1 != 0) goto L_0x008b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$c r1 = r8.mo17468c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$c r3 = r8.mo17468c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            com.google.firebase.crashlytics.internal.model.v<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d> r1 = r7.f5997j
            if (r1 != 0) goto L_0x00a0
            com.google.firebase.crashlytics.internal.model.v r1 = r8.mo17470e()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            com.google.firebase.crashlytics.internal.model.v r3 = r8.mo17470e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f5998k
            int r8 = r8.mo17472g()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C3119f.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo17471f() {
        return this.f5988a;
    }

    /* renamed from: g */
    public int mo17472g() {
        return this.f5998k;
    }

    @NonNull
    @Encodable.Ignore
    /* renamed from: h */
    public String mo17473h() {
        return this.f5989b;
    }

    public int hashCode() {
        long j = this.f5990c;
        int hashCode = (((((this.f5988a.hashCode() ^ 1000003) * 1000003) ^ this.f5989b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f5991d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f5992e ? 1231 : 1237)) * 1000003) ^ this.f5993f.hashCode()) * 1000003;
        CrashlyticsReport.C3054d.C3083f fVar = this.f5994g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.C3054d.C3081e eVar = this.f5995h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.C3054d.C3059c cVar = this.f5996i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C3165v<CrashlyticsReport.C3054d.C3061d> vVar = this.f5997j;
        if (vVar != null) {
            i = vVar.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f5998k;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C3054d.C3081e mo17475j() {
        return this.f5995h;
    }

    /* renamed from: k */
    public long mo17476k() {
        return this.f5990c;
    }

    @Nullable
    /* renamed from: l */
    public CrashlyticsReport.C3054d.C3083f mo17477l() {
        return this.f5994g;
    }

    /* renamed from: m */
    public boolean mo17478m() {
        return this.f5992e;
    }

    /* renamed from: n */
    public CrashlyticsReport.C3054d.C3058b mo17479n() {
        return new C3121b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f5988a + ", identifier=" + this.f5989b + ", startedAt=" + this.f5990c + ", endedAt=" + this.f5991d + ", crashed=" + this.f5992e + ", app=" + this.f5993f + ", user=" + this.f5994g + ", os=" + this.f5995h + ", device=" + this.f5996i + ", events=" + this.f5997j + ", generatorType=" + this.f5998k + "}";
    }
}
