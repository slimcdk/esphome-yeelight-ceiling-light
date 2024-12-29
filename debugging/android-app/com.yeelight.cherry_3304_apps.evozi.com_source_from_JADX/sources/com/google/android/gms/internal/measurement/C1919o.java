package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1728c;

/* renamed from: com.google.android.gms.internal.measurement.o */
final class C1919o extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ String f3602e;

    /* renamed from: f */
    private final /* synthetic */ String f3603f;

    /* renamed from: g */
    private final /* synthetic */ boolean f3604g;

    /* renamed from: h */
    private final /* synthetic */ C1947pc f3605h;

    /* renamed from: i */
    private final /* synthetic */ C1728c f3606i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1919o(C1728c cVar, String str, String str2, boolean z, C1947pc pcVar) {
        super(cVar);
        this.f3606i = cVar;
        this.f3602e = str;
        this.f3603f = str2;
        this.f3604g = z;
        this.f3605h = pcVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3606i.f3279g.getUserProperties(this.f3602e, this.f3603f, this.f3604g, this.f3605h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11538c() {
        this.f3605h.mo11948b((Bundle) null);
    }
}
