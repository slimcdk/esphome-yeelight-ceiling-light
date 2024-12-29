package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
final class C1888m3 {

    /* renamed from: a */
    private final C2028v3 f3564a;

    /* renamed from: b */
    private final byte[] f3565b;

    private C1888m3(int i) {
        byte[] bArr = new byte[i];
        this.f3565b = bArr;
        this.f3564a = C2028v3.m6148f(bArr);
    }

    /* synthetic */ C1888m3(int i, C1810h3 h3Var) {
        this(i);
    }

    /* renamed from: a */
    public final C1779f3 mo11836a() {
        this.f3564a.mo12126N();
        return new C1924o3(this.f3565b);
    }

    /* renamed from: b */
    public final C2028v3 mo11837b() {
        return this.f3564a;
    }
}
