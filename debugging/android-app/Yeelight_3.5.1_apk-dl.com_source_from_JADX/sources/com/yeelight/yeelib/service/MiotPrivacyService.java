package com.yeelight.yeelib.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import androidx.annotation.Nullable;
import p051j4.C3278f;
import p051j4.C3283v;

public class MiotPrivacyService extends Service {
    public static final String TAG = MiotPrivacyService.class.getSimpleName();

    private String getProcessName() {
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return "";
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    public void onCreate() {
        super.onCreate();
        StringBuilder sb = new StringBuilder();
        sb.append("current process: ");
        sb.append(getProcessName());
        if (!C3283v.m8836b("PRIVACY_GRANTED", false)) {
            C3283v.m8844j("PRIVACY_GRANTED", true);
        }
        C3278f.m8796a(this, "Miot");
        stopSelf();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
