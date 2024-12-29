package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
public final class C1914n8 implements C1864k8 {

    /* renamed from: a */
    private static final C2026v1<Boolean> f3595a;

    /* renamed from: b */
    private static final C2026v1<Long> f3596b;

    static {
        C1717b2 b2Var = new C1717b2(C2043w1.m6255a("com.google.android.gms.measurement"));
        f3595a = b2Var.mo11455d("measurement.sdk.attribution.cache", true);
        f3596b = b2Var.mo11453b("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    /* renamed from: C */
    public final boolean mo11785C() {
        return f3595a.mo12125n().booleanValue();
    }

    /* renamed from: D */
    public final long mo11786D() {
        return f3596b.mo12125n().longValue();
    }
}
