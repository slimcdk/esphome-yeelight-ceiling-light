package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
final class C2377x8 {

    /* renamed from: a */
    private C2115a9 f4720a;

    /* renamed from: b */
    final /* synthetic */ C2366w8 f4721b;

    C2377x8(C2366w8 w8Var) {
        this.f4721b = w8Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo13125a() {
        this.f4721b.mo12567h();
        if (this.f4721b.mo13112m().mo12474s(C2302r.f4534q0) && this.f4720a != null) {
            this.f4721b.f4695c.removeCallbacks(this.f4720a);
        }
        if (this.f4721b.mo13112m().mo12474s(C2302r.f4466E0)) {
            this.f4721b.mo13111l().f4241x.mo12795a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo13126b(long j) {
        if (this.f4721b.mo13112m().mo12474s(C2302r.f4534q0)) {
            this.f4720a = new C2115a9(this, this.f4721b.mo12429f().mo11378a(), j);
            this.f4721b.f4695c.postDelayed(this.f4720a, 2000);
        }
    }
}
