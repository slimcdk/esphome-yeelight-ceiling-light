package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
final class C2254m6 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4362a;

    /* renamed from: b */
    private final /* synthetic */ String f4363b;

    /* renamed from: c */
    private final /* synthetic */ Object f4364c;

    /* renamed from: d */
    private final /* synthetic */ long f4365d;

    /* renamed from: e */
    private final /* synthetic */ C2196h6 f4366e;

    C2254m6(C2196h6 h6Var, String str, String str2, Object obj, long j) {
        this.f4366e = h6Var;
        this.f4362a = str;
        this.f4363b = str2;
        this.f4364c = obj;
        this.f4365d = j;
    }

    public final void run() {
        this.f4366e.mo12712V(this.f4362a, this.f4363b, this.f4364c, this.f4365d);
    }
}
