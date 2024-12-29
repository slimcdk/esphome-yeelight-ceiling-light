package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
final class C1852y8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2799a;

    /* renamed from: b */
    final /* synthetic */ boolean f2800b;

    /* renamed from: c */
    final /* synthetic */ zzac f2801c;

    /* renamed from: d */
    final /* synthetic */ C1670j9 f2802d;

    C1852y8(C1670j9 j9Var, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.f2802d = j9Var;
        this.f2799a = zzq;
        this.f2800b = z2;
        this.f2801c = zzac;
    }

    public final void run() {
        C1670j9 j9Var = this.f2802d;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C0917i.m1419j(this.f2799a);
        this.f2802d.mo14283r(H, this.f2800b ? null : this.f2801c, this.f2799a);
        this.f2802d.m4342E();
    }
}
