package com.yeelight.yeelib.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class KillNotificationService extends Service {
    private final IBinder mBinder = new KillBinder(this);
    private NotificationManager mNM;

    public class KillBinder extends Binder {
        public final Service service;

        public KillBinder(Service service2) {
            this.service = service2;
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }

    public void onCreate() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        this.mNM = notificationManager;
        notificationManager.cancel(1);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
