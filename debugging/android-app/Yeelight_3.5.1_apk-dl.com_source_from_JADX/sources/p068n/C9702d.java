package p068n;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: n.d */
public final /* synthetic */ class C9702d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f17502a;

    /* renamed from: b */
    public final /* synthetic */ JobParameters f17503b;

    public /* synthetic */ C9702d(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f17502a = jobInfoSchedulerService;
        this.f17503b = jobParameters;
    }

    public final void run() {
        this.f17502a.m547b(this.f17503b);
    }
}
