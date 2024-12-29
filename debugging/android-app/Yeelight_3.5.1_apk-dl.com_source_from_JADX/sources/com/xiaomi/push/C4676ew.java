package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4673eu;
import com.xiaomi.push.service.XMJobService;

@TargetApi(21)
/* renamed from: com.xiaomi.push.ew */
public class C4676ew implements C4673eu.C4674a {

    /* renamed from: a */
    JobScheduler f8025a;

    /* renamed from: a */
    Context f8026a;

    /* renamed from: a */
    private boolean f8027a = false;

    C4676ew(Context context) {
        this.f8026a = context;
        this.f8025a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    /* renamed from: a */
    public void mo29085a() {
        this.f8027a = false;
        this.f8025a.cancel(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29088a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f8026a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        C4408b.m12482c("schedule Job = " + build.getId() + " in " + j);
        this.f8025a.schedule(builder.build());
    }

    /* renamed from: a */
    public void mo29086a(boolean z) {
        if (z || this.f8027a) {
            long b = (long) C4719gc.m13995b();
            if (z) {
                mo29085a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f8027a = true;
            mo29088a(b);
        }
    }

    /* renamed from: a */
    public boolean m13769a() {
        return this.f8027a;
    }
}
