package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
final class C1840x8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f2766a;

    /* renamed from: b */
    final /* synthetic */ boolean f2767b;

    /* renamed from: c */
    final /* synthetic */ zzaw f2768c;

    /* renamed from: d */
    final /* synthetic */ C1670j9 f2769d;

    C1840x8(C1670j9 j9Var, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.f2769d = j9Var;
        this.f2766a = zzq;
        this.f2767b = z2;
        this.f2768c = zzaw;
    }

    public final void run() {
        C1670j9 j9Var = this.f2769d;
        C1763r3 H = j9Var.f2204d;
        if (H == null) {
            j9Var.f2143a.mo14228b().mo14035r().mo14693a("Discarding data. Failed to send event to service");
            return;
        }
        C0917i.m1419j(this.f2766a);
        this.f2769d.mo14283r(H, this.f2767b ? null : this.f2768c, this.f2766a);
        this.f2769d.m4342E();
    }
}
