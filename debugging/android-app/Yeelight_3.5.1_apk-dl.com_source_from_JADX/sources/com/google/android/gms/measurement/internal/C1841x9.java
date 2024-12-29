package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1258pc;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
final class C1841x9 {
    @VisibleForTesting

    /* renamed from: a */
    protected long f2770a;
    @VisibleForTesting

    /* renamed from: b */
    protected long f2771b;

    /* renamed from: c */
    private final C1723o f2772c;

    /* renamed from: d */
    final /* synthetic */ C1865z9 f2773d;

    public C1841x9(C1865z9 z9Var) {
        this.f2773d = z9Var;
        this.f2772c = new C1829w9(this, z9Var.f2143a);
        long b = z9Var.f2143a.mo14229c().mo11030b();
        this.f2770a = b;
        this.f2771b = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14631a() {
        this.f2772c.mo14406b();
        this.f2770a = 0;
        this.f2771b = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14632b(long j) {
        this.f2772c.mo14406b();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public final void mo14633c(long j) {
        this.f2773d.mo14009h();
        this.f2772c.mo14406b();
        this.f2770a = j;
        this.f2771b = j;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo14634d(boolean z, boolean z2, long j) {
        this.f2773d.mo14009h();
        this.f2773d.mo14020i();
        C1258pc.m2480b();
        if (!this.f2773d.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2440f0) || this.f2773d.f2143a.mo14395o()) {
            this.f2773d.f2143a.mo14375F().f2573o.mo14369b(this.f2773d.f2143a.mo14229c().mo11029a());
        }
        long j2 = j - this.f2770a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f2771b;
                this.f2771b = j;
            }
            this.f2773d.f2143a.mo14228b().mo14039v().mo14694b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C1854ya.m4845y(this.f2773d.f2143a.mo14379K().mo14265t(!this.f2773d.f2143a.mo14402z().mo14165D()), bundle, true);
            if (!z2) {
                this.f2773d.f2143a.mo14377I().mo14570v("auto", "_e", bundle);
            }
            this.f2770a = j;
            this.f2772c.mo14406b();
            this.f2772c.mo14407d(3600000);
            return true;
        }
        this.f2773d.f2143a.mo14228b().mo14039v().mo14694b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
