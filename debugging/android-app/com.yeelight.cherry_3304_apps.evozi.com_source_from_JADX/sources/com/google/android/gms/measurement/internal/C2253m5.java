package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
final class C2253m5 implements Callable<List<zzy>> {

    /* renamed from: a */
    private final /* synthetic */ String f4358a;

    /* renamed from: b */
    private final /* synthetic */ String f4359b;

    /* renamed from: c */
    private final /* synthetic */ String f4360c;

    /* renamed from: d */
    private final /* synthetic */ C2183g5 f4361d;

    C2253m5(C2183g5 g5Var, String str, String str2, String str3) {
        this.f4361d = g5Var;
        this.f4358a = str;
        this.f4359b = str2;
        this.f4360c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f4361d.f4129a.mo12827d0();
        return this.f4361d.f4129a.mo12819U().mo12513j0(this.f4358a, this.f4359b, this.f4360c);
    }
}
