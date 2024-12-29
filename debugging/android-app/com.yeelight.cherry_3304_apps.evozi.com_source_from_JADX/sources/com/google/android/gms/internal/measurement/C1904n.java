package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.n */
final class C1904n extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ C1947pc f3591e;

    /* renamed from: f */
    private final /* synthetic */ C1728c f3592f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1904n(C1728c cVar, C1947pc pcVar) {
        super(cVar);
        this.f3592f = cVar;
        this.f3591e = pcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3592f.f3279g.generateEventId(this.f3591e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11538c() {
        this.f3591e.mo11948b((Bundle) null);
    }
}
