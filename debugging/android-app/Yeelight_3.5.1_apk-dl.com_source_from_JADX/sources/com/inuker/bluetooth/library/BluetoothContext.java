package com.inuker.bluetooth.library;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

public class BluetoothContext {
    private static Context mContext;
    private static Handler mHandler;

    public static Context get() {
        return mContext;
    }

    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    public static void post(Runnable runnable) {
        postDelayed(runnable, 0);
    }

    public static void postDelayed(Runnable runnable, long j) {
        if (mHandler == null) {
            mHandler = new Handler(Looper.getMainLooper());
        }
        mHandler.postDelayed(runnable, j);
    }

    public static void set(Context context) {
        mContext = context;
    }
}
