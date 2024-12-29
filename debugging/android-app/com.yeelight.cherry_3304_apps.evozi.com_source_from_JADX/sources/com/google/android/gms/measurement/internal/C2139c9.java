package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1725ba;
import com.google.android.gms.internal.measurement.C1958q9;
import com.google.android.gms.internal.measurement.C2051w9;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
final class C2139c9 {
    @VisibleForTesting

    /* renamed from: a */
    private long f4005a;
    @VisibleForTesting

    /* renamed from: b */
    private long f4006b;

    /* renamed from: c */
    private final C2213j f4007c = new C2127b9(this, this.f4008d.f4689a);

    /* renamed from: d */
    private final /* synthetic */ C2366w8 f4008d;

    public C2139c9(C2366w8 w8Var) {
        this.f4008d = w8Var;
        long b = w8Var.mo12429f().mo11379b();
        this.f4005a = b;
        this.f4006b = b;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: h */
    public final void m6893h() {
        this.f4008d.mo12567h();
        mo12559d(false, false, this.f4008d.mo12429f().mo11379b());
        this.f4008d.mo12569o().mo13142v(this.f4008d.mo12429f().mo11379b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12557a() {
        this.f4007c.mo12753e();
        this.f4005a = 0;
        this.f4006b = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo12558b(long j) {
        this.f4008d.mo12567h();
        this.f4007c.mo12753e();
        this.f4005a = j;
        this.f4006b = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo12559d(boolean z, boolean z2, long j) {
        this.f4008d.mo12567h();
        this.f4008d.mo12537x();
        if (!C1958q9.m5849a() || !this.f4008d.mo13112m().mo12474s(C2302r.f4460B0)) {
            j = this.f4008d.mo12429f().mo11379b();
        }
        if (!C2051w9.m6284a() || !this.f4008d.mo13112m().mo12474s(C2302r.f4548x0) || this.f4008d.f4689a.mo12436p()) {
            this.f4008d.mo13111l().f4239v.mo12850b(this.f4008d.mo12429f().mo11378a());
        }
        long j2 = j - this.f4005a;
        if (z || j2 >= 1000) {
            if (this.f4008d.mo13112m().mo12474s(C2302r.f4495U) && !z2) {
                j2 = (!C1725ba.m4884a() || !this.f4008d.mo13112m().mo12474s(C2302r.f4497W) || !C1958q9.m5849a() || !this.f4008d.mo13112m().mo12474s(C2302r.f4460B0)) ? mo12560e() : mo12562g(j);
            }
            this.f4008d.mo12427b().mo13104O().mo13131b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C2243l7.m7203M(this.f4008d.mo12573s().mo12799D(!this.f4008d.mo13112m().mo12465L().booleanValue()), bundle, true);
            if (this.f4008d.mo13112m().mo12474s(C2302r.f4495U) && !this.f4008d.mo13112m().mo12474s(C2302r.f4496V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f4008d.mo13112m().mo12474s(C2302r.f4496V) || !z2) {
                this.f4008d.mo12570p().mo12709S("auto", "_e", bundle);
            }
            this.f4005a = j;
            this.f4007c.mo12753e();
            this.f4007c.mo12751c(3600000);
            return true;
        }
        this.f4008d.mo12427b().mo13104O().mo13131b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: e */
    public final long mo12560e() {
        long b = this.f4008d.mo12429f().mo11379b();
        long j = b - this.f4006b;
        this.f4006b = b;
        return j;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: f */
    public final void mo12561f(long j) {
        this.f4007c.mo12753e();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: g */
    public final long mo12562g(long j) {
        long j2 = j - this.f4006b;
        this.f4006b = j;
        return j2;
    }
}
