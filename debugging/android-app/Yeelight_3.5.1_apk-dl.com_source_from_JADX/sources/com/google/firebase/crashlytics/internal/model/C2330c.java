package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.c */
final class C2330c extends CrashlyticsReport.C2261a {

    /* renamed from: a */
    private final int f3795a;

    /* renamed from: b */
    private final String f3796b;

    /* renamed from: c */
    private final int f3797c;

    /* renamed from: d */
    private final int f3798d;

    /* renamed from: e */
    private final long f3799e;

    /* renamed from: f */
    private final long f3800f;

    /* renamed from: g */
    private final long f3801g;

    /* renamed from: h */
    private final String f3802h;

    /* renamed from: com.google.firebase.crashlytics.internal.model.c$b */
    static final class C2332b extends CrashlyticsReport.C2261a.C2262a {

        /* renamed from: a */
        private Integer f3803a;

        /* renamed from: b */
        private String f3804b;

        /* renamed from: c */
        private Integer f3805c;

        /* renamed from: d */
        private Integer f3806d;

        /* renamed from: e */
        private Long f3807e;

        /* renamed from: f */
        private Long f3808f;

        /* renamed from: g */
        private Long f3809g;

        /* renamed from: h */
        private String f3810h;

        C2332b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2261a mo18642a() {
            String str = "";
            if (this.f3803a == null) {
                str = str + " pid";
            }
            if (this.f3804b == null) {
                str = str + " processName";
            }
            if (this.f3805c == null) {
                str = str + " reasonCode";
            }
            if (this.f3806d == null) {
                str = str + " importance";
            }
            if (this.f3807e == null) {
                str = str + " pss";
            }
            if (this.f3808f == null) {
                str = str + " rss";
            }
            if (this.f3809g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C2330c(this.f3803a.intValue(), this.f3804b, this.f3805c.intValue(), this.f3806d.intValue(), this.f3807e.longValue(), this.f3808f.longValue(), this.f3809g.longValue(), this.f3810h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2261a.C2262a mo18643b(int i) {
            this.f3806d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2261a.C2262a mo18644c(int i) {
            this.f3803a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2261a.C2262a mo18645d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f3804b = str;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2261a.C2262a mo18646e(long j) {
            this.f3807e = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2261a.C2262a mo18647f(int i) {
            this.f3805c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C2261a.C2262a mo18648g(long j) {
            this.f3808f = Long.valueOf(j);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C2261a.C2262a mo18649h(long j) {
            this.f3809g = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C2261a.C2262a mo18650i(@Nullable String str) {
            this.f3810h = str;
            return this;
        }
    }

    private C2330c(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2) {
        this.f3795a = i;
        this.f3796b = str;
        this.f3797c = i2;
        this.f3798d = i3;
        this.f3799e = j;
        this.f3800f = j2;
        this.f3801g = j3;
        this.f3802h = str2;
    }

    @NonNull
    /* renamed from: b */
    public int mo18634b() {
        return this.f3798d;
    }

    @NonNull
    /* renamed from: c */
    public int mo18635c() {
        return this.f3795a;
    }

    @NonNull
    /* renamed from: d */
    public String mo18636d() {
        return this.f3796b;
    }

    @NonNull
    /* renamed from: e */
    public long mo18637e() {
        return this.f3799e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2261a)) {
            return false;
        }
        CrashlyticsReport.C2261a aVar = (CrashlyticsReport.C2261a) obj;
        if (this.f3795a == aVar.mo18635c() && this.f3796b.equals(aVar.mo18636d()) && this.f3797c == aVar.mo18638f() && this.f3798d == aVar.mo18634b() && this.f3799e == aVar.mo18637e() && this.f3800f == aVar.mo18639g() && this.f3801g == aVar.mo18640h()) {
            String str = this.f3802h;
            String i = aVar.mo18641i();
            if (str == null) {
                if (i == null) {
                    return true;
                }
            } else if (str.equals(i)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public int mo18638f() {
        return this.f3797c;
    }

    @NonNull
    /* renamed from: g */
    public long mo18639g() {
        return this.f3800f;
    }

    @NonNull
    /* renamed from: h */
    public long mo18640h() {
        return this.f3801g;
    }

    public int hashCode() {
        long j = this.f3799e;
        long j2 = this.f3800f;
        long j3 = this.f3801g;
        int hashCode = (((((((((((((this.f3795a ^ 1000003) * 1000003) ^ this.f3796b.hashCode()) * 1000003) ^ this.f3797c) * 1000003) ^ this.f3798d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f3802h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Nullable
    /* renamed from: i */
    public String mo18641i() {
        return this.f3802h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f3795a + ", processName=" + this.f3796b + ", reasonCode=" + this.f3797c + ", importance=" + this.f3798d + ", pss=" + this.f3799e + ", rss=" + this.f3800f + ", timestamp=" + this.f3801g + ", traceFile=" + this.f3802h + "}";
    }
}
