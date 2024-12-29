package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.q */
final class C3150q extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b {

    /* renamed from: a */
    private final long f6095a;

    /* renamed from: b */
    private final String f6096b;

    /* renamed from: c */
    private final String f6097c;

    /* renamed from: d */
    private final long f6098d;

    /* renamed from: e */
    private final int f6099e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.q$b */
    static final class C3152b extends CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a {

        /* renamed from: a */
        private Long f6100a;

        /* renamed from: b */
        private String f6101b;

        /* renamed from: c */
        private String f6102c;

        /* renamed from: d */
        private Long f6103d;

        /* renamed from: e */
        private Integer f6104e;

        C3152b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b mo17591a() {
            String str = "";
            if (this.f6100a == null) {
                str = str + " pc";
            }
            if (this.f6101b == null) {
                str = str + " symbol";
            }
            if (this.f6103d == null) {
                str = str + " offset";
            }
            if (this.f6104e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C3150q(this.f6100a.longValue(), this.f6101b, this.f6102c, this.f6103d.longValue(), this.f6104e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a mo17592b(String str) {
            this.f6102c = str;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a mo17593c(int i) {
            this.f6104e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a mo17594d(long j) {
            this.f6103d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a mo17595e(long j) {
            this.f6100a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a mo17596f(String str) {
            if (str != null) {
                this.f6101b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    private C3150q(long j, String str, @Nullable String str2, long j2, int i) {
        this.f6095a = j;
        this.f6096b = str;
        this.f6097c = str2;
        this.f6098d = j2;
        this.f6099e = i;
    }

    @Nullable
    /* renamed from: b */
    public String mo17586b() {
        return this.f6097c;
    }

    /* renamed from: c */
    public int mo17587c() {
        return this.f6099e;
    }

    /* renamed from: d */
    public long mo17588d() {
        return this.f6098d;
    }

    /* renamed from: e */
    public long mo17589e() {
        return this.f6095a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f6097c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$d$a$b$e$b r8 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b) r8
            long r3 = r7.f6095a
            long r5 = r8.mo17589e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f6096b
            java.lang.String r3 = r8.mo17590f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f6097c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.mo17586b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.mo17586b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f6098d
            long r5 = r8.mo17588d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f6099e
            int r8 = r8.mo17587c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.C3150q.equals(java.lang.Object):boolean");
    }

    @NonNull
    /* renamed from: f */
    public String mo17590f() {
        return this.f6096b;
    }

    public int hashCode() {
        long j = this.f6095a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6096b.hashCode()) * 1000003;
        String str = this.f6097c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f6098d;
        return this.f6099e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f6095a + ", symbol=" + this.f6096b + ", file=" + this.f6097c + ", offset=" + this.f6098d + ", importance=" + this.f6099e + "}";
    }
}
