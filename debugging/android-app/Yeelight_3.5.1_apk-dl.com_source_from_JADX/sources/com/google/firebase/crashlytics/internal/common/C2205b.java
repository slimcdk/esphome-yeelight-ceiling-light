package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.common.b */
final class C2205b extends C2244n {

    /* renamed from: a */
    private final CrashlyticsReport f3522a;

    /* renamed from: b */
    private final String f3523b;

    /* renamed from: c */
    private final File f3524c;

    C2205b(CrashlyticsReport crashlyticsReport, String str, File file) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.f3522a = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.f3523b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f3524c = file;
    }

    /* renamed from: b */
    public CrashlyticsReport mo18513b() {
        return this.f3522a;
    }

    /* renamed from: c */
    public File mo18514c() {
        return this.f3524c;
    }

    /* renamed from: d */
    public String mo18515d() {
        return this.f3523b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244n)) {
            return false;
        }
        C2244n nVar = (C2244n) obj;
        return this.f3522a.equals(nVar.mo18513b()) && this.f3523b.equals(nVar.mo18515d()) && this.f3524c.equals(nVar.mo18514c());
    }

    public int hashCode() {
        return ((((this.f3522a.hashCode() ^ 1000003) * 1000003) ^ this.f3523b.hashCode()) * 1000003) ^ this.f3524c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f3522a + ", sessionId=" + this.f3523b + ", reportFile=" + this.f3524c + "}";
    }
}
