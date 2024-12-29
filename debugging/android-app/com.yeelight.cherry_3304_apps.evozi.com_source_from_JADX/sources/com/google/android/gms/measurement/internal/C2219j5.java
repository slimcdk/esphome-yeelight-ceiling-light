package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
final class C2219j5 implements Callable<List<zzy>> {

    /* renamed from: a */
    private final /* synthetic */ zzm f4244a;

    /* renamed from: b */
    private final /* synthetic */ String f4245b;

    /* renamed from: c */
    private final /* synthetic */ String f4246c;

    /* renamed from: d */
    private final /* synthetic */ C2183g5 f4247d;

    C2219j5(C2183g5 g5Var, zzm zzm, String str, String str2) {
        this.f4247d = g5Var;
        this.f4244a = zzm;
        this.f4245b = str;
        this.f4246c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f4247d.f4129a.mo12827d0();
        return this.f4247d.f4129a.mo12819U().mo12513j0(this.f4244a.f4777a, this.f4245b, this.f4246c);
    }
}
