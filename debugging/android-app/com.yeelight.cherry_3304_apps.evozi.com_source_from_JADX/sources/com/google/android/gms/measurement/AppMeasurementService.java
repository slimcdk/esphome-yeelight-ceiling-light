package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C2289p8;
import com.google.android.gms.measurement.internal.C2333t8;

public final class AppMeasurementService extends Service implements C2333t8 {

    /* renamed from: a */
    private C2289p8<AppMeasurementService> f3891a;

    /* renamed from: d */
    private final C2289p8<AppMeasurementService> m6696d() {
        if (this.f3891a == null) {
            this.f3891a = new C2289p8<>(this);
        }
        return this.f3891a;
    }

    /* renamed from: a */
    public final boolean mo12383a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo12384b(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: c */
    public final void mo12385c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @MainThread
    public final IBinder onBind(Intent intent) {
        return m6696d().mo12875b(intent);
    }

    @MainThread
    public final void onCreate() {
        super.onCreate();
        m6696d().mo12876c();
    }

    @MainThread
    public final void onDestroy() {
        m6696d().mo12880h();
        super.onDestroy();
    }

    @MainThread
    public final void onRebind(Intent intent) {
        m6696d().mo12882k(intent);
    }

    @MainThread
    public final int onStartCommand(Intent intent, int i, int i2) {
        return m6696d().mo12874a(intent, i, i2);
    }

    @MainThread
    public final boolean onUnbind(Intent intent) {
        return m6696d().mo12881i(intent);
    }
}
