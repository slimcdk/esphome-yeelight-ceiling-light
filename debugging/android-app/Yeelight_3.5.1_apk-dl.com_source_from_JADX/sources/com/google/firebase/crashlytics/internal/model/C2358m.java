package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Objects;
import p015c1.C0628a;

/* renamed from: com.google.firebase.crashlytics.internal.model.m */
final class C2358m extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b {

    /* renamed from: a */
    private final C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> f3898a;

    /* renamed from: b */
    private final CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c f3899b;

    /* renamed from: c */
    private final CrashlyticsReport.C2261a f3900c;

    /* renamed from: d */
    private final CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d f3901d;

    /* renamed from: e */
    private final C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> f3902e;

    /* renamed from: com.google.firebase.crashlytics.internal.model.m$b */
    static final class C2360b extends CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b {

        /* renamed from: a */
        private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> f3903a;

        /* renamed from: b */
        private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c f3904b;

        /* renamed from: c */
        private CrashlyticsReport.C2261a f3905c;

        /* renamed from: d */
        private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d f3906d;

        /* renamed from: e */
        private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> f3907e;

        C2360b() {
        }

        /* renamed from: a */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b mo18771a() {
            String str = "";
            if (this.f3906d == null) {
                str = str + " signal";
            }
            if (this.f3907e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C2358m(this.f3903a, this.f3904b, this.f3905c, this.f3906d, this.f3907e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b mo18772b(CrashlyticsReport.C2261a aVar) {
            this.f3905c = aVar;
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b mo18773c(C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> aVar) {
            Objects.requireNonNull(aVar, "Null binaries");
            this.f3907e = aVar;
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b mo18774d(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar) {
            this.f3904b = cVar;
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b mo18775e(CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d dVar) {
            Objects.requireNonNull(dVar, "Null signal");
            this.f3906d = dVar;
            return this;
        }

        /* renamed from: f */
        public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2283b mo18776f(C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> aVar) {
            this.f3903a = aVar;
            return this;
        }
    }

    private C2358m(@Nullable C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> aVar, @Nullable CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar, @Nullable CrashlyticsReport.C2261a aVar2, CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d dVar, C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> aVar3) {
        this.f3898a = aVar;
        this.f3899b = cVar;
        this.f3900c = aVar2;
        this.f3901d = dVar;
        this.f3902e = aVar3;
    }

    @Nullable
    /* renamed from: b */
    public CrashlyticsReport.C2261a mo18755b() {
        return this.f3900c;
    }

    @NonNull
    /* renamed from: c */
    public C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> mo18756c() {
        return this.f3902e;
    }

    @Nullable
    /* renamed from: d */
    public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c mo18757d() {
        return this.f3899b;
    }

    @NonNull
    /* renamed from: e */
    public CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d mo18758e() {
        return this.f3901d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C2270e.C2277d.C2278a.C2280b)) {
            return false;
        }
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b bVar = (CrashlyticsReport.C2270e.C2277d.C2278a.C2280b) obj;
        C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> aVar = this.f3898a;
        if (aVar != null ? aVar.equals(bVar.mo18759f()) : bVar.mo18759f() == null) {
            CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar = this.f3899b;
            if (cVar != null ? cVar.equals(bVar.mo18757d()) : bVar.mo18757d() == null) {
                CrashlyticsReport.C2261a aVar2 = this.f3900c;
                if (aVar2 != null ? aVar2.equals(bVar.mo18755b()) : bVar.mo18755b() == null) {
                    return this.f3901d.equals(bVar.mo18758e()) && this.f3902e.equals(bVar.mo18756c());
                }
            }
        }
    }

    @Nullable
    /* renamed from: f */
    public C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> mo18759f() {
        return this.f3898a;
    }

    public int hashCode() {
        C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> aVar = this.f3898a;
        int i = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c cVar = this.f3899b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        CrashlyticsReport.C2261a aVar2 = this.f3900c;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f3901d.hashCode()) * 1000003) ^ this.f3902e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f3898a + ", exception=" + this.f3899b + ", appExitInfo=" + this.f3900c + ", signal=" + this.f3901d + ", binaries=" + this.f3902e + "}";
    }
}
