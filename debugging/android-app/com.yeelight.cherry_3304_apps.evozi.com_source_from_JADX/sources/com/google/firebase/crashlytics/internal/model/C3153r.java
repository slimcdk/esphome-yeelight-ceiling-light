package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.r */
final class C3153r extends CrashlyticsReport.C3054d.C3061d.C3077c {

    /* renamed from: a */
    private final Double f6105a;

    /* renamed from: b */
    private final int f6106b;

    /* renamed from: c */
    private final boolean f6107c;

    /* renamed from: d */
    private final int f6108d;

    /* renamed from: e */
    private final long f6109e;

    /* renamed from: f */
    private final long f6110f;

    /* renamed from: com.google.firebase.crashlytics.internal.model.r$b */
    static final class C3155b extends CrashlyticsReport.C3054d.C3061d.C3077c.C3078a {

        /* renamed from: a */
        private Double f6111a;

        /* renamed from: b */
        private Integer f6112b;

        /* renamed from: c */
        private Boolean f6113c;

        /* renamed from: d */
        private Integer f6114d;

        /* renamed from: e */
        private Long f6115e;

        /* renamed from: f */
        private Long f6116f;

        C3155b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d.C3077c mo17609a() {
            String str = "";
            if (this.f6112b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f6113c == null) {
                str = str + " proximityOn";
            }
            if (this.f6114d == null) {
                str = str + " orientation";
            }
            if (this.f6115e == null) {
                str = str + " ramUsed";
            }
            if (this.f6116f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C3153r(this.f6111a, this.f6112b.intValue(), this.f6113c.booleanValue(), this.f6114d.intValue(), this.f6115e.longValue(), this.f6116f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17610b(Double d) {
            this.f6111a = d;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17611c(int i) {
            this.f6112b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17612d(long j) {
            this.f6116f = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17613e(int i) {
            this.f6114d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17614f(boolean z) {
            this.f6113c = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C3054d.C3061d.C3077c.C3078a mo17615g(long j) {
            this.f6115e = Long.valueOf(j);
            return this;
        }
    }

    private C3153r(@Nullable Double d, int i, boolean z, int i2, long j, long j2) {
        this.f6105a = d;
        this.f6106b = i;
        this.f6107c = z;
        this.f6108d = i2;
        this.f6109e = j;
        this.f6110f = j2;
    }

    @Nullable
    /* renamed from: b */
    public Double mo17603b() {
        return this.f6105a;
    }

    /* renamed from: c */
    public int mo17604c() {
        return this.f6106b;
    }

    /* renamed from: d */
    public long mo17605d() {
        return this.f6110f;
    }

    /* renamed from: e */
    public int mo17606e() {
        return this.f6108d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d.C3077c)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d.C3077c cVar = (CrashlyticsReport.C3054d.C3061d.C3077c) obj;
        Double d = this.f6105a;
        if (d != null ? d.equals(cVar.mo17603b()) : cVar.mo17603b() == null) {
            return this.f6106b == cVar.mo17604c() && this.f6107c == cVar.mo17608g() && this.f6108d == cVar.mo17606e() && this.f6109e == cVar.mo17607f() && this.f6110f == cVar.mo17605d();
        }
    }

    /* renamed from: f */
    public long mo17607f() {
        return this.f6109e;
    }

    /* renamed from: g */
    public boolean mo17608g() {
        return this.f6107c;
    }

    public int hashCode() {
        Double d = this.f6105a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f6106b) * 1000003;
        int i = this.f6107c ? 1231 : 1237;
        long j = this.f6109e;
        long j2 = this.f6110f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f6108d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f6105a + ", batteryVelocity=" + this.f6106b + ", proximityOn=" + this.f6107c + ", orientation=" + this.f6108d + ", ramUsed=" + this.f6109e + ", diskUsed=" + this.f6110f + "}";
    }
}
