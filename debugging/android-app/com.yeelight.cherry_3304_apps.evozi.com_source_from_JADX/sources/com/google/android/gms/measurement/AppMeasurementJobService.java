package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2289p8;
import com.google.android.gms.measurement.internal.C2333t8;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C2333t8 {

    /* renamed from: a */
    private C2289p8<AppMeasurementJobService> f3889a;

    /* renamed from: d */
    private final C2289p8<AppMeasurementJobService> m6691d() {
        if (this.f3889a == null) {
            this.f3889a = new C2289p8<>(this);
        }
        return this.f3889a;
    }

    /* renamed from: a */
    public final boolean mo12383a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo12384b(Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: c */
    public final void mo12385c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @MainThread
    public final void onCreate() {
        super.onCreate();
        m6691d().mo12876c();
    }

    @MainThread
    public final void onDestroy() {
        m6691d().mo12880h();
        super.onDestroy();
    }

    @MainThread
    public final void onRebind(Intent intent) {
        m6691d().mo12882k(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m6691d().mo12879g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        return m6691d().mo12881i(intent);
    }
}
