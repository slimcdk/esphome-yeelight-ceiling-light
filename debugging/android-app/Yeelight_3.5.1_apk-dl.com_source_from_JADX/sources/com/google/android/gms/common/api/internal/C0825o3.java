package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.o3 */
final class C0825o3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f736a;

    /* renamed from: b */
    final /* synthetic */ String f737b;

    /* renamed from: c */
    final /* synthetic */ zzd f738c;

    C0825o3(zzd zzd, LifecycleCallback lifecycleCallback, String str) {
        this.f738c = zzd;
        this.f736a = lifecycleCallback;
        this.f737b = str;
    }

    public final void run() {
        zzd zzd = this.f738c;
        if (zzd.f882b > 0) {
            this.f736a.mo11894f(zzd.f883c != null ? zzd.f883c.getBundle(this.f737b) : null);
        }
        if (this.f738c.f882b >= 2) {
            this.f736a.mo11898j();
        }
        if (this.f738c.f882b >= 3) {
            this.f736a.mo11896h();
        }
        if (this.f738c.f882b >= 4) {
            this.f736a.mo11899k();
        }
        if (this.f738c.f882b >= 5) {
            this.f736a.mo11895g();
        }
    }
}
