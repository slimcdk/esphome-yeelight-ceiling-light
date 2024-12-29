package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1228ne;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
public final /* synthetic */ class C1860z4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1614f5 f2820a;

    /* renamed from: b */
    public final /* synthetic */ String f2821b;

    public /* synthetic */ C1860z4(C1614f5 f5Var, String str) {
        this.f2820a = f5Var;
        this.f2821b = str;
    }

    public final Object call() {
        return new C1228ne("internal.appMetadata", new C1836x4(this.f2820a, this.f2821b));
    }
}
