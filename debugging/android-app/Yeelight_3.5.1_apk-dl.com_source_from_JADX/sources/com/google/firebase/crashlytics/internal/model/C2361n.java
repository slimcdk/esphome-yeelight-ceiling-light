package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.n */
final class C2361n extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a {

    /* renamed from: a */
    private final long f3908a;

    /* renamed from: b */
    private final long f3909b;

    /* renamed from: c */
    private final String f3910c;

    /* renamed from: d */
    private final String f3911d;

    /* renamed from: com.google.firebase.crashlytics.internal.model.n$b */
    static final class C2363b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a {

        /* renamed from: a */
        private Long f3912a;

        /* renamed from: b */
        private Long f3913b;

        /* renamed from: c */
        private String f3914c;

        /* renamed from: d */
        private String f3915d;

        C2363b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a mo18765a() {
            String str = "";
            if (this.f3912a == null) {
                str = str + " baseAddress";
            }
            if (this.f3913b == null) {
                str = str + " size";
            }
            if (this.f3914c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C2361n(this.f3912a.longValue(), this.f3913b.longValue(), this.f3914c, this.f3915d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a mo18766b(long j) {
            this.f3912a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a mo18767c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f3914c = str;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a mo18768d(long j) {
            this.f3913b = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.C2282a mo18769e(@Nullable String str) {
            this.f3915d = str;
            return this;
        }
    }

    private C2361n(long j, long j2, String str, @Nullable String str2) {
        this.f3908a = j;
        this.f3909b = j2;
        this.f3910c = str;
        this.f3911d = str2;
    }

    @NonNull
    /* renamed from: b */
    public long mo18760b() {
        return this.f3908a;
    }

    @NonNull
    /* renamed from: c */
    public String mo18761c() {
        return this.f3910c;
    }

    /* renamed from: d */
    public long mo18762d() {
        return this.f3909b;
    }

    @Encodable.Ignore
    @Nullable
    /* renamed from: e */
    public String mo18763e() {
        return this.f3911d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a aVar = (CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a) obj;
        if (this.f3908a == aVar.mo18760b() && this.f3909b == aVar.mo18762d() && this.f3910c.equals(aVar.mo18761c())) {
            String str = this.f3911d;
            String e = aVar.mo18763e();
            if (str == null) {
                if (e == null) {
                    return true;
                }
            } else if (str.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f3908a;
        long j2 = this.f3909b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f3910c.hashCode()) * 1000003;
        String str = this.f3911d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f3908a + ", size=" + this.f3909b + ", name=" + this.f3910c + ", uuid=" + this.f3911d + "}";
    }
}
