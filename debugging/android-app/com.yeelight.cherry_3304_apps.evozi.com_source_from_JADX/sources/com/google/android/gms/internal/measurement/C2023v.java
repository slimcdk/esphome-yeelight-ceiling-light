package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.v */
final class C2023v extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ Long f3745e;

    /* renamed from: f */
    private final /* synthetic */ String f3746f;

    /* renamed from: g */
    private final /* synthetic */ String f3747g;

    /* renamed from: h */
    private final /* synthetic */ Bundle f3748h;

    /* renamed from: i */
    private final /* synthetic */ boolean f3749i;

    /* renamed from: j */
    private final /* synthetic */ boolean f3750j;

    /* renamed from: k */
    private final /* synthetic */ C1728c f3751k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2023v(C1728c cVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(cVar);
        this.f3751k = cVar;
        this.f3745e = l;
        this.f3746f = str;
        this.f3747g = str2;
        this.f3748h = bundle;
        this.f3749i = z;
        this.f3750j = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        Long l = this.f3745e;
        this.f3751k.f3279g.logEvent(this.f3746f, this.f3747g, this.f3748h, this.f3749i, this.f3750j, l == null ? this.f3280a : l.longValue());
    }
}
