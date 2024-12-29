package com.yeelight.yeelib.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C4311i;

public class NotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C4297y.f7457f != null) {
            if (NotificationBarControlService.ACTION_NOTIFICATION_PREV.equals(action)) {
                C4297y.f7457f.previousDevice();
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_NEXT.equals(action)) {
                C4297y.f7457f.nextDevice();
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_TOGGLE.equals(action)) {
                C4297y.f7457f.toggle(intent.getStringExtra("com.yeelight.cherry.device_id"));
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_CONNECT.equals(action)) {
                C4297y.f7457f.connect(intent.getStringExtra("com.yeelight.cherry.device_id"));
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_LAUNCH.equals(action)) {
                C4297y.f7457f.launch(intent.getStringExtra("com.yeelight.cherry.device_id"));
            }
        }
        C4311i.m12159j(action);
    }
}
