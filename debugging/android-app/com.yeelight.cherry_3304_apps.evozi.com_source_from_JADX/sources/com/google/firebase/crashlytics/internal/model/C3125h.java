package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: com.google.firebase.crashlytics.internal.model.h */
final class C3125h extends CrashlyticsReport.C3054d.C3055a.C3057b {

    /* renamed from: a */
    private final String f6020a;

    @NonNull
    /* renamed from: a */
    public String mo17492a() {
        return this.f6020a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.C3054d.C3055a.C3057b) {
            return this.f6020a.equals(((CrashlyticsReport.C3054d.C3055a.C3057b) obj).mo17492a());
        }
        return false;
    }

    public int hashCode() {
        return this.f6020a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f6020a + "}";
    }
}
