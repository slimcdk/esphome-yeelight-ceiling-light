package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p109a.C2801a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C2810b {

    /* renamed from: a */
    Set<String> f5416a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2801a.C2803b f5417b;

    /* renamed from: c */
    private AppMeasurement f5418c;

    /* renamed from: d */
    private C2813e f5419d;

    public C2810b(AppMeasurement appMeasurement, C2801a.C2803b bVar) {
        this.f5417b = bVar;
        this.f5418c = appMeasurement;
        C2813e eVar = new C2813e(this);
        this.f5419d = eVar;
        this.f5418c.mo12363a(eVar);
    }
}
