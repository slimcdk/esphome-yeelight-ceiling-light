package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.i */
final class C3126i extends CrashlyticsReport.C3054d.C3059c {

    /* renamed from: a */
    private final int f6021a;

    /* renamed from: b */
    private final String f6022b;

    /* renamed from: c */
    private final int f6023c;

    /* renamed from: d */
    private final long f6024d;

    /* renamed from: e */
    private final long f6025e;

    /* renamed from: f */
    private final boolean f6026f;

    /* renamed from: g */
    private final int f6027g;

    /* renamed from: h */
    private final String f6028h;

    /* renamed from: i */
    private final String f6029i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.i$b */
    static final class C3128b extends CrashlyticsReport.C3054d.C3059c.C3060a {

        /* renamed from: a */
        private Integer f6030a;

        /* renamed from: b */
        private String f6031b;

        /* renamed from: c */
        private Integer f6032c;

        /* renamed from: d */
        private Long f6033d;

        /* renamed from: e */
        private Long f6034e;

        /* renamed from: f */
        private Boolean f6035f;

        /* renamed from: g */
        private Integer f6036g;

        /* renamed from: h */
        private String f6037h;

        /* renamed from: i */
        private String f6038i;

        C3128b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3059c mo17515a() {
            String str = "";
            if (this.f6030a == null) {
                str = str + " arch";
            }
            if (this.f6031b == null) {
                str = str + " model";
            }
            if (this.f6032c == null) {
                str = str + " cores";
            }
            if (this.f6033d == null) {
                str = str + " ram";
            }
            if (this.f6034e == null) {
                str = str + " diskSpace";
            }
            if (this.f6035f == null) {
                str = str + " simulator";
            }
            if (this.f6036g == null) {
                str = str + " state";
            }
            if (this.f6037h == null) {
                str = str + " manufacturer";
            }
            if (this.f6038i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C3126i(this.f6030a.intValue(), this.f6031b, this.f6032c.intValue(), this.f6033d.longValue(), this.f6034e.longValue(), this.f6035f.booleanValue(), this.f6036g.intValue(), this.f6037h, this.f6038i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17516b(int i) {
            this.f6030a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17517c(int i) {
            this.f6032c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17518d(long j) {
            this.f6034e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17519e(String str) {
            if (str != null) {
                this.f6037h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17520f(String str) {
            if (str != null) {
                this.f6031b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17521g(String str) {
            if (str != null) {
                this.f6038i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17522h(long j) {
            this.f6033d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17523i(boolean z) {
            this.f6035f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.C3054d.C3059c.C3060a mo17524j(int i) {
            this.f6036g = Integer.valueOf(i);
            return this;
        }
    }

    private C3126i(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f6021a = i;
        this.f6022b = str;
        this.f6023c = i2;
        this.f6024d = j;
        this.f6025e = j2;
        this.f6026f = z;
        this.f6027g = i3;
        this.f6028h = str2;
        this.f6029i = str3;
    }

    @NonNull
    /* renamed from: b */
    public int mo17506b() {
        return this.f6021a;
    }

    /* renamed from: c */
    public int mo17507c() {
        return this.f6023c;
    }

    /* renamed from: d */
    public long mo17508d() {
        return this.f6025e;
    }

    @NonNull
    /* renamed from: e */
    public String mo17509e() {
        return this.f6028h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3059c)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3059c cVar = (CrashlyticsReport.C3054d.C3059c) obj;
        return this.f6021a == cVar.mo17506b() && this.f6022b.equals(cVar.mo17510f()) && this.f6023c == cVar.mo17507c() && this.f6024d == cVar.mo17512h() && this.f6025e == cVar.mo17508d() && this.f6026f == cVar.mo17514j() && this.f6027g == cVar.mo17513i() && this.f6028h.equals(cVar.mo17509e()) && this.f6029i.equals(cVar.mo17511g());
    }

    @NonNull
    /* renamed from: f */
    public String mo17510f() {
        return this.f6022b;
    }

    @NonNull
    /* renamed from: g */
    public String mo17511g() {
        return this.f6029i;
    }

    /* renamed from: h */
    public long mo17512h() {
        return this.f6024d;
    }

    public int hashCode() {
        long j = this.f6024d;
        long j2 = this.f6025e;
        return ((((((((((((((((this.f6021a ^ 1000003) * 1000003) ^ this.f6022b.hashCode()) * 1000003) ^ this.f6023c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f6026f ? 1231 : 1237)) * 1000003) ^ this.f6027g) * 1000003) ^ this.f6028h.hashCode()) * 1000003) ^ this.f6029i.hashCode();
    }

    /* renamed from: i */
    public int mo17513i() {
        return this.f6027g;
    }

    /* renamed from: j */
    public boolean mo17514j() {
        return this.f6026f;
    }

    public String toString() {
        return "Device{arch=" + this.f6021a + ", model=" + this.f6022b + ", cores=" + this.f6023c + ", ram=" + this.f6024d + ", diskSpace=" + this.f6025e + ", simulator=" + this.f6026f + ", state=" + this.f6027g + ", manufacturer=" + this.f6028h + ", modelClass=" + this.f6029i + "}";
    }
}
