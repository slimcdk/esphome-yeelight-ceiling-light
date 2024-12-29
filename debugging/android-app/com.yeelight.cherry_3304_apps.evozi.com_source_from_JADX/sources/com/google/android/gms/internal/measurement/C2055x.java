package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.x */
final class C2055x extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Activity f3810e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f3811f;

    /* renamed from: g */
    private final /* synthetic */ C1728c.C1731c f3812g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2055x(C1728c.C1731c cVar, Activity activity, Bundle bundle) {
        super(C1728c.this);
        this.f3812g = cVar;
        this.f3810e = activity;
        this.f3811f = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        C1728c.this.f3279g.onActivityCreated(C0564b.m335f(this.f3810e), this.f3811f, this.f3281b);
    }
}
