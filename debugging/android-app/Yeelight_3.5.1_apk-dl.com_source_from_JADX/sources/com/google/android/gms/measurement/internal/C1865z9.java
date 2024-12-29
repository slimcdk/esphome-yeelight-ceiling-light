package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C1400z0;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
public final class C1865z9 extends C1561b4 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f2835c;

    /* renamed from: d */
    protected final C1853y9 f2836d = new C1853y9(this);

    /* renamed from: e */
    protected final C1841x9 f2837e = new C1841x9(this);

    /* renamed from: f */
    protected final C1817v9 f2838f = new C1817v9(this);

    C1865z9(C1717n5 n5Var) {
        super(n5Var);
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m4911q(C1865z9 z9Var, long j) {
        z9Var.mo14009h();
        z9Var.m4913s();
        z9Var.f2143a.mo14228b().mo14039v().mo14694b("Activity paused, time", Long.valueOf(j));
        z9Var.f2838f.mo14612a(j);
        if (z9Var.f2143a.mo14402z().mo14165D()) {
            z9Var.f2837e.mo14632b(j);
        }
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m4912r(C1865z9 z9Var, long j) {
        z9Var.mo14009h();
        z9Var.m4913s();
        z9Var.f2143a.mo14228b().mo14039v().mo14694b("Activity resumed, time", Long.valueOf(j));
        if (z9Var.f2143a.mo14402z().mo14165D() || z9Var.f2143a.mo14375F().f2575q.mo14351b()) {
            z9Var.f2837e.mo14633c(j);
        }
        z9Var.f2838f.mo14613b();
        C1853y9 y9Var = z9Var.f2836d;
        y9Var.f2803a.mo14009h();
        if (y9Var.f2803a.f2143a.mo14395o()) {
            y9Var.mo14642b(y9Var.f2803a.f2143a.mo14229c().mo11029a(), false);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: s */
    public final void m4913s() {
        mo14009h();
        if (this.f2835c == null) {
            this.f2835c = new C1400z0(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo14025n() {
        return false;
    }
}
