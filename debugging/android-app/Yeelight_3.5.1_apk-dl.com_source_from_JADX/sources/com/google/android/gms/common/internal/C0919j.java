package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C0740e;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;
import p065m0.C3339g;
import p109w.C3844i;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
@KeepForSdk
@DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
/* renamed from: com.google.android.gms.common.internal.j */
public interface C0919j extends C0740e<C3844i> {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    C3339g<Void> mo12285a(@NonNull TelemetryData telemetryData);
}
