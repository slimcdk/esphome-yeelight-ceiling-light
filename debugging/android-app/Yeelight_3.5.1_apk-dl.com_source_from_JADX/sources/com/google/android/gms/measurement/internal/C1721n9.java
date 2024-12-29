package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
public final /* synthetic */ class C1721n9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1757q9 f2379a;

    /* renamed from: b */
    public final /* synthetic */ int f2380b;

    /* renamed from: c */
    public final /* synthetic */ C1574c4 f2381c;

    /* renamed from: d */
    public final /* synthetic */ Intent f2382d;

    public /* synthetic */ C1721n9(C1757q9 q9Var, int i, C1574c4 c4Var, Intent intent) {
        this.f2379a = q9Var;
        this.f2380b = i;
        this.f2381c = c4Var;
        this.f2382d = intent;
    }

    public final void run() {
        this.f2379a.mo14434c(this.f2380b, this.f2381c, this.f2382d);
    }
}
