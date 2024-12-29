package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1291rd;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
final class C1615f6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2085a;

    /* renamed from: b */
    final /* synthetic */ String f2086b;

    /* renamed from: c */
    final /* synthetic */ String f2087c;

    /* renamed from: d */
    final /* synthetic */ long f2088d;

    /* renamed from: e */
    final /* synthetic */ C1628g6 f2089e;

    C1615f6(C1628g6 g6Var, String str, String str2, String str3, long j) {
        this.f2089e = g6Var;
        this.f2085a = str;
        this.f2086b = str2;
        this.f2087c = str3;
        this.f2088d = j;
    }

    public final void run() {
        C1291rd.m2726b();
        if (this.f2089e.f2110a.mo14464T().mo14163B((String) null, C1727o3.f2464r0)) {
            String str = this.f2085a;
            if (str == null) {
                this.f2089e.f2110a.mo14495v(this.f2086b, (C1552a8) null);
                return;
            }
            this.f2089e.f2110a.mo14495v(this.f2086b, new C1552a8(this.f2087c, str, this.f2088d));
            return;
        }
        String str2 = this.f2085a;
        if (str2 == null) {
            this.f2089e.f2110a.mo14471b0().mo14379K().mo14263G(this.f2086b, (C1552a8) null);
            return;
        }
        this.f2089e.f2110a.mo14471b0().mo14379K().mo14263G(this.f2086b, new C1552a8(this.f2087c, str2, this.f2088d));
    }
}
