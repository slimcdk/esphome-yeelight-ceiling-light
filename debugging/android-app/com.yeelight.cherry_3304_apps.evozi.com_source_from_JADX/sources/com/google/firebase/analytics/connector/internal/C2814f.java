package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.firebase.analytics.connector.internal.f */
final class C2814f implements AppMeasurement.C2102a {

    /* renamed from: a */
    private final /* synthetic */ C2812d f5428a;

    public C2814f(C2812d dVar) {
        this.f5428a = dVar;
    }

    /* renamed from: a */
    public final void mo12401a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && C2811c.m8548e(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f5428a.f5424a.mo17053b(3, bundle2);
        }
    }
}
