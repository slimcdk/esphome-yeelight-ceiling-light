package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.C1745p9;
import com.google.android.gms.measurement.internal.C1757q9;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C1745p9 {

    /* renamed from: a */
    private C1757q9 f1902a;

    /* renamed from: c */
    private final C1757q9 m4020c() {
        if (this.f1902a == null) {
            this.f1902a = new C1757q9(this);
        }
        return this.f1902a;
    }

    /* renamed from: a */
    public final void mo13977a(@NonNull Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: b */
    public final void mo13978b(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: k */
    public final boolean mo13979k(int i) {
        throw new UnsupportedOperationException();
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m4020c().mo14436e();
    }

    @MainThread
    public void onDestroy() {
        m4020c().mo14437f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m4020c().mo14438g(intent);
    }

    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        m4020c().mo14440i(jobParameters);
        return true;
    }

    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m4020c().mo14441j(intent);
        return true;
    }
}
