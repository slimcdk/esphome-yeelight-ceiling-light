package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.b */
final class C3107b extends CrashlyticsReport {

    /* renamed from: b */
    private final String f5960b;

    /* renamed from: c */
    private final String f5961c;

    /* renamed from: d */
    private final int f5962d;

    /* renamed from: e */
    private final String f5963e;

    /* renamed from: f */
    private final String f5964f;

    /* renamed from: g */
    private final String f5965g;

    /* renamed from: h */
    private final CrashlyticsReport.C3054d f5966h;

    /* renamed from: i */
    private final CrashlyticsReport.C3050c f5967i;

    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b */
    static final class C3109b extends CrashlyticsReport.C3047a {

        /* renamed from: a */
        private String f5968a;

        /* renamed from: b */
        private String f5969b;

        /* renamed from: c */
        private Integer f5970c;

        /* renamed from: d */
        private String f5971d;

        /* renamed from: e */
        private String f5972e;

        /* renamed from: f */
        private String f5973f;

        /* renamed from: g */
        private CrashlyticsReport.C3054d f5974g;

        /* renamed from: h */
        private CrashlyticsReport.C3050c f5975h;

        C3109b() {
        }

        private C3109b(CrashlyticsReport crashlyticsReport) {
            this.f5968a = crashlyticsReport.mo17436i();
            this.f5969b = crashlyticsReport.mo17432e();
            this.f5970c = Integer.valueOf(crashlyticsReport.mo17435h());
            this.f5971d = crashlyticsReport.mo17433f();
            this.f5972e = crashlyticsReport.mo17430c();
            this.f5973f = crashlyticsReport.mo17431d();
            this.f5974g = crashlyticsReport.mo17437j();
            this.f5975h = crashlyticsReport.mo17434g();
        }

        /* renamed from: a */
        public CrashlyticsReport mo17443a() {
            String str = "";
            if (this.f5968a == null) {
                str = str + " sdkVersion";
            }
            if (this.f5969b == null) {
                str = str + " gmpAppId";
            }
            if (this.f5970c == null) {
                str = str + " platform";
            }
            if (this.f5971d == null) {
                str = str + " installationUuid";
            }
            if (this.f5972e == null) {
                str = str + " buildVersion";
            }
            if (this.f5973f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C3107b(this.f5968a, this.f5969b, this.f5970c.intValue(), this.f5971d, this.f5972e, this.f5973f, this.f5974g, this.f5975h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C3047a mo17444b(String str) {
            if (str != null) {
                this.f5972e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        /* renamed from: c */
        public CrashlyticsReport.C3047a mo17445c(String str) {
            if (str != null) {
                this.f5973f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        /* renamed from: d */
        public CrashlyticsReport.C3047a mo17446d(String str) {
            if (str != null) {
                this.f5969b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        /* renamed from: e */
        public CrashlyticsReport.C3047a mo17447e(String str) {
            if (str != null) {
                this.f5971d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        /* renamed from: f */
        public CrashlyticsReport.C3047a mo17448f(CrashlyticsReport.C3050c cVar) {
            this.f5975h = cVar;
            return this;
        }

        /* renamed from: g */
        public CrashlyticsReport.C3047a mo17449g(int i) {
            this.f5970c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public CrashlyticsReport.C3047a mo17450h(String str) {
            if (str != null) {
                this.f5968a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        /* renamed from: i */
        public CrashlyticsReport.C3047a mo17451i(CrashlyticsReport.C3054d dVar) {
            this.f5974g = dVar;
            return this;
        }
    }

    private C3107b(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.C3054d dVar, @Nullable CrashlyticsReport.C3050c cVar) {
        this.f5960b = str;
        this.f5961c = str2;
        this.f5962d = i;
        this.f5963e = str3;
        this.f5964f = str4;
        this.f5965g = str5;
        this.f5966h = dVar;
        this.f5967i = cVar;
    }

    @NonNull
    /* renamed from: c */
    public String mo17430c() {
        return this.f5964f;
    }

    @NonNull
    /* renamed from: d */
    public String mo17431d() {
        return this.f5965g;
    }

    @NonNull
    /* renamed from: e */
    public String mo17432e() {
        return this.f5961c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.C3054d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f5960b.equals(crashlyticsReport.mo17436i()) && this.f5961c.equals(crashlyticsReport.mo17432e()) && this.f5962d == crashlyticsReport.mo17435h() && this.f5963e.equals(crashlyticsReport.mo17433f()) && this.f5964f.equals(crashlyticsReport.mo17430c()) && this.f5965g.equals(crashlyticsReport.mo17431d()) && ((dVar = this.f5966h) != null ? dVar.equals(crashlyticsReport.mo17437j()) : crashlyticsReport.mo17437j() == null)) {
            CrashlyticsReport.C3050c cVar = this.f5967i;
            CrashlyticsReport.C3050c g = crashlyticsReport.mo17434g();
            if (cVar == null) {
                if (g == null) {
                    return true;
                }
            } else if (cVar.equals(g)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo17433f() {
        return this.f5963e;
    }

    @Nullable
    /* renamed from: g */
    public CrashlyticsReport.C3050c mo17434g() {
        return this.f5967i;
    }

    /* renamed from: h */
    public int mo17435h() {
        return this.f5962d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f5960b.hashCode() ^ 1000003) * 1000003) ^ this.f5961c.hashCode()) * 1000003) ^ this.f5962d) * 1000003) ^ this.f5963e.hashCode()) * 1000003) ^ this.f5964f.hashCode()) * 1000003) ^ this.f5965g.hashCode()) * 1000003;
        CrashlyticsReport.C3054d dVar = this.f5966h;
        int i = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        CrashlyticsReport.C3050c cVar = this.f5967i;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    @NonNull
    /* renamed from: i */
    public String mo17436i() {
        return this.f5960b;
    }

    @Nullable
    /* renamed from: j */
    public CrashlyticsReport.C3054d mo17437j() {
        return this.f5966h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public CrashlyticsReport.C3047a mo17439l() {
        return new C3109b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5960b + ", gmpAppId=" + this.f5961c + ", platform=" + this.f5962d + ", installationUuid=" + this.f5963e + ", buildVersion=" + this.f5964f + ", displayVersion=" + this.f5965g + ", session=" + this.f5966h + ", ndkPayload=" + this.f5967i + "}";
    }
}
