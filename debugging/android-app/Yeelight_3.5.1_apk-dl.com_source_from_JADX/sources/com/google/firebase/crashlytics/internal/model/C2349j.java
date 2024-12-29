package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.j */
final class C2349j extends CrashlyticsReport.C2270e.C2275c {

    /* renamed from: a */
    private final int f3860a;

    /* renamed from: b */
    private final String f3861b;

    /* renamed from: c */
    private final int f3862c;

    /* renamed from: d */
    private final long f3863d;

    /* renamed from: e */
    private final long f3864e;

    /* renamed from: f */
    private final boolean f3865f;

    /* renamed from: g */
    private final int f3866g;

    /* renamed from: h */
    private final String f3867h;

    /* renamed from: i */
    private final String f3868i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.j$b */
    static final class C2351b extends CrashlyticsReport.C2270e.C2275c.C2276a {

        /* renamed from: a */
        private Integer f3869a;

        /* renamed from: b */
        private String f3870b;

        /* renamed from: c */
        private Integer f3871c;

        /* renamed from: d */
        private Long f3872d;

        /* renamed from: e */
        private Long f3873e;

        /* renamed from: f */
        private Boolean f3874f;

        /* renamed from: g */
        private Integer f3875g;

        /* renamed from: h */
        private String f3876h;

        /* renamed from: i */
        private String f3877i;

        C2351b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2275c mo18727a() {
            String str = "";
            if (this.f3869a == null) {
                str = str + " arch";
            }
            if (this.f3870b == null) {
                str = str + " model";
            }
            if (this.f3871c == null) {
                str = str + " cores";
            }
            if (this.f3872d == null) {
                str = str + " ram";
            }
            if (this.f3873e == null) {
                str = str + " diskSpace";
            }
            if (this.f3874f == null) {
                str = str + " simulator";
            }
            if (this.f3875g == null) {
                str = str + " state";
            }
            if (this.f3876h == null) {
                str = str + " manufacturer";
            }
            if (this.f3877i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C2349j(this.f3869a.intValue(), this.f3870b, this.f3871c.intValue(), this.f3872d.longValue(), this.f3873e.longValue(), this.f3874f.booleanValue(), this.f3875g.intValue(), this.f3876h, this.f3877i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18728b(int i) {
            this.f3869a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18729c(int i) {
            this.f3871c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18730d(long j) {
            this.f3873e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18731e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f3876h = str;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18732f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f3870b = str;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18733g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f3877i = str;
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18734h(long j) {
            this.f3872d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18735i(boolean z) {
            this.f3874f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.C2270e.C2275c.C2276a mo18736j(int i) {
            this.f3875g = Integer.valueOf(i);
            return this;
        }
    }

    private C2349j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f3860a = i;
        this.f3861b = str;
        this.f3862c = i2;
        this.f3863d = j;
        this.f3864e = j2;
        this.f3865f = z;
        this.f3866g = i3;
        this.f3867h = str2;
        this.f3868i = str3;
    }

    @NonNull
    /* renamed from: b */
    public int mo18718b() {
        return this.f3860a;
    }

    /* renamed from: c */
    public int mo18719c() {
        return this.f3862c;
    }

    /* renamed from: d */
    public long mo18720d() {
        return this.f3864e;
    }

    @NonNull
    /* renamed from: e */
    public String mo18721e() {
        return this.f3867h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2275c)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2275c cVar = (CrashlyticsReport.C2270e.C2275c) obj;
        return this.f3860a == cVar.mo18718b() && this.f3861b.equals(cVar.mo18722f()) && this.f3862c == cVar.mo18719c() && this.f3863d == cVar.mo18724h() && this.f3864e == cVar.mo18720d() && this.f3865f == cVar.mo18726j() && this.f3866g == cVar.mo18725i() && this.f3867h.equals(cVar.mo18721e()) && this.f3868i.equals(cVar.mo18723g());
    }

    @NonNull
    /* renamed from: f */
    public String mo18722f() {
        return this.f3861b;
    }

    @NonNull
    /* renamed from: g */
    public String mo18723g() {
        return this.f3868i;
    }

    /* renamed from: h */
    public long mo18724h() {
        return this.f3863d;
    }

    public int hashCode() {
        long j = this.f3863d;
        long j2 = this.f3864e;
        return ((((((((((((((((this.f3860a ^ 1000003) * 1000003) ^ this.f3861b.hashCode()) * 1000003) ^ this.f3862c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f3865f ? 1231 : 1237)) * 1000003) ^ this.f3866g) * 1000003) ^ this.f3867h.hashCode()) * 1000003) ^ this.f3868i.hashCode();
    }

    /* renamed from: i */
    public int mo18725i() {
        return this.f3866g;
    }

    /* renamed from: j */
    public boolean mo18726j() {
        return this.f3865f;
    }

    public String toString() {
        return "Device{arch=" + this.f3860a + ", model=" + this.f3861b + ", cores=" + this.f3862c + ", ram=" + this.f3863d + ", diskSpace=" + this.f3864e + ", simulator=" + this.f3865f + ", state=" + this.f3866g + ", manufacturer=" + this.f3867h + ", modelClass=" + this.f3868i + "}";
    }
}
