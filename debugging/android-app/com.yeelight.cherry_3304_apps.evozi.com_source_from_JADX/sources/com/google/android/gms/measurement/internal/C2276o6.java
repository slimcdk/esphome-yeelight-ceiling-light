package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.o6 */
final class C2276o6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bundle f4405a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4406b;

    C2276o6(C2196h6 h6Var, Bundle bundle) {
        this.f4406b = h6Var;
        this.f4405a = bundle;
    }

    public final void run() {
        this.f4406b.m7082x0(this.f4405a);
    }
}
