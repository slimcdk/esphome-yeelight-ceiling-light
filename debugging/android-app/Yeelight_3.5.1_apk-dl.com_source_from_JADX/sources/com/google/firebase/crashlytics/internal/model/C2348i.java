package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.i */
final class C2348i extends CrashlyticsReport.C2270e.C2271a.C2273b {

    /* renamed from: a */
    private final String f3859a;

    @NonNull
    /* renamed from: a */
    public String mo18704a() {
        return this.f3859a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C2270e.C2271a.C2273b) {
            return this.f3859a.equals(((CrashlyticsReport.C2270e.C2271a.C2273b) obj).mo18704a());
        }
        return false;
    }

    public int hashCode() {
        return this.f3859a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f3859a + "}";
    }
}
