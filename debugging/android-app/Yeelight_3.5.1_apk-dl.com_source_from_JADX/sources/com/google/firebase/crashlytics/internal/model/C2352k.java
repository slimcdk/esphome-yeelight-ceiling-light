package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.model.k */
final class C2352k extends CrashlyticsReport.C2270e.C2277d {

    /* renamed from: a */
    private final long f3878a;

    /* renamed from: b */
    private final String f3879b;

    /* renamed from: c */
    private final CrashlyticsReport.C2270e.C2277d.C2278a f3880c;

    /* renamed from: d */
    private final CrashlyticsReport.C2270e.C2277d.C2293c f3881d;

    /* renamed from: e */
    private final CrashlyticsReport.C2270e.C2277d.C2295d f3882e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.k$b */
    static final class C2354b extends CrashlyticsReport.C2270e.C2277d.C2292b {

        /* renamed from: a */
        private Long f3883a;

        /* renamed from: b */
        private String f3884b;

        /* renamed from: c */
        private CrashlyticsReport.C2270e.C2277d.C2278a f3885c;

        /* renamed from: d */
        private CrashlyticsReport.C2270e.C2277d.C2293c f3886d;

        /* renamed from: e */
        private CrashlyticsReport.C2270e.C2277d.C2295d f3887e;

        C2354b() {
        }

        private C2354b(CrashlyticsReport.C2270e.C2277d dVar) {
            this.f3883a = Long.valueOf(dVar.mo18740e());
            this.f3884b = dVar.mo18741f();
            this.f3885c = dVar.mo18737b();
            this.f3886d = dVar.mo18738c();
            this.f3887e = dVar.mo18739d();
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d mo18813a() {
            String str = "";
            if (this.f3883a == null) {
                str = str + " timestamp";
            }
            if (this.f3884b == null) {
                str = str + " type";
            }
            if (this.f3885c == null) {
                str = str + " app";
            }
            if (this.f3886d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C2352k(this.f3883a.longValue(), this.f3884b, this.f3885c, this.f3886d, this.f3887e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2292b mo18814b(CrashlyticsReport.C2270e.C2277d.C2278a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f3885c = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2292b mo18815c(CrashlyticsReport.C2270e.C2277d.C2293c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f3886d = cVar;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2292b mo18816d(CrashlyticsReport.C2270e.C2277d.C2295d dVar) {
            this.f3887e = dVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2292b mo18817e(long j) {
            this.f3883a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2292b mo18818f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f3884b = str;
            return this;
        }
    }

    private C2352k(long j, String str, CrashlyticsReport.C2270e.C2277d.C2278a aVar, CrashlyticsReport.C2270e.C2277d.C2293c cVar, @Nullable CrashlyticsReport.C2270e.C2277d.C2295d dVar) {
        this.f3878a = j;
        this.f3879b = str;
        this.f3880c = aVar;
        this.f3881d = cVar;
        this.f3882e = dVar;
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C2270e.C2277d.C2278a mo18737b() {
        return this.f3880c;
    }

    @NonNull
    /* renamed from: c */
    public CrashlyticsReport.C2270e.C2277d.C2293c mo18738c() {
        return this.f3881d;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.C2270e.C2277d.C2295d mo18739d() {
        return this.f3882e;
    }

    /* renamed from: e */
    public long mo18740e() {
        return this.f3878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d dVar = (CrashlyticsReport.C2270e.C2277d) obj;
        if (this.f3878a == dVar.mo18740e() && this.f3879b.equals(dVar.mo18741f()) && this.f3880c.equals(dVar.mo18737b()) && this.f3881d.equals(dVar.mo18738c())) {
            CrashlyticsReport.C2270e.C2277d.C2295d dVar2 = this.f3882e;
            CrashlyticsReport.C2270e.C2277d.C2295d d = dVar.mo18739d();
            if (dVar2 == null) {
                if (d == null) {
                    return true;
                }
            } else if (dVar2.equals(d)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo18741f() {
        return this.f3879b;
    }

    /* renamed from: g */
    public CrashlyticsReport.C2270e.C2277d.C2292b mo18742g() {
        return new C2354b(this);
    }

    public int hashCode() {
        long j = this.f3878a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3879b.hashCode()) * 1000003) ^ this.f3880c.hashCode()) * 1000003) ^ this.f3881d.hashCode()) * 1000003;
        CrashlyticsReport.C2270e.C2277d.C2295d dVar = this.f3882e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f3878a + ", type=" + this.f3879b + ", app=" + this.f3880c + ", device=" + this.f3881d + ", log=" + this.f3882e + "}";
    }
}
