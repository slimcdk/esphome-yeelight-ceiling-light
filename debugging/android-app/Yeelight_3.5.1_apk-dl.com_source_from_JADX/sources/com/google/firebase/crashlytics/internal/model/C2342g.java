package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.g */
final class C2342g extends CrashlyticsReport.C2270e {

    /* renamed from: a */
    private final String f3823a;

    /* renamed from: b */
    private final String f3824b;

    /* renamed from: c */
    private final long f3825c;

    /* renamed from: d */
    private final Long f3826d;

    /* renamed from: e */
    private final boolean f3827e;

    /* renamed from: f */
    private final CrashlyticsReport.C2270e.C2271a f3828f;

    /* renamed from: g */
    private final CrashlyticsReport.C2270e.C2299f f3829g;

    /* renamed from: h */
    private final CrashlyticsReport.C2270e.C2297e f3830h;

    /* renamed from: i */
    private final CrashlyticsReport.C2270e.C2275c f3831i;

    /* renamed from: j */
    private final C0628a<CrashlyticsReport.C2270e.C2277d> f3832j;

    /* renamed from: k */
    private final int f3833k;

    /* renamed from: com.google.firebase.crashlytics.internal.model.g$b */
    static final class C2344b extends CrashlyticsReport.C2270e.C2274b {

        /* renamed from: a */
        private String f3834a;

        /* renamed from: b */
        private String f3835b;

        /* renamed from: c */
        private Long f3836c;

        /* renamed from: d */
        private Long f3837d;

        /* renamed from: e */
        private Boolean f3838e;

        /* renamed from: f */
        private CrashlyticsReport.C2270e.C2271a f3839f;

        /* renamed from: g */
        private CrashlyticsReport.C2270e.C2299f f3840g;

        /* renamed from: h */
        private CrashlyticsReport.C2270e.C2297e f3841h;

        /* renamed from: i */
        private CrashlyticsReport.C2270e.C2275c f3842i;

        /* renamed from: j */
        private C0628a<CrashlyticsReport.C2270e.C2277d> f3843j;

        /* renamed from: k */
        private Integer f3844k;

        C2344b() {
        }

