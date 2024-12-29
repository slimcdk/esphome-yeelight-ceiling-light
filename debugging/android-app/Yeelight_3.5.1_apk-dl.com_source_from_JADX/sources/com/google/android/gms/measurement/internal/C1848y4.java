package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1033bb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
public final /* synthetic */ class C1848y4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1614f5 f2785a;

    /* renamed from: b */
    public final /* synthetic */ String f2786b;

    public /* synthetic */ C1848y4(C1614f5 f5Var, String str) {
        this.f2785a = f5Var;
        this.f2786b = str;
    }

    public final Object call() {
        return new C1033bb("internal.remoteConfig", new C1601e5(this.f2785a, this.f2786b));
    }
}
