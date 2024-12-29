package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.e */
final class C1759e extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ String f3311e;

    /* renamed from: f */
    private final /* synthetic */ String f3312f;

    /* renamed from: g */
    private final /* synthetic */ Bundle f3313g;

    /* renamed from: h */
    private final /* synthetic */ C1728c f3314h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1759e(C1728c cVar, String str, String str2, Bundle bundle) {
        super(cVar);
        this.f3314h = cVar;
        this.f3311e = str;
        this.f3312f = str2;
        this.f3313g = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3314h.f3279g.clearConditionalUserProperty(this.f3311e, this.f3312f, this.f3313g);
    }
}
