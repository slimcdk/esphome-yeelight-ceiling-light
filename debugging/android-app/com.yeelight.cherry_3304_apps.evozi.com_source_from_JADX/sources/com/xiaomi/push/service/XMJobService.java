package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4525ba;
import com.xiaomi.push.C4663fc;

public class XMJobService extends Service {

    /* renamed from: a */
    static Service f9871a;

    /* renamed from: a */
    private IBinder f9872a = null;

    @TargetApi(21)
    /* renamed from: com.xiaomi.push.service.XMJobService$a */
    static class C4817a extends JobService {

        /* renamed from: a */
        Binder f9873a;

        /* renamed from: a */
        private Handler f9874a;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a */
        private static class C4818a extends Handler {

            /* renamed from: a */
            JobService f9875a;

            C4818a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f9875a = jobService;
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    JobParameters jobParameters = (JobParameters) message.obj;
                    C3989b.m10669a("Job finished " + jobParameters.getJobId());
                    this.f9875a.jobFinished(jobParameters, false);
                    if (jobParameters.getJobId() == 1) {
                        C4663fc.m14164a(false);
                    }
                }
            }
        }

        C4817a(Service service) {
            this.f9873a = null;
            this.f9873a = (Binder) C4525ba.m13403a((Object) this, "onBind", new Intent());
            C4525ba.m13403a((Object) this, "attachBaseContext", service);
        }

        public boolean onStartJob(JobParameters jobParameters) {
            C3989b.m10669a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f9874a == null) {
                this.f9874a = new C4818a(this);
            }
            Handler handler = this.f9874a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            C3989b.m10669a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    /* renamed from: a */
    static Service m15381a() {
        return f9871a;
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f9872a;
        return iBinder != null ? iBinder : new Binder();
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9872a = new C4817a(this).f9873a;
        }
        f9871a = this;
    }

    public void onDestroy() {
        super.onDestroy();
        f9871a = null;
    }
}
