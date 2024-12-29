package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
final class C2256m8 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2273o3 f4372a;

    /* renamed from: b */
    private final /* synthetic */ C2222j8 f4373b;

    C2256m8(C2222j8 j8Var, C2273o3 o3Var) {
        this.f4373b = j8Var;
        this.f4372a = o3Var;
    }

    public final void run() {
        synchronized (this.f4373b) {
            boolean unused = this.f4373b.f4249a = false;
            if (!this.f4373b.f4251c.mo12920V()) {
                this.f4373b.f4251c.mo12427b().mo13104O().mo13130a("Connected to service");
                this.f4373b.f4251c.mo12912L(this.f4372a);
            }
        }
    }
}
