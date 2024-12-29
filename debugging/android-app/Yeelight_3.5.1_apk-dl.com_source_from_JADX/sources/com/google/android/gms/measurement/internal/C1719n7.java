package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1338ud;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
final class C1719n7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1634h f2369a;

    /* renamed from: b */
    final /* synthetic */ long f2370b;

    /* renamed from: c */
    final /* synthetic */ int f2371c;

    /* renamed from: d */
    final /* synthetic */ long f2372d;

    /* renamed from: e */
    final /* synthetic */ boolean f2373e;

    /* renamed from: f */
    final /* synthetic */ C1634h f2374f;

    /* renamed from: g */
    final /* synthetic */ C1791t7 f2375g;

    C1719n7(C1791t7 t7Var, C1634h hVar, long j, int i, long j2, boolean z, C1634h hVar2) {
        this.f2375g = t7Var;
        this.f2369a = hVar;
        this.f2370b = j;
        this.f2371c = i;
        this.f2372d = j2;
        this.f2373e = z;
        this.f2374f = hVar2;
    }

    public final void run() {
        this.f2375g.mo14546L(this.f2369a);
        this.f2375g.mo14535A(this.f2370b, false);
        C1791t7.m4698f0(this.f2375g, this.f2369a, this.f2371c, this.f2372d, true, this.f2373e);
        C1338ud.m3082b();
        if (this.f2375g.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2403G0)) {
            C1791t7.m4697e0(this.f2375g, this.f2369a, this.f2374f);
        }
    }
}
