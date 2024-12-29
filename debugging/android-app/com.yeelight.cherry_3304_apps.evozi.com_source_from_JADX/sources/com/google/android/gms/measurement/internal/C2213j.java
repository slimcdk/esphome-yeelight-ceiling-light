package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.internal.measurement.C1772eb;

/* renamed from: com.google.android.gms.measurement.internal.j */
abstract class C2213j {

    /* renamed from: d */
    private static volatile Handler f4207d;

    /* renamed from: a */
    private final C2385y5 f4208a;

    /* renamed from: b */
    private final Runnable f4209b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f4210c;

    C2213j(C2385y5 y5Var) {
        C1609u.m4475k(y5Var);
        this.f4208a = y5Var;
        this.f4209b = new C2201i(this, y5Var);
    }

    /* renamed from: f */
    private final Handler m7140f() {
        Handler handler;
        if (f4207d != null) {
            return f4207d;
        }
        synchronized (C2213j.class) {
            if (f4207d == null) {
                f4207d = new C1772eb(this.f4208a.mo12428c().getMainLooper());
            }
            handler = f4207d;
        }
        return handler;
    }

    /* renamed from: b */
    public abstract void mo12451b();

    /* renamed from: c */
    public final void mo12751c(long j) {
        mo12753e();
        if (j >= 0) {
            this.f4210c = this.f4208a.mo12429f().mo11378a();
            if (!m7140f().postDelayed(this.f4209b, j)) {
                this.f4208a.mo12427b().mo13096F().mo13131b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: d */
    public final boolean mo12752d() {
        return this.f4210c != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12753e() {
        this.f4210c = 0;
        m7140f().removeCallbacks(this.f4209b);
    }
}
