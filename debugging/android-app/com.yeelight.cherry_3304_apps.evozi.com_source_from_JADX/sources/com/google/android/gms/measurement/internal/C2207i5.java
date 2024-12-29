package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
final class C2207i5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzy f4191a;

    /* renamed from: b */
    private final /* synthetic */ C2183g5 f4192b;

    C2207i5(C2183g5 g5Var, zzy zzy) {
        this.f4192b = g5Var;
        this.f4191a = zzy;
    }

    public final void run() {
        this.f4192b.f4129a.mo12827d0();
        if (this.f4191a.f4801c.mo13160Q() == null) {
            this.f4192b.f4129a.mo12813O(this.f4191a);
        } else {
            this.f4192b.f4129a.mo12837w(this.f4191a);
        }
    }
}
