package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
final class C2195h5 implements Callable<List<C2334t9>> {

    /* renamed from: a */
    private final /* synthetic */ zzm f4153a;

    /* renamed from: b */
    private final /* synthetic */ String f4154b;

    /* renamed from: c */
    private final /* synthetic */ String f4155c;

    /* renamed from: d */
    private final /* synthetic */ C2183g5 f4156d;

    C2195h5(C2183g5 g5Var, zzm zzm, String str, String str2) {
        this.f4156d = g5Var;
        this.f4153a = zzm;
        this.f4154b = str;
        this.f4155c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f4156d.f4129a.mo12827d0();
        return this.f4156d.f4129a.mo12819U().mo12500J(this.f4153a.f4777a, this.f4154b, this.f4155c);
    }
}
