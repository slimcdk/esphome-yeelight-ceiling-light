package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
final /* synthetic */ class C1336f implements Runnable {

    /* renamed from: a */
    private final JobInfoSchedulerService f2442a;

    /* renamed from: b */
    private final JobParameters f2443b;

    private C1336f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f2442a = jobInfoSchedulerService;
        this.f2443b = jobParameters;
    }

    /* renamed from: b */
    public static Runnable m3509b(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new C1336f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f2442a.jobFinished(this.f2443b, false);
    }
}
