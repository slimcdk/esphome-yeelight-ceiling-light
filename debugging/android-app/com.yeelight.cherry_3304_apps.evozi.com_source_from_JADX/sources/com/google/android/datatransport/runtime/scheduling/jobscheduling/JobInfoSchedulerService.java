package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.C0492p;
import p011c.p012a.p019b.p020a.p021i.p027w.C0555a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C0492p.m146f(getApplicationContext());
        C0487l.C0488a a = C0487l.m131a();
        a.mo8442b(string);
        a.mo8444d(C0555a.m317b(i));
        if (string2 != null) {
            a.mo8443c(Base64.decode(string2, 0));
        }
        C0492p.m144c().mo8472e().mo10262g(a.mo8441a(), i2, C1336f.m3509b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
