package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
final class C2279o9 implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzm f4414a;

    /* renamed from: b */
    private final /* synthetic */ C2245l9 f4415b;

    C2279o9(C2245l9 l9Var, zzm zzm) {
        this.f4415b = l9Var;
        this.f4414a = zzm;
    }

    public final /* synthetic */ Object call() {
        C2147d5 R = this.f4415b.mo12816R(this.f4414a);
        if (R != null) {
            return R.mo12638x();
        }
        this.f4415b.mo12427b().mo13099J().mo13130a("App info was null when attempting to get app instance id");
        return null;
    }
}
