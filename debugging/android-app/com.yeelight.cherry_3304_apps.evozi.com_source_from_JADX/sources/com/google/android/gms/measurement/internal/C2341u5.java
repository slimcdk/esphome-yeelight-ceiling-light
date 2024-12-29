package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
final class C2341u5 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f4641a;

    /* renamed from: b */
    private final /* synthetic */ String f4642b;

    /* renamed from: c */
    private final /* synthetic */ String f4643c;

    /* renamed from: d */
    private final /* synthetic */ long f4644d;

    /* renamed from: e */
    private final /* synthetic */ C2183g5 f4645e;

    C2341u5(C2183g5 g5Var, String str, String str2, String str3, long j) {
        this.f4645e = g5Var;
        this.f4641a = str;
        this.f4642b = str2;
        this.f4643c = str3;
        this.f4644d = j;
    }

    public final void run() {
        String str = this.f4641a;
        if (str == null) {
            this.f4645e.f4129a.mo12829f0().mo12421P().mo12803P(this.f4642b, (C2255m7) null);
            return;
        }
        this.f4645e.f4129a.mo12829f0().mo12421P().mo12803P(this.f4642b, new C2255m7(this.f4643c, str, this.f4644d));
    }
}