        private C2344b(CrashlyticsReport.C2270e eVar) {
            this.f3834a = eVar.mo18679f();
            this.f3835b = eVar.mo18681h();
            this.f3836c = Long.valueOf(eVar.mo18684k());
            this.f3837d = eVar.mo18677d();
            this.f3838e = Boolean.valueOf(eVar.mo18686m());
            this.f3839f = eVar.mo18675b();
            this.f3840g = eVar.mo18685l();
            this.f3841h = eVar.mo18683j();
            this.f3842i = eVar.mo18676c();
            this.f3843j = eVar.mo18678e();
            this.f3844k = Integer.valueOf(eVar.mo18680g());
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e mo18705a() {
            String str = "";
            if (this.f3834a == null) {
                str = str + " generator";
            }
            if (this.f3835b == null) {
                str = str + " identifier";
            }
            if (this.f3836c == null) {
                str = str + " startedAt";
            }
            if (this.f3838e == null) {
                str = str + " crashed";
            }
            if (this.f3839f == null) {
                str = str + " app";
            }
            if (this.f3844k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C2342g(this.f3834a, this.f3835b, this.f3836c.longValue(), this.f3837d, this.f3838e.booleanValue(), this.f3839f, this.f3840g, this.f3841h, this.f3842i, this.f3843j, this.f3844k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2274b mo18706b(CrashlyticsReport.C2270e.C2271a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f3839f = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2274b mo18707c(boolean z) {
            this.f3838e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2274b mo18708d(CrashlyticsReport.C2270e.C2275c cVar) {
            this.f3842i = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2274b mo18709e(Long l) {
            this.f3837d = l;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2274b mo18710f(C0628a<CrashlyticsReport.C2270e.C2277d> aVar) {
            this.f3843j = aVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2270e.C2274b mo18711g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f3834a = str;
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C2270e.C2274b mo18712h(int i) {
            this.f3844k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C2270e.C2274b mo18713i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f3835b = str;
            return this;
        }

        /* renamed from: k */
        public CrashlyticsReport.C2270e.C2274b mo18715k(CrashlyticsReport.C2270e.C2297e eVar) {
            this.f3841h = eVar;
            return this;
        }

        /* renamed from: l */
        public CrashlyticsReport.C2270e.C2274b mo18716l(long j) {
            this.f3836c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public CrashlyticsReport.C2270e.C2274b mo18717m(CrashlyticsReport.C2270e.C2299f fVar) {
            this.f3840g = fVar;
            return this;
        }
    }

    private C2342g(String str, String str2, long j, @Nullable Long l, boolean z, CrashlyticsReport.C2270e.C2271a aVar, @Nullable CrashlyticsReport.C2270e.C2299f fVar, @Nullable CrashlyticsReport.C2270e.C2297e eVar, @Nullable CrashlyticsReport.C2270e.C2275c cVar, @Nullable C0628a<CrashlyticsReport.C2270e.C2277d> aVar2, int i) {
        this.f3823a = str;
        this.f3824b = str2;
        this.f3825c = j;
        this.f3826d = l;
        this.f3827e = z;
        this.f3828f = aVar;
        this.f3829g = fVar;
        this.f3830h = eVar;
        this.f3831i = cVar;
        this.f3832j = aVar2;
        this.f3833k = i;
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C2270e.C2271a mo18675b() {
        return this.f3828f;
    }

    @Nullable
    /* renamed from: c */
    public CrashlyticsReport.C2270e.C2275c mo18676c() {
        return this.f3831i;
    }

    @Nullable
    /* renamed from: d */
    public Long mo18677d() {
        return this.f3826d;
    }

    @Nullable
    /* renamed from: e */
    public C0628a<CrashlyticsReport.C2270e.C2277d> mo18678e() {
        return this.f3832j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f3826d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f3829g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f3830h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f3831i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f3832j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e) r8
            java.lang.String r1 = r7.f3823a
            java.lang.String r3 = r8.mo18679f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f3824b
            java.lang.String r3 = r8.mo18681h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f3825c
            long r5 = r8.mo18684k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f3826d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.mo18677d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.mo18677d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f3827e
            boolean r3 = r8.mo18686m()
            if (r1 != r3) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a r1 = r7.f3828f
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a r3 = r8.mo18675b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f r1 = r7.f3829g
            if (r1 != 0) goto L_0x0061
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f r1 = r8.mo18685l()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f r3 = r8.mo18685l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e r1 = r7.f3830h
            if (r1 != 0) goto L_0x0076
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e r1 = r8.mo18683j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e r3 = r8.mo18683j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c r1 = r7.f3831i
            if (r1 != 0) goto L_0x008b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c r1 = r8.mo18676c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c r3 = r8.mo18676c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            c1.a<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d> r1 = r7.f3832j
            if (r1 != 0) goto L_0x00a0
            c1.a r1 = r8.mo18678e()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            c1.a r3 = r8.mo18678e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f3833k
            int r8 = r8.mo18680g()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C2342g.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo18679f() {
        return this.f3823a;
    }

    /* renamed from: g */
    public int mo18680g() {
        return this.f3833k;
    }

    @NonNull
    @Encodable.Ignore
    /* renamed from: h */
    public String mo18681h() {
        return this.f3824b;
    }

    public int hashCode() {
        long j = this.f3825c;
        int hashCode = (((((this.f3823a.hashCode() ^ 1000003) * 1000003) ^ this.f3824b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f3826d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f3827e ? 1231 : 1237)) * 1000003) ^ this.f3828f.hashCode()) * 1000003;
        CrashlyticsReport.C2270e.C2299f fVar = this.f3829g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.C2270e.C2297e eVar = this.f3830h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.C2270e.C2275c cVar = this.f3831i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C0628a<CrashlyticsReport.C2270e.C2277d> aVar = this.f3832j;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f3833k;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C2270e.C2297e mo18683j() {
        return this.f3830h;
    }

    /* renamed from: k */
    public long mo18684k() {
        return this.f3825c;
    }

    @Nullable
    /* renamed from: l */
    public CrashlyticsReport.C2270e.C2299f mo18685l() {
        return this.f3829g;
    }

    /* renamed from: m */
    public boolean mo18686m() {
        return this.f3827e;
    }

    /* renamed from: n */
    public CrashlyticsReport.C2270e.C2274b mo18687n() {
        return new C2344b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f3823a + ", identifier=" + this.f3824b + ", startedAt=" + this.f3825c + ", endedAt=" + this.f3826d + ", crashed=" + this.f3827e + ", app=" + this.f3828f + ", user=" + this.f3829g + ", os=" + this.f3830h + ", device=" + this.f3831i + ", events=" + this.f3832j + ", generatorType=" + this.f3833k + "}";
    }
}
