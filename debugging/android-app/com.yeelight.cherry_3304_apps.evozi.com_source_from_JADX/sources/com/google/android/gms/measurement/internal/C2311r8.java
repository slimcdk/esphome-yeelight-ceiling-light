package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
final /* synthetic */ class C2311r8 implements Runnable {

    /* renamed from: a */
    private final C2289p8 f4569a;

    /* renamed from: b */
    private final C2361w3 f4570b;

    /* renamed from: c */
    private final JobParameters f4571c;

    C2311r8(C2289p8 p8Var, C2361w3 w3Var, JobParameters jobParameters) {
        this.f4569a = p8Var;
        this.f4570b = w3Var;
        this.f4571c = jobParameters;
    }

    public final void run() {
        this.f4569a.mo12878e(this.f4570b, this.f4571c);
    }
}
