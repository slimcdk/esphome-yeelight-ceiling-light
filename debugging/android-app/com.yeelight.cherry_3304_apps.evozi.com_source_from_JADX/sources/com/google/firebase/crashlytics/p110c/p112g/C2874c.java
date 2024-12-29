package com.google.firebase.crashlytics.p110c.p112g;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.c.g.c */
final class C2874c extends C2943n {

    /* renamed from: a */
    private final CrashlyticsReport f5538a;

    /* renamed from: b */
    private final String f5539b;

    C2874c(CrashlyticsReport crashlyticsReport, String str) {
        if (crashlyticsReport != null) {
            this.f5538a = crashlyticsReport;
            if (str != null) {
                this.f5539b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    /* renamed from: b */
    public CrashlyticsReport mo17159b() {
        return this.f5538a;
    }

    /* renamed from: c */
    public String mo17160c() {
        return this.f5539b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2943n)) {
            return false;
        }
        C2943n nVar = (C2943n) obj;
        return this.f5538a.equals(nVar.mo17159b()) && this.f5539b.equals(nVar.mo17160c());
    }

    public int hashCode() {
        return ((this.f5538a.hashCode() ^ 1000003) * 1000003) ^ this.f5539b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f5538a + ", sessionId=" + this.f5539b + "}";
    }
}
