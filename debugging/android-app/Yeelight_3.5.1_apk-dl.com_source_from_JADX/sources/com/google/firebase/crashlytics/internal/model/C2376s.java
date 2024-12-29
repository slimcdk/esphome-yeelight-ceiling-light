package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.s */
final class C2376s extends CrashlyticsReport.C2270e.C2277d.C2293c {

    /* renamed from: a */
    private final Double f3948a;

    /* renamed from: b */
    private final int f3949b;

    /* renamed from: c */
    private final boolean f3950c;

    /* renamed from: d */
    private final int f3951d;

    /* renamed from: e */
    private final long f3952e;

    /* renamed from: f */
    private final long f3953f;

    /* renamed from: com.google.firebase.crashlytics.internal.model.s$b */
    static final class C2378b extends CrashlyticsReport.C2270e.C2277d.C2293c.C2294a {

        /* renamed from: a */
        private Double f3954a;

        /* renamed from: b */
        private Integer f3955b;

        /* renamed from: c */
        private Boolean f3956c;

        /* renamed from: d */
        private Integer f3957d;

        /* renamed from: e */
        private Long f3958e;

        /* renamed from: f */
        private Long f3959f;

        C2378b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2293c mo18825a() {
            String str = "";
            if (this.f3955b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f3956c == null) {
                str = str + " proximityOn";
            }
            if (this.f3957d == null) {
                str = str + " orientation";
            }
            if (this.f3958e == null) {
                str = str + " ramUsed";
            }
            if (this.f3959f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C2376s(this.f3954a, this.f3955b.intValue(), this.f3956c.booleanValue(), this.f3957d.intValue(), this.f3958e.longValue(), this.f3959f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18826b(Double d) {
            this.f3954a = d;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18827c(int i) {
            this.f3955b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18828d(long j) {
            this.f3959f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18829e(int i) {
            this.f3957d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18830f(boolean z) {
            this.f3956c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2270e.C2277d.C2293c.C2294a mo18831g(long j) {
            this.f3958e = Long.valueOf(j);
            return this;
        }
    }

    private C2376s(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f3948a = d;
        this.f3949b = i;
        this.f3950c = z;
        this.f3951d = i2;
        this.f3952e = j;
        this.f3953f = j2;
    }

    @Nullable
    /* renamed from: b */
    public Double mo18819b() {
        return this.f3948a;
    }

    /* renamed from: c */
    public int mo18820c() {
        return this.f3949b;
    }

    /* renamed from: d */
    public long mo18821d() {
        return this.f3953f;
    }

    /* renamed from: e */
    public int mo18822e() {
        return this.f3951d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d.C2293c)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d.C2293c cVar = (CrashlyticsReport.C2270e.C2277d.C2293c) obj;
        Double d = this.f3948a;
        if (d != null ? d.equals(cVar.mo18819b()) : cVar.mo18819b() == null) {
            return this.f3949b == cVar.mo18820c() && this.f3950c == cVar.mo18824g() && this.f3951d == cVar.mo18822e() && this.f3952e == cVar.mo18823f() && this.f3953f == cVar.mo18821d();
        }
    }

    /* renamed from: f */
    public long mo18823f() {
        return this.f3952e;
    }

    /* renamed from: g */
    public boolean mo18824g() {
        return this.f3950c;
    }

    public int hashCode() {
        Double d = this.f3948a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f3949b) * 1000003;
        int i = this.f3950c ? 1231 : 1237;
        long j = this.f3952e;
        long j2 = this.f3953f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f3951d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f3948a + ", batteryVelocity=" + this.f3949b + ", proximityOn=" + this.f3950c + ", orientation=" + this.f3951d + ", ramUsed=" + this.f3952e + ", diskUsed=" + this.f3953f + "}";
    }
}
