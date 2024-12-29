package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
final class C2813e implements AppMeasurement.C2102a {

    /* renamed from: a */
    private final /* synthetic */ C2810b f5427a;

    public C2813e(C2810b bVar) {
        this.f5427a = bVar;
    }

    /* renamed from: a */
    public final void mo12401a(String str, String str2, Bundle bundle, long j) {
        if (this.f5427a.f5416a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C2811c.m8549f(str2));
            this.f5427a.f5417b.mo17053b(2, bundle2);
        }
    }
}
