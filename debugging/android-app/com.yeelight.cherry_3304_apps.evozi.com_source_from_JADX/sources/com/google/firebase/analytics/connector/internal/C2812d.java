package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p109a.C2801a;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
public final class C2812d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2801a.C2803b f5424a;

    /* renamed from: b */
    private AppMeasurement f5425b;

    /* renamed from: c */
    private C2814f f5426c;

    public C2812d(AppMeasurement appMeasurement, C2801a.C2803b bVar) {
        this.f5424a = bVar;
        this.f5425b = appMeasurement;
        C2814f fVar = new C2814f(this);
        this.f5426c = fVar;
        this.f5425b.mo12363a(fVar);
    }
}
