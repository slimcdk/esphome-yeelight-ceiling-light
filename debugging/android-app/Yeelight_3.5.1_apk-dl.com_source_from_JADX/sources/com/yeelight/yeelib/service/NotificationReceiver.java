package com.yeelight.yeelib.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yeelight.yeelib.managers.C3108x;
import p051j4.C3279g;

public class NotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C3108x.f4952f != null) {
            if (NotificationBarControlService.ACTION_NOTIFICATION_PREV.equals(action)) {
                C3108x.f4952f.previousDevice();
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_NEXT.equals(action)) {
                C3108x.f4952f.nextDevice();
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_TOGGLE.equals(action)) {
                C3108x.f4952f.toggle(intent.getStringExtra("com.yeelight.cherry.device_id"));
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_CONNECT.equals(action)) {
                C3108x.f4952f.connect(intent.getStringExtra("com.yeelight.cherry.device_id"));
            } else if (NotificationBarControlService.ACTION_NOTIFICATION_LAUNCH.equals(action)) {
                C3108x.f4952f.launch(intent.getStringExtra("com.yeelight.cherry.device_id"));
            }
        }
        C3279g.m8810j(action);
    }
}
