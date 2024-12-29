package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.z */
final class C2087z extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Activity f3860e;

    /* renamed from: f */
    private final /* synthetic */ C1728c.C1731c f3861f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2087z(C1728c.C1731c cVar, Activity activity) {
        super(C1728c.this);
        this.f3861f = cVar;
        this.f3860e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        C1728c.this.f3279g.onActivityStarted(C0564b.m335f(this.f3860e), this.f3281b);
    }
}
