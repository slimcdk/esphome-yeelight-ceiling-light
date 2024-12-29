package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.m9 */
public final /* synthetic */ class C1709m9 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1757q9 f2311a;

    /* renamed from: b */
    public final /* synthetic */ C1574c4 f2312b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f2313c;

    public /* synthetic */ C1709m9(C1757q9 q9Var, C1574c4 c4Var, JobParameters jobParameters) {
        this.f2311a = q9Var;
        this.f2312b = c4Var;
        this.f2313c = jobParameters;
    }

    public final void run() {
        this.f2311a.mo14435d(this.f2312b, this.f2313c);
    }
}
