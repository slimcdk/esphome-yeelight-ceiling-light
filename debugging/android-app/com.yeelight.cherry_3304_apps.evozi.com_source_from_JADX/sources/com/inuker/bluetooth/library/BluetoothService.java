package com.inuker.bluetooth.library;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.inuker.bluetooth.library.utils.BluetoothLog;

public class BluetoothService extends Service {
    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    public IBinder onBind(Intent intent) {
        BluetoothLog.m10338v(String.format("BluetoothService onBind", new Object[0]));
        return BluetoothServiceImpl.getInstance();
    }

    public void onCreate() {
        super.onCreate();
        BluetoothLog.m10338v(String.format("BluetoothService onCreate", new Object[0]));
        Context applicationContext = getApplicationContext();
        mContext = applicationContext;
        BluetoothContext.set(applicationContext);
    }
}
