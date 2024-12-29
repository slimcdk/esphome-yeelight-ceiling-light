package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
final class C2344u8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2245l9 f4649a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f4650b;

    C2344u8(C2289p8 p8Var, C2245l9 l9Var, Runnable runnable) {
        this.f4649a = l9Var;
        this.f4650b = runnable;
    }

    public final void run() {
        this.f4649a.mo12827d0();
        this.f4649a.mo12839y(this.f4650b);
        this.f4649a.mo12826c0();
    }
}
