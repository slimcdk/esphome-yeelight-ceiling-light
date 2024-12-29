package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C1745p9;
import com.google.android.gms.measurement.internal.C1757q9;

public final class AppMeasurementService extends Service implements C1745p9 {

    /* renamed from: a */
    private C1757q9 f1904a;

    /* renamed from: c */
    private final C1757q9 m4025c() {
        if (this.f1904a == null) {
            this.f1904a = new C1757q9(this);
        }
        return this.f1904a;
    }

    /* renamed from: a */
    public final void mo13977a(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* renamed from: b */
    public final void mo13978b(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final boolean mo13979k(int i) {
        return stopSelfResult(i);
    }

    @MainThread
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        return m4025c().mo14433b(intent);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        m4025c().mo14436e();
    }

    @MainThread
    public void onDestroy() {
        m4025c().mo14437f();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@NonNull Intent intent) {
        m4025c().mo14438g(intent);
    }

    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        m4025c().mo14432a(intent, i, i2);
        return 2;
    }

    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        m4025c().mo14441j(intent);
        return true;
    }
}
