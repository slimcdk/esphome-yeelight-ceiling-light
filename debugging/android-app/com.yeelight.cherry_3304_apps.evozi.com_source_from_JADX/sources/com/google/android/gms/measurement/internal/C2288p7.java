package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
final class C2288p7 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2255m7 f4436a;

    /* renamed from: b */
    private final /* synthetic */ long f4437b;

    /* renamed from: c */
    private final /* synthetic */ C2243l7 f4438c;

    C2288p7(C2243l7 l7Var, C2255m7 m7Var, long j) {
        this.f4438c = l7Var;
        this.f4436a = m7Var;
        this.f4437b = j;
    }

    public final void run() {
        this.f4438c.m7205O(this.f4436a, false, this.f4437b);
        C2243l7 l7Var = this.f4438c;
        l7Var.f4306e = null;
        l7Var.mo12572r().mo12914N((C2255m7) null);
    }
}
