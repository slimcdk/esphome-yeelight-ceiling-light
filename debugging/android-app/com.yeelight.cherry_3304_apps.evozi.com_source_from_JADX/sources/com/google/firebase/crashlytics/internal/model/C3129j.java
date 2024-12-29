package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.j */
final class C3129j extends CrashlyticsReport.C3054d.C3061d {

    /* renamed from: a */
    private final long f6039a;

    /* renamed from: b */
    private final String f6040b;

    /* renamed from: c */
    private final CrashlyticsReport.C3054d.C3061d.C3062a f6041c;

    /* renamed from: d */
    private final CrashlyticsReport.C3054d.C3061d.C3077c f6042d;

    /* renamed from: e */
    private final CrashlyticsReport.C3054d.C3061d.C3079d f6043e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.j$b */
    static final class C3131b extends CrashlyticsReport.C3054d.C3061d.C3076b {

        /* renamed from: a */
        private Long f6044a;

        /* renamed from: b */
        private String f6045b;

        /* renamed from: c */
        private CrashlyticsReport.C3054d.C3061d.C3062a f6046c;

        /* renamed from: d */
        private CrashlyticsReport.C3054d.C3061d.C3077c f6047d;

        /* renamed from: e */
        private CrashlyticsReport.C3054d.C3061d.C3079d f6048e;

        C3131b() {
        }

        private C3131b(CrashlyticsReport.C3054d.C3061d dVar) {
            this.f6044a = Long.valueOf(dVar.mo17528e());
            this.f6045b = dVar.mo17529f();
            this.f6046c = dVar.mo17525b();
            this.f6047d = dVar.mo17526c();
            this.f6048e = dVar.mo17527d();
        }

        /* renamed from: a */
        public CrashlyticsReport.C3054d.C3061d mo17597a() {
            String str = "";
            if (this.f6044a == null) {
                str = str + " timestamp";
            }
            if (this.f6045b == null) {
                str = str + " type";
            }
            if (this.f6046c == null) {
                str = str + " app";
            }
            if (this.f6047d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C3129j(this.f6044a.longValue(), this.f6045b, this.f6046c, this.f6047d, this.f6048e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3054d.C3061d.C3076b mo17598b(CrashlyticsReport.C3054d.C3061d.C3062a aVar) {
            if (aVar != null) {
                this.f6046c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3054d.C3061d.C3076b mo17599c(CrashlyticsReport.C3054d.C3061d.C3077c cVar) {
            if (cVar != null) {
                this.f6047d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3054d.C3061d.C3076b mo17600d(CrashlyticsReport.C3054d.C3061d.C3079d dVar) {
            this.f6048e = dVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C3054d.C3061d.C3076b mo17601e(long j) {
            this.f6044a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C3054d.C3061d.C3076b mo17602f(String str) {
            if (str != null) {
                this.f6045b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private C3129j(long j, String str, CrashlyticsReport.C3054d.C3061d.C3062a aVar, CrashlyticsReport.C3054d.C3061d.C3077c cVar, @Nullable CrashlyticsReport.C3054d.C3061d.C3079d dVar) {
        this.f6039a = j;
        this.f6040b = str;
        this.f6041c = aVar;
        this.f6042d = cVar;
        this.f6043e = dVar;
    }

    @NonNull
    /* renamed from: b */
    public CrashlyticsReport.C3054d.C3061d.C3062a mo17525b() {
        return this.f6041c;
    }

    @NonNull
    /* renamed from: c */
    public CrashlyticsReport.C3054d.C3061d.C3077c mo17526c() {
        return this.f6042d;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.C3054d.C3061d.C3079d mo17527d() {
        return this.f6043e;
    }

    /* renamed from: e */
    public long mo17528e() {
        return this.f6039a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C3054d.C3061d)) {
            return false;
        }
        CrashlyticsReport.C3054d.C3061d dVar = (CrashlyticsReport.C3054d.C3061d) obj;
        if (this.f6039a == dVar.mo17528e() && this.f6040b.equals(dVar.mo17529f()) && this.f6041c.equals(dVar.mo17525b()) && this.f6042d.equals(dVar.mo17526c())) {
            CrashlyticsReport.C3054d.C3061d.C3079d dVar2 = this.f6043e;
            CrashlyticsReport.C3054d.C3061d.C3079d d = dVar.mo17527d();
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
    public String mo17529f() {
        return this.f6040b;
    }

    /* renamed from: g */
    public CrashlyticsReport.C3054d.C3061d.C3076b mo17530g() {
        return new C3131b(this);
    }

    public int hashCode() {
        long j = this.f6039a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6040b.hashCode()) * 1000003) ^ this.f6041c.hashCode()) * 1000003) ^ this.f6042d.hashCode()) * 1000003;
        CrashlyticsReport.C3054d.C3061d.C3079d dVar = this.f6043e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f6039a + ", type=" + this.f6040b + ", app=" + this.f6041c + ", device=" + this.f6042d + ", log=" + this.f6043e + "}";
    }
}
