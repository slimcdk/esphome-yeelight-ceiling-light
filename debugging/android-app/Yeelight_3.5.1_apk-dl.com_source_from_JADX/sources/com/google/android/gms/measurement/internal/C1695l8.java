package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
final class C1695l8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2275a;

    /* renamed from: b */
    final /* synthetic */ boolean f2276b;

    /* renamed from: c */
    final /* synthetic */ zzlo f2277c;

    /* renamed from: d */
    final /* synthetic */ C1670j9 f2278d;

    C1695l8(C1670j9 j9Var, zzq zzq, boolean z, zzlo zzlo) {
        this.f2278d = j9Var;
        this.f2275a = zzq;
        this.f2276b = z;
        this.f2277c = zzlo;
    }

    public final void run() {
        C1670j9 j9Var = this.f2278d;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Failed to set user property");
            return;
        }
        C0917i.m1419j(this.f2275a);
        this.f2278d.mo14283r(H, this.f2276b ? null : this.f2277c, this.f2275a);
        this.f2278d.m4342E();
    }
}
