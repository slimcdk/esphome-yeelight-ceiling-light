package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
final class C2231k6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4268a;

    /* renamed from: b */
    private final /* synthetic */ String f4269b;

    /* renamed from: c */
    private final /* synthetic */ long f4270c;

    /* renamed from: d */
    private final /* synthetic */ Bundle f4271d;

    /* renamed from: e */
    private final /* synthetic */ boolean f4272e;

    /* renamed from: f */
    private final /* synthetic */ boolean f4273f;

    /* renamed from: g */
    private final /* synthetic */ boolean f4274g;

    /* renamed from: h */
    private final /* synthetic */ String f4275h;

    /* renamed from: i */
    private final /* synthetic */ C2196h6 f4276i;

    C2231k6(C2196h6 h6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f4276i = h6Var;
        this.f4268a = str;
        this.f4269b = str2;
        this.f4270c = j;
        this.f4271d = bundle;
        this.f4272e = z;
        this.f4273f = z2;
        this.f4274g = z3;
        this.f4275h = str3;
    }

    public final void run() {
        this.f4276i.mo12708Q(this.f4268a, this.f4269b, this.f4270c, this.f4271d, this.f4272e, this.f4273f, this.f4274g, this.f4275h);
    }
}
