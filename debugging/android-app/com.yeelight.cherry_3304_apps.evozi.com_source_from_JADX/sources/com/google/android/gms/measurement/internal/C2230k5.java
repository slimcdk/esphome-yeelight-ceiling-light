package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
final class C2230k5 implements Callable<List<C2334t9>> {

    /* renamed from: a */
    private final /* synthetic */ String f4264a;

    /* renamed from: b */
    private final /* synthetic */ String f4265b;

    /* renamed from: c */
    private final /* synthetic */ String f4266c;

    /* renamed from: d */
    private final /* synthetic */ C2183g5 f4267d;

    C2230k5(C2183g5 g5Var, String str, String str2, String str3) {
        this.f4267d = g5Var;
        this.f4264a = str;
        this.f4265b = str2;
        this.f4266c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f4267d.f4129a.mo12827d0();
        return this.f4267d.f4129a.mo12819U().mo12500J(this.f4264a, this.f4265b, this.f4266c);
    }
}
