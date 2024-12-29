package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C1772eb;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
public final class C2366w8 extends C2133c3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f4695c;

    /* renamed from: d */
    protected final C2175f9 f4696d = new C2175f9(this);

    /* renamed from: e */
    protected final C2139c9 f4697e = new C2139c9(this);

    /* renamed from: f */
    private final C2377x8 f4698f = new C2377x8(this);

    C2366w8(C2111a5 a5Var) {
        super(a5Var);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: B */
    public final void m7727B(long j) {
        mo12567h();
        m7730F();
        mo12427b().mo13104O().mo13131b("Activity resumed, time", Long.valueOf(j));
        if (mo13112m().mo12474s(C2302r.f4466E0)) {
            if (mo13112m().mo12465L().booleanValue() || mo13111l().f4241x.mo12796b()) {
                this.f4697e.mo12558b(j);
            }
            this.f4698f.mo13125a();
        } else {
            this.f4698f.mo13125a();
            if (mo13112m().mo12465L().booleanValue()) {
                this.f4697e.mo12558b(j);
            }
        }
        C2175f9 f9Var = this.f4696d;
        f9Var.f4124a.mo12567h();
        if (f9Var.f4124a.f4689a.mo12436p()) {
            if (!f9Var.f4124a.mo13112m().mo12474s(C2302r.f4466E0)) {
                f9Var.f4124a.mo13111l().f4241x.mo12795a(false);
            }
            f9Var.mo12663b(f9Var.f4124a.mo12429f().mo11378a(), false);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: F */
    public final void m7730F() {
        mo12567h();
        if (this.f4695c == null) {
            this.f4695c = new C1772eb(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: H */
    public final void m7732H(long j) {
        mo12567h();
        m7730F();
        mo12427b().mo13104O().mo13131b("Activity paused, time", Long.valueOf(j));
        this.f4698f.mo13126b(j);
        if (mo13112m().mo12465L().booleanValue()) {
            this.f4697e.mo12561f(j);
        }
        C2175f9 f9Var = this.f4696d;
        if (!f9Var.f4124a.mo13112m().mo12474s(C2302r.f4466E0)) {
            f9Var.f4124a.mo13111l().f4241x.mo12795a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return false;
    }

    /* renamed from: E */
    public final boolean mo13115E(boolean z, boolean z2, long j) {
        return this.f4697e.mo12559d(z, z2, j);
    }
}
