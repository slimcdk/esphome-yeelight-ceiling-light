package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import p035g.C3198o;
import p035g.C3203s;
import p068n.C9702d;
import p087r.C3621a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m547b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3203s.m8625f(getApplicationContext());
        C3198o.C3199a d = C3198o.m8609a().mo23737b(string).mo23739d(C3621a.m10302b(i));
        if (string2 != null) {
            d.mo23738c(Base64.decode(string2, 0));
        }
        C3203s.m8623c().mo23767e().mo24100v(d.mo23736a(), i2, new C9702d(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
