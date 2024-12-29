package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.r */
final class C1962r extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ String f3690e;

    /* renamed from: f */
    private final /* synthetic */ C1947pc f3691f;

    /* renamed from: g */
    private final /* synthetic */ C1728c f3692g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1962r(C1728c cVar, String str, C1947pc pcVar) {
        super(cVar);
        this.f3692g = cVar;
        this.f3690e = str;
        this.f3691f = pcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3692g.f3279g.getMaxUserProperties(this.f3690e, this.f3691f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11538c() {
        this.f3691f.mo11948b((Bundle) null);
    }
}
