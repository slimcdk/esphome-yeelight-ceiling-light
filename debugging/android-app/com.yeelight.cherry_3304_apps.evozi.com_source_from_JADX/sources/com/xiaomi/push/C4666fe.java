package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4663fc;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
/* renamed from: com.xiaomi.push.fe */
public class C4666fe implements C4663fc.C4664a {

    /* renamed from: a */
    JobScheduler f8618a;

    /* renamed from: a */
    Context f8619a;

    /* renamed from: a */
    private boolean f8620a = false;

    C4666fe(Context context) {
        this.f8619a = context;
        this.f8618a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    /* renamed from: a */
    public void mo25066a() {
        this.f8620a = false;
        this.f8618a.cancel(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25069a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f8619a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        C3989b.m10680c("schedule Job = " + build.getId() + " in " + j);
        this.f8618a.schedule(builder.build());
    }

    /* renamed from: a */
    public void mo25067a(boolean z) {
        if (z || this.f8620a) {
            long b = (long) C4687fy.m14331b();
            if (z) {
                mo25066a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f8620a = true;
            mo25069a(b);
        }
    }

    /* renamed from: a */
    public boolean m14178a() {
        return this.f8620a;
    }
}
