package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C2329t4;
import com.google.android.gms.measurement.internal.C2362w4;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C2362w4 {

    /* renamed from: a */
    private C2329t4 f3890a;

    @MainThread
    /* renamed from: a */
    public final void mo12392a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        if (this.f3890a == null) {
            this.f3890a = new C2329t4(this);
        }
        this.f3890a.mo12989a(context, intent);
    }
}
