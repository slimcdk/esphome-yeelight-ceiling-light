package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.r */
final class C2373r extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b {

    /* renamed from: a */
    private final long f3938a;

    /* renamed from: b */
    private final String f3939b;

    /* renamed from: c */
    private final String f3940c;

    /* renamed from: d */
    private final long f3941d;

    /* renamed from: e */
    private final int f3942e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.r$b */
    static final class C2375b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a {

        /* renamed from: a */
        private Long f3943a;

        /* renamed from: b */
        private String f3944b;

        /* renamed from: c */
        private String f3945c;

        /* renamed from: d */
        private Long f3946d;

        /* renamed from: e */
        private Integer f3947e;

        C2375b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b mo18807a() {
            String str = "";
            if (this.f3943a == null) {
                str = str + " pc";
            }
            if (this.f3944b == null) {
                str = str + " symbol";
            }
            if (this.f3946d == null) {
                str = str + " offset";
            }
            if (this.f3947e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C2373r(this.f3943a.longValue(), this.f3944b, this.f3945c, this.f3946d.longValue(), this.f3947e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a mo18808b(String str) {
            this.f3945c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a mo18809c(int i) {
            this.f3947e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a mo18810d(long j) {
            this.f3946d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a mo18811e(long j) {
            this.f3943a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a mo18812f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f3944b = str;
            return this;
        }
    }

    private C2373r(long j, String str, @Nullable String str2, long j2, int i) {
        this.f3938a = j;
        this.f3939b = str;
        this.f3940c = str2;
        this.f3941d = j2;
        this.f3942e = i;
    }

    @Nullable
    /* renamed from: b */
    public String mo18802b() {
        return this.f3940c;
    }

    /* renamed from: c */
    public int mo18803c() {
        return this.f3942e;
    }

    /* renamed from: d */
    public long mo18804d() {
        return this.f3941d;
    }

    /* renamed from: e */
    public long mo18805e() {
        return this.f3938a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f3940c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b) r8
            long r3 = r7.f3938a
            long r5 = r8.mo18805e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f3939b
            java.lang.String r3 = r8.mo18806f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f3940c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.mo18802b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.mo18802b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f3941d
            long r5 = r8.mo18804d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f3942e
            int r8 = r8.mo18803c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C2373r.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo18806f() {
        return this.f3939b;
    }

    public int hashCode() {
        long j = this.f3938a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3939b.hashCode()) * 1000003;
        String str = this.f3940c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f3941d;
        return this.f3942e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f3938a + ", symbol=" + this.f3939b + ", file=" + this.f3940c + ", offset=" + this.f3941d + ", importance=" + this.f3942e + "}";
    }
}
