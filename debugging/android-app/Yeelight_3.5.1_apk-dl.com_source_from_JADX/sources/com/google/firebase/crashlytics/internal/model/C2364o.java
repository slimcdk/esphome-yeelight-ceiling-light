package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.o */
final class C2364o extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c {

    /* renamed from: a */
    private final String f3916a;

    /* renamed from: b */
    private final String f3917b;

    /* renamed from: c */
    private final C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> f3918c;

    /* renamed from: d */
    private final CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c f3919d;

    /* renamed from: e */
    private final int f3920e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.o$b */
    static final class C2366b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a {

        /* renamed from: a */
        private String f3921a;

        /* renamed from: b */
        private String f3922b;

        /* renamed from: c */
        private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> f3923c;

        /* renamed from: d */
        private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c f3924d;

        /* renamed from: e */
        private Integer f3925e;

        C2366b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c mo18782a() {
            String str = "";
            if (this.f3921a == null) {
                str = str + " type";
            }
            if (this.f3923c == null) {
                str = str + " frames";
            }
            if (this.f3925e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C2364o(this.f3921a, this.f3922b, this.f3923c, this.f3924d, this.f3925e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a mo18783b(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar) {
            this.f3924d = cVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a mo18784c(C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> aVar) {
            Objects.requireNonNull(aVar, "Null frames");
            this.f3923c = aVar;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a mo18785d(int i) {
            this.f3925e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a mo18786e(String str) {
            this.f3922b = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a mo18787f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f3921a = str;
            return this;
        }
    }

    private C2364o(String str, @Nullable String str2, C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> aVar, @Nullable CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar, int i) {
        this.f3916a = str;
        this.f3917b = str2;
        this.f3918c = aVar;
        this.f3919d = cVar;
        this.f3920e = i;
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c mo18777b() {
        return this.f3919d;
    }

    @NonNull
    /* renamed from: c */
    public C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> mo18778c() {
        return this.f3918c;
    }

    /* renamed from: d */
    public int mo18779d() {
        return this.f3920e;
    }

    @Nullable
    /* renamed from: e */
    public String mo18780e() {
        return this.f3917b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f3919d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f3917b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c r5 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c) r5
            java.lang.String r1 = r4.f3916a
            java.lang.String r3 = r5.mo18781f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f3917b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo18780e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo18780e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            c1.a<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b> r1 = r4.f3918c
            c1.a r3 = r5.mo18778c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c r1 = r4.f3919d
            if (r1 != 0) goto L_0x0043
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c r1 = r5.mo18777b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c r3 = r5.mo18777b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f3920e
            int r5 = r5.mo18779d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C2364o.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo18781f() {
        return this.f3916a;
    }

    public int hashCode() {
        int hashCode = (this.f3916a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3917b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3918c.hashCode()) * 1000003;
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar = this.f3919d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f3920e;
    }

    public String toString() {
        return "Exception{type=" + this.f3916a + ", reason=" + this.f3917b + ", frames=" + this.f3918c + ", causedBy=" + this.f3919d + ", overflowCount=" + this.f3920e + "}";
    }
}
