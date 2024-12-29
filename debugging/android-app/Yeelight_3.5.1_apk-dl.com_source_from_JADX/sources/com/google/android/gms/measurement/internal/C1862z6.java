package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C1862z6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2825a;

    /* renamed from: b */
    final /* synthetic */ String f2826b;

    /* renamed from: c */
    final /* synthetic */ Object f2827c;

    /* renamed from: d */
    final /* synthetic */ long f2828d;

    /* renamed from: e */
    final /* synthetic */ C1791t7 f2829e;

    C1862z6(C1791t7 t7Var, String str, String str2, Object obj, long j) {
        this.f2829e = t7Var;
        this.f2825a = str;
        this.f2826b = str2;
        this.f2827c = obj;
        this.f2828d = j;
    }

    public final void run() {
        this.f2829e.mo14549O(this.f2825a, this.f2826b, this.f2827c, this.f2828d);
    }
}
