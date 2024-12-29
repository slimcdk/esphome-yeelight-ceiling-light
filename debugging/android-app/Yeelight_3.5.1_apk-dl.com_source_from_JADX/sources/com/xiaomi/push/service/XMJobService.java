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
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4673eu;

public class XMJobService extends Service {

    /* renamed from: a */
    static Service f9359a;

    /* renamed from: a */
    private IBinder f9360a = null;

    @TargetApi(21)
    /* renamed from: com.xiaomi.push.service.XMJobService$a */
    static class C4838a extends JobService {

        /* renamed from: a */
        Binder f9361a;

        /* renamed from: a */
        private Handler f9362a;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a */
        private static class C4839a extends Handler {

            /* renamed from: a */
            JobService f9363a;

            C4839a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f9363a = jobService;
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    JobParameters jobParameters = (JobParameters) message.obj;
                    C4408b.m12464a("Job finished " + jobParameters.getJobId());
                    this.f9363a.jobFinished(jobParameters, false);
                    if (jobParameters.getJobId() == 1) {
                        C4673eu.m13756a(false);
                    }
                }
            }
        }

        C4838a(Service service) {
            this.f9361a = null;
            this.f9361a = (Binder) C4554bk.m13012a((Object) this, "onBind", new Intent());
            C4554bk.m13012a((Object) this, "attachBaseContext", service);
        }

        public boolean onStartJob(JobParameters jobParameters) {
            C4408b.m12464a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f9362a == null) {
                this.f9362a = new C4839a(this);
            }
            Handler handler = this.f9362a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            C4408b.m12464a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f9360a;
        return iBinder != null ? iBinder : new Binder();
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9360a = new C4838a(this).f9361a;
        }
        f9359a = this;
    }

    public void onDestroy() {
        super.onDestroy();
        f9359a = null;
    }
}
