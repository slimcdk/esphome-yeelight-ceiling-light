package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.internal.measurement.C1400z0;

/* renamed from: com.google.android.gms.measurement.internal.o */
abstract class C1723o {

    /* renamed from: d */
    private static volatile Handler f2383d;

    /* renamed from: a */
    private final C1667j6 f2384a;

    /* renamed from: b */
    private final Runnable f2385b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f2386c;

    C1723o(C1667j6 j6Var) {
        C0917i.m1419j(j6Var);
        this.f2384a = j6Var;
        this.f2385b = new C1711n(this, j6Var);
    }

    /* renamed from: f */
    private final Handler m4530f() {
        Handler handler;
        if (f2383d != null) {
            return f2383d;
        }
        synchronized (C1723o.class) {
            if (f2383d == null) {
                f2383d = new C1400z0(this.f2384a.mo14231f().getMainLooper());
            }
            handler = f2383d;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14406b() {
        this.f2386c = 0;
        m4530f().removeCallbacks(this.f2385b);
    }

    /* renamed from: c */
    public abstract void mo14029c();

    /* renamed from: d */
    public final void mo14407d(long j) {
        mo14406b();
        if (j >= 0) {
            this.f2386c = this.f2384a.mo14229c().mo11029a();
            if (!m4530f().postDelayed(this.f2385b, j)) {
                this.f2384a.mo14228b().mo14035r().mo14694b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo14408e() {
        return this.f2386c != 0;
    }
}
