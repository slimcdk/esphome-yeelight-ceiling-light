package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.b0 */
final class C1714b0 extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Activity f3233e;

    /* renamed from: f */
    private final /* synthetic */ C1728c.C1731c f3234f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1714b0(C1728c.C1731c cVar, Activity activity) {
        super(C1728c.this);
        this.f3234f = cVar;
        this.f3233e = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        C1728c.this.f3279g.onActivityPaused(C0564b.m335f(this.f3233e), this.f3281b);
    }
}