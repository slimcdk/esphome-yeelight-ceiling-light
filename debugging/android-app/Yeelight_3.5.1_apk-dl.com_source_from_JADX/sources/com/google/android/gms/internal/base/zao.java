package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public final class zao extends ContextCompat {
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static Intent m1642a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!C0987a.m1641a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != C0987a.m1641a() ? 0 : 2);
    }
}
