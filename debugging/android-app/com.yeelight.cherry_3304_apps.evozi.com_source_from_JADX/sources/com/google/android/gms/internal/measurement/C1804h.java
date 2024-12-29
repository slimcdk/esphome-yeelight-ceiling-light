package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.h */
final class C1804h extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Activity f3432e;

    /* renamed from: f */
    private final /* synthetic */ String f3433f;

    /* renamed from: g */
    private final /* synthetic */ String f3434g;

    /* renamed from: h */
    private final /* synthetic */ C1728c f3435h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1804h(C1728c cVar, Activity activity, String str, String str2) {
        super(cVar);
        this.f3435h = cVar;
        this.f3432e = activity;
        this.f3433f = str;
        this.f3434g = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3435h.f3279g.setCurrentScreen(C0564b.m335f(this.f3432e), this.f3433f, this.f3434g, this.f3280a);
    }
}
