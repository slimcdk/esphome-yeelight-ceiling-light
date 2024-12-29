package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: com.google.android.gms.measurement.internal.la */
final class C1697la implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2288a;

    /* renamed from: b */
    final /* synthetic */ String f2289b = "_err";

    /* renamed from: c */
    final /* synthetic */ Bundle f2290c;

    /* renamed from: d */
    final /* synthetic */ C1710ma f2291d;

    C1697la(C1710ma maVar, String str, String str2, Bundle bundle) {
        this.f2291d = maVar;
        this.f2288a = str;
        this.f2290c = bundle;
    }

    public final void run() {
        this.f2291d.f2314a.mo14482j((zzaw) C0917i.m1419j(this.f2291d.f2314a.mo14477g0().mo14687w0(this.f2288a, this.f2289b, this.f2290c, "auto", this.f2291d.f2314a.mo14229c().mo11029a(), false, true)), this.f2288a);
    }
}
