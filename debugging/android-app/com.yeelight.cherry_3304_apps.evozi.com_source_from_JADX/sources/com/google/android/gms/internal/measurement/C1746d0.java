package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
final class C1746d0 extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Activity f3296e;

    /* renamed from: f */
    private final /* synthetic */ C1947pc f3297f;

    /* renamed from: g */
    private final /* synthetic */ C1728c.C1731c f3298g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1746d0(C1728c.C1731c cVar, Activity activity, C1947pc pcVar) {
        super(C1728c.this);
        this.f3298g = cVar;
        this.f3296e = activity;
        this.f3297f = pcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        C1728c.this.f3279g.onActivitySaveInstanceState(C0564b.m335f(this.f3296e), this.f3297f, this.f3281b);
    }
}
