package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2051w9;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
final class C2265n6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f4386a;

    /* renamed from: b */
    private final /* synthetic */ C2196h6 f4387b;

    C2265n6(C2196h6 h6Var, long j) {
        this.f4387b = h6Var;
        this.f4386a = j;
    }

    public final void run() {
        C2196h6 h6Var = this.f4387b;
        long j = this.f4386a;
        h6Var.mo12567h();
        h6Var.mo12566d();
        h6Var.mo12537x();
        h6Var.mo12427b().mo13103N().mo13130a("Resetting analytics data (FE)");
        C2366w8 u = h6Var.mo12575u();
        u.mo12567h();
        u.f4697e.mo12557a();
        boolean p = h6Var.f4689a.mo12436p();
        C2218j4 l = h6Var.mo13111l();
        l.f4227j.mo12850b(j);
        if (!TextUtils.isEmpty(l.mo13111l().f4216A.mo12869a())) {
            l.f4216A.mo12870b((String) null);
        }
        if (C2051w9.m6284a() && l.mo13112m().mo12474s(C2302r.f4548x0)) {
            l.f4239v.mo12850b(0);
        }
        if (!l.mo13112m().mo12461G()) {
            l.mo12770z(!p);
        }
        l.f4217B.mo12870b((String) null);
        l.f4218C.mo12850b(0);
        l.f4219D.mo12859b((Bundle) null);
        h6Var.mo12572r().mo12922X();
        if (C2051w9.m6284a() && h6Var.mo13112m().mo12474s(C2302r.f4548x0)) {
            h6Var.mo12575u().f4696d.mo12662a();
        }
        h6Var.f4163i = !p;
        this.f4387b.mo12572r().mo12917S(new AtomicReference());
    }
}
