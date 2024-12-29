package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.g */
final class C1789g extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ String f3355e;

    /* renamed from: f */
    private final /* synthetic */ String f3356f;

    /* renamed from: g */
    private final /* synthetic */ C1947pc f3357g;

    /* renamed from: h */
    private final /* synthetic */ C1728c f3358h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1789g(C1728c cVar, String str, String str2, C1947pc pcVar) {
        super(cVar);
        this.f3358h = cVar;
        this.f3355e = str;
        this.f3356f = str2;
        this.f3357g = pcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3358h.f3279g.getConditionalUserProperties(this.f3355e, this.f3356f, this.f3357g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11538c() {
        this.f3357g.mo11948b((Bundle) null);
    }
}
