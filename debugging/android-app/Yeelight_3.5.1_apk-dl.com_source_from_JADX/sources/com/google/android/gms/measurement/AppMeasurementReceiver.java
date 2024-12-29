package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C1812v4;
import com.google.android.gms.measurement.internal.C1824w4;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C1812v4 {

    /* renamed from: a */
    private C1824w4 f1903a;

    @MainThread
    /* renamed from: a */
    public void mo13986a(@NonNull Context context, @NonNull Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.f1903a == null) {
            this.f1903a = new C1824w4(this);
        }
        this.f1903a.mo14620a(context, intent);
    }
}
