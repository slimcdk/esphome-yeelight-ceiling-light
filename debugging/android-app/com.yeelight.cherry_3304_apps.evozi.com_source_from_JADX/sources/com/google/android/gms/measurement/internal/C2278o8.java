package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
final class C2278o8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2273o3 f4412a;

    /* renamed from: b */
    private final /* synthetic */ C2222j8 f4413b;

    C2278o8(C2222j8 j8Var, C2273o3 o3Var) {
        this.f4413b = j8Var;
        this.f4412a = o3Var;
    }

    public final void run() {
        synchronized (this.f4413b) {
            boolean unused = this.f4413b.f4249a = false;
            if (!this.f4413b.f4251c.mo12920V()) {
                this.f4413b.f4251c.mo12427b().mo13103N().mo13130a("Connected to remote service");
                this.f4413b.f4251c.mo12912L(this.f4412a);
            }
        }
    }
}
