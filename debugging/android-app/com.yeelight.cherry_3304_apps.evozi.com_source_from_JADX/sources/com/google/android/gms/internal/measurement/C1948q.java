package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1728c;
import p011c.p012a.p019b.p028b.p031b.C0564b;

/* renamed from: com.google.android.gms.internal.measurement.q */
final class C1948q extends C1728c.C1729a {

    /* renamed from: e */
    private final /* synthetic */ int f3677e = 5;

    /* renamed from: f */
    private final /* synthetic */ String f3678f;

    /* renamed from: g */
    private final /* synthetic */ Object f3679g;

    /* renamed from: h */
    private final /* synthetic */ Object f3680h;

    /* renamed from: i */
    private final /* synthetic */ Object f3681i;

    /* renamed from: j */
    private final /* synthetic */ C1728c f3682j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1948q(C1728c cVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f3682j = cVar;
        this.f3678f = str;
        this.f3679g = obj;
        this.f3680h = null;
        this.f3681i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11412b() {
        this.f3682j.f3279g.logHealthData(this.f3677e, this.f3678f, C0564b.m335f(this.f3679g), C0564b.m335f(this.f3680h), C0564b.m335f(this.f3681i));
    }
}
