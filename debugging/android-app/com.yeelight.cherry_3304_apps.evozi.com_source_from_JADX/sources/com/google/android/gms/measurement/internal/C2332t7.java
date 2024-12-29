package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t7 */
final class C2332t7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f4622a;

    /* renamed from: b */
    private final /* synthetic */ zzkn f4623b;

    /* renamed from: c */
    private final /* synthetic */ zzm f4624c;

    /* renamed from: d */
    private final /* synthetic */ C2310r7 f4625d;

    C2332t7(C2310r7 r7Var, boolean z, zzkn zzkn, zzm zzm) {
        this.f4625d = r7Var;
        this.f4622a = z;
        this.f4623b = zzkn;
        this.f4624c = zzm;
    }

    public final void run() {
        C2273o3 k0 = this.f4625d.f4563d;
        if (k0 == null) {
            this.f4625d.mo12427b().mo13096F().mo13130a("Discarding data. Failed to set user property");
            return;
        }
        this.f4625d.mo12913M(k0, this.f4622a ? null : this.f4623b, this.f4624c);
        this.f4625d.m7501e0();
    }
}
