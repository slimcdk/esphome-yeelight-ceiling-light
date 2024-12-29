package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

@AutoValue
/* renamed from: com.google.firebase.crashlytics.internal.common.n */
public abstract class C2244n {
    @NonNull
    /* renamed from: a */
    public static C2244n m5741a(CrashlyticsReport crashlyticsReport, String str, File file) {
        return new C2205b(crashlyticsReport, str, file);
    }

    /* renamed from: b */
    public abstract CrashlyticsReport mo18513b();

    /* renamed from: c */
    public abstract File mo18514c();

    /* renamed from: d */
    public abstract String mo18515d();
}
